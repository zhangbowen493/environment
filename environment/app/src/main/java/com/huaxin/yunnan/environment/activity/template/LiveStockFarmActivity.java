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
import com.huaxin.yunnan.environment.bean.LiveStockFarmBean;
import com.huaxin.yunnan.environment.net.NetTool;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.huaxin.yunnan.environment.Constant.URL_QUERY_CRD_INFO;

/**
 * 3、畜禽养殖现场监察记录
 */
public class LiveStockFarmActivity extends BaseActicity implements View.OnClickListener {

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
    private TextView VC_COUNTY;
    private TextView VC_TOWN;
    private TextView VC_CZJY;
    private TextView VC_YZFS;
    private TextView VC_HPYQCNCL;
    private TextView VC_HPYQSL;
    private TextView VC_WSFHJL;
    private TextView VC_SJCNCL;
    private TextView VC_SJSL;
    private TextView VC_SJWSFHJL;
    private TextView VC_SFJYJYQ;
    private TextView VC_JYQLX;
    private TextView VC_SFJYHJMGQ;
    private TextView VC_HJMGQLX;
    private TextView DT_XMJS_TIME;
    private TextView DT_XMJC_TIME;
    private TextView VC_SFZGHJYXPJ;
    private TextView VC_BZLX;
    private TextView VC_BZDW;
    private TextView DT_BZ_TIME;
    private TextView VC_SFJDDJZHP;
    private TextView VC_HPSPDW;
    private TextView DT_SP_TIME;
    private TextView VC_SPWH;
    private TextView VC_HPSFYJSP;
    private TextView VC_HPYQDYZGM;
    private TextView VC_HPYQDYZDD;
    private TextView VC_HPYQDYZMS;
    private TextView VC_SJYZGM;
    private TextView VC_SJYZDD;
    private TextView VC_SJYZMS;
    private TextView VC_YZGMDDYZMSSFYHPPFYZ;
    private TextView VC_SFTGJGHBYS;
    private TextView VC_YSDW;
    private TextView DT_YS_TIME;
    private TextView VC_YSSPWH;
    private TextView VC_HPYQJSDWSCLSS;
    private TextView VC_SJJCDWSCLSS;
    private TextView VC_SFYHPYQYZ;
    private TextView VC_HPZCLWSL;
    private TextView VC_SJCLL;
    private TextView VC_SJSFYHPYQYZ;
    private TextView VC_WSCLSSSFZCYX;
    private TextView VC_JQWPWSJCZBHSJSFCB;
    private TextView VC_CBYZ;
    private TextView VC_CBJCZ;
    private TextView VC_HPYQJSDFQCLSS;
    private TextView VC_SJJCDSS;
    private TextView VC_FQCLSSSFYHPYQYZ;
    private TextView VC_FQCLSSSFZCYX;
    private TextView VC_JQWPFQJCZBHSJSFCB;
    private TextView VC_FQCBYZ;
    private TextView VC_FQCBJCZ;
    private TextView VC_HPYQDJZCS;
    private TextView VC_SJCQDJZCS;
    private TextView VC_JZSFYHPYQYZ;
    private TextView VC_HPYQJSDGTFWCLSS;
    private TextView VC_SJJCSSS;
    private TextView VC_GTFWSFYHPYQYZ;
    private TextView VC_HPGFCLL;
    private TextView VC_GFSJCLL;
    private TextView VC_CLLSFYHPYQYZ;
    private TextView VC_GTFWCLSSSFZCYX;
    private TextView VC_CQFQWHTDSFJWHHCL;
    private TextView VC_YZCCQSFCQQWFLCS;
    private TextView VC_SFCQGSFLCS;
    private TextView VC_PFKSFFHGFHJSYQ;
    private TextView VC_SFBZSWRSGYJYA;
    private TextView VC_JYZCCS;
    private TextView VC_CQCS;
    private TextView VC_SFCQCCCS;
    private TextView CL_JCSFXDWT;
    private TextView CL_JCYQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_stock_farm);
        initProgressDialog();
        intent = getIntent();
        t_task_list_id = intent.getStringExtra("t_task_list_id");
        Log.e("NameActivity", t_task_list_id);
        initView();
//        NetTool.templatePost(getApplicationContext(),t_task_list_id,URL_QUERY_CRD_INFO,LiveStockFarmBean.class,this,yNProgressDialog);
        initData();
    }

    private void initData() {
        yNProgressDialog.show();
        NetTool.getInstance().rxLiveStockFarmPostNet(URL_QUERY_CRD_INFO, t_task_list_id, SpUtils.getString(getApplicationContext(), "userToken"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LiveStockFarmBean>() {
                    @Override
                    public void accept(@NonNull LiveStockFarmBean resultBean) throws Exception {
                        yNProgressDialog.dismiss();
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
                            if (resultBean.getData().get(0).getVc_czjy()==null){
                                VC_CZJY.setText("");
                            }else {
                                VC_CZJY.setText(resultBean.getData().get(0).getVc_czjy().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yzfs()==null){
                                VC_YZFS.setText("");
                            }else {
                                VC_YZFS.setText(resultBean.getData().get(0).getVc_yzfs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqcncl()==null){
                                VC_HPYQCNCL.setText("");
                            }else {
                                VC_HPYQCNCL.setText(resultBean.getData().get(0).getVc_hpyqcncl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqsl()==null){
                                VC_HPYQSL.setText("");
                            }else {
                                VC_HPYQSL.setText(resultBean.getData().get(0).getVc_hpyqsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wsfhjl()==null){
                                VC_WSFHJL.setText("");
                            }else {
                                VC_WSFHJL.setText(resultBean.getData().get(0).getVc_wsfhjl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjcncl()==null){
                                VC_SJCNCL.setText("");
                            }else {
                                VC_SJCNCL.setText(resultBean.getData().get(0).getVc_sjcncl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjsl()==null){
                                VC_SJSL.setText("");
                            }else {
                                VC_SJSL.setText(resultBean.getData().get(0).getVc_sjsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjwsfhjl()==null){
                                VC_SJWSFHJL.setText("");
                            }else {
                                VC_SJWSFHJL.setText(resultBean.getData().get(0).getVc_sjwsfhjl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfjyjyq()==null){
                                VC_SFJYJYQ.setText("");
                            }else {
                                VC_SFJYJYQ.setText(resultBean.getData().get(0).getVc_sfjyjyq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jyqlx()==null){
                                VC_JYQLX.setText("");
                            }else {
                                VC_JYQLX.setText(resultBean.getData().get(0).getVc_jyqlx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfjyhjmgq()==null){
                                VC_SFJYHJMGQ.setText("");
                            }else {
                                VC_SFJYHJMGQ.setText(resultBean.getData().get(0).getVc_sfjyhjmgq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hjmgqlx()==null){
                                VC_HJMGQLX.setText("");
                            }else {
                                VC_HJMGQLX.setText(resultBean.getData().get(0).getVc_hjmgqlx().toString());
                            }
                            if (resultBean.getData().get(0).getDt_xmjc_time()==null){
                                DT_XMJC_TIME.setText("");
                            }else {
                                DT_XMJC_TIME.setText(resultBean.getData().get(0).getDt_xmjc_time().toString());
                            }
                            if (resultBean.getData().get(0).getDt_xmjs_time()==null){
                                DT_XMJS_TIME.setText("");
                            }else {
                                DT_XMJS_TIME.setText(resultBean.getData().get(0).getDt_xmjs_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfzghjyxpj()==null){
                                VC_SFZGHJYXPJ.setText("");
                            }else {
                                VC_SFZGHJYXPJ.setText(resultBean.getData().get(0).getVc_sfzghjyxpj().toString());
                            }
                            if (resultBean.getData().get(0).getVc_bzlx()==null){
                                VC_BZLX.setText("");
                            }else {
                                VC_BZLX.setText(resultBean.getData().get(0).getVc_bzlx().toString());
                            }
                            if (resultBean.getData().get(0).getDt_bz_time()==null){
                                DT_BZ_TIME.setText("");
                            }else {
                                DT_BZ_TIME.setText(resultBean.getData().get(0).getDt_bz_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_bzdw()==null){
                                VC_BZDW.setText("");
                            }else {
                                VC_BZDW.setText(resultBean.getData().get(0).getVc_bzdw().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfjddjzhp()==null){
                                VC_SFJDDJZHP.setText("");
                            }else {
                                VC_SFJDDJZHP.setText(resultBean.getData().get(0).getVc_sfjddjzhp().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpspdw()==null){
                                VC_HPSPDW.setText("");
                            }else {
                                VC_HPSPDW.setText(resultBean.getData().get(0).getVc_hpspdw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_sp_time()==null){
                                DT_SP_TIME.setText("");
                            }else {
                                DT_SP_TIME.setText(resultBean.getData().get(0).getDt_sp_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_spwh()==null){
                                VC_SPWH.setText("");
                            }else {
                                VC_SPWH.setText(resultBean.getData().get(0).getVc_spwh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpsfyjsp()==null){
                                VC_HPSFYJSP.setText("");
                            }else {
                                VC_HPSFYJSP.setText(resultBean.getData().get(0).getVc_hpsfyjsp().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqdyzgm()==null){
                                VC_HPYQDYZGM.setText("");
                            }else {
                                VC_HPYQDYZGM.setText(resultBean.getData().get(0).getVc_hpyqdyzgm().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqdyzdd()==null){
                                VC_HPYQDYZDD.setText("");
                            }else {
                                VC_HPYQDYZDD.setText(resultBean.getData().get(0).getVc_hpyqdyzdd().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqdyzms()==null){
                                VC_HPYQDYZMS.setText("");
                            }else {
                                VC_HPYQDYZMS.setText(resultBean.getData().get(0).getVc_hpyqdyzms().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjyzgm()==null){
                                VC_SJYZGM.setText("");
                            }else {
                                VC_SJYZGM.setText(resultBean.getData().get(0).getVc_sjyzgm().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjyzdd()==null){
                                VC_SJYZDD.setText("");
                            }else {
                                VC_SJYZDD.setText(resultBean.getData().get(0).getVc_sjyzdd().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjyzms()==null){
                                VC_SJYZMS.setText("");
                            }else {
                                VC_SJYZMS.setText(resultBean.getData().get(0).getVc_sjyzms().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yzgmddyzmssfyhppfyz()==null){
                                VC_YZGMDDYZMSSFYHPPFYZ.setText("");
                            }else {
                                VC_YZGMDDYZMSSFYHPPFYZ.setText(resultBean.getData().get(0).getVc_yzgmddyzmssfyhppfyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sftgjghbys()==null){
                                VC_SFTGJGHBYS.setText("");
                            }else {
                                VC_SFTGJGHBYS.setText(resultBean.getData().get(0).getVc_sftgjghbys().toString());
                            }
                            if (resultBean.getData().get(0).getVc_ysdw()==null){
                                VC_YSDW.setText("");
                            }else {
                                VC_YSDW.setText(resultBean.getData().get(0).getVc_ysdw().toString());
                            }
                            if (resultBean.getData().get(0).getDt_ys_time()==null){
                                DT_YS_TIME.setText("");
                            }else {
                                DT_YS_TIME.setText(resultBean.getData().get(0).getDt_ys_time().toString());
                            }
                            if (resultBean.getData().get(0).getVc_ysspwh()==null){
                                VC_YSSPWH.setText("");
                            }else {
                                VC_YSSPWH.setText(resultBean.getData().get(0).getVc_ysspwh().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqjsdwsclss()==null){
                                VC_HPYQJSDWSCLSS.setText("");
                            }else {
                                VC_HPYQJSDWSCLSS.setText(resultBean.getData().get(0).getVc_hpyqjsdwsclss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjjcdwsclss()==null){
                                VC_SJJCDWSCLSS.setText("");
                            }else {
                                VC_SJJCDWSCLSS.setText(resultBean.getData().get(0).getVc_sjjcdwsclss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfyhpyqyz()==null){
                                VC_SFYHPYQYZ.setText("");
                            }else {
                                VC_SFYHPYQYZ.setText(resultBean.getData().get(0).getVc_sfyhpyqyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpzclwsl()==null){
                                VC_HPZCLWSL.setText("");
                            }else {
                                VC_HPZCLWSL.setText(resultBean.getData().get(0).getVc_hpzclwsl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjcll()==null){
                                VC_SJCLL.setText("");
                            }else {
                                VC_SJCLL.setText(resultBean.getData().get(0).getVc_sjcll().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjsfyhpyqyz()==null){
                                VC_SJSFYHPYQYZ.setText("");
                            }else {
                                VC_SJSFYHPYQYZ.setText(resultBean.getData().get(0).getVc_sjsfyhpyqyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_wsclsssfzcyx()==null){
                                VC_WSCLSSSFZCYX.setText("");
                            }else {
                                VC_WSCLSSSFZCYX.setText(resultBean.getData().get(0).getVc_wsclsssfzcyx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jqwpwsjczbhsjsfcb()==null){
                                VC_JQWPWSJCZBHSJSFCB.setText("");
                            }else {
                                VC_JQWPWSJCZBHSJSFCB.setText(resultBean.getData().get(0).getVc_jqwpwsjczbhsjsfcb().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cbyz()==null){
                                VC_CBYZ.setText("");
                            }else {
                                VC_CBYZ.setText(resultBean.getData().get(0).getVc_cbyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cbjcz()==null){
                                VC_CBJCZ.setText("");
                            }else {
                                VC_CBJCZ.setText(resultBean.getData().get(0).getVc_cbjcz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqjsdfqclss()==null){
                                VC_HPYQJSDFQCLSS.setText("");
                            }else {
                                VC_HPYQJSDFQCLSS.setText(resultBean.getData().get(0).getVc_hpyqjsdfqclss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjjcdss()==null){
                                VC_SJJCDSS.setText("");
                            }else {
                                VC_SJJCDSS.setText(resultBean.getData().get(0).getVc_sjjcdss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fqclsssfyhpyqyz()==null){
                                VC_FQCLSSSFYHPYQYZ.setText("");
                            }else {
                                VC_FQCLSSSFYHPYQYZ.setText(resultBean.getData().get(0).getVc_fqclsssfyhpyqyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fqclsssfzcyx()==null){
                                VC_FQCLSSSFZCYX.setText("");
                            }else {
                                VC_FQCLSSSFZCYX.setText(resultBean.getData().get(0).getVc_fqclsssfzcyx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jqwpfqjczbhsjsfcb()==null){
                                VC_JQWPFQJCZBHSJSFCB.setText("");
                            }else {
                                VC_JQWPFQJCZBHSJSFCB.setText(resultBean.getData().get(0).getVc_jqwpfqjczbhsjsfcb().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fqcbyz()==null){
                                VC_FQCBYZ.setText("");
                            }else {
                                VC_FQCBYZ.setText(resultBean.getData().get(0).getVc_fqcbyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_fqcbjcz()==null){
                                VC_FQCBJCZ.setText("");
                            }else {
                                VC_FQCBJCZ.setText(resultBean.getData().get(0).getVc_fqcbjcz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqdjzcs()==null){
                                VC_HPYQDJZCS.setText("");
                            }else {
                                VC_HPYQDJZCS.setText(resultBean.getData().get(0).getVc_hpyqdjzcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjcqdjzcs()==null){
                                VC_SJCQDJZCS.setText("");
                            }else {
                                VC_SJCQDJZCS.setText(resultBean.getData().get(0).getVc_sjcqdjzcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jzsfyhpyqyz()==null){
                                VC_JZSFYHPYQYZ.setText("");
                            }else {
                                VC_JZSFYHPYQYZ.setText(resultBean.getData().get(0).getVc_jzsfyhpyqyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpyqjsdgtfwclss()==null){
                                VC_HPYQJSDGTFWCLSS.setText("");
                            }else {
                                VC_HPYQJSDGTFWCLSS.setText(resultBean.getData().get(0).getVc_hpyqjsdgtfwclss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sjjcsss()==null){
                                VC_SJJCSSS.setText("");
                            }else {
                                VC_SJJCSSS.setText(resultBean.getData().get(0).getVc_sjjcsss().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gtfwsfyhpyqyz()==null){
                                VC_GTFWSFYHPYQYZ.setText("");
                            }else {
                                VC_GTFWSFYHPYQYZ.setText(resultBean.getData().get(0).getVc_gtfwsfyhpyqyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_hpgfcll()==null){
                                VC_HPGFCLL.setText("");
                            }else {
                                VC_HPGFCLL.setText(resultBean.getData().get(0).getVc_hpgfcll().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gfsjcll()==null){
                                VC_GFSJCLL.setText("");
                            }else {
                                VC_GFSJCLL.setText(resultBean.getData().get(0).getVc_gfsjcll().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cllsfyhpyqyz()==null){
                                VC_CLLSFYHPYQYZ.setText("");
                            }else {
                                VC_CLLSFYHPYQYZ.setText(resultBean.getData().get(0).getVc_cllsfyhpyqyz().toString());
                            }
                            if (resultBean.getData().get(0).getVc_gtfwclsssfzcyx()==null){
                                VC_GTFWCLSSSFZCYX.setText("");
                            }else {
                                VC_GTFWCLSSSFZCYX.setText(resultBean.getData().get(0).getVc_gtfwclsssfzcyx().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cqfqwhtdsfjwhhcl()==null){
                                VC_CQFQWHTDSFJWHHCL.setText("");
                            }else {
                                VC_CQFQWHTDSFJWHHCL.setText(resultBean.getData().get(0).getVc_cqfqwhtdsfjwhhcl().toString());
                            }
                            if (resultBean.getData().get(0).getVc_yzccqsfcqqwflcs()==null){
                                VC_YZCCQSFCQQWFLCS.setText("");
                            }else {
                                VC_YZCCQSFCQQWFLCS.setText(resultBean.getData().get(0).getVc_yzccqsfcqqwflcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfcqgsflcs()==null){
                                VC_SFCQGSFLCS.setText("");
                            }else {
                                VC_SFCQGSFLCS.setText(resultBean.getData().get(0).getVc_sfcqgsflcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_pfksffhgfhjsyq()==null){
                                VC_PFKSFFHGFHJSYQ.setText("");
                            }else {
                                VC_PFKSFFHGFHJSYQ.setText(resultBean.getData().get(0).getVc_pfksffhgfhjsyq().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfbzswrsgyjya()==null){
                                VC_SFBZSWRSGYJYA.setText("");
                            }else {
                                VC_SFBZSWRSGYJYA.setText(resultBean.getData().get(0).getVc_sfbzswrsgyjya().toString());
                            }
                            if (resultBean.getData().get(0).getVc_jyzccs()==null){
                                VC_JYZCCS.setText("");
                            }else {
                                VC_JYZCCS.setText(resultBean.getData().get(0).getVc_jyzccs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_cqcs()==null){
                                VC_CQCS.setText("");
                            }else {
                                VC_CQCS.setText(resultBean.getData().get(0).getVc_cqcs().toString());
                            }
                            if (resultBean.getData().get(0).getVc_sfcqcccs()==null){
                                VC_SFCQCCCS.setText("");
                            }else {
                                VC_SFCQCCCS.setText(resultBean.getData().get(0).getVc_sfcqcccs().toString());
                            }
                            if (resultBean.getData().get(0).getCl_jcsfxdwt()==null){
                                CL_JCSFXDWT.setText("");
                            }else {
                                CL_JCSFXDWT.setText(resultBean.getData().get(0).getCl_jcsfxdwt().toString());
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
        title_text.setText("畜禽养殖现场监察记录");
        Log.e("aaabbb", t_task_list_id);
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
        VC_COUNTY = (TextView) findViewById(R.id.VC_COUNTY);
        VC_COUNTY.setOnClickListener(this);
        VC_TOWN = (TextView) findViewById(R.id.VC_TOWN);
        VC_TOWN.setOnClickListener(this);
        VC_CZJY = (TextView) findViewById(R.id.VC_CZJY);
        VC_CZJY.setOnClickListener(this);
        VC_YZFS = (TextView) findViewById(R.id.VC_YZFS);
        VC_YZFS.setOnClickListener(this);
        VC_HPYQCNCL = (TextView) findViewById(R.id.VC_HPYQCNCL);
        VC_HPYQCNCL.setOnClickListener(this);
        VC_HPYQSL = (TextView) findViewById(R.id.VC_HPYQSL);
        VC_HPYQSL.setOnClickListener(this);
        VC_WSFHJL = (TextView) findViewById(R.id.VC_WSFHJL);
        VC_WSFHJL.setOnClickListener(this);
        VC_SJCNCL = (TextView) findViewById(R.id.VC_SJCNCL);
        VC_SJCNCL.setOnClickListener(this);
        VC_SJSL = (TextView) findViewById(R.id.VC_SJSL);
        VC_SJSL.setOnClickListener(this);
        VC_SJWSFHJL = (TextView) findViewById(R.id.VC_SJWSFHJL);
        VC_SJWSFHJL.setOnClickListener(this);
        VC_SFJYJYQ = (TextView) findViewById(R.id.VC_SFJYJYQ);
        VC_SFJYJYQ.setOnClickListener(this);
        VC_JYQLX = (TextView) findViewById(R.id.VC_JYQLX);
        VC_JYQLX.setOnClickListener(this);
        VC_SFJYHJMGQ = (TextView) findViewById(R.id.VC_SFJYHJMGQ);
        VC_SFJYHJMGQ.setOnClickListener(this);
        VC_HJMGQLX = (TextView) findViewById(R.id.VC_HJMGQLX);
        VC_HJMGQLX.setOnClickListener(this);
        DT_XMJS_TIME = (TextView) findViewById(R.id.DT_XMJS_TIME);
        DT_XMJS_TIME.setOnClickListener(this);
        DT_XMJC_TIME = (TextView) findViewById(R.id.DT_XMJC_TIME);
        DT_XMJC_TIME.setOnClickListener(this);
        VC_SFZGHJYXPJ = (TextView) findViewById(R.id.VC_SFZGHJYXPJ);
        VC_SFZGHJYXPJ.setOnClickListener(this);
        VC_BZLX = (TextView) findViewById(R.id.VC_BZLX);
        VC_BZLX.setOnClickListener(this);
        VC_BZDW = (TextView) findViewById(R.id.VC_BZDW);
        VC_BZDW.setOnClickListener(this);
        DT_BZ_TIME = (TextView) findViewById(R.id.DT_BZ_TIME);
        DT_BZ_TIME.setOnClickListener(this);
        VC_SFJDDJZHP = (TextView) findViewById(R.id.VC_SFJDDJZHP);
        VC_SFJDDJZHP.setOnClickListener(this);
        VC_HPSPDW = (TextView) findViewById(R.id.VC_HPSPDW);
        VC_HPSPDW.setOnClickListener(this);
        DT_SP_TIME = (TextView) findViewById(R.id.DT_SP_TIME);
        DT_SP_TIME.setOnClickListener(this);
        VC_SPWH = (TextView) findViewById(R.id.VC_SPWH);
        VC_SPWH.setOnClickListener(this);
        VC_HPSFYJSP = (TextView) findViewById(R.id.VC_HPSFYJSP);
        VC_HPSFYJSP.setOnClickListener(this);
        VC_HPYQDYZGM = (TextView) findViewById(R.id.VC_HPYQDYZGM);
        VC_HPYQDYZGM.setOnClickListener(this);
        VC_HPYQDYZDD = (TextView) findViewById(R.id.VC_HPYQDYZDD);
        VC_HPYQDYZDD.setOnClickListener(this);
        VC_HPYQDYZMS = (TextView) findViewById(R.id.VC_HPYQDYZMS);
        VC_HPYQDYZMS.setOnClickListener(this);
        VC_SJYZGM = (TextView) findViewById(R.id.VC_SJYZGM);
        VC_SJYZGM.setOnClickListener(this);
        VC_SJYZDD = (TextView) findViewById(R.id.VC_SJYZDD);
        VC_SJYZDD.setOnClickListener(this);
        VC_SJYZMS = (TextView) findViewById(R.id.VC_SJYZMS);
        VC_SJYZMS.setOnClickListener(this);
        VC_YZGMDDYZMSSFYHPPFYZ = (TextView) findViewById(R.id.VC_YZGMDDYZMSSFYHPPFYZ);
        VC_YZGMDDYZMSSFYHPPFYZ.setOnClickListener(this);
        VC_SFTGJGHBYS = (TextView) findViewById(R.id.VC_SFTGJGHBYS);
        VC_SFTGJGHBYS.setOnClickListener(this);
        VC_YSDW = (TextView) findViewById(R.id.VC_YSDW);
        VC_YSDW.setOnClickListener(this);
        DT_YS_TIME = (TextView) findViewById(R.id.DT_YS_TIME);
        DT_YS_TIME.setOnClickListener(this);
        VC_YSSPWH = (TextView) findViewById(R.id.VC_YSSPWH);
        VC_YSSPWH.setOnClickListener(this);
        VC_HPYQJSDWSCLSS = (TextView) findViewById(R.id.VC_HPYQJSDWSCLSS);
        VC_HPYQJSDWSCLSS.setOnClickListener(this);
        VC_SJJCDWSCLSS = (TextView) findViewById(R.id.VC_SJJCDWSCLSS);
        VC_SJJCDWSCLSS.setOnClickListener(this);
        VC_SFYHPYQYZ = (TextView) findViewById(R.id.VC_SFYHPYQYZ);
        VC_SFYHPYQYZ.setOnClickListener(this);
        VC_HPZCLWSL = (TextView) findViewById(R.id.VC_HPZCLWSL);
        VC_HPZCLWSL.setOnClickListener(this);
        VC_SJCLL = (TextView) findViewById(R.id.VC_SJCLL);
        VC_SJCLL.setOnClickListener(this);
        VC_SJSFYHPYQYZ = (TextView) findViewById(R.id.VC_SJSFYHPYQYZ);
        VC_SJSFYHPYQYZ.setOnClickListener(this);
        VC_WSCLSSSFZCYX = (TextView) findViewById(R.id.VC_WSCLSSSFZCYX);
        VC_WSCLSSSFZCYX.setOnClickListener(this);
        VC_JQWPWSJCZBHSJSFCB = (TextView) findViewById(R.id.VC_JQWPWSJCZBHSJSFCB);
        VC_JQWPWSJCZBHSJSFCB.setOnClickListener(this);
        VC_CBYZ = (TextView) findViewById(R.id.VC_CBYZ);
        VC_CBYZ.setOnClickListener(this);
        VC_CBJCZ = (TextView) findViewById(R.id.VC_CBJCZ);
        VC_CBJCZ.setOnClickListener(this);
        VC_HPYQJSDFQCLSS = (TextView) findViewById(R.id.VC_HPYQJSDFQCLSS);
        VC_HPYQJSDFQCLSS.setOnClickListener(this);
        VC_SJJCDSS = (TextView) findViewById(R.id.VC_SJJCDSS);
        VC_SJJCDSS.setOnClickListener(this);
        VC_FQCLSSSFYHPYQYZ = (TextView) findViewById(R.id.VC_FQCLSSSFYHPYQYZ);
        VC_FQCLSSSFYHPYQYZ.setOnClickListener(this);
        VC_FQCLSSSFZCYX = (TextView) findViewById(R.id.VC_FQCLSSSFZCYX);
        VC_FQCLSSSFZCYX.setOnClickListener(this);
        VC_JQWPFQJCZBHSJSFCB = (TextView) findViewById(R.id.VC_JQWPFQJCZBHSJSFCB);
        VC_JQWPFQJCZBHSJSFCB.setOnClickListener(this);
        VC_FQCBYZ = (TextView) findViewById(R.id.VC_FQCBYZ);
        VC_FQCBYZ.setOnClickListener(this);
        VC_FQCBJCZ = (TextView) findViewById(R.id.VC_FQCBJCZ);
        VC_FQCBJCZ.setOnClickListener(this);
        VC_HPYQDJZCS = (TextView) findViewById(R.id.VC_HPYQDJZCS);
        VC_HPYQDJZCS.setOnClickListener(this);
        VC_SJCQDJZCS = (TextView) findViewById(R.id.VC_SJCQDJZCS);
        VC_SJCQDJZCS.setOnClickListener(this);
        VC_JZSFYHPYQYZ = (TextView) findViewById(R.id.VC_JZSFYHPYQYZ);
        VC_JZSFYHPYQYZ.setOnClickListener(this);
        VC_HPYQJSDGTFWCLSS = (TextView) findViewById(R.id.VC_HPYQJSDGTFWCLSS);
        VC_HPYQJSDGTFWCLSS.setOnClickListener(this);
        VC_SJJCSSS = (TextView) findViewById(R.id.VC_SJJCSSS);
        VC_SJJCSSS.setOnClickListener(this);
        VC_GTFWSFYHPYQYZ = (TextView) findViewById(R.id.VC_GTFWSFYHPYQYZ);
        VC_GTFWSFYHPYQYZ.setOnClickListener(this);
        VC_HPGFCLL = (TextView) findViewById(R.id.VC_HPGFCLL);
        VC_HPGFCLL.setOnClickListener(this);
        VC_GFSJCLL = (TextView) findViewById(R.id.VC_GFSJCLL);
        VC_GFSJCLL.setOnClickListener(this);
        VC_CLLSFYHPYQYZ = (TextView) findViewById(R.id.VC_CLLSFYHPYQYZ);
        VC_CLLSFYHPYQYZ.setOnClickListener(this);
        VC_GTFWCLSSSFZCYX = (TextView) findViewById(R.id.VC_GTFWCLSSSFZCYX);
        VC_GTFWCLSSSFZCYX.setOnClickListener(this);
        VC_CQFQWHTDSFJWHHCL = (TextView) findViewById(R.id.VC_CQFQWHTDSFJWHHCL);
        VC_CQFQWHTDSFJWHHCL.setOnClickListener(this);
        VC_YZCCQSFCQQWFLCS = (TextView) findViewById(R.id.VC_YZCCQSFCQQWFLCS);
        VC_YZCCQSFCQQWFLCS.setOnClickListener(this);
        VC_SFCQGSFLCS = (TextView) findViewById(R.id.VC_SFCQGSFLCS);
        VC_SFCQGSFLCS.setOnClickListener(this);
        VC_PFKSFFHGFHJSYQ = (TextView) findViewById(R.id.VC_PFKSFFHGFHJSYQ);
        VC_PFKSFFHGFHJSYQ.setOnClickListener(this);
        VC_SFBZSWRSGYJYA = (TextView) findViewById(R.id.VC_SFBZSWRSGYJYA);
        VC_SFBZSWRSGYJYA.setOnClickListener(this);
        VC_JYZCCS = (TextView) findViewById(R.id.VC_JYZCCS);
        VC_JYZCCS.setOnClickListener(this);
        VC_CQCS = (TextView) findViewById(R.id.VC_CQCS);
        VC_CQCS.setOnClickListener(this);
        VC_SFCQCCCS = (TextView) findViewById(R.id.VC_SFCQCCCS);
        VC_SFCQCCCS.setOnClickListener(this);
        CL_JCSFXDWT = (TextView) findViewById(R.id.CL_JCSFXDWT);
        CL_JCSFXDWT.setOnClickListener(this);
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
