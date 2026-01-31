package com.korail.talk.network.dao.reservation;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.reservation.SeatAssignReservationDao;
import com.korail.talk.network.dao.reservation.TicketRsvHistoryDao;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface ReservationService {
    @POST("/classes/com.korail.mobile.reservation.guideSeatCnd.do")
    @FormUrlEncoded
    BaseResponse getGuideSeatCnd(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("rqSeatAttCd") String str4);

    @GET("/classes/com.korail.mobile.reservation.ReservationView")
    TicketRsvHistoryDao.TicketRsvHistoryResponse getRsvHistory(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3);

    @POST("/classes/com.korail.mobile.reservation.tripChgPrsC.do")
    @FormUrlEncoded
    ReservationResponse getTicketChangeReservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("trvlKndCd") String str4, @Field("totPrnb") String str5, @Field("isePrnb") String str6, @Field("stndSeatFlg") String str7, @Field("intgTktIseFlg") String str8, @Field("prcFareReCalcFlg") String str9, @Field("tmpJobSqno") String str10, @Field("alcSeatDmnPsDvCd") String str11, @Field("jrny2Cnt") String str12, @Field("psg2Cnt") String str13, @Field("ctlDvCd") String str14, @Field("frcSaleRsnCont") String str15, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2, @FieldMap Map<String, String> map3, @FieldMap Map<String, String> map4, @FieldMap Map<String, String> map5, @FieldMap Map<String, String> map6);

    @POST("/classes/com.korail.mobile.reservation.seatAssign.do")
    @FormUrlEncoded
    SeatAssignReservationDao.SeatAssignReservationResponse setSeatAssignReservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("menuId") String str4, @Field("custMgNo") String str5, @Field("totPrnb") String str6, @Field("stndFlg") String str7, @Field("rqScarNum") String str8, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2, @FieldMap Map<String, String> map3, @FieldMap Map<String, String> map4, @FieldMap Map<String, String> map5);
}
