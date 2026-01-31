package com.korail.talk.network.dao.reservationCancel;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.certification.ReservationResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RsvCancelDao extends BaseDao {

    public class RsvCancelRequest extends BaseRequest {
        private String hidRsvChgNo;
        private ReservationResponse mReservationResponse;
        private String txtJrnyCnt;
        private String txtJrnySqno;
        private String txtPnrNo;

        public RsvCancelRequest() {
        }

        public String getHidRsvChgNo() {
            return this.hidRsvChgNo;
        }

        public ReservationResponse getReservationResponse() {
            return this.mReservationResponse;
        }

        public String getTxtJrnyCnt() {
            return this.txtJrnyCnt;
        }

        public String getTxtJrnySqno() {
            return this.txtJrnySqno;
        }

        public String getTxtPnrNo() {
            return this.txtPnrNo;
        }

        public void setHidRsvChgNo(String str) {
            this.hidRsvChgNo = str;
        }

        public void setReservationResponse(ReservationResponse reservationResponse) {
            this.mReservationResponse = reservationResponse;
        }

        public void setTxtJrnyCnt(String str) {
            this.txtJrnyCnt = str;
        }

        public void setTxtJrnySqno(String str) {
            this.txtJrnySqno = str;
        }

        public void setTxtPnrNo(String str) {
            this.txtPnrNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationCancelService reservationCancelService = (ReservationCancelService) getService(ReservationCancelService.class);
        RsvCancelRequest rsvCancelRequest = (RsvCancelRequest) getRequest();
        return reservationCancelService.reservationCancel(rsvCancelRequest.getDevice(), rsvCancelRequest.getVersion(), rsvCancelRequest.getKey(), rsvCancelRequest.getTxtPnrNo(), rsvCancelRequest.getTxtJrnySqno(), rsvCancelRequest.getTxtJrnyCnt(), rsvCancelRequest.getHidRsvChgNo());
    }

    public int getId() {
        return AbstractC5955f.dao_rsv_cancel;
    }
}
