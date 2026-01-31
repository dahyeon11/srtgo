package com.korail.talk.network.dao.reservationWait;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.certification.ReservationResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RsvWaitDao extends BaseDao {

    public class RsvWaitRequest extends BaseRequest {
        private ReservationResponse mReservationResponse;
        private String txtCpNo;
        private String txtPnrNo;
        private String txtPsrmClChgFlg;
        private String txtSmsSndFlg;

        public RsvWaitRequest() {
        }

        public ReservationResponse getReservationResponse() {
            return this.mReservationResponse;
        }

        public String getTxtCpNo() {
            return this.txtCpNo;
        }

        public String getTxtPnrNo() {
            return this.txtPnrNo;
        }

        public String getTxtPsrmClChgFlg() {
            return this.txtPsrmClChgFlg;
        }

        public String getTxtSmsSndFlg() {
            return this.txtSmsSndFlg;
        }

        public void setReservationResponse(ReservationResponse reservationResponse) {
            this.mReservationResponse = reservationResponse;
        }

        public void setTxtCpNo(String str) {
            this.txtCpNo = str;
        }

        public void setTxtPnrNo(String str) {
            this.txtPnrNo = str;
        }

        public void setTxtPsrmClChgFlg(String str) {
            this.txtPsrmClChgFlg = str;
        }

        public void setTxtSmsSndFlg(String str) {
            this.txtSmsSndFlg = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationWaitService reservationWaitService = (ReservationWaitService) getService(ReservationWaitService.class);
        RsvWaitRequest rsvWaitRequest = (RsvWaitRequest) getRequest();
        return reservationWaitService.rsvWait(rsvWaitRequest.getDevice(), rsvWaitRequest.getVersion(), rsvWaitRequest.getKey(), rsvWaitRequest.getTxtPnrNo(), rsvWaitRequest.getTxtPsrmClChgFlg(), rsvWaitRequest.getTxtSmsSndFlg(), rsvWaitRequest.getTxtCpNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_rsv_wait;
    }
}
