package com.korail.talk.network.dao.reservationCancel;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.reservationCancel.ReservationChangeDao;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.old.OJrny;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface ReservationCancelService {
    @POST("/classes/com.korail.mobile.reservationCancel.ReservationCancel")
    @FormUrlEncoded
    BaseResponse reservationCancel(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtPnrNo") String str4, @Field(OJrny.JRNY_SQ_NO) String str5, @Field(OJrny.JRNY_CNT) String str6, @Field("hidRsvChgNo") String str7);

    @POST("/classes/com.korail.mobile.reservationCancel.ReservationCancelChk")
    @FormUrlEncoded
    BaseResponse reservationCancelCheck(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtPnrNo") String str4, @Field(OJrny.JRNY_SQ_NO) String str5, @Field(OJrny.JRNY_CNT) String str6, @Field("hidRsvChgNo") String str7);

    @POST("/classes/com.korail.mobile.reservation.reservationChange.do")
    @FormUrlEncoded
    ReservationChangeDao.ReservationChangeResponse reservationChange(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field("chgTno") String str5, @Field("totPrnb") String str6, @Field("stndFlg") String str7, @Field("evntWctFlg") String str8, @Field("wctHndgCncDvCd") String str9, @Field("lrgCrgFlg") String str10, @Field(RPsg.PSG_CNT) String str11, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2, @FieldMap Map<String, String> map3, @FieldMap Map<String, String> map4, @FieldMap Map<String, String> map5);
}
