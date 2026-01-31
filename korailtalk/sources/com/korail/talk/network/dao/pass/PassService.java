package com.korail.talk.network.dao.pass;

import com.korail.talk.network.dao.pass.CommPaymentDao;
import com.korail.talk.network.dao.pass.CommReservationDao;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.dao.pass.EnableDateDao;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.dao.pass.PassReservationDao;
import com.korail.talk.network.dao.pass.TripMenuDao;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface PassService {
    @POST("/classes/com.korail.mobile.pass.passPayIssue")
    @FormUrlEncoded
    CommPaymentDao.CommPaymentResponse commPayment(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidPayAmount") String str4, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2);

    @POST("/classes/com.korail.mobile.pass.passReserve")
    @FormUrlEncoded
    CommReservationDao.CommReservationResponse commReservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidCmtrKndCd") String str4, @Field("hidCmtrUtlTrmCd") String str5, @Field("hidCmtrUtlTrmNm") String str6, @Field("hidCmtrUtlAgeCd") String str7, @Field("hidUseOpenDt") String str8, @Field("hidAppDptStnCd") String str9, @Field("hidAppDptStnNm") String str10, @Field("hidAppArvStnCd") String str11, @Field("hidAppArvStnNm") String str12, @Field("hidChtrnStnCd") String str13, @Field("hidChtrnStnNm") String str14, @Field("hidTrnNo1") String str15, @Field("hidTrnNo2") String str16, @Field("hidTrnGpCd1") String str17, @Field("hidTrnGpCd2") String str18, @Field("hidDtour1") String str19, @Field("hidDtour2") String str20);

    @POST("/classes/com.korail.mobile.pass.passScheduleInfoList")
    @FormUrlEncoded
    CommRsvInquiryDao.CommRsvInquiryResponse getCommRsvInquiry(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("selGoTrain") String str4, @Field("selGoAbrdDt") String str5, @Field("txtGoHour") String str6, @Field("radChgTrnDvCd") String str7, @Field("txtCmtrKndCd") String str8, @Field("txtCmtrUtlTrmCd") String str9, @Field("txtCmtrUtlAgeCd") String str10, @Field("txtSelPage") String str11, @Field("txtCntPerPage") String str12, @Field("txtGoStart") String str13, @Field("txtGoEnd") String str14, @Field("txtWkndUseFlg") String str15);

    @POST("/classes/com.korail.mobile.pass.passInfoList")
    @FormUrlEncoded
    EnableDateDao.EnableDateResponse getEnableDate(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtCmtrKndCd") String str4, @Field("txtCmtrUtlTrmCd") String str5, @Field("txtCmtrUtlAgeCd") String str6);

    @POST("/classes/com.korail.mobile.pass.passMenu.do")
    @FormUrlEncoded
    DiscountMenuDao.DiscountMenuResponse passMenu(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("menuNo") String str4);

    @POST("/classes/com.korail.mobile.pass.passOtrPayIssue")
    @FormUrlEncoded
    PassPaymentDao.PassPaymentResponse passPayment(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidPayAmount") String str4, @Field("h_rcvd_prc") String str5, @Field("hidWctNo") String str6, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2);

    @POST("/classes/com.korail.mobile.pass.passOtrReserve")
    @FormUrlEncoded
    PassReservationDao.PassReservationResponse passReservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidCmtrKndCd") String str4, @Field("hidCmtrUtlTrmCd") String str5, @Field("hidCmtrUtlAgeCd") String str6, @Field("hidUseOpenDt") String str7);

    @POST("/classes/com.korail.mobile.pass.trGdMenuLt.do")
    @FormUrlEncoded
    TripMenuDao.TripMenuResponse tripMenu(@Field("Device") String str, @Field("Version") String str2);
}
