package com.korail.talk.network.dao.nFilter;

import com.korail.talk.network.dao.nFilter.NFilterCreateKeyDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface NFilterService {
    @POST("/classes/com.korail.mobile.nFilter.createKey.do")
    @FormUrlEncoded
    NFilterCreateKeyDao.NFilterCreateKeyResponse createKey(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3);
}
