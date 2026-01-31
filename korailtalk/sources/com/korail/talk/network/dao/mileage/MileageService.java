package com.korail.talk.network.dao.mileage;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.mileage.AcpnMlgSpecDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface MileageService {
    @POST("/classes/com.korail.mobile.mileage.acpnMlgNoti.do")
    @FormUrlEncoded
    BaseResponse acpnMlgNoti(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDt") String str5, @Field("saleSqno") String str6, @Field("retPwd") String str7, @Field("rcvPsHndyTeln") String str8);

    @POST("/classes/com.korail.mobile.mileage.acpnMlgSave.do")
    @FormUrlEncoded
    BaseResponse acpnMlgSave(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("rsvMbCrdNo") String str4, @Field("custNm") String str5, @Field("mlgAcmMbCrdNo") String str6, @Field("saleWctNo") String str7, @Field("saleDd") String str8, @Field("saleSqno") String str9, @Field("tkRetPwd") String str10);

    @POST("/classes/com.korail.mobile.mileage.acpnMlgSpec.do")
    @FormUrlEncoded
    AcpnMlgSpecDao.AcpnMlgSpecResponse acpnMlgSpec(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4);
}
