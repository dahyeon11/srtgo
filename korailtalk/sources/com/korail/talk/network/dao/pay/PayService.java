package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.pay.NaverPayRsvDao;
import com.korail.talk.network.dao.pay.PaycoDao;
import com.korail.talk.network.dao.pay.SpayCphdDatValDao;
import com.korail.talk.network.dao.pay.SpayOdrNoDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.pay.StbkRegBankDao;
import com.korail.talk.network.dao.pay.TossAutoCreateDao;
import com.korail.talk.network.dao.pay.TossAutoStlKeyQryDao;
import java.util.List;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface PayService {
    @POST("/classes/com.korail.mobile.payment.reserve.payco.do")
    @FormUrlEncoded
    PaycoDao.PaycoPaymentResponse getPaycoResult(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("ticketPrice") String str4, @Field("ticketName") String str5);

    @POST("/classes/com.korail.mobile.pay.spayCphdDatVal.do")
    @FormUrlEncoded
    SpayCphdDatValDao.SpayCphdDatValResponse getSpayCphdDatVal(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("spayDvCd") String str4, @Field("data") List<String> list);

    @POST("/classes/com.korail.mobile.pay.spayOrdNo.do")
    @FormUrlEncoded
    SpayOdrNoDao.SpayOdrNoResponse getSpayOdrNo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("spayDvCd") String str4, @Field("totTxnAmt") String str5, @Field("tgtCnt") String str6, @Field("lumpStlTgtNo") List<String> list);

    @POST("/classes/com.korail.mobile.pay.intgStl.do")
    @FormUrlEncoded
    BaseResponse intgStl(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("ctlDvCd") String str4, @Field("stlPrsJobId") String str5, @Field("cart_LumpStlTgtNo") String str6, @FieldMap Map<String, String> map);

    @POST("/classes/com.korail.mobile.pay.naverPayMoneyRsv.do")
    @FormUrlEncoded
    NaverPayRsvDao.NaverPayRsvResponse naverPayMoneyRsv(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("productCount") int i8, @Field("productAmount") int i9);

    @POST("/classes/com.korail.mobile.pay.naverPayRsv.do")
    @FormUrlEncoded
    NaverPayRsvDao.NaverPayRsvResponse naverPayRsv(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("productCount") int i8, @Field("productAmount") int i9);

    @POST("/classes/com.korail.mobile.pay.stbkAcnt.do")
    @FormUrlEncoded
    StbkAcntDao.StbkAcntResponse stbkAcnt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("stlBankCd") String str4, @Field("jobDvCd") String str5, @Field("acntNo") String str6, @Field("custCpNo") String str7, @Field("stbkTxnNo") String str8, @Field("stlApvPwd") String str9);

    @POST("/classes/com.korail.mobile.pay.stbkRegBank.do")
    @FormUrlEncoded
    StbkRegBankDao.StbkRegBankResponse stbkRegBank(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3);

    @POST("/classes/com.korail.mobile.pay.stlKeyPrs.do")
    @FormUrlEncoded
    BaseResponse stlKeyPrs(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("jobDvCd") String str4, @Field("spayDvCd") String str5, @Field("spayStlKeyVal") String str6, @Field("stlBankCd") String str7, @Field("acntNo") String str8, @Field("binNo") String str9);

    @POST("/classes/com.korail.mobile.pay.stlKeyQry.do")
    @FormUrlEncoded
    TossAutoStlKeyQryDao.StlKeyQryResponse stlKeyQry(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("spayDvCd") String str4);

    @POST("/classes/com.korail.mobile.pay.tossautoC.do")
    @FormUrlEncoded
    TossAutoCreateDao.TossAutoCResponse tossautoC(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3);
}
