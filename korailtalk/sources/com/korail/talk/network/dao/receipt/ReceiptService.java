package com.korail.talk.network.dao.receipt;

import com.korail.talk.network.dao.receipt.ReceiptDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface ReceiptService {
    @POST("/classes/com.korail.mobile.receipt.ReceiptInfo")
    @FormUrlEncoded
    ReceiptDao.ReceiptResponse getTicketReceipt(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("h_orgtk_sale_dt") String str4, @Field("h_orgtk_wct_no") String str5, @Field("h_orgtk_sale_sqno") String str6, @Field("h_orgtk_tk_ret_pwd") String str7);
}
