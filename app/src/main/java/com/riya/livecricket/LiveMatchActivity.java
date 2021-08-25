package com.riya.livecricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.riya.livecricket.adapter.BattingOrderAdapter;
import com.riya.livecricket.adapter.BowlingOrderAdapter;
import com.riya.livecricket.adapter.UpcomingMatchAdapter;
import com.riya.livecricket.modal.DetailModal;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LiveMatchActivity extends AppCompatActivity {

    CircleImageView teamImg1,teamImg2;
    TextView name1,name2,score1,score2,tossResult,venue,inning;
    ImageView back,next;
    int count=0;

    DetailModal details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_match);

        int matchId=getIntent().getIntExtra("matchId",0);
        int homeTeamId=getIntent().getIntExtra("homeTeamId",0);
        int awayTeamId=getIntent().getIntExtra("awayTeamId",0);
        Log.d("TAG", "onCreate: "+homeTeamId);
        Log.d("TAG", "onCreate: "+awayTeamId);
        Log.d("TAG", "onCreate: "+matchId);
        Log.d("TAG", "onCreate: "+String.valueOf(matchId));


        teamImg1=findViewById(R.id.teamImg1);
        teamImg2=findViewById(R.id.teamImg2);
        name1=findViewById(R.id.name1);
        name2=findViewById(R.id.name2);
        score1=findViewById(R.id.score1);
        score2=findViewById(R.id.score2);
        tossResult=findViewById(R.id.tossResult);
        venue=findViewById(R.id.venue);
        inning=findViewById(R.id.inning);
        back=findViewById(R.id.back);
        next=findViewById(R.id.next);

        findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count==1)
                {
                    inning.setText("1nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());
                    ViewPager viewPager=findViewById(R.id.battingOrder);
                    viewPager.setAdapter(new BattingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));
                    ViewPager viewPager1=findViewById(R.id.bowling);
                    viewPager1.setAdapter(new BowlingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));

                    count=0;
                }
                else
                {
                    inning.setText("2nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(1).getRunsScored()+"/"+details.getFixture().getInnings().get(1).getNumberOfWicketsFallen());
                    ViewPager viewPager=findViewById(R.id.battingOrder);
                    viewPager.setAdapter(new BattingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(1).getBatsmen(),details.getPlayers()));
                    ViewPager viewPager1=findViewById(R.id.bowling);
                    viewPager1.setAdapter(new BowlingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(1).getBowlers(),details.getPlayers()));

                    count=1;
                }

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count==0)
                {
                    inning.setText("2nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(1).getRunsScored()+"/"+details.getFixture().getInnings().get(1).getNumberOfWicketsFallen());
                    ViewPager viewPager=findViewById(R.id.battingOrder);
                    viewPager.setAdapter(new BattingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(1).getBatsmen(),details.getPlayers()));
                    ViewPager viewPager1=findViewById(R.id.bowling);
                    viewPager1.setAdapter(new BowlingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(1).getBowlers(),details.getPlayers()));

                     count=1;
                }
                else
                {
                    inning.setText("1nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());
                    ViewPager viewPager=findViewById(R.id.battingOrder);
                    viewPager.setAdapter(new BattingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));
                    ViewPager viewPager1=findViewById(R.id.bowling);
                    viewPager1.setAdapter(new BowlingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));

                    count=0;
                }
            }
        });


        ApiInterface apiService = ApiClient.getClient("https://apiv2.cricket.com.au/web/views/").create(ApiInterface.class);

        Call<DetailModal> call = apiService.getMatchDetail(String.valueOf(matchId));
        call.enqueue(new Callback<DetailModal>() {
            @Override
            public void onResponse(Call<DetailModal> call, Response<DetailModal> response) {


                details = response.body();

                Log.d("TAG", "onResponse: "+response.body());

                Picasso.with(LiveMatchActivity.this).load(details.getFixture().getHomeTeam().getLogoUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .error(R.mipmap.ic_launcher)
                        .into(teamImg1);

                Picasso.with(LiveMatchActivity.this).load(details.getFixture().getAwayTeam().getLogoUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .error(R.mipmap.ic_launcher)
                        .into(teamImg2);

                name1.setText(details.getFixture().getHomeTeam().getName());
                name2.setText(details.getFixture().getAwayTeam().getName());
                score1.setText(details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen()+"("+details.getFixture().getInnings().get(0).getOversBowled()+")");
                score2.setText(details.getFixture().getInnings().get(1).getRunsScored()+"/"+details.getFixture().getInnings().get(1).getNumberOfWicketsFallen()+"("+details.getFixture().getInnings().get(1).getOversBowled()+")");

                tossResult.setText(details.getFixture().getTossResult());
                venue.setText(details.getFixture().getGameType()+"|"+details.getFixture().getVenue().getName());
                inning.setText("1nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());

                Log.d("TAG", "onResponse: "+details.getPlayers().get(0).getId());
                Log.d("TAG", "onResponse: "+details.getPlayers().get(0).getDisplayName());

                ViewPager viewPager=findViewById(R.id.battingOrder);
                viewPager.setAdapter(new BattingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));

                ViewPager viewPager1=findViewById(R.id.bowling);
                viewPager1.setAdapter(new BowlingOrderAdapter(LiveMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));


            }

            @Override
            public void onFailure(Call<DetailModal> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG", t.toString());
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}