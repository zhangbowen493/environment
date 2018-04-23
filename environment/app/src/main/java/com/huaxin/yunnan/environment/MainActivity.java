package com.huaxin.yunnan.environment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.Utils.DensityUtil;
import com.huaxin.yunnan.environment.activity.map.CheckPermissionsActivity;
import com.huaxin.yunnan.environment.adapter.MyFragmentPagerAdapter;
import com.huaxin.yunnan.environment.fragment.HomeFragment;
import com.huaxin.yunnan.environment.fragment.MyFragment;
import com.huaxin.yunnan.environment.fragment.PollutionSourceFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends CheckPermissionsActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private ViewPager vp_main;
    private RadioButton rb_home;
    private TextView tv_home;
    private RelativeLayout rl_home;
    private RadioButton rb_pollution_source;
    private TextView tv_pollution_source;
    private RelativeLayout rl_pollution_source;
    private RadioButton rb_paperless_office;
    private TextView tv_paperless_office;
    private RelativeLayout rl_paperless_office;
    private RadioButton rb_my;
    private TextView tv_my;
    private RelativeLayout rl_my;
    private LinearLayout tab_layout;
    private List<Fragment> mFragments;

    /**
     * 再次返回键退出程序
     */
    private long lastBack = 0;

    /**
     * -1:表示没有新消息
     * -2:表示新消息用红点的方式显示
     * 0-99：直接显示数字
     * >=100:用99+显示
     */
    private int messageNum=-1;//表示没有新消息

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        initProgressDialog();
    }

    private void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new PollutionSourceFragment());
//        mFragments.add(new HomeFragment());
        mFragments.add(new MyFragment());
    }

    private void initView() {
        vp_main = (ViewPager) findViewById(R.id.vp_main);
        rb_home = (RadioButton) findViewById(R.id.rb_home);
        tv_home = (TextView) findViewById(R.id.tv_home);
        rl_home = (RelativeLayout) findViewById(R.id.rl_home);
        rb_pollution_source = (RadioButton) findViewById(R.id.rb_pollution_source);
        tv_pollution_source = (TextView) findViewById(R.id.tv_pollution_source);
        rl_pollution_source = (RelativeLayout) findViewById(R.id.rl_pollution_source);
        rb_paperless_office = (RadioButton) findViewById(R.id.rb_paperless_office);
        tv_paperless_office = (TextView) findViewById(R.id.tv_paperless_office);
        rl_paperless_office = (RelativeLayout) findViewById(R.id.rl_paperless_office);
        rb_my = (RadioButton) findViewById(R.id.rb_my);
        tv_my = (TextView) findViewById(R.id.tv_my);
        rl_my = (RelativeLayout) findViewById(R.id.rl_my);
        tab_layout = (LinearLayout) findViewById(R.id.tab_layout);

        rl_home.setOnClickListener(this);
        rl_pollution_source.setOnClickListener(this);
        rl_paperless_office.setOnClickListener(this);
        rl_my.setOnClickListener(this);

        vp_main.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragments));
        vp_main.addOnPageChangeListener(this);

        vp_main.setCurrentItem(0);
        //这个是缓存fragment的个数
        vp_main.setOffscreenPageLimit(3);//最好是一屏能显示的fragment数-1。

        //消息提示形状
//        messageTips(100,tv_my);//>=100:用99+显示
//        messageTips(-1,tv_home);//-1:表示没有新消息
//        messageTips(-2,tv_pollution_source);//-2:表示新消息用红点的方式显示
//        messageTips(5,tv_paperless_office);//0-99：直接显示数字
    }

    private void messageTips(int num, TextView tv) {
        if(num==-1){
            tv.setVisibility(View.GONE);
        }else if(num==-2){
            tv.setVisibility(View.VISIBLE);
            tv.setText("");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tv.getLayoutParams();
            layoutParams.height= DensityUtil.dip2px(this,10);
            layoutParams.width= DensityUtil.dip2px(this,10);
            tv.setLayoutParams(layoutParams);
        }else if(num>=0&&num<=99){
            tv.setVisibility(View.VISIBLE);
            tv.setText(num+"");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tv.getLayoutParams();
            layoutParams.height= DensityUtil.dip2px(this,16);
            layoutParams.width= DensityUtil.dip2px(this,16);
            tv.setLayoutParams(layoutParams);
        }else if(num>=100){
            tv.setVisibility(View.VISIBLE);
            tv.setText("99+");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tv.getLayoutParams();
            layoutParams.height= DensityUtil.dip2px(this,16);
            layoutParams.width= DensityUtil.dip2px(this,16);
            tv.setTextSize(DensityUtil.sp2px(this,3));
            tv.setLayoutParams(layoutParams);
        }else{
            tv.setVisibility(View.GONE);
        }

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rl_home:
                changeRadioButton(0);
                vp_main.setCurrentItem(0,false);
                break;
            case R.id.rl_pollution_source:
                changeRadioButton(1);
                vp_main.setCurrentItem(1,false);
                break;
//            case R.id.rl_paperless_office:
//                changeRadioButton(2);
//                vp_main.setCurrentItem(2,false);
//                break;
            case R.id.rl_my:
                changeRadioButton(3);
                vp_main.setCurrentItem(3,false);
                break;
        }
    }

    /**
     * 根据index更改radioButton的选中状态
     * @param index
     */
    private void changeRadioButton(int index){

        switch (index){
            case 0:
                rb_home.setChecked(true);
                rb_pollution_source.setChecked(false);
                rb_paperless_office.setChecked(false);
                rb_my.setChecked(false);
                break;
            case 1:
                rb_home.setChecked(false);
                rb_pollution_source.setChecked(true);
                rb_paperless_office.setChecked(false);
                rb_my.setChecked(false);
                break;
            case 3:
                rb_home.setChecked(false);
                rb_pollution_source.setChecked(false);
                rb_paperless_office.setChecked(true);
                rb_my.setChecked(false);
                break;
            case 2:
                rb_home.setChecked(false);
                rb_pollution_source.setChecked(false);
                rb_paperless_office.setChecked(false);
                rb_my.setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    /**
     * viewpager切换时，更改radioButton的点击状态
     * @param position
     */
    @Override
    public void onPageSelected(int position) {
        changeRadioButton(position);
    }



    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * 在HomeFragment中更新，底部导航栏的数字
     * @param num
     */
    public void updateOne(int num){
        messageTips(num,tv_home);
    }
    /**
     * 在PollucationSourceFragment中更新，底部导航栏的数字
     * @param num
     */
    public void updateTwo(int num){
        messageTips(num,tv_pollution_source);
    }
    /**
     * 在PaperlessOfficeFragment中更新，底部导航栏的数字
     * @param num
     */
    public void updateThree(int num){
        messageTips(num,tv_paperless_office);
    }
    /**
     * 在MyFragment中更新，底部导航栏的数字
     * @param num
     */
    public void updateFour(int num){
        messageTips(num,tv_my);
    }

    @Override
    public void onBackPressed() {
        if (lastBack == 0 || System.currentTimeMillis() - lastBack > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次返回退出程序", Toast.LENGTH_SHORT).show();
            lastBack = System.currentTimeMillis();
            return;
        }
        super.onBackPressed();
    }

}
