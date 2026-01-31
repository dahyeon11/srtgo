package com.korail.talk.network.dao.reservationCancel;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RsvCancelCheckDao extends BaseDao {

    public class RsvCancelCheckRequest extends BaseRequest {
        private String hidRsvChgNo;
        private String txtJrnyCnt;
        private String txtJrnySqno;
        private String txtPnrNo;

        public RsvCancelCheckRequest() {
        }

        public String getHidRsvChgNo() {
            return this.hidRsvChgNo;
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
        RsvCancelCheckRequest rsvCancelCheckRequest = (RsvCancelCheckRequest) getRequest();
        return reservationCancelService.reservationCancelCheck(rsvCancelCheckRequest.getDevice(), rsvCancelCheckRequest.getVersion(), rsvCancelCheckRequest.getKey(), rsvCancelCheckRequest.getTxtPnrNo(), rsvCancelCheckRequest.getTxtJrnySqno(), rsvCancelCheckRequest.getTxtJrnyCnt(), rsvCancelCheckRequest.getHidRsvChgNo());
    }

    public int getId() {
        return AbstractC5955f.dao_rsv_cancel_check;
    }
}
