package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.TinBeneficationBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_XC_INFO;

/**
 * 7、锡选冶行业现场监察记录
 */
public class TinBeneficationActivity extends BaseActicity implements View.OnClickListener ,CallBack {

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
    private TextView VC_HPZYCP;
    private TextView VC_SJCL;
    private TextView VC_SJCP;
    private TextView VC_SHIJCL;
    private TextView VC_HPSCYLFL;
    private TextView VC_QTSCYLFL;
    private TextView VC_MQSCYLFL;
    private TextView VC_XJKSCGY;
    private TextView VC_XZLSCGY;
    private TextView VC_QTXZLSCGY;
    private TextView VC_XCJCSQYZT;
    private TextView DT_XMCSSJ;
    private TextView DT_LXPFWH2;
    private TextView VC_PZLXDW;
    private TextView VC_LXPFWH;
    private TextView CH_BZLX;
    private TextView VC_HPBZDW;
    private TextView DT_BZSJ;
    private TextView VC_HPSPDW;
    private TextView DT_SPSJ;
    private TextView VC_SPWH;
    private TextView VC_HBSSCSPDW;
    private TextView DT_HBSSCSPSJ;
    private TextView VC_HBSSCSPWH;
    private TextView DTHBSJ;
    private TextView VCYSDW;
    private TextView VC_YSSPWH;
    private TextView CH_SFJXGJGKJ;
    private TextView DT_JGKJSJ;
    private TextView VC_GKJPZDW;
    private TextView VC_GKJPFWH;
    private TextView CH_SFJBLHP;
    private TextView VC_SFJBLHP_HPSPDW;
    private TextView DT_HPSJ;
    private TextView VC_HPWH;
    private TextView VC_SSCSPDW;
    private TextView DT_SSCSPSJ;
    private TextView VC_SSCSPWH;
    private TextView DT_HBSJ;
    private TextView VC_YSDW;
    private TextView VC_DCJGFBXS;
    private TextView CH_SFSYZCTTFW;
    private TextView CH_MQSFSYTTFW;
    private TextView DT_QYTRSSCSJ;
    private TextView VC_LJSCJGY;
    private TextView CH_SFTYSSC;
    private TextView CH_SFTGHBJGYS;
    private TextView CH_SFQDZS;
    private TextView CH_SFJXPWDJ;
    private TextView CH_SFJSZEJNPWF;
    private TextView VC_SYNDSJJNPWF;
    private TextView VC_YJNPWF;
    private TextView VC_WJNYY;
    private TextView CH_SFJYCQHSXT;
    private TextView VC_WJNYY2;
    private TextView CH_SFJYWKHSXT;
    private TextView VC_XKFXCSL;
    private TextView VC_ZYTZWRW;
    private TextView CH_SFYPXKFS;
    private TextView VC_WPL;
    private TextView CH_SFCLSSYBH;
    private TextView VC_SHFSCSL;
    private TextView VC_CLFS;
    private TextView VC_CLL;
    private TextView CH_DZHPSFBG;
    private TextView VC_SCFSZYW;
    private TextView VC_SHWSZYW;
    private TextView VC_FSCSL;
    private TextView VC_CLSS;
    private TextView VC_CLSSCLL;
    private TextView CH_CLSSDZHPSFYBG;
    private TextView CH_CLSSSFZC;
    private TextView CH_FSSFWP;
    private TextView VC_FSWPL;
    private TextView VC_WPQXYGN;
    private TextView CH_SFCZWP;
    private TextView VC_QTSM;
    private TextView VC_XXLFQZYSCHJ;
    private TextView VC_FQZYWRW;
    private TextView VC_FQCLSS;
    private TextView CH_FSCLSFZCYZ;
    private TextView CH_FSPTFQZL;
    private TextView VC_XXLFQZYSCHJ2;
    private TextView CHFSPTFQZL;
    private TextView VC_XXLFQZYSCHJ3;
    private TextView VC_JCDW;
    private TextView DT_JCSJ;
    private TextView CH_ZXJCSFAZ;
    private TextView CH_YXSFZC;
    private TextView CH_FSPTFQZL2;
    private TextView VCXXLFQZYSCHJ3;
    private TextView CH_JZSSSFJC;
    private TextView VC_WPTJSDSS;
    private TextView CH_GZSSFCQJZSS;
    private TextView VC_GZS_QTSM;
    private TextView CH_JQSFCB;
    private TextView VC_CBDW;
    private TextView VC_CBSZ;
    private TextView VC_CBY;
    private TextView VC_JCDW2;
    private TextView DT__JCSJ;
    private TextView VC_GFMC;
    private TextView VC_NZL;
    private TextView VC_SJZL;
    private TextView VC_GFCLFS;
    private TextView CH_WKDCFS;
    private TextView CH_WKSSFS;
    private TextView CH_SFJYWKK;
    private TextView VC_WKKYSJKR;
    private TextView VC_SJWKDCBG;
    private TextView VC_MQLJSYKR;
    private TextView VC_SYKR;
    private TextView VC_WKKSYNX;
    private TextView VC_GFCLFS2;
    private TextView CH_SFWWXY;
    private TextView VC_GFCLFS3;
    private TextView CH_JSSFFEYQ;
    private TextView VC_BFHDY;
    private TextView VC_YLXMCSDGYGF;
    private TextView CH_JGFSFAYQDC;
    private TextView VC_SJWXFWMC;
    private TextView VC_CSGD;
    private TextView VC_CSL;
    private TextView VC_HPYQDCS;
    private TextView VC_SJCZCS;
    private TextView CH_SFXHBDJ;
    private TextView CH_SFCZZY;
    private TextView CH_SFZXWXFWZYLDDZD;
    private TextView CH_JYSDWSFJBZZ;
    private TextView VC_SJCZCS2;
    private TextView CH_CZSDWSFJBZZ;
    private TextView CH_SFJYWFZC;
    private TextView VC_WFZCSZKR;
    private TextView VC_SJDCL;
    private TextView VC_SJCZCS3;
    private TextView CH_SFJSYWFSBBZ;
    private TextView CH_SFYYBGFHD;
    private TextView CH_YSSFDL;
    private TextView CH_SFZDWFYWSGYA;
    private TextView CH_CQSFSYWFZC;
    private TextView VC_PYYQWSFHJL;
    private TextView CH_SFYBH;
    private TextView DT_BHMBZSSJ;
    private TextView VC_ZBHJBHMS;
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
        setContentView(R.layout.activity_tin_benefication);
        initView();
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(),t_task_list_id,URL_QUERY_XC_INFO,TinBeneficationBean.class,this,yNProgressDialog);
        Log.e("TinBeneficationActivity", URL_QUERY_XC_INFO);
        Log.e("TinBeneficationActivity", t_task_list_id);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("锡选冶行业现场监察记录");
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
        VC_HPZYCP = (TextView) findViewById(R.id.VC_HPZYCP);
        VC_HPZYCP.setOnClickListener(this);
        VC_SJCL = (TextView) findViewById(R.id.VC_SJCL);
        VC_SJCL.setOnClickListener(this);
        VC_SJCP = (TextView) findViewById(R.id.VC_SJCP);
        VC_SJCP.setOnClickListener(this);
        VC_SHIJCL = (TextView) findViewById(R.id.VC_SHIJCL);
        VC_SHIJCL.setOnClickListener(this);
        VC_HPSCYLFL = (TextView) findViewById(R.id.VC_HPSCYLFL);
        VC_HPSCYLFL.setOnClickListener(this);
        VC_QTSCYLFL = (TextView) findViewById(R.id.VC_QTSCYLFL);
        VC_QTSCYLFL.setOnClickListener(this);
        VC_MQSCYLFL = (TextView) findViewById(R.id.VC_MQSCYLFL);
        VC_MQSCYLFL.setOnClickListener(this);
        VC_XJKSCGY = (TextView) findViewById(R.id.VC_XJKSCGY);
        VC_XJKSCGY.setOnClickListener(this);
        VC_XZLSCGY = (TextView) findViewById(R.id.VC_XZLSCGY);
        VC_XZLSCGY.setOnClickListener(this);
        VC_QTXZLSCGY = (TextView) findViewById(R.id.VC_QTXZLSCGY);
        VC_QTXZLSCGY.setOnClickListener(this);
        VC_XCJCSQYZT = (TextView) findViewById(R.id.VC_XCJCSQYZT);
        VC_XCJCSQYZT.setOnClickListener(this);
        DT_XMCSSJ = (TextView) findViewById(R.id.DT_XMCSSJ);
        DT_XMCSSJ.setOnClickListener(this);
        DT_LXPFWH2 = (TextView) findViewById(R.id.DT_LXPFWH2);
        DT_LXPFWH2.setOnClickListener(this);
        VC_PZLXDW = (TextView) findViewById(R.id.VC_PZLXDW);
        VC_PZLXDW.setOnClickListener(this);
        VC_LXPFWH = (TextView) findViewById(R.id.VC_LXPFWH);
        VC_LXPFWH.setOnClickListener(this);
        CH_BZLX = (TextView) findViewById(R.id.CH_BZLX);
        CH_BZLX.setOnClickListener(this);
        VC_HPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
        VC_HPBZDW.setOnClickListener(this);
        DT_BZSJ = (TextView) findViewById(R.id.DT_BZSJ);
        DT_BZSJ.setOnClickListener(this);
        VC_HPSPDW = (TextView) findViewById(R.id.VC_HPSPDW);
        VC_HPSPDW.setOnClickListener(this);
        DT_SPSJ = (TextView) findViewById(R.id.DT_SPSJ);
        DT_SPSJ.setOnClickListener(this);
        VC_SPWH = (TextView) findViewById(R.id.VC_SPWH);
        VC_SPWH.setOnClickListener(this);
        VC_HBSSCSPDW = (TextView) findViewById(R.id.VC_HBSSCSPDW);
        VC_HBSSCSPDW.setOnClickListener(this);
        DT_HBSSCSPSJ = (TextView) findViewById(R.id.DT_HBSSCSPSJ);
        DT_HBSSCSPSJ.setOnClickListener(this);
        VC_HBSSCSPWH = (TextView) findViewById(R.id.VC_HBSSCSPWH);
        VC_HBSSCSPWH.setOnClickListener(this);
        DTHBSJ = (TextView) findViewById(R.id.DTHBSJ);
        DTHBSJ.setOnClickListener(this);
        VCYSDW = (TextView) findViewById(R.id.VCYSDW);
        VCYSDW.setOnClickListener(this);
        VC_YSSPWH = (TextView) findViewById(R.id.VC_YSSPWH);
        VC_YSSPWH.setOnClickListener(this);
        CH_SFJXGJGKJ = (TextView) findViewById(R.id.CH_SFJXGJGKJ);
        CH_SFJXGJGKJ.setOnClickListener(this);
        DT_JGKJSJ = (TextView) findViewById(R.id.DT_JGKJSJ);
        DT_JGKJSJ.setOnClickListener(this);
        VC_GKJPZDW = (TextView) findViewById(R.id.VC_GKJPZDW);
        VC_GKJPZDW.setOnClickListener(this);
        VC_GKJPFWH = (TextView) findViewById(R.id.VC_GKJPFWH);
        VC_GKJPFWH.setOnClickListener(this);
        CH_SFJBLHP = (TextView) findViewById(R.id.CH_SFJBLHP);
        CH_SFJBLHP.setOnClickListener(this);
        VC_SFJBLHP_HPSPDW = (TextView) findViewById(R.id.VC_SFJBLHP_HPSPDW);
        VC_SFJBLHP_HPSPDW.setOnClickListener(this);
        DT_HPSJ = (TextView) findViewById(R.id.DT_HPSJ);
        DT_HPSJ.setOnClickListener(this);
        VC_HPWH = (TextView) findViewById(R.id.VC_HPWH);
        VC_HPWH.setOnClickListener(this);
        VC_SSCSPDW = (TextView) findViewById(R.id.VC_SSCSPDW);
        VC_SSCSPDW.setOnClickListener(this);
        DT_SSCSPSJ = (TextView) findViewById(R.id.DT_SSCSPSJ);
        DT_SSCSPSJ.setOnClickListener(this);
        VC_SSCSPWH = (TextView) findViewById(R.id.VC_SSCSPWH);
        VC_SSCSPWH.setOnClickListener(this);
        DT_HBSJ = (TextView) findViewById(R.id.DT_HBSJ);
        DT_HBSJ.setOnClickListener(this);
        VC_YSDW = (TextView) findViewById(R.id.VC_YSDW);
        VC_YSDW.setOnClickListener(this);
        VC_DCJGFBXS = (TextView) findViewById(R.id.VC_DCJGFBXS);
        VC_DCJGFBXS.setOnClickListener(this);
        CH_SFSYZCTTFW = (TextView) findViewById(R.id.CH_SFSYZCTTFW);
        CH_SFSYZCTTFW.setOnClickListener(this);
        CH_MQSFSYTTFW = (TextView) findViewById(R.id.CH_MQSFSYTTFW);
        CH_MQSFSYTTFW.setOnClickListener(this);
        DT_QYTRSSCSJ = (TextView) findViewById(R.id.DT_QYTRSSCSJ);
        DT_QYTRSSCSJ.setOnClickListener(this);
        VC_LJSCJGY = (TextView) findViewById(R.id.VC_LJSCJGY);
        VC_LJSCJGY.setOnClickListener(this);
        CH_SFTYSSC = (TextView) findViewById(R.id.CH_SFTYSSC);
        CH_SFTYSSC.setOnClickListener(this);
        CH_SFTGHBJGYS = (TextView) findViewById(R.id.CH_SFTGHBJGYS);
        CH_SFTGHBJGYS.setOnClickListener(this);
        CH_SFQDZS = (TextView) findViewById(R.id.CH_SFQDZS);
        CH_SFQDZS.setOnClickListener(this);
        CH_SFJXPWDJ = (TextView) findViewById(R.id.CH_SFJXPWDJ);
        CH_SFJXPWDJ.setOnClickListener(this);
        CH_SFJSZEJNPWF = (TextView) findViewById(R.id.CH_SFJSZEJNPWF);
        CH_SFJSZEJNPWF.setOnClickListener(this);
        VC_SYNDSJJNPWF = (TextView) findViewById(R.id.VC_SYNDSJJNPWF);
        VC_SYNDSJJNPWF.setOnClickListener(this);
        VC_YJNPWF = (TextView) findViewById(R.id.VC_YJNPWF);
        VC_YJNPWF.setOnClickListener(this);
        VC_WJNYY = (TextView) findViewById(R.id.VC_WJNYY);
        VC_WJNYY.setOnClickListener(this);
        CH_SFJYCQHSXT = (TextView) findViewById(R.id.CH_SFJYCQHSXT);
        CH_SFJYCQHSXT.setOnClickListener(this);
        VC_WJNYY2 = (TextView) findViewById(R.id.VC_WJNYY2);
        VC_WJNYY2.setOnClickListener(this);
        CH_SFJYWKHSXT = (TextView) findViewById(R.id.CH_SFJYWKHSXT);
        CH_SFJYWKHSXT.setOnClickListener(this);
        VC_XKFXCSL = (TextView) findViewById(R.id.VC_XKFXCSL);
        VC_XKFXCSL.setOnClickListener(this);
        VC_ZYTZWRW = (TextView) findViewById(R.id.VC_ZYTZWRW);
        VC_ZYTZWRW.setOnClickListener(this);
        CH_SFYPXKFS = (TextView) findViewById(R.id.CH_SFYPXKFS);
        CH_SFYPXKFS.setOnClickListener(this);
        VC_WPL = (TextView) findViewById(R.id.VC_WPL);
        VC_WPL.setOnClickListener(this);
        CH_SFCLSSYBH = (TextView) findViewById(R.id.CH_SFCLSSYBH);
        CH_SFCLSSYBH.setOnClickListener(this);
        VC_SHFSCSL = (TextView) findViewById(R.id.VC_SHFSCSL);
        VC_SHFSCSL.setOnClickListener(this);
        VC_CLFS = (TextView) findViewById(R.id.VC_CLFS);
        VC_CLFS.setOnClickListener(this);
        VC_CLL = (TextView) findViewById(R.id.VC_CLL);
        VC_CLL.setOnClickListener(this);
        CH_DZHPSFBG = (TextView) findViewById(R.id.CH_DZHPSFBG);
        CH_DZHPSFBG.setOnClickListener(this);
        VC_SCFSZYW = (TextView) findViewById(R.id.VC_SCFSZYW);
        VC_SCFSZYW.setOnClickListener(this);
        VC_SHWSZYW = (TextView) findViewById(R.id.VC_SHWSZYW);
        VC_SHWSZYW.setOnClickListener(this);
        VC_FSCSL = (TextView) findViewById(R.id.VC_FSCSL);
        VC_FSCSL.setOnClickListener(this);
        VC_CLSS = (TextView) findViewById(R.id.VC_CLSS);
        VC_CLSS.setOnClickListener(this);
        VC_CLSSCLL = (TextView) findViewById(R.id.VC_CLSSCLL);
        VC_CLSSCLL.setOnClickListener(this);
        CH_CLSSDZHPSFYBG = (TextView) findViewById(R.id.CH_CLSSDZHPSFYBG);
        CH_CLSSDZHPSFYBG.setOnClickListener(this);
        CH_CLSSSFZC = (TextView) findViewById(R.id.CH_CLSSSFZC);
        CH_CLSSSFZC.setOnClickListener(this);
        CH_FSSFWP = (TextView) findViewById(R.id.CH_FSSFWP);
        CH_FSSFWP.setOnClickListener(this);
        VC_FSWPL = (TextView) findViewById(R.id.VC_FSWPL);
        VC_FSWPL.setOnClickListener(this);
        VC_WPQXYGN = (TextView) findViewById(R.id.VC_WPQXYGN);
        VC_WPQXYGN.setOnClickListener(this);
        CH_SFCZWP = (TextView) findViewById(R.id.CH_SFCZWP);
        CH_SFCZWP.setOnClickListener(this);
        VC_QTSM = (TextView) findViewById(R.id.VC_QTSM);
        VC_QTSM.setOnClickListener(this);
        VC_XXLFQZYSCHJ = (TextView) findViewById(R.id.VC_XXLFQZYSCHJ);
        VC_XXLFQZYSCHJ.setOnClickListener(this);
        VC_FQZYWRW = (TextView) findViewById(R.id.VC_FQZYWRW);
        VC_FQZYWRW.setOnClickListener(this);
        VC_FQCLSS = (TextView) findViewById(R.id.VC_FQCLSS);
        VC_FQCLSS.setOnClickListener(this);
        CH_FSCLSFZCYZ = (TextView) findViewById(R.id.CH_FSCLSFZCYZ);
        CH_FSCLSFZCYZ.setOnClickListener(this);
        CH_FSPTFQZL = (TextView) findViewById(R.id.CH_FSPTFQZL);
        CH_FSPTFQZL.setOnClickListener(this);
        VC_XXLFQZYSCHJ2 = (TextView) findViewById(R.id.VC_XXLFQZYSCHJ2);
        VC_XXLFQZYSCHJ2.setOnClickListener(this);
        CHFSPTFQZL = (TextView) findViewById(R.id.CHFSPTFQZL);
        CHFSPTFQZL.setOnClickListener(this);
        VC_XXLFQZYSCHJ3 = (TextView) findViewById(R.id.VC_XXLFQZYSCHJ3);
        VC_XXLFQZYSCHJ3.setOnClickListener(this);
        VC_JCDW = (TextView) findViewById(R.id.VC_JCDW);
        VC_JCDW.setOnClickListener(this);
        DT_JCSJ = (TextView) findViewById(R.id.DT_JCSJ);
        DT_JCSJ.setOnClickListener(this);
        CH_ZXJCSFAZ = (TextView) findViewById(R.id.CH_ZXJCSFAZ);
        CH_ZXJCSFAZ.setOnClickListener(this);
        CH_YXSFZC = (TextView) findViewById(R.id.CH_YXSFZC);
        CH_YXSFZC.setOnClickListener(this);
        CH_FSPTFQZL2 = (TextView) findViewById(R.id.CH_FSPTFQZL2);
        CH_FSPTFQZL2.setOnClickListener(this);
        VCXXLFQZYSCHJ3 = (TextView) findViewById(R.id.VCXXLFQZYSCHJ3);
        VCXXLFQZYSCHJ3.setOnClickListener(this);
        CH_JZSSSFJC = (TextView) findViewById(R.id.CH_JZSSSFJC);
        CH_JZSSSFJC.setOnClickListener(this);
        VC_WPTJSDSS = (TextView) findViewById(R.id.VC_WPTJSDSS);
        VC_WPTJSDSS.setOnClickListener(this);
        CH_GZSSFCQJZSS = (TextView) findViewById(R.id.CH_GZSSFCQJZSS);
        CH_GZSSFCQJZSS.setOnClickListener(this);
        VC_GZS_QTSM = (TextView) findViewById(R.id.VC_GZS_QTSM);
        VC_GZS_QTSM.setOnClickListener(this);
        CH_JQSFCB = (TextView) findViewById(R.id.CH_JQSFCB);
        CH_JQSFCB.setOnClickListener(this);
        VC_CBDW = (TextView) findViewById(R.id.VC_CBDW);
        VC_CBDW.setOnClickListener(this);
        VC_CBSZ = (TextView) findViewById(R.id.VC_CBSZ);
        VC_CBSZ.setOnClickListener(this);
        VC_CBY = (TextView) findViewById(R.id.VC_CBY);
        VC_CBY.setOnClickListener(this);
        VC_JCDW2 = (TextView) findViewById(R.id.VC_JCDW2);
        VC_JCDW2.setOnClickListener(this);
        DT__JCSJ = (TextView) findViewById(R.id.DT__JCSJ);
        DT__JCSJ.setOnClickListener(this);
        VC_GFMC = (TextView) findViewById(R.id.VC_GFMC);
        VC_GFMC.setOnClickListener(this);
        VC_NZL = (TextView) findViewById(R.id.VC_NZL);
        VC_NZL.setOnClickListener(this);
        VC_SJZL = (TextView) findViewById(R.id.VC_SJZL);
        VC_SJZL.setOnClickListener(this);
        VC_GFCLFS = (TextView) findViewById(R.id.VC_GFCLFS);
        VC_GFCLFS.setOnClickListener(this);
        CH_WKDCFS = (TextView) findViewById(R.id.CH_WKDCFS);
        CH_WKDCFS.setOnClickListener(this);
        CH_WKSSFS = (TextView) findViewById(R.id.CH_WKSSFS);
        CH_WKSSFS.setOnClickListener(this);
        CH_SFJYWKK = (TextView) findViewById(R.id.CH_SFJYWKK);
        CH_SFJYWKK.setOnClickListener(this);
        VC_WKKYSJKR = (TextView) findViewById(R.id.VC_WKKYSJKR);
        VC_WKKYSJKR.setOnClickListener(this);
        VC_SJWKDCBG = (TextView) findViewById(R.id.VC_SJWKDCBG);
        VC_SJWKDCBG.setOnClickListener(this);
        VC_MQLJSYKR = (TextView) findViewById(R.id.VC_MQLJSYKR);
        VC_MQLJSYKR.setOnClickListener(this);
        VC_SYKR = (TextView) findViewById(R.id.VC_SYKR);
        VC_SYKR.setOnClickListener(this);
        VC_WKKSYNX = (TextView) findViewById(R.id.VC_WKKSYNX);
        VC_WKKSYNX.setOnClickListener(this);
        VC_GFCLFS2 = (TextView) findViewById(R.id.VC_GFCLFS2);
        VC_GFCLFS2.setOnClickListener(this);
        CH_SFWWXY = (TextView) findViewById(R.id.CH_SFWWXY);
        CH_SFWWXY.setOnClickListener(this);
        VC_GFCLFS3 = (TextView) findViewById(R.id.VC_GFCLFS3);
        VC_GFCLFS3.setOnClickListener(this);
        CH_JSSFFEYQ = (TextView) findViewById(R.id.CH_JSSFFEYQ);
        CH_JSSFFEYQ.setOnClickListener(this);
        VC_BFHDY = (TextView) findViewById(R.id.VC_BFHDY);
        VC_BFHDY.setOnClickListener(this);
        VC_YLXMCSDGYGF = (TextView) findViewById(R.id.VC_YLXMCSDGYGF);
        VC_YLXMCSDGYGF.setOnClickListener(this);
        CH_JGFSFAYQDC = (TextView) findViewById(R.id.CH_JGFSFAYQDC);
        CH_JGFSFAYQDC.setOnClickListener(this);
        VC_SJWXFWMC = (TextView) findViewById(R.id.VC_SJWXFWMC);
        VC_SJWXFWMC.setOnClickListener(this);
        VC_CSGD = (TextView) findViewById(R.id.VC_CSGD);
        VC_CSGD.setOnClickListener(this);
        VC_CSL = (TextView) findViewById(R.id.VC_CSL);
        VC_CSL.setOnClickListener(this);
        VC_HPYQDCS = (TextView) findViewById(R.id.VC_HPYQDCS);
        VC_HPYQDCS.setOnClickListener(this);
        VC_SJCZCS = (TextView) findViewById(R.id.VC_SJCZCS);
        VC_SJCZCS.setOnClickListener(this);
        CH_SFXHBDJ = (TextView) findViewById(R.id.CH_SFXHBDJ);
        CH_SFXHBDJ.setOnClickListener(this);
        CH_SFCZZY = (TextView) findViewById(R.id.CH_SFCZZY);
        CH_SFCZZY.setOnClickListener(this);
        CH_SFZXWXFWZYLDDZD = (TextView) findViewById(R.id.CH_SFZXWXFWZYLDDZD);
        CH_SFZXWXFWZYLDDZD.setOnClickListener(this);
        CH_JYSDWSFJBZZ = (TextView) findViewById(R.id.CH_JYSDWSFJBZZ);
        CH_JYSDWSFJBZZ.setOnClickListener(this);
        VC_SJCZCS2 = (TextView) findViewById(R.id.VC_SJCZCS2);
        VC_SJCZCS2.setOnClickListener(this);
        CH_CZSDWSFJBZZ = (TextView) findViewById(R.id.CH_CZSDWSFJBZZ);
        CH_CZSDWSFJBZZ.setOnClickListener(this);
        CH_SFJYWFZC = (TextView) findViewById(R.id.CH_SFJYWFZC);
        CH_SFJYWFZC.setOnClickListener(this);
        VC_WFZCSZKR = (TextView) findViewById(R.id.VC_WFZCSZKR);
        VC_WFZCSZKR.setOnClickListener(this);
        VC_SJDCL = (TextView) findViewById(R.id.VC_SJDCL);
        VC_SJDCL.setOnClickListener(this);
        VC_SJCZCS3 = (TextView) findViewById(R.id.VC_SJCZCS3);
        VC_SJCZCS3.setOnClickListener(this);
        CH_SFJSYWFSBBZ = (TextView) findViewById(R.id.CH_SFJSYWFSBBZ);
        CH_SFJSYWFSBBZ.setOnClickListener(this);
        CH_SFYYBGFHD = (TextView) findViewById(R.id.CH_SFYYBGFHD);
        CH_SFYYBGFHD.setOnClickListener(this);
        CH_YSSFDL = (TextView) findViewById(R.id.CH_YSSFDL);
        CH_YSSFDL.setOnClickListener(this);
        CH_SFZDWFYWSGYA = (TextView) findViewById(R.id.CH_SFZDWFYWSGYA);
        CH_SFZDWFYWSGYA.setOnClickListener(this);
        CH_CQSFSYWFZC = (TextView) findViewById(R.id.CH_CQSFSYWFZC);
        CH_CQSFSYWFZC.setOnClickListener(this);
        VC_PYYQWSFHJL = (TextView) findViewById(R.id.VC_PYYQWSFHJL);
        VC_PYYQWSFHJL.setOnClickListener(this);
        CH_SFYBH = (TextView) findViewById(R.id.CH_SFYBH);
        CH_SFYBH.setOnClickListener(this);
        DT_BHMBZSSJ = (TextView) findViewById(R.id.DT_BHMBZSSJ);
        DT_BHMBZSSJ.setOnClickListener(this);
        VC_ZBHJBHMS = (TextView) findViewById(R.id.VC_ZBHJBHMS);
        VC_ZBHJBHMS.setOnClickListener(this);
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
        TinBeneficationBean resultBean= (TinBeneficationBean) o;
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
            if (resultBean.getData().get(0).getVc_szxzc()==null){
                VC_SZXZC.setText("");
            } else {
                VC_SZXZC.setText(resultBean.getData().get(0).getVc_szxzc().toString());
            }
            if (resultBean.getData().get(0).getVc_hpzycp()==null){
                VC_HPZYCP.setText("");
            } else {
                VC_HPZYCP.setText(resultBean.getData().get(0).getVc_hpzycp().toString());
            }
            if (resultBean.getData().get(0).getVc_sjcp()==null){
                VC_SJCP.setText("");
            } else {
                VC_SJCP.setText(resultBean.getData().get(0).getVc_sjcp().toString());
            }
            if (resultBean.getData().get(0).getVc_sjcl()==null){
                VC_SJCL.setText("");
            } else {
                VC_SJCL.setText(resultBean.getData().get(0).getVc_sjcl().toString());
            }
            if (resultBean.getData().get(0).getVc_shijcl()==null){
                VC_SHIJCL.setText("");
            } else {
                VC_SHIJCL.setText(resultBean.getData().get(0).getVc_shijcl().toString());
            }
            if (resultBean.getData().get(0).getVc_hpscylfl()==null){
                VC_HPSCYLFL.setText("");
            } else {
                VC_HPSCYLFL.setText(resultBean.getData().get(0).getVc_hpscylfl().toString());
            }
            if (resultBean.getData().get(0).getVc_qtscylfl()==null){
                VC_QTSCYLFL.setText("");
            } else {
                VC_QTSCYLFL.setText(resultBean.getData().get(0).getVc_qtscylfl().toString());
            }
            if (resultBean.getData().get(0).getVc_mqscylfl()==null){
                VC_MQSCYLFL.setText("");
            } else {
                VC_MQSCYLFL.setText(resultBean.getData().get(0).getVc_mqscylfl().toString());
            }
            if (resultBean.getData().get(0).getVc_xjkscgy()==null){
                VC_XJKSCGY.setText("");
            } else {
                VC_XJKSCGY.setText(resultBean.getData().get(0).getVc_xjkscgy().toString());
            }
            if (resultBean.getData().get(0).getVc_xzlscgy()==null){
                VC_XZLSCGY.setText("");
            } else {
                VC_XZLSCGY.setText(resultBean.getData().get(0).getVc_xzlscgy().toString());
            }
            if (resultBean.getData().get(0).getVc_qtxzlscgy()==null){
                VC_QTXZLSCGY.setText("");
            } else {
                VC_QTXZLSCGY.setText(resultBean.getData().get(0).getVc_qtxzlscgy().toString());
            }
            if (resultBean.getData().get(0).getCh_xcjcsqyzt()==null){
                VC_XCJCSQYZT.setText("");
            } else {
                VC_XCJCSQYZT.setText(resultBean.getData().get(0).getCh_xcjcsqyzt().toString());
            }
            if (resultBean.getData().get(0).getDt_xmcssj()==null){
                DT_XMCSSJ.setText("");
            } else {
                DT_XMCSSJ.setText(resultBean.getData().get(0).getDt_xmcssj().toString());
            }
            if (resultBean.getData().get(0).getDt_lxpfwh2()==null){
                DT_LXPFWH2.setText("");
            } else {
                DT_LXPFWH2.setText(resultBean.getData().get(0).getDt_lxpfwh2().toString());
            }
            if (resultBean.getData().get(0).getVc_pzlxdw()==null){
                VC_PZLXDW.setText("");
            } else {
                VC_PZLXDW.setText(resultBean.getData().get(0).getVc_pzlxdw().toString());
            }
            if (resultBean.getData().get(0).getVc_lxpfwh()==null){
                VC_LXPFWH.setText("");
            } else {
                VC_LXPFWH.setText(resultBean.getData().get(0).getVc_lxpfwh().toString());
            }
            if (resultBean.getData().get(0).getCh_bzlx()==null){
                CH_BZLX.setText("");
            } else {
                CH_BZLX.setText(resultBean.getData().get(0).getCh_bzlx().toString());
            }
            if (resultBean.getData().get(0).getVc_hpbzdw()==null){
                VC_HPBZDW.setText("");
            } else {
                VC_HPBZDW.setText(resultBean.getData().get(0).getVc_hpbzdw().toString());
            }
            if (resultBean.getData().get(0).getDt_bzsj()==null){
                DT_BZSJ.setText("");
            } else {
                DT_BZSJ.setText(resultBean.getData().get(0).getDt_bzsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hpspdw()==null){
                VC_HPSPDW.setText("");
            } else {
                VC_HPSPDW.setText(resultBean.getData().get(0).getVc_hpspdw().toString());
            }
            if (resultBean.getData().get(0).getDt_spsj()==null){
                DT_SPSJ.setText("");
            } else {
                DT_SPSJ.setText(resultBean.getData().get(0).getDt_spsj().toString());
            }
            if (resultBean.getData().get(0).getVc_spwh()==null){
                VC_SPWH.setText("");
            } else {
                VC_SPWH.setText(resultBean.getData().get(0).getVc_spwh().toString());
            }
            if (resultBean.getData().get(0).getVc_hbsscspdw()==null){
                VC_HBSSCSPDW.setText("");
            } else {
                VC_HBSSCSPDW.setText(resultBean.getData().get(0).getVc_hbsscspdw().toString());
            }
            if (resultBean.getData().get(0).getDt_hbsscspsj()==null){
                DT_HBSSCSPSJ.setText("");
            } else {
                DT_HBSSCSPSJ.setText(resultBean.getData().get(0).getDt_hbsscspsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hbsscspwh()==null){
                VC_HBSSCSPWH.setText("");
            } else {
                VC_HBSSCSPWH.setText(resultBean.getData().get(0).getVc_hbsscspwh().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjxgjgkj()==null){
                CH_SFJXGJGKJ.setText("");
            } else {
                CH_SFJXGJGKJ.setText(resultBean.getData().get(0).getCh_sfjxgjgkj().toString());
            }
            if (resultBean.getData().get(0).getDt_jgkjsj()==null){
                DT_JGKJSJ.setText("");
            } else {
                DT_JGKJSJ.setText(resultBean.getData().get(0).getDt_jgkjsj().toString());
            }
            if (resultBean.getData().get(0).getVc_gkjpzdw()==null){
                VC_GKJPZDW.setText("");
            } else {
                VC_GKJPZDW.setText(resultBean.getData().get(0).getVc_gkjpzdw().toString());
            }
            if (resultBean.getData().get(0).getVc_gkjpfwh()==null){
                VC_GKJPFWH.setText("");
            } else {
                VC_GKJPFWH.setText(resultBean.getData().get(0).getVc_gkjpfwh().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjblhp()==null){
                CH_SFJBLHP.setText("");
            } else {
                CH_SFJBLHP.setText(resultBean.getData().get(0).getCh_sfjblhp().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjblhp_hpspdw()==null){
                VC_SFJBLHP_HPSPDW.setText("");
            } else {
                VC_SFJBLHP_HPSPDW.setText(resultBean.getData().get(0).getVc_sfjblhp_hpspdw().toString());
            }
            if (resultBean.getData().get(0).getDt_hpsj()==null){
                DT_HPSJ.setText("");
            } else {
                DT_HPSJ.setText(resultBean.getData().get(0).getDt_hpsj().toString());
            }
            if (resultBean.getData().get(0).getVc_hpwh()==null){
                VC_HPWH.setText("");
            } else {
                VC_HPWH.setText(resultBean.getData().get(0).getVc_hpwh().toString());
            }
            if (resultBean.getData().get(0).getVc_sscspdw()==null){
                VC_SSCSPDW.setText("");
            } else {
                VC_SSCSPDW.setText(resultBean.getData().get(0).getVc_sscspdw().toString());
            }
            if (resultBean.getData().get(0).getVc_sscspwh()==null){
                VC_SSCSPWH.setText("");
            } else {
                VC_SSCSPWH.setText(resultBean.getData().get(0).getVc_sscspwh().toString());
            }
            if (resultBean.getData().get(0).getDt_sscspsj()==null){
                DT_SSCSPSJ.setText("");
            } else {
                DT_SSCSPSJ.setText(resultBean.getData().get(0).getDt_sscspsj().toString());
            }
            if (resultBean.getData().get(0).getDt_hbsj()==null){
                DT_HBSJ.setText("");
            } else {
                DT_HBSJ.setText(resultBean.getData().get(0).getDt_hbsj().toString());
            }
            if (resultBean.getData().get(0).getVc_ysdw()==null){
                VC_YSDW.setText("");
            } else {
                VC_YSDW.setText(resultBean.getData().get(0).getVc_ysdw().toString());
            }
            if (resultBean.getData().get(0).getVc_dcjgfbxs()==null){
                VC_DCJGFBXS.setText("");
            } else {
                VC_DCJGFBXS.setText(resultBean.getData().get(0).getVc_dcjgfbxs().toString());
            }
            if (resultBean.getData().get(0).getCh_sfsyzcttfw()==null){
                CH_SFSYZCTTFW.setText("");
            } else {
                CH_SFSYZCTTFW.setText(resultBean.getData().get(0).getCh_sfsyzcttfw().toString());
            }
            if (resultBean.getData().get(0).getCh_mqsfsyttfw()==null){
                CH_MQSFSYTTFW.setText("");
            } else {
                CH_MQSFSYTTFW.setText(resultBean.getData().get(0).getCh_mqsfsyttfw().toString());
            }
            if (resultBean.getData().get(0).getDt_qytrsscsj()==null){
                DT_QYTRSSCSJ.setText("");
            } else {
                DT_QYTRSSCSJ.setText(resultBean.getData().get(0).getDt_qytrsscsj().toString());
            }
            if (resultBean.getData().get(0).getVc_ljscjgy()==null){
                VC_LJSCJGY.setText("");
            } else {
                VC_LJSCJGY.setText(resultBean.getData().get(0).getVc_ljscjgy().toString());
            }
            if (resultBean.getData().get(0).getCh_sftyssc()==null){
                CH_SFTYSSC.setText("");
            } else {
                CH_SFTYSSC.setText(resultBean.getData().get(0).getCh_sftyssc().toString());
            }
            if (resultBean.getData().get(0).getCh_sftghbjgys()==null){
                CH_SFTGHBJGYS.setText("");
            } else {
                CH_SFTGHBJGYS.setText(resultBean.getData().get(0).getCh_sftghbjgys().toString());
            }
            if (resultBean.getData().get(0).getCh_sfqdzs()==null){
                CH_SFQDZS.setText("");
            } else {
                CH_SFQDZS.setText(resultBean.getData().get(0).getCh_sfqdzs().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjxpwdj()==null){
                CH_SFJXPWDJ.setText("");
            } else {
                CH_SFJXPWDJ.setText(resultBean.getData().get(0).getCh_sfjxpwdj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjszejnpwf()==null){
                CH_SFJSZEJNPWF.setText("");
            } else {
                CH_SFJSZEJNPWF.setText(resultBean.getData().get(0).getCh_sfjszejnpwf().toString());
            }
            if (resultBean.getData().get(0).getVc_syndsjjnpwf()==null){
                VC_SYNDSJJNPWF.setText("");
            } else {
                VC_SYNDSJJNPWF.setText(resultBean.getData().get(0).getVc_syndsjjnpwf().toString());
            }
            if (resultBean.getData().get(0).getVc_yjnpwf()==null){
                VC_YJNPWF.setText("");
            } else {
                VC_YJNPWF.setText(resultBean.getData().get(0).getVc_yjnpwf().toString());
            }
            if (resultBean.getData().get(0).getVc_wjnyy()==null){
                VC_WJNYY.setText("");
            } else {
                VC_WJNYY.setText(resultBean.getData().get(0).getVc_wjnyy().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjycqhsxt()==null){
                CH_SFJYCQHSXT.setText("");
            } else {
                CH_SFJYCQHSXT.setText(resultBean.getData().get(0).getCh_sfjycqhsxt().toString());
            }
            if (resultBean.getData().get(0).getVc_wjnyy2()==null){
                VC_WJNYY2.setText("");
            } else {
                VC_WJNYY2.setText(resultBean.getData().get(0).getVc_wjnyy2().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjywkhsxt()==null){
                CH_SFJYWKHSXT.setText("");
            } else {
                CH_SFJYWKHSXT.setText(resultBean.getData().get(0).getCh_sfjywkhsxt().toString());
            }
            if (resultBean.getData().get(0).getVc_xkfxcsl()==null){
                VC_XKFXCSL.setText("");
            } else {
                VC_XKFXCSL.setText(resultBean.getData().get(0).getVc_xkfxcsl().toString());
            }
            if (resultBean.getData().get(0).getVc_zytzwrw()==null){
                VC_ZYTZWRW.setText("");
            } else {
                VC_ZYTZWRW.setText(resultBean.getData().get(0).getVc_zytzwrw().toString());
            }
            if (resultBean.getData().get(0).getCh_sfypxkfs()==null){
                CH_SFYPXKFS.setText("");
            } else {
                CH_SFYPXKFS.setText(resultBean.getData().get(0).getCh_sfypxkfs().toString());
            }
            if (resultBean.getData().get(0).getVc_wpl()==null){
                VC_WPL.setText("");
            } else {
                VC_WPL.setText(resultBean.getData().get(0).getVc_wpl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfclssybh()==null){
                CH_SFCLSSYBH.setText("");
            } else {
                CH_SFCLSSYBH.setText(resultBean.getData().get(0).getCh_sfclssybh().toString());
            }
            if (resultBean.getData().get(0).getVc_shfscsl()==null){
                VC_SHFSCSL.setText("");
            } else {
                VC_SHFSCSL.setText(resultBean.getData().get(0).getVc_shfscsl().toString());
            }
            if (resultBean.getData().get(0).getVc_clfs()==null){
                VC_CLFS.setText("");
            } else {
                VC_CLFS.setText(resultBean.getData().get(0).getVc_clfs().toString());
            }
            if (resultBean.getData().get(0).getVc_cll()==null){
                VC_CLL.setText("");
            } else {
                VC_CLL.setText(resultBean.getData().get(0).getVc_cll().toString());
            }
            if (resultBean.getData().get(0).getCh_dzhpsfbg()==null){
                CH_DZHPSFBG.setText("");
            } else {
                CH_DZHPSFBG.setText(resultBean.getData().get(0).getCh_dzhpsfbg().toString());
            }
            if (resultBean.getData().get(0).getVc_scfszyw()==null){
                VC_SCFSZYW.setText("");
            } else {
                VC_SCFSZYW.setText(resultBean.getData().get(0).getVc_scfszyw().toString());
            }
            if (resultBean.getData().get(0).getVc_shwszyw()==null){
                VC_SHWSZYW.setText("");
            } else {
                VC_SHWSZYW.setText(resultBean.getData().get(0).getVc_shwszyw().toString());
            }
            if (resultBean.getData().get(0).getVc_fscsl()==null){
                VC_FSCSL.setText("");
            } else {
                VC_FSCSL.setText(resultBean.getData().get(0).getVc_fscsl().toString());
            }
            if (resultBean.getData().get(0).getVc_clss()==null){
                VC_CLSS.setText("");
            } else {
                VC_CLSS.setText(resultBean.getData().get(0).getVc_clss().toString());
            }
            if (resultBean.getData().get(0).getVc_clsscll()==null){
                VC_CLSSCLL.setText("");
            } else {
                VC_CLSSCLL.setText(resultBean.getData().get(0).getVc_clsscll().toString());
            }
            if (resultBean.getData().get(0).getCh_clssdzhpsfybg()==null){
                CH_CLSSDZHPSFYBG.setText("");
            } else {
                CH_CLSSDZHPSFYBG.setText(resultBean.getData().get(0).getCh_clssdzhpsfybg().toString());
            }
            if (resultBean.getData().get(0).getCh_clsssfzc()==null){
                CH_CLSSSFZC.setText("");
            } else {
                CH_CLSSSFZC.setText(resultBean.getData().get(0).getCh_clsssfzc().toString());
            }
            if (resultBean.getData().get(0).getCh_fssfwp()==null){
                CH_FSSFWP.setText("");
            } else {
                CH_FSSFWP.setText(resultBean.getData().get(0).getCh_fssfwp().toString());
            }
            if (resultBean.getData().get(0).getVc_fswpl()==null){
                VC_FSWPL.setText("");
            } else {
                VC_FSWPL.setText(resultBean.getData().get(0).getVc_fswpl().toString());
            }
            if (resultBean.getData().get(0).getVc_wpqxygn()==null){
                VC_WPQXYGN.setText("");
            } else {
                VC_WPQXYGN.setText(resultBean.getData().get(0).getVc_wpqxygn().toString());
            }
            if (resultBean.getData().get(0).getCh_sfczwp()==null){
                CH_SFCZWP.setText("");
            } else {
                CH_SFCZWP.setText(resultBean.getData().get(0).getCh_sfczwp().toString());
            }
            if (resultBean.getData().get(0).getVc_qtsm()==null){
                VC_QTSM.setText("");
            } else {
                VC_QTSM.setText(resultBean.getData().get(0).getVc_qtsm().toString());
            }
            if (resultBean.getData().get(0).getVc_xxlfqzyschj()==null){
                VC_XXLFQZYSCHJ.setText("");
            } else {
                VC_XXLFQZYSCHJ.setText(resultBean.getData().get(0).getVc_xxlfqzyschj().toString());
            }
            if (resultBean.getData().get(0).getVc_fqzywrw()==null){
                VC_FQZYWRW.setText("");
            } else {
                VC_FQZYWRW.setText(resultBean.getData().get(0).getVc_fqzywrw().toString());
            }
            if (resultBean.getData().get(0).getVc_fqclss()==null){
                VC_FQCLSS.setText("");
            } else {
                VC_FQCLSS.setText(resultBean.getData().get(0).getVc_fqclss().toString());
            }
            if (resultBean.getData().get(0).getCh_fsclsfzcyz()==null){
                CH_FSCLSFZCYZ.setText("");
            } else {
                CH_FSCLSFZCYZ.setText(resultBean.getData().get(0).getCh_fsclsfzcyz().toString());
            }
            if (resultBean.getData().get(0).getCh_fsptfqzl()==null){
                CH_FSPTFQZL.setText("");
            } else {
                CH_FSPTFQZL.setText(resultBean.getData().get(0).getCh_fsptfqzl().toString());
            }
            if (resultBean.getData().get(0).getVc_xxlfqzyschj2()==null){
                VC_XXLFQZYSCHJ2.setText("");
            } else {
                VC_XXLFQZYSCHJ2.setText(resultBean.getData().get(0).getVc_xxlfqzyschj2().toString());
            }
            if (resultBean.getData().get(0).getCh_zxjcsfaz()==null){
                CH_ZXJCSFAZ.setText("");
            } else {
                CH_ZXJCSFAZ.setText(resultBean.getData().get(0).getCh_zxjcsfaz().toString());
            }
            if (resultBean.getData().get(0).getCh_yxsfzc()==null){
                CH_YXSFZC.setText("");
            } else {
                CH_YXSFZC.setText(resultBean.getData().get(0).getCh_yxsfzc().toString());
            }
            if (resultBean.getData().get(0).getCh_fsptfqzl2()==null){
                CH_FSPTFQZL2.setText("");
            } else {
                CH_FSPTFQZL2.setText(resultBean.getData().get(0).getCh_fsptfqzl2().toString());
            }
            if (resultBean.getData().get(0).getCh_fsptfqzl2()==null){
                CH_FSPTFQZL2.setText("");
            } else {
                CH_FSPTFQZL2.setText(resultBean.getData().get(0).getCh_fsptfqzl2().toString());
            }
            if (resultBean.getData().get(0).getVc_xxlfqzyschj3()==null){
                VC_XXLFQZYSCHJ3.setText("");
            } else {
                VC_XXLFQZYSCHJ3.setText(resultBean.getData().get(0).getVc_xxlfqzyschj3().toString());
            } if (resultBean.getData().get(0).getCh_jzsssfjc()==null){
                CH_JZSSSFJC.setText("");
            } else {
                CH_JZSSSFJC.setText(resultBean.getData().get(0).getCh_jzsssfjc().toString());
            }
            if (resultBean.getData().get(0).getVc_wptjsdss()==null){
                VC_WPTJSDSS.setText("");
            } else {
                VC_WPTJSDSS.setText(resultBean.getData().get(0).getVc_wptjsdss().toString());
            }
            if (resultBean.getData().get(0).getCh_gzssfcqjzss()==null){
                CH_GZSSFCQJZSS.setText("");
            } else {
                CH_GZSSFCQJZSS.setText(resultBean.getData().get(0).getCh_gzssfcqjzss().toString());
            }
            if (resultBean.getData().get(0).getVc_gzs_qtsm()==null){
                VC_GZS_QTSM.setText("");
            } else {
                VC_GZS_QTSM.setText(resultBean.getData().get(0).getVc_gzs_qtsm().toString());
            }
            if (resultBean.getData().get(0).getVc_gzs_qtsm()==null){
                VC_GZS_QTSM.setText("");
            } else {
                VC_GZS_QTSM.setText(resultBean.getData().get(0).getVc_gzs_qtsm().toString());
            }
            if (resultBean.getData().get(0).getCh_jqsfcb()==null){
                CH_JQSFCB.setText("");
            } else {
                CH_JQSFCB.setText(resultBean.getData().get(0).getCh_jqsfcb().toString());
            }
            if (resultBean.getData().get(0).getVc_cbdw()==null){
                VC_CBDW.setText("");
            } else {
                VC_CBDW.setText(resultBean.getData().get(0).getVc_cbdw().toString());
            }
            if (resultBean.getData().get(0).getVc_cbsz()==null){
                VC_CBSZ.setText("");
            } else {
                VC_CBSZ.setText(resultBean.getData().get(0).getVc_cbsz().toString());
            }
            if (resultBean.getData().get(0).getVc_cby()==null){
                VC_CBY.setText("");
            } else {
                VC_CBY.setText(resultBean.getData().get(0).getVc_cby().toString());
            }
            if (resultBean.getData().get(0).getVc_jcdw()==null){
                VC_JCDW.setText("");
            } else {
                VC_JCDW.setText(resultBean.getData().get(0).getVc_jcdw().toString());
            }
            if (resultBean.getData().get(0).getDt_jcsj()==null){
                DT_JCSJ.setText("");
            } else {
                DT_JCSJ.setText(resultBean.getData().get(0).getDt_jcsj().toString());
            }
            if (resultBean.getData().get(0).getVc_gfmc()==null){
                VC_GFMC.setText("");
            } else {
                VC_GFMC.setText(resultBean.getData().get(0).getVc_gfmc().toString());
            }
            if (resultBean.getData().get(0).getVc_nzl()==null){
                VC_NZL.setText("");
            } else {
                VC_NZL.setText(resultBean.getData().get(0).getVc_nzl().toString());
            }
            if (resultBean.getData().get(0).getVc_sjzl()==null){
                VC_SJZL.setText("");
            } else {
                VC_SJZL.setText(resultBean.getData().get(0).getVc_sjzl().toString());
            }
            if (resultBean.getData().get(0).getVc_gfclfs()==null){
                VC_GFCLFS.setText("");
            } else {
                VC_GFCLFS.setText(resultBean.getData().get(0).getVc_gfclfs().toString());
            }
            if (resultBean.getData().get(0).getCh_wkdcfs()==null){
                CH_WKDCFS.setText("");
            } else {
                CH_WKDCFS.setText(resultBean.getData().get(0).getCh_wkdcfs().toString());
            }
            if (resultBean.getData().get(0).getCh_wkysfs()==null){
                CH_WKSSFS.setText("");
            } else {
                CH_WKSSFS.setText(resultBean.getData().get(0).getCh_wkysfs().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjywkk()==null){
                CH_SFJYWKK.setText("");
            } else {
                CH_SFJYWKK.setText(resultBean.getData().get(0).getCh_sfjywkk().toString());
            }
            if (resultBean.getData().get(0).getVc_wkkysjkr()==null){
                VC_WKKYSJKR.setText("");
            } else {
                VC_WKKYSJKR.setText(resultBean.getData().get(0).getVc_wkkysjkr().toString());
            }
            if (resultBean.getData().get(0).getVc_sjwkdcbg()==null){
                VC_SJWKDCBG.setText("");
            } else {
                VC_SJWKDCBG.setText(resultBean.getData().get(0).getVc_sjwkdcbg().toString());
            }
            if (resultBean.getData().get(0).getVc_mqljsykr()==null){
                VC_MQLJSYKR.setText("");
            } else {
                VC_MQLJSYKR.setText(resultBean.getData().get(0).getVc_mqljsykr().toString());
            }
            if (resultBean.getData().get(0).getVc_sykr()==null){
                VC_SYKR.setText("");
            } else {
                VC_SYKR.setText(resultBean.getData().get(0).getVc_sykr().toString());
            }
            if (resultBean.getData().get(0).getVc_wkksynx()==null){
                VC_WKKSYNX.setText("");
            } else {
                VC_WKKSYNX.setText(resultBean.getData().get(0).getVc_wkksynx().toString());
            }
            if (resultBean.getData().get(0).getVc_gfclfs2()==null){
                VC_GFCLFS2.setText("");
            } else {
                VC_GFCLFS2.setText(resultBean.getData().get(0).getVc_gfclfs2().toString());
            }
            if (resultBean.getData().get(0).getVc_gfclfs3()==null){
                VC_GFCLFS3.setText("");
            } else {
                VC_GFCLFS3.setText(resultBean.getData().get(0).getVc_gfclfs3().toString());
            }
            if (resultBean.getData().get(0).getCh_sfwwxy()==null){
                CH_SFWWXY.setText("");
            } else {
                CH_SFWWXY.setText(resultBean.getData().get(0).getCh_sfwwxy().toString());
            }
            if (resultBean.getData().get(0).getCh_jssffeyq()==null){
                CH_JSSFFEYQ.setText("");
            } else {
                CH_JSSFFEYQ.setText(resultBean.getData().get(0).getCh_jssffeyq().toString());
            }
            if (resultBean.getData().get(0).getVc_bfhdy()==null){
                VC_BFHDY.setText("");
            } else {
                VC_BFHDY.setText(resultBean.getData().get(0).getVc_bfhdy().toString());
            }
            if (resultBean.getData().get(0).getVc_ylxmcsdgygf()==null){
                VC_YLXMCSDGYGF.setText("");
            } else {
                VC_YLXMCSDGYGF.setText(resultBean.getData().get(0).getVc_ylxmcsdgygf().toString());
            }
            if (resultBean.getData().get(0).getCh_jgfsfayqdc()==null){
                CH_JGFSFAYQDC.setText("");
            } else {
                CH_JGFSFAYQDC.setText(resultBean.getData().get(0).getCh_jgfsfayqdc().toString());
            }
            if (resultBean.getData().get(0).getVc_sjwxfwmc()==null){
                VC_SJWXFWMC.setText("");
            } else {
                VC_SJWXFWMC.setText(resultBean.getData().get(0).getVc_sjwxfwmc().toString());
            }
            if (resultBean.getData().get(0).getVc_csgd()==null){
                VC_CSGD.setText("");
            } else {
                VC_CSGD.setText(resultBean.getData().get(0).getVc_csgd().toString());
            }
            if (resultBean.getData().get(0).getVc_csl()==null){
                VC_CSL.setText("");
            } else {
                VC_CSL.setText(resultBean.getData().get(0).getVc_csl().toString());
            }
            if (resultBean.getData().get(0).getVc_hpyqdcs()==null){
                VC_HPYQDCS.setText("");
            } else {
                VC_HPYQDCS.setText(resultBean.getData().get(0).getVc_hpyqdcs().toString());
            }
            if (resultBean.getData().get(0).getVc_sjczcs()==null){
                VC_SJCZCS.setText("");
            } else {
                VC_SJCZCS.setText(resultBean.getData().get(0).getVc_sjczcs().toString());
            }
            if (resultBean.getData().get(0).getCh_sfxhbdj()==null){
                CH_SFXHBDJ.setText("");
            } else {
                CH_SFXHBDJ.setText(resultBean.getData().get(0).getCh_sfxhbdj().toString());
            }
            if (resultBean.getData().get(0).getCh_sfczzy()==null){
                CH_SFCZZY.setText("");
            } else {
                CH_SFCZZY.setText(resultBean.getData().get(0).getCh_sfczzy().toString());
            }
            if (resultBean.getData().get(0).getCh_sfzxwxfwzylddzd()==null){
                CH_SFZXWXFWZYLDDZD.setText("");
            } else {
                CH_SFZXWXFWZYLDDZD.setText(resultBean.getData().get(0).getCh_sfzxwxfwzylddzd().toString());
            }
            if (resultBean.getData().get(0).getCh_jysdwsfjbzz()==null){
                CH_JYSDWSFJBZZ.setText("");
            } else {
                CH_JYSDWSFJBZZ.setText(resultBean.getData().get(0).getCh_jysdwsfjbzz().toString());
            }
            if (resultBean.getData().get(0).getCh_czsdwsfjbzz()==null){
                CH_CZSDWSFJBZZ.setText("");
            } else {
                CH_CZSDWSFJBZZ.setText(resultBean.getData().get(0).getCh_czsdwsfjbzz().toString());
            }
            if (resultBean.getData().get(0).getVc_sjczcs2()==null){
                VC_SJCZCS2.setText("");
            } else {
                VC_SJCZCS2.setText(resultBean.getData().get(0).getVc_sjczcs2().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjywfzc()==null){
                CH_SFJYWFZC.setText("");
            } else {
                CH_SFJYWFZC.setText(resultBean.getData().get(0).getCh_sfjywfzc().toString());
            }
            if (resultBean.getData().get(0).getVc_wfzcszkr()==null){
                VC_WFZCSZKR.setText("");
            } else {
                VC_WFZCSZKR.setText(resultBean.getData().get(0).getVc_wfzcszkr().toString());
            }
            if (resultBean.getData().get(0).getVc_sjdcl()==null){
                VC_SJDCL.setText("");
            } else {
                VC_SJDCL.setText(resultBean.getData().get(0).getVc_sjdcl().toString());
            }
            if (resultBean.getData().get(0).getVc_sjczcs3()==null){
                VC_SJCZCS3.setText("");
            } else {
                VC_SJCZCS3.setText(resultBean.getData().get(0).getVc_sjczcs3().toString());
            }
            if (resultBean.getData().get(0).getCh_sfjsywfsbbz()==null){
                CH_SFJSYWFSBBZ.setText("");
            } else {
                CH_SFJSYWFSBBZ.setText(resultBean.getData().get(0).getCh_sfjsywfsbbz().toString());
            }
            if (resultBean.getData().get(0).getCh_sfyybgfhd()==null){
                CH_SFYYBGFHD.setText("");
            } else {
                CH_SFYYBGFHD.setText(resultBean.getData().get(0).getCh_sfyybgfhd().toString());
            }
            if (resultBean.getData().get(0).getCh_yssfdl()==null){
                CH_YSSFDL.setText("");
            } else {
                CH_YSSFDL.setText(resultBean.getData().get(0).getCh_yssfdl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfzdwfywsgya()==null){
                CH_SFZDWFYWSGYA.setText("");
            } else {
                CH_SFZDWFYWSGYA.setText(resultBean.getData().get(0).getCh_sfzdwfywsgya().toString());
            }
            if (resultBean.getData().get(0).getCh_cqsfsywfzc()==null){
                CH_CQSFSYWFZC.setText("");
            } else {
                CH_CQSFSYWFZC.setText(resultBean.getData().get(0).getCh_cqsfsywfzc().toString());
            }
            if (resultBean.getData().get(0).getVc_pyyqwsfhjl()==null){
                VC_PYYQWSFHJL.setText("");
            } else {
                VC_PYYQWSFHJL.setText(resultBean.getData().get(0).getVc_pyyqwsfhjl().toString());
            }
            if (resultBean.getData().get(0).getCh_sfybh()==null){
                CH_SFYBH.setText("");
            } else {
                CH_SFYBH.setText(resultBean.getData().get(0).getCh_sfybh().toString());
            }
            if (resultBean.getData().get(0).getDt_bhmbzssj()==null){
                DT_BHMBZSSJ.setText("");
            } else {
                DT_BHMBZSSJ.setText(resultBean.getData().get(0).getDt_bhmbzssj().toString());
            }
            if (resultBean.getData().get(0).getVc_zbhjbhms()==null){
                VC_ZBHJBHMS.setText("");
            } else {
                VC_ZBHJBHMS.setText(resultBean.getData().get(0).getVc_zbhjbhms().toString());
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
