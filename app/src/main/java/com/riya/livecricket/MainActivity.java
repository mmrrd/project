package com.riya.livecricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("Matches"));
        tabLayout.addTab(tabLayout.newTab().setText("IPL"));
        tabLayout.addTab(tabLayout.newTab().setText("Fantasy"));
        tabLayout.addTab(tabLayout.newTab().setText("News"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);

        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

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


        findViewById(R.id.refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());
                viewPager.setAdapter(adapter);
                viewPager.setCurrentItem(tabLayout.getSelectedTabPosition());
                adapter.notifyDataSetChanged();
            }
        });


//        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//
//        Call<AllMatch> call = apiService.getAllMatch("12","12","12");
//        call.enqueue(new Callback<AllMatch>() {
//            @Override
//            public void onResponse(Call<AllMatch> call, Response<AllMatch> response) {
//
//
////                AllMatch team = response.body();
//
//
//                Log.d("TAG", "Response" + response.body());
////                Log.d("TAG", "Response" + team.getInProgressFixtures().get(0).getHomeTeam().getName());
////                Log.d("TAG", "Response" + team.getInProgressFixtures().get(0).getAwayTeam().getName());
//
//
//            }
//
//            @Override
//            public void onFailure(Call<AllMatch> call, Throwable t) {
//                // Log error here since request failed
//                Log.e("TAG", t.toString());
//            }
//        });



    }
}