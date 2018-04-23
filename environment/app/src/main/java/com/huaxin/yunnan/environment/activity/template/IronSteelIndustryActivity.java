package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.IronSteelIndustryBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_GR_INFO;

/**
 * 17、钢铁行业现场监察记录
 */
public class IronSteelIndustryActivity extends BaseActicity implements View.OnClickListener, CallBack {

    private LinearLayout ll_no;
    private TextView title_text;
    private TextView DT_START_TIME;
    private TextView DT_END_TIME;
    private TextView VC_LOCATION;
    private TextView VC_JCR;
    private TextView VC_ZFZH;
    private TextView VC_JLR;
    private TextView VC_BJCDWMC;
    private TextView VC_ZZJGDMZH;
    private TextView VC_FDDBR;
    private TextView VC_FDDBRSFZH;
    private TextView VC_XCFZR;
    private TextView VC_XCFZRSFZH;
    private TextView NB_AGE;
    private TextView VC_GZDW;
    private TextView VC_DUTY;
    private TextView VC_YBAGX;
    private TextView VC_ADDRESS;
    private TextView VC_TELEPHONE;
    private TextView VC_YZBM;
    private TextView CL_QTCJRXMJGZDW;
    private TextView VC_HBDWMC;
    private TextView VC_HBDWLX;
    private TextView VC_HJJCLX;
    private TextView VC_SFQRZJ;
    private TextView VC_SFSQHB;
    private TextView VC_CITY;
    private TextView VC_COUNTY;
    private TextView VC_TOWN;
    private TextView VC_XZC;
    private TextView VC_GYYQ;
    private TextView VC_PQ;
    private TextView VC_XCJCSZT;
    private TextView VC_GCL;
    private TextView VC_TCL;
    private TextView VC_CCL;
    private TextView VC_QT;
    private TextView VC_HBSXBLJHPZDZXQK;
    private TextView VC_SFBZHPBG;
    private TextView CL_WBZQKMS;
    private TextView VC_SFJDHPDJ;
    private TextView CL_JDHPDJQKMS;
    private TextView VC_SFJGHBBMSP;
    private TextView CL_WJSPQKMS;
    private TextView VC_SFYJSP;
    private TextView CL_YJSPQKMS;
    private TextView VC_SFJGHBBMSPTY;
    private TextView CL_WJPZSZTRSSCQKMS;
    private TextView VC_SFTGHBMXMJGYS;
    private TextView VC_SSCHJTYYQSSCZJSFCGYN;
    private TextView VC_JSXMXYHPSFYBG;
    private TextView CL_BGQKMS;
    private TextView VC_SFYFQDPWXKZ;
    private TextView VC_SFAZPWXKZDGDPFWRW;
    private TextView CL_WAGDPFWRWQKMS;
    private TextView VC_SFXHJBHBMJXPWSBDJ;
    private TextView VC_SFJSZEJNPWF;
    private TextView VC_SYNDSJJNPWF;
    private TextView VC_YJPWF;
    private TextView CL_WZEJNPWFDYY;
    private TextView CL_GQYYZZPFFQWRYJPTHBSS;
    private TextView VC_HPBGJPFYQDFQZLDCCSJSSSFLS;
    private TextView CL_WLSQKMS;
    private TextView VC_FQ_JLNNJGJCSFCB;
    private TextView VC_FQ_CBYZJJCZW;
    private TextView VC_FQ_JCDW;
    private TextView DT_FQJC_TIME;
    private TextView VC_FQ_SFAZZXJCZZ;
    private TextView DT_FQAZ_TIME;
    private TextView VC_FQ_SFYHBBMLW;
    private TextView VC_FQ_SFYYZC;
    private TextView VC_FQ_SFJGJY;
    private TextView DT_FQJY_TIME;
    private TextView VC_FQ_ZXJCSJXS;
    private TextView VC_FS_SCFSCSHJ;
    private TextView VC_FS_QTHJ;
    private TextView VC_FS_CSL;
    private TextView VC_FS_SCFSCLCS;
    private TextView VC_FS_CLL;
    private TextView VC_FS_CLSFFHHPJPFYQ;
    private TextView CL_FS_BFHQKMS;
    private TextView VC_FS_SFAYQSXSHFSYSHSCFSFL;
    private TextView VC_FS_SFXZSSAGGQSBDTP;
    private TextView CL_FS_QKSM;
    private TextView VC_FS_JLNJGJCSFCB;
    private TextView VC_FS_CBYZJJCZ;
    private TextView VC_FS_JCDW;
    private TextView DT_FSJC_TIME;
    private TextView VC_FS_ZXJCZZSFAZ;
    private TextView DT_FSAN_TIME;
    private TextView VC_FS_SFYHBBMLW;
    private TextView VC_FS_SFYXZC;
    private TextView VC_FS_SFJGJY;
    private TextView DT_FSJY_TIME;
    private TextView VC_FS_ZXJCSJ;
    private TextView VC_FS_JYZCSL;
    private TextView VC_FS_JYZCLFS;
    private TextView VC_FS_FYCSL;
    private TextView VC_FS_FYCLFS;
    private TextView CL_FS_QTWXFWZLJCSL;
    private TextView VC_FS_QTCLFS;
    private TextView VC_FS_WXFWTZSFJQGF;
    private TextView VC_FS_CSJCZQKSFXHBBMSB;
    private TextView VC_FS_WSBDYNX;
    private TextView VC_FS_SFZDLWXFWYWSGFFCSHYJYA;
    private TextView VC_FS_WXFWCFKHCDSFSYBS;
    private TextView VC_FS_SFFHWXFWCCGF;
    private TextView VC_FS_SFCZWXFWYYBGFHD;
    private TextView VC_FS_ZCNLSCFDCSJSFCGYN;
    private TextView VC_FS_ZCWSFJSYYJXDCZC;
    private TextView VC_FS_RZYCCSFZXWXFWZYLDZD;
    private TextView VC_FS_YSCLSFJYXGZZ;
    private TextView VC_FS_YSL;
    private TextView VC_FS_PC;
    private TextView VC_FS_JSDWSFJYWXJYZZ;
    private TextView VC_FS_SJCZFS;
    private TextView VC_FS_YBGFDCLFSSFFHHPJPFYQ;
    private TextView VC_FS_BFHQKMS;
    private TextView VC_FS_GCZSBSFAHPJPFYQCQGZJZ;
    private TextView VC_FS_WLSQKMS;
    private TextView VC_HPYQDWSFHJL;
    private TextView VC_GJLNSFYBHMB;
    private TextView DT_BHMBJS_TIME;
    private TextView CL_ZBHJBHQKMS;
    private TextView VC_HJ_SFLSHPJPFYQDFXFFDCCS;
    private TextView VC_HJ_WLSQKMS;
    private TextView VC_HJ_SFBZTFHJSJYJYA;
    private TextView VC_HJ_SFDYAJXPG;
    private TextView VC_HJ_SFAYAYQJXNDYJYL;
    private TextView VC_HJ_SFCBYJWZ;
    private TextView CL_QTHBBMJCQK;
    private TextView CL_CZZYWT;
    private TextView CL_JCYQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iron_steel_industry);
        initView();
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_GR_INFO, IronSteelIndustryBean.class, this, yNProgressDialog);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("钢铁行业现场监察记录");

        title_text.setOnClickListener(this);
        DT_START_TIME = (TextView) findViewById(R.id.DT_START_TIME);
        DT_START_TIME.setOnClickListener(this);
        DT_END_TIME = (TextView) findViewById(R.id.DT_END_TIME);
        DT_END_TIME.setOnClickListener(this);
        VC_LOCATION = (TextView) findViewById(R.id.VC_LOCATION);
        VC_LOCATION.setOnClickListener(this);
        VC_JCR = (TextView) findViewById(R.id.VC_JCR);
        VC_JCR.setOnClickListener(this);
        VC_ZFZH = (TextView) findViewById(R.id.VC_ZFZH);
        VC_ZFZH.setOnClickListener(this);
        VC_JLR = (TextView) findViewById(R.id.VC_JLR);
        VC_JLR.setOnClickListener(this);
        VC_BJCDWMC = (TextView) findViewById(R.id.VC_BJCDWMC);
        VC_BJCDWMC.setOnClickListener(this);
        VC_ZZJGDMZH = (TextView) findViewById(R.id.VC_ZZJGDMZH);
        VC_ZZJGDMZH.setOnClickListener(this);
        VC_FDDBR = (TextView) findViewById(R.id.VC_FDDBR);
        VC_FDDBR.setOnClickListener(this);
        VC_FDDBRSFZH = (TextView) findViewById(R.id.VC_FDDBRSFZH);
        VC_FDDBRSFZH.setOnClickListener(this);
        VC_XCFZR = (TextView) findViewById(R.id.VC_XCFZR);
        VC_XCFZR.setOnClickListener(this);
        VC_XCFZRSFZH = (TextView) findViewById(R.id.VC_XCFZRSFZH);
        VC_XCFZRSFZH.setOnClickListener(this);
        NB_AGE = (TextView) findViewById(R.id.NB_AGE);
        NB_AGE.setOnClickListener(this);
        VC_GZDW = (TextView) findViewById(R.id.VC_GZDW);
        VC_GZDW.setOnClickListener(this);
        VC_DUTY = (TextView) findViewById(R.id.VC_DUTY);
        VC_DUTY.setOnClickListener(this);
        VC_YBAGX = (TextView) findViewById(R.id.VC_YBAGX);
        VC_YBAGX.setOnClickListener(this);
        VC_ADDRESS = (TextView) findViewById(R.id.VC_ADDRESS);
        VC_ADDRESS.setOnClickListener(this);
        VC_TELEPHONE = (TextView) findViewById(R.id.VC_TELEPHONE);
        VC_TELEPHONE.setOnClickListener(this);
        VC_YZBM = (TextView) findViewById(R.id.VC_YZBM);
        VC_YZBM.setOnClickListener(this);
        CL_QTCJRXMJGZDW = (TextView) findViewById(R.id.CL_QTCJRXMJGZDW);
        CL_QTCJRXMJGZDW.setOnClickListener(this);
        VC_HBDWMC = (TextView) findViewById(R.id.VC_HBDWMC);
        VC_HBDWMC.setOnClickListener(this);
        VC_HBDWLX = (TextView) findViewById(R.id.VC_HBDWLX);
        VC_HBDWLX.setOnClickListener(this);
        VC_HJJCLX = (TextView) findViewById(R.id.VC_HJJCLX);
        VC_HJJCLX.setOnClickListener(this);
        VC_SFQRZJ = (TextView) findViewById(R.id.VC_SFQRZJ);
        VC_SFQRZJ.setOnClickListener(this);
        VC_SFSQHB = (TextView) findViewById(R.id.VC_SFSQHB);
        VC_SFSQHB.setOnClickListener(this);
        VC_CITY = (TextView) findViewById(R.id.VC_CITY);
        VC_CITY.setOnClickListener(this);
        VC_COUNTY = (TextView) findViewById(R.id.VC_COUNTY);
        VC_COUNTY.setOnClickListener(this);
        VC_TOWN = (TextView) findViewById(R.id.VC_TOWN);
        VC_TOWN.setOnClickListener(this);
        VC_XZC = (TextView) findViewById(R.id.VC_XZC);
        VC_XZC.setOnClickListener(this);
        VC_GYYQ = (TextView) findViewById(R.id.VC_GYYQ);
        VC_GYYQ.setOnClickListener(this);
        VC_PQ = (TextView) findViewById(R.id.VC_PQ);
        VC_PQ.setOnClickListener(this);
        VC_XCJCSZT = (TextView) findViewById(R.id.VC_XCJCSZT);
        VC_XCJCSZT.setOnClickListener(this);
        VC_GCL = (TextView) findViewById(R.id.VC_GCL);
        VC_GCL.setOnClickListener(this);
        VC_TCL = (TextView) findViewById(R.id.VC_TCL);
        VC_TCL.setOnClickListener(this);
        VC_CCL = (TextView) findViewById(R.id.VC_CCL);
        VC_CCL.setOnClickListener(this);
        VC_QT = (TextView) findViewById(R.id.VC_QT);
        VC_QT.setOnClickListener(this);
        VC_HBSXBLJHPZDZXQK = (TextView) findViewById(R.id.VC_HBSXBLJHPZDZXQK);
        VC_HBSXBLJHPZDZXQK.setOnClickListener(this);
        VC_SFBZHPBG = (TextView) findViewById(R.id.VC_SFBZHPBG);
        VC_SFBZHPBG.setOnClickListener(this);
        CL_WBZQKMS = (TextView) findViewById(R.id.CL_WBZQKMS);
        CL_WBZQKMS.setOnClickListener(this);
        VC_SFJDHPDJ = (TextView) findViewById(R.id.VC_SFJDHPDJ);
        VC_SFJDHPDJ.setOnClickListener(this);
        CL_JDHPDJQKMS = (TextView) findViewById(R.id.CL_JDHPDJQKMS);
        CL_JDHPDJQKMS.setOnClickListener(this);
        VC_SFJGHBBMSP = (TextView) findViewById(R.id.VC_SFJGHBBMSP);
        VC_SFJGHBBMSP.setOnClickListener(this);
        CL_WJSPQKMS = (TextView) findViewById(R.id.CL_WJSPQKMS);
        CL_WJSPQKMS.setOnClickListener(this);
        VC_SFYJSP = (TextView) findViewById(R.id.VC_SFYJSP);
        VC_SFYJSP.setOnClickListener(this);
        CL_YJSPQKMS = (TextView) findViewById(R.id.CL_YJSPQKMS);
        CL_YJSPQKMS.setOnClickListener(this);
        VC_SFJGHBBMSPTY = (TextView) findViewById(R.id.VC_SFJGHBBMSPTY);
        VC_SFJGHBBMSPTY.setOnClickListener(this);
        CL_WJPZSZTRSSCQKMS = (TextView) findViewById(R.id.CL_WJPZSZTRSSCQKMS);
        CL_WJPZSZTRSSCQKMS.setOnClickListener(this);
        VC_SFTGHBMXMJGYS = (TextView) findViewById(R.id.VC_SFTGHBMXMJGYS);
        VC_SFTGHBMXMJGYS.setOnClickListener(this);
        VC_SSCHJTYYQSSCZJSFCGYN = (TextView) findViewById(R.id.VC_SSCHJTYYQSSCZJSFCGYN);
        VC_SSCHJTYYQSSCZJSFCGYN.setOnClickListener(this);
        VC_JSXMXYHPSFYBG = (TextView) findViewById(R.id.VC_JSXMXYHPSFYBG);
        VC_JSXMXYHPSFYBG.setOnClickListener(this);
        CL_BGQKMS = (TextView) findViewById(R.id.CL_BGQKMS);
        CL_BGQKMS.setOnClickListener(this);
        VC_SFYFQDPWXKZ = (TextView) findViewById(R.id.VC_SFYFQDPWXKZ);
        VC_SFYFQDPWXKZ.setOnClickListener(this);
        VC_SFAZPWXKZDGDPFWRW = (TextView) findViewById(R.id.VC_SFAZPWXKZDGDPFWRW);
        VC_SFAZPWXKZDGDPFWRW.setOnClickListener(this);
        CL_WAGDPFWRWQKMS = (TextView) findViewById(R.id.CL_WAGDPFWRWQKMS);
        CL_WAGDPFWRWQKMS.setOnClickListener(this);
        VC_SFXHJBHBMJXPWSBDJ = (TextView) findViewById(R.id.VC_SFXHJBHBMJXPWSBDJ);
        VC_SFXHJBHBMJXPWSBDJ.setOnClickListener(this);
        VC_SFJSZEJNPWF = (TextView) findViewById(R.id.VC_SFJSZEJNPWF);
        VC_SFJSZEJNPWF.setOnClickListener(this);
        VC_SYNDSJJNPWF = (TextView) findViewById(R.id.VC_SYNDSJJNPWF);
        VC_SYNDSJJNPWF.setOnClickListener(this);
        VC_YJPWF = (TextView) findViewById(R.id.VC_YJPWF);
        VC_YJPWF.setOnClickListener(this);
        CL_WZEJNPWFDYY = (TextView) findViewById(R.id.CL_WZEJNPWFDYY);
        CL_WZEJNPWFDYY.setOnClickListener(this);
        CL_GQYYZZPFFQWRYJPTHBSS = (TextView) findViewById(R.id.CL_GQYYZZPFFQWRYJPTHBSS);
        CL_GQYYZZPFFQWRYJPTHBSS.setOnClickListener(this);
        VC_HPBGJPFYQDFQZLDCCSJSSSFLS = (TextView) findViewById(R.id.VC_HPBGJPFYQDFQZLDCCSJSSSFLS);
        VC_HPBGJPFYQDFQZLDCCSJSSSFLS.setOnClickListener(this);
        CL_WLSQKMS = (TextView) findViewById(R.id.CL_WLSQKMS);
        CL_WLSQKMS.setOnClickListener(this);
        VC_FQ_JLNNJGJCSFCB = (TextView) findViewById(R.id.VC_FQ_JLNNJGJCSFCB);
        VC_FQ_JLNNJGJCSFCB.setOnClickListener(this);
        VC_FQ_CBYZJJCZW = (TextView) findViewById(R.id.VC_FQ_CBYZJJCZW);
        VC_FQ_CBYZJJCZW.setOnClickListener(this);
        VC_FQ_JCDW = (TextView) findViewById(R.id.VC_FQ_JCDW);
        VC_FQ_JCDW.setOnClickListener(this);
        DT_FQJC_TIME = (TextView) findViewById(R.id.DT_FQJC_TIME);
        DT_FQJC_TIME.setOnClickListener(this);
        VC_FQ_SFAZZXJCZZ = (TextView) findViewById(R.id.VC_FQ_SFAZZXJCZZ);
        VC_FQ_SFAZZXJCZZ.setOnClickListener(this);
        DT_FQAZ_TIME = (TextView) findViewById(R.id.DT_FQAZ_TIME);
        DT_FQAZ_TIME.setOnClickListener(this);
        VC_FQ_SFYHBBMLW = (TextView) findViewById(R.id.VC_FQ_SFYHBBMLW);
        VC_FQ_SFYHBBMLW.setOnClickListener(this);
        VC_FQ_SFYYZC = (TextView) findViewById(R.id.VC_FQ_SFYYZC);
        VC_FQ_SFYYZC.setOnClickListener(this);
        VC_FQ_SFJGJY = (TextView) findViewById(R.id.VC_FQ_SFJGJY);
        VC_FQ_SFJGJY.setOnClickListener(this);
        DT_FQJY_TIME = (TextView) findViewById(R.id.DT_FQJY_TIME);
        DT_FQJY_TIME.setOnClickListener(this);
        VC_FQ_ZXJCSJXS = (TextView) findViewById(R.id.VC_FQ_ZXJCSJXS);
        VC_FQ_ZXJCSJXS.setOnClickListener(this);
        VC_FS_SCFSCSHJ = (TextView) findViewById(R.id.VC_FS_SCFSCSHJ);
        VC_FS_SCFSCSHJ.setOnClickListener(this);
        VC_FS_QTHJ = (TextView) findViewById(R.id.VC_FS_QTHJ);
        VC_FS_QTHJ.setOnClickListener(this);
        VC_FS_CSL = (TextView) findViewById(R.id.VC_FS_CSL);
        VC_FS_CSL.setOnClickListener(this);
        VC_FS_SCFSCLCS = (TextView) findViewById(R.id.VC_FS_SCFSCLCS);
        VC_FS_SCFSCLCS.setOnClickListener(this);
        VC_FS_CLL = (TextView) findViewById(R.id.VC_FS_CLL);
        VC_FS_CLL.setOnClickListener(this);
        VC_FS_CLSFFHHPJPFYQ = (TextView) findViewById(R.id.VC_FS_CLSFFHHPJPFYQ);
        VC_FS_CLSFFHHPJPFYQ.setOnClickListener(this);
        CL_FS_BFHQKMS = (TextView) findViewById(R.id.CL_FS_BFHQKMS);
        CL_FS_BFHQKMS.setOnClickListener(this);
        VC_FS_SFAYQSXSHFSYSHSCFSFL = (TextView) findViewById(R.id.VC_FS_SFAYQSXSHFSYSHSCFSFL);
        VC_FS_SFAYQSXSHFSYSHSCFSFL.setOnClickListener(this);
        VC_FS_SFXZSSAGGQSBDTP = (TextView) findViewById(R.id.VC_FS_SFXZSSAGGQSBDTP);
        VC_FS_SFXZSSAGGQSBDTP.setOnClickListener(this);
        CL_FS_QKSM = (TextView) findViewById(R.id.CL_FS_QKSM);
        CL_FS_QKSM.setOnClickListener(this);
        VC_FS_JLNJGJCSFCB = (TextView) findViewById(R.id.VC_FS_JLNJGJCSFCB);
        VC_FS_JLNJGJCSFCB.setOnClickListener(this);
        VC_FS_CBYZJJCZ = (TextView) findViewById(R.id.VC_FS_CBYZJJCZ);
        VC_FS_CBYZJJCZ.setOnClickListener(this);
        VC_FS_JCDW = (TextView) findViewById(R.id.VC_FS_JCDW);
        VC_FS_JCDW.setOnClickListener(this);
        DT_FSJC_TIME = (TextView) findViewById(R.id.DT_FSJC_TIME);
        DT_FSJC_TIME.setOnClickListener(this);
        VC_FS_ZXJCZZSFAZ = (TextView) findViewById(R.id.VC_FS_ZXJCZZSFAZ);
        VC_FS_ZXJCZZSFAZ.setOnClickListener(this);
        DT_FSAN_TIME = (TextView) findViewById(R.id.DT_FSAN_TIME);
        DT_FSAN_TIME.setOnClickListener(this);
        VC_FS_SFYHBBMLW = (TextView) findViewById(R.id.VC_FS_SFYHBBMLW);
        VC_FS_SFYHBBMLW.setOnClickListener(this);
        VC_FS_SFYXZC = (TextView) findViewById(R.id.VC_FS_SFYXZC);
        VC_FS_SFYXZC.setOnClickListener(this);
        VC_FS_SFJGJY = (TextView) findViewById(R.id.VC_FS_SFJGJY);
        VC_FS_SFJGJY.setOnClickListener(this);
        DT_FSJY_TIME = (TextView) findViewById(R.id.DT_FSJY_TIME);
        DT_FSJY_TIME.setOnClickListener(this);
        VC_FS_ZXJCSJ = (TextView) findViewById(R.id.VC_FS_ZXJCSJ);
        VC_FS_ZXJCSJ.setOnClickListener(this);
        VC_FS_JYZCSL = (TextView) findViewById(R.id.VC_FS_JYZCSL);
        VC_FS_JYZCSL.setOnClickListener(this);
        VC_FS_JYZCLFS = (TextView) findViewById(R.id.VC_FS_JYZCLFS);
        VC_FS_JYZCLFS.setOnClickListener(this);
        VC_FS_FYCSL = (TextView) findViewById(R.id.VC_FS_FYCSL);
        VC_FS_FYCSL.setOnClickListener(this);
        VC_FS_FYCLFS = (TextView) findViewById(R.id.VC_FS_FYCLFS);
        VC_FS_FYCLFS.setOnClickListener(this);
        CL_FS_QTWXFWZLJCSL = (TextView) findViewById(R.id.CL_FS_QTWXFWZLJCSL);
        CL_FS_QTWXFWZLJCSL.setOnClickListener(this);
        VC_FS_QTCLFS = (TextView) findViewById(R.id.VC_FS_QTCLFS);
        VC_FS_QTCLFS.setOnClickListener(this);
        VC_FS_WXFWTZSFJQGF = (TextView) findViewById(R.id.VC_FS_WXFWTZSFJQGF);
        VC_FS_WXFWTZSFJQGF.setOnClickListener(this);
        VC_FS_CSJCZQKSFXHBBMSB = (TextView) findViewById(R.id.VC_FS_CSJCZQKSFXHBBMSB);
        VC_FS_CSJCZQKSFXHBBMSB.setOnClickListener(this);
        VC_FS_WSBDYNX = (TextView) findViewById(R.id.VC_FS_WSBDYNX);
        VC_FS_WSBDYNX.setOnClickListener(this);
        VC_FS_SFZDLWXFWYWSGFFCSHYJYA = (TextView) findViewById(R.id.VC_FS_SFZDLWXFWYWSGFFCSHYJYA);
        VC_FS_SFZDLWXFWYWSGFFCSHYJYA.setOnClickListener(this);
        VC_FS_WXFWCFKHCDSFSYBS = (TextView) findViewById(R.id.VC_FS_WXFWCFKHCDSFSYBS);
        VC_FS_WXFWCFKHCDSFSYBS.setOnClickListener(this);
        VC_FS_SFFHWXFWCCGF = (TextView) findViewById(R.id.VC_FS_SFFHWXFWCCGF);
        VC_FS_SFFHWXFWCCGF.setOnClickListener(this);
        VC_FS_SFCZWXFWYYBGFHD = (TextView) findViewById(R.id.VC_FS_SFCZWXFWYYBGFHD);
        VC_FS_SFCZWXFWYYBGFHD.setOnClickListener(this);
        VC_FS_ZCNLSCFDCSJSFCGYN = (TextView) findViewById(R.id.VC_FS_ZCNLSCFDCSJSFCGYN);
        VC_FS_ZCNLSCFDCSJSFCGYN.setOnClickListener(this);
        VC_FS_ZCWSFJSYYJXDCZC = (TextView) findViewById(R.id.VC_FS_ZCWSFJSYYJXDCZC);
        VC_FS_ZCWSFJSYYJXDCZC.setOnClickListener(this);
        VC_FS_RZYCCSFZXWXFWZYLDZD = (TextView) findViewById(R.id.VC_FS_RZYCCSFZXWXFWZYLDZD);
        VC_FS_RZYCCSFZXWXFWZYLDZD.setOnClickListener(this);
        VC_FS_YSCLSFJYXGZZ = (TextView) findViewById(R.id.VC_FS_YSCLSFJYXGZZ);
        VC_FS_YSCLSFJYXGZZ.setOnClickListener(this);
        VC_FS_YSL = (TextView) findViewById(R.id.VC_FS_YSL);
        VC_FS_YSL.setOnClickListener(this);
        VC_FS_PC = (TextView) findViewById(R.id.VC_FS_PC);
        VC_FS_PC.setOnClickListener(this);
        VC_FS_JSDWSFJYWXJYZZ = (TextView) findViewById(R.id.VC_FS_JSDWSFJYWXJYZZ);
        VC_FS_JSDWSFJYWXJYZZ.setOnClickListener(this);
        VC_FS_SJCZFS = (TextView) findViewById(R.id.VC_FS_SJCZFS);
        VC_FS_SJCZFS.setOnClickListener(this);
        VC_FS_YBGFDCLFSSFFHHPJPFYQ = (TextView) findViewById(R.id.VC_FS_YBGFDCLFSSFFHHPJPFYQ);
        VC_FS_YBGFDCLFSSFFHHPJPFYQ.setOnClickListener(this);
        VC_FS_BFHQKMS = (TextView) findViewById(R.id.VC_FS_BFHQKMS);
        VC_FS_BFHQKMS.setOnClickListener(this);
        VC_FS_GCZSBSFAHPJPFYQCQGZJZ = (TextView) findViewById(R.id.VC_FS_GCZSBSFAHPJPFYQCQGZJZ);
        VC_FS_GCZSBSFAHPJPFYQCQGZJZ.setOnClickListener(this);
        VC_FS_WLSQKMS = (TextView) findViewById(R.id.VC_FS_WLSQKMS);
        VC_FS_WLSQKMS.setOnClickListener(this);
        VC_HPYQDWSFHJL = (TextView) findViewById(R.id.VC_HPYQDWSFHJL);
        VC_HPYQDWSFHJL.setOnClickListener(this);
        VC_GJLNSFYBHMB = (TextView) findViewById(R.id.VC_GJLNSFYBHMB);
        VC_GJLNSFYBHMB.setOnClickListener(this);
        DT_BHMBJS_TIME = (TextView) findViewById(R.id.DT_BHMBJS_TIME);
        DT_BHMBJS_TIME.setOnClickListener(this);
        CL_ZBHJBHQKMS = (TextView) findViewById(R.id.CL_ZBHJBHQKMS);
        CL_ZBHJBHQKMS.setOnClickListener(this);
        VC_HJ_SFLSHPJPFYQDFXFFDCCS = (TextView) findViewById(R.id.VC_HJ_SFLSHPJPFYQDFXFFDCCS);
        VC_HJ_SFLSHPJPFYQDFXFFDCCS.setOnClickListener(this);
        VC_HJ_WLSQKMS = (TextView) findViewById(R.id.VC_HJ_WLSQKMS);
        VC_HJ_WLSQKMS.setOnClickListener(this);
        VC_HJ_SFBZTFHJSJYJYA = (TextView) findViewById(R.id.VC_HJ_SFBZTFHJSJYJYA);
        VC_HJ_SFBZTFHJSJYJYA.setOnClickListener(this);
        VC_HJ_SFDYAJXPG = (TextView) findViewById(R.id.VC_HJ_SFDYAJXPG);
        VC_HJ_SFDYAJXPG.setOnClickListener(this);
        VC_HJ_SFAYAYQJXNDYJYL = (TextView) findViewById(R.id.VC_HJ_SFAYAYQJXNDYJYL);
        VC_HJ_SFAYAYQJXNDYJYL.setOnClickListener(this);
        VC_HJ_SFCBYJWZ = (TextView) findViewById(R.id.VC_HJ_SFCBYJWZ);
        VC_HJ_SFCBYJWZ.setOnClickListener(this);
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
        IronSteelIndustryBean resultBean = (IronSteelIndustryBean) o;
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
            if (resultBean.getData().get(0).getVc_jcr()==null){
                VC_JCR.setText("");
            }else {
                VC_JCR.setText(resultBean.getData().get(0).getVc_jcr().toString());
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
            if (resultBean.getData().get(0).getVc_bjcdwmc()==null){
                VC_BJCDWMC.setText("");
            }else {
                VC_BJCDWMC.setText(resultBean.getData().get(0).getVc_bjcdwmc().toString());
            }
            if (resultBean.getData().get(0).getVc_zzjgdmzh()==null){
                VC_ZZJGDMZH.setText("");
            }else {
                VC_ZZJGDMZH.setText(resultBean.getData().get(0).getVc_zzjgdmzh().toString());
            }
            if (resultBean.getData().get(0).getVc_fddbr()==null){
                VC_FDDBR.setText("");
            }else {
                VC_FDDBR.setText(resultBean.getData().get(0).getVc_fddbr().toString());
            }
            if (resultBean.getData().get(0).getVc_fddbrsfzh()==null){
                VC_FDDBRSFZH.setText("");
            }else {
                VC_FDDBRSFZH.setText(resultBean.getData().get(0).getVc_fddbrsfzh().toString());
            }
            if (resultBean.getData().get(0).getVc_xcfzr()==null){
                VC_XCFZR.setText("");
            }else {
                VC_XCFZR.setText(resultBean.getData().get(0).getVc_xcfzr().toString());
            }
            if (resultBean.getData().get(0).getVc_xcfzrsfzh()==null){
                VC_XCFZRSFZH.setText("");
            }else {
                VC_XCFZRSFZH.setText(resultBean.getData().get(0).getVc_xcfzrsfzh().toString());
            }
            if (resultBean.getData().get(0).getNb_age()==null){
                NB_AGE.setText("");
            }else {
                NB_AGE.setText(resultBean.getData().get(0).getNb_age().toString());
            }
            if (resultBean.getData().get(0).getVc_gzdw()==null){
                VC_GZDW.setText("");
            }else {
                VC_GZDW.setText(resultBean.getData().get(0).getVc_gzdw().toString());
            }
            if (resultBean.getData().get(0).getVc_duty()==null){
                VC_DUTY.setText("");
            }else {
                VC_DUTY.setText(resultBean.getData().get(0).getVc_duty().toString());
            }
            if (resultBean.getData().get(0).getVc_ybagx()==null){
                VC_YBAGX.setText("");
            }else {
                VC_YBAGX.setText(resultBean.getData().get(0).getVc_ybagx().toString());
            }
            if (resultBean.getData().get(0).getVc_address()==null){
                VC_ADDRESS.setText("");
            }else {
                VC_ADDRESS.setText(resultBean.getData().get(0).getVc_address().toString());
            }
            if (resultBean.getData().get(0).getVc_telephone()==null){
                VC_TELEPHONE.setText("");
            }else {
                VC_TELEPHONE.setText(resultBean.getData().get(0).getVc_telephone().toString());
            }
            if (resultBean.getData().get(0).getVc_yzbm()==null){
                VC_YZBM.setText("");
            }else {
                VC_YZBM.setText(resultBean.getData().get(0).getVc_yzbm().toString());
            }
            if (resultBean.getData().get(0).getCl_qtcjrxmjgzdw()==null){
                CL_QTCJRXMJGZDW.setText("");
            }else {
                CL_QTCJRXMJGZDW.setText(resultBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());
            }
            if (resultBean.getData().get(0).getVc_hbdwmc()==null){
                VC_HBDWMC.setText("");
            }else {
                VC_HBDWMC.setText(resultBean.getData().get(0).getVc_hbdwmc().toString());
            }
            if (resultBean.getData().get(0).getVc_hbdwlx()==null){
                VC_HBDWLX.setText("");
            }else {
                VC_HBDWLX.setText(resultBean.getData().get(0).getVc_hbdwlx().toString());
            }
            if (resultBean.getData().get(0).getVc_hjjclx()==null){
                VC_HJJCLX.setText("");
            }else {
                VC_HJJCLX.setText(resultBean.getData().get(0).getVc_hjjclx().toString());
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
            if (resultBean.getData().get(0).getVc_city()==null){
                VC_CITY.setText("");
            }else {
                VC_CITY.setText(resultBean.getData().get(0).getVc_city().toString());
            }
            if (resultBean.getData().get(0).getVc_county()==null){
                VC_COUNTY.setText("");
            }else {
                VC_COUNTY.setText(resultBean.getData().get(0).getVc_county().toString());
            }
            if (resultBean.getData().get(0).getVc_town()==null){
                VC_TOWN.setText("");
            }else {
                VC_TOWN.setText(resultBean.getData().get(0).getVc_town().toString());
            }
            if (resultBean.getData().get(0).getVc_xzc()==null){
                VC_XZC.setText("");
            }else {
                VC_XZC.setText(resultBean.getData().get(0).getVc_xzc().toString());
            }
            if (resultBean.getData().get(0).getVc_gyyq()==null){
                VC_GYYQ.setText("");
            }else {
                VC_GYYQ.setText(resultBean.getData().get(0).getVc_gyyq().toString());
            }
            if (resultBean.getData().get(0).getVc_pq()==null){
                VC_PQ.setText("");
            }else {
                VC_PQ.setText(resultBean.getData().get(0).getVc_pq().toString());
            }
            if (resultBean.getData().get(0).getVc_xcjcszt()==null){
                VC_XCJCSZT.setText("");
            }else {
                VC_XCJCSZT.setText(resultBean.getData().get(0).getVc_xcjcszt().toString());
            }
            if (resultBean.getData().get(0).getVc_gcl()==null){
                VC_GCL.setText("");
            }else {
                VC_GCL.setText(resultBean.getData().get(0).getVc_gcl().toString());
            }
            if (resultBean.getData().get(0).getVc_tcl()==null){
                VC_TCL.setText("");
            }else {
                VC_TCL.setText(resultBean.getData().get(0).getVc_tcl().toString());
            }
            if (resultBean.getData().get(0).getVc_ccl()==null){
                VC_CCL.setText("");
            }else {
                VC_CCL.setText(resultBean.getData().get(0).getVc_ccl().toString());
            }
            if (resultBean.getData().get(0).getVc_qt()==null){
                VC_QT.setText("");
            }else {
                VC_QT.setText(resultBean.getData().get(0).getVc_qt().toString());
            }
            if (resultBean.getData().get(0).getVc_hbsxbljhpzdzxqk()==null){
                VC_HBSXBLJHPZDZXQK.setText("");
            }else {
                VC_HBSXBLJHPZDZXQK.setText(resultBean.getData().get(0).getVc_hbsxbljhpzdzxqk().toString());
            }
            if (resultBean.getData().get(0).getVc_sfbzhpbg()==null){
                VC_SFBZHPBG.setText("");
            }else {
                VC_SFBZHPBG.setText(resultBean.getData().get(0).getVc_sfbzhpbg().toString());
            }
            if (resultBean.getData().get(0).getCl_wbzqkms()==null){
                CL_WBZQKMS.setText("");
            }else {
                CL_WBZQKMS.setText(resultBean.getData().get(0).getCl_wbzqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjdhpdj()==null){
                VC_SFJDHPDJ.setText("");
            }else {
                VC_SFJDHPDJ.setText(resultBean.getData().get(0).getVc_sfjdhpdj().toString());
            }
            if (resultBean.getData().get(0).getCl_jdhpdjqkms()==null){
                CL_JDHPDJQKMS.setText("");
            }else {
                CL_JDHPDJQKMS.setText(resultBean.getData().get(0).getCl_jdhpdjqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjghbbmsp()==null){
                VC_SFJGHBBMSP.setText("");
            }else {
                VC_SFJGHBBMSP.setText(resultBean.getData().get(0).getVc_sfjghbbmsp().toString());
            }
            if (resultBean.getData().get(0).getCl_wjspqkms()==null){
                CL_WJSPQKMS.setText("");
            }else {
                CL_WJSPQKMS.setText(resultBean.getData().get(0).getCl_wjspqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sfyjsp()==null){
                VC_SFYJSP.setText("");
            }else {
                VC_SFYJSP.setText(resultBean.getData().get(0).getVc_sfyjsp().toString());
            }
            if (resultBean.getData().get(0).getCl_yjspqkms()==null){
                CL_YJSPQKMS.setText("");
            }else {
                CL_YJSPQKMS.setText(resultBean.getData().get(0).getCl_yjspqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjghbbmspty()==null){
                VC_SFJGHBBMSPTY.setText("");
            }else {
                VC_SFJGHBBMSPTY.setText(resultBean.getData().get(0).getVc_sfjghbbmspty().toString());
            }
            if (resultBean.getData().get(0).getCl_wjpzsztrsscqkms()==null){
                CL_WJPZSZTRSSCQKMS.setText("");
            }else {
                CL_WJPZSZTRSSCQKMS.setText(resultBean.getData().get(0).getCl_wjpzsztrsscqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sftghbmxmjgys()==null){
                VC_SFTGHBMXMJGYS.setText("");
            }else {
                VC_SFTGHBMXMJGYS.setText(resultBean.getData().get(0).getVc_sftghbmxmjgys().toString());
            }
            if (resultBean.getData().get(0).getVc_sschjtyyqssczjsfcgyn()==null){
                VC_SSCHJTYYQSSCZJSFCGYN.setText("");
            }else {
                VC_SSCHJTYYQSSCZJSFCGYN.setText(resultBean.getData().get(0).getVc_sschjtyyqssczjsfcgyn().toString());
            }
            if (resultBean.getData().get(0).getVc_jsxmxyhpsfybg()==null){
                VC_JSXMXYHPSFYBG.setText("");
            }else {
                VC_JSXMXYHPSFYBG.setText(resultBean.getData().get(0).getVc_jsxmxyhpsfybg().toString());
            }
            if (resultBean.getData().get(0).getCl_bgqkms()==null){
                CL_BGQKMS.setText("");
            }else {
                CL_BGQKMS.setText(resultBean.getData().get(0).getCl_bgqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sfyfqdpwxkz()==null){
                VC_SFYFQDPWXKZ.setText("");
            }else {
                VC_SFYFQDPWXKZ.setText(resultBean.getData().get(0).getVc_sfyfqdpwxkz().toString());
            }
            if (resultBean.getData().get(0).getVc_sfazpwxkzdgdpfwrw()==null){
                VC_SFAZPWXKZDGDPFWRW.setText("");
            }else {
                VC_SFAZPWXKZDGDPFWRW.setText(resultBean.getData().get(0).getVc_sfazpwxkzdgdpfwrw().toString());
            }
            if (resultBean.getData().get(0).getCl_wagdpfwrwqkms()==null){
                CL_WAGDPFWRWQKMS.setText("");
            }else {
                CL_WAGDPFWRWQKMS.setText(resultBean.getData().get(0).getCl_wagdpfwrwqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_sfxhjbhbmjxpwsbdj()==null){
                VC_SFXHJBHBMJXPWSBDJ.setText("");
            }else {
                VC_SFXHJBHBMJXPWSBDJ.setText(resultBean.getData().get(0).getVc_sfxhjbhbmjxpwsbdj().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjszejnpwf()==null){
                VC_SFJSZEJNPWF.setText("");
            }else {
                VC_SFJSZEJNPWF.setText(resultBean.getData().get(0).getVc_sfjszejnpwf().toString());
            }
            if (resultBean.getData().get(0).getVc_syndsjjnpwf()==null){
                VC_SYNDSJJNPWF.setText("");
            }else {
                VC_SYNDSJJNPWF.setText(resultBean.getData().get(0).getVc_syndsjjnpwf().toString());
            }
            if (resultBean.getData().get(0).getVc_yjpwf()==null){
                VC_YJPWF.setText("");
            }else {
                VC_YJPWF.setText(resultBean.getData().get(0).getVc_yjpwf().toString());
            }
            if (resultBean.getData().get(0).getCl_wzejnpwfdyy()==null){
                CL_WZEJNPWFDYY.setText("");
            }else {
                CL_WZEJNPWFDYY.setText(resultBean.getData().get(0).getCl_wzejnpwfdyy().toString());
            }
            if (resultBean.getData().get(0).getCl_gqyyzzpffqwryjpthbss()==null){
                CL_GQYYZZPFFQWRYJPTHBSS.setText("");
            }else {
                CL_GQYYZZPFFQWRYJPTHBSS.setText(resultBean.getData().get(0).getCl_gqyyzzpffqwryjpthbss().toString());
            }
            if (resultBean.getData().get(0).getVc_hpbgjpfyqdfqzldccsjsssfls()==null){
                VC_HPBGJPFYQDFQZLDCCSJSSSFLS.setText("");
            }else {
                VC_HPBGJPFYQDFQZLDCCSJSSSFLS.setText(resultBean.getData().get(0).getVc_hpbgjpfyqdfqzldccsjsssfls().toString());
            }
            if (resultBean.getData().get(0).getCl_wlsqkms()==null){
                CL_WLSQKMS.setText("");
            }else {
                CL_WLSQKMS.setText(resultBean.getData().get(0).getCl_wlsqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_jlnnjgjcsfcb()==null){
                VC_FQ_JLNNJGJCSFCB.setText("");
            }else {
                VC_FQ_JLNNJGJCSFCB.setText(resultBean.getData().get(0).getVc_fq_jlnnjgjcsfcb().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_cbyzjjczw()==null){
                VC_FQ_CBYZJJCZW.setText("");
            }else {
                VC_FQ_CBYZJJCZW.setText(resultBean.getData().get(0).getVc_fq_cbyzjjczw().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_jcdw()==null){
                VC_FQ_JCDW.setText("");
            }else {
                VC_FQ_JCDW.setText(resultBean.getData().get(0).getVc_fq_jcdw().toString());
            }
            if (resultBean.getData().get(0).getDt_fqjc_time()==null){
                DT_FQJC_TIME.setText("");
            }else {
                DT_FQJC_TIME.setText(resultBean.getData().get(0).getDt_fqjc_time().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_sfazzxjczz()==null){
                VC_FQ_SFAZZXJCZZ.setText("");
            }else {
                VC_FQ_SFAZZXJCZZ.setText(resultBean.getData().get(0).getVc_fq_sfazzxjczz().toString());
            }
            if (resultBean.getData().get(0).getDt_fqaz_time()==null){
                DT_FQAZ_TIME.setText("");
            }else {
                DT_FQAZ_TIME.setText(resultBean.getData().get(0).getDt_fqaz_time().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_sfyhbbmlw()==null){
                VC_FQ_SFYHBBMLW.setText("");
            }else {
                VC_FQ_SFYHBBMLW.setText(resultBean.getData().get(0).getVc_fq_sfyhbbmlw().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_sfyyzc()==null){
                VC_FQ_SFYYZC.setText("");
            }else {
                VC_FQ_SFYYZC.setText(resultBean.getData().get(0).getVc_fq_sfyyzc().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_sfjgjy()==null){
                VC_FQ_SFJGJY.setText("");
            }else {
                VC_FQ_SFJGJY.setText(resultBean.getData().get(0).getVc_fq_sfjgjy().toString());
            }
            if (resultBean.getData().get(0).getDt_fqjy_time()==null){
                DT_FQJY_TIME.setText("");
            }else {
                DT_FQJY_TIME.setText(resultBean.getData().get(0).getDt_fqjy_time().toString());
            }
            if (resultBean.getData().get(0).getVc_fq_zxjcsjxs()==null){
                VC_FQ_ZXJCSJXS.setText("");
            }else {
                VC_FQ_ZXJCSJXS.setText(resultBean.getData().get(0).getVc_fq_zxjcsjxs().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_scfscshj()==null){
                VC_FS_SCFSCSHJ.setText("");
            }else {
                VC_FS_SCFSCSHJ.setText(resultBean.getData().get(0).getVc_fs_scfscshj().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_qthj()==null){
                VC_FS_QTHJ.setText("");
            }else {
                VC_FS_QTHJ.setText(resultBean.getData().get(0).getVc_fs_qthj().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_csl()==null){
                VC_FS_CSL.setText("");
            }else {
                VC_FS_CSL.setText(resultBean.getData().get(0).getVc_fs_csl().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_scfsclcs()==null){
                VC_FS_SCFSCLCS.setText("");
            }else {
                VC_FS_SCFSCLCS.setText(resultBean.getData().get(0).getVc_fs_scfsclcs().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_cll()==null){
                VC_FS_CLL.setText("");
            }else {
                VC_FS_CLL.setText(resultBean.getData().get(0).getVc_fs_cll().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_clsffhhpjpfyq()==null){
                VC_FS_CLSFFHHPJPFYQ.setText("");
            }else {
                VC_FS_CLSFFHHPJPFYQ.setText(resultBean.getData().get(0).getVc_fs_clsffhhpjpfyq().toString());
            }
            if (resultBean.getData().get(0).getCl_fs_bfhqkms()==null){
                CL_FS_BFHQKMS.setText("");
            }else {
                CL_FS_BFHQKMS.setText(resultBean.getData().get(0).getCl_fs_bfhqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfayqsxshfsyshscfsfl()==null){
                VC_FS_SFAYQSXSHFSYSHSCFSFL.setText("");
            }else {
                VC_FS_SFAYQSXSHFSYSHSCFSFL.setText(resultBean.getData().get(0).getVc_fs_sfayqsxshfsyshscfsfl().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfxzssaggqsbdtp()==null){
                VC_FS_SFXZSSAGGQSBDTP.setText("");
            }else {
                VC_FS_SFXZSSAGGQSBDTP.setText(resultBean.getData().get(0).getVc_fs_sfxzssaggqsbdtp().toString());
            }
            if (resultBean.getData().get(0).getCl_fs_qksm()==null){
                CL_FS_QKSM.setText("");
            }else {
                CL_FS_QKSM.setText(resultBean.getData().get(0).getCl_fs_qksm().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_jlnjgjcsfcb()==null){
                VC_FS_JLNJGJCSFCB.setText("");
            }else {
                VC_FS_JLNJGJCSFCB.setText(resultBean.getData().get(0).getVc_fs_jlnjgjcsfcb().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_cbyzjjcz()==null){
                VC_FS_CBYZJJCZ.setText("");
            }else {
                VC_FS_CBYZJJCZ.setText(resultBean.getData().get(0).getVc_fs_cbyzjjcz().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_jcdw()==null){
                VC_FS_JCDW.setText("");
            }else {
                VC_FS_JCDW.setText(resultBean.getData().get(0).getVc_fs_jcdw().toString());
            }
            if (resultBean.getData().get(0).getDt_fsjc_time()==null){
                DT_FSJC_TIME.setText("");
            }else {
                DT_FSJC_TIME.setText(resultBean.getData().get(0).getDt_fsjc_time().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjdhpdj()==null){
                VC_SFJDHPDJ.setText("");
            }else {
                VC_SFJDHPDJ.setText(resultBean.getData().get(0).getVc_sfjdhpdj().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_zxjczzsfaz()==null){
                VC_FS_ZXJCZZSFAZ.setText("");
            }else {
                VC_FS_ZXJCZZSFAZ.setText(resultBean.getData().get(0).getVc_fs_zxjczzsfaz().toString());
            }
            if (resultBean.getData().get(0).getDt_fsan_time()==null){
                DT_FSAN_TIME.setText("");
            }else {
                DT_FSAN_TIME.setText(resultBean.getData().get(0).getDt_fsan_time().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfyhbbmlw()==null){
                VC_FS_SFYHBBMLW.setText("");
            }else {
                VC_FS_SFYHBBMLW.setText(resultBean.getData().get(0).getVc_fs_sfyhbbmlw().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfyxzc()==null){
                VC_FS_SFYXZC.setText("");
            }else {
                VC_FS_SFYXZC.setText(resultBean.getData().get(0).getVc_fs_sfyxzc().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfjgjy()==null){
                VC_FS_SFJGJY.setText("");
            }else {
                VC_FS_SFJGJY.setText(resultBean.getData().get(0).getVc_fs_sfjgjy().toString());
            }
            if (resultBean.getData().get(0).getVc_sfyjsp()==null){
                VC_SFYJSP.setText("");
            }else {
                VC_SFYJSP.setText(resultBean.getData().get(0).getVc_sfyjsp().toString());
            }
            if (resultBean.getData().get(0).getDt_fsjy_time()==null){
                DT_FSJY_TIME.setText("");
            }else {
                DT_FSJY_TIME.setText(resultBean.getData().get(0).getDt_fsjy_time().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_zxjcsj()==null){
                VC_FS_ZXJCSJ.setText("");
            }else {
                VC_FS_ZXJCSJ.setText(resultBean.getData().get(0).getVc_fs_zxjcsj().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_jyzcsl()==null){
                VC_FS_JYZCSL.setText("");
            }else {
                VC_FS_JYZCSL.setText(resultBean.getData().get(0).getVc_fs_jyzcsl().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_jyzclfs()==null){
                VC_FS_JYZCLFS.setText("");
            }else {
                VC_FS_JYZCLFS.setText(resultBean.getData().get(0).getVc_fs_jyzclfs().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_fycsl()==null){
                VC_FS_FYCSL.setText("");
            }else {
                VC_FS_FYCSL.setText(resultBean.getData().get(0).getVc_fs_fycsl().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_fyclfs()==null){
                VC_FS_FYCLFS.setText("");
            }else {
                VC_FS_FYCLFS.setText(resultBean.getData().get(0).getVc_fs_fyclfs().toString());
            }
            if (resultBean.getData().get(0).getCl_fs_qtwxfwzljcsl()==null){
                CL_FS_QTWXFWZLJCSL.setText("");
            }else {
                CL_FS_QTWXFWZLJCSL.setText(resultBean.getData().get(0).getCl_fs_qtwxfwzljcsl().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_qtclfs()==null){
                VC_FS_QTCLFS.setText("");
            }else {
                VC_FS_QTCLFS.setText(resultBean.getData().get(0).getVc_fs_qtclfs().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_wxfwtzsfjqgf()==null){
                VC_FS_WXFWTZSFJQGF.setText("");
            }else {
                VC_FS_WXFWTZSFJQGF.setText(resultBean.getData().get(0).getVc_fs_wxfwtzsfjqgf().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_csjczqksfxhbbmsb()==null){
                VC_FS_CSJCZQKSFXHBBMSB.setText("");
            }else {
                VC_FS_CSJCZQKSFXHBBMSB.setText(resultBean.getData().get(0).getVc_fs_csjczqksfxhbbmsb().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_wsbdynx()==null){
                VC_FS_WSBDYNX.setText("");
            }else {
                VC_FS_WSBDYNX.setText(resultBean.getData().get(0).getVc_fs_wsbdynx().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfzdlwxfwywsgffcshyjya()==null){
                VC_FS_SFZDLWXFWYWSGFFCSHYJYA.setText("");
            }else {
                VC_FS_SFZDLWXFWYWSGFFCSHYJYA.setText(resultBean.getData().get(0).getVc_fs_sfzdlwxfwywsgffcshyjya().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_wxfwcfkhcdsfsybs()==null){
                VC_FS_WXFWCFKHCDSFSYBS.setText("");
            }else {
                VC_FS_WXFWCFKHCDSFSYBS.setText(resultBean.getData().get(0).getVc_fs_wxfwcfkhcdsfsybs().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sffhwxfwccgf()==null){
                VC_FS_SFFHWXFWCCGF.setText("");
            }else {
                VC_FS_SFFHWXFWCCGF.setText(resultBean.getData().get(0).getVc_fs_sffhwxfwccgf().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sfczwxfwyybgfhd()==null){
                VC_FS_SFCZWXFWYYBGFHD.setText("");
            }else {
                VC_FS_SFCZWXFWYYBGFHD.setText(resultBean.getData().get(0).getVc_fs_sfczwxfwyybgfhd().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_zcnlscfdcsjsfcgyn()==null){
                VC_FS_ZCNLSCFDCSJSFCGYN.setText("");
            }else {
                VC_FS_ZCNLSCFDCSJSFCGYN.setText(resultBean.getData().get(0).getVc_fs_zcnlscfdcsjsfcgyn().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_zcwsfjsyyjxdczc()==null){
                VC_FS_ZCWSFJSYYJXDCZC.setText("");
            }else {
                VC_FS_ZCWSFJSYYJXDCZC.setText(resultBean.getData().get(0).getVc_fs_zcwsfjsyyjxdczc().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_rzyccsfzxwxfwzyldzd()==null){
                VC_FS_RZYCCSFZXWXFWZYLDZD.setText("");
            }else {
                VC_FS_RZYCCSFZXWXFWZYLDZD.setText(resultBean.getData().get(0).getVc_fs_rzyccsfzxwxfwzyldzd().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_ysclsfjyxgzz()==null){
                VC_FS_YSCLSFJYXGZZ.setText("");
            }else {
                VC_FS_YSCLSFJYXGZZ.setText(resultBean.getData().get(0).getVc_fs_ysclsfjyxgzz().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_ysl()==null){
                VC_FS_YSL.setText("");
            }else {
                VC_FS_YSL.setText(resultBean.getData().get(0).getVc_fs_ysl().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_pc()==null){
                VC_FS_PC.setText("");
            }else {
                VC_FS_PC.setText(resultBean.getData().get(0).getVc_fs_pc().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_jsdwsfjywxjyzz()==null){
                VC_FS_JSDWSFJYWXJYZZ.setText("");
            }else {
                VC_FS_JSDWSFJYWXJYZZ.setText(resultBean.getData().get(0).getVc_fs_jsdwsfjywxjyzz().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_sjczfs()==null){
                VC_FS_SJCZFS.setText("");
            }else {
                VC_FS_SJCZFS.setText(resultBean.getData().get(0).getVc_fs_sjczfs().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_ybgfdclfssffhhpjpfyq()==null){
                VC_FS_YBGFDCLFSSFFHHPJPFYQ.setText("");
            }else {
                VC_FS_YBGFDCLFSSFFHHPJPFYQ.setText(resultBean.getData().get(0).getVc_fs_ybgfdclfssffhhpjpfyq().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_bfhqkms()==null){
                VC_FS_BFHQKMS.setText("");
            }else {
                VC_FS_BFHQKMS.setText(resultBean.getData().get(0).getVc_fs_bfhqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_gczsbsfahpjpfyqcqgzjz()==null){
                VC_FS_GCZSBSFAHPJPFYQCQGZJZ.setText("");
            }else {
                VC_FS_GCZSBSFAHPJPFYQCQGZJZ.setText(resultBean.getData().get(0).getVc_fs_gczsbsfahpjpfyqcqgzjz().toString());
            }
            if (resultBean.getData().get(0).getVc_fs_wlsqkms()==null){
                VC_FS_WLSQKMS.setText("");
            }else {
                VC_FS_WLSQKMS.setText(resultBean.getData().get(0).getVc_fs_wlsqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_hpyqdwsfhjl()==null){
                VC_HPYQDWSFHJL.setText("");
            }else {
                VC_HPYQDWSFHJL.setText(resultBean.getData().get(0).getVc_hpyqdwsfhjl().toString());
            }
            if (resultBean.getData().get(0).getVc_gjlnsfybhmb()==null){
                VC_GJLNSFYBHMB.setText("");
            }else {
                VC_GJLNSFYBHMB.setText(resultBean.getData().get(0).getVc_gjlnsfybhmb().toString());
            }
            if (resultBean.getData().get(0).getDt_bhmbjs_time()==null){
                DT_BHMBJS_TIME.setText("");
            }else {
                DT_BHMBJS_TIME.setText(resultBean.getData().get(0).getDt_bhmbjs_time().toString());
            }
            if (resultBean.getData().get(0).getCl_zbhjbhqkms()==null){
                CL_ZBHJBHQKMS.setText("");
            }else {
                CL_ZBHJBHQKMS.setText(resultBean.getData().get(0).getCl_zbhjbhqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_hj_sflshpjpfyqdfxffdccs()==null){
                VC_HJ_SFLSHPJPFYQDFXFFDCCS.setText("");
            }else {
                VC_HJ_SFLSHPJPFYQDFXFFDCCS.setText(resultBean.getData().get(0).getVc_hj_sflshpjpfyqdfxffdccs().toString());
            }
            if (resultBean.getData().get(0).getVc_hj_wlsqkms()==null){
                VC_HJ_WLSQKMS.setText("");
            }else {
                VC_HJ_WLSQKMS.setText(resultBean.getData().get(0).getVc_hj_wlsqkms().toString());
            }
            if (resultBean.getData().get(0).getVc_hj_sfbztfhjsjyjya()==null){
                VC_HJ_SFBZTFHJSJYJYA.setText("");
            }else {
                VC_HJ_SFBZTFHJSJYJYA.setText(resultBean.getData().get(0).getVc_hj_sfbztfhjsjyjya().toString());
            }
            if (resultBean.getData().get(0).getVc_hj_sfdyajxpg()==null){
                VC_HJ_SFDYAJXPG.setText("");
            }else {
                VC_HJ_SFDYAJXPG.setText(resultBean.getData().get(0).getVc_hj_sfdyajxpg().toString());
            }
            if (resultBean.getData().get(0).getVc_hj_sfayayqjxndyjyl()==null){
                VC_HJ_SFAYAYQJXNDYJYL.setText("");
            }else {
                VC_HJ_SFAYAYQJXNDYJYL.setText(resultBean.getData().get(0).getVc_hj_sfayayqjxndyjyl().toString());
            }
            if (resultBean.getData().get(0).getVc_hj_sfcbyjwz()==null){
                VC_HJ_SFCBYJWZ.setText("");
            }else {
                VC_HJ_SFCBYJWZ.setText(resultBean.getData().get(0).getVc_hj_sfcbyjwz().toString());
            }
            if (resultBean.getData().get(0).getCl_qthbbmjcqk()==null){
                CL_QTHBBMJCQK.setText("");
            }else {
                CL_QTHBBMJCQK.setText(resultBean.getData().get(0).getCl_qthbbmjcqk().toString());
            }
            if (resultBean.getData().get(0).getCl_czzywt()==null){
                CL_CZZYWT.setText("");
            }else {
                CL_CZZYWT.setText(resultBean.getData().get(0).getCl_czzywt().toString());
            }
            if (resultBean.getData().get(0).getCl_jcyq()==null){
                CL_JCYQ.setText("");
            }else {
                CL_JCYQ.setText(resultBean.getData().get(0).getCl_jcyq().toString());
            }

        } else {
            Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
        }
    }
}
