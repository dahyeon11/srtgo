package com.korail.talk.network.dao.reservation;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.io.Serializable;
import java.util.HashMap;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SeatAssignReservationDao extends BaseDao implements Serializable {

    public class SeatAssignReservationRequest extends BaseRequest implements Serializable {
        private String custMgNo;
        private String menuId;
        private String rqScarNum;
        private String stndFlg;
        private String totPrnb;
        private RJrny rJrny = new RJrny();
        private RSrcar rSrcar = new RSrcar();
        private RSeat rSeat = new RSeat();
        private RPsg rPsg = new RPsg();
        private ROrtg rOrtg = new ROrtg();

        public SeatAssignReservationRequest() {
        }

        public String getCustMgNo() {
            return this.custMgNo;
        }

        public String getMenuId() {
            return this.menuId;
        }

        public HashMap<String, String> getRJrny() {
            return this.rJrny;
        }

        public ROrtg getROrtg() {
            return this.rOrtg;
        }

        public RPsg getRPsg() {
            return this.rPsg;
        }

        public RSeat getRSeat() {
            return this.rSeat;
        }

        public HashMap<String, String> getRSrcar() {
            return this.rSrcar;
        }

        public String getRqScarNum() {
            return this.rqScarNum;
        }

        public String getStndFlg() {
            return this.stndFlg;
        }

        public String getTotPrnb() {
            return this.totPrnb;
        }

        public void setCustMgNo(String str) {
            this.custMgNo = str;
        }

        public void setMenuId(String str) {
            this.menuId = str;
        }

        public void setRJrny(RJrny rJrny) {
            this.rJrny = rJrny;
        }

        public void setROrtg(ROrtg rOrtg) {
            this.rOrtg = rOrtg;
        }

        public void setRPsg(RPsg rPsg) {
            this.rPsg = rPsg;
        }

        public void setRSeat(RSeat rSeat) {
            this.rSeat = rSeat;
        }

        public void setRSrcar(RSrcar rSrcar) {
            this.rSrcar = rSrcar;
        }

        public void setRqScarNum(String str) {
            this.rqScarNum = str;
        }

        public void setStndFlg(String str) {
            this.stndFlg = str;
        }

        public void setTotPrnb(String str) {
            this.totPrnb = str;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SeatAssignReservationRequest m403clone() {
            SeatAssignReservationRequest seatAssignReservationRequest = SeatAssignReservationDao.this.new SeatAssignReservationRequest();
            seatAssignReservationRequest.setMenuId(getMenuId());
            seatAssignReservationRequest.setCustMgNo(getCustMgNo());
            seatAssignReservationRequest.setTotPrnb(getTotPrnb());
            seatAssignReservationRequest.setStndFlg(getStndFlg());
            seatAssignReservationRequest.setRqScarNum(getRqScarNum());
            seatAssignReservationRequest.setRJrny((RJrny) getRJrny().clone());
            seatAssignReservationRequest.setRSrcar((RSrcar) getRSrcar().clone());
            seatAssignReservationRequest.setRSeat((RSeat) getRSeat().clone());
            seatAssignReservationRequest.setRPsg((RPsg) getRPsg().clone());
            seatAssignReservationRequest.setROrtg((ROrtg) getROrtg().clone());
            return seatAssignReservationRequest;
        }
    }

    public class SeatAssignReservationResponse extends ReservationResponse {
        public SeatAssignReservationResponse() {
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationService reservationService = (ReservationService) getService(ReservationService.class);
        SeatAssignReservationRequest seatAssignReservationRequest = (SeatAssignReservationRequest) getRequest();
        return reservationService.setSeatAssignReservation(seatAssignReservationRequest.getDevice(), seatAssignReservationRequest.getVersion(), seatAssignReservationRequest.getKey(), seatAssignReservationRequest.getMenuId(), seatAssignReservationRequest.getCustMgNo(), seatAssignReservationRequest.getTotPrnb(), seatAssignReservationRequest.getStndFlg(), seatAssignReservationRequest.getRqScarNum(), seatAssignReservationRequest.getRJrny(), seatAssignReservationRequest.getRSrcar(), seatAssignReservationRequest.getRSeat(), seatAssignReservationRequest.getRPsg(), seatAssignReservationRequest.getROrtg());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_seat_assign_reservation;
    }
}
