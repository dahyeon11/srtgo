package com.korail.talk.network.dao.research;

import I4.b;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import com.korail.talk.network.dao.research.ConvenienceSettingDao;
import com.korail.talk.network.dao.research.MergeSeatInquiryDao;
import com.korail.talk.network.dao.research.NCardHistoryDao;
import com.korail.talk.network.dao.research.NCardInquiryDao;
import com.korail.talk.network.dao.research.NCardReservationDao;
import com.korail.talk.network.dao.research.OgTkInquiryDao;
import com.korail.talk.network.dao.research.SearchCarListDao;
import com.korail.talk.network.dao.research.SearchSeatListDao;
import com.korail.talk.network.dao.research.SeatAssignScheduleViewDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OPsg;
import com.korail.talk.network.data.reservation.old.OSeat;
import java.util.List;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface ResearchService {
    @POST("/classes/com.korail.mobile.research.assignScheduleView.do")
    @FormUrlEncoded
    SeatAssignScheduleViewDao.SeatAssignScheduleViewResponse getAssignScheduleView(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("menuId") String str4, @Field(b.DPT_DT) String str5, @Field(b.DPT_TM) String str6, @Field("dptRsStnNm") String str7, @Field("arvRsStnNm") String str8, @Field("trnGpCd") String str9, @Field("psrmClCd") String str10, @Field("seatAttCd1") String str11, @Field("psgNum1") int i8, @Field("stlbDturDvNm1") String str12, @Field("dirtChtnDvCd") String str13, @Field("chtnArvRsStnNm") String str14);

    @POST("/classes/com.korail.mobile.research.TrainResearch")
    @FormUrlEncoded
    SearchCarListDao.SearchCarListResponse getCarList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("Sid") String str4, @Field("txtMenuId") String str5, @Field(OSeat.PSRM_CL_CD) String str6, @Field(OJrny.RUN_DT) String str7, @Field(OJrny.DPT_DT) String str8, @Field(OJrny.TRN_CLSF_CD) String str9, @Field(OJrny.TRN_NO) String str10, @Field(OJrny.DPT_RS_STN_CD) String str11, @Field(OJrny.ARV_RS_STN_CD) String str12, @Field(OJrny.DPT_STN_RUN_ORDR) String str13, @Field(OJrny.ARV_STN_RUN_ORDR) String str14, @Field(OJrny.TRN_GP_CD) String str15, @Field(OPsg.TOT_PSG_CNT) int i8, @Field("txtSeatAttCd") String str16, @Field("txtGdNo") String str17, @Field("sidTest") String str18);

    @POST("/classes/com.korail.mobile.research.cmtrInfo.do")
    @FormUrlEncoded
    CmtrInfoDao.CmtrInfoResponse getCmtrInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("jobDvCd") String str4, @Field("cmtrKndCd") String str5, @Field(RPsg.PSG_CNT) int i8, @Field("cmtrUtlAgeCd") List<String> list, @Field("psgPrnb") List<Integer> list2, @Field("ogtkSaleWctNo") String str6, @Field("ogtkSaleDd") String str7, @Field("ogtkSaleSqno") String str8, @Field("ogtkRetPwd") String str9, @Field("inquiryType") String str10);

    @POST("/classes/com.korail.mobile.research.custTripInfo.do")
    @FormUrlEncoded
    ConvenienceSettingDao.ConvenienceSettingResponse getCustTripInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("custMgNo") String str4, @Field("medDvCd") String str5, @Field("regSqno") String str6);

    @POST("/classes/com.korail.mobile.research.mergeSeatsC.do")
    @FormUrlEncoded
    MergeSeatInquiryDao.MergeSeatInquiryResponse getMergeSeatsInquiry(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("abrdDt") String str4, @Field("runDt") String str5, @Field(Price2FareDao.Price2Fare.trnNoString) String str6, @Field("dptRsStnNm") String str7, @Field("arvRsStnNm") String str8, @Field("selRsStnNm") String str9, @Field("psrmClCd") String str10, @Field("seatAttCd") String str11, @Field("totPsgNum") String str12);

    @GET("/classes/com.korail.mobile.ticket.dcntCrdUseQry.do")
    NCardHistoryDao.NCardHistoryResponse getNCardHistory(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("dcntCrdNo") String str4);

    @GET("/classes/com.korail.mobile.research.dcntCrdScheduleView.do")
    NCardInquiryDao.NCardInquiryResponse getNCardSchedultView(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query(b.DPT_DT) String str4, @Query("dptRsStnNm") String str5, @Query("arvRsStnNm") String str6, @Query(b.DPT_TM) String str7, @Query("trnGpCd") String str8, @Query("dirtChtnDvCd") String str9, @Query("dcntCrdKndCd") String str10, @Query("dcntCrdKndMgNo") String str11, @Query("useTrmDno") String str12, @Query("usePsbTno") String str13, @Query("qryPgNo") String str14);

    @POST("/classes/com.korail.mobile.research.TResidualSeatsResearch.do")
    @FormUrlEncoded
    SearchSeatListDao.SearchSeatListResponse getSeatList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("trnClsfCd") String str4, @Field("trnGpCd") String str5, @Field("runDt") String str6, @Field(Price2FareDao.Price2Fare.trnNoString) String str7, @Field("srcarNo") int i8, @Field("psrmClCd") String str8, @Field("dptRsStnCd") String str9, @Field(b.ARV_RS_STN_CD) String str10, @Field("seatAttCd") String str11, @Field("dptStnRunOrdr") String str12, @Field("arvStnRunOrdr") String str13, @Field("totPsgCnt") int i9, @Field("gdNo") String str14, @Field("isArrow") boolean z8, @Field("Sid") String str15, @Field("sidTest") String str16, @Field("ctlDvCd") String str17);

    @POST("/classes/com.korail.mobile.research.tripChgOgtk.do")
    @FormUrlEncoded
    OgTkInquiryDao.OgTkInquiryResponse getTicketOriginalInquiry(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkCnt") int i8, @FieldMap Map<String, String> map);

    @GET("/classes/com.korail.mobile.reservation.dcntCrdExtn.do")
    BaseResponse setNCardExtension(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("saleWctNo") String str4, @Query("saleDd") String str5, @Query("saleSqno") String str6, @Query("tkRetPwd") String str7);

    @POST("/classes/com.korail.mobile.research.dcntCrdInfo.do")
    @FormUrlEncoded
    NCardReservationDao.NCardReservationResponse setNCardReservation(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("dcntCrdKndMgNo") String str4, @Field("custMgNo") String str5, @Field("vlidTrmStDt") String str6, @Field("usePsbTno") String str7, @FieldMap Map<String, String> map, @FieldMap Map<String, String> map2);
}
