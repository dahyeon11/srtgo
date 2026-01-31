package com.korail.talk.network.dao.addService;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.addService.AdditionalServiceDao;
import com.korail.talk.network.dao.addService.ExtraProductListDao;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.addService.HelpSrvTkDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface AddService {
    @POST("/classes/com.korail.mobile.addService.reserve.do")
    @FormUrlEncoded
    AdditionalServiceDao.AdditionalServiceResponse additionalService(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field(Price2FareDao.Price2Fare.jrnySqnoString) String str5, @Field("saleWctNo") String str6, @Field("saleDt") String str7, @Field("saleSqno") String str8, @Field("jobDvCd") String str9, @Field("addSrvId") String str10, @Field("reqQnty") int i8, @Field("helpSrvTgtCnt") int i9, @Field("rcpSqno") List<String> list, @Field("cncTgtCnt") int i10, @Field("addSrvReqNo") List<String> list2);

    @POST("/classes/com.korail.mobile.addService.buyConfirm.do")
    @FormUrlEncoded
    BaseResponse dealCarBuy(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("addSrvCnt") int i8, @Field("addSrvReqNo") List<String> list);

    @POST("/classes/com.korail.mobile.addService.reserveList.do")
    @FormUrlEncoded
    ExtraProductListDao.ExtraProductListResponse getExtraProductList(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4);

    @POST("/classes/com.korail.mobile.addSrv.helpSrvCust.do")
    @FormUrlEncoded
    HelpSrvCustDao.HelpSrvCustResponse helpSrvCust(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDt") String str5, @Field("saleSqno") String str6, @Field("reqCnt") int i8, @Field("reqAddSrvDvCd") List<String> list, @Field("reqAddRcpSrvCd") List<String> list2, @Field("reqCustNm") List<String> list3, @Field("reqCntcChnCont") List<String> list4, @Field("qryDvCd") String str7, @Field("addSrvDvCd") String str8, @Field("rcpSqno") String str9);

    @POST("/classes/com.korail.mobile.addSrv.helpSrvTk.do")
    @FormUrlEncoded
    HelpSrvTkDao.HelpSrvTkDaoResponse helpSrvTk(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("saleWctNo") String str4, @Field("saleDt") String str5, @Field("saleSqno") String str6);
}
