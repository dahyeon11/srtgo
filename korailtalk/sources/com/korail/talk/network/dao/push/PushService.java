package com.korail.talk.network.dao.push;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.push.CallCrewRequestListDao;
import com.korail.talk.network.dao.push.CmtrKndMenuDao;
import com.korail.talk.network.dao.push.PushUpdateDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import retrofit.http.GET;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface PushService {
    @GET("/classes/com.korail.mobile.push.callCrew.do")
    BaseResponse callCrew(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("pnrNo") String str4, @Query(Price2FareDao.Price2Fare.jrnySqnoString) String str5, @Query("saleWctNo") String str6, @Query("saleDt") String str7, @Query("saleSqno") String str8, @Query("tkRetPwd") String str9, @Query("sndSqno") String str10, @Query("coutMsgDvCd") String str11, @Query("intgMsgCd1") String str12, @Query("intgMsgCd2") String str13, @Query("intgMsgCd3") String str14, @Query("intgMsgCd4") String str15, @Query("intgMsgCd5") String str16, @Query("intgMsgCd6") String str17, @Query("intgMsgCd7") String str18, @Query("intgMsgCd8") String str19, @Query("intgMsgCd9") String str20, @Query("intgMsgCd10") String str21, @Query("intgMsgCont") String str22);

    @GET("/classes/com.korail.mobile.push.crwCallRq.do")
    CallCrewRequestListDao.CallCrewListResponse callCrewRequestList(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("qryDvCd") String str4);

    @GET("/classes/com.korail.mobile.push.cmtrKnd.do")
    CmtrKndMenuDao.CmtrKndMenuResponse cmtrKndPassMenu(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("cmtrKndCd") String str4);

    @GET("/classes/com.korail.mobile.push.update")
    PushUpdateDao.PushUpdateResponse pushUpdate(@Query("Device") String str, @Query("Version") String str2, @Query("job_dv_cd") String str3, @Query("tnsm_flg1") String str4, @Query("tnsm_flg2") String str5, @Query("tnsm_flg3") String str6, @Query("tnsm_flg4") String str7, @Query("dptUsrInpTnum") String str8, @Query("arvUsrInpTnum") String str9);
}
