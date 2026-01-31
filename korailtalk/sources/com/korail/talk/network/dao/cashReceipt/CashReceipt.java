package com.korail.talk.network.dao.cashReceipt;

import com.korail.talk.network.BaseResponse;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface CashReceipt {
    @POST("/classes/com.korail.mobile.cashReceipt.issue.do")
    @FormUrlEncoded
    BaseResponse issue(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("cashRcetTxnDvCd") String str4, @Field("vltIsuFlg") String str5, @Field("cashRcetAthnMtdCd") String str6, @Field("athnDmnRcgnNo") String str7, @Field("apvCnt") int i8, @FieldMap Map<String, String> map);
}
