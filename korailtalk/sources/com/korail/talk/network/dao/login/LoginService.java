package com.korail.talk.network.dao.login;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.login.LoginDao;
import com.korail.talk.network.dao.login.MemberCertDao;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/* loaded from: classes.dex */
public interface LoginService {
    @POST("/classes/com.korail.mobile.login.userCheck")
    @FormUrlEncoded
    MemberCertDao.MemberCertResponse certMember(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtAcptPsNm") String str4, @Field("acept") String str5, @Field("txtCpNo") String str6, @Field("memNum") String str7, @Field("txtEmailNo") String str8);

    @POST("/classes/com.korail.mobile.login.Login")
    @FormUrlEncoded
    LoginDao.LoginResponse login(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("txtMemberNo") String str4, @Field("txtPwd") String str5, @Field("txtInputFlg") String str6, @Field("checkValidPw") String str7, @Field("custId") String str8, @Field("etrPath") String str9, @Field("idx") String str10);

    @POST("/classes/com.korail.mobile.login.loginAthnReg.do")
    @FormUrlEncoded
    BaseResponse loginAthnReg(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("lognTpCd") String str4, @Field("custId") String str5);

    @POST("/classes/com.korail.mobile.login.loginAthnRmv.do")
    @FormUrlEncoded
    BaseResponse loginAthnRmv(@Field("Device") String str, @Field("Version") String str2, @Field("Key") String str3, @Field("srvQryDvVal") String str4, @Field("lognTpCd") String str5);

    @GET("/classes/com.korail.mobile.login.Logout")
    BaseResponse logout();

    @POST("/classes/com.korail.mobile.login.joinCfm.do")
    @FormUrlEncoded
    BaseResponse memberCheck(@Field("Device") String str, @Field("Version") String str2, @Field("hmpgPwd") String str3, @Field("custNm") String str4);

    @POST("/classes/com.korail.mobile.login.mbSced.do")
    @FormUrlEncoded
    BaseResponse memberDrop(@Field("Device") String str, @Field("Version") String str2);
}
