package com.korail.talk.network.dao.certification;

import I4.b;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.certification.BusReservationListDao;
import com.korail.talk.network.dao.certification.BusReservationSeatListDao;
import com.korail.talk.network.dao.reservationCancel.ReservationChangeDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.old.OJrny;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface BusReservationService {
    @POST("/classes/com.korail.mobile.reservationCancel.ReservationCancelChk")
    @FormUrlEncoded
    BaseResponse reservationCancelCheck(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtPnrNo") String str4, @Field(OJrny.JRNY_SQ_NO) String str5, @Field(OJrny.JRNY_CNT) String str6, @Field("hidRsvChgNo") String str7);

    @POST("/classes/com.korail.mobile.reservation.reservationChange.do")
    @FormUrlEncoded
    ReservationChangeDao.ReservationChangeResponse reservationChange(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field("chgTno") String str5, @Field("totPrnb") String str6, @Field("stndFlg") String str7, @Field("evntWctFlg") String str8, @Field("wctHndgCncDvCd") String str9, @Field("lrgCrgFlg") String str10, @Field(RPsg.PSG_CNT) String str11, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2, @FieldMap Map<String, String> map3, @FieldMap Map<String, String> map4, @FieldMap Map<String, String> map5);

    @POST("/classes/com.korail.mobile.lmu.scdlQry.do")
    @FormUrlEncoded
    BusReservationListDao.BusInquiryResponse reservationList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field(b.DPT_DT) String str4, @Field("dptRsStnCd") String str5, @Field(b.ARV_RS_STN_CD) String str6, @Field("tmGpCd") String str7, @Field("psrmClCd") String str8, @Field(b.DPT_TM) String str9, @Field(Price2FareDao.Price2Fare.trnNoString) String str10, @Field("seatAttCd") String str11, @Field("rsvSaleDvCd") String str12);

    @POST("/classes/com.korail.mobile.lms.TResidualSeatsResearch.do")
    @FormUrlEncoded
    BusReservationSeatListDao.SeatListResponse reservationSeatList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("trnClsfCd") String str4, @Field("trnGpCd") String str5, @Field("runDt") String str6, @Field(Price2FareDao.Price2Fare.trnNoString) String str7, @Field("srcarNo") String str8, @Field("psrmClCd") String str9, @Field("dptRsStnCd") String str10, @Field(b.ARV_RS_STN_CD) String str11, @Field("seatAttCd") String str12, @Field("dptStnRunOrdr") String str13, @Field("arvStnRunOrdr") String str14, @Field("totPsgCnt") String str15, @Field("gdNo") String str16, @Field("isArrow") boolean z8);
}
