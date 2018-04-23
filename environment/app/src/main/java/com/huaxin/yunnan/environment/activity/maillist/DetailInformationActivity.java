package com.huaxin.yunnan.environment.activity.maillist;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.R;

public class DetailInformationActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private ImageView iv_add;
    private RelativeLayout top_title;
    private Intent intent;
    private TextView tv_name;
    private TextView tv_job;
    private TextView tv_phone;
    private TextView tv_department;
    private Button bt_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_information);

        intent = getIntent();


        initView();
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("详细资料");
        iv_add = (ImageView) findViewById(R.id.iv_add);
        top_title = (RelativeLayout) findViewById(R.id.top_title);

        title_text.setOnClickListener(this);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_name.setText(intent.getStringExtra("name"));
        tv_job = (TextView) findViewById(R.id.tv_job);
        tv_job.setText(intent.getStringExtra("job"));
        tv_phone = (TextView) findViewById(R.id.tv_phone);
        tv_phone.setText(intent.getStringExtra("phone"));
        tv_phone.setOnClickListener(this);
        tv_department = (TextView) findViewById(R.id.tv_department);
        tv_department.setText(intent.getStringExtra("ouin"));
        bt_phone = (Button) findViewById(R.id.bt_phone);
        bt_phone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_text:
                finish();
                break;
            case R.id.tv_phone:

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                        Toast.makeText(this, "请授权！", Toast.LENGTH_LONG).show();
                        // 帮跳转到该应用的设置界面，让用户手动授权
                        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                        Uri uri1 = Uri.fromParts("package", getPackageName(), null);
                        intent.setData(uri1);
                        startActivity(intent);

                } else {
                    // 已经获得授权，可以打电话
                    Uri uri = Uri.parse("tel:" + intent.getStringExtra("phone"));
                    Intent intent2 = new Intent(Intent.ACTION_CALL, uri);
                    startActivity(intent2);}

                break;
            case R.id.bt_phone:
                break;
        }
    }
}
