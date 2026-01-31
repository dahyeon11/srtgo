package com.korail.talk.network.dao.payment;

import com.korail.talk.network.dao.payment.RsvPaymentDao;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface PaymentService {
    @POST("/classes/com.korail.mobile.payment.ReservationPayment")
    @FormUrlEncoded
    RsvPaymentDao.RsvPaymentResponse payment(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidPnrNo") String str4, @Field("hidWctNo") String str5, @Field("hidTmpJobSqno1") String str6, @Field("hidTmpJobSqno2") String str7, @Field("hidRsvChgNo") String str8, @FieldMap Map<String, String> map);
}
