package com.korail.talk.network.dao.compensate;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.compensate.CompensateRefundListDao;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface CompensateService {
    @POST("/classes/com.korail.mobile.compensate.ticketReturn.do")
    @FormUrlEncoded
    BaseResponse executeCompensateRefund(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkCnt") int i8, @Field("trnStpRsStnCd") List<String> list, @Field("jrnyStpTkFlg") List<String> list2, @Field("ogTkSaleWctNo") List<String> list3, @Field("ogTkSaleDd") List<String> list4, @Field("ogTkSaleSqNo") List<String> list5, @Field("ogTkRetPwd") List<String> list6);

    @POST("/classes/com.korail.mobile.compensate.ticketDetail.do")
    @FormUrlEncoded
    BaseResponse executeCompensateRefundDetail(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkCnt") int i8, @Field("trnStpRsStnCd") List<String> list, @Field("jrnyStpTkFlg") List<String> list2, @Field("ogTkSaleWctNo") List<String> list3, @Field("ogTkSaleDd") List<String> list4, @Field("ogTkSaleSqNo") List<String> list5, @Field("ogTkRetPwd") List<String> list6);

    @POST("/classes/com.korail.mobile.compensate.ticketList.do")
    @FormUrlEncoded
    CompensateRefundListDao.CompensateRefundListResponse executeCompensateRefundList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("nowPgNo") int i8, @Field("dptDtFrom") String str4, @Field("dptDtTo") String str5);
}
