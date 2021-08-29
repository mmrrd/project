package com.riya.livecricket.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.riya.livecricket.ApiClient;
import com.riya.livecricket.ApiInterface;
import com.riya.livecricket.CompletedMatchActivity;
import com.riya.livecricket.R;
import com.riya.livecricket.UpcomingDetailActiviy;
import com.riya.livecricket.modal.AllMatch;
import com.riya.livecricket.modal.PointTable;
import com.riya.livecricket.modal.Predictions;
import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import cz.msebera.android.httpclient.Header;
import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class IplFragment extends Fragment {
    RecyclerView recycleView;
    List<Integer> stringList=new ArrayList<>();
    int cunt=0;
    PointTable response;
    TextView inning;
    ArrayList<PointTable.Point> pointArrayList=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ipl, container, false);

        inning=view.findViewById(R.id.inning);
        recycleView=view.findViewById(R.id.recycleView);
        recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        stringList.add(R.drawable.gradient_1);
        stringList.add(R.drawable.gradient_2);
        stringList.add(R.drawable.gradient_3);
        stringList.add(R.drawable.gradient_4);
        stringList.add(R.drawable.gradient_5);
        stringList.add(R.drawable.gradient_6);
        stringList.add(R.drawable.gradient_7);
        stringList.add(R.drawable.gradient_8);





        view.findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cunt==1)
                {
                    inning.setText("Completed Matches");
                    CompletedAdpter adpter=new CompletedAdpter(getActivity(),MatchFragment.team.getCompletedFixtures());
                    recycleView.setAdapter(adpter);
                    adpter.notifyDataSetChanged();
                    cunt=0;
                }
                else if (cunt==0)
                {
                    inning.setText("Upcoming Matches");
                    UpComingAdpter adpter=new UpComingAdpter(getActivity(),MatchFragment.team.getUpcomingFixtures());
                    recycleView.setAdapter(adpter);
                    adpter.notifyDataSetChanged();
                    cunt=2;
                }
                else if (cunt==2)
                {
                    inning.setText("Points Table");
                    pointAdpter adpter=new pointAdpter(getActivity(),pointArrayList);
                    recycleView.setAdapter(adpter);
                    adpter.notifyDataSetChanged();
                    cunt=1;
                }
            }
        });
        view.findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cunt==0)
                {
                    inning.setText("Upcoming Matches");
                    UpComingAdpter adpter=new UpComingAdpter(getActivity(),MatchFragment.team.getUpcomingFixtures());
                    recycleView.setAdapter(adpter);
                    adpter.notifyDataSetChanged();
                    cunt=1;
                }
                else if (cunt==1)
                {
                    inning.setText("Completed Matches");
                    CompletedAdpter adpter=new CompletedAdpter(getActivity(),MatchFragment.team.getCompletedFixtures());
                    recycleView.setAdapter(adpter);
                    adpter.notifyDataSetChanged();
                    cunt=2;
                }
                else if (cunt==2)
                {
                    inning.setText("Points Table");
                    pointAdpter adpter=new pointAdpter(getActivity(),pointArrayList);
                    recycleView.setAdapter(adpter);
                    adpter.notifyDataSetChanged();
                    cunt=0;
                }
            }
        });

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://lifecarepost.com/rational/crick11/pointslist.php", new AsyncHttpResponseHandler() {


            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String str = null;
                try {
                    str = new String(responseBody, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Log.e("TAG", "response is" + str);
                response = new Gson().fromJson(str, PointTable.class);
                Log.d("TAG", "onSuccess: "+response);


                for (int i=0;i<response.getPointList().size();i++)
                {
                    Log.d("TAG", "onSuccess: "+response.getPointList().get(i).getRank());
                    for (int i1=0;i1<response.getPointList().size();i1++) {
                        if (response.getPointList().get(i1).getRank().equals("" + (i + 1))) {
                            Log.d("TAG", "onSuccess:23 " + response.getPointList().get(i1).getRank());
                            pointArrayList.add(response.getPointList().get(i1));
                        }
                    }
                }



            }

            @Override
            public void onFinish() {
                super.onFinish();

                pointAdpter adpter=new pointAdpter(getActivity(),pointArrayList);
                recycleView.setAdapter(adpter);
                adpter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Toast.makeText(getActivity(), "Check your internet connection", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public class pointAdpter extends RecyclerView.Adapter<pointAdpter.MyView>
    {

        Context context;
        List<PointTable.Point> pointTables;

        public pointAdpter(Context context, List<PointTable.Point> pointTables) {
            this.context = context;
            this.pointTables = pointTables;
        }


        @NonNull
        @Override
        public pointAdpter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(context).inflate(R.layout.layout_ipl,parent,false);
            return new pointAdpter.MyView(view);
        }

        @Override
        public void onBindViewHolder(@NonNull pointAdpter.MyView holder, int position) {

            holder.teamName.setText(pointTables.get(position).getTeamName());
            holder.won.setText(pointTables.get(position).getWon());
            holder.lost.setText(pointTables.get(position).getLost());
            holder.match.setText(pointTables.get(position).getMatches());
            holder.tp.setText(pointTables.get(position).getTp());
            holder.nrr.setText(pointTables.get(position).getNrr());
            holder.rank.setText(pointTables.get(position).getRank());
            Picasso.with(context).load(pointTables.get(position).getImg())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.teamImg);
            holder.cardBG.setBackgroundResource(stringList.get(position));
        }

        @Override
        public int getItemCount() {
            return pointTables.size();
        }

        public class MyView extends RecyclerView.ViewHolder {

            ImageView teamImg;
            LinearLayout cardBG;
            TextView teamName,match,won,lost,tp,nrr,rank;

            public MyView(@NonNull View itemView) {
                super(itemView);

                teamImg=itemView.findViewById(R.id.teamImg);
                teamName=itemView.findViewById(R.id.teamName);
                match=itemView.findViewById(R.id.match);
                won=itemView.findViewById(R.id.won);
                lost=itemView.findViewById(R.id.lost);
                tp=itemView.findViewById(R.id.tp);
                nrr=itemView.findViewById(R.id.nrr);
                rank=itemView.findViewById(R.id.rank);
                cardBG=itemView.findViewById(R.id.cardBG);
            }
        }
    }

    public class UpComingAdpter extends RecyclerView.Adapter<UpComingAdpter.MyView>
    {
        Context context;
        List<AllMatch.UpcomingFixture> allMatches;
        LayoutInflater mLayoutInflater;

        public UpComingAdpter(Context context, List<AllMatch.UpcomingFixture> allMatches) {
            this.context = context;
            this.allMatches = allMatches;
            mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }



        @NonNull
        @Override
        public UpComingAdpter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(context).inflate(R.layout.layout_upcoming_match,parent,false);
            return new UpComingAdpter.MyView(view);
        }

        @SuppressLint("NewApi")
        @Override
        public void onBindViewHolder(@NonNull UpComingAdpter.MyView holder, final int position) {

            holder.li_click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, UpcomingDetailActiviy.class)
                            .putExtra("position",position));
                }
            });

            holder.matchname.setText(allMatches.get(position).getGameType() + "|" + allMatches.get(position).getCompetition().getFormats().get(0).getAssociatedMatchType());

            holder.match_1.setText(allMatches.get(position).getAwayTeam().getShortName());
            holder.match_2.setText(allMatches.get(position).getHomeTeam().getShortName());

            Picasso.with(context).load(allMatches.get(position).getAwayTeam().getLogoUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.img_1);
            Picasso.with(context).load(allMatches.get(position).getHomeTeam().getLogoUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.img_2);

            Log.d("TAG", "instantiateItem: " + allMatches.get(position).getStartDateTime());

            String s=allMatches.get(position).getStartDateTime();
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
                holder.day.setText(sdfs.format(dt));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat sdfs1 = new SimpleDateFormat("h:mm a");
            Date dt1;
            try {
                dt1 = sdf1.parse(time1);
                holder.time.setText(sdfs1.format(dt1));

            } catch (ParseException e) {
                e.printStackTrace();
            }


        }

        @Override
        public int getItemCount() {
            return allMatches.size();
        }

        public class MyView extends RecyclerView.ViewHolder {

            TextView match_1,match_2,matchname,time,day;
            ImageView img_1,img_2;
            LinearLayout li_click;

            public MyView(@NonNull View itemView) {
                super(itemView);

                match_1 = itemView.findViewById(R.id.match_1);
                match_2 = itemView.findViewById(R.id.match_2);
                 matchname = itemView.findViewById(R.id.matchname);
                 img_1 = itemView.findViewById(R.id.img_1);
                 img_2 = itemView.findViewById(R.id.img_2);
                 time = itemView.findViewById(R.id.time);
                 day = itemView.findViewById(R.id.day);
                li_click = itemView.findViewById(R.id.li_click);
            }
        }
    }

    public class CompletedAdpter extends RecyclerView.Adapter<CompletedAdpter.MyView>
    {
        Context context;
        List<AllMatch.CompletedFixture> allMatches;
        LayoutInflater mLayoutInflater;

        public CompletedAdpter(Context context, List<AllMatch.CompletedFixture> allMatches) {
            this.context = context;
            this.allMatches = allMatches;
            mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }



        @NonNull
        @Override
        public CompletedAdpter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(context).inflate(R.layout.layout_completed_match,parent,false);
            return new CompletedAdpter.MyView(view);
        }

        @SuppressLint("NewApi")
        @Override
        public void onBindViewHolder(@NonNull CompletedAdpter.MyView holder, final int position) {

            holder.li_click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context, CompletedMatchActivity.class)
                            .putExtra("matchId",allMatches.get(position).getId())
                            .putExtra("homeTeamId", allMatches.get(position).getHomeTeamId())
                            .putExtra("awayTeamId", allMatches.get(position).getAwayTeamId()));
                }
            });

            holder.matchname.setText(allMatches.get(position).getName()+"|"+allMatches.get(position).getCompetition().getFormats().get(0).getDisplayName());

            String score1 = "";
            String score2 = "";
            if (allMatches.get(position).getAwayTeam().getId().equals(allMatches.get(position).getInnings().get(0).getBattingTeamId()))
            {
                score1=allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen();
            }
            else
            {
                score1=allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(1).getNumberOfWicketsFallen();
            }
            if (allMatches.get(position).getHomeTeam().getId().equals(allMatches.get(position).getInnings().get(1).getBattingTeamId()))
            {
                score2=allMatches.get(position).getInnings().get(1).getRunsScored()+"/"+allMatches.get(position).getInnings().get(1).getNumberOfWicketsFallen();
            }
            else
            {
                score2=allMatches.get(position).getInnings().get(0).getRunsScored()+"/"+allMatches.get(position).getInnings().get(0).getNumberOfWicketsFallen();
            }


            holder.match_1.setText(allMatches.get(position).getAwayTeam().getShortName()+"("+score1+")");
            holder.match_2.setText(allMatches.get(position).getHomeTeam().getShortName()+"("+score2+")");

            holder.won.setText(allMatches.get(position).getResultText());
            Picasso.with(context).load(allMatches.get(position).getAwayTeam().getLogoUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.img_1);
            Picasso.with(context).load(allMatches.get(position).getHomeTeam().getLogoUrl())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(holder.img_2);



            String s=allMatches.get(position).getStartDateTime();
            String s1=s.replace("T"," ");
            String s2 = s1.replace("Z","");

            Log.d("TAG", "instantiateItem:== "+s2);

            StringTokenizer tk = new StringTokenizer(s2);
            String date1 = tk.nextToken();
            String time1 = tk.nextToken();


            SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat sdfs1 = new SimpleDateFormat("h:mm a");
            Date dt1;
            try {
                dt1 = sdf1.parse(time1);
                holder.time.setText(sdfs1.format(dt1));

            } catch (ParseException e) {
                e.printStackTrace();
            }





        }

        @Override
        public int getItemCount() {
            return allMatches.size();
        }

        public class MyView extends RecyclerView.ViewHolder {

            TextView match_1,match_2,matchname,time,won;
            CircleImageView img_1,img_2;
            LinearLayout li_click;

            public MyView(@NonNull View itemView) {
                super(itemView);

                match_1 = itemView.findViewById(R.id.match_1);
                match_2 = itemView.findViewById(R.id.match_2);
                 matchname = itemView.findViewById(R.id.matchname);
                 img_1 = itemView.findViewById(R.id.img_1);
                 img_2 = itemView.findViewById(R.id.img_2);
                won = itemView.findViewById(R.id.won);
                time = itemView.findViewById(R.id.time);
                li_click = itemView.findViewById(R.id.li_click);


            }
        }
    }
}