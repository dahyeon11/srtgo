package com.korail.talk.data.reservation;

import com.korail.talk.network.dao.pass.CommReservationDao;

/* loaded from: classes.dex */
public class CReservationData extends BReservationData {
    private CommReservationDao.CommReservationResponse.MainInfo mMainInfo;

    public CommReservationDao.CommReservationResponse.MainInfo getMainInfo() {
        return this.mMainInfo;
    }

    public void setMainInfo(CommReservationDao.CommReservationResponse.MainInfo mainInfo) {
        this.mMainInfo = mainInfo;
    }
}
