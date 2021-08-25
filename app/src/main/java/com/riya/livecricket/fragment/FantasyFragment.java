package com.riya.livecricket.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.riya.livecricket.ApiClient;
import com.riya.livecricket.ApiInterface;
import com.riya.livecricket.FantacyDetailActivity;
import com.riya.livecricket.R;
import com.riya.livecricket.modal.Predictions;
import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

public class FantasyFragment extends Fragment {

    RecyclerView recycleView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fantasy, container, false);

        recycleView = view.findViewById(R.id.recycleView);
        recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://lifecarepost.com/rational/crick11/prediction.php", new AsyncHttpResponseHandler() {


            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String str = null;
                try {
                    str = new String(responseBody, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Log.e("TAG", "response is" + str);
                Predictions response = new Gson().fromJson(str, Predictions.class);
                Log.d("TAG", "onSuccess: " + response);

                predictionAdpter adpter = new predictionAdpter(getActivity(), response.getPredictions());
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

    public class predictionAdpter extends RecyclerView.Adapter<predictionAdpter.MyView> {

        Context context;
        List<Predictions.Prediction> predictionsArrayList;

        public predictionAdpter(Context context, List<Predictions.Prediction> predictionsArrayList) {
            this.context = context;
            this.predictionsArrayList = predictionsArrayList;
        }

        @NonNull
        @Override
        public predictionAdpter.MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.layout_fantasy, parent, false);
            return new MyView(view);
        }

        @Override
        public void onBindViewHolder(@NonNull predictionAdpter.MyView holder, final int position) {

            if (!predictionsArrayList.get(position).getImg1().equals("")) {
                Picasso.with(context).load(predictionsArrayList.get(position).getImg1())
                        .placeholder(R.mipmap.ic_launcher)
                        .error(R.mipmap.ic_launcher)
                        .into(holder.img);
            }


            holder.txt_title.setText(predictionsArrayList.get(position).getTitle());

            holder.img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(), FantacyDetailActivity.class)
                            .putExtra("img", predictionsArrayList.get(position).getImg1())
                            .putExtra("title", predictionsArrayList.get(position).getTitle())
                            .putExtra("detail", predictionsArrayList.get(position).getDesc()));
                }
            });

        }

        @Override
        public int getItemCount() {
            return predictionsArrayList.size();
        }

        public class MyView extends RecyclerView.ViewHolder {

            TextView txt_title;
            ImageView img;

            public MyView(@NonNull View itemView) {
                super(itemView);

                img = itemView.findViewById(R.id.img);
                txt_title = itemView.findViewById(R.id.txt_title);

            }
        }
    }

}