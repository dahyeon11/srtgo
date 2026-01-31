package com.korail.talk.network.dao.reservation;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class GuideSeatCndDao extends BaseDao {

    public class GudieSeatCndRequest extends BaseRequest {
        private String rqSeatAttCd;

        public GudieSeatCndRequest() {
        }

        public String getRqSeatAttCd() {
            return this.rqSeatAttCd;
        }

        public void setRqSeatAttCd(String str) {
            this.rqSeatAttCd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationService reservationService = (ReservationService) getService(ReservationService.class);
        GudieSeatCndRequest gudieSeatCndRequest = (GudieSeatCndRequest) getRequest();
        return reservationService.getGuideSeatCnd(gudieSeatCndRequest.getDevice(), gudieSeatCndRequest.getVersion(), gudieSeatCndRequest.getKey(), gudieSeatCndRequest.getRqSeatAttCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_guide_seat_cnd;
    }
}
