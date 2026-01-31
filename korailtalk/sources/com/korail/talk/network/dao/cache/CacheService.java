package com.korail.talk.network.dao.cache;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.cache.AppDataDao;
import com.korail.talk.network.dao.cache.NoticeDao;
import retrofit.http.GET;
import retrofit.http.Query;

/* loaded from: classes.dex */
public interface CacheService {
    @GET("/file/CACHE/MobileService.cache")
    BaseResponse checkService(@Query("timeStamp") long j8);

    @GET("/file/CACHE/prdMobilePlusMain.cache")
    AppDataDao.AppDataResponse getAppData(@Query("timeStamp") long j8);

    @GET("/file/CACHE/prdMobilePlusNotice.cache")
    NoticeDao.NoticeResponse getNotice(@Query("timeStamp") long j8);
}
