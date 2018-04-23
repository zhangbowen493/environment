package com.huaxin.yunnan.environment.activity.collectevidence;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.Constant;
import com.huaxin.yunnan.environment.R;

public class ReviewActivity extends BaseActicity {

    private ImageView iv_yl;
    private String url;
    private String time;
    private TextView title_text;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        intent = getIntent();
        url = intent.getStringExtra("url");
        Log.e("ReviewActivity", url);
        time = intent.getStringExtra("time");
        Log.e("ReviewActivity", time);
        initView();
    }

    private void initView() {
        iv_yl = (ImageView) findViewById(R.id.iv_yl);
        title_text = ((TextView) findViewById(R.id.title_text));
        title_text.setText(time);
        findViewById(R.id.title_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Log.e("ReviewActivity", Constant.IP + ":8080" + url);
        Glide.with(this)
                .load(url).placeholder(R.drawable.picture_loading).into(iv_yl);
    }
}
