package com.korail.talk.network.dao.independent;

import com.korail.talk.network.BaseResponse;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface IndependentService {
    @POST("/classes/com.korail.mobile.login.poppCfmRec.do")
    @FormUrlEncoded
    BaseResponse registerUserInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @FieldMap Map<String, String> map);
}
