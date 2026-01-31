package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.certification.CongresspersonCertDao;
import com.korail.talk.network.dao.certification.DisabledCertificationDao;
import com.korail.talk.network.dao.certification.GovernmentCertificationStep1Dao;
import com.korail.talk.network.dao.certification.GovernmentCertificationStep2Dao;
import com.korail.talk.network.dao.certification.MeritCertDao;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.List;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/* loaded from: classes.dex */
public interface CertificationService {
    @GET("/classes/com.korail.mobile.certification.ReservationList")
    BaseResponse applyDisabilityCertification(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("hidPnrNo") String str4, @Query("txtPsgDisc0019Cnt") int i8, @QueryMap Map<String, Integer> map, @QueryMap Map<String, String> map2, @QueryMap Map<String, String> map3, @QueryMap Map<String, String> map4, @QueryMap Map<String, String> map5, @QueryMap Map<String, String> map6);

    @GET("/classes/com.korail.mobile.certification.assemblyCert")
    CongresspersonCertDao.CongresspersonCertResponse certCongressperson(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("freeDiscCertNo") String str4, @Query("certNo") String str5, @Query("abrdDt") String str6);

    @POST("/classes/com.korail.mobile.certification.MeritCert")
    @FormUrlEncoded
    MeritCertDao.MeritCertResponse certMerit(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtFreeDiscCertNo") String str4, @Field("txtAcptPwd") String str5, @Field("txtJuminNo7") String str6, @Field("txtAbrdDt") String str7);

    @GET("/classes/com.korail.mobile.certification.disabled.do")
    DisabledCertificationDao.DisabledCertificationResponse disabledCertification(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("regNum") String str4, @Query("hdcpGrade") String str5);

    @POST("/classes/com.korail.mobile.certification.PriceReCalculation")
    @FormUrlEncoded
    ReservationResponse getDiscountPrice(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("hidPnrNo") String str4, @Field("txtJobId") String str5, @Field("hiduserYn") String str6, @Field("hidCustNo") String str7, @Field("txtPsgGridcnt") String str8, @Field("psg_tp_dv_cd") List<String> list, @Field("hidDcntKndCd") List<String> list2, @Field("dcnt_knd_cd1") List<String> list3, @Field("hidDscpNo") List<String> list4, @Field("psrm_cl_cd") List<String> list5, @Field("hidFmlyNo") List<String> list6);

    @GET("/classes/com.korail.mobile.pbep.toknCre.do")
    GovernmentCertificationStep1Dao.GovernmentCertificationResponse govermentCertification1(@Query("Device") String str, @Query("Version") String str2);

    @GET("/classes/com.korail.mobile.pbep.sttChck.do")
    GovernmentCertificationStep2Dao.GovernmentCertificationStep2Response govermentCertification2(@Query("Device") String str, @Query("Version") String str2, @Query("csrfToken") String str3);

    @GET("/classes/com.korail.mobile.certification.ReservationList")
    ReservationResponse inquiryTicketRsv(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("hidPnrNo") String str4);

    @POST("/classes/com.korail.mobile.nonMember.NonMemTicket")
    @FormUrlEncoded
    ReservationResponse reservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field("txtMenuId") String str5, @Field("txtJobId") String str6, @Field("txtGdNo") String str7, @Field("hidFreeFlg") String str8, @Field("txtStndFlg") String str9, @Field("txtCustNm") String str10, @Field("txtCpNo") String str11, @Field("txtCustPw") String str12, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2, @FieldMap Map<String, String> map3, @FieldMap Map<String, String> map4);

    @POST("/classes/com.korail.mobile.certification.TicketReservation")
    @FormUrlEncoded
    ReservationResponse reservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field("txtMenuId") String str5, @Field("txtJobId") String str6, @Field("txtGdNo") String str7, @Field("hidFreeFlg") String str8, @Field("txtStndFlg") String str9, @Field("pbepInfo") String str10, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2, @FieldMap Map<String, String> map3, @FieldMap Map<String, String> map4);

    @POST("/classes/com.korail.mobile.nonMember.NonMemTicket")
    @FormUrlEncoded
    ReservationResponse reservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtCustNm") String str4, @Field("txtCpNo") String str5, @Field("txtCustPw") String str6, @FieldMap Map<String, String> map);

    @POST("/classes/com.korail.mobile.certification.TicketReservation")
    @FormUrlEncoded
    ReservationResponse reservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @FieldMap Map<String, String> map);
}
