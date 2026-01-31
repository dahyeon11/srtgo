package com.korail.talk.network.dao.reservation;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.data.reservation.RDscp;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import java.io.Serializable;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TCReservationDao extends BaseDao implements Serializable {

    public class TCReservationRequest extends BaseRequest implements Serializable {
        private String alcSeatDmnPsDvCd;
        private String ctlDvCd;
        private String frcSaleRsnCont;
        private String intgTktIseFlg;
        private String isePrnb;
        private String jrny2Cnt;
        private String prcFareReCalcFlg;
        private String psg2Cnt;
        private String stndSeatFlg;
        private String tmpJobSqno;
        private String totPrnb;
        private String trvlKndCd;
        private RJrny rJrny = new RJrny();
        private RSrcar rSrcar = new RSrcar();
        private RSeat rSeat = new RSeat();
        private RPsg rPsg = new RPsg();
        private ROrtg rOrtg = new ROrtg();
        private RDscp orgRDcp = new RDscp();
        private RDscp rDscp = new RDscp();

        public TCReservationRequest() {
        }

        public String getAlcSeatDmnPsDvCd() {
            return this.alcSeatDmnPsDvCd;
        }

        public String getCtlDvCd() {
            return this.ctlDvCd;
        }

        public String getFrcSaleRsnCont() {
            return this.frcSaleRsnCont;
        }

        public String getIntgTktIseFlg() {
            return this.intgTktIseFlg;
        }

        public String getIsePrnb() {
            return this.isePrnb;
        }

        public String getJrny2Cnt() {
            return this.jrny2Cnt;
        }

        public RDscp getOrgRDscp() {
            return this.orgRDcp;
        }

        public String getPrcFareReCalcFlg() {
            return this.prcFareReCalcFlg;
        }

        public String getPsg2Cnt() {
            return this.psg2Cnt;
        }

        public RDscp getRDscp() {
            return this.rDscp;
        }

        public RJrny getRJrny() {
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

        public RSrcar getRSrcar() {
            return this.rSrcar;
        }

        public String getStndSeatFlg() {
            return this.stndSeatFlg;
        }

        public String getTmpJobSqno() {
            return this.tmpJobSqno;
        }

        public String getTotPrnb() {
            return this.totPrnb;
        }

        public String getTrvlKndCd() {
            return this.trvlKndCd;
        }

        public void setAlcSeatDmnPsDvCd(String str) {
            this.alcSeatDmnPsDvCd = str;
        }

        public void setCtlDvCd(String str) {
            this.ctlDvCd = str;
        }

        public void setFrcSaleRsnCont(String str) {
            this.frcSaleRsnCont = str;
        }

        public void setIntgTktIseFlg(String str) {
            this.intgTktIseFlg = str;
        }

        public void setIsePrnb(String str) {
            this.isePrnb = str;
        }

        public void setJrny2Cnt(String str) {
            this.jrny2Cnt = str;
        }

        public void setOrgRDscp(RDscp rDscp) {
            this.orgRDcp = rDscp;
        }

        public void setPrcFareReCalcFlg(String str) {
            this.prcFareReCalcFlg = str;
        }

        public void setPsg2Cnt(String str) {
            this.psg2Cnt = str;
        }

        public void setRDscp(RDscp rDscp) {
            this.rDscp = rDscp;
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

        public void setStndSeatFlg(String str) {
            this.stndSeatFlg = str;
        }

        public void setTmpJobSqno(String str) {
            this.tmpJobSqno = str;
        }

        public void setTotPrnb(String str) {
            this.totPrnb = str;
        }

        public void setTrvlKndCd(String str) {
            this.trvlKndCd = str;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public TCReservationRequest m404clone() {
            TCReservationRequest tCReservationRequest = TCReservationDao.this.new TCReservationRequest();
            tCReservationRequest.setTrvlKndCd(getTrvlKndCd());
            tCReservationRequest.setTotPrnb(getTotPrnb());
            tCReservationRequest.setIsePrnb(getIsePrnb());
            tCReservationRequest.setStndSeatFlg(getStndSeatFlg());
            tCReservationRequest.setIntgTktIseFlg(getIntgTktIseFlg());
            tCReservationRequest.setPrcFareReCalcFlg(getPrcFareReCalcFlg());
            tCReservationRequest.setTmpJobSqno(getTmpJobSqno());
            tCReservationRequest.setAlcSeatDmnPsDvCd(getAlcSeatDmnPsDvCd());
            tCReservationRequest.setJrny2Cnt(getJrny2Cnt());
            tCReservationRequest.setPsg2Cnt(getPsg2Cnt());
            tCReservationRequest.setRJrny((RJrny) getRJrny().clone());
            tCReservationRequest.setRSrcar((RSrcar) getRSrcar().clone());
            tCReservationRequest.setRSeat((RSeat) getRSeat().clone());
            tCReservationRequest.setRPsg((RPsg) getRPsg().clone());
            tCReservationRequest.setROrtg((ROrtg) getROrtg().clone());
            tCReservationRequest.setOrgRDscp((RDscp) getOrgRDscp().clone());
            tCReservationRequest.setRDscp((RDscp) getRDscp().clone());
            return tCReservationRequest;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationService reservationService = (ReservationService) getService(ReservationService.class);
        TCReservationRequest tCReservationRequest = (TCReservationRequest) getRequest();
        return reservationService.getTicketChangeReservation(tCReservationRequest.getDevice(), tCReservationRequest.getVersion(), tCReservationRequest.getKey(), tCReservationRequest.getTrvlKndCd(), tCReservationRequest.getTotPrnb(), tCReservationRequest.getIsePrnb(), tCReservationRequest.getStndSeatFlg(), tCReservationRequest.getIntgTktIseFlg(), tCReservationRequest.getPrcFareReCalcFlg(), tCReservationRequest.getTmpJobSqno(), tCReservationRequest.getAlcSeatDmnPsDvCd(), tCReservationRequest.getJrny2Cnt(), tCReservationRequest.getPsg2Cnt(), tCReservationRequest.getCtlDvCd(), tCReservationRequest.getFrcSaleRsnCont(), tCReservationRequest.getRJrny(), tCReservationRequest.getRSrcar(), tCReservationRequest.getRSeat(), tCReservationRequest.getRPsg(), tCReservationRequest.getROrtg(), tCReservationRequest.getRDscp());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_tc_reservation;
    }
}
