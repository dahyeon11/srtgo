package com.korail.talk.network.dao.myTicket;

import I4.b;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.myTicket.SpecialRoomUpgradeDao;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface MyTicketService {
    @POST("/classes/com.korail.mobile.myTicket.MyTicketList")
    @FormUrlEncoded
    TicketListDao.TicketListResponse getTicketList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtDeviceId") String str4, @Field("txtIndex") String str5, @Field("h_page_no") String str6, @Field("h_abrd_dt_from") String str7, @Field("h_abrd_dt_to") String str8, @Field("hiduserYn") String str9, @Field("hidName") String str10, @Field("hidTeleNo") String str11, @Field("hidPwd") String str12, @Field("tsRsStnCd") String str13);

    @GET("/classes/com.korail.mobile.myTicket.procUpgradeSeat")
    BaseResponse procUpgrade(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("totTxnAmt") String str4, @Query("totCncRetAmt") String str5, @Query("totCncRetFee") String str6, @Query("feeProyStlSqno") String str7, @Query("lumpStlTgtNo") String str8, @Query("mnsGridcnt") String str9, @Query("stlMnsSqno") String str10, @Query("stlMnsCd") String str11, @Query("mnsStlAmt") String str12, @Query("crdInpWayCd") String str13, @Query("ismtMnthNum") String str14, @Query("pontDvCd") String str15, @Query("pontInpDvCd") String str16, @Query("prepCrdTxnBfAmt") String str17, @Query("prepCrdTxnAftAmt") String str18);

    @GET("/classes/com.korail.mobile.myTicket.reqUpgradeSeat")
    SpecialRoomUpgradeDao.SpecialRoomUpgradeResponse requestUpgradeSeat(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("ogtkSaleDd") String str4, @Query("ogtkSaleWctNo") String str5, @Query("ogtkSaleSqno") String str6, @Query("ogtkRetPwd") String str7, @Query("jrnyTpCd") String str8, @Query(Price2FareDao.Price2Fare.jrnySqnoString) String str9, @Query(b.DPT_DT) String str10, @Query("dptStnConsOrdr") String str11, @Query("dptStnRunOrdr") String str12, @Query("dptRsStnCd") String str13, @Query(b.DPT_TM) String str14, @Query("arvDt") String str15, @Query("arvStnConsOrdr") String str16, @Query("arvStnRunOrdr") String str17, @Query(b.ARV_RS_STN_CD) String str18, @Query("arvTm") String str19, @Query(Price2FareDao.Price2Fare.trnNoString) String str20, @Query("runDt") String str21, @Query("trnGpCd") String str22, @Query("roomClsfCd") String str23, @Query("scarNo") String str24, @Query("seatNo") String str25, @Query("rqSeatAttCd") String str26);
}
