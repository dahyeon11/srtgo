package com.korail.talk.network.dao.reservationCancel;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.data.reservation.RDscp;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ReservationChangeDao extends BaseDao {

    public class JrnyInfo {
        String lumpStlTgtNo;

        public JrnyInfo() {
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }
    }

    public class ReservationChangeRequest extends BaseRequest {
        private String chgTno;
        private String evntWctFlg;
        private String lrgCrgFlg;
        private String pnrNo;
        private String psgCnt;
        private String stndFlg;
        private String totPrnb;
        private String wctHndgCncDvCd;
        private RJrny rJrny = new RJrny();
        private RSrcar rSrcar = new RSrcar();
        private RSeat rSeat = new RSeat();
        private RPsg rPsg = new RPsg();
        private RDscp rDscp = new RDscp();

        public ReservationChangeRequest() {
        }

        public String getChgTno() {
            return this.chgTno;
        }

        public String getEvntWctFlg() {
            return this.evntWctFlg;
        }

        public String getLrgCrgFlg() {
            return this.lrgCrgFlg;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public String getPsgCnt() {
            return this.psgCnt;
        }

        public RDscp getRDscp() {
            return this.rDscp;
        }

        public RJrny getRJrny() {
            return this.rJrny;
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

        public String getStndFlg() {
            return this.stndFlg;
        }

        public String getTotPrnb() {
            return this.totPrnb;
        }

        public String getWctHndgCncDvCd() {
            return this.wctHndgCncDvCd;
        }

        public void setChgTno(String str) {
            this.chgTno = str;
        }

        public void setEvntWctFlg(String str) {
            this.evntWctFlg = str;
        }

        public void setLrgCrgFlg(String str) {
            this.lrgCrgFlg = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setPsgCnt(String str) {
            this.psgCnt = str;
        }

        public void setRDscp(RDscp rDscp) {
            this.rDscp = rDscp;
        }

        public void setRJrny(RJrny rJrny) {
            this.rJrny = rJrny;
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

        public void setStndFlg(String str) {
            this.stndFlg = str;
        }

        public void setTotPrnb(String str) {
            this.totPrnb = str;
        }

        public void setWctHndgCncDvCd(String str) {
            this.wctHndgCncDvCd = str;
        }
    }

    public class ReservationChangeResponse extends BaseResponse {
        private List<JrnyInfo> jrnyList;

        public ReservationChangeResponse() {
        }

        public List<JrnyInfo> getJrnyList() {
            return this.jrnyList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationCancelService reservationCancelService = (ReservationCancelService) getService(ReservationCancelService.class);
        ReservationChangeRequest reservationChangeRequest = (ReservationChangeRequest) getRequest();
        return reservationCancelService.reservationChange(reservationChangeRequest.getDevice(), reservationChangeRequest.getVersion(), reservationChangeRequest.getKey(), reservationChangeRequest.getPnrNo(), reservationChangeRequest.getChgTno(), reservationChangeRequest.getTotPrnb(), reservationChangeRequest.getStndFlg(), reservationChangeRequest.getEvntWctFlg(), reservationChangeRequest.getWctHndgCncDvCd(), reservationChangeRequest.getLrgCrgFlg(), reservationChangeRequest.getPsgCnt(), reservationChangeRequest.getRJrny(), reservationChangeRequest.getRSrcar(), reservationChangeRequest.getRSeat(), reservationChangeRequest.getRPsg(), reservationChangeRequest.getRDscp());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_rsv_change;
    }
}
