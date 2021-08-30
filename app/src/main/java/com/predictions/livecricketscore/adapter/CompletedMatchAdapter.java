package com.predictions.livecricketscore.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.predictions.livecricketscore.modal.AllMatch;
import com.predictions.livecricketscore.CompletedMatchActivity;
import com.predictions.livecricketscore.R;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

import de.hdodenhof.circleimageview.CircleImageView;

public class CompletedMatchAdapter extends PagerAdapter {



    Context context;
    List<AllMatch.CompletedFixture> allMatches;
    //    LayoutInflater mLayoutInflater;


    // Viewpager Constructor
    public CompletedMatchAdapter(Context context, List<AllMatch.CompletedFixture> allMatches) {
        this.context = context;
        this.allMatches = allMatches;
//        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // return the number of images
        return allMatches.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }

    @SuppressLint("NewApi")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        // inflating the item.xml
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_completed_match, container, false);

        TextView match_1 = itemView.findViewById(R.id.match_1);
        TextView match_2 = itemView.findViewById(R.id.match_2);
        TextView matchname = itemView.findViewById(R.id.matchname);
        TextView time = itemView.findViewById(R.id.time);
        TextView won = itemView.findViewById(R.id.won);
        CircleImageView img_1 = itemView.findViewById(R.id.img_1);
        CircleImageView img_2 = itemView.findViewById(R.id.img_2);
        LinearLayout li_click = itemView.findViewById(R.id.li_click);

        matchname.setText(allMatches.get(position).getName()+"|"+allMatches.get(position).getCompetition().getFormats().get(0).getDisplayName());

        String score1 = "";
        String score2 = "";
        if (allMatches.get(position).getAwayTeam().getId().equals(allMatches.get(position).getInnings().get(0).getBattingTeamId()))
        {
            score1=allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen();
        }
        else
        {
            score1=allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(1).getNumberOfWicketsFallen();
        }
        if (allMatches.get(position).getHomeTeam().getId().equals(allMatches.get(position).getInnings().get(1).getBattingTeamId()))
        {
            score2=allMatches.get(position).getInnings().get(1).getRunsScored()+"/"+allMatches.get(position).getInnings().get(1).getNumberOfWicketsFallen();
        }
        else
        {
            score2=allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen();
        }


        match_1.setText(allMatches.get(position).getAwayTeam().getShortName()+"("+score1+")");
        match_2.setText(allMatches.get(position).getHomeTeam().getShortName()+"("+score2+")");

        won.setText(allMatches.get(position).getResultText());
        Picasso.with(context).load(allMatches.get(position).getAwayTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img_1);
        Picasso.with(context).load(allMatches.get(position).getHomeTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img_2);

        li_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, CompletedMatchActivity.class)
                        .putExtra("matchId",allMatches.get(position).getId())
                        .putExtra("homeTeamId", allMatches.get(position).getHomeTeamId())
                        .putExtra("awayTeamId", allMatches.get(position).getAwayTeamId()));
            }
        });

        String s=allMatches.get(position).getStartDateTime();
        String s1=s.replace("T"," ");
        String s2 = s1.replace("Z","");

        Log.d("TAG", "instantiateItem:== "+s2);

        StringTokenizer tk = new StringTokenizer(s2);
        String date1 = tk.nextToken();
        String time1 = tk.nextToken();

        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdfs1 = new SimpleDateFormat("h:mm a");
        Date dt1;
        try {
            dt1 = sdf1.parse(time1);
            time.setText(sdfs1.format(dt1));

        } catch (ParseException e) {
            e.printStackTrace();
        }


        // Adding the View
        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }
}
