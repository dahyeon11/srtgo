package com.korail.talk.network.dao.refund;

import com.korail.talk.network.dao.refund.RefundCommissionDao;
import com.korail.talk.network.dao.refund.RefundDao;
import com.korail.talk.network.dao.refund.RefundExecuteTicketRefundDao;
import com.korail.talk.network.dao.refund.RefundVerifyTicketDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.trainsInfo.Price2FareDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface RefundService {
    @POST("/classes/com.korail.mobile.refunds.executeOnlineRefunds")
    @FormUrlEncoded
    RefundExecuteTicketRefundDao.RefundExecuteTicketRefundResponse executeOnlineRefunds(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("pnrNo") String str4, @Field("tkKndCd") String str5, @Field("retDvCd") String str6, @Field("retRsnCd") String str7, @Field("ogtkSaleDt") String str8, @Field("ogtkSaleWctNo") String str9, @Field("ogtkSaleSqno") String str10, @Field("ogtkRetPwd") String str11, @Field("retAmt") String str12, @Field("retFee") String str13, @Field("custTeln") String str14, @Field("acepCustNm") String str15);

    @POST("/classes/com.korail.mobile.refunds.CommissionView")
    @FormUrlEncoded
    RefundCommissionDao.RefundCommissionResponse getTicketCommission(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("h_orgtk_ret_sale_dt") String str4, @Field("h_orgtk_wct_no") String str5, @Field("h_orgtk_sale_sqno") String str6, @Field("h_orgtk_ret_pwd") String str7, @Field("h_comp_nm") String str8, @Field("h_comp_cert_no") String str9);

    @POST("/classes/com.korail.mobile.refunds.SelTicketInfo")
    @FormUrlEncoded
    TicketDetailDao.TicketDetailResponse getTicketDetail(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("h_orgtk_ret_sale_dt") String str4, @Field("h_orgtk_wct_no") String str5, @Field("h_orgtk_sale_sqno") String str6, @Field("h_orgtk_ret_pwd") String str7, @Field("h_purchase_history") String str8);

    @POST("/classes/com.korail.mobile.refunds.RefundsRequest")
    @FormUrlEncoded
    RefundDao.RefundResponse returnTicket(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtPnrNo") String str4, @Field("h_orgtk_sale_dt") String str5, @Field("h_orgtk_sale_wct_no") String str6, @Field("h_orgtk_sale_sqno") String str7, @Field("h_orgtk_ret_pwd") String str8, @Field("h_mlg_stl") String str9, @Field("tk_ret_tms_dv_cd") String str10, @Field(Price2FareDao.Price2Fare.trnNoString) String str11, @Field("pbpAcepTgtFlg") String str12, @Field("latitude") String str13, @Field("longitude") String str14);

    @POST("/classes/com.korail.mobile.refunds.verifyOnlineRefunds")
    @FormUrlEncoded
    RefundVerifyTicketDao.RefundVerifyTicketResponse verifyOnlineRefunds(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("retNo1") String str4, @Field("retNo2") String str5, @Field("retNo3") String str6, @Field("retNo4") String str7, @Field("strName") String str8);
}
