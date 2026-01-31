package com.korail.talk.network.dao.schedule;

import com.korail.talk.network.dao.schedule.TrainCalendarDao;
import retrofit.http.GET;

/* loaded from: classes.dex */
public interface CalendarService {
    @GET("/classes/com.korail.mobile.schedule.runDt")
    TrainCalendarDao.TrainCalendarResponse getTrainCalendar();
}
