package com.korail.talk.network.dao.xPoint;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.xPoint.KorailPointInquiryDao;
import com.korail.talk.network.dao.xPoint.LPointDao;
import com.korail.talk.network.dao.xPoint.MileageInquiryDao;
import com.korail.talk.network.dao.xPoint.PointInquiryDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface XPointService {
    @POST("/classes/com.korail.mobile.xPoint.OkCashbagCertView")
    @FormUrlEncoded
    BaseResponse certifyOKCashbag(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("cp_no") String str4);

    @POST("/classes/com.korail.mobile.xPoint.MyXPointView")
    @FormUrlEncoded
    KorailPointInquiryDao.KorailPointInquiryResponse getKorailPoint(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("point_dv_cd") String str4);

    @POST("/classes/com.korail.mobile.mlg.lpotAthn.do")
    @FormUrlEncoded
    LPointDao.LPointInquiryResponse getLPoint(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pontPwd") String str4);

    @POST("/classes/com.korail.mobile.mlg.amtSpec.do")
    @FormUrlEncoded
    MileageInquiryDao.MileageInquiryResponse getMileage(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pontTpVal") String str4, @Field("qryDvVal") String str5, @Field("qryStDt") String str6, @Field("qryClsDt") String str7, @Field("pgPrCnt") String str8, @Field("nowPgNo") String str9);

    @POST("/classes/com.korail.mobile.xPoint.XPointView")
    @FormUrlEncoded
    PointInquiryDao.PointInquiryResponse getPoint(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("inp_dv_cd") String str4, @Field("point_dv_cd") String str5, @Field("xpoint_no") String str6, @Field("xpoint_pwd") String str7, @Field("stl_crd_valid_trm") String str8);
}
