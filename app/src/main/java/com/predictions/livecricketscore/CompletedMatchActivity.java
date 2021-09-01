package com.predictions.livecricketscore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.predictions.livecricketscore.adapter.BattingOrderAdapter;
import com.predictions.livecricketscore.adapter.BattingOrderAdapter1;
import com.predictions.livecricketscore.adapter.BowlingOrderAdapter;
import com.predictions.livecricketscore.adapter.BowlingOrderAdapter1;
import com.predictions.livecricketscore.modal.DetailModal;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CompletedMatchActivity extends AppCompatActivity {

    CircleImageView teamImg1,teamImg2;
    TextView name1,name2,score1,score2,tossResult,venue,inning,player,playerName;
    ImageView back,next,p_img;
    int count=0;
    ScrollView scrollView;
    RelativeLayout progressBar;

    DetailModal details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_match);

        int matchId = getIntent().getIntExtra("matchId", 0);
        int homeTeamId = getIntent().getIntExtra("homeTeamId", 0);
        int awayTeamId = getIntent().getIntExtra("awayTeamId", 0);
        Log.d("TAG", "onCreate: " + homeTeamId);
        Log.d("TAG", "onCreate: " + awayTeamId);
        Log.d("TAG", "onCreate: " + matchId);

        scrollView = findViewById(R.id.scrollView);
        progressBar = findViewById(R.id.progressBar);

        teamImg1 = findViewById(R.id.teamImg1);
        teamImg2 = findViewById(R.id.teamImg2);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        score1 = findViewById(R.id.score1);
        score2 = findViewById(R.id.score2);
        tossResult = findViewById(R.id.tossResult);
        venue = findViewById(R.id.venue);
        inning = findViewById(R.id.inning);
        back = findViewById(R.id.back);
        next = findViewById(R.id.next);
        playerName = findViewById(R.id.playerNmae);
        player = findViewById(R.id.player);
        p_img = findViewById(R.id.p_img);

        scrollView.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);


        findViewById(R.id.backBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (details.getFixture().getInnings().size()==1)
                {
                    if (count==1)
                    {
                        inning.setText("1nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());

                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));

                        count=0;
                    }
                    else
                    {
                        Toast.makeText(CompletedMatchActivity.this, "No Data Found...", Toast.LENGTH_SHORT).show();

                        count=1;
                    }
                }
                else if (details.getFixture().getInnings().size()==2)
                {
                    if (count==1)
                    {
                        inning.setText("1nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());

                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));

                        count=0;
                    }
                    else
                    {
                        inning.setText("2nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(1).getRunsScored()+"/"+details.getFixture().getInnings().get(1).getNumberOfWicketsFallen());
                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(1).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(1).getBowlers(),details.getPlayers()));

                        count=1;
                    }
                }
                else if (details.getFixture().getInnings().size()>=3)
                {
                    if (count==1)
                    {
                        inning.setText("1nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getRunsScored()+"/"+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getNumberOfWicketsFallen());

                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getBowlers(),details.getPlayers()));

                        count=0;
                    }
                    else
                    {
                        inning.setText("2nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getRunsScored()+"/"+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getNumberOfWicketsFallen());
                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getBowlers(),details.getPlayers()));

                        count=1;

                    }
                }


            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (details.getFixture().getInnings().size()==1)
                {
                    if (count==1)
                    {
                        inning.setText("1nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());

                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));

                        count=0;
                    }
                    else
                    {
                        Toast.makeText(CompletedMatchActivity.this, "No Data Found...", Toast.LENGTH_SHORT).show();

                        count=1;
                    }
                }
                else if (details.getFixture().getInnings().size()==2)
                {
                    if (count==1)
                    {
                        inning.setText("1nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(0).getRunsScored()+"/"+details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());

                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(0).getBowlers(),details.getPlayers()));

                        count=0;
                    }
                    else
                    {
                        inning.setText("2nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(1).getRunsScored()+"/"+details.getFixture().getInnings().get(1).getNumberOfWicketsFallen());
                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(1).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(1).getBowlers(),details.getPlayers()));

                        count=1;
                    }
                }
                else if (details.getFixture().getInnings().size()>=3)
                {
                    if (count==1)
                    {
                        inning.setText("1nd "+details.getFixture().getAwayTeam().getShortName()+" "+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getRunsScored()+"/"+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getNumberOfWicketsFallen());

                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-2).getBowlers(),details.getPlayers()));

                        count=0;
                    }
                    else
                    {
                        inning.setText("2nd "+details.getFixture().getHomeTeam().getShortName()+" "+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getRunsScored()+"/"+details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getNumberOfWicketsFallen());
                        ViewPager viewPager=findViewById(R.id.battingOrder);
                        viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getBatsmen(),details.getPlayers()));
                        ViewPager viewPager1=findViewById(R.id.bowling);
                        viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this,details.getFixture().getInnings().get(details.getFixture().getInnings().size()-1).getBowlers(),details.getPlayers()));

                        count=1;

                    }
                }
            }
        });


        ApiInterface apiService = ApiClient.getClient("https://apiv2.cricket.com.au/web/views/").create(ApiInterface.class);

        Call<DetailModal> call = apiService.getMatchDetail(String.valueOf(matchId));
        call.enqueue(new Callback<DetailModal>() {
            @Override
            public void onResponse(Call<DetailModal> call, Response<DetailModal> response) {

                scrollView.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.GONE);

                details = response.body();

                Log.d("TAG", "onResponse: " + response.body().getPlayers());
                Log.d("TAG", "onResponse: " + response.body().getFixture().getId());
                Log.d("TAG", "onResponse: " + details.getFixture().getHomeTeam().getShortName());
                Log.d("TAG", "onResponse: " + details.getFixture().getAwayTeam().getShortName());

                Picasso.with(CompletedMatchActivity.this).load(details.getFixture().getHomeTeam().getLogoUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .error(R.mipmap.ic_launcher)
                        .into(teamImg1);

                Picasso.with(CompletedMatchActivity.this).load(details.getFixture().getAwayTeam().getLogoUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .error(R.mipmap.ic_launcher)
                        .into(teamImg2);

                name1.setText(details.getFixture().getHomeTeam().getName());
                name2.setText(details.getFixture().getAwayTeam().getName());

                score1.setText(details.getFixture().getInnings().get(0).getRunsScored() + "/" + details.getFixture().getInnings().get(0).getNumberOfWicketsFallen() + "(" + details.getFixture().getInnings().get(0).getOversBowled() + ")");
                score2.setText(details.getFixture().getInnings().get(1).getRunsScored() + "/" + details.getFixture().getInnings().get(1).getNumberOfWicketsFallen() + "(" + details.getFixture().getInnings().get(1).getOversBowled() + ")");

                tossResult.setText(details.getFixture().getResultText());
                venue.setText(details.getFixture().getGameType() + " | " + details.getFixture().getVenue().getName());
                inning.setText("1nd " + details.getFixture().getHomeTeam().getShortName() + " " + details.getFixture().getInnings().get(0).getRunsScored() + "/" + details.getFixture().getInnings().get(0).getNumberOfWicketsFallen());


                for (int i=0;i<details.getPlayers().size();i++)
                {
                    if (details.getPlayers().get(i).getIsManOfTheMatch().equals(true))
                    {
                        playerName.setText(details.getPlayers().get(i).getDisplayName());
                        if (!details.getPlayers().get(i).getImageUrl().equals("")) {

                            Picasso.with(CompletedMatchActivity.this).load(details.getPlayers().get(i).getImageUrl()).placeholder(R.mipmap.ic_launcher)
                                    .error(R.mipmap.ic_launcher).into(p_img);
                        }
                        else
                        {
                            Picasso.with(CompletedMatchActivity.this).load(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher)
                                    .error(R.mipmap.ic_launcher).into(p_img);

                        }
                        player.setText("Player of the Match");
                    }
                    if (details.getPlayers().get(i).getIsManOfTheSeries().equals(true))
                    {
                        playerName.setText(details.getPlayers().get(i).getDisplayName());
                        if (!details.getPlayers().get(i).getImageUrl().equals("")) {

                            Picasso.with(CompletedMatchActivity.this).load(details.getPlayers().get(i).getImageUrl()).placeholder(R.mipmap.ic_launcher)
                                    .error(R.mipmap.ic_launcher).into(p_img);
                        }
                        else
                        {
                            Picasso.with(CompletedMatchActivity.this).load(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher)
                                    .error(R.mipmap.ic_launcher).into(p_img);

                        }
                        player.setText("Player of the Series");
                    }
                    else
                    {
                        playerName.setText("-");
                        Picasso.with(CompletedMatchActivity.this).load(R.drawable.ic_outline_account_circle_24).placeholder(R.mipmap.ic_launcher)
                                .error(R.mipmap.ic_launcher).into(p_img);
                        player.setText("Player of the Match");
                    }
                }


                ViewPager viewPager = findViewById(R.id.battingOrder);
                viewPager.setAdapter(new BattingOrderAdapter1(CompletedMatchActivity.this, details.getFixture().getInnings().get(0).getBatsmen(), details.getPlayers()));

                ViewPager viewPager1 = findViewById(R.id.bowling);
                viewPager1.setAdapter(new BowlingOrderAdapter1(CompletedMatchActivity.this, details.getFixture().getInnings().get(0).getBowlers(), details.getPlayers()));



            }

            @Override
            public void onFailure(Call<DetailModal> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG", t.toString());
                scrollView.setVisibility(View.GONE);
                progressBar.setVisibility(View.VISIBLE);

                Toast.makeText(CompletedMatchActivity.this, "Please Check Your Internet Connecation...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}