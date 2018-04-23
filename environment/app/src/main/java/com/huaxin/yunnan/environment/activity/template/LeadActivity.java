package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.LeadBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_QC_INFO;

/**
 * 11、铅冶炼行业现场监察记录
 */
public class LeadActivity extends BaseActicity implements View.OnClickListener, CallBack {

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
    private TextView VC_SZXZC;
    private TextView VC_GYYQ;
    private TextView VC_PQ;
    private TextView CH_JCXCZT;
    private TextView VC_QYCP;
    private TextView VC_CQCL;
    private TextView VC_DQCL;
    private TextView VC_LSCL;
    private TextView VC_QTCL;
    private TextView VC_SCZYYFL;
    private TextView VC_SCZYYFL2;
    private TextView VC_QTSCGY;
    private TextView VC_CQJLSCGY;
    private TextView VC_QTSCGY2;
    private TextView VC_LSSCGY;
    private TextView VC_ZYSCZZJSB;
    private TextView CH_SFYGYYQJS;
    private TextView VC_BFDY;
    private TextView CH_SFZTMZYQ;
    private TextView VC_WDDXMS;
    private TextView VC_HPBZDW;
    private TextView DT_HPBZSJ;
    private TextView VC_HPSPDW;
    private TextView DT_HPSPSJ;
    private TextView VC_HPSPWH;
    private TextView VC_SSCPFDW;
    private TextView DT_SSCPFSJ;
    private TextView VC_SSCPFWH;
    private TextView VC_HBJGYSDW;
    private TextView DT_HBJGYSSJ;
    private TextView VC_HBJGYSWH;
    private TextView CH_SFQZBAGDPW;
    private TextView CH_SFJXPWDJ;
    private TextView CH_SFZEJNWF;
    private TextView VC_SYNJNPWF;
    private TextView vc_yjnpwf;
    private TextView vc_wjnyy;
    private TextView vc_wsjsxfs;
    private TextView vc_tzwrw;
    private TextView vc_sjcsl;
    private TextView CH_SFPTJSWSCLZ;
    private TextView VC_WSCLL;
    private TextView CH_FSSFWP;
    private TextView CH_FSCLSFYBG;
    private TextView VC_WSCLL2;
    private TextView CH_FSFLFS;
    private TextView CH_FSTPFS;
    private TextView VC_BGQKSM;
    private TextView VC_ZYWXFW;
    private TextView VC_CSL1;
    private TextView VC_CZCS1;
    private TextView VC_CSL2;
    private TextView VC_CZCS2;
    private TextView VC_CSL3;
    private TextView VC_CZCS3;
    private TextView VC_CSL4;
    private TextView VC_CZCS4;
    private TextView VC_CSL5;
    private TextView VC_CZCS5;
    private TextView VC_CSL6;
    private TextView VC_CZCS6;
    private TextView VC_CSL7;
    private TextView VC_CZCS7;
    private TextView VC_CSL8;
    private TextView VC_CZCS8;
    private TextView VC_QTWXFW;
    private TextView VC_CSL;
    private TextView VC_CZCS;
    private TextView CH_QTWXFWTZSFZQGF;
    private TextView CH_CZQKSFSB;
    private TextView VC_WSBDYNX;
    private TextView CH_SFSYBS;
    private TextView CH_SFFHCCGF;
    private TextView CH_LSCFSFCGYN;
    private TextView CH_SFJYYJDC;
    private TextView CH_SFZXLDZD;
    private TextView CH_YSCSFYZZ;
    private TextView VC_YSL;
    private TextView VC_PC;
    private TextView CH_JSDWSFYZZ;
    private TextView VC_SJCZFS;
    private TextView VC_QTYBGF;
    private TextView CH_SFGFCC;
    private TextView CH_ZHLYCSSFFHHPYQ;
    private TextView VC_CQFS;
    private TextView VC_FQCSHJ;
    private TextView CH_SFPTFQZLSS;
    private TextView VC_WPTJSSSMC;
    private TextView CH_SFCB;
    private TextView VC_CBYZJCZW;
    private TextView VC_JCDW;
    private TextView DT_JCSJ;
    private TextView CH_ZXJCZZSFAZ;
    private TextView DT_AZSJ;
    private TextView CH_SFLW;
    private TextView CH_SFYXZC;
    private TextView CH_SFJGXY;
    private TextView dt_xysj;
    private TextView vc_zxjcsjxsw;
    private TextView CH_SFCQJZ;
    private TextView VC_WSFHJL;
    private TextView CH_SFCQJZ2;
    private TextView DT_JCSJ2;
    private TextView VC_WSFHJL2;
    private TextView CH_SFLSCS;
    private TextView CH_WLSQKMS;
    private TextView CH_SFBZTFYA;
    private TextView CH_SFDYAPG;
    private TextView CH_SFJXNDYL;
    private TextView CH_SFCBWZ;
    private TextView CL_QTHBBMJCQK;
    private TextView CL_CZZYWT;
    private TextView CL_JCYQ;
    private TextView VC_WPTJSDSSW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead);
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_QC_INFO, LeadBean.class, this, yNProgressDialog);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("铅冶炼行业现场监察记录");

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
        VC_SZXZC = (TextView) findViewById(R.id.VC_SZXZC);
        VC_SZXZC.setOnClickListener(this);
        VC_GYYQ = (TextView) findViewById(R.id.VC_GYYQ);
        VC_GYYQ.setOnClickListener(this);
        VC_PQ = (TextView) findViewById(R.id.VC_PQ);
        VC_PQ.setOnClickListener(this);
        CH_JCXCZT = (TextView) findViewById(R.id.CH_JCXCZT);
        CH_JCXCZT.setOnClickListener(this);
        VC_QYCP = (TextView) findViewById(R.id.VC_QYCP);
        VC_QYCP.setOnClickListener(this);
        VC_CQCL = (TextView) findViewById(R.id.VC_CQCL);
        VC_CQCL.setOnClickListener(this);
        VC_DQCL = (TextView) findViewById(R.id.VC_DQCL);
        VC_DQCL.setOnClickListener(this);
        VC_LSCL = (TextView) findViewById(R.id.VC_LSCL);
        VC_LSCL.setOnClickListener(this);
        VC_QTCL = (TextView) findViewById(R.id.VC_QTCL);
        VC_QTCL.setOnClickListener(this);
        VC_SCZYYFL = (TextView) findViewById(R.id.VC_SCZYYFL);
        VC_SCZYYFL.setOnClickListener(this);
        VC_SCZYYFL2 = (TextView) findViewById(R.id.VC_SCZYYFL2);
        VC_SCZYYFL2.setOnClickListener(this);
        VC_QTSCGY = (TextView) findViewById(R.id.VC_QTSCGY);
        VC_QTSCGY.setOnClickListener(this);
        VC_CQJLSCGY = (TextView) findViewById(R.id.VC_CQJLSCGY);
        VC_CQJLSCGY.setOnClickListener(this);
        VC_QTSCGY2 = (TextView) findViewById(R.id.VC_QTSCGY2);
        VC_QTSCGY2.setOnClickListener(this);
        VC_LSSCGY = (TextView) findViewById(R.id.VC_LSSCGY);
        VC_LSSCGY.setOnClickListener(this);
        VC_ZYSCZZJSB = (TextView) findViewById(R.id.VC_ZYSCZZJSB);
        VC_ZYSCZZJSB.setOnClickListener(this);
        CH_SFYGYYQJS = (TextView) findViewById(R.id.CH_SFYGYYQJS);
        CH_SFYGYYQJS.setOnClickListener(this);
        VC_BFDY = (TextView) findViewById(R.id.VC_BFDY);
        VC_BFDY.setOnClickListener(this);
        CH_SFZTMZYQ = (TextView) findViewById(R.id.CH_SFZTMZYQ);
        CH_SFZTMZYQ.setOnClickListener(this);
        VC_WDDXMS = (TextView) findViewById(R.id.VC_WDDXMS);
        VC_WDDXMS.setOnClickListener(this);
        VC_HPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
        VC_HPBZDW.setOnClickListener(this);
        DT_HPBZSJ = (TextView) findViewById(R.id.DT_HPBZSJ);
        DT_HPBZSJ.setOnClickListener(this);
        VC_HPSPDW = (TextView) findViewById(R.id.VC_HPSPDW);
        VC_HPSPDW.setOnClickListener(this);
        DT_HPSPSJ = (TextView) findViewById(R.id.DT_HPSPSJ);
        DT_HPSPSJ.setOnClickListener(this);
        VC_HPSPWH = (TextView) findViewById(R.id.VC_HPSPWH);
        VC_HPSPWH.setOnClickListener(this);
        VC_SSCPFDW = (TextView) findViewById(R.id.VC_SSCPFDW);
        VC_SSCPFDW.setOnClickListener(this);
        DT_SSCPFSJ = (TextView) findViewById(R.id.DT_SSCPFSJ);
        DT_SSCPFSJ.setOnClickListener(this);
        VC_SSCPFWH = (TextView) findViewById(R.id.VC_SSCPFWH);
        VC_SSCPFWH.setOnClickListener(this);
        VC_HBJGYSDW = (TextView) findViewById(R.id.VC_HBJGYSDW);
        VC_HBJGYSDW.setOnClickListener(this);
        DT_HBJGYSSJ = (TextView) findViewById(R.id.DT_HBJGYSSJ);
        DT_HBJGYSSJ.setOnClickListener(this);
        VC_HBJGYSWH = (TextView) findViewById(R.id.VC_HBJGYSWH);
        VC_HBJGYSWH.setOnClickListener(this);
        CH_SFQZBAGDPW = (TextView) findViewById(R.id.CH_SFQZBAGDPW);
        CH_SFQZBAGDPW.setOnClickListener(this);
        CH_SFJXPWDJ = (TextView) findViewById(R.id.CH_SFJXPWDJ);
        CH_SFJXPWDJ.setOnClickListener(this);
        CH_SFZEJNWF = (TextView) findViewById(R.id.CH_SFZEJNWF);
        CH_SFZEJNWF.setOnClickListener(this);
        VC_SYNJNPWF = (TextView) findViewById(R.id.VC_SYNJNPWF);
        VC_SYNJNPWF.setOnClickListener(this);
        vc_yjnpwf = (TextView) findViewById(R.id.vc_yjnpwf);
        vc_yjnpwf.setOnClickListener(this);
        vc_wjnyy = (TextView) findViewById(R.id.vc_wjnyy);
        vc_wjnyy.setOnClickListener(this);
        vc_wsjsxfs = (TextView) findViewById(R.id.vc_wsjsxfs);
        vc_wsjsxfs.setOnClickListener(this);
        vc_tzwrw = (TextView) findViewById(R.id.vc_tzwrw);
        vc_tzwrw.setOnClickListener(this);
        vc_sjcsl = (TextView) findViewById(R.id.vc_sjcsl);
        vc_sjcsl.setOnClickListener(this);
        CH_SFPTJSWSCLZ = (TextView) findViewById(R.id.CH_SFPTJSWSCLZ);
        CH_SFPTJSWSCLZ.setOnClickListener(this);
        VC_WSCLL = (TextView) findViewById(R.id.VC_WSCLL);
        VC_WSCLL.setOnClickListener(this);
        CH_FSSFWP = (TextView) findViewById(R.id.CH_FSSFWP);
        CH_FSSFWP.setOnClickListener(this);
        CH_FSCLSFYBG = (TextView) findViewById(R.id.CH_FSCLSFYBG);
        CH_FSCLSFYBG.setOnClickListener(this);
        VC_WSCLL2 = (TextView) findViewById(R.id.VC_WSCLL2);
        VC_WSCLL2.setOnClickListener(this);
        CH_FSFLFS = (TextView) findViewById(R.id.CH_FSFLFS);
        CH_FSFLFS.setOnClickListener(this);
        CH_FSTPFS = (TextView) findViewById(R.id.CH_FSTPFS);
        CH_FSTPFS.setOnClickListener(this);
        VC_BGQKSM = (TextView) findViewById(R.id.VC_BGQKSM);
        VC_BGQKSM.setOnClickListener(this);
        VC_ZYWXFW = (TextView) findViewById(R.id.VC_ZYWXFW);
        VC_ZYWXFW.setOnClickListener(this);
        VC_CSL1 = (TextView) findViewById(R.id.VC_CSL1);
        VC_CSL1.setOnClickListener(this);
        VC_CZCS1 = (TextView) findViewById(R.id.VC_CZCS1);
        VC_CZCS1.setOnClickListener(this);
        VC_CSL2 = (TextView) findViewById(R.id.VC_CSL2);
        VC_CSL2.setOnClickListener(this);
        VC_CZCS2 = (TextView) findViewById(R.id.VC_CZCS2);
        VC_CZCS2.setOnClickListener(this);
        VC_CSL3 = (TextView) findViewById(R.id.VC_CSL3);
        VC_CSL3.setOnClickListener(this);
        VC_CZCS3 = (TextView) findViewById(R.id.VC_CZCS3);
        VC_CZCS3.setOnClickListener(this);
        VC_CSL4 = (TextView) findViewById(R.id.VC_CSL4);
        VC_CSL4.setOnClickListener(this);
        VC_CZCS4 = (TextView) findViewById(R.id.VC_CZCS4);
        VC_CZCS4.setOnClickListener(this);
        VC_CSL5 = (TextView) findViewById(R.id.VC_CSL5);
        VC_CSL5.setOnClickListener(this);
        VC_CZCS5 = (TextView) findViewById(R.id.VC_CZCS5);
        VC_CZCS5.setOnClickListener(this);
        VC_CSL6 = (TextView) findViewById(R.id.VC_CSL6);
        VC_CSL6.setOnClickListener(this);
        VC_CZCS6 = (TextView) findViewById(R.id.VC_CZCS6);
        VC_CZCS6.setOnClickListener(this);
        VC_CSL7 = (TextView) findViewById(R.id.VC_CSL7);
        VC_CSL7.setOnClickListener(this);
        VC_CZCS7 = (TextView) findViewById(R.id.VC_CZCS7);
        VC_CZCS7.setOnClickListener(this);
        VC_CSL8 = (TextView) findViewById(R.id.VC_CSL8);
        VC_CSL8.setOnClickListener(this);
        VC_CZCS8 = (TextView) findViewById(R.id.VC_CZCS8);
        VC_CZCS8.setOnClickListener(this);
        VC_QTWXFW = (TextView) findViewById(R.id.VC_QTWXFW);
        VC_QTWXFW.setOnClickListener(this);
        VC_CSL = (TextView) findViewById(R.id.VC_CSL);
        VC_CSL.setOnClickListener(this);
        VC_CZCS = (TextView) findViewById(R.id.VC_CZCS);
        VC_CZCS.setOnClickListener(this);
        CH_QTWXFWTZSFZQGF = (TextView) findViewById(R.id.CH_QTWXFWTZSFZQGF);
        CH_QTWXFWTZSFZQGF.setOnClickListener(this);
        CH_CZQKSFSB = (TextView) findViewById(R.id.CH_CZQKSFSB);
        CH_CZQKSFSB.setOnClickListener(this);
        VC_WSBDYNX = (TextView) findViewById(R.id.VC_WSBDYNX);
        VC_WSBDYNX.setOnClickListener(this);
        CH_SFSYBS = (TextView) findViewById(R.id.CH_SFSYBS);
        CH_SFSYBS.setOnClickListener(this);
        CH_SFFHCCGF = (TextView) findViewById(R.id.CH_SFFHCCGF);
        CH_SFFHCCGF.setOnClickListener(this);
        CH_LSCFSFCGYN = (TextView) findViewById(R.id.CH_LSCFSFCGYN);
        CH_LSCFSFCGYN.setOnClickListener(this);
        CH_SFJYYJDC = (TextView) findViewById(R.id.CH_SFJYYJDC);
        CH_SFJYYJDC.setOnClickListener(this);
        CH_SFZXLDZD = (TextView) findViewById(R.id.CH_SFZXLDZD);
        CH_SFZXLDZD.setOnClickListener(this);
        CH_YSCSFYZZ = (TextView) findViewById(R.id.CH_YSCSFYZZ);
        CH_YSCSFYZZ.setOnClickListener(this);
        VC_YSL = (TextView) findViewById(R.id.VC_YSL);
        VC_YSL.setOnClickListener(this);
        VC_PC = (TextView) findViewById(R.id.VC_PC);
        VC_PC.setOnClickListener(this);
        CH_JSDWSFYZZ = (TextView) findViewById(R.id.CH_JSDWSFYZZ);
        CH_JSDWSFYZZ.setOnClickListener(this);
        VC_SJCZFS = (TextView) findViewById(R.id.VC_SJCZFS);
        VC_SJCZFS.setOnClickListener(this);
        VC_QTYBGF = (TextView) findViewById(R.id.VC_QTYBGF);
        VC_QTYBGF.setOnClickListener(this);
        CH_SFGFCC = (TextView) findViewById(R.id.CH_SFGFCC);
        CH_SFGFCC.setOnClickListener(this);
        CH_ZHLYCSSFFHHPYQ = (TextView) findViewById(R.id.CH_ZHLYCSSFFHHPYQ);
        CH_ZHLYCSSFFHHPYQ.setOnClickListener(this);
        VC_CQFS = (TextView) findViewById(R.id.VC_CQFS);
        VC_CQFS.setOnClickListener(this);
        VC_FQCSHJ = (TextView) findViewById(R.id.VC_FQCSHJ);
        VC_FQCSHJ.setOnClickListener(this);
        CH_SFPTFQZLSS = (TextView) findViewById(R.id.CH_SFPTFQZLSS);
        CH_SFPTFQZLSS.setOnClickListener(this);
        VC_WPTJSSSMC = (TextView) findViewById(R.id.VC_WPTJSSSMC);
        VC_WPTJSSSMC.setOnClickListener(this);
        CH_SFCB = (TextView) findViewById(R.id.CH_SFCB);
        CH_SFCB.setOnClickListener(this);
        VC_CBYZJCZW = (TextView) findViewById(R.id.VC_CBYZJCZW);
        VC_CBYZJCZW.setOnClickListener(this);
        VC_JCDW = (TextView) findViewById(R.id.VC_JCDW);
        VC_JCDW.setOnClickListener(this);
        DT_JCSJ = (TextView) findViewById(R.id.DT_JCSJ);
        DT_JCSJ.setOnClickListener(this);
        CH_ZXJCZZSFAZ = (TextView) findViewById(R.id.CH_ZXJCZZSFAZ);
        CH_ZXJCZZSFAZ.setOnClickListener(this);
        DT_AZSJ = (TextView) findViewById(R.id.DT_AZSJ);
        DT_AZSJ.setOnClickListener(this);
        CH_SFLW = (TextView) findViewById(R.id.CH_SFLW);
        CH_SFLW.setOnClickListener(this);
        CH_SFYXZC = (TextView) findViewById(R.id.CH_SFYXZC);
        CH_SFYXZC.setOnClickListener(this);
        CH_SFJGXY = (TextView) findViewById(R.id.CH_SFJGXY);
        CH_SFJGXY.setOnClickListener(this);
        dt_xysj = (TextView) findViewById(R.id.dt_xysj);
        dt_xysj.setOnClickListener(this);
        vc_zxjcsjxsw = (TextView) findViewById(R.id.vc_zxjcsjxsw);
        vc_zxjcsjxsw.setOnClickListener(this);
        CH_SFCQJZ = (TextView) findViewById(R.id.CH_SFCQJZ);
        CH_SFCQJZ.setOnClickListener(this);
        VC_WSFHJL = (TextView) findViewById(R.id.VC_WSFHJL);
        VC_WSFHJL.setOnClickListener(this);
        CH_SFCQJZ2 = (TextView) findViewById(R.id.CH_SFCQJZ2);
        CH_SFCQJZ2.setOnClickListener(this);
        DT_JCSJ2 = (TextView) findViewById(R.id.DT_JCSJ2);
        DT_JCSJ2.setOnClickListener(this);
        VC_WSFHJL2 = (TextView) findViewById(R.id.VC_WSFHJL2);
        VC_WSFHJL2.setOnClickListener(this);
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
        VC_WPTJSDSSW = (TextView) findViewById(R.id.VC_WPTJSDSSW);
        VC_WPTJSDSSW.setOnClickListener(this);
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
        LeadBean resultBean = (LeadBean) o;
        if (resultBean.getSuccess().equals("1")) {
            if (resultBean.getData().get(0).getDt_begin_time() == null) {
                DT_BEGIN_TIME.setText("");
            } else {
                DT_BEGIN_TIME.setText(resultBean.getData().get(0).getDt_begin_time().toString());
            }
            if (resultBean.getData().get(0).getDt_end_time() == null) {
                DT_END_TIME.setText("");
            } else {
                DT_END_TIME.setText(resultBean.getData().get(0).getDt_end_time().toString());
            }
            if (resultBean.getData().get(0).getVc_place() == null) {
                VC_PLACE.setText("");
            } else {
                VC_PLACE.setText(resultBean.getData().get(0).getVc_place().toString());
            }
            if (resultBean.getData().get(0).getVc_xaminer() == null) {
                VC_XAMINER.setText("");
            } else {
                VC_XAMINER.setText(resultBean.getData().get(0).getVc_xaminer().toString());
            }
            if (resultBean.getData().get(0).getVc_law_number() == null) {
                VC_LAW_NUMBER.setText("");
            } else {
                VC_LAW_NUMBER.setText(resultBean.getData().get(0).getVc_law_number().toString());
            }
            if (resultBean.getData().get(0).getVc_recorder() == null) {
                VC_RECORDER.setText("");
            } else {
                VC_RECORDER.setText(resultBean.getData().get(0).getVc_recorder().toString());
            }
            if (resultBean.getData().get(0).getVc_sinspected_unit() == null) {
                VC_SINSPECTED_UNIT.setText("");
            } else {
                VC_SINSPECTED_UNIT.setText(resultBean.getData().get(0).getVc_sinspected_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_code_number() == null) {
                VC_CODE_NUMBER.setText("");
            } else {
                VC_CODE_NUMBER.setText(resultBean.getData().get(0).getVc_code_number().toString());
            }
            if (resultBean.getData().get(0).getVc_legal_representative() == null) {
                VC_LEGAL_REPRESENTATIVE.setText("");
            } else {
                VC_LEGAL_REPRESENTATIVE.setText(resultBean.getData().get(0).getVc_legal_representative().toString());
            }
            if (resultBean.getData().get(0).getVc_legal_id() == null) {
                VC_LEGAL_ID.setText("");
            } else {
                VC_LEGAL_ID.setText(resultBean.getData().get(0).getVc_legal_id().toString());
            }
            if (resultBean.getData().get(0).getVc_site_supervisor() == null) {
                VC_SITE_SUPERVISOR.setText("");
            } else {
                VC_SITE_SUPERVISOR.setText(resultBean.getData().get(0).getVc_site_supervisor().toString());
            }
            if (resultBean.getData().get(0).getVc_site_id() == null) {
                VC_SITE_ID.setText("");
            } else {
                VC_SITE_ID.setText(resultBean.getData().get(0).getVc_site_id().toString());
            }
            if (resultBean.getData().get(0).getNb_age() == null) {
                DT_AGE.setText("");
            } else {
                DT_AGE.setText(resultBean.getData().get(0).getNb_age().toString());
            }
            if (resultBean.getData().get(0).getVc_work_unit() == null) {
                VC_WORK_UNIT.setText("");
            } else {
                VC_WORK_UNIT.setText(resultBean.getData().get(0).getVc_work_unit().toString());
            }
            if (resultBean.getData().get(0).getVc_post() == null) {
                VC_POST.setText("");
            } else {
                VC_POST.setText(resultBean.getData().get(0).getVc_post().toString());
            }
            if (resultBean.getData().get(0).getVc_relationship() == null) {
                VC_RELATIONSHIP.setText("");
            } else {
                VC_RELATIONSHIP.setText(resultBean.getData().get(0).getVc_relationship().toString());
            }
            if (resultBean.getData().get(0).getVc_address() == null) {
                VC_ADDRESS.setText("");
            } else {
                VC_ADDRESS.setText(resultBean.getData().get(0).getVc_address().toString());
            }
            if (resultBean.getData().get(0).getVc_telephone() == null) {
                VC_TELEPHONE.setText("");
            } else {
                VC_TELEPHONE.setText(resultBean.getData().get(0).getVc_telephone().toString());
            }
            if (resultBean.getData().get(0).getVc_postal_code() == null) {
                VCPOSTAL_CODE.setText("");
            } else {
                VCPOSTAL_CODE.setText(resultBean.getData().get(0).getVc_postal_code().toString());
            }
            if (resultBean.getData().get(0).getVc_other_people() == null) {
                VC_OTHER_PEOPLE.setText("");
            } else {
                VC_OTHER_PEOPLE.setText(resultBean.getData().get(0).getVc_other_people().toString());
            }
            if (resultBean.getData().get(0).getVc_unit_name() == null) {
                VC_UNIT_NAME.setText("");
            } else {
                VC_UNIT_NAME.setText(resultBean.getData().get(0).getVc_unit_name().toString());
            }
            if (resultBean.getData().get(0).getCh_hbdwlx() == null) {
                VC_HBDWLX.setText("");
            } else {
                VC_HBDWLX.setText(resultBean.getData().get(0).getCh_hbdwlx().toString());
            }
            if (resultBean.getData().get(0).getCh_supervision_type() == null) {
                CH_SUPERVISION_TYPE.setText("");
            } else {
                CH_SUPERVISION_TYPE.setText(resultBean.getData().get(0).getCh_supervision_type().toString());
            }
            if (resultBean.getData().get(0).getCh_sfqrzj() == null) {
                CH_SFQRZJ.setText("");
            } else {
                CH_SFQRZJ.setText(resultBean.getData().get(0).getCh_sfqrzj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfsqhb() == null) {
                CH_SFSQHB.setText("");
            } else {
                CH_SFSQHB.setText(resultBean.getData().get(0).getCh_sfsqhb().toString());
            }
            if (resultBean.getData().get(0).getVc_szs() == null) {
                VC_SZS.setText("");
            } else {
                VC_SZS.setText(resultBean.getData().get(0).getVc_szs().toString());
            }
            if (resultBean.getData().get(0).getVc_szx() == null) {
                VC_SZX.setText("");
            } else {
                VC_SZX.setText(resultBean.getData().get(0).getVc_szx().toString());
            }
            if (resultBean.getData().get(0).getVc_szz() == null) {
                VC_SZZ.setText("");
            } else {
                VC_SZZ.setText(resultBean.getData().get(0).getVc_szz().toString());
            }
            if (resultBean.getData().get(0).getVc_szxzc() == null) {
                VC_SZXZC.setText("");
            } else {
                VC_SZXZC.setText(resultBean.getData().get(0).getVc_szxzc().toString());
            }
            if (resultBean.getData().get(0).getVc_gyyq() == null) {
                VC_GYYQ.setText("");
            } else {
                VC_GYYQ.setText(resultBean.getData().get(0).getVc_gyyq().toString());
            }
            if (resultBean.getData().get(0).getVc_pq() == null) {
                VC_PQ.setText("");
            } else {
                VC_PQ.setText(resultBean.getData().get(0).getVc_pq().toString());
            }
            if (resultBean.getData().get(0).getCh_jcxczt() == null) {
                CH_JCXCZT.setText("");
            } else {
                CH_JCXCZT.setText(resultBean.getData().get(0).getCh_jcxczt().toString());
            }
            if (resultBean.getData().get(0).getVc_qycp() == null) {
                VC_QYCP.setText("");
            } else {
                VC_QYCP.setText(resultBean.getData().get(0).getVc_qycp().toString());
            }
            if (resultBean.getData().get(0).getVc_cqcl() == null) {
                VC_CQCL.setText("");
            } else {
                VC_CQCL.setText(resultBean.getData().get(0).getVc_cqcl().toString());
            }
            if (resultBean.getData().get(0).getVc_dqcl() == null) {
                VC_DQCL.setText("");
            } else {
                VC_DQCL.setText(resultBean.getData().get(0).getVc_dqcl().toString());
            }
            if (resultBean.getData().get(0).getVc_lscl() == null) {
                VC_LSCL.setText("");
            } else {
                VC_LSCL.setText(resultBean.getData().get(0).getVc_lscl().toString());
            }
            if (resultBean.getData().get(0).getVc_qtcl() == null) {
                VC_QTCL.setText("");
            } else {
                VC_QTCL.setText(resultBean.getData().get(0).getVc_qtcl().toString());
            }
            if (resultBean.getData().get(0).getVc_sczyyfl() == null) {
                VC_SCZYYFL.setText("");
            } else {
                VC_SCZYYFL.setText(resultBean.getData().get(0).getVc_sczyyfl().toString());
            }
            if (resultBean.getData().get(0).getVc_sczyyfl2() == null) {
                VC_SCZYYFL2.setText("");
            } else {
                VC_SCZYYFL2.setText(resultBean.getData().get(0).getVc_sczyyfl2().toString());
            }
            if (resultBean.getData().get(0).getVc_qtscgy() == null) {
                VC_QTSCGY.setText("");
            } else {
                VC_QTSCGY.setText(resultBean.getData().get(0).getVc_qtscgy().toString());
            }
            if (resultBean.getData().get(0).getVc_cqjlscgy() == null) {
                VC_CQJLSCGY.setText("");
            } else {
                VC_CQJLSCGY.setText(resultBean.getData().get(0).getVc_cqjlscgy().toString());
            }
            if (resultBean.getData().get(0).getVc_qtscgy2() == null) {
                VC_QTSCGY2.setText("");
            } else {
                VC_QTSCGY2.setText(resultBean.getData().get(0).getVc_qtscgy2().toString());
            }
            if (resultBean.getData().get(0).getVc_lsscgy() == null) {
                VC_LSSCGY.setText("");
            } else {
                VC_LSSCGY.setText(resultBean.getData().get(0).getVc_lsscgy().toString());
            }
            if (resultBean.getData().get(0).getVc_zysczzjsb() == null) {
                VC_ZYSCZZJSB.setText("");
            } else {
                VC_ZYSCZZJSB.setText(resultBean.getData().get(0).getVc_zysczzjsb().toString());
            }
            if (resultBean.getData().get(0).getVc_bfdy() == null) {
                VC_BFDY.setText("");
            } else {
                VC_BFDY.setText(resultBean.getData().get(0).getVc_bfdy().toString());
            }
            if (resultBean.getData().get(0).getCh_sfygyyqjs() == null) {
                CH_SFYGYYQJS.setText("");
            } else {
                CH_SFYGYYQJS.setText(resultBean.getData().get(0).getCh_sfygyyqjs().toString());
            }
            if (resultBean.getData().get(0).getVc_wddxms() == null) {
                VC_WDDXMS.setText("");
            } else {
                VC_WDDXMS.setText(resultBean.getData().get(0).getVc_wddxms().toString());
            }
            if (resultBean.getData().get(0).getVc_hpbzdw() == null) {
                VC_HPBZDW.setText("");
            } else {
                VC_HPBZDW.setText(resultBean.getData().get(0).getVc_hpbzdw().toString());
            }
            if (resultBean.getData().get(0).getDt_hpbzsj() == null) {
                DT_HPBZSJ.setText("");
            } else {
                DT_HPBZSJ.setText(resultBean.getData().get(0).getDt_hpbzsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hpspwh() == null) {
                VC_HPSPDW.setText("");
            } else {
                VC_HPSPDW.setText(resultBean.getData().get(0).getVc_hpspwh().toString());
            }
            if (resultBean.getData().get(0).getDt_hpspsj() == null) {
                DT_HPSPSJ.setText("");
            } else {
                DT_HPSPSJ.setText(resultBean.getData().get(0).getDt_hpspsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hpspwh() == null) {
                VC_HPSPWH.setText("");
            } else {
                VC_HPSPWH.setText(resultBean.getData().get(0).getVc_hpspwh().toString());
            }
            if (resultBean.getData().get(0).getVc_sscpfdw() == null) {
                VC_SSCPFDW.setText("");
            } else {
                VC_SSCPFDW.setText(resultBean.getData().get(0).getVc_sscpfdw().toString());
            }
            if (resultBean.getData().get(0).getDt_sscpfsj() == null) {
                DT_SSCPFSJ.setText("");
            } else {
                DT_SSCPFSJ.setText(resultBean.getData().get(0).getDt_sscpfsj().toString());
            }
            if (resultBean.getData().get(0).getVc_sscpfwh() == null) {
                VC_SSCPFWH.setText("");
            } else {
                VC_SSCPFWH.setText(resultBean.getData().get(0).getVc_sscpfwh().toString());
            }
            if (resultBean.getData().get(0).getVc_hbjgysdw() == null) {
                VC_HBJGYSDW.setText("");
            } else {
                VC_HBJGYSDW.setText(resultBean.getData().get(0).getVc_hbjgysdw().toString());
            }
            if (resultBean.getData().get(0).getDt_hbjgyssj() == null) {
                DT_HBJGYSSJ.setText("");
            } else {
                DT_HBJGYSSJ.setText(resultBean.getData().get(0).getDt_hbjgyssj().toString());
            }
            if (resultBean.getData().get(0).getVc_hbjgyswh() == null) {
                VC_HBJGYSWH.setText("");
            } else {
                VC_HBJGYSWH.setText(resultBean.getData().get(0).getVc_hbjgyswh().toString());
            }
            if (resultBean.getData().get(0).getCh_sfqzbagdpw() == null) {
                CH_SFQZBAGDPW.setText("");
            } else {
                CH_SFQZBAGDPW.setText(resultBean.getData().get(0).getCh_sfqzbagdpw().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjxpwdj() == null) {
                CH_SFJXPWDJ.setText("");
            } else {
                CH_SFJXPWDJ.setText(resultBean.getData().get(0).getCh_sfjxpwdj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfzejnwf() == null) {
                CH_SFZEJNWF.setText("");
            } else {
                CH_SFZEJNWF.setText(resultBean.getData().get(0).getCh_sfzejnwf().toString());
            }
            if (resultBean.getData().get(0).getVc_wsjsxfs() == null) {
                vc_wsjsxfs.setText("");
            } else {
                vc_wsjsxfs.setText(resultBean.getData().get(0).getVc_wsjsxfs().toString());
            }
            if (resultBean.getData().get(0).getVc_tzwrw() == null) {
                vc_tzwrw.setText("");
            } else {
                vc_tzwrw.setText(resultBean.getData().get(0).getVc_tzwrw().toString());
            }
            if (resultBean.getData().get(0).getVc_sjcsl() == null) {
                vc_sjcsl.setText("");
            } else {
                vc_sjcsl.setText(resultBean.getData().get(0).getVc_sjcsl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfptjswsclz() == null) {
                CH_SFPTJSWSCLZ.setText("");
            } else {
                CH_SFPTJSWSCLZ.setText(resultBean.getData().get(0).getCh_sfptjswsclz().toString());
            }
            if (resultBean.getData().get(0).getVc_wscll() == null) {
                VC_WSCLL.setText("");
            } else {
                VC_WSCLL.setText(resultBean.getData().get(0).getVc_wscll().toString());
            }
            if (resultBean.getData().get(0).getCh_fssfwp() == null) {
                CH_FSSFWP.setText("");
            } else {
                CH_FSSFWP.setText(resultBean.getData().get(0).getCh_fssfwp().toString());
            }
            if (resultBean.getData().get(0).getCh_fsclsfybg() == null) {
                CH_FSCLSFYBG.setText("");
            } else {
                CH_FSCLSFYBG.setText(resultBean.getData().get(0).getCh_fsclsfybg().toString());
            }
            if (resultBean.getData().get(0).getVc_wscll2() == null) {
                VC_WSCLL2.setText("");
            } else {
                VC_WSCLL2.setText(resultBean.getData().get(0).getVc_wscll2().toString());
            }
            if (resultBean.getData().get(0).getCh_fsflfs() == null) {
                CH_FSFLFS.setText("");
            } else {
                CH_FSFLFS.setText(resultBean.getData().get(0).getCh_fsflfs().toString());
            }
            if (resultBean.getData().get(0).getCh_fstpfs() == null) {
                CH_FSTPFS.setText("");
            } else {
                CH_FSTPFS.setText(resultBean.getData().get(0).getCh_fstpfs().toString());
            }
            if (resultBean.getData().get(0).getVc_bgqksm() == null) {
                VC_BGQKSM.setText("");
            } else {
                VC_BGQKSM.setText(resultBean.getData().get(0).getVc_bgqksm().toString());
            }
            if (resultBean.getData().get(0).getVc_zywxfw() == null) {
                VC_ZYWXFW.setText("");
            } else {
                VC_ZYWXFW.setText(resultBean.getData().get(0).getVc_zywxfw().toString());
            }
            if (resultBean.getData().get(0).getVc_csl1() == null) {
                VC_CSL1.setText("");
            } else {
                VC_CSL1.setText(resultBean.getData().get(0).getVc_csl1().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs1() == null) {
                VC_CZCS1.setText("");
            } else {
                VC_CZCS1.setText(resultBean.getData().get(0).getVc_czcs1().toString());
            }
            if (resultBean.getData().get(0).getVc_csl2() == null) {
                VC_CSL2.setText("");
            } else {
                VC_CSL2.setText(resultBean.getData().get(0).getVc_csl2().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs2() == null) {
                VC_CZCS2.setText("");
            } else {
                VC_CZCS2.setText(resultBean.getData().get(0).getVc_czcs2().toString());
            }
            if (resultBean.getData().get(0).getVc_csl3() == null) {
                VC_CSL3.setText("");
            } else {
                VC_CSL3.setText(resultBean.getData().get(0).getVc_csl3().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs3() == null) {
                VC_CZCS3.setText("");
            } else {
                VC_CZCS3.setText(resultBean.getData().get(0).getVc_czcs3().toString());
            }
            if (resultBean.getData().get(0).getVc_csl4() == null) {
                VC_CSL4.setText("");
            } else {
                VC_CSL4.setText(resultBean.getData().get(0).getVc_csl4().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs4() == null) {
                VC_CZCS4.setText("");
            } else {
                VC_CZCS4.setText(resultBean.getData().get(0).getVc_czcs4().toString());
            }
            if (resultBean.getData().get(0).getVc_csl5() == null) {
                VC_CSL5.setText("");
            } else {
                VC_CSL5.setText(resultBean.getData().get(0).getVc_csl5().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs5() == null) {
                VC_CZCS5.setText("");
            } else {
                VC_CZCS5.setText(resultBean.getData().get(0).getVc_czcs5().toString());
            }
            if (resultBean.getData().get(0).getVc_csl6() == null) {
                VC_CSL6.setText("");
            } else {
                VC_CSL6.setText(resultBean.getData().get(0).getVc_csl6().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs6() == null) {
                VC_CZCS6.setText("");
            } else {
                VC_CZCS6.setText(resultBean.getData().get(0).getVc_czcs6().toString());
            }
            if (resultBean.getData().get(0).getVc_csl7() == null) {
                VC_CSL7.setText("");
            } else {
                VC_CSL7.setText(resultBean.getData().get(0).getVc_csl7().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs7() == null) {
                VC_CZCS7.setText("");
            } else {
                VC_CZCS7.setText(resultBean.getData().get(0).getVc_czcs7().toString());
            }
            if (resultBean.getData().get(0).getVc_csl8() == null) {
                VC_CSL8.setText("");
            } else {
                VC_CSL8.setText(resultBean.getData().get(0).getVc_csl8().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs8() == null) {
                VC_CZCS8.setText("");
            } else {
                VC_CZCS8.setText(resultBean.getData().get(0).getVc_czcs8().toString());
            }
            if (resultBean.getData().get(0).getCh_wrfzsffhyq() == null) {
                CH_SFZTMZYQ.setText("");
            } else {
                CH_SFZTMZYQ.setText(resultBean.getData().get(0).getCh_wrfzsffhyq().toString());
            }
            if (resultBean.getData().get(0).getVc_qtwxfw() == null) {
                VC_QTWXFW.setText("");
            } else {
                VC_QTWXFW.setText(resultBean.getData().get(0).getVc_qtwxfw().toString());
            }
            if (resultBean.getData().get(0).getVc_csl() == null) {
                VC_CSL.setText("");
            } else {
                VC_CSL.setText(resultBean.getData().get(0).getVc_csl().toString());
            }
            if (resultBean.getData().get(0).getVc_czcs() == null) {
                VC_CZCS.setText("");
            } else {
                VC_CZCS.setText(resultBean.getData().get(0).getVc_czcs().toString());
            }
            if (resultBean.getData().get(0).getCh_czqksfsb() == null) {
                CH_CZQKSFSB.setText("");
            } else {
                CH_CZQKSFSB.setText(resultBean.getData().get(0).getCh_czqksfsb().toString());
            }
            if (resultBean.getData().get(0).getVc_wsbdynx() == null) {
                VC_WSBDYNX.setText("");
            } else {
                VC_WSBDYNX.setText(resultBean.getData().get(0).getVc_wsbdynx().toString());
            }
            if (resultBean.getData().get(0).getCh_sfsybs() == null) {
                CH_SFSYBS.setText("");
            } else {
                CH_SFSYBS.setText(resultBean.getData().get(0).getCh_sfsybs().toString());
            }
            if (resultBean.getData().get(0).getCh_sffhccgf() == null) {
                CH_SFFHCCGF.setText("");
            } else {
                CH_SFFHCCGF.setText(resultBean.getData().get(0).getCh_sffhccgf().toString());
            }
            if (resultBean.getData().get(0).getCh_lscfsfcgyn() == null) {
                CH_LSCFSFCGYN.setText("");
            } else {
                CH_LSCFSFCGYN.setText(resultBean.getData().get(0).getCh_lscfsfcgyn().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjyyjdc() == null) {
                CH_SFJYYJDC.setText("");
            } else {
                CH_SFJYYJDC.setText(resultBean.getData().get(0).getCh_sfjyyjdc().toString());
            }
            if (resultBean.getData().get(0).getCh_sfzxldzd() == null) {
                CH_SFZXLDZD.setText("");
            } else {
                CH_SFZXLDZD.setText(resultBean.getData().get(0).getCh_sfzxldzd().toString());
            }
            if (resultBean.getData().get(0).getCh_yscsfyzz() == null) {
                CH_YSCSFYZZ.setText("");
            } else {
                CH_YSCSFYZZ.setText(resultBean.getData().get(0).getCh_yscsfyzz().toString());
            }
            if (resultBean.getData().get(0).getVc_ysl() == null) {
                VC_YSL.setText("");
            } else {
                VC_YSL.setText(resultBean.getData().get(0).getVc_ysl().toString());
            }
            if (resultBean.getData().get(0).getVc_pc() == null) {
                VC_PC.setText("");
            } else {
                VC_PC.setText(resultBean.getData().get(0).getVc_pc().toString());
            }
            if (resultBean.getData().get(0).getCh_jsdwsfyzz() == null) {
                CH_JSDWSFYZZ.setText("");
            } else {
                CH_JSDWSFYZZ.setText(resultBean.getData().get(0).getCh_jsdwsfyzz().toString());
            }
            if (resultBean.getData().get(0).getVc_sjczfs() == null) {
                VC_SJCZFS.setText("");
            } else {
                VC_SJCZFS.setText(resultBean.getData().get(0).getVc_sjczfs().toString());
            }
            if (resultBean.getData().get(0).getVc_qtybgf() == null) {
                VC_QTYBGF.setText("");
            } else {
                VC_QTYBGF.setText(resultBean.getData().get(0).getVc_qtybgf().toString());
            }
            if (resultBean.getData().get(0).getCh_sfgfcc() == null) {
                CH_SFGFCC.setText("");
            } else {
                CH_SFGFCC.setText(resultBean.getData().get(0).getCh_sfgfcc().toString());
            }
            if (resultBean.getData().get(0).getCh_zhlycssffhhpyq() == null) {
                CH_ZHLYCSSFFHHPYQ.setText("");
            } else {
                CH_ZHLYCSSFFHHPYQ.setText(resultBean.getData().get(0).getCh_zhlycssffhhpyq().toString());
            }
            if (resultBean.getData().get(0).getVc_cqfs() == null) {
                VC_CQFS.setText("");
            } else {
                VC_CQFS.setText(resultBean.getData().get(0).getVc_cqfs().toString());
            }
            if (resultBean.getData().get(0).getVc_fqcshj() == null) {
                VC_FQCSHJ.setText("");
            } else {
                VC_FQCSHJ.setText(resultBean.getData().get(0).getVc_fqcshj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfptfqzlss() == null) {
                CH_SFPTFQZLSS.setText("");
            } else {
                CH_SFPTFQZLSS.setText(resultBean.getData().get(0).getCh_sfptfqzlss().toString());
            }
            if (resultBean.getData().get(0).getVc_wptjsssmc() == null) {
                VC_WPTJSSSMC.setText("");
            } else {
                VC_WPTJSSSMC.setText(resultBean.getData().get(0).getVc_wptjsssmc().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcb() == null) {
                CH_SFCB.setText("");
            } else {
                CH_SFCB.setText(resultBean.getData().get(0).getCh_sfcb().toString());
            }
            if (resultBean.getData().get(0).getVc_cbyzjczw() == null) {
                VC_CBYZJCZW.setText("");
            } else {
                VC_CBYZJCZW.setText(resultBean.getData().get(0).getVc_cbyzjczw().toString());
            }
            if (resultBean.getData().get(0).getVc_jcdw() == null) {
                VC_JCDW.setText("");
            } else {
                VC_JCDW.setText(resultBean.getData().get(0).getVc_jcdw().toString());
            }
            if (resultBean.getData().get(0).getDt_jcsj() == null) {
                DT_JCSJ.setText("");
            } else {
                DT_JCSJ.setText(resultBean.getData().get(0).getDt_jcsj().toString());
            }
            if (resultBean.getData().get(0).getCh_zxjczzsfaz() == null) {
                CH_ZXJCZZSFAZ.setText("");
            } else {
                CH_ZXJCZZSFAZ.setText(resultBean.getData().get(0).getCh_zxjczzsfaz().toString());
            }
            if (resultBean.getData().get(0).getCh_qtwxfwtzsfzqgf() == null) {
                CH_QTWXFWTZSFZQGF.setText("");
            } else {
                CH_QTWXFWTZSFZQGF.setText(resultBean.getData().get(0).getCh_qtwxfwtzsfzqgf().toString());
            }
            if (resultBean.getData().get(0).getDt_azsj() == null) {
                DT_AZSJ.setText("");
            } else {
                DT_AZSJ.setText(resultBean.getData().get(0).getDt_azsj().toString());
            }
            if (resultBean.getData().get(0).getCh_sflw() == null) {
                CH_SFLW.setText("");
            } else {
                CH_SFLW.setText(resultBean.getData().get(0).getCh_sflw().toString());
            }
            if (resultBean.getData().get(0).getCh_sfyxzc() == null) {
                CH_SFYXZC.setText("");
            } else {
                CH_SFYXZC.setText(resultBean.getData().get(0).getCh_sfyxzc().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjgxy() == null) {
                CH_SFJGXY.setText("");
            } else {
                CH_SFJGXY.setText(resultBean.getData().get(0).getCh_sfjgxy().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcqjz() == null) {
                CH_SFCQJZ.setText("");
            } else {
                CH_SFCQJZ.setText(resultBean.getData().get(0).getCh_sfcqjz().toString());
            }
            if (resultBean.getData().get(0).getVc_wptjsdssw() == null) {
                VC_WPTJSDSSW.setText("");
            } else {
                VC_WPTJSDSSW.setText(resultBean.getData().get(0).getVc_wptjsdssw().toString());
            }
            if (resultBean.getData().get(0).getVc_wsfhjl() == null) {
                VC_WSFHJL.setText("");
            } else {
                VC_WSFHJL.setText(resultBean.getData().get(0).getVc_wsfhjl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcqjz2() == null) {
                CH_SFCQJZ2.setText("");
            } else {
                CH_SFCQJZ2.setText(resultBean.getData().get(0).getCh_sfcqjz2().toString());
            }
            if (resultBean.getData().get(0).getDt_jcsj2() == null) {
                DT_JCSJ2.setText("");
            } else {
                DT_JCSJ2.setText(resultBean.getData().get(0).getDt_jcsj2().toString());
            }
            if (resultBean.getData().get(0).getVc_wsfhjl2() == null) {
                VC_WSFHJL2.setText("");
            } else {
                VC_WSFHJL2.setText(resultBean.getData().get(0).getVc_wsfhjl2().toString());
            }
            if (resultBean.getData().get(0).getCh_sflscs() == null) {
                CH_SFLSCS.setText("");
            } else {
                CH_SFLSCS.setText(resultBean.getData().get(0).getCh_sflscs().toString());
            }
            if (resultBean.getData().get(0).getVc_wlsqkms() == null) {
                CH_WLSQKMS.setText("");
            } else {
                CH_WLSQKMS.setText(resultBean.getData().get(0).getVc_wlsqkms().toString());
            }
            if (resultBean.getData().get(0).getCh_sfbztfya() == null) {
                CH_SFBZTFYA.setText("");
            } else {
                CH_SFBZTFYA.setText(resultBean.getData().get(0).getCh_sfbztfya().toString());
            }
            if (resultBean.getData().get(0).getCh_sfdyapg() == null) {
                CH_SFDYAPG.setText("");
            } else {
                CH_SFDYAPG.setText(resultBean.getData().get(0).getCh_sfdyapg().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjxndyl() == null) {
                CH_SFJXNDYL.setText("");
            } else {
                CH_SFJXNDYL.setText(resultBean.getData().get(0).getCh_sfjxndyl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfcbwz() == null) {
                CH_SFCBWZ.setText("");
            } else {
                CH_SFCBWZ.setText(resultBean.getData().get(0).getCh_sfcbwz().toString());
            }


            if (resultBean.getData().get(0).getCl_qthbbmjcqk() == null) {
                CL_QTHBBMJCQK.setText("");
            } else {
                CL_QTHBBMJCQK.setText(resultBean.getData().get(0).getCl_qthbbmjcqk().toString());
            }
            if (resultBean.getData().get(0).getCl_czzywt() == null) {
                CL_CZZYWT.setText("");
            } else {
                CL_CZZYWT.setText(resultBean.getData().get(0).getCl_czzywt().toString());
            }

            if (resultBean.getData().get(0).getCl_jcyq() == null) {
                CL_JCYQ.setText("");
            } else {
                CL_JCYQ.setText(resultBean.getData().get(0).getCl_jcyq().toString());
            }

        } else {
            Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
        }
    }
}
