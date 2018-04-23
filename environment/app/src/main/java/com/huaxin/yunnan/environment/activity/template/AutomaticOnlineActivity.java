package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.AutomaticOnlineBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_AC_INFO;

/**
 * 13、污染源自动在线监控现场监察记录详情页
 */
public class AutomaticOnlineActivity extends BaseActicity implements View.OnClickListener, CallBack {

    private LinearLayout ll_no;
    private TextView title_text;
    private TextView DT_SS_BEGIN_TIME;
    private TextView DT_SS_END_TIME;
    private TextView VC_SS_PLACE;
    private TextView VC_SS_XAMINER;
    private TextView VC_SS_LAW_NUMBER;
    private TextView VC_SS_RECORDER;
    private TextView VC_SS_INSPECTED_UNIT;
    private TextView VC_SS_CODE_NUMBER;
    private TextView VC_SS_LEGAL_REPRESENTATIVE;
    private TextView VC_SS_LEGAL_ID;
    private TextView VC_SS_SITE_SUPERVISOR;
    private TextView VC_SS_SITE_ID;
    private TextView DT_SS_AGE;
    private TextView VC_SS_WORK_UNIT;
    private TextView VC_SS_POST;
    private TextView VC_SS_RELATIONSHIP;
    private TextView VC_SS_ADDRESS;
    private TextView VC_SS_TELEPHONE;
    private TextView VC_SS_POSTAL_CODE;
    private TextView VC_SS_OTHER_PEOPLE;
    private TextView VC_SS_UNIT_NAME;
    private TextView VC_SS_HBDWLX;
    private TextView CH_SS_SUPERVISION_TYPE;
    private TextView CH_SS_SFQRZJ;
    private TextView CH_SS_SFSQHB;
    private TextView VC_SS_SZS;
    private TextView VC_SS_SZX;
    private TextView VC_SS_SZZ;
    private TextView VC_SS_SZXAC;
    private TextView VC_SS_GYYQ;
    private TextView VC_SS_PQ;
    private TextView VC_SS_XYYSJCP;
    private TextView VC_SS_SJCL;
    private TextView VC_SS_JKSBYYS;
    private TextView DT_SS_AZSJ;
    private TextView CH_SS_SFJYJCBG;
    private TextView CH_SS_SFJBHBCPRZZS;
    private TextView CH_SS_SFYZSXF;
    private TextView VC_SS_1_SFYZSXF_QTSM;
    private TextView CH_SS_SFYSYZ;
    private TextView CH_SS_SFBAYZ;
    private TextView CH_SS_SFSHYI;
    private TextView CH_SS_SFWYZY;
    private TextView CH_SS_SFWYXL;
    private TextView CH_SS_WZSFZQ;
    private TextView CH_SS_YWSYJR;
    private TextView CH_SS_SFCZPL;
    private TextView CH_SS_JCSFSFZCDK;
    private TextView CH_SS_SFCZGLSH;
    private TextView CH_SFYXYZYS;
    private TextView CH_SFDJBAYXQ;
    private TextView CH_SJZLNDSFBA;
    private TextView VC_SS_4_SJZLNDSFBA_QTSM;
    private TextView CH_SFSXSJKSJR;
    private TextView CH_MBSFXY15S;
    private TextView CH_SFBCHWXJKZ;
    private TextView CH_SFZGZZT;
    private TextView VC_SS_4_SFZGZZT_QTSM;
    private TextView CH_SFNZCYZ;
    private TextView CH_SFNPCFY;
    private TextView CH_LJXSFSD;
    private TextView CH_SFYGZBJXH;
    private TextView VC_SS_4_SFYGZBJXH_QTSM;
    private TextView CH_SFCYFGGDFZD;
    private TextView CH_SFCYDJFCD;
    private TextView CH_NFZDQXDJ;
    private TextView CH_ZDSSSJBHSFFHLJGX;
    private TextView CH_SFCQWZDLYWJKSJ;
    private TextView CH_SFJKSJCQXFBD;
    private TextView CH_JKSJSFCQBDBFZ2YN;
    private TextView CH_JKSJWCSFCGZDFW;
    private TextView CH_MGHJSJPCSFDYBFZ1;
    private TextView VC_SS_4_MGHJSJPCSFDYBFZ1_QTSM;
    private TextView CH_JKYQSFZCYZ;
    private TextView CH_SFWJPZTYXZ;
    private TextView CH_SFAYQJXSYDBSY;
    private TextView CH_SFCZSSLCXZ;
    private TextView CH_SFCZJCTJCZBH;
    private TextView VC_SS_4_SFCZJCTJCZBH_QTSM;
    private TextView CH_JKXTSFJHBBMXY;
    private TextView VC_XYDW;
    private TextView DT_XYSJ;
    private TextView CH_SFJHBBMYXXSH;
    private TextView VC_SHDW;
    private TextView DT_SHSJ;
    private TextView DT_XCSHSJ;
    private TextView CH_SS_JKSSSFYHBBMLW;
    private TextView CH_SS_ZDLWW;
    private TextView CH_SS_SJSFNAYQZCCS;
    private TextView CH_SS_LSQSSFNAYQBC6GYYS;
    private TextView VC_SS_5_LSQSSFNAYQBC6GYYS_QTSM;
    private TextView CH_SS_YWMS;
    private TextView CH_SS_SFJXDSFYW;
    private TextView VC_SS_YWDW;
    private TextView CH_SS_SFCZSG;
    private TextView CH_SS_YWJLTZSFFHGD;
    private TextView CL_SS_QTHBBMJC;
    private TextView CL_SS_CZZYWT;
    private TextView CL_SS_JCYQ;
    private TextView DT_SQ_BEGIN_TIME;
    private TextView DT_SQ_END_TIME;
    private TextView VC_SQ_PLACE;
    private TextView VC_SQ_XAMINER;
    private TextView VC_SQ_LAW_NUMBER;
    private TextView VC_SQ_RECORDER;
    private TextView VC_SQ_INSPECTED_UNIT;
    private TextView VC_SQ_CODE_NUMBER;
    private TextView VC_SQ_LEGAL_REPRESENTATIVE;
    private TextView VC_SQ_LEGAL_ID;
    private TextView VC_SQ_SITE_SUPERVISOR;
    private TextView VC_SQ_SITE_ID;
    private TextView DT_SQ_AGE;
    private TextView VC_SQ_WORK_UNIT;
    private TextView VC_SQ_POST;
    private TextView VC_SQ_RELATIONSHIP;
    private TextView VC_SQ_ADDRESS;
    private TextView VC_SQ_TELEPHONE;
    private TextView VC_SQ_POSTAL_CODE;
    private TextView VC_SQ_OTHER_PEOPLE;
    private TextView VC_SQ_UNIT_NAME;
    private TextView VC_SQ_HBDWLX;
    private TextView CH_SQ_SUPERVISION_TYPE;
    private TextView VC_SQ_SZS;
    private TextView VC_SQ_SZX;
    private TextView VC_SQ_SZZ;
    private TextView VC_SQ_SZXAC;
    private TextView VC_SQ_GYYQ;
    private TextView VC_SQ_PQ;
    private TextView VC_SQ_XYYSJCP;
    private TextView VC_SQ_SJCL;
    private TextView VC_SQ_JKSBYYS;
    private TextView DT_SQ_AZSJ;
    private TextView CH_SQ_SFJBHBCPRZZS;
    private TextView CH_SQ_SFJYJCBG;
    private TextView CH_SQ_SFYZSXF;
    private TextView CH_SQ_SFWYPYDCZGDQY;
    private TextView CH_SQ_SFFHBZ;
    private TextView CH_SQ_CYDSFBKWTDMBW;
    private TextView CH_SQ_QGSFDYHG;
    private TextView CH_SQ_SFWYZPQGS;
    private TextView CH_SQ_SFMZGZTJ;
    private TextView CH_SQ_SFJBXGZZ;
    private TextView CH_SQ_SFZBAYXQ;
    private TextView CH_SQ_NDZLSFBAXF;
    private TextView CH_SQ_4_NDZLSFBAXF_QTSM;
    private TextView CH_SQ_SFZWDSRWBGXX;
    private TextView CH_SQ_WDSFFHYQ;
    private TextView CH_SQ_SFYMXAT;
    private TextView CH_SQ_WDSFDY120SSD;
    private TextView CH_SQ_4_WDSFDY120SSD_QTSM;
    private TextView CH_SQ_FCXTYYSJSFZC;
    private TextView CH_SQ_SFFHYQSMSYQ;
    private TextView CH_SQ_QSFLJSFZC;
    private TextView CH_SQ_LNWDSFYZ;
    private TextView CH_SQ_LXSFBS;
    private TextView CH_SQ_YWLNPS;
    private TextView CH_SQ_4_YWLNPS_QTSM;
    private TextView CH_SQ_GXSFCRDL;
    private TextView CH_SQ_JKSSSJSFFHLJ;
    private TextView CH_SQ_WJKSJ;
    private TextView CH_SQ_SFCQXFBD;
    private TextView CH_SQ_JKSJWCSFCGZDFW;
    private TextView CH_SQ_MGHJSJPCSFDYBFZ1;
    private TextView VC_SQ_SS_4_MGHJSJPCSFDYBFZ1_QT;
    private TextView CH_SQ_JKYQSFZCYZ;
    private TextView CH_SQ_SFWJPZTYXZ;
    private TextView CH_SQ_SFAYQJXSYDBSY;
    private TextView CH_SQ_SFCZSSLCXZ;
    private TextView CH_SQ_SFCZJCTJCZBH;
    private TextView CH_SQ_NZGSYGDBYZ;
    private TextView VC_SQ_4_SFCZJCTJCZBH_QTSM;
    private TextView CH_SQ_JKXTSFJHBBMXY;
    private TextView VC_SQ_XYDW;
    private TextView DT_SQ_XYSJ;
    private TextView CH_SQ_SFJHBBMYXXSH;
    private TextView VC_SQ_SHDW;
    private TextView DT_SQ_SHSJ;
    private TextView DT_SQ_XCSHSJ;
    private TextView CH_SQ_JKSSSFYHBBMLW;
    private TextView CH_SQ_SJSFNAYQZCCS;
    private TextView CH_SQ_CSSJYJKSJSFYZ;
    private TextView CH_SQ_LSSHSFNBC12GYYS;
    private TextView CH_SQ_LSQSSFNAYQBC6GYYS;
    private TextView VC_SS_5_LSQSSFNAYQBC6GYYS_QTS2;
    private TextView CH_SQ_YWMS;
    private TextView CH_SQ_SFJXDSFYW;
    private TextView VC_SQ_YWDW;
    private TextView CH_SQ_SFCZSG;
    private TextView CH_SQ_YWJLTZSFFHGD;
    private TextView CL_SQ_QTHBBMJC;
    private TextView CL_SQ_CZZYWT;
    private TextView CL_SQ_JCYQ;
    private TextView CH_SS_CSSJYJKSJSFYZ;
    private TextView CH_SS_LSSHSFNBC12GYYS;
    private TextView CH_SQ_SFYSYZ;
    private TextView CH_SQ_SFBAYZ;
    private TextView CH_SQ_SFSHYI;
    private TextView CH_SQ_ZDLWW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatic_online);
        initView();
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_AC_INFO, AutomaticOnlineBean.class, this, yNProgressDialog);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("污染源自动在线监控现场监察记录详情页");
        title_text.setOnClickListener(this);
        DT_SS_BEGIN_TIME = (TextView) findViewById(R.id.DT_SS_BEGIN_TIME);
        DT_SS_BEGIN_TIME.setOnClickListener(this);
        DT_SS_END_TIME = (TextView) findViewById(R.id.DT_SS_END_TIME);
        DT_SS_END_TIME.setOnClickListener(this);
        VC_SS_PLACE = (TextView) findViewById(R.id.VC_SS_PLACE);
        VC_SS_PLACE.setOnClickListener(this);
        VC_SS_XAMINER = (TextView) findViewById(R.id.VC_SS_XAMINER);
        VC_SS_XAMINER.setOnClickListener(this);
        VC_SS_LAW_NUMBER = (TextView) findViewById(R.id.VC_SS_LAW_NUMBER);
        VC_SS_LAW_NUMBER.setOnClickListener(this);
        VC_SS_RECORDER = (TextView) findViewById(R.id.VC_SS_RECORDER);
        VC_SS_RECORDER.setOnClickListener(this);
        VC_SS_INSPECTED_UNIT = (TextView) findViewById(R.id.VC_SS_INSPECTED_UNIT);
        VC_SS_INSPECTED_UNIT.setOnClickListener(this);
        VC_SS_CODE_NUMBER = (TextView) findViewById(R.id.VC_SS_CODE_NUMBER);
        VC_SS_CODE_NUMBER.setOnClickListener(this);
        VC_SS_LEGAL_REPRESENTATIVE = (TextView) findViewById(R.id.VC_SS_LEGAL_REPRESENTATIVE);
        VC_SS_LEGAL_REPRESENTATIVE.setOnClickListener(this);
        VC_SS_LEGAL_ID = (TextView) findViewById(R.id.VC_SS_LEGAL_ID);
        VC_SS_LEGAL_ID.setOnClickListener(this);
        VC_SS_SITE_SUPERVISOR = (TextView) findViewById(R.id.VC_SS_SITE_SUPERVISOR);
        VC_SS_SITE_SUPERVISOR.setOnClickListener(this);
        VC_SS_SITE_ID = (TextView) findViewById(R.id.VC_SS_SITE_ID);
        VC_SS_SITE_ID.setOnClickListener(this);
        DT_SS_AGE = (TextView) findViewById(R.id.DT_SS_AGE);
        DT_SS_AGE.setOnClickListener(this);
        VC_SS_WORK_UNIT = (TextView) findViewById(R.id.VC_SS_WORK_UNIT);
        VC_SS_WORK_UNIT.setOnClickListener(this);
        VC_SS_POST = (TextView) findViewById(R.id.VC_SS_POST);
        VC_SS_POST.setOnClickListener(this);
        VC_SS_RELATIONSHIP = (TextView) findViewById(R.id.VC_SS_RELATIONSHIP);
        VC_SS_RELATIONSHIP.setOnClickListener(this);
        VC_SS_ADDRESS = (TextView) findViewById(R.id.VC_SS_ADDRESS);
        VC_SS_ADDRESS.setOnClickListener(this);
        VC_SS_TELEPHONE = (TextView) findViewById(R.id.VC_SS_TELEPHONE);
        VC_SS_TELEPHONE.setOnClickListener(this);
        VC_SS_POSTAL_CODE = (TextView) findViewById(R.id.VC_SS_POSTAL_CODE);
        VC_SS_POSTAL_CODE.setOnClickListener(this);
        VC_SS_OTHER_PEOPLE = (TextView) findViewById(R.id.VC_SS_OTHER_PEOPLE);
        VC_SS_OTHER_PEOPLE.setOnClickListener(this);
        VC_SS_UNIT_NAME = (TextView) findViewById(R.id.VC_SS_UNIT_NAME);
        VC_SS_UNIT_NAME.setOnClickListener(this);
        VC_SS_HBDWLX = (TextView) findViewById(R.id.VC_SS_HBDWLX);
        VC_SS_HBDWLX.setOnClickListener(this);
        CH_SS_SUPERVISION_TYPE = (TextView) findViewById(R.id.CH_SS_SUPERVISION_TYPE);
        CH_SS_SUPERVISION_TYPE.setOnClickListener(this);
        CH_SS_SFQRZJ = (TextView) findViewById(R.id.CH_SS_SFQRZJ);
        CH_SS_SFQRZJ.setOnClickListener(this);
        CH_SS_SFSQHB = (TextView) findViewById(R.id.CH_SS_SFSQHB);
        CH_SS_SFSQHB.setOnClickListener(this);
        VC_SS_SZS = (TextView) findViewById(R.id.VC_SS_SZS);
        VC_SS_SZS.setOnClickListener(this);
        VC_SS_SZX = (TextView) findViewById(R.id.VC_SS_SZX);
        VC_SS_SZX.setOnClickListener(this);
        VC_SS_SZZ = (TextView) findViewById(R.id.VC_SS_SZZ);
        VC_SS_SZZ.setOnClickListener(this);
        VC_SS_SZXAC = (TextView) findViewById(R.id.VC_SS_SZXAC);
        VC_SS_SZXAC.setOnClickListener(this);
        VC_SS_GYYQ = (TextView) findViewById(R.id.VC_SS_GYYQ);
        VC_SS_GYYQ.setOnClickListener(this);
        VC_SS_PQ = (TextView) findViewById(R.id.VC_SS_PQ);
        VC_SS_PQ.setOnClickListener(this);
        VC_SS_XYYSJCP = (TextView) findViewById(R.id.VC_SS_XYYSJCP);
        VC_SS_XYYSJCP.setOnClickListener(this);
        VC_SS_SJCL = (TextView) findViewById(R.id.VC_SS_SJCL);
        VC_SS_SJCL.setOnClickListener(this);
        VC_SS_JKSBYYS = (TextView) findViewById(R.id.VC_SS_JKSBYYS);
        VC_SS_JKSBYYS.setOnClickListener(this);
        DT_SS_AZSJ = (TextView) findViewById(R.id.DT_SS_AZSJ);
        DT_SS_AZSJ.setOnClickListener(this);
        CH_SS_SFJYJCBG = (TextView) findViewById(R.id.CH_SS_SFJYJCBG);
        CH_SS_SFJYJCBG.setOnClickListener(this);
        CH_SS_SFJBHBCPRZZS = (TextView) findViewById(R.id.CH_SS_SFJBHBCPRZZS);
        CH_SS_SFJBHBCPRZZS.setOnClickListener(this);
        CH_SS_SFYZSXF = (TextView) findViewById(R.id.CH_SS_SFYZSXF);
        CH_SS_SFYZSXF.setOnClickListener(this);
        VC_SS_1_SFYZSXF_QTSM = (TextView) findViewById(R.id.VC_SS_1_SFYZSXF_QTSM);
        VC_SS_1_SFYZSXF_QTSM.setOnClickListener(this);
        CH_SS_SFYSYZ = (TextView) findViewById(R.id.CH_SS_SFYSYZ);
        CH_SS_SFYSYZ.setOnClickListener(this);
        CH_SS_SFBAYZ = (TextView) findViewById(R.id.CH_SS_SFBAYZ);
        CH_SS_SFBAYZ.setOnClickListener(this);
        CH_SS_SFSHYI = (TextView) findViewById(R.id.CH_SS_SFSHYI);
        CH_SS_SFSHYI.setOnClickListener(this);
        CH_SS_SFWYZY = (TextView) findViewById(R.id.CH_SS_SFWYZY);
        CH_SS_SFWYZY.setOnClickListener(this);
        CH_SS_SFWYXL = (TextView) findViewById(R.id.CH_SS_SFWYXL);
        CH_SS_SFWYXL.setOnClickListener(this);
        CH_SS_WZSFZQ = (TextView) findViewById(R.id.CH_SS_WZSFZQ);
        CH_SS_WZSFZQ.setOnClickListener(this);
        CH_SS_YWSYJR = (TextView) findViewById(R.id.CH_SS_YWSYJR);
        CH_SS_YWSYJR.setOnClickListener(this);
        CH_SS_SFCZPL = (TextView) findViewById(R.id.CH_SS_SFCZPL);
        CH_SS_SFCZPL.setOnClickListener(this);
        CH_SS_JCSFSFZCDK = (TextView) findViewById(R.id.CH_SS_JCSFSFZCDK);
        CH_SS_JCSFSFZCDK.setOnClickListener(this);
        CH_SS_SFCZGLSH = (TextView) findViewById(R.id.CH_SS_SFCZGLSH);
        CH_SS_SFCZGLSH.setOnClickListener(this);
        CH_SFYXYZYS = (TextView) findViewById(R.id.CH_SFYXYZYS);
        CH_SFYXYZYS.setOnClickListener(this);
        CH_SFDJBAYXQ = (TextView) findViewById(R.id.CH_SFDJBAYXQ);
        CH_SFDJBAYXQ.setOnClickListener(this);
        CH_SJZLNDSFBA = (TextView) findViewById(R.id.CH_SJZLNDSFBA);
        CH_SJZLNDSFBA.setOnClickListener(this);
        VC_SS_4_SJZLNDSFBA_QTSM = (TextView) findViewById(R.id.VC_SS_4_SJZLNDSFBA_QTSM);
        VC_SS_4_SJZLNDSFBA_QTSM.setOnClickListener(this);
        CH_SFSXSJKSJR = (TextView) findViewById(R.id.CH_SFSXSJKSJR);
        CH_SFSXSJKSJR.setOnClickListener(this);
        CH_MBSFXY15S = (TextView) findViewById(R.id.CH_MBSFXY15S);
        CH_MBSFXY15S.setOnClickListener(this);
        CH_SFBCHWXJKZ = (TextView) findViewById(R.id.CH_SFBCHWXJKZ);
        CH_SFBCHWXJKZ.setOnClickListener(this);
        CH_SFZGZZT = (TextView) findViewById(R.id.CH_SFZGZZT);
        CH_SFZGZZT.setOnClickListener(this);
        VC_SS_4_SFZGZZT_QTSM = (TextView) findViewById(R.id.VC_SS_4_SFZGZZT_QTSM);
        VC_SS_4_SFZGZZT_QTSM.setOnClickListener(this);
        CH_SFNZCYZ = (TextView) findViewById(R.id.CH_SFNZCYZ);
        CH_SFNZCYZ.setOnClickListener(this);
        CH_SFNPCFY = (TextView) findViewById(R.id.CH_SFNPCFY);
        CH_SFNPCFY.setOnClickListener(this);
        CH_LJXSFSD = (TextView) findViewById(R.id.CH_LJXSFSD);
        CH_LJXSFSD.setOnClickListener(this);
        CH_SFYGZBJXH = (TextView) findViewById(R.id.CH_SFYGZBJXH);
        CH_SFYGZBJXH.setOnClickListener(this);
        VC_SS_4_SFYGZBJXH_QTSM = (TextView) findViewById(R.id.VC_SS_4_SFYGZBJXH_QTSM);
        VC_SS_4_SFYGZBJXH_QTSM.setOnClickListener(this);
        CH_SFCYFGGDFZD = (TextView) findViewById(R.id.CH_SFCYFGGDFZD);
        CH_SFCYFGGDFZD.setOnClickListener(this);
        CH_SFCYDJFCD = (TextView) findViewById(R.id.CH_SFCYDJFCD);
        CH_SFCYDJFCD.setOnClickListener(this);
        CH_NFZDQXDJ = (TextView) findViewById(R.id.CH_NFZDQXDJ);
        CH_NFZDQXDJ.setOnClickListener(this);
        CH_ZDSSSJBHSFFHLJGX = (TextView) findViewById(R.id.CH_ZDSSSJBHSFFHLJGX);
        CH_ZDSSSJBHSFFHLJGX.setOnClickListener(this);
        CH_SFCQWZDLYWJKSJ = (TextView) findViewById(R.id.CH_SFCQWZDLYWJKSJ);
        CH_SFCQWZDLYWJKSJ.setOnClickListener(this);
        CH_SFJKSJCQXFBD = (TextView) findViewById(R.id.CH_SFJKSJCQXFBD);
        CH_SFJKSJCQXFBD.setOnClickListener(this);
        CH_JKSJSFCQBDBFZ2YN = (TextView) findViewById(R.id.CH_JKSJSFCQBDBFZ2YN);
        CH_JKSJSFCQBDBFZ2YN.setOnClickListener(this);
        CH_JKSJWCSFCGZDFW = (TextView) findViewById(R.id.CH_JKSJWCSFCGZDFW);
        CH_JKSJWCSFCGZDFW.setOnClickListener(this);
        CH_MGHJSJPCSFDYBFZ1 = (TextView) findViewById(R.id.CH_MGHJSJPCSFDYBFZ1);
        CH_MGHJSJPCSFDYBFZ1.setOnClickListener(this);
        VC_SS_4_MGHJSJPCSFDYBFZ1_QTSM = (TextView) findViewById(R.id.VC_SS_4_MGHJSJPCSFDYBFZ1_QTSM);
        VC_SS_4_MGHJSJPCSFDYBFZ1_QTSM.setOnClickListener(this);
        CH_JKYQSFZCYZ = (TextView) findViewById(R.id.CH_JKYQSFZCYZ);
        CH_JKYQSFZCYZ.setOnClickListener(this);
        CH_SFWJPZTYXZ = (TextView) findViewById(R.id.CH_SFWJPZTYXZ);
        CH_SFWJPZTYXZ.setOnClickListener(this);
        CH_SFAYQJXSYDBSY = (TextView) findViewById(R.id.CH_SFAYQJXSYDBSY);
        CH_SFAYQJXSYDBSY.setOnClickListener(this);
        CH_SFCZSSLCXZ = (TextView) findViewById(R.id.CH_SFCZSSLCXZ);
        CH_SFCZSSLCXZ.setOnClickListener(this);
        CH_SFCZJCTJCZBH = (TextView) findViewById(R.id.CH_SFCZJCTJCZBH);
        CH_SFCZJCTJCZBH.setOnClickListener(this);
        VC_SS_4_SFCZJCTJCZBH_QTSM = (TextView) findViewById(R.id.VC_SS_4_SFCZJCTJCZBH_QTSM);
        VC_SS_4_SFCZJCTJCZBH_QTSM.setOnClickListener(this);
        CH_JKXTSFJHBBMXY = (TextView) findViewById(R.id.CH_JKXTSFJHBBMXY);
        CH_JKXTSFJHBBMXY.setOnClickListener(this);
        VC_XYDW = (TextView) findViewById(R.id.VC_XYDW);
        VC_XYDW.setOnClickListener(this);
        DT_XYSJ = (TextView) findViewById(R.id.DT_XYSJ);
        DT_XYSJ.setOnClickListener(this);
        CH_SFJHBBMYXXSH = (TextView) findViewById(R.id.CH_SFJHBBMYXXSH);
        CH_SFJHBBMYXXSH.setOnClickListener(this);
        VC_SHDW = (TextView) findViewById(R.id.VC_SHDW);
        VC_SHDW.setOnClickListener(this);
        DT_SHSJ = (TextView) findViewById(R.id.DT_SHSJ);
        DT_SHSJ.setOnClickListener(this);
        DT_XCSHSJ = (TextView) findViewById(R.id.DT_XCSHSJ);
        DT_XCSHSJ.setOnClickListener(this);
        CH_SS_JKSSSFYHBBMLW = (TextView) findViewById(R.id.CH_SS_JKSSSFYHBBMLW);
        CH_SS_JKSSSFYHBBMLW.setOnClickListener(this);
        CH_SS_ZDLWW = (TextView) findViewById(R.id.CH_SS_ZDLWW);
        CH_SS_ZDLWW.setOnClickListener(this);
        CH_SS_SJSFNAYQZCCS = (TextView) findViewById(R.id.CH_SS_SJSFNAYQZCCS);
        CH_SS_SJSFNAYQZCCS.setOnClickListener(this);
        CH_SS_LSQSSFNAYQBC6GYYS = (TextView) findViewById(R.id.CH_SS_LSQSSFNAYQBC6GYYS);
        CH_SS_LSQSSFNAYQBC6GYYS.setOnClickListener(this);
        VC_SS_5_LSQSSFNAYQBC6GYYS_QTSM = (TextView) findViewById(R.id.VC_SS_5_LSQSSFNAYQBC6GYYS_QTSM);
        VC_SS_5_LSQSSFNAYQBC6GYYS_QTSM.setOnClickListener(this);
        CH_SS_YWMS = (TextView) findViewById(R.id.CH_SS_YWMS);
        CH_SS_YWMS.setOnClickListener(this);
        CH_SS_SFJXDSFYW = (TextView) findViewById(R.id.CH_SS_SFJXDSFYW);
        CH_SS_SFJXDSFYW.setOnClickListener(this);
        VC_SS_YWDW = (TextView) findViewById(R.id.VC_SS_YWDW);
        VC_SS_YWDW.setOnClickListener(this);
        CH_SS_SFCZSG = (TextView) findViewById(R.id.CH_SS_SFCZSG);
        CH_SS_SFCZSG.setOnClickListener(this);
        CH_SS_YWJLTZSFFHGD = (TextView) findViewById(R.id.CH_SS_YWJLTZSFFHGD);
        CH_SS_YWJLTZSFFHGD.setOnClickListener(this);
        CL_SS_QTHBBMJC = (TextView) findViewById(R.id.CL_SS_QTHBBMJC);
        CL_SS_QTHBBMJC.setOnClickListener(this);
        CL_SS_CZZYWT = (TextView) findViewById(R.id.CL_SS_CZZYWT);
        CL_SS_CZZYWT.setOnClickListener(this);
        CL_SS_JCYQ = (TextView) findViewById(R.id.CL_SS_JCYQ);
        CL_SS_JCYQ.setOnClickListener(this);
        DT_SQ_BEGIN_TIME = (TextView) findViewById(R.id.DT_SQ_BEGIN_TIME);
        DT_SQ_BEGIN_TIME.setOnClickListener(this);
        DT_SQ_END_TIME = (TextView) findViewById(R.id.DT_SQ_END_TIME);
        DT_SQ_END_TIME.setOnClickListener(this);
        VC_SQ_PLACE = (TextView) findViewById(R.id.VC_SQ_PLACE);
        VC_SQ_PLACE.setOnClickListener(this);
        VC_SQ_XAMINER = (TextView) findViewById(R.id.VC_SQ_XAMINER);
        VC_SQ_XAMINER.setOnClickListener(this);
        VC_SQ_LAW_NUMBER = (TextView) findViewById(R.id.VC_SQ_LAW_NUMBER);
        VC_SQ_LAW_NUMBER.setOnClickListener(this);
        VC_SQ_RECORDER = (TextView) findViewById(R.id.VC_SQ_RECORDER);
        VC_SQ_RECORDER.setOnClickListener(this);
        VC_SQ_INSPECTED_UNIT = (TextView) findViewById(R.id.VC_SQ_INSPECTED_UNIT);
        VC_SQ_INSPECTED_UNIT.setOnClickListener(this);
        VC_SQ_CODE_NUMBER = (TextView) findViewById(R.id.VC_SQ_CODE_NUMBER);
        VC_SQ_CODE_NUMBER.setOnClickListener(this);
        VC_SQ_LEGAL_REPRESENTATIVE = (TextView) findViewById(R.id.VC_SQ_LEGAL_REPRESENTATIVE);
        VC_SQ_LEGAL_REPRESENTATIVE.setOnClickListener(this);
        VC_SQ_LEGAL_ID = (TextView) findViewById(R.id.VC_SQ_LEGAL_ID);
        VC_SQ_LEGAL_ID.setOnClickListener(this);
        VC_SQ_SITE_SUPERVISOR = (TextView) findViewById(R.id.VC_SQ_SITE_SUPERVISOR);
        VC_SQ_SITE_SUPERVISOR.setOnClickListener(this);
        VC_SQ_SITE_ID = (TextView) findViewById(R.id.VC_SQ_SITE_ID);
        VC_SQ_SITE_ID.setOnClickListener(this);
        DT_SQ_AGE = (TextView) findViewById(R.id.DT_SQ_AGE);
        DT_SQ_AGE.setOnClickListener(this);
        VC_SQ_WORK_UNIT = (TextView) findViewById(R.id.VC_SQ_WORK_UNIT);
        VC_SQ_WORK_UNIT.setOnClickListener(this);
        VC_SQ_POST = (TextView) findViewById(R.id.VC_SQ_POST);
        VC_SQ_POST.setOnClickListener(this);
        VC_SQ_RELATIONSHIP = (TextView) findViewById(R.id.VC_SQ_RELATIONSHIP);
        VC_SQ_RELATIONSHIP.setOnClickListener(this);
        VC_SQ_ADDRESS = (TextView) findViewById(R.id.VC_SQ_ADDRESS);
        VC_SQ_ADDRESS.setOnClickListener(this);
        VC_SQ_TELEPHONE = (TextView) findViewById(R.id.VC_SQ_TELEPHONE);
        VC_SQ_TELEPHONE.setOnClickListener(this);
        VC_SQ_POSTAL_CODE = (TextView) findViewById(R.id.VC_SQ_POSTAL_CODE);
        VC_SQ_POSTAL_CODE.setOnClickListener(this);
        VC_SQ_OTHER_PEOPLE = (TextView) findViewById(R.id.VC_SQ_OTHER_PEOPLE);
        VC_SQ_OTHER_PEOPLE.setOnClickListener(this);
        VC_SQ_UNIT_NAME = (TextView) findViewById(R.id.VC_SQ_UNIT_NAME);
        VC_SQ_UNIT_NAME.setOnClickListener(this);
        VC_SQ_HBDWLX = (TextView) findViewById(R.id.VC_SQ_HBDWLX);
        VC_SQ_HBDWLX.setOnClickListener(this);
        CH_SQ_SUPERVISION_TYPE = (TextView) findViewById(R.id.CH_SQ_SUPERVISION_TYPE);
        CH_SQ_SUPERVISION_TYPE.setOnClickListener(this);
        VC_SQ_SZS = (TextView) findViewById(R.id.VC_SQ_SZS);
        VC_SQ_SZS.setOnClickListener(this);
        VC_SQ_SZX = (TextView) findViewById(R.id.VC_SQ_SZX);
        VC_SQ_SZX.setOnClickListener(this);
        VC_SQ_SZZ = (TextView) findViewById(R.id.VC_SQ_SZZ);
        VC_SQ_SZZ.setOnClickListener(this);
        VC_SQ_SZXAC = (TextView) findViewById(R.id.VC_SQ_SZXAC);
        VC_SQ_SZXAC.setOnClickListener(this);
        VC_SQ_GYYQ = (TextView) findViewById(R.id.VC_SQ_GYYQ);
        VC_SQ_GYYQ.setOnClickListener(this);
        VC_SQ_PQ = (TextView) findViewById(R.id.VC_SQ_PQ);
        VC_SQ_PQ.setOnClickListener(this);
        VC_SQ_XYYSJCP = (TextView) findViewById(R.id.VC_SQ_XYYSJCP);
        VC_SQ_XYYSJCP.setOnClickListener(this);
        VC_SQ_SJCL = (TextView) findViewById(R.id.VC_SQ_SJCL);
        VC_SQ_SJCL.setOnClickListener(this);
        VC_SQ_JKSBYYS = (TextView) findViewById(R.id.VC_SQ_JKSBYYS);
        VC_SQ_JKSBYYS.setOnClickListener(this);
        DT_SQ_AZSJ = (TextView) findViewById(R.id.DT_SQ_AZSJ);
        DT_SQ_AZSJ.setOnClickListener(this);
        CH_SQ_SFJBHBCPRZZS = (TextView) findViewById(R.id.CH_SQ_SFJBHBCPRZZS);
        CH_SQ_SFJBHBCPRZZS.setOnClickListener(this);
        CH_SQ_SFJYJCBG = (TextView) findViewById(R.id.CH_SQ_SFJYJCBG);
        CH_SQ_SFJYJCBG.setOnClickListener(this);
        CH_SQ_SFYZSXF = (TextView) findViewById(R.id.CH_SQ_SFYZSXF);
        CH_SQ_SFYZSXF.setOnClickListener(this);
        CH_SQ_SFWYPYDCZGDQY = (TextView) findViewById(R.id.CH_SQ_SFWYPYDCZGDQY);
        CH_SQ_SFWYPYDCZGDQY.setOnClickListener(this);
        CH_SQ_SFFHBZ = (TextView) findViewById(R.id.CH_SQ_SFFHBZ);
        CH_SQ_SFFHBZ.setOnClickListener(this);
        CH_SQ_CYDSFBKWTDMBW = (TextView) findViewById(R.id.CH_SQ_CYDSFBKWTDMBW);
        CH_SQ_CYDSFBKWTDMBW.setOnClickListener(this);
        CH_SQ_QGSFDYHG = (TextView) findViewById(R.id.CH_SQ_QGSFDYHG);
        CH_SQ_QGSFDYHG.setOnClickListener(this);
        CH_SQ_SFWYZPQGS = (TextView) findViewById(R.id.CH_SQ_SFWYZPQGS);
        CH_SQ_SFWYZPQGS.setOnClickListener(this);
        CH_SQ_SFMZGZTJ = (TextView) findViewById(R.id.CH_SQ_SFMZGZTJ);
        CH_SQ_SFMZGZTJ.setOnClickListener(this);
        CH_SQ_SFJBXGZZ = (TextView) findViewById(R.id.CH_SQ_SFJBXGZZ);
        CH_SQ_SFJBXGZZ.setOnClickListener(this);
        CH_SQ_SFZBAYXQ = (TextView) findViewById(R.id.CH_SQ_SFZBAYXQ);
        CH_SQ_SFZBAYXQ.setOnClickListener(this);
        CH_SQ_NDZLSFBAXF = (TextView) findViewById(R.id.CH_SQ_NDZLSFBAXF);
        CH_SQ_NDZLSFBAXF.setOnClickListener(this);
        CH_SQ_4_NDZLSFBAXF_QTSM = (TextView) findViewById(R.id.CH_SQ_4_NDZLSFBAXF_QTSM);
        CH_SQ_4_NDZLSFBAXF_QTSM.setOnClickListener(this);
        CH_SQ_SFZWDSRWBGXX = (TextView) findViewById(R.id.CH_SQ_SFZWDSRWBGXX);
        CH_SQ_SFZWDSRWBGXX.setOnClickListener(this);
        CH_SQ_WDSFFHYQ = (TextView) findViewById(R.id.CH_SQ_WDSFFHYQ);
        CH_SQ_WDSFFHYQ.setOnClickListener(this);
        CH_SQ_SFYMXAT = (TextView) findViewById(R.id.CH_SQ_SFYMXAT);
        CH_SQ_SFYMXAT.setOnClickListener(this);
        CH_SQ_WDSFDY120SSD = (TextView) findViewById(R.id.CH_SQ_WDSFDY120SSD);
        CH_SQ_WDSFDY120SSD.setOnClickListener(this);
        CH_SQ_4_WDSFDY120SSD_QTSM = (TextView) findViewById(R.id.CH_SQ_4_WDSFDY120SSD_QTSM);
        CH_SQ_4_WDSFDY120SSD_QTSM.setOnClickListener(this);
        CH_SQ_FCXTYYSJSFZC = (TextView) findViewById(R.id.CH_SQ_FCXTYYSJSFZC);
        CH_SQ_FCXTYYSJSFZC.setOnClickListener(this);
        CH_SQ_SFFHYQSMSYQ = (TextView) findViewById(R.id.CH_SQ_SFFHYQSMSYQ);
        CH_SQ_SFFHYQSMSYQ.setOnClickListener(this);
        CH_SQ_QSFLJSFZC = (TextView) findViewById(R.id.CH_SQ_QSFLJSFZC);
        CH_SQ_QSFLJSFZC.setOnClickListener(this);
        CH_SQ_LNWDSFYZ = (TextView) findViewById(R.id.CH_SQ_LNWDSFYZ);
        CH_SQ_LNWDSFYZ.setOnClickListener(this);
        CH_SQ_LXSFBS = (TextView) findViewById(R.id.CH_SQ_LXSFBS);
        CH_SQ_LXSFBS.setOnClickListener(this);
        CH_SQ_YWLNPS = (TextView) findViewById(R.id.CH_SQ_YWLNPS);
        CH_SQ_YWLNPS.setOnClickListener(this);
        CH_SQ_4_YWLNPS_QTSM = (TextView) findViewById(R.id.CH_SQ_4_YWLNPS_QTSM);
        CH_SQ_4_YWLNPS_QTSM.setOnClickListener(this);
        CH_SQ_GXSFCRDL = (TextView) findViewById(R.id.CH_SQ_GXSFCRDL);
        CH_SQ_GXSFCRDL.setOnClickListener(this);
        CH_SQ_JKSSSJSFFHLJ = (TextView) findViewById(R.id.CH_SQ_JKSSSJSFFHLJ);
        CH_SQ_JKSSSJSFFHLJ.setOnClickListener(this);
        CH_SQ_WJKSJ = (TextView) findViewById(R.id.CH_SQ_WJKSJ);
        CH_SQ_WJKSJ.setOnClickListener(this);
        CH_SQ_SFCQXFBD = (TextView) findViewById(R.id.CH_SQ_SFCQXFBD);
        CH_SQ_SFCQXFBD.setOnClickListener(this);
        CH_SQ_JKSJWCSFCGZDFW = (TextView) findViewById(R.id.CH_SQ_JKSJWCSFCGZDFW);
        CH_SQ_JKSJWCSFCGZDFW.setOnClickListener(this);
        CH_SQ_MGHJSJPCSFDYBFZ1 = (TextView) findViewById(R.id.CH_SQ_MGHJSJPCSFDYBFZ1);
        CH_SQ_MGHJSJPCSFDYBFZ1.setOnClickListener(this);
        VC_SQ_SS_4_MGHJSJPCSFDYBFZ1_QT = (TextView) findViewById(R.id.VC_SQ_SS_4_MGHJSJPCSFDYBFZ1_QT);
        VC_SQ_SS_4_MGHJSJPCSFDYBFZ1_QT.setOnClickListener(this);
        CH_SQ_JKYQSFZCYZ = (TextView) findViewById(R.id.CH_SQ_JKYQSFZCYZ);
        CH_SQ_JKYQSFZCYZ.setOnClickListener(this);
        CH_SQ_SFWJPZTYXZ = (TextView) findViewById(R.id.CH_SQ_SFWJPZTYXZ);
        CH_SQ_SFWJPZTYXZ.setOnClickListener(this);
        CH_SQ_SFAYQJXSYDBSY = (TextView) findViewById(R.id.CH_SQ_SFAYQJXSYDBSY);
        CH_SQ_SFAYQJXSYDBSY.setOnClickListener(this);
        CH_SQ_SFCZSSLCXZ = (TextView) findViewById(R.id.CH_SQ_SFCZSSLCXZ);
        CH_SQ_SFCZSSLCXZ.setOnClickListener(this);
        CH_SQ_SFCZJCTJCZBH = (TextView) findViewById(R.id.CH_SQ_SFCZJCTJCZBH);
        CH_SQ_SFCZJCTJCZBH.setOnClickListener(this);
        CH_SQ_NZGSYGDBYZ = (TextView) findViewById(R.id.CH_SQ_NZGSYGDBYZ);
        CH_SQ_NZGSYGDBYZ.setOnClickListener(this);
        VC_SQ_4_SFCZJCTJCZBH_QTSM = (TextView) findViewById(R.id.VC_SQ_4_SFCZJCTJCZBH_QTSM);
        VC_SQ_4_SFCZJCTJCZBH_QTSM.setOnClickListener(this);
        CH_SQ_JKXTSFJHBBMXY = (TextView) findViewById(R.id.CH_SQ_JKXTSFJHBBMXY);
        CH_SQ_JKXTSFJHBBMXY.setOnClickListener(this);
        VC_SQ_XYDW = (TextView) findViewById(R.id.VC_SQ_XYDW);
        VC_SQ_XYDW.setOnClickListener(this);
        DT_SQ_XYSJ = (TextView) findViewById(R.id.DT_SQ_XYSJ);
        DT_SQ_XYSJ.setOnClickListener(this);
        CH_SQ_SFJHBBMYXXSH = (TextView) findViewById(R.id.CH_SQ_SFJHBBMYXXSH);
        CH_SQ_SFJHBBMYXXSH.setOnClickListener(this);
        VC_SQ_SHDW = (TextView) findViewById(R.id.VC_SQ_SHDW);
        VC_SQ_SHDW.setOnClickListener(this);
        DT_SQ_SHSJ = (TextView) findViewById(R.id.DT_SQ_SHSJ);
        DT_SQ_SHSJ.setOnClickListener(this);
        DT_SQ_XCSHSJ = (TextView) findViewById(R.id.DT_SQ_XCSHSJ);
        DT_SQ_XCSHSJ.setOnClickListener(this);
        CH_SQ_JKSSSFYHBBMLW = (TextView) findViewById(R.id.CH_SQ_JKSSSFYHBBMLW);
        CH_SQ_JKSSSFYHBBMLW.setOnClickListener(this);
        CH_SQ_SJSFNAYQZCCS = (TextView) findViewById(R.id.CH_SQ_SJSFNAYQZCCS);
        CH_SQ_SJSFNAYQZCCS.setOnClickListener(this);
        CH_SQ_CSSJYJKSJSFYZ = (TextView) findViewById(R.id.CH_SQ_CSSJYJKSJSFYZ);
        CH_SQ_CSSJYJKSJSFYZ.setOnClickListener(this);
        CH_SQ_LSSHSFNBC12GYYS = (TextView) findViewById(R.id.CH_SQ_LSSHSFNBC12GYYS);
        CH_SQ_LSSHSFNBC12GYYS.setOnClickListener(this);
        CH_SQ_LSQSSFNAYQBC6GYYS = (TextView) findViewById(R.id.CH_SQ_LSQSSFNAYQBC6GYYS);
        CH_SQ_LSQSSFNAYQBC6GYYS.setOnClickListener(this);
        VC_SS_5_LSQSSFNAYQBC6GYYS_QTS2 = (TextView) findViewById(R.id.VC_SS_5_LSQSSFNAYQBC6GYYS_QTS2);
        VC_SS_5_LSQSSFNAYQBC6GYYS_QTS2.setOnClickListener(this);
        CH_SQ_YWMS = (TextView) findViewById(R.id.CH_SQ_YWMS);
        CH_SQ_YWMS.setOnClickListener(this);
        CH_SQ_SFJXDSFYW = (TextView) findViewById(R.id.CH_SQ_SFJXDSFYW);
        CH_SQ_SFJXDSFYW.setOnClickListener(this);
        VC_SQ_YWDW = (TextView) findViewById(R.id.VC_SQ_YWDW);
        VC_SQ_YWDW.setOnClickListener(this);
        CH_SQ_SFCZSG = (TextView) findViewById(R.id.CH_SQ_SFCZSG);
        CH_SQ_SFCZSG.setOnClickListener(this);
        CH_SQ_YWJLTZSFFHGD = (TextView) findViewById(R.id.CH_SQ_YWJLTZSFFHGD);
        CH_SQ_YWJLTZSFFHGD.setOnClickListener(this);
        CL_SQ_QTHBBMJC = (TextView) findViewById(R.id.CL_SQ_QTHBBMJC);
        CL_SQ_QTHBBMJC.setOnClickListener(this);
        CL_SQ_CZZYWT = (TextView) findViewById(R.id.CL_SQ_CZZYWT);
        CL_SQ_CZZYWT.setOnClickListener(this);
        CL_SQ_JCYQ = (TextView) findViewById(R.id.CL_SQ_JCYQ);
        CL_SQ_JCYQ.setOnClickListener(this);
        CH_SS_CSSJYJKSJSFYZ = (TextView) findViewById(R.id.CH_SS_CSSJYJKSJSFYZ);
        CH_SS_CSSJYJKSJSFYZ.setOnClickListener(this);
        CH_SS_LSSHSFNBC12GYYS = (TextView) findViewById(R.id.CH_SS_LSSHSFNBC12GYYS);
        CH_SS_LSSHSFNBC12GYYS.setOnClickListener(this);
        CH_SQ_SFYSYZ = (TextView) findViewById(R.id.CH_SQ_SFYSYZ);
        CH_SQ_SFYSYZ.setOnClickListener(this);
        CH_SQ_SFBAYZ = (TextView) findViewById(R.id.CH_SQ_SFBAYZ);
        CH_SQ_SFBAYZ.setOnClickListener(this);
        CH_SQ_SFSHYI = (TextView) findViewById(R.id.CH_SQ_SFSHYI);
        CH_SQ_SFSHYI.setOnClickListener(this);
        CH_SQ_ZDLWW = (TextView) findViewById(R.id.CH_SQ_ZDLWW);
        CH_SQ_ZDLWW.setOnClickListener(this);
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
        AutomaticOnlineBean resultBean = (AutomaticOnlineBean) o;
        if (resultBean.getSuccess().equals("1")) {
            if (resultBean.getData().get(0).getDt_ss_begin_time() == null) {
                DT_SS_BEGIN_TIME.setText("");
            } else {
                DT_SS_BEGIN_TIME.setText(resultBean.getData().get(0).getDt_ss_begin_time().toString());
            }
            if (resultBean.getData().get(0).getDt_ss_end_time()== null) {
                DT_SS_END_TIME.setText("");
            } else {
                DT_SS_END_TIME.setText(resultBean.getData().get(0).getDt_ss_end_time().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_place()==null) {
                VC_SS_PLACE.setText("");
            } else {
                VC_SS_PLACE.setText(resultBean.getData().get(0).getVc_ss_place().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_xaminer()==null) {
                VC_SS_XAMINER.setText("");
            } else {
                VC_SS_XAMINER.setText(resultBean.getData().get(0).getVc_ss_xaminer().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_law_number()==null) {
                VC_SS_LAW_NUMBER.setText("");
            } else {
                VC_SS_LAW_NUMBER.setText(resultBean.getData().get(0).getVc_ss_law_number().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_recorder()==null) {
                VC_SS_RECORDER.setText("");
            } else {
                VC_SS_RECORDER.setText(resultBean.getData().get(0).getVc_ss_recorder().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_inspected_unit()==null) {
                VC_SS_INSPECTED_UNIT.setText("");
            } else {
                VC_SS_INSPECTED_UNIT.setText(resultBean.getData().get(0).getVc_ss_inspected_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_code_number()==null) {
                VC_SS_CODE_NUMBER.setText("");
            } else {
                VC_SS_CODE_NUMBER.setText(resultBean.getData().get(0).getVc_ss_code_number().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_legal_representative()==null) {
                VC_SS_LEGAL_REPRESENTATIVE.setText("");
            } else {
                VC_SS_LEGAL_REPRESENTATIVE.setText(resultBean.getData().get(0).getVc_ss_legal_representative().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_legal_id()==null) {
                VC_SS_LEGAL_ID.setText("");
            } else {
                VC_SS_LEGAL_ID.setText(resultBean.getData().get(0).getVc_ss_legal_id().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_site_supervisor()==null) {
                VC_SS_SITE_SUPERVISOR.setText("");
            } else {
                VC_SS_SITE_SUPERVISOR.setText(resultBean.getData().get(0).getVc_ss_site_supervisor().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_site_id()==null) {
                VC_SS_SITE_ID.setText("");
            } else {
                VC_SS_SITE_ID.setText(resultBean.getData().get(0).getVc_ss_site_id().toString());
            }
            if (resultBean.getData().get(0).getNb_ss_age()==null) {
                DT_SS_AGE.setText("");
            } else {
                DT_SS_AGE.setText(resultBean.getData().get(0).getNb_ss_age().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_work_unit()==null) {
                VC_SS_WORK_UNIT.setText("");
            } else {
                VC_SS_WORK_UNIT.setText(resultBean.getData().get(0).getVc_ss_work_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_post()==null) {
                VC_SS_POST.setText("");
            } else {
                VC_SS_POST.setText(resultBean.getData().get(0).getVc_ss_post().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_relationship()==null) {
                VC_SS_RELATIONSHIP.setText("");
            } else {
                VC_SS_RELATIONSHIP.setText(resultBean.getData().get(0).getVc_ss_relationship().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_address()==null) {
                VC_SS_ADDRESS.setText("");
            } else {
                VC_SS_ADDRESS.setText(resultBean.getData().get(0).getVc_ss_address().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_telephone()==null) {
                VC_SS_TELEPHONE.setText("");
            } else {
                VC_SS_TELEPHONE.setText(resultBean.getData().get(0).getVc_ss_telephone().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_postal_code()==null) {
                VC_SS_POSTAL_CODE.setText("");
            } else {
                VC_SS_POSTAL_CODE.setText(resultBean.getData().get(0).getVc_ss_postal_code().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_other_people()==null) {
                VC_SS_OTHER_PEOPLE.setText("");
            } else {
                VC_SS_OTHER_PEOPLE.setText(resultBean.getData().get(0).getVc_ss_other_people().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_unit_name()==null) {
                VC_SS_UNIT_NAME.setText("");
            } else {
                VC_SS_UNIT_NAME.setText(resultBean.getData().get(0).getVc_ss_unit_name().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_hbdwlx()==null) {
                VC_SS_HBDWLX.setText("");
            } else {
                VC_SS_HBDWLX.setText(resultBean.getData().get(0).getCh_ss_hbdwlx().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_supervision_type()==null) {
                CH_SS_SUPERVISION_TYPE.setText("");
            } else {
                CH_SS_SUPERVISION_TYPE.setText(resultBean.getData().get(0).getCh_ss_supervision_type().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfqrzj()==null) {
                CH_SS_SFQRZJ.setText("");
            } else {
                CH_SS_SFQRZJ.setText(resultBean.getData().get(0).getCh_ss_sfqrzj().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfsqhb()==null) {
                CH_SS_SFSQHB.setText("");
            } else {
                CH_SS_SFSQHB.setText(resultBean.getData().get(0).getCh_ss_sfsqhb().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_szs()==null) {
                VC_SS_SZS.setText("");
            } else {
                VC_SS_SZS.setText(resultBean.getData().get(0).getVc_ss_szs().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_szx()==null) {
                VC_SS_SZX.setText("");
            } else {
                VC_SS_SZX.setText(resultBean.getData().get(0).getVc_ss_szx().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_szz()==null) {
                VC_SS_SZZ.setText("");
            } else {
                VC_SS_SZZ.setText(resultBean.getData().get(0).getVc_ss_szz().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_szxac()==null) {
                VC_SS_SZXAC.setText("");
            } else {
                VC_SS_SZXAC.setText(resultBean.getData().get(0).getVc_ss_szxac().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_gyyq()==null) {
                VC_SS_GYYQ.setText("");
            } else {
                VC_SS_GYYQ.setText(resultBean.getData().get(0).getVc_ss_gyyq().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_pq()==null) {
                VC_SS_PQ.setText("");
            } else {
                VC_SS_PQ.setText(resultBean.getData().get(0).getVc_ss_pq().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_xyysjcp()==null) {
                VC_SS_XYYSJCP.setText("");
            } else {
                VC_SS_XYYSJCP.setText(resultBean.getData().get(0).getVc_ss_xyysjcp().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_sjcl()==null) {
                VC_SS_SJCL.setText("");
            } else {
                VC_SS_SJCL.setText(resultBean.getData().get(0).getVc_ss_sjcl().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_jksbyys()==null) {
                VC_SS_JKSBYYS.setText("");
            } else {
                VC_SS_JKSBYYS.setText(resultBean.getData().get(0).getVc_ss_jksbyys().toString());
            }
            if (resultBean.getData().get(0).getDt_ss_azsj()==null) {
                DT_SS_AZSJ.setText("");
            } else {
                DT_SS_AZSJ.setText(resultBean.getData().get(0).getDt_ss_azsj().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfjyjcbg()==null) {
                CH_SS_SFJYJCBG.setText("");
            } else {
                CH_SS_SFJYJCBG.setText(resultBean.getData().get(0).getCh_ss_sfjyjcbg().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfjbhbcprzzs()==null) {
                CH_SS_SFJBHBCPRZZS.setText("");
            } else {
                CH_SS_SFJBHBCPRZZS.setText(resultBean.getData().get(0).getCh_ss_sfjbhbcprzzs().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfyzsxf()==null) {
                CH_SS_SFYZSXF.setText("");
            } else {
                CH_SS_SFYZSXF.setText(resultBean.getData().get(0).getCh_ss_sfyzsxf().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_1_sfyzsxf_qtsm()==null) {
                VC_SS_1_SFYZSXF_QTSM.setText("");
            } else {
                VC_SS_1_SFYZSXF_QTSM.setText(resultBean.getData().get(0).getVc_ss_1_sfyzsxf_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfysyz()==null) {
                CH_SS_SFYSYZ.setText("");
            } else {
                CH_SS_SFYSYZ.setText(resultBean.getData().get(0).getCh_ss_sfysyz().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfbayz()==null) {
                CH_SS_SFBAYZ.setText("");
            } else {
                CH_SS_SFBAYZ.setText(resultBean.getData().get(0).getCh_ss_sfbayz().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfshyi()==null) {
                CH_SS_SFSHYI.setText("");
            } else {
                CH_SS_SFSHYI.setText(resultBean.getData().get(0).getCh_ss_sfshyi().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfwyzy()==null) {
                CH_SS_SFWYZY.setText("");
            } else {
                CH_SS_SFWYZY.setText(resultBean.getData().get(0).getCh_ss_sfwyzy().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfwyxl()==null) {
                CH_SS_SFWYXL.setText("");
            } else {
                CH_SS_SFWYXL.setText(resultBean.getData().get(0).getCh_ss_sfwyxl().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_wzsfzq()==null) {
                CH_SS_WZSFZQ.setText("");
            } else {
                CH_SS_WZSFZQ.setText(resultBean.getData().get(0).getCh_ss_wzsfzq().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_ywsyjr()==null) {
                CH_SS_YWSYJR.setText("");
            } else {
                CH_SS_YWSYJR.setText(resultBean.getData().get(0).getCh_ss_ywsyjr().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfczpl()==null) {
                CH_SS_SFCZPL.setText("");
            } else {
                CH_SS_SFCZPL.setText(resultBean.getData().get(0).getCh_ss_sfczpl().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_jcsfsfzcdk()==null) {
                CH_SS_JCSFSFZCDK.setText("");
            } else {
                CH_SS_JCSFSFZCDK.setText(resultBean.getData().get(0).getCh_ss_jcsfsfzcdk().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfczglsh()==null) {
                CH_SS_SFCZGLSH.setText("");
            } else {
                CH_SS_SFCZGLSH.setText(resultBean.getData().get(0).getCh_ss_sfczglsh().toString());
            }
            if (resultBean.getData().get(0).getCh_sfyxyzys()==null) {
                CH_SFYXYZYS.setText("");
            } else {
                CH_SFYXYZYS.setText(resultBean.getData().get(0).getCh_sfyxyzys().toString());
            }
            if (resultBean.getData().get(0).getCh_sfdjbayxq()==null) {
                CH_SFDJBAYXQ.setText("");
            } else {
                CH_SFDJBAYXQ.setText(resultBean.getData().get(0).getCh_sfdjbayxq().toString());
            }
            if (resultBean.getData().get(0).getCh_sjzlndsfba()==null) {
                CH_SJZLNDSFBA.setText("");
            } else {
                CH_SJZLNDSFBA.setText(resultBean.getData().get(0).getCh_sjzlndsfba().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_4_sjzlndsfba_qtsm()==null) {
                VC_SS_4_SJZLNDSFBA_QTSM.setText("");
            } else {
                VC_SS_4_SJZLNDSFBA_QTSM.setText(resultBean.getData().get(0).getVc_ss_4_sjzlndsfba_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sfsxsjksjr()==null) {
                CH_SFSXSJKSJR.setText("");
            } else {
                CH_SFSXSJKSJR.setText(resultBean.getData().get(0).getCh_sfsxsjksjr().toString());
            }
            if (resultBean.getData().get(0).getCh_mbsfxy15s()==null) {
                CH_MBSFXY15S.setText("");
            } else {
                CH_MBSFXY15S.setText(resultBean.getData().get(0).getCh_mbsfxy15s().toString());
            }
            if (resultBean.getData().get(0).getCh_sfbchwxjkz()==null) {
                CH_SFBCHWXJKZ.setText("");
            } else {
                CH_SFBCHWXJKZ.setText(resultBean.getData().get(0).getCh_sfbchwxjkz().toString());
            }
            if (resultBean.getData().get(0).getCh_sfzgzzt()==null) {
                CH_SFZGZZT.setText("");
            } else {
                CH_SFZGZZT.setText(resultBean.getData().get(0).getCh_sfzgzzt().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_4_sfzgzzt_qtsm()==null) {
                VC_SS_4_SFZGZZT_QTSM.setText("");
            } else {
                VC_SS_4_SFZGZZT_QTSM.setText(resultBean.getData().get(0).getVc_ss_4_sfzgzzt_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sfnzcyz()==null) {
                CH_SFNZCYZ.setText("");
            } else {
                CH_SFNZCYZ.setText(resultBean.getData().get(0).getCh_sfnzcyz().toString());
            }
            if (resultBean.getData().get(0).getCh_sfnpcfy()==null) {
                CH_SFNPCFY.setText("");
            } else {
                CH_SFNPCFY.setText(resultBean.getData().get(0).getCh_sfnpcfy().toString());
            }
            if (resultBean.getData().get(0).getCh_ljxsfsd()==null) {
                CH_LJXSFSD.setText("");
            } else {
                CH_LJXSFSD.setText(resultBean.getData().get(0).getCh_ljxsfsd().toString());
            }
            if (resultBean.getData().get(0).getCh_sfygzbjxh()==null) {
                CH_SFYGZBJXH.setText("");
            } else {
                CH_SFYGZBJXH.setText(resultBean.getData().get(0).getCh_sfygzbjxh().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_4_sfygzbjxh_qtsm()==null) {
                VC_SS_4_SFYGZBJXH_QTSM.setText("");
            } else {
                VC_SS_4_SFYGZBJXH_QTSM.setText(resultBean.getData().get(0).getVc_ss_4_sfygzbjxh_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcyfggdfzd()==null) {
                CH_SFCYFGGDFZD.setText("");
            } else {
                CH_SFCYFGGDFZD.setText(resultBean.getData().get(0).getCh_sfcyfggdfzd().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcydjfcd()==null) {
                CH_SFCYDJFCD.setText("");
            } else {
                CH_SFCYDJFCD.setText(resultBean.getData().get(0).getCh_sfcydjfcd().toString());
            }
            if (resultBean.getData().get(0).getCh_nfzdqxdj()==null) {
                CH_NFZDQXDJ.setText("");
            } else {
                CH_NFZDQXDJ.setText(resultBean.getData().get(0).getCh_nfzdqxdj().toString());
            }
            if (resultBean.getData().get(0).getCh_zdsssjbhsffhljgx()==null) {
                CH_ZDSSSJBHSFFHLJGX.setText("");
            } else {
                CH_ZDSSSJBHSFFHLJGX.setText(resultBean.getData().get(0).getCh_zdsssjbhsffhljgx().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcqwzdlywjksj()==null) {
                CH_SFCQWZDLYWJKSJ.setText("");
            } else {
                CH_SFCQWZDLYWJKSJ.setText(resultBean.getData().get(0).getCh_sfcqwzdlywjksj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjksjcqxfbd()==null) {
                CH_SFJKSJCQXFBD.setText("");
            } else {
                CH_SFJKSJCQXFBD.setText(resultBean.getData().get(0).getCh_sfjksjcqxfbd().toString());
            }
            if (resultBean.getData().get(0).getCh_jksjsfcqbdbfz2yn()==null) {
                CH_JKSJSFCQBDBFZ2YN.setText("");
            } else {
                CH_JKSJSFCQBDBFZ2YN.setText(resultBean.getData().get(0).getCh_jksjsfcqbdbfz2yn().toString());
            }
            if (resultBean.getData().get(0).getCh_jksjwcsfcgzdfw()==null) {
                CH_JKSJWCSFCGZDFW.setText("");
            } else {
                CH_JKSJWCSFCGZDFW.setText(resultBean.getData().get(0).getCh_jksjwcsfcgzdfw().toString());
            }
            if (resultBean.getData().get(0).getCh_mghjsjpcsfdybfz1()==null) {
                CH_MGHJSJPCSFDYBFZ1.setText("");
            } else {
                CH_MGHJSJPCSFDYBFZ1.setText(resultBean.getData().get(0).getCh_mghjsjpcsfdybfz1().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_4_mghjsjpcsfdybfz1_qtsm()==null) {
                VC_SS_4_MGHJSJPCSFDYBFZ1_QTSM.setText("");
            } else {
                VC_SS_4_MGHJSJPCSFDYBFZ1_QTSM.setText(resultBean.getData().get(0).getVc_ss_4_mghjsjpcsfdybfz1_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_jkyqsfzcyz()==null) {
                CH_JKYQSFZCYZ.setText("");
            } else {
                CH_JKYQSFZCYZ.setText(resultBean.getData().get(0).getCh_jkyqsfzcyz().toString());
            }
            if (resultBean.getData().get(0).getCh_sfwjpztyxz()==null) {
                CH_SFWJPZTYXZ.setText("");
            } else {
                CH_SFWJPZTYXZ.setText(resultBean.getData().get(0).getCh_sfwjpztyxz().toString());
            }
            if (resultBean.getData().get(0).getCh_sfayqjxsydbsy()==null) {
                CH_SFAYQJXSYDBSY.setText("");
            } else {
                CH_SFAYQJXSYDBSY.setText(resultBean.getData().get(0).getCh_sfayqjxsydbsy().toString());
            }
            if (resultBean.getData().get(0).getCh_sfczsslcxz()==null) {
                CH_SFCZSSLCXZ.setText("");
            } else {
                CH_SFCZSSLCXZ.setText(resultBean.getData().get(0).getCh_sfczsslcxz().toString());
            }
            if (resultBean.getData().get(0).getCh_sfczjctjczbh()==null) {
                CH_SFCZJCTJCZBH.setText("");
            } else {
                CH_SFCZJCTJCZBH.setText(resultBean.getData().get(0).getCh_sfczjctjczbh().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_4_sfczjctjczbh_qtsm()==null) {
                VC_SS_4_SFCZJCTJCZBH_QTSM.setText("");
            } else {
                VC_SS_4_SFCZJCTJCZBH_QTSM.setText(resultBean.getData().get(0).getVc_ss_4_sfczjctjczbh_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_jkxtsfjhbbmxy()==null) {
                CH_JKXTSFJHBBMXY.setText("");
            } else {
                CH_JKXTSFJHBBMXY.setText(resultBean.getData().get(0).getCh_jkxtsfjhbbmxy().toString());
            }
            if (resultBean.getData().get(0).getVc_xydw()==null) {
                VC_XYDW.setText("");
            } else {
                VC_XYDW.setText(resultBean.getData().get(0).getVc_xydw().toString());
            }
            if (resultBean.getData().get(0).getDt_xysj()==null) {
                DT_XYSJ.setText("");
            } else {
                DT_XYSJ.setText(resultBean.getData().get(0).getDt_xysj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjhbbmyxxsh()==null) {
                CH_SFJHBBMYXXSH.setText("");
            } else {
                CH_SFJHBBMYXXSH.setText(resultBean.getData().get(0).getCh_sfjhbbmyxxsh().toString());
            }
            if (resultBean.getData().get(0).getVc_shdw()==null) {
                VC_SHDW.setText("");
            } else {
                VC_SHDW.setText(resultBean.getData().get(0).getVc_shdw().toString());
            }
            if (resultBean.getData().get(0).getDt_shsj()==null) {
                DT_SHSJ.setText("");
            } else {
                DT_SHSJ.setText(resultBean.getData().get(0).getDt_shsj().toString());
            }
            if (resultBean.getData().get(0).getDt_xcshsj()==null) {
                DT_XCSHSJ.setText("");
            } else {
                DT_XCSHSJ.setText(resultBean.getData().get(0).getDt_xcshsj().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_jksssfyhbbmlw()==null) {
                CH_SS_JKSSSFYHBBMLW.setText("");
            } else {
                CH_SS_JKSSSFYHBBMLW.setText(resultBean.getData().get(0).getCh_ss_jksssfyhbbmlw().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_zdlww()==null) {
                CH_SS_ZDLWW.setText("");
            } else {
                CH_SS_ZDLWW.setText(resultBean.getData().get(0).getVc_ss_zdlww().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sjsfnayqzccs()==null) {
                CH_SS_SJSFNAYQZCCS.setText("");
            } else {
                CH_SS_SJSFNAYQZCCS.setText(resultBean.getData().get(0).getCh_ss_sjsfnayqzccs().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_lsshsfnbc12gyys()==null) {
                CH_SS_LSSHSFNBC12GYYS.setText("");
            } else {
                CH_SS_LSSHSFNBC12GYYS.setText(resultBean.getData().get(0).getCh_ss_lsshsfnbc12gyys().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_cssjyjksjsfyz()==null) {
                CH_SS_CSSJYJKSJSFYZ.setText("");
            } else {
                CH_SS_CSSJYJKSJSFYZ.setText(resultBean.getData().get(0).getCh_ss_cssjyjksjsfyz().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_lsqssfnayqbc6gyys()==null) {
                CH_SS_LSQSSFNAYQBC6GYYS.setText("");
            } else {
                CH_SS_LSQSSFNAYQBC6GYYS.setText(resultBean.getData().get(0).getCh_ss_lsqssfnayqbc6gyys().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_5_lsqssfnayqbc6gyys_qtsm()==null) {
                VC_SS_5_LSQSSFNAYQBC6GYYS_QTSM.setText("");
            } else {
                VC_SS_5_LSQSSFNAYQBC6GYYS_QTSM.setText(resultBean.getData().get(0).getVc_ss_5_lsqssfnayqbc6gyys_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_ywms()==null) {
                CH_SS_YWMS.setText("");
            } else {
                CH_SS_YWMS.setText(resultBean.getData().get(0).getCh_ss_ywms().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfjxdsfyw()==null) {
                CH_SS_SFJXDSFYW.setText("");
            } else {
                CH_SS_SFJXDSFYW.setText(resultBean.getData().get(0).getCh_ss_sfjxdsfyw().toString());
            }
            if (resultBean.getData().get(0).getVc_ss_ywdw()==null) {
                VC_SS_YWDW.setText("");
            } else {
                VC_SS_YWDW.setText(resultBean.getData().get(0).getVc_ss_ywdw().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_sfczsg()==null) {
                CH_SS_SFCZSG.setText("");
            } else {
                CH_SS_SFCZSG.setText(resultBean.getData().get(0).getCh_ss_sfczsg().toString());
            }
            if (resultBean.getData().get(0).getCh_ss_ywjltzsffhgd()==null) {
                CH_SS_YWJLTZSFFHGD.setText("");
            } else {
                CH_SS_YWJLTZSFFHGD.setText(resultBean.getData().get(0).getCh_ss_ywjltzsffhgd().toString());
            }
            if (resultBean.getData().get(0).getCl_ss_qthbbmjc()==null) {
                CL_SS_QTHBBMJC.setText("");
            } else {
                CL_SS_QTHBBMJC.setText(resultBean.getData().get(0).getCl_ss_qthbbmjc().toString());
            }
            if (resultBean.getData().get(0).getCl_ss_czzywt()==null) {
                CL_SS_CZZYWT.setText("");
            } else {
                CL_SS_CZZYWT.setText(resultBean.getData().get(0).getCl_ss_czzywt().toString());
            }
            if (resultBean.getData().get(0).getCl_ss_jcyq()==null) {
                CL_SS_JCYQ.setText("");
            } else {
                CL_SS_JCYQ.setText(resultBean.getData().get(0).getCl_ss_jcyq().toString());
            }
            if (resultBean.getData().get(0).getDt_sq_begin_time()==null) {
                DT_SQ_BEGIN_TIME.setText("");
            } else {
                DT_SQ_BEGIN_TIME.setText(resultBean.getData().get(0).getDt_sq_begin_time().toString());
            }
            if (resultBean.getData().get(0).getDt_sq_end_time()==null) {
                DT_SQ_END_TIME.setText("");
            } else {
                DT_SQ_END_TIME.setText(resultBean.getData().get(0).getDt_sq_end_time().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_place()==null) {
                VC_SQ_PLACE.setText("");
            } else {
                VC_SQ_PLACE.setText(resultBean.getData().get(0).getVc_sq_place().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_xaminer()==null) {
                VC_SQ_XAMINER.setText("");
            } else {
                VC_SQ_XAMINER.setText(resultBean.getData().get(0).getVc_sq_xaminer().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_law_number()==null) {
                VC_SQ_LAW_NUMBER.setText("");
            } else {
                VC_SQ_LAW_NUMBER.setText(resultBean.getData().get(0).getVc_sq_law_number().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_recorder()==null) {
                VC_SQ_RECORDER.setText("");
            } else {
                VC_SQ_RECORDER.setText(resultBean.getData().get(0).getVc_sq_recorder().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_inspected_unit()==null) {
                VC_SQ_INSPECTED_UNIT.setText("");
            } else {
                VC_SQ_INSPECTED_UNIT.setText(resultBean.getData().get(0).getVc_sq_inspected_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_code_number()==null) {
                VC_SQ_CODE_NUMBER.setText("");
            } else {
                VC_SQ_CODE_NUMBER.setText(resultBean.getData().get(0).getVc_sq_code_number().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_legal_representative()==null) {
                VC_SQ_LEGAL_REPRESENTATIVE.setText("");
            } else {
                VC_SQ_LEGAL_REPRESENTATIVE.setText(resultBean.getData().get(0).getVc_sq_legal_representative().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_legal_id()==null) {
                VC_SQ_LEGAL_ID.setText("");
            } else {
                VC_SQ_LEGAL_ID.setText(resultBean.getData().get(0).getVc_sq_legal_id().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_site_supervisor()==null) {
                VC_SQ_SITE_SUPERVISOR.setText("");
            } else {
                VC_SQ_SITE_SUPERVISOR.setText(resultBean.getData().get(0).getVc_sq_site_supervisor().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_site_id()==null) {
                VC_SQ_SITE_ID.setText("");
            } else {
                VC_SQ_SITE_ID.setText(resultBean.getData().get(0).getVc_sq_site_id().toString());
            }
            if (resultBean.getData().get(0).getNb_sq_age()==null) {
                DT_SQ_AGE.setText("");
            } else {
                DT_SQ_AGE.setText(resultBean.getData().get(0).getNb_sq_age().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_work_unit()==null) {
                VC_SQ_WORK_UNIT.setText("");
            } else {
                VC_SQ_WORK_UNIT.setText(resultBean.getData().get(0).getVc_sq_work_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_post()==null) {
                VC_SQ_POST.setText("");
            } else {
                VC_SQ_POST.setText(resultBean.getData().get(0).getVc_sq_post().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_relationship()==null) {
                VC_SQ_RELATIONSHIP.setText("");
            } else {
                VC_SQ_RELATIONSHIP.setText(resultBean.getData().get(0).getVc_sq_relationship().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_address()==null) {
                VC_SQ_ADDRESS.setText("");
            } else {
                VC_SQ_ADDRESS.setText(resultBean.getData().get(0).getVc_sq_address().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_telephone()==null) {
                VC_SQ_TELEPHONE.setText("");
            } else {
                VC_SQ_TELEPHONE.setText(resultBean.getData().get(0).getVc_sq_telephone().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_postal_code()==null) {
                VC_SQ_POSTAL_CODE.setText("");
            } else {
                VC_SQ_POSTAL_CODE.setText(resultBean.getData().get(0).getVc_sq_postal_code().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_other_people()==null) {
                VC_SQ_OTHER_PEOPLE.setText("");
            } else {
                VC_SQ_OTHER_PEOPLE.setText(resultBean.getData().get(0).getVc_sq_other_people().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_unit_name()==null) {
                VC_SQ_UNIT_NAME.setText("");
            } else {
                VC_SQ_UNIT_NAME.setText(resultBean.getData().get(0).getVc_sq_unit_name().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_hbdwlx()==null) {
                VC_SQ_HBDWLX.setText("");
            } else {
                VC_SQ_HBDWLX.setText(resultBean.getData().get(0).getCh_sq_hbdwlx().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_supervision_type()==null) {
                CH_SQ_SUPERVISION_TYPE.setText("");
            } else {
                CH_SQ_SUPERVISION_TYPE.setText(resultBean.getData().get(0).getCh_sq_supervision_type().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_szs()==null) {
                VC_SQ_SZS.setText("");
            } else {
                VC_SQ_SZS.setText(resultBean.getData().get(0).getVc_sq_szs().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_szx()==null) {
                VC_SQ_SZX.setText("");
            } else {
                VC_SQ_SZX.setText(resultBean.getData().get(0).getVc_sq_szx().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_szz()==null) {
                VC_SQ_SZZ.setText("");
            } else {
                VC_SQ_SZZ.setText(resultBean.getData().get(0).getVc_sq_szz().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_szxac()==null) {
                VC_SQ_SZXAC.setText("");
            } else {
                VC_SQ_SZXAC.setText(resultBean.getData().get(0).getVc_sq_szxac().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_gyyq()==null) {
                VC_SQ_GYYQ.setText("");
            } else {
                VC_SQ_GYYQ.setText(resultBean.getData().get(0).getVc_sq_gyyq().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_pq()==null) {
                VC_SQ_PQ.setText("");
            } else {
                VC_SQ_PQ.setText(resultBean.getData().get(0).getVc_sq_pq().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_xyysjcp()==null) {
                VC_SQ_XYYSJCP.setText("");
            } else {
                VC_SQ_XYYSJCP.setText(resultBean.getData().get(0).getVc_sq_xyysjcp().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_sjcl()==null) {
                VC_SQ_SJCL.setText("");
            } else {
                VC_SQ_SJCL.setText(resultBean.getData().get(0).getVc_sq_sjcl().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_jksbyys()==null) {
                VC_SQ_JKSBYYS.setText("");
            } else {
                VC_SQ_JKSBYYS.setText(resultBean.getData().get(0).getVc_sq_jksbyys().toString());
            }
            if (resultBean.getData().get(0).getDt_sq_azsj()==null) {
                DT_SQ_AZSJ.setText("");
            } else {
                DT_SQ_AZSJ.setText(resultBean.getData().get(0).getDt_sq_azsj().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfjyjcbg()==null) {
                CH_SQ_SFJYJCBG.setText("");
            } else {
                CH_SQ_SFJYJCBG.setText(resultBean.getData().get(0).getCh_sq_sfjyjcbg().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfjbhbcprzzs()==null) {
                CH_SQ_SFJBHBCPRZZS.setText("");
            } else {
                CH_SQ_SFJBHBCPRZZS.setText(resultBean.getData().get(0).getCh_sq_sfjbhbcprzzs().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfysyz()==null) {
                CH_SQ_SFYSYZ.setText("");
            } else {
                CH_SQ_SFYSYZ.setText(resultBean.getData().get(0).getCh_sq_sfysyz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfbayz()==null) {
                CH_SQ_SFBAYZ.setText("");
            } else {
                CH_SQ_SFBAYZ.setText(resultBean.getData().get(0).getCh_sq_sfbayz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfshyi()==null) {
                CH_SQ_SFSHYI.setText("");
            } else {
                CH_SQ_SFSHYI.setText(resultBean.getData().get(0).getCh_sq_sfshyi().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfwypydczgdqy()==null) {
                CH_SQ_SFWYPYDCZGDQY.setText("");
            } else {
                CH_SQ_SFWYPYDCZGDQY.setText(resultBean.getData().get(0).getCh_sq_sfwypydczgdqy().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sffhbz()==null) {
                CH_SQ_SFFHBZ.setText("");
            } else {
                CH_SQ_SFFHBZ.setText(resultBean.getData().get(0).getCh_sq_sffhbz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_cydsfbkwtdmbw()==null) {
                CH_SQ_CYDSFBKWTDMBW.setText("");
            } else {
                CH_SQ_CYDSFBKWTDMBW.setText(resultBean.getData().get(0).getCh_sq_cydsfbkwtdmbw().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_qgsfdyhg()==null) {
                CH_SQ_QGSFDYHG.setText("");
            } else {
                CH_SQ_QGSFDYHG.setText(resultBean.getData().get(0).getCh_sq_qgsfdyhg().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfwyzpqgs()==null) {
                CH_SQ_SFWYZPQGS.setText("");
            } else {
                CH_SQ_SFWYZPQGS.setText(resultBean.getData().get(0).getCh_sq_sfwyzpqgs().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfmzgztj()==null) {
                CH_SQ_SFMZGZTJ.setText("");
            } else {
                CH_SQ_SFMZGZTJ.setText(resultBean.getData().get(0).getCh_sq_sfmzgztj().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfzbayxq()==null) {
                CH_SQ_SFZBAYXQ.setText("");
            } else {
                CH_SQ_SFZBAYXQ.setText(resultBean.getData().get(0).getCh_sq_sfzbayxq().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfyzsxf()==null) {
                CH_SQ_SFYZSXF.setText("");
            } else {
                CH_SQ_SFYZSXF.setText(resultBean.getData().get(0).getCh_sq_sfyzsxf().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_ndzlsfbaxf()==null) {
                CH_SQ_NDZLSFBAXF.setText("");
            } else {
                CH_SQ_NDZLSFBAXF.setText(resultBean.getData().get(0).getCh_sq_ndzlsfbaxf().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_4_ndzlsfbaxf_qtsm()==null) {
                CH_SQ_4_NDZLSFBAXF_QTSM.setText("");
            } else {
                CH_SQ_4_NDZLSFBAXF_QTSM.setText(resultBean.getData().get(0).getCh_sq_4_ndzlsfbaxf_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfzwdsrwbgxx()==null) {
                CH_SQ_SFZWDSRWBGXX.setText("");
            } else {
                CH_SQ_SFZWDSRWBGXX.setText(resultBean.getData().get(0).getCh_sq_sfzwdsrwbgxx().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_wdsffhyq()==null) {
                CH_SQ_WDSFFHYQ.setText("");
            } else {
                CH_SQ_WDSFFHYQ.setText(resultBean.getData().get(0).getCh_sq_wdsffhyq().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfymxat()==null) {
                CH_SQ_SFYMXAT.setText("");
            } else {
                CH_SQ_SFYMXAT.setText(resultBean.getData().get(0).getCh_sq_sfymxat().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_wdsfdy120ssd()==null) {
                CH_SQ_WDSFDY120SSD.setText("");
            } else {
                CH_SQ_WDSFDY120SSD.setText(resultBean.getData().get(0).getCh_sq_wdsfdy120ssd().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_4_wdsfdy120ssd_qtsm()==null) {
                CH_SQ_4_WDSFDY120SSD_QTSM.setText("");
            } else {
                CH_SQ_4_WDSFDY120SSD_QTSM.setText(resultBean.getData().get(0).getCh_sq_4_wdsfdy120ssd_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfjbxgzz()==null) {
                CH_SQ_SFJBXGZZ.setText("");
            } else {
                CH_SQ_SFJBXGZZ.setText(resultBean.getData().get(0).getCh_sq_sfjbxgzz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_fcxtyysjsfzc()==null) {
                CH_SQ_FCXTYYSJSFZC.setText("");
            } else {
                CH_SQ_FCXTYYSJSFZC.setText(resultBean.getData().get(0).getCh_sq_fcxtyysjsfzc().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sffhyqsmsyq()==null) {
                CH_SQ_SFFHYQSMSYQ.setText("");
            } else {
                CH_SQ_SFFHYQSMSYQ.setText(resultBean.getData().get(0).getCh_sq_sffhyqsmsyq().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_qsfljsfzc()==null) {
                CH_SQ_QSFLJSFZC.setText("");
            } else {
                CH_SQ_QSFLJSFZC.setText(resultBean.getData().get(0).getCh_sq_qsfljsfzc().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_lnwdsfyz()==null) {
                CH_SQ_LNWDSFYZ.setText("");
            } else {
                CH_SQ_LNWDSFYZ.setText(resultBean.getData().get(0).getCh_sq_lnwdsfyz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_lxsfbs()==null) {
                CH_SQ_LXSFBS.setText("");
            } else {
                CH_SQ_LXSFBS.setText(resultBean.getData().get(0).getCh_sq_lxsfbs().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_ywlnps()==null) {
                CH_SQ_YWLNPS.setText("");
            } else {
                CH_SQ_YWLNPS.setText(resultBean.getData().get(0).getCh_sq_ywlnps().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_4_ywlnps_qtsm()==null) {
                CH_SQ_4_YWLNPS_QTSM.setText("");
            } else {
                CH_SQ_4_YWLNPS_QTSM.setText(resultBean.getData().get(0).getCh_sq_4_ywlnps_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_gxsfcrdl()==null) {
                CH_SQ_GXSFCRDL.setText("");
            } else {
                CH_SQ_GXSFCRDL.setText(resultBean.getData().get(0).getCh_sq_gxsfcrdl().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_jksssjsffhlj()==null) {
                CH_SQ_JKSSSJSFFHLJ.setText("");
            } else {
                CH_SQ_JKSSSJSFFHLJ.setText(resultBean.getData().get(0).getCh_sq_jksssjsffhlj().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_wjksj()==null) {
                CH_SQ_WJKSJ.setText("");
            } else {
                CH_SQ_WJKSJ.setText(resultBean.getData().get(0).getCh_sq_wjksj().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfcqxfbd()==null) {
                CH_SQ_SFCQXFBD.setText("");
            } else {
                CH_SQ_SFCQXFBD.setText(resultBean.getData().get(0).getCh_sq_sfcqxfbd().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_jksjwcsfcgzdfw()==null) {
                CH_SQ_JKSJWCSFCGZDFW.setText("");
            } else {
                CH_SQ_JKSJWCSFCGZDFW.setText(resultBean.getData().get(0).getCh_sq_jksjwcsfcgzdfw().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_mghjsjpcsfdybfz1()==null) {
                CH_SQ_MGHJSJPCSFDYBFZ1.setText("");
            } else {
                CH_SQ_MGHJSJPCSFDYBFZ1.setText(resultBean.getData().get(0).getCh_sq_mghjsjpcsfdybfz1().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_ss_4_mghjsjpcsfdybfz1_qt()==null) {
                VC_SQ_SS_4_MGHJSJPCSFDYBFZ1_QT.setText("");
            } else {
                VC_SQ_SS_4_MGHJSJPCSFDYBFZ1_QT.setText(resultBean.getData().get(0).getVc_sq_ss_4_mghjsjpcsfdybfz1_qt().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_jkyqsfzcyz()==null) {
                CH_SQ_JKYQSFZCYZ.setText("");
            } else {
                CH_SQ_JKYQSFZCYZ.setText(resultBean.getData().get(0).getCh_sq_jkyqsfzcyz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfwjpztyxz()==null) {
                CH_SQ_SFWJPZTYXZ.setText("");
            } else {
                CH_SQ_SFWJPZTYXZ.setText(resultBean.getData().get(0).getCh_sq_sfwjpztyxz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfayqjxsydbsy()==null) {
                CH_SQ_SFAYQJXSYDBSY.setText("");
            } else {
                CH_SQ_SFAYQJXSYDBSY.setText(resultBean.getData().get(0).getCh_sq_sfayqjxsydbsy().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfczsslcxz()==null) {
                CH_SQ_SFCZSSLCXZ.setText("");
            } else {
                CH_SQ_SFCZSSLCXZ.setText(resultBean.getData().get(0).getCh_sq_sfczsslcxz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfczjctjczbh()==null) {
                CH_SQ_SFCZJCTJCZBH.setText("");
            } else {
                CH_SQ_SFCZJCTJCZBH.setText(resultBean.getData().get(0).getCh_sq_sfczjctjczbh().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_nzgsygdbyz()==null) {
                CH_SQ_NZGSYGDBYZ.setText("");
            } else {
                CH_SQ_NZGSYGDBYZ.setText(resultBean.getData().get(0).getCh_sq_nzgsygdbyz().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_4_sfczjctjczbh_qtsm()==null){
                VC_SQ_4_SFCZJCTJCZBH_QTSM.setText("");
            } else {
                VC_SQ_4_SFCZJCTJCZBH_QTSM.setText(resultBean.getData().get(0).getVc_sq_4_sfczjctjczbh_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_jkxtsfjhbbmxy()==null){
                CH_SQ_JKXTSFJHBBMXY.setText("");
            } else {
                CH_SQ_JKXTSFJHBBMXY.setText(resultBean.getData().get(0).getCh_sq_jkxtsfjhbbmxy().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_xydw()==null){
                VC_SQ_XYDW.setText("");
            } else {
                VC_SQ_XYDW.setText(resultBean.getData().get(0).getVc_sq_xydw().toString());
            }
            if (resultBean.getData().get(0).getDt_sq_xysj()==null){
                DT_SQ_XYSJ.setText("");
            } else {
                DT_SQ_XYSJ.setText(resultBean.getData().get(0).getDt_sq_xysj().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfjhbbmyxxsh()==null){
                CH_SQ_SFJHBBMYXXSH.setText("");
            } else {
                CH_SQ_SFJHBBMYXXSH.setText(resultBean.getData().get(0).getCh_sq_sfjhbbmyxxsh().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_shdw()==null){
                VC_SQ_SHDW.setText("");
            } else {
                VC_SQ_SHDW.setText(resultBean.getData().get(0).getVc_sq_shdw().toString());
            }
            if (resultBean.getData().get(0).getDt_sq_shsj()==null){
                DT_SQ_SHSJ.setText("");
            } else {
                DT_SQ_SHSJ.setText(resultBean.getData().get(0).getDt_sq_shsj().toString());
            }
            if (resultBean.getData().get(0).getDt_sq_xcshsj()==null){
                DT_SQ_XCSHSJ.setText("");
            } else {
                DT_SQ_XCSHSJ.setText(resultBean.getData().get(0).getDt_sq_xcshsj().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_jksssfyhbbmlw()==null){
                CH_SQ_JKSSSFYHBBMLW.setText("");
            } else {
                CH_SQ_JKSSSFYHBBMLW.setText(resultBean.getData().get(0).getCh_sq_jksssfyhbbmlw().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_zdlww()==null){
                CH_SQ_ZDLWW.setText("");
            } else {
                CH_SQ_ZDLWW.setText(resultBean.getData().get(0).getCh_sq_zdlww().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sjsfnayqzccs()==null){
                CH_SQ_SJSFNAYQZCCS.setText("");
            } else {
                CH_SQ_SJSFNAYQZCCS.setText(resultBean.getData().get(0).getCh_sq_sjsfnayqzccs().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_cssjyjksjsfyz()==null){
                CH_SQ_CSSJYJKSJSFYZ.setText("");
            } else {
                CH_SQ_CSSJYJKSJSFYZ.setText(resultBean.getData().get(0).getCh_sq_cssjyjksjsfyz().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_lsshsfnbc12gyys()==null){
                CH_SQ_LSSHSFNBC12GYYS.setText("");
            } else {
                CH_SQ_LSSHSFNBC12GYYS.setText(resultBean.getData().get(0).getCh_sq_lsshsfnbc12gyys().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_lsqssfnayqbc6gyys()==null){
                CH_SQ_LSQSSFNAYQBC6GYYS.setText("");
            } else {
                CH_SQ_LSQSSFNAYQBC6GYYS.setText(resultBean.getData().get(0).getCh_sq_lsqssfnayqbc6gyys().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_ywms()==null){
                CH_SQ_YWMS.setText("");
            } else {
                CH_SQ_YWMS.setText(resultBean.getData().get(0).getCh_sq_ywms().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfayqjxsydbsy()==null){
                CH_SQ_SFJXDSFYW.setText("");
            } else {
                CH_SQ_SFJXDSFYW.setText(resultBean.getData().get(0).getCh_sq_sfayqjxsydbsy().toString());
            }
            if (resultBean.getData().get(0).getVc_sq_ywdw()==null){
                VC_SQ_YWDW.setText("");
            } else {
                VC_SQ_YWDW.setText(resultBean.getData().get(0).getVc_sq_ywdw().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_sfczsg()==null){
                CH_SQ_SFCZSG.setText("");
            } else {
                CH_SQ_SFCZSG.setText(resultBean.getData().get(0).getCh_sq_sfczsg().toString());
            }
            if (resultBean.getData().get(0).getCh_sq_ywjltzsffhgd()==null){
                CH_SQ_YWJLTZSFFHGD.setText("");
            } else {
                CH_SQ_YWJLTZSFFHGD.setText(resultBean.getData().get(0).getCh_sq_ywjltzsffhgd().toString());
            }
            if (resultBean.getData().get(0).getCl_sq_qthbbmjc()==null){
                CL_SQ_QTHBBMJC.setText("");
            } else {
                CL_SQ_QTHBBMJC.setText(resultBean.getData().get(0).getCl_sq_qthbbmjc().toString());
            }
            if (resultBean.getData().get(0).getCl_sq_czzywt()==null){
                CL_SQ_CZZYWT.setText("");
            } else {
                CL_SQ_CZZYWT.setText(resultBean.getData().get(0).getCl_sq_czzywt().toString());
            }
            if (resultBean.getData().get(0).getCl_sq_jcyq()==null){
                CL_SQ_JCYQ.setText("");
            } else {
                CL_SQ_JCYQ.setText(resultBean.getData().get(0).getCl_sq_jcyq().toString());
            }

        } else {
            Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
        }
    }
}

