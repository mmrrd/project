package com.predictions.livecricketscore.fragment;

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
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.predictions.livecricketscore.modal.AllMatch;
import com.predictions.livecricketscore.ApiClient;
import com.predictions.livecricketscore.ApiInterface;
import com.predictions.livecricketscore.adapter.CompletedMatchAdapter;
import com.predictions.livecricketscore.adapter.CurrentMatchAdapter;
import com.predictions.livecricketscore.R;
import com.predictions.livecricketscore.adapter.UpcomingMatchAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchFragment extends Fragment {

    UpcomingMatchAdapter upcomingMatchAdapter;
    CompletedMatchAdapter completedMatchAdapter;
    public static AllMatch team;

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


                team = response.body();

                Log.d("TAG", "Response" + response.body().getInProgressFixtures());
                Log.d("TAG", "Response" + response.body().getUpcomingFixtures());
                Log.d("TAG", "Response" + response.body().getCompletedFixtures());

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
                upcomingMatchAdapter=new UpcomingMatchAdapter(getActivity(),team.getUpcomingFixtures());
                viewPager.setAdapter(upcomingMatchAdapter);

                TabLayout tabLayout1 = (TabLayout) view.findViewById(R.id.tab_layout1);
                tabLayout1.setupWithViewPager(viewPager, true);

                ViewPager viewPagerCo=view.findViewById(R.id.viewpager_compl);
                completedMatchAdapter=new CompletedMatchAdapter(getActivity(),team.getCompletedFixtures());
                viewPagerCo.setAdapter(completedMatchAdapter);

                TabLayout tabLayout2 = (TabLayout) view.findViewById(R.id.tab_layout2);
                tabLayout2.setupWithViewPager(viewPagerCo, true);
            }

            @Override
            public void onFailure(Call<AllMatch> call, Throwable t) {
                // Log error here since request failed
                Log.e("TAG", t.toString());
                Toast.makeText(getActivity(), "Please Check Your Internet Connecation...", Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}
