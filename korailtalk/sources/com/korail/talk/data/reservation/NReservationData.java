package com.korail.talk.data.reservation;

import com.korail.talk.network.dao.research.NCardReservationDao;
import java.io.Serializable;

/* loaded from: classes.dex */
public class NReservationData extends BReservationData implements Serializable {
    private NCardReservationDao.NCardReservationResponse mNCardReservationResponse;

    public NCardReservationDao.NCardReservationResponse getNCardReservationResponse() {
        return this.mNCardReservationResponse;
    }

    public void setNCardReservationResponse(NCardReservationDao.NCardReservationResponse nCardReservationResponse) {
        this.mNCardReservationResponse = nCardReservationResponse;
    }
}
