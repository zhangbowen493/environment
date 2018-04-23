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
import com.huaxin.yunnan.environment.Utils.SpUtils;
import com.huaxin.yunnan.environment.bean.MetalBeneficationBean;
import com.huaxin.yunnan.environment.net.NetTool;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_JR_INFO;

/**
 * 5、金属选矿行业现场监察记录
 */
public class MetalBeneficationActivity extends BaseActicity implements View.OnClickListener {

    private LinearLayout ll_no;
    private TextView title_text;
    private Intent intent;
    private String t_task_list_id;
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
    private TextView VC_ZYCPJCL;
    private TextView VC_XKSCGY;
    private TextView VC_QTSCGY;
    private TextView VC_ZYSCZZJSB;
    private TextView DT_XJSJ_TIME;
    private TextView DT_PZLX_TIME;
    private TextView VC_PZLXBM;
    private TextView VC_LXPZWH;
    private TextView VC_HPYXBG;
    private TextView VC_HPBZDW;
    private TextView DT_HPBZ_TIME;
    private TextView VC_SFCZJDDJBZHPQK;
    private TextView VC_HPSPDW;
    private TextView DT_HPSP_TIME;
    private TextView VC_HPSPWH;
    private TextView VC_SFCZYJSPQK;
    private TextView VC_ZYSCYFCL;
    private TextView VC_ZFCPJCL;
    private TextView VC_GXMCSSFYHJYXPJWJYZ;
    private TextView CL_BFDY;
    private TextView VC_BZHPBGSXMSFSYCYZCTTFW;
    private TextView VC_MQSFSYCYZCTTFW;
    private TextView DT_TRSSC_TIME;
    private TextView VC_YLJSCJGY;
    private TextView VC_SFPFTYSSC;
    private TextView VC_HBSSCSPDW;
    private TextView DT_HBSSCSP_TIME;
    private TextView VC_HBSSCSPWH;
    private TextView VC_SFTGHBJGYS;
    private TextView DT_JGYS_TIME;
    private TextView VC_JGYSDW;
    private TextView VC_JGYSSPWH;
    private TextView VC_SFJXGJGHKJ;
    private TextView VC_JGKJHPJSTSZDZXQK;
    private TextView VC_SFYFQDPWXKZBAZGDPFWRW;
    private TextView VC_SFXHJBHBMJXPWSBDJ;
    private TextView VC_SFJSZEJNPWF;
    private TextView VC_SYNDSJJNPWF;
    private TextView VC_YJPWF;
    private TextView VC_WJQPWFYY;
    private TextView VC_XKYJSYZYW;
    private TextView VC_TZWRW;
    private TextView VC_FSSJCSL;
    private TextView VC_SCFSCLSS;
    private TextView VC_CLL;
    private TextView VC_SFFHHPJPFYQDFSCLYQ;
    private TextView VC_BFHQKMS;
    private TextView VC_SFSXSHFSYSHSCFSFL;
    private TextView VC_SFCZGBJGDFSPFFSXW;
    private TextView CL_QKSM;
    private TextView CL_WXFWZYY;
    private TextView VC_YICSL;
    private TextView VC_YICZCS;
    private TextView VC_ERCSL;
    private TextView VC_ERCZCS;
    private TextView VC_SANCSL;
    private TextView VC_SANCZCS;
    private TextView VC_SICSL;
    private TextView VC_SICZCS;
    private TextView VC_QT;
    private TextView VC_QTCSL;
    private TextView VC_QTCZCS;
    private TextView VC_WXFWTZSFJQGF;
    private TextView VC_SYCSJCZQKSFXHBBMSB;
    private TextView VC_WSBDYNX;
    private TextView VC_WXFWCFKHCDSFSYBS;
    private TextView VC_SFFHWXFWCCGF;
    private TextView VC_ZCNLSCFSCSJSFCGYN;
    private TextView VC_ZCWSFJSYYJXDCZC;
    private TextView VC_RZYCCSFZXWXFWZYLDZD;
    private TextView VC_YSCLSFJYXGZZ;
    private TextView VC_YSL;
    private TextView VC_PC;
    private TextView VC_JSDWSFJYWFJYZZ;
    private TextView VC_SJCZFS;
    private TextView VC_QTYBGF;
    private TextView VC_SFJXGFCC;
    private TextView VC_ZHLYCSSFFHHPYQ;
    private TextView VC_CZFS;
    private TextView VC_FQCSHJ;
    private TextView VC_SFPTFQZLSS;
    private TextView VC_WPTJSSSMCW;
    private TextView VC_JQJGJCSFCB;
    private TextView VC_CBYZJJCZW;
    private TextView VC_JCDW;
    private TextView DT_JC_TIME;
    private TextView VC_GCZSBSFAHPYQCQCS;
    private TextView CL_WPTJSDSS;
    private TextView VC_HPYQDWSFHJL;
    private TextView VC_WSFHJLNSFYBHMB;
    private TextView DT_BHMBJS_TIME;
    private TextView VC_ZBHJBHQKMS;
    private TextView VC_SFLSHPJPFYQDFXFFDCCS;
    private TextView VC_WLSQKMS;
    private TextView VC_SFBZTFHJSJYJYA;
    private TextView VC_SFDTFHJSJYJYAJXPGBA;
    private TextView VC_SFAZYAYQJXNDYJYL;
    private TextView VC_SFCBYJWZ;
    private TextView CL_QTHBBMJCQK;
    private TextView CL_CZZYWT;
    private TextView CL_JCYQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal_benefication);
        initProgressDialog();
        intent = getIntent();
        t_task_list_id = intent.getStringExtra("t_task_list_id");
        Log.e("NameActivity", t_task_list_id);
        initData();
        initView();
    }

    private void initData() {
        yNProgressDialog.show();
        NetTool.getInstance().rxMetalBeneficationPostNet(URL_QUERY_JR_INFO, t_task_list_id, SpUtils.getString(getApplicationContext(), "userToken"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MetalBeneficationBean>() {
                    @Override
                    public void accept(@NonNull MetalBeneficationBean resultBean) throws Exception {
                        yNProgressDialog.dismiss();
                        if (resultBean.getSuccess().equals("1")) {
                            if (resultBean.getData().get(0).getDt_start_time()==null){
                                DT_START_TIME.setText("");
                            } else {
                                DT_START_TIME.setText(resultBean.getData().get(0).getDt_start_time().toString());
                            }
                            if (resultBean.getData().get(0).getDt_end_time()==null){
                                DT_END_TIME.setText("");
                            } else {
                                DT_END_TIME.setText(resultBean.getData().get(0).getDt_end_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_location()==null){
                                VC_LOCATION.setText("");
                            } else {
                                VC_LOCATION.setText(resultBean.getData().get(0).getVc_location().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jcr()==null){
                                VC_JCR.setText("");
                            } else {
                                VC_JCR.setText(resultBean.getData().get(0).getVc_jcr().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zfzh()==null){
                                VC_ZFZH.setText("");
                            } else {
                                VC_ZFZH.setText(resultBean.getData().get(0).getVc_zfzh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jlr()==null){
                                VC_JLR.setText("");
                            } else {
                                VC_JLR.setText(resultBean.getData().get(0).getVc_jlr().toString());
                            }
                            if (resultBean.getData().get(0).getVc_bjcdwmc()==null){
                                VC_BJCDWMC.setText("");
                            } else {
                                VC_BJCDWMC.setText(resultBean.getData().get(0).getVc_bjcdwmc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zzjgdmzh()==null){
                                VC_ZZJGDMZH.setText("");
                            } else {
                                VC_ZZJGDMZH.setText(resultBean.getData().get(0).getVc_zzjgdmzh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fddbr()==null){
                                VC_FDDBR.setText("");
                            } else {
                                VC_FDDBR.setText(resultBean.getData().get(0).getVc_fddbr().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fddbrsfzh()==null){
                                VC_FDDBRSFZH.setText("");
                            } else {
                                VC_FDDBRSFZH.setText(resultBean.getData().get(0).getVc_fddbrsfzh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_xcfzr()==null){
                                VC_XCFZR.setText("");
                            } else {
                                VC_XCFZR.setText(resultBean.getData().get(0).getVc_xcfzr().toString());
                            }
                            if (resultBean.getData().get(0).getVc_xcfzrsfzh()==null){
                                VC_XCFZRSFZH.setText("");
                            } else {
                                VC_XCFZRSFZH.setText(resultBean.getData().get(0).getVc_xcfzrsfzh().toString());
                            }
                            if (resultBean.getData().get(0).getNb_age()==null){
                                NB_AGE.setText("");
                            } else {
                                NB_AGE.setText(resultBean.getData().get(0).getNb_age().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gzdw()==null){
                                VC_GZDW.setText("");
                            } else {
                                VC_GZDW.setText(resultBean.getData().get(0).getVc_gzdw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_duty()==null){
                                VC_DUTY.setText("");
                            } else {
                                VC_DUTY.setText(resultBean.getData().get(0).getVc_duty().toString());
                            }
                            if (resultBean.getData().get(0).getVc_ybagx()==null){
                                VC_YBAGX.setText("");
                            } else {
                                VC_YBAGX.setText(resultBean.getData().get(0).getVc_ybagx().toString());
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
                            if (resultBean.getData().get(0).getVc_yzbm()==null){
                                VC_YZBM.setText("");
                            } else {
                                VC_YZBM.setText(resultBean.getData().get(0).getVc_yzbm().toString());
                            }
                            if (resultBean.getData().get(0).getCl_qtcjrxmjgzdw()==null){
                                CL_QTCJRXMJGZDW.setText("");
                            } else {
                                CL_QTCJRXMJGZDW.setText(resultBean.getData().get(0).getCl_qtcjrxmjgzdw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hbdwmc()==null){
                                VC_HBDWMC.setText("");
                            } else {
                                VC_HBDWMC.setText(resultBean.getData().get(0).getVc_hbdwmc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hbdwlx()==null){
                                VC_HBDWLX.setText("");
                            } else {
                                VC_HBDWLX.setText(resultBean.getData().get(0).getVc_hbdwlx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hjjclx()==null){
                                VC_HJJCLX.setText("");
                            } else {
                                VC_HJJCLX.setText(resultBean.getData().get(0).getVc_hjjclx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfqrzj()==null){
                                VC_SFQRZJ.setText("");
                            } else {
                                VC_SFQRZJ.setText(resultBean.getData().get(0).getVc_sfqrzj().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfsqhb()==null){
                                VC_SFSQHB.setText("");
                            } else {
                                VC_SFSQHB.setText(resultBean.getData().get(0).getVc_sfsqhb().toString());
                            }
                            if (resultBean.getData().get(0).getVc_county()==null){
                                VC_COUNTY.setText("");
                            } else {
                                VC_COUNTY.setText(resultBean.getData().get(0).getVc_county().toString());
                            }
                            if (resultBean.getData().get(0).getVc_city()==null){
                                VC_CITY.setText("");
                            } else {
                                VC_CITY.setText(resultBean.getData().get(0).getVc_city().toString());
                            }
                            if (resultBean.getData().get(0).getVc_town()==null){
                                VC_TOWN.setText("");
                            } else {
                                VC_TOWN.setText(resultBean.getData().get(0).getVc_town().toString());
                            }
                            if (resultBean.getData().get(0).getVc_xzc()==null){
                                VC_XZC.setText("");
                            } else {
                                VC_XZC.setText(resultBean.getData().get(0).getVc_xzc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gyyq()==null){
                                VC_GYYQ.setText("");
                            } else {
                                VC_GYYQ.setText(resultBean.getData().get(0).getVc_gyyq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_pq()==null){
                                VC_PQ.setText("");
                            } else {
                                VC_PQ.setText(resultBean.getData().get(0).getVc_pq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_xcjcszt()==null){
                                VC_XCJCSZT.setText("");
                            } else {
                                VC_XCJCSZT.setText(resultBean.getData().get(0).getVc_xcjcszt().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zycpjcl()==null){
                                VC_ZYCPJCL.setText("");
                            } else {
                                VC_ZYCPJCL.setText(resultBean.getData().get(0).getVc_zycpjcl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_xkscgy()==null){
                                VC_XKSCGY.setText("");
                            } else {
                                VC_XKSCGY.setText(resultBean.getData().get(0).getVc_xkscgy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_qtscgy()==null){
                                VC_QTSCGY.setText("");
                            } else {
                                VC_QTSCGY.setText(resultBean.getData().get(0).getVc_qtscgy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zysczzjsb()==null){
                                VC_ZYSCZZJSB.setText("");
                            } else {
                                VC_ZYSCZZJSB.setText(resultBean.getData().get(0).getVc_zysczzjsb().toString());
                            }
                            if (resultBean.getData().get(0).getDt_xjsj_time()==null){
                                DT_XJSJ_TIME.setText("");
                            } else {
                                DT_XJSJ_TIME.setText(resultBean.getData().get(0).getDt_xjsj_time().toString());
                            }
                            if (resultBean.getData().get(0).getDt_pzlx_time()==null){
                                DT_PZLX_TIME.setText("");
                            } else {
                                DT_PZLX_TIME.setText(resultBean.getData().get(0).getDt_pzlx_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_pzlxbm()==null){
                                VC_PZLXBM.setText("");
                            } else {
                                VC_PZLXBM.setText(resultBean.getData().get(0).getVc_pzlxbm().toString());
                            }
                            if (resultBean.getData().get(0).getVc_lxpzwh()==null){
                                VC_LXPZWH.setText("");
                            } else {
                                VC_LXPZWH.setText(resultBean.getData().get(0).getVc_lxpzwh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyxbg()==null){
                                VC_HPYXBG.setText("");
                            } else {
                                VC_HPYXBG.setText(resultBean.getData().get(0).getVc_hpyxbg().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpbzdw()==null){
                                VC_HPBZDW.setText("");
                            } else {
                                VC_HPBZDW.setText(resultBean.getData().get(0).getVc_hpbzdw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_hpbz_time()==null){
                                DT_HPBZ_TIME.setText("");
                            } else {
                                DT_HPBZ_TIME.setText(resultBean.getData().get(0).getDt_hpbz_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfczjddjbzhpqk()==null){
                                VC_SFCZJDDJBZHPQK.setText("");
                            } else {
                                VC_SFCZJDDJBZHPQK.setText(resultBean.getData().get(0).getVc_sfczjddjbzhpqk().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpspdw()==null){
                                VC_HPSPDW.setText("");
                            } else {
                                VC_HPSPDW.setText(resultBean.getData().get(0).getVc_hpspdw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_hpsp_time()==null){
                                DT_HPSP_TIME.setText("");
                            } else {
                                DT_HPSP_TIME.setText(resultBean.getData().get(0).getDt_hpsp_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpspwh()==null){
                                VC_HPSPWH.setText("");
                            } else {
                                VC_HPSPWH.setText(resultBean.getData().get(0).getVc_hpspwh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfczyjspqk()==null){
                                VC_SFCZYJSPQK.setText("");
                            } else {
                                VC_SFCZYJSPQK.setText(resultBean.getData().get(0).getVc_sfczyjspqk().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zyscyfcl()==null){
                                VC_ZYSCYFCL.setText("");
                            } else {
                                VC_ZYSCYFCL.setText(resultBean.getData().get(0).getVc_zyscyfcl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zfcpjcl()==null){
                                VC_ZFCPJCL.setText("");
                            } else {
                                VC_ZFCPJCL.setText(resultBean.getData().get(0).getVc_zfcpjcl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gxmcssfyhjyxpjwjyz()==null){
                                VC_GXMCSSFYHJYXPJWJYZ.setText("");
                            } else {
                                VC_GXMCSSFYHJYXPJWJYZ.setText(resultBean.getData().get(0).getVc_gxmcssfyhjyxpjwjyz().toString());
                            }
                            if (resultBean.getData().get(0).getCl_bfdy()==null){
                                CL_BFDY.setText("");
                            } else {
                                CL_BFDY.setText(resultBean.getData().get(0).getCl_bfdy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_bzhpbgsxmsfsycyzcttfw()==null){
                                VC_BZHPBGSXMSFSYCYZCTTFW.setText("");
                            } else {
                                VC_BZHPBGSXMSFSYCYZCTTFW.setText(resultBean.getData().get(0).getVc_bzhpbgsxmsfsycyzcttfw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_mqsfsycyzcttfw()==null){
                                VC_MQSFSYCYZCTTFW.setText("");
                            } else {
                                VC_MQSFSYCYZCTTFW.setText(resultBean.getData().get(0).getVc_mqsfsycyzcttfw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_trssc_time()==null){
                                DT_TRSSC_TIME.setText("");
                            } else {
                                DT_TRSSC_TIME.setText(resultBean.getData().get(0).getDt_trssc_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yljscjgy()==null){
                                VC_YLJSCJGY.setText("");
                            } else {
                                VC_YLJSCJGY.setText(resultBean.getData().get(0).getVc_yljscjgy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfpftyssc()==null){
                                VC_SFPFTYSSC.setText("");
                            } else {
                                VC_SFPFTYSSC.setText(resultBean.getData().get(0).getVc_sfpftyssc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hbsscspdw()==null){
                                VC_HBSSCSPDW.setText("");
                            } else {
                                VC_HBSSCSPDW.setText(resultBean.getData().get(0).getVc_hbsscspdw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_hbsscsp_time()==null){
                                DT_HBSSCSP_TIME.setText("");
                            } else {
                                DT_HBSSCSP_TIME.setText(resultBean.getData().get(0).getDt_hbsscsp_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hbsscspwh()==null){
                                VC_HBSSCSPWH.setText("");
                            } else {
                                VC_HBSSCSPWH.setText(resultBean.getData().get(0).getVc_hbsscspwh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sftghbjgys()==null){
                                VC_SFTGHBJGYS.setText("");
                            } else {
                                VC_SFTGHBJGYS.setText(resultBean.getData().get(0).getVc_sftghbjgys().toString());
                            }
                            if (resultBean.getData().get(0).getDt_jgys_time()==null){
                                DT_JGYS_TIME.setText("");
                            } else {
                                DT_JGYS_TIME.setText(resultBean.getData().get(0).getDt_jgys_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jgysdw()==null){
                                VC_JGYSDW.setText("");
                            } else {
                                VC_JGYSDW.setText(resultBean.getData().get(0).getVc_jgysdw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jgysspwh()==null){
                                VC_JGYSSPWH.setText("");
                            } else {
                                VC_JGYSSPWH.setText(resultBean.getData().get(0).getVc_jgysspwh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfjxgjghkj()==null){
                                VC_SFJXGJGHKJ.setText("");
                            } else {
                                VC_SFJXGJGHKJ.setText(resultBean.getData().get(0).getVc_sfjxgjghkj().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jgkjhpjstszdzxqk()==null){
                                VC_JGKJHPJSTSZDZXQK.setText("");
                            } else {
                                VC_JGKJHPJSTSZDZXQK.setText(resultBean.getData().get(0).getVc_jgkjhpjstszdzxqk().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfyfqdpwxkzbazgdpfwrw()==null){
                                VC_SFYFQDPWXKZBAZGDPFWRW.setText("");
                            } else {
                                VC_SFYFQDPWXKZBAZGDPFWRW.setText(resultBean.getData().get(0).getVc_sfyfqdpwxkzbazgdpfwrw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfxhjbhbmjxpwsbdj()==null){
                                VC_SFXHJBHBMJXPWSBDJ.setText("");
                            } else {
                                VC_SFXHJBHBMJXPWSBDJ.setText(resultBean.getData().get(0).getVc_sfxhjbhbmjxpwsbdj().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfjszejnpwf()==null){
                                VC_SFJSZEJNPWF.setText("");
                            } else {
                                VC_SFJSZEJNPWF.setText(resultBean.getData().get(0).getVc_sfjszejnpwf().toString());
                            }
                            if (resultBean.getData().get(0).getVc_syndsjjnpwf()==null){
                                VC_SYNDSJJNPWF.setText("");
                            } else {
                                VC_SYNDSJJNPWF.setText(resultBean.getData().get(0).getVc_syndsjjnpwf().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yjpwf()==null){
                                VC_YJPWF.setText("");
                            } else {
                                VC_YJPWF.setText(resultBean.getData().get(0).getVc_yjpwf().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wjqpwfyy()==null){
                                VC_WJQPWFYY.setText("");
                            } else {
                                VC_WJQPWFYY.setText(resultBean.getData().get(0).getVc_wjqpwfyy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_xkyjsyzyw()==null){
                                VC_XKYJSYZYW.setText("");
                            } else {
                                VC_XKYJSYZYW.setText(resultBean.getData().get(0).getVc_xkyjsyzyw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_tzwrw()==null){
                                VC_TZWRW.setText("");
                            } else {
                                VC_TZWRW.setText(resultBean.getData().get(0).getVc_tzwrw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fssjcsl()==null){
                                VC_FSSJCSL.setText("");
                            } else {
                                VC_FSSJCSL.setText(resultBean.getData().get(0).getVc_fssjcsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_scfsclss()==null){
                                VC_SCFSCLSS.setText("");
                            } else {
                                VC_SCFSCLSS.setText(resultBean.getData().get(0).getVc_scfsclss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cll()==null){
                                VC_CLL.setText("");
                            } else {
                                VC_CLL.setText(resultBean.getData().get(0).getVc_cll().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sffhhpjpfyqdfsclyq()==null){
                                VC_SFFHHPJPFYQDFSCLYQ.setText("");
                            } else {
                                VC_SFFHHPJPFYQDFSCLYQ.setText(resultBean.getData().get(0).getVc_sffhhpjpfyqdfsclyq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_bfhqkms()==null){
                                VC_BFHQKMS.setText("");
                            } else {
                                VC_BFHQKMS.setText(resultBean.getData().get(0).getVc_bfhqkms().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfsxshfsyshscfsfl()==null){
                                VC_SFSXSHFSYSHSCFSFL.setText("");
                            } else {
                                VC_SFSXSHFSYSHSCFSFL.setText(resultBean.getData().get(0).getVc_sfsxshfsyshscfsfl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfczgbjgdfspffsxw()==null){
                                VC_SFCZGBJGDFSPFFSXW.setText("");
                            } else {
                                VC_SFCZGBJGDFSPFFSXW.setText(resultBean.getData().get(0).getVc_sfczgbjgdfspffsxw().toString());
                            }
                            if (resultBean.getData().get(0).getCl_qksm()==null){
                                CL_QKSM.setText("");
                            } else {
                                CL_QKSM.setText(resultBean.getData().get(0).getCl_qksm().toString());
                            }
                            if (resultBean.getData().get(0).getCl_wxfwzyy()==null){
                                CL_WXFWZYY.setText("");
                            } else {
                                CL_WXFWZYY.setText(resultBean.getData().get(0).getCl_wxfwzyy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yicsl()==null){
                                VC_YICSL.setText("");
                            } else {
                                VC_YICSL.setText(resultBean.getData().get(0).getVc_yicsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_ercsl()==null){
                                VC_ERCSL.setText("");
                            } else {
                                VC_ERCSL.setText(resultBean.getData().get(0).getVc_ercsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yiczcs()==null){
                                VC_YICZCS.setText("");
                            } else {
                                VC_YICZCS.setText(resultBean.getData().get(0).getVc_yiczcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_erczcs()==null){
                                VC_ERCZCS.setText("");
                            } else {
                                VC_ERCZCS.setText(resultBean.getData().get(0).getVc_erczcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sancsl()==null){
                                VC_SANCSL.setText("");
                            } else {
                                VC_SANCSL.setText(resultBean.getData().get(0).getVc_sancsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sanczcs()==null){
                                VC_SANCZCS.setText("");
                            } else {
                                VC_SANCZCS.setText(resultBean.getData().get(0).getVc_sanczcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_siczcs()==null){
                                VC_SICZCS.setText("");
                            } else {
                                VC_SICZCS.setText(resultBean.getData().get(0).getVc_siczcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sicsl()==null){
                                VC_SICSL.setText("");
                            } else {
                                VC_SICSL.setText(resultBean.getData().get(0).getVc_sicsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_qt()==null){
                                VC_QT.setText("");
                            } else {
                                VC_QT.setText(resultBean.getData().get(0).getVc_qt().toString());
                            }
                            if (resultBean.getData().get(0).getVc_qtczcs()==null){
                                VC_QTCZCS.setText("");
                            } else {
                                VC_QTCZCS.setText(resultBean.getData().get(0).getVc_qtczcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_qtcsl()==null){
                                VC_QTCSL.setText("");
                            } else {
                                VC_QTCSL.setText(resultBean.getData().get(0).getVc_qtcsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wxfwtzsfjqgf()==null){
                                VC_WXFWTZSFJQGF.setText("");
                            } else {
                                VC_WXFWTZSFJQGF.setText(resultBean.getData().get(0).getVc_wxfwtzsfjqgf().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sycsjczqksfxhbbmsb()==null){
                                VC_SYCSJCZQKSFXHBBMSB.setText("");
                            } else {
                                VC_SYCSJCZQKSFXHBBMSB.setText(resultBean.getData().get(0).getVc_sycsjczqksfxhbbmsb().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wsbdynx()==null){
                                VC_WSBDYNX.setText("");
                            } else {
                                VC_WSBDYNX.setText(resultBean.getData().get(0).getVc_wsbdynx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wxfwcfkhcdsfsybs()==null){
                                VC_WXFWCFKHCDSFSYBS.setText("");
                            } else {
                                VC_WXFWCFKHCDSFSYBS.setText(resultBean.getData().get(0).getVc_wxfwcfkhcdsfsybs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sffhwxfwccgf()==null){
                                VC_SFFHWXFWCCGF.setText("");
                            } else {
                                VC_SFFHWXFWCCGF.setText(resultBean.getData().get(0).getVc_sffhwxfwccgf().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zcnlscfscsjsfcgyn()==null){
                                VC_ZCNLSCFSCSJSFCGYN.setText("");
                            } else {
                                VC_ZCNLSCFSCSJSFCGYN.setText(resultBean.getData().get(0).getVc_zcnlscfscsjsfcgyn().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zcwsfjsyyjxdczc()==null){
                                VC_ZCWSFJSYYJXDCZC.setText("");
                            } else {
                                VC_ZCWSFJSYYJXDCZC.setText(resultBean.getData().get(0).getVc_zcwsfjsyyjxdczc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_rzyccsfzxwxfwzyldzd()==null){
                                VC_RZYCCSFZXWXFWZYLDZD.setText("");
                            } else {
                                VC_RZYCCSFZXWXFWZYLDZD.setText(resultBean.getData().get(0).getVc_rzyccsfzxwxfwzyldzd().toString());
                            }
                            if (resultBean.getData().get(0).getVc_ysclsfjyxgzz()==null){
                                VC_YSCLSFJYXGZZ.setText("");
                            } else {
                                VC_YSCLSFJYXGZZ.setText(resultBean.getData().get(0).getVc_ysclsfjyxgzz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_ysl()==null){
                                VC_YSL.setText("");
                            } else {
                                VC_YSL.setText(resultBean.getData().get(0).getVc_ysl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_pc()==null){
                                VC_PC.setText("");
                            } else {
                                VC_PC.setText(resultBean.getData().get(0).getVc_pc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jsdwsfjywfjyzz()==null){
                                VC_JSDWSFJYWFJYZZ.setText("");
                            } else {
                                VC_JSDWSFJYWFJYZZ.setText(resultBean.getData().get(0).getVc_jsdwsfjywfjyzz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjczfs()==null){
                                VC_SJCZFS.setText("");
                            } else {
                                VC_SJCZFS.setText(resultBean.getData().get(0).getVc_sjczfs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_qtybgf()==null){
                                VC_QTYBGF.setText("");
                            } else {
                                VC_QTYBGF.setText(resultBean.getData().get(0).getVc_qtybgf().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfjxgfcc()==null){
                                VC_SFJXGFCC.setText("");
                            } else {
                                VC_SFJXGFCC.setText(resultBean.getData().get(0).getVc_sfjxgfcc().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zhlycssffhhpyq()==null){
                                VC_ZHLYCSSFFHHPYQ.setText("");
                            } else {
                                VC_ZHLYCSSFFHHPYQ.setText(resultBean.getData().get(0).getVc_zhlycssffhhpyq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_czfs()==null){
                                VC_CZFS.setText("");
                            } else {
                                VC_CZFS.setText(resultBean.getData().get(0).getVc_czfs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fqcshj()==null){
                                VC_FQCSHJ.setText("");
                            } else {
                                VC_FQCSHJ.setText(resultBean.getData().get(0).getVc_fqcshj().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfptfqzlss()==null){
                                VC_SFPTFQZLSS.setText("");
                            } else {
                                VC_SFPTFQZLSS.setText(resultBean.getData().get(0).getVc_sfptfqzlss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wptjsssmcw()==null){
                                VC_WPTJSSSMCW.setText("");
                            } else {
                                VC_WPTJSSSMCW.setText(resultBean.getData().get(0).getVc_wptjsssmcw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jqjgjcsfcb()==null){
                                VC_JQJGJCSFCB.setText("");
                            } else {
                                VC_JQJGJCSFCB.setText(resultBean.getData().get(0).getVc_jqjgjcsfcb().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cbyzjjczw()==null){
                                VC_CBYZJJCZW.setText("");
                            } else {
                                VC_CBYZJJCZW.setText(resultBean.getData().get(0).getVc_cbyzjjczw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jcdw()==null){
                                VC_JCDW.setText("");
                            } else {
                                VC_JCDW.setText(resultBean.getData().get(0).getVc_jcdw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_jc_time()==null){
                                DT_JC_TIME.setText("");
                            } else {
                                DT_JC_TIME.setText(resultBean.getData().get(0).getDt_jc_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gczsbsfahpyqcqcs()==null){
                                VC_GCZSBSFAHPYQCQCS.setText("");
                            } else {
                                VC_GCZSBSFAHPYQCQCS.setText(resultBean.getData().get(0).getVc_gczsbsfahpyqcqcs().toString());
                            }
                            if (resultBean.getData().get(0).getCl_wptjsdss()==null){
                                CL_WPTJSDSS.setText("");
                            } else {
                                CL_WPTJSDSS.setText(resultBean.getData().get(0).getCl_wptjsdss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqdwsfhjl()==null){
                                VC_HPYQDWSFHJL.setText("");
                            } else {
                                VC_HPYQDWSFHJL.setText(resultBean.getData().get(0).getVc_hpyqdwsfhjl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wsfhjlnsfybhmb()==null){
                                VC_WSFHJLNSFYBHMB.setText("");
                            } else {
                                VC_WSFHJLNSFYBHMB.setText(resultBean.getData().get(0).getVc_wsfhjlnsfybhmb().toString());
                            }
                            if (resultBean.getData().get(0).getDt_bhmbjs_time()==null){
                                DT_BHMBJS_TIME.setText("");
                            } else {
                                DT_BHMBJS_TIME.setText(resultBean.getData().get(0).getDt_bhmbjs_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_zbhjbhqkms()==null){
                                VC_ZBHJBHQKMS.setText("");
                            } else {
                                VC_ZBHJBHQKMS.setText(resultBean.getData().get(0).getVc_zbhjbhqkms().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs()==null){
                                VC_SFLSHPJPFYQDFXFFDCCS.setText("");
                            } else {
                                VC_SFLSHPJPFYQDFXFFDCCS.setText(resultBean.getData().get(0).getVc_sflshpjpfyqdfxffdccs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wlsqkms()==null){
                                VC_WLSQKMS.setText("");
                            } else {
                                VC_WLSQKMS.setText(resultBean.getData().get(0).getVc_wlsqkms().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfbztfhjsjyjya()==null){
                                VC_SFBZTFHJSJYJYA.setText("");
                            } else {
                                VC_SFBZTFHJSJYJYA.setText(resultBean.getData().get(0).getVc_sfbztfhjsjyjya().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfdtfhjsjyjyajxpgba()==null){
                                VC_SFDTFHJSJYJYAJXPGBA.setText("");
                            } else {
                                VC_SFDTFHJSJYJYAJXPGBA.setText(resultBean.getData().get(0).getVc_sfdtfhjsjyjyajxpgba().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfazyayqjxndyjyl()==null){
                                VC_SFAZYAYQJXNDYJYL.setText("");
                            } else {
                                VC_SFAZYAYQJXNDYJYL.setText(resultBean.getData().get(0).getVc_sfazyayqjxndyjyl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfcbyjwz()==null){
                                VC_SFCBYJWZ.setText("");
                            } else {
                                VC_SFCBYJWZ.setText(resultBean.getData().get(0).getVc_sfcbyjwz().toString());
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
                            Toast.makeText(getApplicationContext(), "数据为空！", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e("LoginActivity", throwable.getMessage().toString());
                        yNProgressDialog.dismiss();
                        Toast.makeText(getApplicationContext(), "连接超时", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void initView() {
        ll_no = (LinearLayout) findViewById(R.id.ll_no);
        title_text = (TextView) findViewById(R.id.title_text);
        title_text.setText("金属选矿行业现场监察记录");

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
        VC_ZYCPJCL = (TextView) findViewById(R.id.VC_ZYCPJCL);
        VC_ZYCPJCL.setOnClickListener(this);
        VC_XKSCGY = (TextView) findViewById(R.id.VC_XKSCGY);
        VC_XKSCGY.setOnClickListener(this);
        VC_QTSCGY = (TextView) findViewById(R.id.VC_QTSCGY);
        VC_QTSCGY.setOnClickListener(this);
        VC_ZYSCZZJSB = (TextView) findViewById(R.id.VC_ZYSCZZJSB);
        VC_ZYSCZZJSB.setOnClickListener(this);
        DT_XJSJ_TIME = (TextView) findViewById(R.id.DT_XJSJ_TIME);
        DT_XJSJ_TIME.setOnClickListener(this);
        DT_PZLX_TIME = (TextView) findViewById(R.id.DT_PZLX_TIME);
        DT_PZLX_TIME.setOnClickListener(this);
        VC_PZLXBM = (TextView) findViewById(R.id.VC_PZLXBM);
        VC_PZLXBM.setOnClickListener(this);
        VC_LXPZWH = (TextView) findViewById(R.id.VC_LXPZWH);
        VC_LXPZWH.setOnClickListener(this);
        VC_HPYXBG = (TextView) findViewById(R.id.VC_HPYXBG);
        VC_HPYXBG.setOnClickListener(this);
        VC_HPBZDW = (TextView) findViewById(R.id.VC_HPBZDW);
        VC_HPBZDW.setOnClickListener(this);
        DT_HPBZ_TIME = (TextView) findViewById(R.id.DT_HPBZ_TIME);
        DT_HPBZ_TIME.setOnClickListener(this);
        VC_SFCZJDDJBZHPQK = (TextView) findViewById(R.id.VC_SFCZJDDJBZHPQK);
        VC_SFCZJDDJBZHPQK.setOnClickListener(this);
        VC_HPSPDW = (TextView) findViewById(R.id.VC_HPSPDW);
        VC_HPSPDW.setOnClickListener(this);
        DT_HPSP_TIME = (TextView) findViewById(R.id.DT_HPSP_TIME);
        DT_HPSP_TIME.setOnClickListener(this);
        VC_HPSPWH = (TextView) findViewById(R.id.VC_HPSPWH);
        VC_HPSPWH.setOnClickListener(this);
        VC_SFCZYJSPQK = (TextView) findViewById(R.id.VC_SFCZYJSPQK);
        VC_SFCZYJSPQK.setOnClickListener(this);
        VC_ZYSCYFCL = (TextView) findViewById(R.id.VC_ZYSCYFCL);
        VC_ZYSCYFCL.setOnClickListener(this);
        VC_ZFCPJCL = (TextView) findViewById(R.id.VC_ZFCPJCL);
        VC_ZFCPJCL.setOnClickListener(this);
        VC_GXMCSSFYHJYXPJWJYZ = (TextView) findViewById(R.id.VC_GXMCSSFYHJYXPJWJYZ);
        VC_GXMCSSFYHJYXPJWJYZ.setOnClickListener(this);
        CL_BFDY = (TextView) findViewById(R.id.CL_BFDY);
        CL_BFDY.setOnClickListener(this);
        VC_BZHPBGSXMSFSYCYZCTTFW = (TextView) findViewById(R.id.VC_BZHPBGSXMSFSYCYZCTTFW);
        VC_BZHPBGSXMSFSYCYZCTTFW.setOnClickListener(this);
        VC_MQSFSYCYZCTTFW = (TextView) findViewById(R.id.VC_MQSFSYCYZCTTFW);
        VC_MQSFSYCYZCTTFW.setOnClickListener(this);
        DT_TRSSC_TIME = (TextView) findViewById(R.id.DT_TRSSC_TIME);
        DT_TRSSC_TIME.setOnClickListener(this);
        VC_YLJSCJGY = (TextView) findViewById(R.id.VC_YLJSCJGY);
        VC_YLJSCJGY.setOnClickListener(this);
        VC_SFPFTYSSC = (TextView) findViewById(R.id.VC_SFPFTYSSC);
        VC_SFPFTYSSC.setOnClickListener(this);
        VC_HBSSCSPDW = (TextView) findViewById(R.id.VC_HBSSCSPDW);
        VC_HBSSCSPDW.setOnClickListener(this);
        DT_HBSSCSP_TIME = (TextView) findViewById(R.id.DT_HBSSCSP_TIME);
        DT_HBSSCSP_TIME.setOnClickListener(this);
        VC_HBSSCSPWH = (TextView) findViewById(R.id.VC_HBSSCSPWH);
        VC_HBSSCSPWH.setOnClickListener(this);
        VC_SFTGHBJGYS = (TextView) findViewById(R.id.VC_SFTGHBJGYS);
        VC_SFTGHBJGYS.setOnClickListener(this);
        DT_JGYS_TIME = (TextView) findViewById(R.id.DT_JGYS_TIME);
        DT_JGYS_TIME.setOnClickListener(this);
        VC_JGYSDW = (TextView) findViewById(R.id.VC_JGYSDW);
        VC_JGYSDW.setOnClickListener(this);
        VC_JGYSSPWH = (TextView) findViewById(R.id.VC_JGYSSPWH);
        VC_JGYSSPWH.setOnClickListener(this);
        VC_SFJXGJGHKJ = (TextView) findViewById(R.id.VC_SFJXGJGHKJ);
        VC_SFJXGJGHKJ.setOnClickListener(this);
        VC_JGKJHPJSTSZDZXQK = (TextView) findViewById(R.id.VC_JGKJHPJSTSZDZXQK);
        VC_JGKJHPJSTSZDZXQK.setOnClickListener(this);
        VC_SFYFQDPWXKZBAZGDPFWRW = (TextView) findViewById(R.id.VC_SFYFQDPWXKZBAZGDPFWRW);
        VC_SFYFQDPWXKZBAZGDPFWRW.setOnClickListener(this);
        VC_SFXHJBHBMJXPWSBDJ = (TextView) findViewById(R.id.VC_SFXHJBHBMJXPWSBDJ);
        VC_SFXHJBHBMJXPWSBDJ.setOnClickListener(this);
        VC_SFJSZEJNPWF = (TextView) findViewById(R.id.VC_SFJSZEJNPWF);
        VC_SFJSZEJNPWF.setOnClickListener(this);
        VC_SYNDSJJNPWF = (TextView) findViewById(R.id.VC_SYNDSJJNPWF);
        VC_SYNDSJJNPWF.setOnClickListener(this);
        VC_YJPWF = (TextView) findViewById(R.id.VC_YJPWF);
        VC_YJPWF.setOnClickListener(this);
        VC_WJQPWFYY = (TextView) findViewById(R.id.VC_WJQPWFYY);
        VC_WJQPWFYY.setOnClickListener(this);
        VC_XKYJSYZYW = (TextView) findViewById(R.id.VC_XKYJSYZYW);
        VC_XKYJSYZYW.setOnClickListener(this);
        VC_TZWRW = (TextView) findViewById(R.id.VC_TZWRW);
        VC_TZWRW.setOnClickListener(this);
        VC_FSSJCSL = (TextView) findViewById(R.id.VC_FSSJCSL);
        VC_FSSJCSL.setOnClickListener(this);
        VC_SCFSCLSS = (TextView) findViewById(R.id.VC_SCFSCLSS);
        VC_SCFSCLSS.setOnClickListener(this);
        VC_CLL = (TextView) findViewById(R.id.VC_CLL);
        VC_CLL.setOnClickListener(this);
        VC_SFFHHPJPFYQDFSCLYQ = (TextView) findViewById(R.id.VC_SFFHHPJPFYQDFSCLYQ);
        VC_SFFHHPJPFYQDFSCLYQ.setOnClickListener(this);
        VC_BFHQKMS = (TextView) findViewById(R.id.VC_BFHQKMS);
        VC_BFHQKMS.setOnClickListener(this);
        VC_SFSXSHFSYSHSCFSFL = (TextView) findViewById(R.id.VC_SFSXSHFSYSHSCFSFL);
        VC_SFSXSHFSYSHSCFSFL.setOnClickListener(this);
        VC_SFCZGBJGDFSPFFSXW = (TextView) findViewById(R.id.VC_SFCZGBJGDFSPFFSXW);
        VC_SFCZGBJGDFSPFFSXW.setOnClickListener(this);
        CL_QKSM = (TextView) findViewById(R.id.CL_QKSM);
        CL_QKSM.setOnClickListener(this);
        CL_WXFWZYY = (TextView) findViewById(R.id.CL_WXFWZYY);
        CL_WXFWZYY.setOnClickListener(this);
        VC_YICSL = (TextView) findViewById(R.id.VC_YICSL);
        VC_YICSL.setOnClickListener(this);
        VC_YICZCS = (TextView) findViewById(R.id.VC_YICZCS);
        VC_YICZCS.setOnClickListener(this);
        VC_ERCSL = (TextView) findViewById(R.id.VC_ERCSL);
        VC_ERCSL.setOnClickListener(this);
        VC_ERCZCS = (TextView) findViewById(R.id.VC_ERCZCS);
        VC_ERCZCS.setOnClickListener(this);
        VC_SANCSL = (TextView) findViewById(R.id.VC_SANCSL);
        VC_SANCSL.setOnClickListener(this);
        VC_SANCZCS = (TextView) findViewById(R.id.VC_SANCZCS);
        VC_SANCZCS.setOnClickListener(this);
        VC_SICSL = (TextView) findViewById(R.id.VC_SICSL);
        VC_SICSL.setOnClickListener(this);
        VC_SICZCS = (TextView) findViewById(R.id.VC_SICZCS);
        VC_SICZCS.setOnClickListener(this);
        VC_QT = (TextView) findViewById(R.id.VC_QT);
        VC_QT.setOnClickListener(this);
        VC_QTCSL = (TextView) findViewById(R.id.VC_QTCSL);
        VC_QTCSL.setOnClickListener(this);
        VC_QTCZCS = (TextView) findViewById(R.id.VC_QTCZCS);
        VC_QTCZCS.setOnClickListener(this);
        VC_WXFWTZSFJQGF = (TextView) findViewById(R.id.VC_WXFWTZSFJQGF);
        VC_WXFWTZSFJQGF.setOnClickListener(this);
        VC_SYCSJCZQKSFXHBBMSB = (TextView) findViewById(R.id.VC_SYCSJCZQKSFXHBBMSB);
        VC_SYCSJCZQKSFXHBBMSB.setOnClickListener(this);
        VC_WSBDYNX = (TextView) findViewById(R.id.VC_WSBDYNX);
        VC_WSBDYNX.setOnClickListener(this);
        VC_WXFWCFKHCDSFSYBS = (TextView) findViewById(R.id.VC_WXFWCFKHCDSFSYBS);
        VC_WXFWCFKHCDSFSYBS.setOnClickListener(this);
        VC_SFFHWXFWCCGF = (TextView) findViewById(R.id.VC_SFFHWXFWCCGF);
        VC_SFFHWXFWCCGF.setOnClickListener(this);
        VC_ZCNLSCFSCSJSFCGYN = (TextView) findViewById(R.id.VC_ZCNLSCFSCSJSFCGYN);
        VC_ZCNLSCFSCSJSFCGYN.setOnClickListener(this);
        VC_ZCWSFJSYYJXDCZC = (TextView) findViewById(R.id.VC_ZCWSFJSYYJXDCZC);
        VC_ZCWSFJSYYJXDCZC.setOnClickListener(this);
        VC_RZYCCSFZXWXFWZYLDZD = (TextView) findViewById(R.id.VC_RZYCCSFZXWXFWZYLDZD);
        VC_RZYCCSFZXWXFWZYLDZD.setOnClickListener(this);
        VC_YSCLSFJYXGZZ = (TextView) findViewById(R.id.VC_YSCLSFJYXGZZ);
        VC_YSCLSFJYXGZZ.setOnClickListener(this);
        VC_YSL = (TextView) findViewById(R.id.VC_YSL);
        VC_YSL.setOnClickListener(this);
        VC_PC = (TextView) findViewById(R.id.VC_PC);
        VC_PC.setOnClickListener(this);
        VC_JSDWSFJYWFJYZZ = (TextView) findViewById(R.id.VC_JSDWSFJYWFJYZZ);
        VC_JSDWSFJYWFJYZZ.setOnClickListener(this);
        VC_SJCZFS = (TextView) findViewById(R.id.VC_SJCZFS);
        VC_SJCZFS.setOnClickListener(this);
        VC_QTYBGF = (TextView) findViewById(R.id.VC_QTYBGF);
        VC_QTYBGF.setOnClickListener(this);
        VC_SFJXGFCC = (TextView) findViewById(R.id.VC_SFJXGFCC);
        VC_SFJXGFCC.setOnClickListener(this);
        VC_ZHLYCSSFFHHPYQ = (TextView) findViewById(R.id.VC_ZHLYCSSFFHHPYQ);
        VC_ZHLYCSSFFHHPYQ.setOnClickListener(this);
        VC_CZFS = (TextView) findViewById(R.id.VC_CZFS);
        VC_CZFS.setOnClickListener(this);
        VC_FQCSHJ = (TextView) findViewById(R.id.VC_FQCSHJ);
        VC_FQCSHJ.setOnClickListener(this);
        VC_SFPTFQZLSS = (TextView) findViewById(R.id.VC_SFPTFQZLSS);
        VC_SFPTFQZLSS.setOnClickListener(this);
        VC_WPTJSSSMCW = (TextView) findViewById(R.id.VC_WPTJSSSMCW);
        VC_WPTJSSSMCW.setOnClickListener(this);
        VC_JQJGJCSFCB = (TextView) findViewById(R.id.VC_JQJGJCSFCB);
        VC_JQJGJCSFCB.setOnClickListener(this);
        VC_CBYZJJCZW = (TextView) findViewById(R.id.VC_CBYZJJCZW);
        VC_CBYZJJCZW.setOnClickListener(this);
        VC_JCDW = (TextView) findViewById(R.id.VC_JCDW);
        VC_JCDW.setOnClickListener(this);
        DT_JC_TIME = (TextView) findViewById(R.id.DT_JC_TIME);
        DT_JC_TIME.setOnClickListener(this);
        VC_GCZSBSFAHPYQCQCS = (TextView) findViewById(R.id.VC_GCZSBSFAHPYQCQCS);
        VC_GCZSBSFAHPYQCQCS.setOnClickListener(this);
        CL_WPTJSDSS = (TextView) findViewById(R.id.CL_WPTJSDSS);
        CL_WPTJSDSS.setOnClickListener(this);
        VC_HPYQDWSFHJL = (TextView) findViewById(R.id.VC_HPYQDWSFHJL);
        VC_HPYQDWSFHJL.setOnClickListener(this);
        VC_WSFHJLNSFYBHMB = (TextView) findViewById(R.id.VC_WSFHJLNSFYBHMB);
        VC_WSFHJLNSFYBHMB.setOnClickListener(this);
        DT_BHMBJS_TIME = (TextView) findViewById(R.id.DT_BHMBJS_TIME);
        DT_BHMBJS_TIME.setOnClickListener(this);
        VC_ZBHJBHQKMS = (TextView) findViewById(R.id.VC_ZBHJBHQKMS);
        VC_ZBHJBHQKMS.setOnClickListener(this);
        VC_SFLSHPJPFYQDFXFFDCCS = (TextView) findViewById(R.id.VC_SFLSHPJPFYQDFXFFDCCS);
        VC_SFLSHPJPFYQDFXFFDCCS.setOnClickListener(this);
        VC_WLSQKMS = (TextView) findViewById(R.id.VC_WLSQKMS);
        VC_WLSQKMS.setOnClickListener(this);
        VC_SFBZTFHJSJYJYA = (TextView) findViewById(R.id.VC_SFBZTFHJSJYJYA);
        VC_SFBZTFHJSJYJYA.setOnClickListener(this);
        VC_SFDTFHJSJYJYAJXPGBA = (TextView) findViewById(R.id.VC_SFDTFHJSJYJYAJXPGBA);
        VC_SFDTFHJSJYJYAJXPGBA.setOnClickListener(this);
        VC_SFAZYAYQJXNDYJYL = (TextView) findViewById(R.id.VC_SFAZYAYQJXNDYJYL);
        VC_SFAZYAYQJXNDYJYL.setOnClickListener(this);
        VC_SFCBYJWZ = (TextView) findViewById(R.id.VC_SFCBYJWZ);
        VC_SFCBYJWZ.setOnClickListener(this);
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
}
