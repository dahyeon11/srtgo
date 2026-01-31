package com.korail.talk.data.reservation;

import com.korail.talk.network.response.certification.ReservationResponse;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class DReservationData extends BReservationData implements Serializable {
    private boolean mIsLinkageReservation;
    private List<ReservationResponse> mReservationResponseList;

    public List<ReservationResponse> getReservationResponseList() {
        return this.mReservationResponseList;
    }

    public boolean isLinkageReservation() {
        return this.mIsLinkageReservation;
    }

    public void setLinkageReservation(boolean z8) {
        this.mIsLinkageReservation = z8;
    }

    public void setReservationResponseList(List<ReservationResponse> list) {
        this.mReservationResponseList = list;
    }
}
