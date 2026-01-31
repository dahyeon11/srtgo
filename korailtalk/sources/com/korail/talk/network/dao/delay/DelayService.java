package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.delay.CashRfnDao;
import com.korail.talk.network.dao.delay.DelayCertificateDao;
import com.korail.talk.network.dao.delay.DelayPNRQueryDao;
import com.korail.talk.network.dao.delay.DelayRefundListDao;
import com.korail.talk.network.dao.delay.DelayReturnReceiptDao;
import com.korail.talk.network.dao.delay.DptnBankDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface DelayService {
    @POST("/classes/com.korail.mobile.dlay.athnIsu.do")
    @FormUrlEncoded
    DelayCertificateDao.DelayCertificateResponse athnIsu(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("ogtkSaleWctNo") String str4, @Field("ogtkSaleDd") String str5, @Field("ogtkSaleSqno") String str6, @Field("ogtkRetPwd") String str7, @Field("runDt") String str8, @Field(Price2FareDao.Price2Fare.trnNoString) String str9);

    @POST("/classes/com.korail.mobile.dlay.cashRfn.do")
    @FormUrlEncoded
    CashRfnDao.CashRfnResponse cashRfn(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("dmnPrsDvCd") String str4, @Field("saleWctNo") String str5, @Field("saleDd") String str6, @Field("saleSqno") String str7, @Field("tkRetPwd") String str8, @Field("dptnBankCd") String str9, @Field("dptnAcntNo") String str10, @Field("custNm") String str11, @Field("custTeln") String str12, @Field("rmk1Cont") String str13);

    @POST("/classes/com.korail.mobile.dlay.pymtRcet.do")
    @FormUrlEncoded
    DelayReturnReceiptDao.DelayReturnReceiptResponse dealyReturnReceipt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDd") String str5, @Field("saleSqno") String str6, @Field("tkRetPwd") String str7);

    @POST("/classes/com.korail.mobile.dlay.dptnBank.do")
    @FormUrlEncoded
    DptnBankDao.DptnBankResponse dptnBank(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3);

    @POST("/classes/com.korail.mobile.delay.acptPrs.do")
    @FormUrlEncoded
    BaseResponse executeDelayPNRAccept(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("jobDvCd") String str4, @Field("pnrCnt") int i8, @Field("pnrNo") List<String> list, @Field("ogtkWctNo") List<String> list2);

    @POST("/classes/com.korail.mobile.delay.pnrQry.do")
    @FormUrlEncoded
    DelayPNRQueryDao.DelayPNRQueryResponse executeDelayPNRQuery(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("jobDvCd") String str4, @Field("pnrCnt") int i8, @Field("pnrNo") List<String> list, @Field("ogtkWctNo") List<String> list2);

    @POST("/classes/com.korail.mobile.delay.ticketReturn.do")
    @FormUrlEncoded
    BaseResponse executeDelayRefund(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("dlayFarePymtMtdCd") String str4, @Field("tkCnt") int i8, @Field("ogTkSaleWctNo") List<String> list, @Field("ogTkSaleDd") List<String> list2, @Field("ogTkSaleSqNo") List<String> list3, @Field("ogTkRetPwd") List<String> list4);

    @POST("/classes/com.korail.mobile.delay.ticketDetail.do")
    @FormUrlEncoded
    BaseResponse executeDelayRefundDetail(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkCnt") int i8, @Field("ogTkSaleWctNo") List<String> list, @Field("ogTkSaleDd") List<String> list2, @Field("ogTkSaleSqNo") List<String> list3, @Field("ogTkRetPwd") List<String> list4);

    @POST("/classes/com.korail.mobile.delay.ticketList.do")
    @FormUrlEncoded
    DelayRefundListDao.DelayRefundListResponse executeDelayRefundList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("nowPgNo") int i8, @Field("dptDtFrom") String str4, @Field("dptDtTo") String str5);
}
