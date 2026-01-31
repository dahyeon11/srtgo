package com.korail.talk.network.dao.passCard;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface PassCardService {
    @POST("/classes/com.korail.mobile.passCard.DelayDiscountCheck")
    @FormUrlEncoded
    BaseResponse addDelayTicket(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("h_dlay_disc_cnt") String str4, @Field("h_orgtk_ret_sale_dt") String str5, @Field("h_orgtk_wct_no") String str6, @Field("h_orgtk_sale_sqno") String str7, @Field("h_orgtk_ret_pwd") String str8);

    @POST("/classes/com.korail.mobile.passCard.DiscountCheck")
    @FormUrlEncoded
    BaseResponse certDCCoupon(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtCertNo") String str4, @Field("txtCertPwd") String str5);

    @POST("/classes/com.korail.mobile.passCard.DelayDiscountView")
    @FormUrlEncoded
    DelayTicketListDao.DelayTicketListResponse getDelayTicketList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("dptDtTo") String str4);

    @POST("/classes/com.korail.mobile.passCard.CouponView")
    @FormUrlEncoded
    DCCouponListDao.DCCouponListResponse getDiscountCoupon(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtSelPage") String str4, @Field("pnrNo") String str5);
}
