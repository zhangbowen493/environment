package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.SewageChargesBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_PR_INFO;

/**
 * 15、排污费征收稽查现场记录
 */
public class SewageChargesActivity extends BaseActicity implements View.OnClickListener ,CallBack{

    private LinearLayout ll_no;
    private TextView title_text;
    private TextView DT_START_TIME;
    private TextView DT_END_TIME;
    private TextView VC_LOCATION;
    private TextView VC_JCSY;
    private TextView VC_VJCDW;
    private TextView VC_FR;
    private TextView VC_YWFZR;
    private TextView VC_DUTY;
    private TextView VC_TELEPHONE;
    private TextView VC_JLR;
    private TextView VC_JCRY;
    private TextView VC_ZFZH;
    private TextView VC_SFQRZJ;
    private TextView VC_SFSQHB;
    private TextView VC_QTCJRXMJGZDW;
    private TextView VC_JCNR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sewage_charges);
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(),t_task_list_id,URL_QUERY_PR_INFO,SewageChargesBean.class,this,yNProgressDialog);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("排污费征收稽查现场记录");

        title_text.setOnClickListener(this);
        DT_START_TIME = (TextView) findViewById(R.id.DT_START_TIME);
        DT_START_TIME.setOnClickListener(this);
        DT_END_TIME = (TextView) findViewById(R.id.DT_END_TIME);
        DT_END_TIME.setOnClickListener(this);
        VC_LOCATION = (TextView) findViewById(R.id.VC_LOCATION);
        VC_LOCATION.setOnClickListener(this);
        VC_JCSY = (TextView) findViewById(R.id.VC_JCSY);
        VC_JCSY.setOnClickListener(this);
        VC_VJCDW = (TextView) findViewById(R.id.VC_VJCDW);
        VC_VJCDW.setOnClickListener(this);
        VC_FR = (TextView) findViewById(R.id.VC_FR);
        VC_FR.setOnClickListener(this);
        VC_YWFZR = (TextView) findViewById(R.id.VC_YWFZR);
        VC_YWFZR.setOnClickListener(this);
        VC_DUTY = (TextView) findViewById(R.id.VC_DUTY);
        VC_DUTY.setOnClickListener(this);
        VC_TELEPHONE = (TextView) findViewById(R.id.VC_TELEPHONE);
        VC_TELEPHONE.setOnClickListener(this);
        VC_JLR = (TextView) findViewById(R.id.VC_JLR);
        VC_JLR.setOnClickListener(this);
        VC_JCRY = (TextView) findViewById(R.id.VC_JCRY);
        VC_JCRY.setOnClickListener(this);
        VC_ZFZH = (TextView) findViewById(R.id.VC_ZFZH);
        VC_ZFZH.setOnClickListener(this);
        VC_SFQRZJ = (TextView) findViewById(R.id.VC_SFQRZJ);
        VC_SFQRZJ.setOnClickListener(this);
        VC_SFSQHB = (TextView) findViewById(R.id.VC_SFSQHB);
        VC_SFSQHB.setOnClickListener(this);
        VC_QTCJRXMJGZDW = (TextView) findViewById(R.id.VC_QTCJRXMJGZDW);
        VC_QTCJRXMJGZDW.setOnClickListener(this);
        VC_JCNR = (TextView) findViewById(R.id.VC_JCNR);
        VC_JCNR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_text:
                finish();
                break;
        }
    }

    @Override
    public void getResult(Object o) {
        SewageChargesBean resultBean= (SewageChargesBean) o;
        if (resultBean.getSuccess().equals("1")) {
            if (resultBean.getData().get(0).getDt_start_time()==null){
                DT_START_TIME.setText("");
            }else {
                DT_START_TIME.setText(resultBean.getData().get(0).getDt_start_time().toString());
            }
            if (resultBean.getData().get(0).getDt_end_time()==null){
                DT_END_TIME.setText("");
            }else {
                DT_END_TIME.setText(resultBean.getData().get(0).getDt_end_time().toString());
            }
            if (resultBean.getData().get(0).getVc_location()==null){
                VC_LOCATION.setText("");
            }else {
                VC_LOCATION.setText(resultBean.getData().get(0).getVc_location().toString());
            }
            if (resultBean.getData().get(0).getVc_jcsy()==null){
                VC_JCSY.setText("");
            }else {
                VC_JCSY.setText(resultBean.getData().get(0).getVc_jcsy().toString());
            }
            if (resultBean.getData().get(0).getVc_bjcdw()==null){
                VC_VJCDW.setText("");
            }else {
                VC_VJCDW.setText(resultBean.getData().get(0).getVc_bjcdw().toString());
            }
            if (resultBean.getData().get(0).getVc_fr()==null){
                VC_FR.setText("");
            }else {
                VC_FR.setText(resultBean.getData().get(0).getVc_fr().toString());
            }
            if (resultBean.getData().get(0).getVc_ywfzr()==null){
                VC_YWFZR.setText("");
            }else {
                VC_YWFZR.setText(resultBean.getData().get(0).getVc_ywfzr().toString());
            }
            if (resultBean.getData().get(0).getVc_duty()==null){
                VC_DUTY.setText("");
            }else {
                VC_DUTY.setText(resultBean.getData().get(0).getVc_duty().toString());
            }
            if (resultBean.getData().get(0).getVc_telephone()==null){
                VC_TELEPHONE.setText("");
            }else {
                VC_TELEPHONE.setText(resultBean.getData().get(0).getVc_telephone().toString());
            }
            if (resultBean.getData().get(0).getVc_jcry()==null){
                VC_JCRY.setText("");
            }else {
                VC_JCRY.setText(resultBean.getData().get(0).getVc_jcry().toString());
            }
            if (resultBean.getData().get(0).getVc_zfzh()==null){
                VC_ZFZH.setText("");
            }else {
                VC_ZFZH.setText(resultBean.getData().get(0).getVc_zfzh().toString());
            }
            if (resultBean.getData().get(0).getVc_jlr()==null){
                VC_JLR.setText("");
            }else {
                VC_JLR.setText(resultBean.getData().get(0).getVc_jlr().toString());
            }
            if (resultBean.getData().get(0).getVc_sfqrzj()==null){
                VC_SFQRZJ.setText("");
            }else {
                VC_SFQRZJ.setText(resultBean.getData().get(0).getVc_sfqrzj().toString());
            }
            if (resultBean.getData().get(0).getVc_sfsqhb()==null){
                VC_SFSQHB.setText("");
            }else {
                VC_SFSQHB.setText(resultBean.getData().get(0).getVc_sfsqhb().toString());
            }
            if (resultBean.getData().get(0).getVc_qtcjrxmjgzdw()==null){
                VC_QTCJRXMJGZDW.setText("");
            }else {
                VC_QTCJRXMJGZDW.setText(resultBean.getData().get(0).getVc_qtcjrxmjgzdw().toString());
            }

            if (resultBean.getData().get(0).getVc_duty()==null){
                VC_DUTY.setText("");
            }else {
                VC_DUTY.setText(resultBean.getData().get(0).getVc_duty().toString());
            }

            if (resultBean.getData().get(0).getVc_telephone()==null){
                VC_TELEPHONE.setText("");
            }else {
                VC_TELEPHONE.setText(resultBean.getData().get(0).getVc_telephone().toString());
            }




            if (resultBean.getData().get(0).getVc_jcnr()==null){
                VC_JCNR.setText("");
            }else {
                VC_JCNR.setText(resultBean.getData().get(0).getVc_jcnr().toString());
            }


        } else {
            Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
        }
    }
}
