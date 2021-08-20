package com.riya.livecricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Adding the tabs using addTab() method
        tabLayout.addTab(tabLayout.newTab().setText("Matches"));
        tabLayout.addTab(tabLayout.newTab().setText("IPL"));
        tabLayout.addTab(tabLayout.newTab().setText("News"));
        tabLayout.addTab(tabLayout.newTab().setText("Fantasy"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        //Creating our pager adapter
        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());

        //Adding adapter to pager
        viewPager.setAdapter(adapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

//        ApiInterface apiService = ApiClient.getClient("https://cricket.sportmonks.com/api/v2.0/").create(ApiInterface.class);
//
//        Call<Teams> call = apiService.getData("r7YcgVXSR7jSSiIMvlWjUNp2EQxmkarMEv2zrYScUqYVJWAvmOF43w89N5jX");
//        call.enqueue(new Callback<Teams>() {
//            @Override
//            public void onResponse(Call<Teams>call, Response<Teams> response) {
//
//
//                Teams team=response.body();
//
//                team.getData().get(1).getName();
//                Log.d("TAG", "Repose" + response.body());
//            }
//
//            @Override
//            public void onFailure(Call<Teams>call, Throwable t) {
//                // Log error here since request failed
//                Log.e("TAG", t.toString());
//            }
//        });



        ApiInterface apiService = ApiClient.getClient("https://apiv2.cricket.com.au/web/views/").create(ApiInterface.class);

        Call<AllMatch> call = apiService.getAllMatch();
        call.enqueue(new Callback<AllMatch>() {
            @Override
            public void onResponse(Call<AllMatch> call, Response<AllMatch> response) {


//                AllMatch team = response.body();


                Log.d("TAG", "Response" + response.body());
//                Log.d("TAG", "Response" + team.getInProgressFixtures().get(0).getHomeTeam().getName());
//                Log.d("TAG", "Response" + team.getInProgressFixtures().get(0).getAwayTeam().getName());

//                RecyclerView recyclerView=view.findViewById(R.id.recycleView_Curr);
//                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//                recyclerView.setAdapter(new currentMatchAdapter(team.getInProgressFixtures(),getActivity()));

            }

            @Override
            public void onFailure(Call<AllMatch> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG", t.toString());
            }
        });



    }
}