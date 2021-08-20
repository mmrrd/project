package com.riya.livecricket;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;

class upcomingMatchAdapter extends PagerAdapter {


    // Context object
    Context context;

    // Array of images
    List<AllMatch.UpcomingFixture> allMatches;

    // Layout Inflater
    LayoutInflater mLayoutInflater;


    // Viewpager Constructor
    public upcomingMatchAdapter(Context context, List<AllMatch.UpcomingFixture> allMatches) {
        this.context = context;
        this.allMatches = allMatches;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // return the number of images
        return allMatches.size();
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
        View itemView = mLayoutInflater.inflate(R.layout.layout_upcoming_match, container, false);

        TextView match_1 = itemView.findViewById(R.id.match_1);
        TextView match_2 = itemView.findViewById(R.id.match_2);
        TextView matchname = itemView.findViewById(R.id.matchname);
        ImageView img_1 = itemView.findViewById(R.id.img_1);
        ImageView img_2 = itemView.findViewById(R.id.img_2);
        TextView time = itemView.findViewById(R.id.time);
        TextView day = itemView.findViewById(R.id.day);
        LinearLayout li_click = itemView.findViewById(R.id.li_click);

        matchname.setText(allMatches.get(position).getGameType()+"|"+allMatches.get(position).getCompetition().getFormats().get(0).getAssociatedMatchType());

        match_1.setText(allMatches.get(position).getAwayTeam().getShortName());
        match_2.setText(allMatches.get(position).getHomeTeam().getShortName());

        Picasso.with(context).load(allMatches.get(position).getAwayTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img_1);
        Picasso.with(context).load(allMatches.get(position).getHomeTeam().getLogoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img_2);



//        SimpleDateFormat dateFormat = new SimpleDateFormat(allMatches.get(position).getStartDateTime());
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//        Date today = Calendar.getInstance().getTime();
//        time.setText(dateFormat.format(today));

//        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ss.SSSZ", Locale.ENGLISH);
//        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy", Locale.ENGLISH);
//        LocalDate date = LocalDate.parse(allMatches.get(position).getStartDateTime(), inputFormatter);
//        String formattedDate = outputFormatter.format(date);
//        day.setText(formattedDate);

        li_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, CompletedMatchActivity.class));
            }
        });


        // Adding the View
        Objects.requireNonNull(container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }
}



