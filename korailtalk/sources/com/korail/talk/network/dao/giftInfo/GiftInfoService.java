package com.korail.talk.network.dao.giftInfo;

import com.korail.talk.network.dao.giftInfo.TicketPresentDao;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface GiftInfoService {
    @POST("/classes/com.korail.mobile.giftInfo.GiftSend")
    @FormUrlEncoded
    TicketPresentDao.TicketPresentResponse presentTicket(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidAcepPsNm") String str4, @Field("hidAcepPsTeln") String str5, @Field("hidPbpAcepPsMbFlg") String str6, @Field("hidPbpAcepPsCustMgNo") String str7, @Field("hidPnrNo") String str8, @Field("hidTotNewStlAmt") String str9, @Field("hidRsvChgNo") String str10, @Field("hidInfoInpDvCd") String str11, @Field("hidSaleCnt") String str12, @Field("hidAcepPwd") String str13, @FieldMap Map<String, String> map);
}
