package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.reservation.ReservationRequest;
import java.io.Serializable;
import java.util.HashMap;
import z4.N;

/* loaded from: classes.dex */
public class BixbyReservationDao extends ReservationDao implements Serializable {

    public class BixbyReservationRequest extends ReservationRequest {
        public HashMap<String, String> data;

        public BixbyReservationRequest() {
        }

        public HashMap<String, String> getData() {
            return this.data;
        }

        public void setData(HashMap<String, String> map) {
            this.data = map;
        }
    }

    @Override // com.korail.talk.network.dao.certification.ReservationDao, com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        BixbyReservationRequest bixbyReservationRequest = (BixbyReservationRequest) getRequest();
        String custNm = bixbyReservationRequest.getCustNm();
        String cpNo = bixbyReservationRequest.getCpNo();
        String custPw = bixbyReservationRequest.getCustPw();
        return (N.isNotNull(custNm) && N.isNotNull(cpNo) && N.isNotNull(custPw)) ? certificationService.reservation(bixbyReservationRequest.getDevice(), bixbyReservationRequest.getVersion(), bixbyReservationRequest.getKey(), custNm, cpNo, custPw, bixbyReservationRequest.getData()) : certificationService.reservation(bixbyReservationRequest.getDevice(), bixbyReservationRequest.getVersion(), bixbyReservationRequest.getKey(), bixbyReservationRequest.getData());
    }
}
