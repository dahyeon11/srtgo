package com.korail.talk.network.dao.trainsInfo;

import I4.b;
import com.korail.talk.network.dao.trainsInfo.FresScarDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import com.korail.talk.network.dao.trainsInfo.PriceFareDao;
import com.korail.talk.network.dao.trainsInfo.TourTrainInfoDao;
import com.korail.talk.network.dao.trainsInfo.TrainScheduleDao;
import com.korail.talk.network.dao.trainsInfo.TrainSelectStationDao;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OSeat;
import java.util.Map;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface TrainsInfoService {
    @POST("/classes/com.korail.mobile.trn.fresScar.do")
    @FormUrlEncoded
    FresScarDao.FresScarResponse getFresScar(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("runDt") String str4, @Field(Price2FareDao.Price2Fare.trnNoString) String str5, @Field("dptStnConsOrdr") String str6, @Field("arvStnConsOrdr") String str7, @Field("dptStnRunOrdr") String str8, @Field("arvStnRunOrdr") String str9);

    @POST("/classes/com.korail.mobile.trn.prcFare.do")
    @FormUrlEncoded
    Price2FareDao.Price2FareResponse getPrice2Fare(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtMenuId") String str4, @Field("chtnDvCd") String str5, @Field("trnCnt") String str6, @FieldMap Map<String, String> map);

    @POST("/classes/com.korail.mobile.trainsInfo.TrainCharge")
    @FormUrlEncoded
    PriceFareDao.PriceFareResponse getPriceFare(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtMenuId") String str4, @Field("txtRtnDvCd") String str5, @Field("txtChtrDvCd1") String str6, @Field(OSeat.SEAT_ATT_CD4) String str7, @FieldMap Map<String, String> map);

    @POST("/classes/com.korail.mobile.qry.chtnStn.do")
    @FormUrlEncoded
    TrainSelectStationDao.TrainSelectStationResponse getSelectStationInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("dptRsStnCd") String str4, @Field(b.ARV_RS_STN_CD) String str5);

    @POST("/classes/com.korail.mobile.trainsInfo.TourTrainSpecialRoom")
    @FormUrlEncoded
    TourTrainInfoDao.TourTrainInfoResponse getTourTrainInfo(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field(OJrny.TRN_GP_CD) String str4);

    @POST("/classes/com.korail.mobile.research.actualTrainSchedule.do")
    @FormUrlEncoded
    TrainScheduleDao.TrainScheduleResponse getTrainSchedule(@Field("Device") String str, @Field("Version") String str2, @Field("runDt") String str3, @Field(Price2FareDao.Price2Fare.trnNoString) String str4);
}
