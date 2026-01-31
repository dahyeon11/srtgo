package com.korail.talk.network.dao.gifticket;

import com.korail.talk.network.dao.gifticket.GifticketBookingDao;
import com.korail.talk.network.dao.gifticket.GifticketHistoryDao;
import com.korail.talk.network.dao.gifticket.GifticketListDao;
import com.korail.talk.network.dao.gifticket.GifticketReturnDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface GifticketService {
    @POST("/classes/com.korail.mobile.gift.gdRsv.do")
    @FormUrlEncoded
    GifticketBookingDao.GifticketBookingResponse bookingGifticket(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("itmCnt") String str4, @Field("mrkAmt_1") String str5, @Field("prnbCnt") String str6, @Field("mbCrdNo_1") String str7, @Field("gdUtlPsNm_1") String str8);

    @POST("/classes/com.korail.mobile.gift.gdLst.do")
    @FormUrlEncoded
    GifticketListDao.GifticketListResponse getGifticketList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("qryDvCd") String str4, @Field("qryVal") String str5, @Field("abrdDtFrom") String str6, @Field("abrdDtTo") String str7, @Field("usePsbFlg") String str8, @Field("qryNumNext") String str9, @Field("fllwQryFlg") String str10, @Field("trnOprBzDvCd") String str11);

    @POST("/classes/com.korail.mobile.gift.gdUseSpec.do")
    @FormUrlEncoded
    GifticketHistoryDao.GifticketHistoryResponse historyGifticket(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkId") String str4);

    @POST("/classes/com.korail.mobile.gift.gdRet.do")
    @FormUrlEncoded
    GifticketReturnDao.GifticketReturnResponse returnGifticket(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkId") String str4);
}
