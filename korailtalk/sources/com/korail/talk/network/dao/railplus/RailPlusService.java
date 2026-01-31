package com.korail.talk.network.dao.railplus;

import com.korail.talk.network.dao.railplus.AutoChargeDao;
import retrofit.http.GET;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface RailPlusService {
    @GET("/classes/com.korail.mobile.railplus.autoCharge.do")
    AutoChargeDao.AutoChargeResponse getAutoCharge(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("jobDvCd") String str4, @Query("prepCrdNo") String str5);
}
