package com.riya.livecricket.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.riya.livecricket.modal.AllMatch;
import com.riya.livecricket.ApiClient;
import com.riya.livecricket.ApiInterface;
import com.riya.livecricket.adapter.CompletedMatchAdapter;
import com.riya.livecricket.adapter.CurrentMatchAdapter;
import com.riya.livecricket.R;
import com.riya.livecricket.adapter.UpcomingMatchAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_match, container, false);


        ApiInterface apiService = ApiClient.getClient("https://apiv2.cricket.com.au/web/views/").create(ApiInterface.class);

        Call<AllMatch> call = apiService.getAllMatch("12","12","12");
        call.enqueue(new Callback<AllMatch>() {
            @Override
            public void onResponse(Call<AllMatch> call, Response<AllMatch> response) {


                AllMatch team = response.body();


                Log.d("TAG", "Response" + response.body().getInProgressFixtures());
                Log.d("TAG", "Response" + response.body().getUpcomingFixtures());
                Log.d("TAG", "Response" + response.body().getCompletedFixtures());
//                Log.d("TAG", "Response" + response.body().getInProgressFixtures().size());
//                Log.d("TAG", "Response" + team.getInProgressFixtures().size());
//                Log.d("TAG", "Response" + team.getInProgressFixtures().get(0).getHomeTeam().getShortName());
//                Log.d("TAG", "Response" + team.getInProgressFixtures().get(0).getAwayTeam().getShortName());

                RecyclerView recyclerView=view.findViewById(R.id.recycleView_Curr);
                TextView noMatchLive=view.findViewById(R.id.noMatchLive);

                if (response.body().getInProgressFixtures().size()!=0)
                {
                    recyclerView.setVisibility(View.VISIBLE);
                    noMatchLive.setVisibility(View.GONE);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                    recyclerView.setAdapter(new CurrentMatchAdapter(team.getInProgressFixtures(),getActivity()));
                }
                else
                {
                    recyclerView.setVisibility(View.GONE);
                    noMatchLive.setVisibility(View.VISIBLE);
                }

                ViewPager viewPager=view.findViewById(R.id.viewpager_upc);
                viewPager.setAdapter(new UpcomingMatchAdapter(getActivity(),team.getUpcomingFixtures()));

                TabLayout tabLayout1 = (TabLayout) view.findViewById(R.id.tab_layout1);
                tabLayout1.setupWithViewPager(viewPager, true);

                ViewPager viewPagerCo=view.findViewById(R.id.viewpager_compl);
                viewPagerCo.setAdapter(new CompletedMatchAdapter(getActivity(),team.getCompletedFixtures()));

                TabLayout tabLayout2 = (TabLayout) view.findViewById(R.id.tab_layout2);
                tabLayout2.setupWithViewPager(viewPagerCo, true);
            }

            @Override
            public void onFailure(Call<AllMatch> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG", t.toString());
            }
        });


        return view;
    }
}



//int bowlid = inProgressFixtures.get(0).innings.get((inProgressFixtures.get(0).innings.size()) - 1).bowlingTeamId;
//                int hometeam = inProgressFixtures.get(0).homeTeamId;
//                int batid = inProgressFixtures.get(0).innings.get((inProgressFixtures.get(0).innings.size()) - 1).battingTeamId;
//                String battingteamName, bowlingteamname;
//                if (bowlid == hometeam) {
//                    bowlingteamname = inProgressFixtures.get(0).homeTeam.shortName;
//                    battingteamName = inProgressFixtures.get(0).awayTeam.shortName;
//                } else {
//                    bowlingteamname = inProgressFixtures.get(0).awayTeam.shortName;
//                    battingteamName = inProgressFixtures.get(0).homeTeam.shortName;
//                }
//                String textstring = inProgressFixtures.get(0).innings.get((inProgressFixtures.get(0).innings.size()) - 1).oversBowled
//                        + "\n--Competetion name--- " + inProgressFixtures.get(0).competition.name +
//                        "\n--fixture id ----" + String.valueOf(inProgressFixtures.get(0).innings.get((inProgressFixtures.get(0).innings.size()) - 1).fixtureId) +
//                        "\n--run scored ---" + String.valueOf(inProgressFixtures.get(0).innings.get((inProgressFixtures.get(0).innings.size()) - 1).fixtureId) +
//                        "\n--wickets----" + String.valueOf(inProgressFixtures.get(0).innings.get((inProgressFixtures.get(0).innings.size()) - 1).numberOfWicketsFallen) +
//                        "\n--bowling team----" + bowlingteamname +
//                        "\n--batting team---" + battingteamName;