package com.riya.livecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FantacyDetailActivity extends AppCompatActivity {

    TextView title,description;
    ImageView back,img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantacy_detail);

        back=findViewById(R.id.back);
        img=findViewById(R.id.img);
        title=findViewById(R.id.title);
        description=findViewById(R.id.description);

//        if (!getIntent().getStringExtra("img").equals("")) {
//            if (getIntent().getIntExtra("position", 0) == 0) {
//                img.setImageResource(R.drawable.gradient_1);
//            } else if (getIntent().getIntExtra("position", 0) == 1) {
//                img.setImageResource(R.drawable.gradient_2);
//            } else if (getIntent().getIntExtra("position", 0) == 2) {
//                img.setImageResource(R.drawable.gradient_3);
//            } else if (getIntent().getIntExtra("position", 0) == 3) {
//                img.setImageResource(R.drawable.gradient_4);
//            } else if (getIntent().getIntExtra("position", 0) == 4) {
//                img.setImageResource(R.drawable.gradient_5);
//            } else if (getIntent().getIntExtra("position", 0) == 5) {
//                img.setImageResource(R.drawable.gradient_6);
//            } else if (getIntent().getIntExtra("position", 0) == 6) {
//                img.setImageResource(R.drawable.gradient_7);
//            } else if (getIntent().getIntExtra("position", 0) == 7) {
//                img.setImageResource(R.drawable.gradient_8);
//            }
//        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        title.setText(getIntent().getStringExtra("title"));
        description.setText(getIntent().getStringExtra("detail"));
        if (!getIntent().getStringExtra("img").equals("")) {
            Picasso.with(this).load(getIntent().getStringExtra("img"))
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(img);
        }

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}