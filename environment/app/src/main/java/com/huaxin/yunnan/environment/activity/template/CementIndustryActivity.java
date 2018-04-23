package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.CementIndustryBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_CC_INFO;

/**
 * 9、水泥行业环境监察记录
 */
public class CementIndustryActivity extends BaseActicity implements View.OnClickListener ,CallBack{

    private LinearLayout ll_no;
    private TextView title_text;
    private TextView DT_BEGIN_TIME;
    private TextView DT_END_TIME;
    private TextView VC_PLACE;
    private TextView VC_XAMINER;
    private TextView VC_LAW_NUMBER;
    private TextView VC_RECORDER;
    private TextView VC_SINSPECTED_UNIT;
    private TextView VC_CODE_NUMBER;
    private TextView VC_LEGAL_REPRESENTATIVE;
    private TextView VC_LEGAL_ID;
    private TextView VC_SITE_SUPERVISOR;
    private TextView VC_SITE_ID;
    private TextView DT_AGE;
    private TextView VC_WORK_UNIT;
    private TextView VC_POST;
    private TextView VC_RELATIONSHIP;
    private TextView VC_ADDRESS;
    private TextView VC_TELEPHONE;
    private TextView VCPOSTAL_CODE;
    private TextView VC_OTHER_PEOPLE;
    private TextView VC_UNIT_NAME;
    private TextView VC_HBDWLX;
    private TextView CH_SUPERVISION_TYPE;
    private TextView CH_SFQRZJ;
    private TextView CH_SFSQHB;
    private TextView VC_SZS;
    private TextView VC_SZX;
    private TextView VC_SZZ;
    private TextView VC_SZXAC;
    private TextView VC_GYYQ;
    private TextView CH_SHEJICL;
    private TextView VC_SJCL;
    private TextView VC_HPBG;
    private TextView VC_SYCF;
    private TextView CH_QTWZL;
    private TextView VC_SBMC;
    private TextView VC_SBXH;
    private TextView CH_XMJSNRSFYPFYZ;
    private TextView VC_XMJSNRSFYPFYZ_BYZDS;
    private TextView CH_YXSFYPFYZ;
    private TextView VC_YXSFYPFYZ_BYZDS;
    private TextView VC_QYSCXYXQK;
    private TextView CH_SFJRZRGG;
    private TextView VC_FHSCZCD;
    private TextView VC_BFHSCZCD;
    private TextView DT_XMCSSJ;
    private TextView DT_PZLXSJ;
    private TextView DT_PZLXDW;
    private TextView CH_LXPFWH;
    private TextView VC_HPSFBL;
    private TextView CH_BZHPYXPJBG;
    private TextView VC_HPBZDW;
    private TextView CH_BZSJ;
    private TextView CH_SFSYTTFW;
    private TextView CH_WPSPSJ;
    private TextView VC_HBSSCSPDW;
    private TextView VC_HBSSCSPSJ;
    private TextView VC_HBSSCSPWH;
    private TextView CH_HBJGYSSJ;
    private TextView VC_ZZYSBM;
    private TextView CH_SFJXJG;
    private TextView CH_JGCS;
    private TextView DT_NEWJGSJ;
    private TextView CH_PZLXBM;
    private TextView VC_GKJ_LXPFWH;
    private TextView DT_GKJ_HPSFBL;
    private TextView CH_WPSPDW;
    private TextView DT_SPSJ;
    private TextView DT_SPDW;
    private TextView VC_SSCSPSJ;
    private TextView CH_SPWH;
    private TextView VC_HBZGYSSJ;
    private TextView VC_HBZG_ZZYSBM;
    private TextView VC_SFSYZCTTFW;
    private TextView DT_SFSYCYZCTTFW;
    private TextView VC_SCFSCSHJ;
    private TextView CH_TZWRW;
    private TextView VC_CSLY;
    private TextView CH_CLSSW;
    private TextView CH_CLLW;
    private TextView VC_SJSFYBG;
    private TextView CH_PFQX;
    private TextView VC_SFSJYIYSY;
    private TextView DT_SGNW;
    private TextView CH_SFWFPS;
    private TextView CH_QTQKSM;
    private TextView DT_ZXBZ;
    private TextView CH_JQJCSFDB;
    private TextView VC_WRYZW;
    private TextView VC_YBGFHPZW;
    private TextView CH_YBGFHPZW_NZLY;
    private TextView VC_YBGFHPZW_CLSSW;
    private TextView CH_MQSJMCW;
    private TextView CH_MQSJMCW_NZLY;
    private TextView VC_MQSJMCW_CLSSW;
    private TextView CH_HPZSJWXHXPMCW;
    private TextView CH_SYGD;
    private TextView CH_FQSCHJ;
    private TextView VC_HPBGYQCZCS;
    private TextView CH_HPBGYQCZCS_CZLW;
    private TextView VC_SJSYCLSS;
    private TextView CH_ZSCSHJ;
    private TextView VC_ZS_SFDB;
    private TextView VC_HJYQWSFHJL;
    private TextView CH_JLNSFYBHMB;
    private TextView DT_BHMBJSSJ;
    private TextView VC_ZBHJBHQK;
    private TextView CH_SFLSCS;
    private TextView CH_WLSQKMS;
    private TextView CH_SFBZTFYA;
    private TextView CH_SFDYAPG;
    private TextView CH_SFJXNDYL;
    private TextView CH_SFCBWZ;
    private TextView CL_QTHBBMJCQK;
    private TextView CL_CZZYWT;
    private TextView CL_JCYQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cement_industry);
        initView();
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(),t_task_list_id,URL_QUERY_CC_INFO,CementIndustryBean.class,this,yNProgressDialog);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("水泥行业环境监察记录");

        title_text.setOnClickListener(this);
        DT_BEGIN_TIME = (TextView) findViewById(R.id.DT_BEGIN_TIME);
        DT_BEGIN_TIME.setOnClickListener(this);
        DT_END_TIME = (TextView) findViewById(R.id.DT_END_TIME);
        DT_END_TIME.setOnClickListener(this);
        VC_PLACE = (TextView) findViewById(R.id.VC_PLACE);
        VC_PLACE.setOnClickListener(this);
        VC_XAMINER = (TextView) findViewById(R.id.VC_XAMINER);
        VC_XAMINER.setOnClickListener(this);
        VC_LAW_NUMBER = (TextView) findViewById(R.id.VC_LAW_NUMBER);
        VC_LAW_NUMBER.setOnClickListener(this);
        VC_RECORDER = (TextView) findViewById(R.id.VC_RECORDER);
        VC_RECORDER.setOnClickListener(this);
        VC_SINSPECTED_UNIT = (TextView) findViewById(R.id.VC_SINSPECTED_UNIT);
        VC_SINSPECTED_UNIT.setOnClickListener(this);
        VC_CODE_NUMBER = (TextView) findViewById(R.id.VC_CODE_NUMBER);
        VC_CODE_NUMBER.setOnClickListener(this);
        VC_LEGAL_REPRESENTATIVE = (TextView) findViewById(R.id.VC_LEGAL_REPRESENTATIVE);
        VC_LEGAL_REPRESENTATIVE.setOnClickListener(this);
        VC_LEGAL_ID = (TextView) findViewById(R.id.VC_LEGAL_ID);
        VC_LEGAL_ID.setOnClickListener(this);
        VC_SITE_SUPERVISOR = (TextView) findViewById(R.id.VC_SITE_SUPERVISOR);
        VC_SITE_SUPERVISOR.setOnClickListener(this);
        VC_SITE_ID = (TextView) findViewById(R.id.VC_SITE_ID);
        VC_SITE_ID.setOnClickListener(this);
        DT_AGE = (TextView) findViewById(R.id.DT_AGE);
        DT_AGE.setOnClickListener(this);
        VC_WORK_UNIT = (TextView) findViewById(R.id.VC_WORK_UNIT);
        VC_WORK_UNIT.setOnClickListener(this);
        VC_POST = (TextView) findViewById(R.id.VC_POST);
        VC_POST.setOnClickListener(this);
        VC_RELATIONSHIP = (TextView) findViewById(R.id.VC_RELATIONSHIP);
        VC_RELATIONSHIP.setOnClickListener(this);
        VC_ADDRESS = (TextView) findViewById(R.id.VC_ADDRESS);
        VC_ADDRESS.setOnClickListener(this);
        VC_TELEPHONE = (TextView) findViewById(R.id.VC_TELEPHONE);
        VC_TELEPHONE.setOnClickListener(this);
        VCPOSTAL_CODE = (TextView) findViewById(R.id.VCPOSTAL_CODE);
        VCPOSTAL_CODE.setOnClickListener(this);
        VC_OTHER_PEOPLE = (TextView) findViewById(R.id.VC_OTHER_PEOPLE);
        VC_OTHER_PEOPLE.setOnClickListener(this);
        VC_UNIT_NAME = (TextView) findViewById(R.id.VC_UNIT_NAME);
        VC_UNIT_NAME.setOnClickListener(this);
        VC_HBDWLX = (TextView) findViewById(R.id.VC_HBDWLX);
        VC_HBDWLX.setOnClickListener(this);
        CH_SUPERVISION_TYPE = (TextView) findViewById(R.id.CH_SUPERVISION_TYPE);
        CH_SUPERVISION_TYPE.setOnClickListener(this);
        CH_SFQRZJ = (TextView) findViewById(R.id.CH_SFQRZJ);
        CH_SFQRZJ.setOnClickListener(this);
        CH_SFSQHB = (TextView) findViewById(R.id.CH_SFSQHB);
        CH_SFSQHB.setOnClickListener(this);
        VC_SZS = (TextView) findViewById(R.id.VC_SZS);
        VC_SZS.setOnClickListener(this);
        VC_SZX = (TextView) findViewById(R.id.VC_SZX);
        VC_SZX.setOnClickListener(this);
        VC_SZZ = (TextView) findViewById(R.id.VC_SZZ);
        VC_SZZ.setOnClickListener(this);
        VC_SZXAC = (TextView) findViewById(R.id.VC_SZXAC);
        VC_SZXAC.setOnClickListener(this);
        VC_GYYQ = (TextView) findViewById(R.id.VC_GYYQ);
        VC_GYYQ.setOnClickListener(this);
        CH_SHEJICL = (TextView) findViewById(R.id.CH_SHEJICL);
        CH_SHEJICL.setOnClickListener(this);
        VC_SJCL = (TextView) findViewById(R.id.VC_SJCL);
        VC_SJCL.setOnClickListener(this);
        VC_HPBG = (TextView) findViewById(R.id.VC_HPBG);
        VC_HPBG.setOnClickListener(this);
        VC_SYCF = (TextView) findViewById(R.id.VC_SYCF);
        VC_SYCF.setOnClickListener(this);
        CH_QTWZL = (TextView) findViewById(R.id.CH_QTWZL);
        CH_QTWZL.setOnClickListener(this);
        VC_SBMC = (TextView) findViewById(R.id.VC_SBMC);
        VC_SBMC.setOnClickListener(this);
        VC_SBXH = (TextView) findViewById(R.id.VC_SBXH);
        VC_SBXH.setOnClickListener(this);
        CH_XMJSNRSFYPFYZ = (TextView) findViewById(R.id.CH_XMJSNRSFYPFYZ);
        CH_XMJSNRSFYPFYZ.setOnClickListener(this);
        VC_XMJSNRSFYPFYZ_BYZDS = (TextView) findViewById(R.id.VC_XMJSNRSFYPFYZ_BYZDS);
        VC_XMJSNRSFYPFYZ_BYZDS.setOnClickListener(this);
        CH_YXSFYPFYZ = (TextView) findViewById(R.id.CH_YXSFYPFYZ);
        CH_YXSFYPFYZ.setOnClickListener(this);
        VC_YXSFYPFYZ_BYZDS = (TextView) findViewById(R.id.VC_YXSFYPFYZ_BYZDS);
        VC_YXSFYPFYZ_BYZDS.setOnClickListener(this);
        VC_QYSCXYXQK = (TextView) findViewById(R.id.VC_QYSCXYXQK);
        VC_QYSCXYXQK.setOnClickListener(this);
        CH_SFJRZRGG = (TextView) findViewById(R.id.CH_SFJRZRGG);
        CH_SFJRZRGG.setOnClickListener(this);
        VC_FHSCZCD = (TextView) findViewById(R.id.VC_FHSCZCD);
        VC_FHSCZCD.setOnClickListener(this);
        VC_BFHSCZCD = (TextView) findViewById(R.id.VC_BFHSCZCD);
        VC_BFHSCZCD.setOnClickListener(this);
        DT_XMCSSJ = (TextView) findViewById(R.id.DT_XMCSSJ);
        DT_XMCSSJ.setOnClickListener(this);
        DT_PZLXSJ = (TextView) findViewById(R.id.DT_PZLXSJ);
        DT_PZLXSJ.setOnClickListener(this);
        DT_PZLXDW = (TextView) findViewById(R.id.DT_PZLXDW);
        DT_PZLXDW.setOnClickListener(this);
        CH_LXPFWH = (TextView) findViewById(R.id.CH_LXPFWH);
        CH_LXPFWH.setOnClickListener(this);
        VC_HPSFBL = (TextView) findViewById(R.id.VC_HPSFBL);
        VC_HPSFBL.setOnClickListener(this);
        CH_BZHPYXPJBG = (TextView) findViewById(R.id.CH_BZHPYXPJBG);
        CH_BZHPYXPJBG.setOnClickListener(this);
        VC_HPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
        VC_HPBZDW.setOnClickListener(this);
        CH_BZSJ = (TextView) findViewById(R.id.CH_BZSJ);
        CH_BZSJ.setOnClickListener(this);
        CH_SFSYTTFW = (TextView) findViewById(R.id.CH_SFSYTTFW);
        CH_SFSYTTFW.setOnClickListener(this);
        CH_WPSPSJ = (TextView) findViewById(R.id.CH_WPSPSJ);
        CH_WPSPSJ.setOnClickListener(this);
        VC_HBSSCSPDW = (TextView) findViewById(R.id.VC_HBSSCSPDW);
        VC_HBSSCSPDW.setOnClickListener(this);
        VC_HBSSCSPSJ = (TextView) findViewById(R.id.VC_HBSSCSPSJ);
        VC_HBSSCSPSJ.setOnClickListener(this);
        VC_HBSSCSPWH = (TextView) findViewById(R.id.VC_HBSSCSPWH);
        VC_HBSSCSPWH.setOnClickListener(this);
        CH_HBJGYSSJ = (TextView) findViewById(R.id.CH_HBJGYSSJ);
        CH_HBJGYSSJ.setOnClickListener(this);
        VC_ZZYSBM = (TextView) findViewById(R.id.VC_ZZYSBM);
        VC_ZZYSBM.setOnClickListener(this);
        CH_SFJXJG = (TextView) findViewById(R.id.CH_SFJXJG);
        CH_SFJXJG.setOnClickListener(this);
        CH_JGCS = (TextView) findViewById(R.id.CH_JGCS);
        CH_JGCS.setOnClickListener(this);
        DT_NEWJGSJ = (TextView) findViewById(R.id.DT_NEWJGSJ);
        DT_NEWJGSJ.setOnClickListener(this);
        CH_PZLXBM = (TextView) findViewById(R.id.CH_PZLXBM);
        CH_PZLXBM.setOnClickListener(this);
        VC_GKJ_LXPFWH = (TextView) findViewById(R.id.VC_GKJ_LXPFWH);
        VC_GKJ_LXPFWH.setOnClickListener(this);
        DT_GKJ_HPSFBL = (TextView) findViewById(R.id.DT_GKJ_HPSFBL);
        DT_GKJ_HPSFBL.setOnClickListener(this);
        CH_WPSPDW = (TextView) findViewById(R.id.CH_WPSPDW);
        CH_WPSPDW.setOnClickListener(this);
        DT_SPSJ = (TextView) findViewById(R.id.DT_SPSJ);
        DT_SPSJ.setOnClickListener(this);
        DT_SPDW = (TextView) findViewById(R.id.DT_SPDW);
        DT_SPDW.setOnClickListener(this);
        VC_SSCSPSJ = (TextView) findViewById(R.id.VC_SSCSPSJ);
        VC_SSCSPSJ.setOnClickListener(this);
        CH_SPWH = (TextView) findViewById(R.id.CH_SPWH);
        CH_SPWH.setOnClickListener(this);
        VC_HBZGYSSJ = (TextView) findViewById(R.id.VC_HBZGYSSJ);
        VC_HBZGYSSJ.setOnClickListener(this);
        VC_HBZG_ZZYSBM = (TextView) findViewById(R.id.VC_HBZG_ZZYSBM);
        VC_HBZG_ZZYSBM.setOnClickListener(this);
        VC_SFSYZCTTFW = (TextView) findViewById(R.id.VC_SFSYZCTTFW);
        VC_SFSYZCTTFW.setOnClickListener(this);
        DT_SFSYCYZCTTFW = (TextView) findViewById(R.id.DT_SFSYCYZCTTFW);
        DT_SFSYCYZCTTFW.setOnClickListener(this);
        VC_SCFSCSHJ = (TextView) findViewById(R.id.VC_SCFSCSHJ);
        VC_SCFSCSHJ.setOnClickListener(this);
        CH_TZWRW = (TextView) findViewById(R.id.CH_TZWRW);
        CH_TZWRW.setOnClickListener(this);
        VC_CSLY = (TextView) findViewById(R.id.VC_CSLY);
        VC_CSLY.setOnClickListener(this);
        CH_CLSSW = (TextView) findViewById(R.id.CH_CLSSW);
        CH_CLSSW.setOnClickListener(this);
        CH_CLLW = (TextView) findViewById(R.id.CH_CLLW);
        CH_CLLW.setOnClickListener(this);
        VC_SJSFYBG = (TextView) findViewById(R.id.VC_SJSFYBG);
        VC_SJSFYBG.setOnClickListener(this);
        CH_PFQX = (TextView) findViewById(R.id.CH_PFQX);
        CH_PFQX.setOnClickListener(this);
        VC_SFSJYIYSY = (TextView) findViewById(R.id.VC_SFSJYIYSY);
        VC_SFSJYIYSY.setOnClickListener(this);
        DT_SGNW = (TextView) findViewById(R.id.DT_SGNW);
        DT_SGNW.setOnClickListener(this);
        CH_SFWFPS = (TextView) findViewById(R.id.CH_SFWFPS);
        CH_SFWFPS.setOnClickListener(this);
        CH_QTQKSM = (TextView) findViewById(R.id.CH_QTQKSM);
        CH_QTQKSM.setOnClickListener(this);
        DT_ZXBZ = (TextView) findViewById(R.id.DT_ZXBZ);
        DT_ZXBZ.setOnClickListener(this);
        CH_JQJCSFDB = (TextView) findViewById(R.id.CH_JQJCSFDB);
        CH_JQJCSFDB.setOnClickListener(this);
        VC_WRYZW = (TextView) findViewById(R.id.VC_WRYZW);
        VC_WRYZW.setOnClickListener(this);
        VC_YBGFHPZW = (TextView) findViewById(R.id.VC_YBGFHPZW);
        VC_YBGFHPZW.setOnClickListener(this);
        CH_YBGFHPZW_NZLY = (TextView) findViewById(R.id.CH_YBGFHPZW_NZLY);
        CH_YBGFHPZW_NZLY.setOnClickListener(this);
        VC_YBGFHPZW_CLSSW = (TextView) findViewById(R.id.VC_YBGFHPZW_CLSSW);
        VC_YBGFHPZW_CLSSW.setOnClickListener(this);
        CH_MQSJMCW = (TextView) findViewById(R.id.CH_MQSJMCW);
        CH_MQSJMCW.setOnClickListener(this);
        CH_MQSJMCW_NZLY = (TextView) findViewById(R.id.CH_MQSJMCW_NZLY);
        CH_MQSJMCW_NZLY.setOnClickListener(this);
        VC_MQSJMCW_CLSSW = (TextView) findViewById(R.id.VC_MQSJMCW_CLSSW);
        VC_MQSJMCW_CLSSW.setOnClickListener(this);
        CH_HPZSJWXHXPMCW = (TextView) findViewById(R.id.CH_HPZSJWXHXPMCW);
        CH_HPZSJWXHXPMCW.setOnClickListener(this);
        CH_SYGD = (TextView) findViewById(R.id.CH_SYGD);
        CH_SYGD.setOnClickListener(this);
        CH_FQSCHJ = (TextView) findViewById(R.id.CH_FQSCHJ);
        CH_FQSCHJ.setOnClickListener(this);
        VC_HPBGYQCZCS = (TextView) findViewById(R.id.VC_HPBGYQCZCS);
        VC_HPBGYQCZCS.setOnClickListener(this);
        CH_HPBGYQCZCS_CZLW = (TextView) findViewById(R.id.CH_HPBGYQCZCS_CZLW);
        CH_HPBGYQCZCS_CZLW.setOnClickListener(this);
        VC_SJSYCLSS = (TextView) findViewById(R.id.VC_SJSYCLSS);
        VC_SJSYCLSS.setOnClickListener(this);
        CH_ZSCSHJ = (TextView) findViewById(R.id.CH_ZSCSHJ);
        CH_ZSCSHJ.setOnClickListener(this);
        VC_ZS_SFDB = (TextView) findViewById(R.id.VC_ZS_SFDB);
        VC_ZS_SFDB.setOnClickListener(this);
        VC_HJYQWSFHJL = (TextView) findViewById(R.id.VC_HJYQWSFHJL);
        VC_HJYQWSFHJL.setOnClickListener(this);
        CH_JLNSFYBHMB = (TextView) findViewById(R.id.CH_JLNSFYBHMB);
        CH_JLNSFYBHMB.setOnClickListener(this);
        DT_BHMBJSSJ = (TextView) findViewById(R.id.DT_BHMBJSSJ);
        DT_BHMBJSSJ.setOnClickListener(this);
        VC_ZBHJBHQK = (TextView) findViewById(R.id.VC_ZBHJBHQK);
        VC_ZBHJBHQK.setOnClickListener(this);
        CH_SFLSCS = (TextView) findViewById(R.id.CH_SFLSCS);
        CH_SFLSCS.setOnClickListener(this);
        CH_WLSQKMS = (TextView) findViewById(R.id.CH_WLSQKMS);
        CH_WLSQKMS.setOnClickListener(this);
        CH_SFBZTFYA = (TextView) findViewById(R.id.CH_SFBZTFYA);
        CH_SFBZTFYA.setOnClickListener(this);
        CH_SFDYAPG = (TextView) findViewById(R.id.CH_SFDYAPG);
        CH_SFDYAPG.setOnClickListener(this);
        CH_SFJXNDYL = (TextView) findViewById(R.id.CH_SFJXNDYL);
        CH_SFJXNDYL.setOnClickListener(this);
        CH_SFCBWZ = (TextView) findViewById(R.id.CH_SFCBWZ);
        CH_SFCBWZ.setOnClickListener(this);
        CL_QTHBBMJCQK = (TextView) findViewById(R.id.CL_QTHBBMJCQK);
        CL_QTHBBMJCQK.setOnClickListener(this);
        CL_CZZYWT = (TextView) findViewById(R.id.CL_CZZYWT);
        CL_CZZYWT.setOnClickListener(this);
        CL_JCYQ = (TextView) findViewById(R.id.CL_JCYQ);
        CL_JCYQ.setOnClickListener(this);
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
        CementIndustryBean resultBean= (CementIndustryBean) o;
        if (resultBean.getSuccess().equals("1")) {
            if (resultBean.getData().get(0).getDt_begin_time()==null){
                DT_BEGIN_TIME.setText("");
            } else {
                DT_BEGIN_TIME.setText(resultBean.getData().get(0).getDt_begin_time().toString());
            }
            if (resultBean.getData().get(0).getDt_end_time()==null){
                DT_END_TIME.setText("");
            } else {
                DT_END_TIME.setText(resultBean.getData().get(0).getDt_end_time().toString());
            }
            if (resultBean.getData().get(0).getVc_place()==null){
                VC_PLACE.setText("");
            } else {
                VC_PLACE.setText(resultBean.getData().get(0).getVc_place().toString());
            }
            if (resultBean.getData().get(0).getVc_xaminer()==null){
                VC_XAMINER.setText("");
            } else {
                VC_XAMINER.setText(resultBean.getData().get(0).getVc_xaminer().toString());
            }
            if (resultBean.getData().get(0).getVc_law_number()==null){
                VC_LAW_NUMBER.setText("");
            } else {
                VC_LAW_NUMBER.setText(resultBean.getData().get(0).getVc_law_number().toString());
            }
            if (resultBean.getData().get(0).getVc_recorder()==null){
                VC_RECORDER.setText("");
            } else {
                VC_RECORDER.setText(resultBean.getData().get(0).getVc_recorder().toString());
            }
            if (resultBean.getData().get(0).getVc_sinspected_unit()==null){
                VC_SINSPECTED_UNIT.setText("");
            } else {
                VC_SINSPECTED_UNIT.setText(resultBean.getData().get(0).getVc_sinspected_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_code_number()==null){
                VC_CODE_NUMBER.setText("");
            } else {
                VC_CODE_NUMBER.setText(resultBean.getData().get(0).getVc_code_number().toString());
            }
            if (resultBean.getData().get(0).getVc_legal_representative()==null){
                VC_LEGAL_REPRESENTATIVE.setText("");
            } else {
                VC_LEGAL_REPRESENTATIVE.setText(resultBean.getData().get(0).getVc_legal_representative().toString());
            }
            if (resultBean.getData().get(0).getVc_legal_id()==null){
                VC_LEGAL_ID.setText("");
            } else {
                VC_LEGAL_ID.setText(resultBean.getData().get(0).getVc_legal_id().toString());
            }
            if (resultBean.getData().get(0).getVc_site_supervisor()==null){
                VC_SITE_SUPERVISOR.setText("");
            } else {
                VC_SITE_SUPERVISOR.setText(resultBean.getData().get(0).getVc_site_supervisor().toString());
            }
            if (resultBean.getData().get(0).getVc_site_id()==null){
                VC_SITE_ID.setText("");
            } else {
                VC_SITE_ID.setText(resultBean.getData().get(0).getVc_site_id().toString());
            }
            if (resultBean.getData().get(0).getNb_age()==null){
                DT_AGE.setText("");
            } else {
                DT_AGE.setText(resultBean.getData().get(0).getNb_age().toString());
            }
            if (resultBean.getData().get(0).getVc_work_unit()==null){
                VC_WORK_UNIT.setText("");
            } else {
                VC_WORK_UNIT.setText(resultBean.getData().get(0).getVc_work_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_post()==null){
                VC_POST.setText("");
            } else {
                VC_POST.setText(resultBean.getData().get(0).getVc_post().toString());
            }
            if (resultBean.getData().get(0).getVc_relationship()==null){
                VC_RELATIONSHIP.setText("");
            } else {
                VC_RELATIONSHIP.setText(resultBean.getData().get(0).getVc_relationship().toString());
            }
            if (resultBean.getData().get(0).getVc_address()==null){
                VC_ADDRESS.setText("");
            } else {
                VC_ADDRESS.setText(resultBean.getData().get(0).getVc_address().toString());
            }
            if (resultBean.getData().get(0).getVc_telephone()==null){
                VC_TELEPHONE.setText("");
            } else {
                VC_TELEPHONE.setText(resultBean.getData().get(0).getVc_telephone().toString());
            }
            if (resultBean.getData().get(0).getVc_postal_code()==null){
                VCPOSTAL_CODE.setText("");
            } else {
                VCPOSTAL_CODE.setText(resultBean.getData().get(0).getVc_postal_code().toString());
            }
            if (resultBean.getData().get(0).getVc_other_people()==null){
                VC_OTHER_PEOPLE.setText("");
            } else {
                VC_OTHER_PEOPLE.setText(resultBean.getData().get(0).getVc_other_people().toString());
            }
            if (resultBean.getData().get(0).getVc_unit_name()==null){
                VC_UNIT_NAME.setText("");
            } else {
                VC_UNIT_NAME.setText(resultBean.getData().get(0).getVc_unit_name().toString());
            }
            if (resultBean.getData().get(0).getCh_hbdwlx()==null){
                VC_HBDWLX.setText("");
            } else {
                VC_HBDWLX.setText(resultBean.getData().get(0).getCh_hbdwlx().toString());
            }
            if (resultBean.getData().get(0).getCh_supervision_type()==null){
                CH_SUPERVISION_TYPE.setText("");
            } else {
                CH_SUPERVISION_TYPE.setText(resultBean.getData().get(0).getCh_supervision_type().toString());
            }
            if (resultBean.getData().get(0).getCh_sfqrzj()==null){
                CH_SFQRZJ.setText("");
            } else {
                CH_SFQRZJ.setText(resultBean.getData().get(0).getCh_sfqrzj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfsqhb()==null){
                CH_SFSQHB.setText("");
            } else {
                CH_SFSQHB.setText(resultBean.getData().get(0).getCh_sfsqhb().toString());
            }
            if (resultBean.getData().get(0).getVc_szs()==null){
                VC_SZS.setText("");
            } else {
                VC_SZS.setText(resultBean.getData().get(0).getVc_szs().toString());
            }
            if (resultBean.getData().get(0).getVc_szx()==null){
                VC_SZX.setText("");
            } else {
                VC_SZX.setText(resultBean.getData().get(0).getVc_szx().toString());
            }
            if (resultBean.getData().get(0).getVc_szz()==null){
                VC_SZZ.setText("");
            } else {
                VC_SZZ.setText(resultBean.getData().get(0).getVc_szz().toString());
            }
            if (resultBean.getData().get(0).getVc_szxac()==null){
                VC_SZXAC.setText("");
            } else {
                VC_SZXAC.setText(resultBean.getData().get(0).getVc_szxac().toString());
            }
            if (resultBean.getData().get(0).getVc_gyyq()==null){
                VC_GYYQ.setText("");
            } else {
                VC_GYYQ.setText(resultBean.getData().get(0).getVc_gyyq().toString());
            }
            if (resultBean.getData().get(0).getCh_shejicl()==null){
                CH_SHEJICL.setText("");
            } else {
                CH_SHEJICL.setText(resultBean.getData().get(0).getCh_shejicl().toString());
            }
            if (resultBean.getData().get(0).getVc_sjcl()==null){
                VC_SJCL.setText("");
            } else {
                VC_SJCL.setText(resultBean.getData().get(0).getVc_sjcl().toString());
            }
            if (resultBean.getData().get(0).getVc_hpbg()==null){
                VC_HPBG.setText("");
            } else {
                VC_HPBG.setText(resultBean.getData().get(0).getVc_hpbg().toString());
            }
            if (resultBean.getData().get(0).getVc_sycf()==null){
                VC_SYCF.setText("");
            } else {
                VC_SYCF.setText(resultBean.getData().get(0).getVc_sycf().toString());
            }
            if (resultBean.getData().get(0).getVc_qtwzl()==null){
                CH_QTWZL.setText("");
            } else {
                CH_QTWZL.setText(resultBean.getData().get(0).getVc_qtwzl().toString());
            }
            if (resultBean.getData().get(0).getVc_sbmc()==null){
                VC_SBMC.setText("");
            } else {
                VC_SBMC.setText(resultBean.getData().get(0).getVc_sbmc().toString());
            }
            if (resultBean.getData().get(0).getVc_sbxh()==null){
                VC_SBXH.setText("");
            } else {
                VC_SBXH.setText(resultBean.getData().get(0).getVc_sbxh().toString());
            }
            if (resultBean.getData().get(0).getCh_xmjsnrsfypfyz()==null){
                CH_XMJSNRSFYPFYZ.setText("");
            } else {
                CH_XMJSNRSFYPFYZ.setText(resultBean.getData().get(0).getCh_xmjsnrsfypfyz().toString());
            }
            if (resultBean.getData().get(0).getVc_xmjsnrsfypfyz_byzds()==null){
                VC_XMJSNRSFYPFYZ_BYZDS.setText("");
            } else {
                VC_XMJSNRSFYPFYZ_BYZDS.setText(resultBean.getData().get(0).getVc_xmjsnrsfypfyz_byzds().toString());
            }
            if (resultBean.getData().get(0).getCh_yxsfypfyz()==null){
                CH_YXSFYPFYZ.setText("");
            } else {
                CH_YXSFYPFYZ.setText(resultBean.getData().get(0).getCh_yxsfypfyz().toString());
            }
            if (resultBean.getData().get(0).getVc_yxsfypfyz_byzds()==null){
                VC_YXSFYPFYZ_BYZDS.setText("");
            } else {
                VC_YXSFYPFYZ_BYZDS.setText(resultBean.getData().get(0).getVc_yxsfypfyz_byzds().toString());
            }
            if (resultBean.getData().get(0).getVc_qyscxyxqk()==null){
                VC_QYSCXYXQK.setText("");
            } else {
                VC_QYSCXYXQK.setText(resultBean.getData().get(0).getVc_qyscxyxqk().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjrzrgg()==null){
                CH_SFJRZRGG.setText("");
            } else {
                CH_SFJRZRGG.setText(resultBean.getData().get(0).getCh_sfjrzrgg().toString());
            }
            if (resultBean.getData().get(0).getVc_fhsczcd()==null){
                VC_FHSCZCD.setText("");
            } else {
                VC_FHSCZCD.setText(resultBean.getData().get(0).getVc_fhsczcd().toString());
            }
            if (resultBean.getData().get(0).getVc_bfhsczcd()==null){
                VC_BFHSCZCD.setText("");
            } else {
                VC_BFHSCZCD.setText(resultBean.getData().get(0).getVc_bfhsczcd().toString());
            }
            if (resultBean.getData().get(0).getDt_xmcssj()==null){
                DT_XMCSSJ.setText("");
            } else {
                DT_XMCSSJ.setText(resultBean.getData().get(0).getDt_xmcssj().toString());
            }
            if (resultBean.getData().get(0).getDt_pzlxsj()==null){
                DT_PZLXSJ.setText("");
            } else {
                DT_PZLXSJ.setText(resultBean.getData().get(0).getDt_pzlxsj().toString());
            }
            if (resultBean.getData().get(0).getDt_pzlxdw()==null){
                DT_PZLXDW.setText("");
            } else {
                DT_PZLXDW.setText(resultBean.getData().get(0).getDt_pzlxdw().toString());
            }
            if (resultBean.getData().get(0).getCh_lxpfwh()==null){
                CH_LXPFWH.setText("");
            } else {
                CH_LXPFWH.setText(resultBean.getData().get(0).getCh_lxpfwh().toString());
            }
            if (resultBean.getData().get(0).getVc_hpsfbl()==null){
                VC_HPSFBL.setText("");
            } else {
                VC_HPSFBL.setText(resultBean.getData().get(0).getVc_hpsfbl().toString());
            }
            if (resultBean.getData().get(0).getCh_bzhpyxpjbg()==null){
                CH_BZHPYXPJBG.setText("");
            } else {
                CH_BZHPYXPJBG.setText(resultBean.getData().get(0).getCh_bzhpyxpjbg().toString());
            }
            if (resultBean.getData().get(0).getVc_hpbzdw()==null){
                VC_HPBZDW.setText("");
            } else {
                VC_HPBZDW.setText(resultBean.getData().get(0).getVc_hpbzdw().toString());
            }
            if (resultBean.getData().get(0).getCh_bzsj()==null){
                CH_BZSJ.setText("");
            } else {
                CH_BZSJ.setText(resultBean.getData().get(0).getCh_bzsj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfsyttfw()==null){
                CH_SFSYTTFW.setText("");
            } else {
                CH_SFSYTTFW.setText(resultBean.getData().get(0).getCh_sfsyttfw().toString());
            }
            if (resultBean.getData().get(0).getCh_wpspsj()==null){
                CH_WPSPSJ.setText("");
            } else {
                CH_WPSPSJ.setText(resultBean.getData().get(0).getCh_wpspsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hbsscspdw()==null){
                VC_HBSSCSPDW.setText("");
            } else {
                VC_HBSSCSPDW.setText(resultBean.getData().get(0).getVc_hbsscspdw().toString());
            }
            if (resultBean.getData().get(0).getVc_hbsscspsj()==null){
                VC_HBSSCSPSJ.setText("");
            } else {
                VC_HBSSCSPSJ.setText(resultBean.getData().get(0).getVc_hbsscspsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hbsscspwh()==null){
                VC_HBSSCSPWH.setText("");
            } else {
                VC_HBSSCSPWH.setText(resultBean.getData().get(0).getVc_hbsscspwh().toString());
            }
            if (resultBean.getData().get(0).getCh_hbjgyssj()==null){
                CH_HBJGYSSJ.setText("");
            } else {
                CH_HBJGYSSJ.setText(resultBean.getData().get(0).getCh_hbjgyssj().toString());
            }
            if (resultBean.getData().get(0).getVc_zzysbm()==null){
                VC_ZZYSBM.setText("");
            } else {
                VC_ZZYSBM.setText(resultBean.getData().get(0).getVc_zzysbm().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjxjg()==null){
                CH_SFJXJG.setText("");
            } else {
                CH_SFJXJG.setText(resultBean.getData().get(0).getCh_sfjxjg().toString());
            }
            if (resultBean.getData().get(0).getCh_jgcs()==null){
                CH_JGCS.setText("");
            } else {
                CH_JGCS.setText(resultBean.getData().get(0).getCh_jgcs().toString());
            }
            if (resultBean.getData().get(0).getVc_newjgsj()==null){
                DT_NEWJGSJ.setText("");
            } else {
                DT_NEWJGSJ.setText(resultBean.getData().get(0).getVc_newjgsj().toString());
            }
            if (resultBean.getData().get(0).getCh_pzlxbm()==null){
                CH_PZLXBM.setText("");
            } else {
                CH_PZLXBM.setText(resultBean.getData().get(0).getCh_pzlxbm().toString());
            }
            if (resultBean.getData().get(0).getVc_gkj_lxpfwh()==null){
                VC_GKJ_LXPFWH.setText("");
            } else {
                VC_GKJ_LXPFWH.setText(resultBean.getData().get(0).getVc_gkj_lxpfwh().toString());
            }
            if (resultBean.getData().get(0).getDt_gkj_hpsfbl()==null){
                DT_GKJ_HPSFBL.setText("");
            } else {
                DT_GKJ_HPSFBL.setText(resultBean.getData().get(0).getDt_gkj_hpsfbl().toString());
            }
            if (resultBean.getData().get(0).getCh_wpspdw()==null){
                CH_WPSPDW.setText("");
            } else {
                CH_WPSPDW.setText(resultBean.getData().get(0).getCh_wpspdw().toString());
            }
            if (resultBean.getData().get(0).getDt_spsj()==null){
                DT_SPSJ.setText("");
            } else {
                DT_SPSJ.setText(resultBean.getData().get(0).getDt_spsj().toString());
            }
            if (resultBean.getData().get(0).getDt_spdw()==null){
                DT_SPDW.setText("");
            } else {
                DT_SPDW.setText(resultBean.getData().get(0).getDt_spdw().toString());
            }
            if (resultBean.getData().get(0).getVc_sscspsj()==null){
                VC_SSCSPSJ.setText("");
            } else {
                VC_SSCSPSJ.setText(resultBean.getData().get(0).getVc_sscspsj().toString());
            }
            if (resultBean.getData().get(0).getCh_spwh()==null){
                CH_SPWH.setText("");
            } else {
                CH_SPWH.setText(resultBean.getData().get(0).getCh_spwh().toString());
            }
            if (resultBean.getData().get(0).getVc_hbzgyssj()==null){
                VC_HBZGYSSJ.setText("");
            } else {
                VC_HBZGYSSJ.setText(resultBean.getData().get(0).getVc_hbzgyssj().toString());
            }
            if (resultBean.getData().get(0).getVc_hbzg_zzysbm()==null){
                VC_HBZG_ZZYSBM.setText("");
            } else {
                VC_HBZG_ZZYSBM.setText(resultBean.getData().get(0).getVc_hbzg_zzysbm().toString());
            }
            if (resultBean.getData().get(0).getVc_sfsyzcttfw()==null){
                VC_SFSYZCTTFW.setText("");
            } else {
                VC_SFSYZCTTFW.setText(resultBean.getData().get(0).getVc_sfsyzcttfw().toString());
            }
            if (resultBean.getData().get(0).getDt_sfsycyzcttfw()==null){
                DT_SFSYCYZCTTFW.setText("");
            } else {
                DT_SFSYCYZCTTFW.setText(resultBean.getData().get(0).getDt_sfsycyzcttfw().toString());
            }
            if (resultBean.getData().get(0).getVc_scfscshj()==null){
                VC_SCFSCSHJ.setText("");
            } else {
                VC_SCFSCSHJ.setText(resultBean.getData().get(0).getVc_scfscshj().toString());
            }
            if (resultBean.getData().get(0).getCh_tzwrw()==null){
                CH_TZWRW.setText("");
            } else {
                CH_TZWRW.setText(resultBean.getData().get(0).getCh_tzwrw().toString());
            }
            if (resultBean.getData().get(0).getVc_csly()==null){
                VC_CSLY.setText("");
            } else {
                VC_CSLY.setText(resultBean.getData().get(0).getVc_csly().toString());
            }
            if (resultBean.getData().get(0).getVc_clssw()==null){
                CH_CLSSW.setText("");
            } else {
                CH_CLSSW.setText(resultBean.getData().get(0).getVc_clssw().toString());
            }
            if (resultBean.getData().get(0).getCh_cllw()==null){
                CH_CLLW.setText("");
            } else {
                CH_CLLW.setText(resultBean.getData().get(0).getCh_cllw().toString());
            }
            if (resultBean.getData().get(0).getVc_sjsfybg()==null){
                VC_SJSFYBG.setText("");
            } else {
                VC_SJSFYBG.setText(resultBean.getData().get(0).getVc_sjsfybg().toString());
            }
            if (resultBean.getData().get(0).getCh_pfqx()==null){
                CH_PFQX.setText("");
            } else {
                CH_PFQX.setText(resultBean.getData().get(0).getCh_pfqx().toString());
            }
            if (resultBean.getData().get(0).getVc_sfsjyiysy()==null){
                VC_SFSJYIYSY.setText("");
            } else {
                VC_SFSJYIYSY.setText(resultBean.getData().get(0).getVc_sfsjyiysy().toString());
            }
            if (resultBean.getData().get(0).getDt_sgnw()==null){
                DT_SGNW.setText("");
            } else {
                DT_SGNW.setText(resultBean.getData().get(0).getDt_sgnw().toString());
            }
            if (resultBean.getData().get(0).getCh_sfwfps()==null){
                CH_SFWFPS.setText("");
            } else {
                CH_SFWFPS.setText(resultBean.getData().get(0).getCh_sfwfps().toString());
            }
            if (resultBean.getData().get(0).getCh_qtqksm()==null){
                CH_QTQKSM.setText("");
            } else {
                CH_QTQKSM.setText(resultBean.getData().get(0).getCh_qtqksm().toString());
            }
            if (resultBean.getData().get(0).getDt_zxbz()==null){
                DT_ZXBZ.setText("");
            } else {
                DT_ZXBZ.setText(resultBean.getData().get(0).getDt_zxbz().toString());
            }
            if (resultBean.getData().get(0).getCh_jqjcsfdb()==null){
                CH_JQJCSFDB.setText("");
            } else {
                CH_JQJCSFDB.setText(resultBean.getData().get(0).getCh_jqjcsfdb().toString());
            }
            if (resultBean.getData().get(0).getVc_wryzw()==null){
                VC_WRYZW.setText("");
            } else {
                VC_WRYZW.setText(resultBean.getData().get(0).getVc_wryzw().toString());
            }
            if (resultBean.getData().get(0).getVc_ybgfhpzw()==null){
                VC_YBGFHPZW.setText("");
            } else {
                VC_YBGFHPZW.setText(resultBean.getData().get(0).getVc_ybgfhpzw().toString());
            }
            if (resultBean.getData().get(0).getCh_ybgfhpzw_nzly()==null){
                CH_YBGFHPZW_NZLY.setText("");
            } else {
                CH_YBGFHPZW_NZLY.setText(resultBean.getData().get(0).getCh_ybgfhpzw_nzly().toString());
            }
            if (resultBean.getData().get(0).getVc_ybgfhpzw_clssw()==null){
                VC_YBGFHPZW_CLSSW.setText("");
            } else {
                VC_YBGFHPZW_CLSSW.setText(resultBean.getData().get(0).getVc_ybgfhpzw_clssw().toString());
            }
            if (resultBean.getData().get(0).getCh_mqsjmcw()==null){
                CH_MQSJMCW.setText("");
            } else {
                CH_MQSJMCW.setText(resultBean.getData().get(0).getCh_mqsjmcw().toString());
            }
            if (resultBean.getData().get(0).getCh_mqsjmcw_nzly()==null){
                CH_MQSJMCW_NZLY.setText("");
            } else {
                CH_MQSJMCW_NZLY.setText(resultBean.getData().get(0).getCh_mqsjmcw_nzly().toString());
            }
            if (resultBean.getData().get(0).getVc_mqsjmcw_clssw()==null){
                VC_MQSJMCW_CLSSW.setText("");
            } else {
                VC_MQSJMCW_CLSSW.setText(resultBean.getData().get(0).getVc_mqsjmcw_clssw().toString());
            }
            if (resultBean.getData().get(0).getCh_hpzsjwxhxpmcw()==null){
                CH_HPZSJWXHXPMCW.setText("");
            } else {
                CH_HPZSJWXHXPMCW.setText(resultBean.getData().get(0).getCh_hpzsjwxhxpmcw().toString());
            }
            if (resultBean.getData().get(0).getCh_sygd()==null){
                CH_SYGD.setText("");
            } else {
                CH_SYGD.setText(resultBean.getData().get(0).getCh_sygd().toString());
            }
            if (resultBean.getData().get(0).getCh_fqschj()==null){
                CH_FQSCHJ.setText("");
            } else {
                CH_FQSCHJ.setText(resultBean.getData().get(0).getCh_fqschj().toString());
            }
            if (resultBean.getData().get(0).getVc_hpbgyqczcs()==null){
                VC_HPBGYQCZCS.setText("");
            } else {
                VC_HPBGYQCZCS.setText(resultBean.getData().get(0).getVc_hpbgyqczcs().toString());
            }
            if (resultBean.getData().get(0).getCh_hpbgyqczcs_czlw()==null){
                CH_HPBGYQCZCS_CZLW.setText("");
            } else {
                CH_HPBGYQCZCS_CZLW.setText(resultBean.getData().get(0).getCh_hpbgyqczcs_czlw().toString());
            }
            if (resultBean.getData().get(0).getVc_sjsyclss()==null){
                VC_SJSYCLSS.setText("");
            } else {
                VC_SJSYCLSS.setText(resultBean.getData().get(0).getVc_sjsyclss().toString());
            }
            if (resultBean.getData().get(0).getCh_zscshj()==null){
                CH_ZSCSHJ.setText("");
            } else {
                CH_ZSCSHJ.setText(resultBean.getData().get(0).getCh_zscshj().toString());
            }
            if (resultBean.getData().get(0).getVc_zs_sfdb()==null){
                VC_ZS_SFDB.setText("");
            } else {
                VC_ZS_SFDB.setText(resultBean.getData().get(0).getVc_zs_sfdb().toString());
            }
            if (resultBean.getData().get(0).getVc_hjyqwsfhjl()==null){
                VC_HJYQWSFHJL.setText("");
            } else {
                VC_HJYQWSFHJL.setText(resultBean.getData().get(0).getVc_hjyqwsfhjl().toString());
            }
            if (resultBean.getData().get(0).getCh_jlnsfybhmb()==null){
                CH_JLNSFYBHMB.setText("");
            } else {
                CH_JLNSFYBHMB.setText(resultBean.getData().get(0).getCh_jlnsfybhmb().toString());
            }
            if (resultBean.getData().get(0).getDt_bhmbjssj()==null){
                DT_BHMBJSSJ.setText("");
            } else {
                DT_BHMBJSSJ.setText(resultBean.getData().get(0).getDt_bhmbjssj().toString());
            }
            if (resultBean.getData().get(0).getVc_zbhjbhqk()==null){
                VC_ZBHJBHQK.setText("");
            } else {
                VC_ZBHJBHQK.setText(resultBean.getData().get(0).getVc_zbhjbhqk().toString());
            }
            if (resultBean.getData().get(0).getCh_sflscs()==null){
                CH_SFLSCS.setText("");
            } else {
                CH_SFLSCS.setText(resultBean.getData().get(0).getCh_sflscs().toString());
            }
            if (resultBean.getData().get(0).getVc_wlsqkms()==null){
                CH_WLSQKMS.setText("");
            } else {
                CH_WLSQKMS.setText(resultBean.getData().get(0).getVc_wlsqkms().toString());
            }
            if (resultBean.getData().get(0).getCh_sfbztfya()==null){
                CH_SFBZTFYA.setText("");
            } else {
                CH_SFBZTFYA.setText(resultBean.getData().get(0).getCh_sfbztfya().toString());
            }
            if (resultBean.getData().get(0).getCh_sfdyapg()==null){
                CH_SFDYAPG.setText("");
            } else {
                CH_SFDYAPG.setText(resultBean.getData().get(0).getCh_sfdyapg().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjxndyl()==null){
                CH_SFJXNDYL.setText("");
            } else {
                CH_SFJXNDYL.setText(resultBean.getData().get(0).getCh_sfjxndyl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcbwz()==null){
                CH_SFCBWZ.setText("");
            } else {
                CH_SFCBWZ.setText(resultBean.getData().get(0).getCh_sfcbwz().toString());
            }


            if (resultBean.getData().get(0).getCl_qthbbmjcqk()==null){
                CL_QTHBBMJCQK.setText("");
            } else {
                CL_QTHBBMJCQK.setText(resultBean.getData().get(0).getCl_qthbbmjcqk().toString());
            }
            if (resultBean.getData().get(0).getCl_czzywt()==null){
                CL_CZZYWT.setText("");
            } else {
                CL_CZZYWT.setText(resultBean.getData().get(0).getCl_czzywt().toString());
            }

            if (resultBean.getData().get(0).getCl_jcyq()==null){
                CL_JCYQ.setText("");
            } else {
                CL_JCYQ.setText(resultBean.getData().get(0).getCl_jcyq().toString());
            }

        } else {
            Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
        }
    }
}
