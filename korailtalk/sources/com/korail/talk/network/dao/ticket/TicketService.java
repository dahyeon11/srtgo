package com.korail.talk.network.dao.ticket;

import I4.b;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.ticket.DlvRcvCustDao;
import com.korail.talk.network.dao.ticket.MaasServiceCancelFeeDao;
import com.korail.talk.network.dao.ticket.MaasServiceDetailListDao;
import com.korail.talk.network.dao.ticket.PbpAcepSpecDao;
import com.korail.talk.network.dao.ticket.RecentDeliveryHistoryDao;
import com.korail.talk.network.dao.ticket.SelfCheckinInfoDao;
import com.korail.talk.network.dao.ticket.SelfCheckinPossibleDao;
import com.korail.talk.network.dao.ticket.TicketDuplicationCheckDao;
import com.korail.talk.network.dao.ticket.UpdatePlatformDao;
import com.korail.talk.network.dao.ticket.change.CallSelfSeatChgInfoDao;
import com.korail.talk.network.dao.ticket.change.TripChgInfoDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import java.util.List;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface TicketService {
    @POST("/classes/com.korail.mobile.tk.dvcInfoInit.do")
    @FormUrlEncoded
    BaseResponse deviceReset(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("teln") String str4, @Field("custNm") String str5, @Field("nonMbPwd") String str6, @Field("stlbTrnClsfCd") String str7, @Field("dptDttm") String str8, @Field("latitude") String str9, @Field("longitude") String str10, @Field(Price2FareDao.Price2Fare.trnNoString) String str11);

    @POST("/classes/com.korail.mobile.tk.dlvRcvCust.do")
    @FormUrlEncoded
    DlvRcvCustDao.DlvRcvCustwResponse dlvRcvCust(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDt") String str5, @Field("saleSqno") String str6, @Field("tkRetPwd") String str7);

    @POST("/classes/com.korail.mobile.ticket.ticketDupCheck.do")
    @FormUrlEncoded
    TicketDuplicationCheckDao.DuplicationCheckResponse duplicationCheck(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4);

    @POST("/classes//com.korail.mobile.addService.cancelPay.do")
    @FormUrlEncoded
    BaseResponse getMaasCancel(@Field("Device") String str, @Field("Version") String str2, @Field("custMgNo") String str3, @Field("lumpStlTgtNo") String str4);

    @POST("/classes/com.korail.mobile.addService.coptCnc.do")
    @FormUrlEncoded
    BaseResponse getMaasServiceCancel(@Field("Device") String str, @Field("Version") String str2, @Field("pnrNo") String str3, @Field("cncTgtCnt") String str4, @Field("cncAddSrvReqNo") String str5, @Field("cncRetFee") String str6);

    @POST("/classes/com.korail.mobile.maas.cncFee.do")
    @FormUrlEncoded
    MaasServiceCancelFeeDao.MaasServiceCancelFeeResponse getMaasServiceCancelFee(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("addSrvReqNo") String str4, @Field("addSrvDvCd") String str5, @Field("coptEntRsvNo") String str6);

    @POST("/classes/com.korail.mobile.copt.gdReqQry.do")
    @FormUrlEncoded
    MaasServiceDetailListDao.MaasServivceDetailResponse getMaasServiceDetailList(@Field("Device") String str, @Field("Version") String str2, @Field("qryDtFrom") String str3, @Field("qryDtTo") String str4);

    @POST("/classes/com.korail.mobile.self.seatChgInfo.do")
    @FormUrlEncoded
    CallSelfSeatChgInfoDao.CallSelfSeatChgInfoResponse getSelfSeatChgInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("runDt") String str4, @Field(Price2FareDao.Price2Fare.trnNoString) String str5, @Field("dptRsStnCd") String str6, @Field(b.ARV_RS_STN_CD) String str7, @Field("psrmClCd") String str8);

    @POST("/classes/com.korail.mobile.reservation.tripChgDate.do")
    @FormUrlEncoded
    TripChgInfoDao.TripChgInfoDaoResponse getTripChgDate(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tripChgDate") String str4);

    @POST("/classes/com.korail.mobile.tk.gurdSmsSnd.do")
    @FormUrlEncoded
    BaseResponse gurdSmsSnd(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field(Price2FareDao.Price2Fare.jrnySqnoString) String str5, @Field("rcvPsHndyTeln") String str6);

    @POST("/classes/com.korail.mobile.tk.pbpAcepSpec.do")
    @FormUrlEncoded
    PbpAcepSpecDao.PbpAcepSpecResponse pbpAcepSpec(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkCnt") int i8, @Field("tkRetNo") List<String> list);

    @POST("/classes/com.korail.mobile.tk.pbpWdrw.do")
    @FormUrlEncoded
    BaseResponse pbpTkWdrw(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pbpCnt") int i8, @Field("pbpRsvNo") List<String> list, @Field("pnrNo") List<String> list2);

    @POST("/classes/com.korail.mobile.tk.plfNo.do")
    @FormUrlEncoded
    UpdatePlatformDao.PlfNoResponse plfNo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("tkCnt") String str4, @Field("tkRetNo") List<String> list);

    @POST("/classes/com.korail.mobile.tk.rcntDlvHst.do")
    @FormUrlEncoded
    RecentDeliveryHistoryDao.RcntDlvHstResponse rcntDlvHst(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("custMgNo") String str4);

    @POST("/classes/com.korail.mobile.checkin.cnc.do")
    @FormUrlEncoded
    BaseResponse selfCheckinCancel(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDt") String str5, @Field("saleSqno") String str6, @Field("tkRetPwd") String str7, @Field(Price2FareDao.Price2Fare.jrnySqnoString) String str8);

    @POST("/classes/com.korail.mobile.checkin.info.do")
    @FormUrlEncoded
    SelfCheckinInfoDao.SelfCheckinInfoResponse selfCheckinInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDt") String str5, @Field("saleSqno") String str6, @Field("tkRetPwd") String str7, @Field(Price2FareDao.Price2Fare.jrnySqnoString) String str8);

    @POST("/classes/com.korail.mobile.checkin.psbFlg.do")
    @FormUrlEncoded
    SelfCheckinPossibleDao.SelfCheckinPossibleResponse selfCheckinPossible(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("qrcode") String str4, @Field("saleWctNo") String str5, @Field("saleDd") String str6, @Field("saleSqno") String str7, @Field("tkRetPwd") String str8, @Field(Price2FareDao.Price2Fare.jrnySqnoString) String str9);

    @POST("/classes/com.korail.mobile.checkin.reg.do")
    @FormUrlEncoded
    BaseResponse selfCheckinRegister(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("cpsNo") String str4, @Field("scarNo") String str5, @Field("seatNo") String str6, @Field("saleWctNo") String str7, @Field("saleDd") String str8, @Field("saleSqno") String str9, @Field("tkRetPwd") String str10, @Field(Price2FareDao.Price2Fare.jrnySqnoString) String str11);

    @POST("/classes/com.korail.mobile.ticket.tripChgHndgCnc.do")
    @FormUrlEncoded
    BaseResponse ticketChangeCancel(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("lumpStlCnt") String str4, @FieldMap Map<String, String> map);
}
