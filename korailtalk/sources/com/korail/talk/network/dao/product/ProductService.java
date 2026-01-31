package com.korail.talk.network.dao.product;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.product.ProductDetailDao;
import com.korail.talk.network.dao.product.ProductListDao;
import com.korail.talk.network.dao.product.ProductPaymentCheckDao;
import retrofit.http.GET;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface ProductService {
    @GET("/classes/com.korail.mobile.product.ReservationDetail")
    ProductDetailDao.ProductDetailResponse getProductDetail(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("txtVrRsNo") String str4, @Query("txtVrRsvSqNo") String str5);

    @GET("/classes/com.korail.mobile.product.ReservationList")
    ProductListDao.ProductListResponse getProductList(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("txtSelPage") int i8, @Query("txtCntPerPage") int i9);

    @GET("/classes/com.korail.mobile.product.payInfo")
    ProductPaymentCheckDao.ProductPaymentCheckResponse paymentCheck(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("txtVrRsNo") String str4, @Query("txtRsvGdSqno") String str5);

    @GET("/classes/com.korail.mobile.product.ReservationCancel")
    BaseResponse productCancel(@Query("Device") String str, @Query("Version") String str2, @Query("Key") String str3, @Query("txtVrRsNo") String str4, @Query("txtGdSqno") String str5);
}
