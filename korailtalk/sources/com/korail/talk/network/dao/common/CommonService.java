package com.korail.talk.network.dao.common;

import com.kakao.sdk.auth.Constants;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.common.CookieDao;
import com.korail.talk.network.dao.common.DecryptDao;
import com.korail.talk.network.dao.common.EncryptDao;
import com.korail.talk.network.dao.common.KBPayEncryptDao;
import com.korail.talk.network.dao.common.MaasMenuListDao;
import com.korail.talk.network.dao.common.SeedEncryptDao;
import com.korail.talk.network.dao.common.StationDataDao;
import com.korail.talk.network.dao.common.StationInfoDao;
import com.korail.talk.network.dao.common.authQRLocationDao;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface CommonService {
    @POST("/classes/com.korail.mobile.qr.bchTripSv.do")
    @FormUrlEncoded
    authQRLocationDao.QRLocationResponse authQRLocation(@Field("Device") String str, @Field("Version") String str2, @Field("qrcode") String str3, @Field("latitude") String str4, @Field("longitude") String str5);

    @GET("/ebizcross/getUUID.do")
    CookieDao.RsvWaitResponse ckValue();

    @POST("/classes/com.korail.mobile.common.code.do")
    @FormUrlEncoded
    CommonCodeDao.CommonCodeResponse getCommonCode(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field(Constants.CODE) List<String> list, @Field("deviceWidth") int i8, @Field("deviceHeight") int i9, @Field("departDate") String str4, @Field("arrivalDate") String str5, @Field("holidayYn") String str6, @Field("OSVersion") int i10);

    @POST("/classes/com.korail.mobile.common.decrypt.do")
    @FormUrlEncoded
    DecryptDao.DecryptResponse getDecrypt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("type") String str4, @Field("values") List<String> list);

    @POST("/classes/com.korail.mobile.common.encrypt.do")
    @FormUrlEncoded
    EncryptDao.EncryptResponse getEncrypt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("type") String str4, @Field("values") List<String> list);

    @POST("/classes/com.korail.mobile.common.encrypt.do")
    @FormUrlEncoded
    KBPayEncryptDao.KBpayEncryptResponse getKBPayEncrypt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("type") String str4, @Field("values") List<String> list);

    @POST("/classes/com.korail.mobile.copt.gdMenuLt.do")
    @FormUrlEncoded
    MaasMenuListDao.MaasMenuListResponse getMaasMenuList(@Field("Device") String str, @Field("Version") String str2, @Field("pnrNo") String str3, @Field("tkRetNo") List<String> list, @Field("addSrvReqNo") String str4);

    @POST("/ebizmaas/EbizMaasStationList.do")
    @FormUrlEncoded
    StationDataDao.StationDataResponse getMaasStationList(@Field("addSrvDvCd") String str);

    @GET("/classes/com.korail.mobile.common.stationdata")
    StationDataDao.StationDataResponse getStationData();

    @GET("/classes/com.korail.mobile.common.stationinfo")
    StationInfoDao.StationInfoResponse getStationInfo(@Query("Device") String str);

    @POST("/classes/com.korail.mobile.shinhan.Encrypt.do")
    @FormUrlEncoded
    SeedEncryptDao.SeedEncryptResponse seedEncrypt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("value") List<String> list);
}
