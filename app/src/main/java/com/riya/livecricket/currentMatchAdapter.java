package com.riya.livecricket;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

class currentMatchAdapter extends RecyclerView.Adapter<currentMatchAdapter.MyView> {

    List<AllMatch.InProgressFixture> allMatches;
    Context context;

    public currentMatchAdapter(List<AllMatch.InProgressFixture> allMatches, Context context) {
        this.allMatches = allMatches;
        this.context = context;
    }

    @NonNull
    @Override
    public currentMatchAdapter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_current_match, parent, false);
        return new currentMatchAdapter.MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull currentMatchAdapter.MyView holder, int position) {

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


        holder.score_1.setText(allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen());
        holder.score_2.setText(allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen());

    }

    @Override
    public int getItemCount() {
        return allMatches.size();
    }

    public class MyView extends RecyclerView.ViewHolder {

        TextView match_1, match_2,score_1,score_2;
        CircleImageView img1,img2;

        public MyView(@NonNull View itemView) {
            super(itemView);

            match_1 = itemView.findViewById(R.id.match_1);
            match_2 = itemView.findViewById(R.id.match_2);
            img1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
            score_1 = itemView.findViewById(R.id.score_1);
            score_2 = itemView.findViewById(R.id.score_2);
        }
    }
}