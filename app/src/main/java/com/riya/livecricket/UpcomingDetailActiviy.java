package com.riya.livecricket;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.riya.livecricket.fragment.MatchFragment;
import com.riya.livecricket.modal.AllMatch;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import de.hdodenhof.circleimageview.CircleImageView;

public class UpcomingDetailActiviy extends AppCompatActivity {

    int position;
    CircleImageView teamImg1,teamImg2;
    TextView name1,name2,dateTime,gametype,venue;
    String day,time;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_detail_activiy);


        position=getIntent().getIntExtra("position",0);

        teamImg1=findViewById(R.id.teamImg1);
        teamImg2=findViewById(R.id.teamImg2);
        name1=findViewById(R.id.name1);
        name2=findViewById(R.id.name2);
        dateTime=findViewById(R.id.dateTime);
        gametype=findViewById(R.id.gametype);
        venue=findViewById(R.id.venue);


        findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        name1.setText(MatchFragment.team.getUpcomingFixtures().get(position).getAwayTeam().getShortName());
        name2.setText(MatchFragment.team.getUpcomingFixtures().get(position).getHomeTeam().getShortName());

        Picasso.with(this).load(MatchFragment.team.getUpcomingFixtures().get(position).getAwayTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(teamImg1);
        Picasso.with(this).load(MatchFragment.team.getUpcomingFixtures().get(position).getHomeTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(teamImg2);

        String s=MatchFragment.team.getUpcomingFixtures().get(position).getStartDateTime();
        String s1=s.replace("T"," ");
        String s2 = s1.replace("Z","");

        Log.d("TAG", "instantiateItem:== "+s2);

        StringTokenizer tk = new StringTokenizer(s2);
        String date1 = tk.nextToken();
        String time1 = tk.nextToken();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat sdfs = new SimpleDateFormat("EEE, d MMM, yyyy");
        Date dt;
        try {
            dt = sdf.parse(date1);
            day=sdfs.format(dt);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdfs1 = new SimpleDateFormat("h:mm a");
        Date dt1;
        try {
            dt1 = sdf1.parse(time1);
            time=sdfs1.format(dt1);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        dateTime.setText(day+" | "+time);
        venue.setText(MatchFragment.team.getUpcomingFixtures().get(position).getVenue().getName()+" , "+MatchFragment.team.getUpcomingFixtures().get(position).getVenue().getCity());
        gametype.setText(MatchFragment.team.getUpcomingFixtures().get(position).getGameType()+" | "+MatchFragment.team.getUpcomingFixtures().get(position).getName());


    }


    @Override
    public void onBackPressed() {
        finish();
    }
}