package com.korail.talk.data.reservation;

import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.request.payment.IPaymentRequest;
import java.io.Serializable;
import java.util.List;
import r4.i;
import r4.k;

/* loaded from: classes.dex */
public class BReservationData implements Serializable {
    private IPaymentRequest mIPaymentRequest;
    private i mPaymentType;
    private List<ReservationMessageData> mReservationMessageDataList;
    private k mReservationType;
    private TCReservationDao.TCReservationRequest mTcReservationRequest;

    public IPaymentRequest getPaymentRequest() {
        return this.mIPaymentRequest;
    }

    public i getPaymentType() {
        return this.mPaymentType;
    }

    public List<ReservationMessageData> getReservationMessageDataList() {
        return this.mReservationMessageDataList;
    }

    public k getReservationType() {
        return this.mReservationType;
    }

    public TCReservationDao.TCReservationRequest getTcReservationRequest() {
        return this.mTcReservationRequest;
    }

    public void setPaymentRequest(IPaymentRequest iPaymentRequest) {
        this.mIPaymentRequest = iPaymentRequest;
    }

    public void setPaymentType(i iVar) {
        this.mPaymentType = iVar;
    }

    public void setReservationMessageDataList(List<ReservationMessageData> list) {
        this.mReservationMessageDataList = list;
    }

    public void setReservationType(k kVar) {
        this.mReservationType = kVar;
    }

    public void setTcReservationRequest(TCReservationDao.TCReservationRequest tCReservationRequest) {
        this.mTcReservationRequest = tCReservationRequest;
    }
}
