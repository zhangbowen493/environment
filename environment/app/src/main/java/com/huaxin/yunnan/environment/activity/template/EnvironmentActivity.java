package com.huaxin.yunnan.environment.activity.template;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.huaxin.yunnan.environment.BaseActicity;
import com.huaxin.yunnan.environment.R;
import com.huaxin.yunnan.environment.bean.EnvironmentBean;
import com.huaxin.yunnan.environment.net.CallBack;
import com.huaxin.yunnan.environment.net.NetTool;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_SR_INFO;

/**
 * 19、生态环境现场监察记录
 */
public class EnvironmentActivity extends BaseActicity implements View.OnClickListener, CallBack {

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
    private TextView VC_COUNTRY;
    private TextView VC_ZGBM;
    private TextView VC_BHQMJ;
    private TextView VC_HXQMJ;
    private TextView VC_HCQMJ;
    private TextView VC_SYQMJ;
    private TextView DT_BHQSP_TIME;
    private TextView VC_BHQSPBM;
    private TextView VC_ZYBHDX;
    private TextView VC_BHQJB;
    private TextView DT_GHBZ_TIME;
    private TextView VC_GHBZQK;
    private TextView VC_SLZMGLJG;
    private TextView VC_PBZYJSRY;
    private TextView VC_ZZBZZTGH;
    private TextView VC_NRJHBSS;
    private TextView VC_FWJXYZFJD;
    private TextView VC_BHQQKYGB;
    private TextView VC_BHDXYXBH;
    private TextView VC_SNZQS;
    private TextView VC_JCSZQS;
    private TextView VC_ZQSLDFDXJ;
    private TextView VC_YWLWZRQ;
    private TextView VC_WZM;
    private TextView VC_RQWZZDMJ;
    private TextView VC_ZCYZWXHYX;
    private TextView VC_ZYSWHZW;
    private TextView VC_RWYJWLWZ;
    private TextView VC_WZMC;
    private TextView VC_ZZMJ;
    private TextView VC_JZZYLYHD;
    private TextView VC_YJZZYLYHD;
    private TextView VC_RGJJLHZWMJ;
    private TextView VC_YGKZMJBL;
    private TextView VC_ZWZYLYXZFW;
    private TextView VC_SJHXQYHCQ;
    private TextView VC_YXGBMPZ;
    private TextView DT_PZ_TIME;
    private TextView VC_PZBM;
    private TextView VC_GGSTLYFA;
    private TextView VC_JSPHXSCSS;
    private TextView VC_WRWPFCQCS;
    private TextView VC_WRCLCS;
    private TextView VC_JQWRWJCSJ;
    private TextView VC_WPWRWSFCB;
    private TextView VC_CBWRYZ;
    private TextView VC_JCJSXMS;
    private TextView VC_SXWFJSXM;
    private TextView VC_SFWYHXQHCQSYQN;
    private TextView VC_HXQWFXM;
    private TextView VC_HXQWFXMMC;
    private TextView VC_HCQWFXM;
    private TextView VC_HCQWFXMMC;
    private TextView VC_SYQWFXM;
    private TextView VC_SYQWFXMMC;
    private TextView VC_BZWJLX;
    private TextView VC_YBZXMGS;
    private TextView VC_YBZXMMC;
    private TextView VC_WBZWJLX;
    private TextView VC_WBZXMGS;
    private TextView VC_WBZXMMC;
    private TextView VC_SFJDHPDJ;
    private TextView VC_JDHPDJXM;
    private TextView VC_JDHPXMMC;
    private TextView VC_WFHPSPSX;
    private TextView VC_WHPSPWJS;
    private TextView VC_WHPSPMC;
    private TextView VC_SFYJSP;
    private TextView VC_YJSPXMS;
    private TextView VC_YJSPXMMC;
    private TextView VC_WXMSYXSP;
    private TextView VC_WXMSYXMC;
    private TextView VC_WXMJGHBYS;
    private TextView VC_WXMJGHBYSMC;
    private TextView VC_FZCSSFLS;
    private TextView VC_WLSDCSS;
    private TextView VC_WLSDCSMC;
    private TextView VC_FZSSZCYX;
    private TextView VC_YXBZCDQY;
    private TextView VC_YPHXSS;
    private TextView VC_SFPFFHGD;
    private TextView VC_SHSTHJ;
    private TextView VC_CZSHXSTGN;
    private TextView VC_ZDTFYJYA;
    private TextView VC_DQKZYJYL;
    private TextView CL_JCFXDWT;
    private TextView CL_JCYQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment);
        initView();
        initProgressDialog();
        Intent intent = getIntent();
        String t_task_list_id = intent.getStringExtra("t_task_list_id");
        initView();
        NetTool.templatePost(getApplicationContext(), t_task_list_id, URL_QUERY_SR_INFO, EnvironmentBean.class, this, yNProgressDialog);
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("生态环境现场监察记录");

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
        VC_COUNTRY = (TextView) findViewById(R.id.VC_COUNTRY);
        VC_COUNTRY.setOnClickListener(this);
        VC_ZGBM = (TextView) findViewById(R.id.VC_ZGBM);
        VC_ZGBM.setOnClickListener(this);
        VC_BHQMJ = (TextView) findViewById(R.id.VC_BHQMJ);
        VC_BHQMJ.setOnClickListener(this);
        VC_HXQMJ = (TextView) findViewById(R.id.VC_HXQMJ);
        VC_HXQMJ.setOnClickListener(this);
        VC_HCQMJ = (TextView) findViewById(R.id.VC_HCQMJ);
        VC_HCQMJ.setOnClickListener(this);
        VC_SYQMJ = (TextView) findViewById(R.id.VC_SYQMJ);
        VC_SYQMJ.setOnClickListener(this);
        DT_BHQSP_TIME = (TextView) findViewById(R.id.DT_BHQSP_TIME);
        DT_BHQSP_TIME.setOnClickListener(this);
        VC_BHQSPBM = (TextView) findViewById(R.id.VC_BHQSPBM);
        VC_BHQSPBM.setOnClickListener(this);
        VC_ZYBHDX = (TextView) findViewById(R.id.VC_ZYBHDX);
        VC_ZYBHDX.setOnClickListener(this);
        VC_BHQJB = (TextView) findViewById(R.id.VC_BHQJB);
        VC_BHQJB.setOnClickListener(this);
        DT_GHBZ_TIME = (TextView) findViewById(R.id.DT_GHBZ_TIME);
        DT_GHBZ_TIME.setOnClickListener(this);
        VC_GHBZQK = (TextView) findViewById(R.id.VC_GHBZQK);
        VC_GHBZQK.setOnClickListener(this);
        VC_SLZMGLJG = (TextView) findViewById(R.id.VC_SLZMGLJG);
        VC_SLZMGLJG.setOnClickListener(this);
        VC_PBZYJSRY = (TextView) findViewById(R.id.VC_PBZYJSRY);
        VC_PBZYJSRY.setOnClickListener(this);
        VC_ZZBZZTGH = (TextView) findViewById(R.id.VC_ZZBZZTGH);
        VC_ZZBZZTGH.setOnClickListener(this);
        VC_NRJHBSS = (TextView) findViewById(R.id.VC_NRJHBSS);
        VC_NRJHBSS.setOnClickListener(this);
        VC_FWJXYZFJD = (TextView) findViewById(R.id.VC_FWJXYZFJD);
        VC_FWJXYZFJD.setOnClickListener(this);
        VC_BHQQKYGB = (TextView) findViewById(R.id.VC_BHQQKYGB);
        VC_BHQQKYGB.setOnClickListener(this);
        VC_BHDXYXBH = (TextView) findViewById(R.id.VC_BHDXYXBH);
        VC_BHDXYXBH.setOnClickListener(this);
        VC_SNZQS = (TextView) findViewById(R.id.VC_SNZQS);
        VC_SNZQS.setOnClickListener(this);
        VC_JCSZQS = (TextView) findViewById(R.id.VC_JCSZQS);
        VC_JCSZQS.setOnClickListener(this);
        VC_ZQSLDFDXJ = (TextView) findViewById(R.id.VC_ZQSLDFDXJ);
        VC_ZQSLDFDXJ.setOnClickListener(this);
        VC_YWLWZRQ = (TextView) findViewById(R.id.VC_YWLWZRQ);
        VC_YWLWZRQ.setOnClickListener(this);
        VC_WZM = (TextView) findViewById(R.id.VC_WZM);
        VC_WZM.setOnClickListener(this);
        VC_RQWZZDMJ = (TextView) findViewById(R.id.VC_RQWZZDMJ);
        VC_RQWZZDMJ.setOnClickListener(this);
        VC_ZCYZWXHYX = (TextView) findViewById(R.id.VC_ZCYZWXHYX);
        VC_ZCYZWXHYX.setOnClickListener(this);
        VC_ZYSWHZW = (TextView) findViewById(R.id.VC_ZYSWHZW);
        VC_ZYSWHZW.setOnClickListener(this);
        VC_RWYJWLWZ = (TextView) findViewById(R.id.VC_RWYJWLWZ);
        VC_RWYJWLWZ.setOnClickListener(this);
        VC_WZMC = (TextView) findViewById(R.id.VC_WZMC);
        VC_WZMC.setOnClickListener(this);
        VC_ZZMJ = (TextView) findViewById(R.id.VC_ZZMJ);
        VC_ZZMJ.setOnClickListener(this);
        VC_JZZYLYHD = (TextView) findViewById(R.id.VC_JZZYLYHD);
        VC_JZZYLYHD.setOnClickListener(this);
        VC_YJZZYLYHD = (TextView) findViewById(R.id.VC_YJZZYLYHD);
        VC_YJZZYLYHD.setOnClickListener(this);
        VC_RGJJLHZWMJ = (TextView) findViewById(R.id.VC_RGJJLHZWMJ);
        VC_RGJJLHZWMJ.setOnClickListener(this);
        VC_YGKZMJBL = (TextView) findViewById(R.id.VC_YGKZMJBL);
        VC_YGKZMJBL.setOnClickListener(this);
        VC_ZWZYLYXZFW = (TextView) findViewById(R.id.VC_ZWZYLYXZFW);
        VC_ZWZYLYXZFW.setOnClickListener(this);
        VC_SJHXQYHCQ = (TextView) findViewById(R.id.VC_SJHXQYHCQ);
        VC_SJHXQYHCQ.setOnClickListener(this);
        VC_YXGBMPZ = (TextView) findViewById(R.id.VC_YXGBMPZ);
        VC_YXGBMPZ.setOnClickListener(this);
        DT_PZ_TIME = (TextView) findViewById(R.id.DT_PZ_TIME);
        DT_PZ_TIME.setOnClickListener(this);
        VC_PZBM = (TextView) findViewById(R.id.VC_PZBM);
        VC_PZBM.setOnClickListener(this);
        VC_GGSTLYFA = (TextView) findViewById(R.id.VC_GGSTLYFA);
        VC_GGSTLYFA.setOnClickListener(this);
        VC_JSPHXSCSS = (TextView) findViewById(R.id.VC_JSPHXSCSS);
        VC_JSPHXSCSS.setOnClickListener(this);
        VC_WRWPFCQCS = (TextView) findViewById(R.id.VC_WRWPFCQCS);
        VC_WRWPFCQCS.setOnClickListener(this);
        VC_WRCLCS = (TextView) findViewById(R.id.VC_WRCLCS);
        VC_WRCLCS.setOnClickListener(this);
        VC_JQWRWJCSJ = (TextView) findViewById(R.id.VC_JQWRWJCSJ);
        VC_JQWRWJCSJ.setOnClickListener(this);
        VC_WPWRWSFCB = (TextView) findViewById(R.id.VC_WPWRWSFCB);
        VC_WPWRWSFCB.setOnClickListener(this);
        VC_CBWRYZ = (TextView) findViewById(R.id.VC_CBWRYZ);
        VC_CBWRYZ.setOnClickListener(this);
        VC_JCJSXMS = (TextView) findViewById(R.id.VC_JCJSXMS);
        VC_JCJSXMS.setOnClickListener(this);
        VC_SXWFJSXM = (TextView) findViewById(R.id.VC_SXWFJSXM);
        VC_SXWFJSXM.setOnClickListener(this);
        VC_SFWYHXQHCQSYQN = (TextView) findViewById(R.id.VC_SFWYHXQHCQSYQN);
        VC_SFWYHXQHCQSYQN.setOnClickListener(this);
        VC_HXQWFXM = (TextView) findViewById(R.id.VC_HXQWFXM);
        VC_HXQWFXM.setOnClickListener(this);
        VC_HXQWFXMMC = (TextView) findViewById(R.id.VC_HXQWFXMMC);
        VC_HXQWFXMMC.setOnClickListener(this);
        VC_HCQWFXM = (TextView) findViewById(R.id.VC_HCQWFXM);
        VC_HCQWFXM.setOnClickListener(this);
        VC_HCQWFXMMC = (TextView) findViewById(R.id.VC_HCQWFXMMC);
        VC_HCQWFXMMC.setOnClickListener(this);
        VC_SYQWFXM = (TextView) findViewById(R.id.VC_SYQWFXM);
        VC_SYQWFXM.setOnClickListener(this);
        VC_SYQWFXMMC = (TextView) findViewById(R.id.VC_SYQWFXMMC);
        VC_SYQWFXMMC.setOnClickListener(this);
        VC_BZWJLX = (TextView) findViewById(R.id.VC_BZWJLX);
        VC_BZWJLX.setOnClickListener(this);
        VC_YBZXMGS = (TextView) findViewById(R.id.VC_YBZXMGS);
        VC_YBZXMGS.setOnClickListener(this);
        VC_YBZXMMC = (TextView) findViewById(R.id.VC_YBZXMMC);
        VC_YBZXMMC.setOnClickListener(this);
        VC_WBZWJLX = (TextView) findViewById(R.id.VC_WBZWJLX);
        VC_WBZWJLX.setOnClickListener(this);
        VC_WBZXMGS = (TextView) findViewById(R.id.VC_WBZXMGS);
        VC_WBZXMGS.setOnClickListener(this);
        VC_WBZXMMC = (TextView) findViewById(R.id.VC_WBZXMMC);
        VC_WBZXMMC.setOnClickListener(this);
        VC_SFJDHPDJ = (TextView) findViewById(R.id.VC_SFJDHPDJ);
        VC_SFJDHPDJ.setOnClickListener(this);
        VC_JDHPDJXM = (TextView) findViewById(R.id.VC_JDHPDJXM);
        VC_JDHPDJXM.setOnClickListener(this);
        VC_JDHPXMMC = (TextView) findViewById(R.id.VC_JDHPXMMC);
        VC_JDHPXMMC.setOnClickListener(this);
        VC_WFHPSPSX = (TextView) findViewById(R.id.VC_WFHPSPSX);
        VC_WFHPSPSX.setOnClickListener(this);
        VC_WHPSPWJS = (TextView) findViewById(R.id.VC_WHPSPWJS);
        VC_WHPSPWJS.setOnClickListener(this);
        VC_WHPSPMC = (TextView) findViewById(R.id.VC_WHPSPMC);
        VC_WHPSPMC.setOnClickListener(this);
        VC_SFYJSP = (TextView) findViewById(R.id.VC_SFYJSP);
        VC_SFYJSP.setOnClickListener(this);
        VC_YJSPXMS = (TextView) findViewById(R.id.VC_YJSPXMS);
        VC_YJSPXMS.setOnClickListener(this);
        VC_YJSPXMMC = (TextView) findViewById(R.id.VC_YJSPXMMC);
        VC_YJSPXMMC.setOnClickListener(this);
        VC_WXMSYXSP = (TextView) findViewById(R.id.VC_WXMSYXSP);
        VC_WXMSYXSP.setOnClickListener(this);
        VC_WXMSYXMC = (TextView) findViewById(R.id.VC_WXMSYXMC);
        VC_WXMSYXMC.setOnClickListener(this);
        VC_WXMJGHBYS = (TextView) findViewById(R.id.VC_WXMJGHBYS);
        VC_WXMJGHBYS.setOnClickListener(this);
        VC_WXMJGHBYSMC = (TextView) findViewById(R.id.VC_WXMJGHBYSMC);
        VC_WXMJGHBYSMC.setOnClickListener(this);
        VC_FZCSSFLS = (TextView) findViewById(R.id.VC_FZCSSFLS);
        VC_FZCSSFLS.setOnClickListener(this);
        VC_WLSDCSS = (TextView) findViewById(R.id.VC_WLSDCSS);
        VC_WLSDCSS.setOnClickListener(this);
        VC_WLSDCSMC = (TextView) findViewById(R.id.VC_WLSDCSMC);
        VC_WLSDCSMC.setOnClickListener(this);
        VC_FZSSZCYX = (TextView) findViewById(R.id.VC_FZSSZCYX);
        VC_FZSSZCYX.setOnClickListener(this);
        VC_YXBZCDQY = (TextView) findViewById(R.id.VC_YXBZCDQY);
        VC_YXBZCDQY.setOnClickListener(this);
        VC_YPHXSS = (TextView) findViewById(R.id.VC_YPHXSS);
        VC_YPHXSS.setOnClickListener(this);
        VC_SFPFFHGD = (TextView) findViewById(R.id.VC_SFPFFHGD);
        VC_SFPFFHGD.setOnClickListener(this);
        VC_SHSTHJ = (TextView) findViewById(R.id.VC_SHSTHJ);
        VC_SHSTHJ.setOnClickListener(this);
        VC_CZSHXSTGN = (TextView) findViewById(R.id.VC_CZSHXSTGN);
        VC_CZSHXSTGN.setOnClickListener(this);
        VC_ZDTFYJYA = (TextView) findViewById(R.id.VC_ZDTFYJYA);
        VC_ZDTFYJYA.setOnClickListener(this);
        VC_DQKZYJYL = (TextView) findViewById(R.id.VC_DQKZYJYL);
        VC_DQKZYJYL.setOnClickListener(this);
        CL_JCFXDWT = (TextView) findViewById(R.id.CL_JCFXDWT);
        CL_JCFXDWT.setOnClickListener(this);
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
        EnvironmentBean resultBean = (EnvironmentBean) o;
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
            if (resultBean.getData().get(0).getVc_country()==null){
                VC_COUNTRY.setText("");
            }else {
                VC_COUNTRY.setText(resultBean.getData().get(0).getVc_country().toString());
            }
            if (resultBean.getData().get(0).getVc_zgbm()==null){
                VC_ZGBM.setText("");
            }else {
                VC_ZGBM.setText(resultBean.getData().get(0).getVc_zgbm().toString());
            }
            if (resultBean.getData().get(0).getVc_bhqmj()==null){
                VC_BHQMJ.setText("");
            }else {
                VC_BHQMJ.setText(resultBean.getData().get(0).getVc_bhqmj().toString());
            }
            if (resultBean.getData().get(0).getVc_hxqmj()==null){
                VC_HXQMJ.setText("");
            }else {
                VC_HXQMJ.setText(resultBean.getData().get(0).getVc_hxqmj().toString());
            }
            if (resultBean.getData().get(0).getVc_hcqmj()==null){
                VC_HCQMJ.setText("");
            }else {
                VC_HCQMJ.setText(resultBean.getData().get(0).getVc_hcqmj().toString());
            }
            if (resultBean.getData().get(0).getVc_syqmj()==null){
                VC_SYQMJ.setText("");
            }else {
                VC_SYQMJ.setText(resultBean.getData().get(0).getVc_syqmj().toString());
            }
            if (resultBean.getData().get(0).getDt_bhqsp_time()==null){
                DT_BHQSP_TIME.setText("");
            }else {
                DT_BHQSP_TIME.setText(resultBean.getData().get(0).getDt_bhqsp_time().toString());
            }
            if (resultBean.getData().get(0).getVc_bhqspbm()==null){
                VC_BHQSPBM.setText("");
            }else {
                VC_BHQSPBM.setText(resultBean.getData().get(0).getVc_bhqspbm().toString());
            }
            if (resultBean.getData().get(0).getVc_zybhdx()==null){
                VC_ZYBHDX.setText("");
            }else {
                VC_ZYBHDX.setText(resultBean.getData().get(0).getVc_zybhdx().toString());
            }
            if (resultBean.getData().get(0).getVc_bhqjb()==null){
                VC_BHQJB.setText("");
            }else {
                VC_BHQJB.setText(resultBean.getData().get(0).getVc_bhqjb().toString());
            }
            if (resultBean.getData().get(0).getDt_ghbz_time()==null){
                DT_GHBZ_TIME.setText("");
            }else {
                DT_GHBZ_TIME.setText(resultBean.getData().get(0).getDt_ghbz_time().toString());
            }
            if (resultBean.getData().get(0).getVc_ghbzqk()==null){
                VC_GHBZQK.setText("");
            }else {
                VC_GHBZQK.setText(resultBean.getData().get(0).getVc_ghbzqk().toString());
            }
            if (resultBean.getData().get(0).getVc_slzmgljg()==null){
                VC_SLZMGLJG.setText("");
            }else {
                VC_SLZMGLJG.setText(resultBean.getData().get(0).getVc_slzmgljg().toString());
            }
            if (resultBean.getData().get(0).getVc_pbzyjsry()==null){
                VC_PBZYJSRY.setText("");
            }else {
                VC_PBZYJSRY.setText(resultBean.getData().get(0).getVc_pbzyjsry().toString());
            }
            if (resultBean.getData().get(0).getVc_zzbzztgh()==null){
                VC_ZZBZZTGH.setText("");
            }else {
                VC_ZZBZZTGH.setText(resultBean.getData().get(0).getVc_zzbzztgh().toString());
            }
            if (resultBean.getData().get(0).getVc_nrjhbss()==null){
                VC_NRJHBSS.setText("");
            }else {
                VC_NRJHBSS.setText(resultBean.getData().get(0).getVc_nrjhbss().toString());
            }
            if (resultBean.getData().get(0).getVc_fwjxyzfjd()==null){
                VC_FWJXYZFJD.setText("");
            }else {
                VC_FWJXYZFJD.setText(resultBean.getData().get(0).getVc_fwjxyzfjd().toString());
            }
            if (resultBean.getData().get(0).getVc_bhqqkygb()==null){
                VC_BHQQKYGB.setText("");
            }else {
                VC_BHQQKYGB.setText(resultBean.getData().get(0).getVc_bhqqkygb().toString());
            }
            if (resultBean.getData().get(0).getVc_bhdxyxbh()==null){
                VC_BHDXYXBH.setText("");
            }else {
                VC_BHDXYXBH.setText(resultBean.getData().get(0).getVc_bhdxyxbh().toString());
            }
            if (resultBean.getData().get(0).getVc_snzqs()==null){
                VC_SNZQS.setText("");
            }else {
                VC_SNZQS.setText(resultBean.getData().get(0).getVc_snzqs().toString());
            }
            if (resultBean.getData().get(0).getVc_jcszqs()==null){
                VC_JCSZQS.setText("");
            }else {
                VC_JCSZQS.setText(resultBean.getData().get(0).getVc_jcszqs().toString());
            }
            if (resultBean.getData().get(0).getVc_zqsldfdxj()==null){
                VC_ZQSLDFDXJ.setText("");
            }else {
                VC_ZQSLDFDXJ.setText(resultBean.getData().get(0).getVc_zqsldfdxj().toString());
            }
            if (resultBean.getData().get(0).getVc_ywlwzrq()==null){
                VC_YWLWZRQ.setText("");
            }else {
                VC_YWLWZRQ.setText(resultBean.getData().get(0).getVc_ywlwzrq().toString());
            }
            if (resultBean.getData().get(0).getVc_wzm()==null){
                VC_WZM.setText("");
            }else {
                VC_WZM.setText(resultBean.getData().get(0).getVc_wzm().toString());
            }
            if (resultBean.getData().get(0).getVc_rqwzzdmj()==null){
                VC_RQWZZDMJ.setText("");
            }else {
                VC_RQWZZDMJ.setText(resultBean.getData().get(0).getVc_rqwzzdmj().toString());
            }
            if (resultBean.getData().get(0).getVc_zcyzwxhyx()==null){
                VC_ZCYZWXHYX.setText("");
            }else {
                VC_ZCYZWXHYX.setText(resultBean.getData().get(0).getVc_zcyzwxhyx().toString());
            }
            if (resultBean.getData().get(0).getVc_zyswhzw()==null){
                VC_ZYSWHZW.setText("");
            }else {
                VC_ZYSWHZW.setText(resultBean.getData().get(0).getVc_zyswhzw().toString());
            }
            if (resultBean.getData().get(0).getVc_rwyjwlwz()==null){
                VC_RWYJWLWZ.setText("");
            }else {
                VC_RWYJWLWZ.setText(resultBean.getData().get(0).getVc_rwyjwlwz().toString());
            }
            if (resultBean.getData().get(0).getVc_wzmc()==null){
                VC_WZMC.setText("");
            }else {
                VC_WZMC.setText(resultBean.getData().get(0).getVc_wzmc().toString());
            }
            if (resultBean.getData().get(0).getVc_zzmj()==null){
                VC_ZZMJ.setText("");
            }else {
                VC_ZZMJ.setText(resultBean.getData().get(0).getVc_zzmj().toString());
            }
            if (resultBean.getData().get(0).getVc_jzzylyhd()==null){
                VC_JZZYLYHD.setText("");
            }else {
                VC_JZZYLYHD.setText(resultBean.getData().get(0).getVc_jzzylyhd().toString());
            }
            if (resultBean.getData().get(0).getVc_yjzzylyhd()==null){
                VC_YJZZYLYHD.setText("");
            }else {
                VC_YJZZYLYHD.setText(resultBean.getData().get(0).getVc_yjzzylyhd().toString());
            }
            if (resultBean.getData().get(0).getVc_rgjjlhzwmj()==null){
                VC_RGJJLHZWMJ.setText("");
            }else {
                VC_RGJJLHZWMJ.setText(resultBean.getData().get(0).getVc_rgjjlhzwmj().toString());
            }
            if (resultBean.getData().get(0).getVc_ygkzmjbl()==null){
                VC_YGKZMJBL.setText("");
            }else {
                VC_YGKZMJBL.setText(resultBean.getData().get(0).getVc_ygkzmjbl().toString());
            }
            if (resultBean.getData().get(0).getVc_zwzylyxzfw()==null){
                VC_ZWZYLYXZFW.setText("");
            }else {
                VC_ZWZYLYXZFW.setText(resultBean.getData().get(0).getVc_zwzylyxzfw().toString());
            }
            if (resultBean.getData().get(0).getVc_sjhxqyhcq()==null){
                VC_SJHXQYHCQ.setText("");
            }else {
                VC_SJHXQYHCQ.setText(resultBean.getData().get(0).getVc_sjhxqyhcq().toString());
            }
            if (resultBean.getData().get(0).getVc_yxgbmpz()==null){
                VC_YXGBMPZ.setText("");
            }else {
                VC_YXGBMPZ.setText(resultBean.getData().get(0).getVc_yxgbmpz().toString());
            }
            if (resultBean.getData().get(0).getDt_pz_time()==null){
                DT_PZ_TIME.setText("");
            }else {
                DT_PZ_TIME.setText(resultBean.getData().get(0).getDt_pz_time().toString());
            }
            if (resultBean.getData().get(0).getVc_pzbm()==null){
                VC_PZBM.setText("");
            }else {
                VC_PZBM.setText(resultBean.getData().get(0).getVc_pzbm().toString());
            }
            if (resultBean.getData().get(0).getVc_ggstlyfa()==null){
                VC_GGSTLYFA.setText("");
            }else {
                VC_GGSTLYFA.setText(resultBean.getData().get(0).getVc_ggstlyfa().toString());
            }
            if (resultBean.getData().get(0).getVc_jsphxscss()==null){
                VC_JSPHXSCSS.setText("");
            }else {
                VC_JSPHXSCSS.setText(resultBean.getData().get(0).getVc_jsphxscss().toString());
            }
            if (resultBean.getData().get(0).getVc_wrwpfcqcs()==null){
                VC_WRWPFCQCS.setText("");
            }else {
                VC_WRWPFCQCS.setText(resultBean.getData().get(0).getVc_wrwpfcqcs().toString());
            }
            if (resultBean.getData().get(0).getVc_wrclcs()==null){
                VC_WRCLCS.setText("");
            }else {
                VC_WRCLCS.setText(resultBean.getData().get(0).getVc_wrclcs().toString());
            }
            if (resultBean.getData().get(0).getVc_jqwrwjcsj()==null){
                VC_JQWRWJCSJ.setText("");
            }else {
                VC_JQWRWJCSJ.setText(resultBean.getData().get(0).getVc_jqwrwjcsj().toString());
            }
            if (resultBean.getData().get(0).getVc_wpwrwsfcb()==null){
                VC_WPWRWSFCB.setText("");
            }else {
                VC_WPWRWSFCB.setText(resultBean.getData().get(0).getVc_wpwrwsfcb().toString());
            }
            if (resultBean.getData().get(0).getVc_cbwryz()==null){
                VC_CBWRYZ.setText("");
            }else {
                VC_CBWRYZ.setText(resultBean.getData().get(0).getVc_cbwryz().toString());
            }
            if (resultBean.getData().get(0).getVc_jcjsxms()==null){
                VC_JCJSXMS.setText("");
            }else {
                VC_JCJSXMS.setText(resultBean.getData().get(0).getVc_jcjsxms().toString());
            }
            if (resultBean.getData().get(0).getVc_sxwfjsxm()==null){
                VC_SXWFJSXM.setText("");
            }else {
                VC_SXWFJSXM.setText(resultBean.getData().get(0).getVc_sxwfjsxm().toString());
            }
            if (resultBean.getData().get(0).getVc_sfwyhxqhcqsyqn()==null){
                VC_SFWYHXQHCQSYQN.setText("");
            }else {
                VC_SFWYHXQHCQSYQN.setText(resultBean.getData().get(0).getVc_sfwyhxqhcqsyqn().toString());
            }
            if (resultBean.getData().get(0).getVc_hxqwfxm()==null){
                VC_HXQWFXM.setText("");
            }else {
                VC_HXQWFXM.setText(resultBean.getData().get(0).getVc_hxqwfxm().toString());
            }
            if (resultBean.getData().get(0).getVc_hxqwfxmmc()==null){
                VC_HXQWFXMMC.setText("");
            }else {
                VC_HXQWFXMMC.setText(resultBean.getData().get(0).getVc_hxqwfxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_hcqwfxm()==null){
                VC_HCQWFXM.setText("");
            }else {
                VC_HCQWFXM.setText(resultBean.getData().get(0).getVc_hcqwfxm().toString());
            }
            if (resultBean.getData().get(0).getVc_hcqwfxmmc()==null){
                VC_HCQWFXMMC.setText("");
            }else {
                VC_HCQWFXMMC.setText(resultBean.getData().get(0).getVc_hcqwfxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_syqwfxm()==null){
                VC_SYQWFXM.setText("");
            }else {
                VC_SYQWFXM.setText(resultBean.getData().get(0).getVc_syqwfxm().toString());
            }
            if (resultBean.getData().get(0).getVc_syqwfxmmc()==null){
                VC_SYQWFXMMC.setText("");
            }else {
                VC_SYQWFXMMC.setText(resultBean.getData().get(0).getVc_syqwfxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_bzwjlx()==null){
                VC_BZWJLX.setText("");
            }else {
                VC_BZWJLX.setText(resultBean.getData().get(0).getVc_bzwjlx().toString());
            }
            if (resultBean.getData().get(0).getVc_ybzxmgs()==null){
                VC_YBZXMGS.setText("");
            }else {
                VC_YBZXMGS.setText(resultBean.getData().get(0).getVc_ybzxmgs().toString());
            }
            if (resultBean.getData().get(0).getVc_ybzxmmc()==null){
                VC_YBZXMMC.setText("");
            }else {
                VC_YBZXMMC.setText(resultBean.getData().get(0).getVc_ybzxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_wbzwjlx()==null){
                VC_WBZWJLX.setText("");
            }else {
                VC_WBZWJLX.setText(resultBean.getData().get(0).getVc_wbzwjlx().toString());
            }
            if (resultBean.getData().get(0).getVc_wbzxmgs()==null){
                VC_WBZXMGS.setText("");
            }else {
                VC_WBZXMGS.setText(resultBean.getData().get(0).getVc_wbzxmgs().toString());
            }
            if (resultBean.getData().get(0).getVc_wbzxmmc()==null){
                VC_WBZXMMC.setText("");
            }else {
                VC_WBZXMMC.setText(resultBean.getData().get(0).getVc_wbzxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_sfjdhpdj()==null){
                VC_SFJDHPDJ.setText("");
            }else {
                VC_SFJDHPDJ.setText(resultBean.getData().get(0).getVc_sfjdhpdj().toString());
            }
            if (resultBean.getData().get(0).getVc_jdhpdjxm()==null){
                VC_JDHPDJXM.setText("");
            }else {
                VC_JDHPDJXM.setText(resultBean.getData().get(0).getVc_jdhpdjxm().toString());
            }
            if (resultBean.getData().get(0).getVc_jdhpxmmc()==null){
                VC_JDHPXMMC.setText("");
            }else {
                VC_JDHPXMMC.setText(resultBean.getData().get(0).getVc_jdhpxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_wfhpspsx()==null){
                VC_WFHPSPSX.setText("");
            }else {
                VC_WFHPSPSX.setText(resultBean.getData().get(0).getVc_wfhpspsx().toString());
            }
            if (resultBean.getData().get(0).getVc_whpspwjs()==null){
                VC_WHPSPWJS.setText("");
            }else {
                VC_WHPSPWJS.setText(resultBean.getData().get(0).getVc_whpspwjs().toString());
            }
            if (resultBean.getData().get(0).getVc_whpspmc()==null){
                VC_WHPSPMC.setText("");
            }else {
                VC_WHPSPMC.setText(resultBean.getData().get(0).getVc_whpspmc().toString());
            }
            if (resultBean.getData().get(0).getVc_sfyjsp()==null){
                VC_SFYJSP.setText("");
            }else {
                VC_SFYJSP.setText(resultBean.getData().get(0).getVc_sfyjsp().toString());
            }
            if (resultBean.getData().get(0).getVc_yjspxms()==null){
                VC_YJSPXMS.setText("");
            }else {
                VC_YJSPXMS.setText(resultBean.getData().get(0).getVc_yjspxms().toString());
            }
            if (resultBean.getData().get(0).getVc_yjspxmmc()==null){
                VC_YJSPXMMC.setText("");
            }else {
                VC_YJSPXMMC.setText(resultBean.getData().get(0).getVc_yjspxmmc().toString());
            }
            if (resultBean.getData().get(0).getVc_wxmsyxsp()==null){
                VC_WXMSYXSP.setText("");
            }else {
                VC_WXMSYXSP.setText(resultBean.getData().get(0).getVc_wxmsyxsp().toString());
            }
            if (resultBean.getData().get(0).getVc_wxmsyxmc()==null){
                VC_WXMSYXMC.setText("");
            }else {
                VC_WXMSYXMC.setText(resultBean.getData().get(0).getVc_wxmsyxmc().toString());
            }
            if (resultBean.getData().get(0).getVc_wxmjghbys()==null){
                VC_WXMJGHBYS.setText("");
            }else {
                VC_WXMJGHBYS.setText(resultBean.getData().get(0).getVc_wxmjghbys().toString());
            }
            if (resultBean.getData().get(0).getVc_wxmjghbysmc()==null){
                VC_WXMJGHBYSMC.setText("");
            }else {
                VC_WXMJGHBYSMC.setText(resultBean.getData().get(0).getVc_wxmjghbysmc().toString());
            }
            if (resultBean.getData().get(0).getVc_fzcssfls()==null){
                VC_FZCSSFLS.setText("");
            }else {
                VC_FZCSSFLS.setText(resultBean.getData().get(0).getVc_fzcssfls().toString());
            }
            if (resultBean.getData().get(0).getVc_wlsdcss()==null){
                VC_WLSDCSS.setText("");
            }else {
                VC_WLSDCSS.setText(resultBean.getData().get(0).getVc_wlsdcss().toString());
            }
            if (resultBean.getData().get(0).getVc_wlsdcsmc()==null){
                VC_WLSDCSMC.setText("");
            }else {
                VC_WLSDCSMC.setText(resultBean.getData().get(0).getVc_wlsdcsmc().toString());
            }
            if (resultBean.getData().get(0).getVc_fzsszcyx()==null){
                VC_FZSSZCYX.setText("");
            }else {
                VC_FZSSZCYX.setText(resultBean.getData().get(0).getVc_fzsszcyx().toString());
            }
            if (resultBean.getData().get(0).getVc_yxbzcdqy()==null){
                VC_YXBZCDQY.setText("");
            }else {
                VC_YXBZCDQY.setText(resultBean.getData().get(0).getVc_yxbzcdqy().toString());
            }
            if (resultBean.getData().get(0).getVc_yphxss()==null){
                VC_YPHXSS.setText("");
            }else {
                VC_YPHXSS.setText(resultBean.getData().get(0).getVc_yphxss().toString());
            }
            if (resultBean.getData().get(0).getVc_sfpffhgd()==null){
                VC_SFPFFHGD.setText("");
            }else {
                VC_SFPFFHGD.setText(resultBean.getData().get(0).getVc_sfpffhgd().toString());
            }
            if (resultBean.getData().get(0).getVc_shsthj()==null){
                VC_SHSTHJ.setText("");
            }else {
                VC_SHSTHJ.setText(resultBean.getData().get(0).getVc_shsthj().toString());
            }
            if (resultBean.getData().get(0).getVc_czshxstgn()==null){
                VC_CZSHXSTGN.setText("");
            }else {
                VC_CZSHXSTGN.setText(resultBean.getData().get(0).getVc_czshxstgn().toString());
            }
            if (resultBean.getData().get(0).getVc_zdtfyjya()==null){
                VC_ZDTFYJYA.setText("");
            }else {
                VC_ZDTFYJYA.setText(resultBean.getData().get(0).getVc_zdtfyjya().toString());
            }
            if (resultBean.getData().get(0).getVc_dqkzyjyl()==null){
                VC_DQKZYJYL.setText("");
            }else {
                VC_DQKZYJYL.setText(resultBean.getData().get(0).getVc_dqkzyjyl().toString());
            }
            if (resultBean.getData().get(0).getCl_jcfxdwt()==null){
                CL_JCFXDWT.setText("");
            }else {
                CL_JCFXDWT.setText(resultBean.getData().get(0).getCl_jcfxdwt().toString());
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
