package com.korail.talk.network.dao.cart;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.cart.CartListDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface CartService {
    @POST("/classes/com.korail.mobile.cart.addCartList")
    @FormUrlEncoded
    BaseResponse addCart(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidPnrNo") String str4);

    @POST("/classes/com.korail.mobile.cart.showCartList")
    @FormUrlEncoded
    CartListDao.CartListResponse getCartList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field("addSrvReqNo") String str5);

    @POST("/classes/com.korail.mobile.maas.rsvStt.do")
    @FormUrlEncoded
    BaseResponse verifyMaasStatus(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("addSrvDvCd") String str4, @Field("addSrvReqNo") String str5, @Field("coptEntRsvNo") String str6, @Field("lumpStlTgtNo") String str7);
}
