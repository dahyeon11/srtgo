package com.korail.talk.network.dao.seatMovie;

import I4.b;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface SeatMovieService {
    @POST("/classes/com.korail.mobile.seatMovie.ScheduleView")
    @FormUrlEncoded
    RsvInquiryResponse getRsvInquiry(@Field("Device") String str, @Field("Version") String str2, @Field("Sid") String str3, @Field("txtMenuId") String str4, @Field("radJobId") String str5, @Field("selGoTrain") String str6, @Field(OJrny.TRN_GP_CD) String str7, @Field(b.TRAIN_NO) String str8, @Field("txtGoStart") String str9, @Field("txtGoEnd") String str10, @Field("txtGoAbrdDt") String str11, @Field("txtGoHour") String str12, @Field("txtPsgFlg_1") String str13, @Field("txtPsgFlg_2") String str14, @Field("txtPsgFlg_3") String str15, @Field("txtPsgFlg_4") String str16, @Field("txtPsgFlg_5") String str17, @Field("txtSeatAttCd_2") String str18, @Field("txtSeatAttCd_3") String str19, @Field("txtSeatAttCd_4") String str20, @Field("txtJobDv") String str21, @Field("etrPath") String str22, @Field("tkDptDt") String str23, @Field("tkDptTm") String str24, @Field("tkTrnNo") String str25, @Field("ebizCrossCheck") String str26, @Field("srtCheckYn") String str27, @Field("rtYn") String str28, @Field("adjStnScdlOfrFlg") String str29, @Field("mbCrdNo") String str30, @Field("tkPsrmClCd") String str31, @Field("tkRcvdAmt") String str32, @Field("qryDvCd") String str33, @Field("qryStNo") String str34, @Field("qryStTrnNo") String str35, @Field("qryStTrnNo2") String str36, @Field("pgPrCnt") String str37, @Field("chtnCnt") String str38, @Field("chtnRsStnCd1") String str39, @Field("trnGpCnt") String str40, @Field("trnGpCd1") String str41);

    @POST("/classes/com.korail.mobile.seatMovie.LimousineScheduleView")
    @FormUrlEncoded
    RsvInquiryResponse getRsvLimousineInquiry(@Field("Device") String str, @Field("Version") String str2, @Field("Sid") String str3, @Field("txtMenuId") String str4, @Field("radJobId") String str5, @Field("txtJobDv") String str6, @Field("selGoTrain") String str7, @Field(OJrny.TRN_GP_CD) String str8, @Field(b.TRAIN_NO) String str9, @Field("txtGoStart") String str10, @Field("txtGoEnd") String str11, @Field("txtGoAbrdDt") String str12, @Field("txtGoHour") String str13, @Field("txtPsgFlg_1") String str14, @Field("txtPsgFlg_2") String str15, @Field("txtPsgFlg_3") String str16, @Field("txtPsgFlg_4") String str17, @Field("txtPsgFlg_5") String str18, @Field("txtSeatAttCd_2") String str19, @Field("txtSeatAttCd_3") String str20, @Field("txtSeatAttCd_4") String str21, @Field("ebizCrossCheck") String str22, @Field("srtCheckYn") String str23, @Field("rtYn") String str24);

    @POST("/classes/com.korail.mobile.seatMovie.ScheduleViewSpecial")
    @FormUrlEncoded
    RsvInquiryResponse getRsvProductInquiry(@Field("Device") String str, @Field("Version") String str2, @Field("txtMenuId") String str3, @Field("radJobId") String str4, @Field("selGoTrain") String str5, @Field(OJrny.TRN_GP_CD) String str6, @Field("txtGoStart") String str7, @Field("txtGoEnd") String str8, @Field("txtGoAbrdDt") String str9, @Field("txtGoHour") String str10, @Field("txtPsgFlg_1") String str11, @Field("txtPsgFlg_2") String str12, @Field("txtPsgFlg_3") String str13, @Field("txtPsgFlg_4") String str14, @Field("txtPsgFlg_5") String str15, @Field("txtSeatAttCd_2") String str16, @Field("txtSeatAttCd_3") String str17, @Field("txtSeatAttCd_4") String str18, @Field("txtGdNo") String str19, @Field("qryDvCd") String str20, @Field("qryStNo") String str21, @Field("qryStTrnNo") String str22, @Field("qryStTrnNo2") String str23, @Field("pgPrCnt") String str24, @Field("chtnCnt") String str25, @Field("chtnRsStnCd1") String str26, @Field("trnGpCnt") String str27, @Field("trnGpCd1") String str28);
}
