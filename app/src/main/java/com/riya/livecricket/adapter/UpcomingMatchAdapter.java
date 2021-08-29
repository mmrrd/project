package com.riya.livecricket.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.riya.livecricket.R;
import com.riya.livecricket.UpcomingDetailActiviy;
import com.riya.livecricket.modal.AllMatch;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class UpcomingMatchAdapter extends PagerAdapter {


    Context context;
    List<AllMatch.UpcomingFixture> allMatches;
//    LayoutInflater mLayoutInflater;


    // Viewpager Constructor
    public UpcomingMatchAdapter(Context context, List<AllMatch.UpcomingFixture> allMatches) {
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
    public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
        // inflating the item.xml
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_upcoming_match, container, false);

        TextView match_1 = itemView.findViewById(R.id.match_1);
        TextView match_2 = itemView.findViewById(R.id.match_2);
        TextView matchname = itemView.findViewById(R.id.matchname);
        ImageView img_1 = itemView.findViewById(R.id.img_1);
        ImageView img_2 = itemView.findViewById(R.id.img_2);
        TextView time = itemView.findViewById(R.id.time);
        TextView day = itemView.findViewById(R.id.day);
        LinearLayout li_click = itemView.findViewById(R.id.li_click);

        li_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                context.startActivity(new Intent(context, UpcomingDetailActiviy.class)
                        .putExtra("position", position));
            }
        });

        matchname.setText(allMatches.get(position).getGameType() + "|" + allMatches.get(position).getCompetition().getFormats().get(0).getAssociatedMatchType());

        match_1.setText(allMatches.get(position).getAwayTeam().getShortName());
        match_2.setText(allMatches.get(position).getHomeTeam().getShortName());

        Picasso.with(context).load(allMatches.get(position).getAwayTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img_1);
        Picasso.with(context).load(allMatches.get(position).getHomeTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img_2);

        Log.d("TAG", "instantiateItem: " + allMatches.get(position).getStartDateTime());

        String s = allMatches.get(position).getStartDateTime();
        String s1 = s.replace("T", " ");
        String s2 = s1.replace("Z", "");

        Log.d("TAG", "instantiateItem:== " + s2);

        StringTokenizer tk = new StringTokenizer(s2);
        String date1 = tk.nextToken();
        String time1 = tk.nextToken();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat sdfs = new SimpleDateFormat("EEE, d MMM, yyyy");
        Date dt;
        try {
            dt = sdf.parse(date1);
            day.setText(sdfs.format(dt));
        } catch (ParseException e) {
            e.printStackTrace();
        }

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
