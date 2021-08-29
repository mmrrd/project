package com.riya.livecricket.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.riya.livecricket.LiveMatchActivity;
import com.riya.livecricket.R;
import com.riya.livecricket.modal.AllMatch;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CurrentMatchAdapter extends RecyclerView.Adapter<CurrentMatchAdapter.MyView> {

    List<AllMatch.InProgressFixture> allMatches;
    Context context;

    public CurrentMatchAdapter(List<AllMatch.InProgressFixture> allMatches, Context context) {
        this.allMatches = allMatches;
        this.context = context;
    }

    @NonNull
    @Override
    public CurrentMatchAdapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_current_match, parent, false);
        return new CurrentMatchAdapter.MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrentMatchAdapter.MyView holder, final int position) {

        holder.match_1.setText(allMatches.get(position).getAwayTeam().getShortName());
        holder.match_2.setText(allMatches.get(position).getHomeTeam().getShortName());

        Picasso.with(context).load(allMatches.get(position).getAwayTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.img1);
        Picasso.with(context).load(allMatches.get(position).getHomeTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.img2);

        for (int i=0;i<allMatches.get(position).getInnings().size();i++)
        {
            if (allMatches.get(position).getAwayTeamId().equals(allMatches.get(position).getInnings().get(i).getBattingTeamId()))
            {
                Log.d("TAG", "onBindViewHolder:BattingTeam "+allMatches.get(position).getInnings().get(i).getBattingTeamId());
                holder.li_1.setBackgroundResource(R.color.blue);
                holder.li_2.setBackgroundResource(R.color.white);
                holder.match_1.setTextColor(ContextCompat.getColor(context,R.color.white));
                holder.match_2.setTextColor(ContextCompat.getColor(context,R.color.black));
                holder.score_1.setTextColor(ContextCompat.getColor(context,R.color.white));
                holder.score_2.setTextColor(ContextCompat.getColor(context,R.color.black));
                holder.over_1.setTextColor(ContextCompat.getColor(context,R.color.white));
                holder.over_2.setTextColor(ContextCompat.getColor(context,R.color.black));

            }
            else
            {
                holder.li_1.setBackgroundResource(R.color.white);
                holder.li_2.setBackgroundResource(R.color.blue);
                holder.match_1.setTextColor(ContextCompat.getColor(context,R.color.black));
                holder.match_2.setTextColor(ContextCompat.getColor(context,R.color.white));
                holder.score_1.setTextColor(ContextCompat.getColor(context,R.color.black));
                holder.score_2.setTextColor(ContextCompat.getColor(context,R.color.white));
                holder.over_1.setTextColor(ContextCompat.getColor(context,R.color.black));
                holder.over_2.setTextColor(ContextCompat.getColor(context,R.color.white));

            }

        }
        if (allMatches.get(position).getInnings().size()==1)
        {
            holder.score_1.setText(allMatches.get(position).getInnings().get(0).getRunsScored() + "/" + allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen()+"("+allMatches.get(position).getInnings().get(0).getOversBowled()+")");
            holder.score_2.setText("0/0");
        }
        else if (allMatches.get(position).getInnings().size()==2)
        {
            holder.score_1.setText(allMatches.get(position).getInnings().get(0).getRunsScored() + "/" + allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen()+"("+allMatches.get(position).getInnings().get(0).getOversBowled()+")");
            holder.score_2.setText(allMatches.get(position).getInnings().get(1).getRunsScored() + "/" + allMatches.get(position).getInnings().get(1).getNumberOfWicketsFallen()+"("+allMatches.get(position).getInnings().get(1).getOversBowled()+")");

        }
        else if (allMatches.get(position).getInnings().size()>=3)
        {
            holder.score_1.setText(allMatches.get(position).getInnings().get(allMatches.get(position).getInnings().size()-1).getRunsScored() + "/" + allMatches.get(position).getInnings().get(allMatches.get(position).getInnings().size()-1).getNumberOfWicketsFallen()+"("+allMatches.get(position).getInnings().get(allMatches.get(position).getInnings().size()-1).getOversBowled()+")");
            holder.score_2.setText(allMatches.get(position).getInnings().get(allMatches.get(position).getInnings().size()-2).getRunsScored() + "/" + allMatches.get(position).getInnings().get(allMatches.get(position).getInnings().size()-2).getNumberOfWicketsFallen()+"("+allMatches.get(position).getInnings().get(allMatches.get(position).getInnings().size()-2).getOversBowled()+")");

        }



        holder.liveMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "onClick: " + allMatches.get(position).getInnings().get(0).getFixtureId());
                Log.d("TAG", "onClick: " + allMatches.get(position).getInnings().get(0).getBattingTeamId());
                Log.d("TAG", "onClick: " + allMatches.get(position).getInnings().get(0).getBowlingTeamId());
                context.startActivity(new Intent(context, LiveMatchActivity.class)
                        .putExtra("matchId",allMatches.get(position).getId())
                        .putExtra("homeTeamId", allMatches.get(position).getHomeTeamId())
                        .putExtra("awayTeamId", allMatches.get(position).getAwayTeamId()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return allMatches.size();
    }

    public class MyView extends RecyclerView.ViewHolder {

        TextView match_1, match_2, score_1, score_2,over_1,over_2;
        CircleImageView img1, img2;
        LinearLayout liveMatch;
        LinearLayout li_2,li_1;

        public MyView(@NonNull View itemView) {
            super(itemView);

            match_1 = itemView.findViewById(R.id.match_1);
            match_2 = itemView.findViewById(R.id.match_2);
            img1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
            score_1 = itemView.findViewById(R.id.score_1);
            score_2 = itemView.findViewById(R.id.score_2);
            over_1 = itemView.findViewById(R.id.over_1);
            over_2 = itemView.findViewById(R.id.over_2);
            li_2 = itemView.findViewById(R.id.li_2);
            li_1 = itemView.findViewById(R.id.li_1);
            liveMatch = itemView.findViewById(R.id.liveMatch);
        }
    }
}
