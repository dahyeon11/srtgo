package com.korail.talk.network.dao.reservationWait;

import com.korail.talk.network.BaseResponse;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface ReservationWaitService {
    @POST("/classes/com.korail.mobile.reservationWait.ReservationWait")
    @FormUrlEncoded
    BaseResponse rsvWait(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtPnrNo") String str4, @Field("txtPsrmClChgFlg") String str5, @Field("txtSmsSndFlg") String str6, @Field("txtCpNo") String str7);
}
