package com.predictions.livecricketscore.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.predictions.livecricketscore.R;
import com.predictions.livecricketscore.modal.DetailModal;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;

public class BattingOrderAdapter extends PagerAdapter {


    // Context object
    Context context;

    // Array of images
    List<DetailModal.Batsman> detailModals;
    List<DetailModal.Player> playerList;

    // Layout Inflater
    LayoutInflater mLayoutInflater;


    // Viewpager Constructor
    public BattingOrderAdapter(Context context, List<DetailModal.Batsman> allMatches, List<DetailModal.Player> playerList) {
        this.context = context;
        this.detailModals = allMatches;
        this.playerList = playerList;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // return the number of images
        return detailModals.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }

    @SuppressLint("NewApi")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
        // inflating the item.xml
        View itemView = mLayoutInflater.inflate(R.layout.layout_batting, container, false);

        TextView name = itemView.findViewById(R.id.name);
        TextView score = itemView.findViewById(R.id.score);
        TextView details = itemView.findViewById(R.id.details);
        TextView order = itemView.findViewById(R.id.order);
        TextView text = itemView.findViewById(R.id.text);
        ImageView img = itemView.findViewById(R.id.img);

        Log.d("TAG", "instantiateItem: "+playerList.size());
        for (int i=0;i<playerList.size();i++)
        {
            if (detailModals.get(position).getPlayerId().equals(playerList.get(i).getId()))
            {
                Log.d("TAG", "instantiateItem: "+i);
                Log.d("TAG", "instantiateItem: "+playerList.get(i).getDisplayName());
                Log.d("TAG", "instantiateItem:1 "+playerList.get(i).getOrder());
                Log.d("TAG", "instantiateItem:1 "+detailModals.get(position).getBattingOrder());
                name.setText(playerList.get(i).getDisplayName());

                if (!playerList.get(i).getImageUrl().equals("")) {

                    Picasso.with(context).load(playerList.get(i).getImageUrl()).into(img);
                }

//                    order.setText(detailModals.get(position).getBattingOrder());

            }
        }


        score.setText(detailModals.get(position).getRunsScored()+" Runs / "+detailModals.get(position).getBallsFaced()+" Balls");
        details.setText("4's: "+detailModals.get(position).getFoursScored()+"6's: "+detailModals.get(position).getSixesScored()+"SR: "+detailModals.get(position).getStrikeRate());





        Log.d("TAG", "instantiateItem: "+detailModals.get(position));

        text.setText(detailModals.get(position).getDismissalText());
//        Picasso.with(context).load(playerList.get(0).getImageUrl()).into(img);

        // Adding the View
        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }
}
