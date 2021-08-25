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