package com.korail.talk.network.dao.cust;

import I4.b;
import com.korail.talk.network.dao.cust.MchdDcntTgtDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface CustService {
    @POST("/classes/com.korail.mobile.cust.mchdDcntTgt.do")
    @FormUrlEncoded
    MchdDcntTgtDao.MchdDcntTgtResponse mchdDcntTgt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field(b.DPT_DT) String str4);
}
