package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.reservation.ReservationRequest;
import java.io.Serializable;
import n4.AbstractC5955f;
import z4.N;

/* loaded from: classes.dex */
public class ReservationDao extends BaseDao implements Serializable {
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        ReservationRequest reservationRequest = (ReservationRequest) getRequest();
        String custNm = reservationRequest.getCustNm();
        String cpNo = reservationRequest.getCpNo();
        String custPw = reservationRequest.getCustPw();
        return (N.isNotNull(custNm) && N.isNotNull(cpNo) && N.isNotNull(custPw)) ? certificationService.reservation(reservationRequest.getDevice(), reservationRequest.getVersion(), reservationRequest.getKey(), reservationRequest.getPnrNo(), reservationRequest.getMenuId(), reservationRequest.getJobId(), reservationRequest.getGdNo(), reservationRequest.getHidFreeFlg(), reservationRequest.getStndFlg(), custNm, cpNo, custPw, reservationRequest.getOPsg(), reservationRequest.getOSeat(), reservationRequest.getOJrny(), reservationRequest.getOSrcar()) : certificationService.reservation(reservationRequest.getDevice(), reservationRequest.getVersion(), reservationRequest.getKey(), reservationRequest.getPnrNo(), reservationRequest.getMenuId(), reservationRequest.getJobId(), reservationRequest.getGdNo(), reservationRequest.getHidFreeFlg(), reservationRequest.getStndFlg(), reservationRequest.getPbepInfo(), reservationRequest.getOPsg(), reservationRequest.getOSeat(), reservationRequest.getOJrny(), reservationRequest.getOSrcar());
    }

    public int getId() {
        return AbstractC5955f.dao_reservation;
    }
}
