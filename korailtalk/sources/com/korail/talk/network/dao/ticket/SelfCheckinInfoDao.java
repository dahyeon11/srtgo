package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SelfCheckinInfoDao extends BaseDao {

    public class SelfCheckinInfoResponse extends BaseResponse {
        private String arvDttm;
        private String arvRsStnCd;
        private String arvRsStnNm;
        private String arvStnConsOrdr;
        private String arvTmQb;
        private String asgnSqno;
        private String chcknCncDt;
        private String chcknCncTm;
        private String chcknDt;
        private String chcknDvCd;
        private String chcknSqno;
        private String chcknTm;
        private String dptDttm;
        private String dptRsStnCd;
        private String dptRsStnNm;
        private String dptStnConsOrdr;
        private String dptTmQb;
        private String jrnySqno;
        private String pnrNo;
        private String runDt;
        private String scarNo;
        private String seatNo;
        private String stlbTrnClsfNm;
        private String trnNo;

        public SelfCheckinInfoResponse() {
        }

        public String getArvDttm() {
            return this.arvDttm;
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getArvStnConsOrdr() {
            return this.arvStnConsOrdr;
        }

        public String getArvTmQb() {
            return this.arvTmQb;
        }

        public String getAsgnSqno() {
            return this.asgnSqno;
        }

        public String getChcknCncDt() {
            return this.chcknCncDt;
        }

        public String getChcknCncTm() {
            return this.chcknCncTm;
        }

        public String getChcknDt() {
            return this.chcknDt;
        }

        public String getChcknDvCd() {
            return this.chcknDvCd;
        }

        public String getChcknSqno() {
            return this.chcknSqno;
        }

        public String getChcknTm() {
            return this.chcknTm;
        }

        public String getDptDttm() {
            return this.dptDttm;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getDptStnConsOrdr() {
            return this.dptStnConsOrdr;
        }

        public String getDptTmQb() {
            return this.dptTmQb;
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getScarNo() {
            return this.scarNo;
        }

        public String getSeatNo() {
            return this.seatNo;
        }

        public String getStlbTrnClsfNm() {
            return this.stlbTrnClsfNm;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setArvDttm(String str) {
            this.arvDttm = str;
        }

        public void setArvRsStnCd(String str) {
            this.arvRsStnCd = str;
        }

        public void setArvRsStnNm(String str) {
            this.arvRsStnNm = str;
        }

        public void setArvStnConsOrdr(String str) {
            this.arvStnConsOrdr = str;
        }

        public void setArvTmQb(String str) {
            this.arvTmQb = str;
        }

        public void setAsgnSqno(String str) {
            this.asgnSqno = str;
        }

        public void setChcknCncDt(String str) {
            this.chcknCncDt = str;
        }

        public void setChcknCncTm(String str) {
            this.chcknCncTm = str;
        }

        public void setChcknDt(String str) {
            this.chcknDt = str;
        }

        public void setChcknDvCd(String str) {
            this.chcknDvCd = str;
        }

        public void setChcknSqno(String str) {
            this.chcknSqno = str;
        }

        public void setChcknTm(String str) {
            this.chcknTm = str;
        }

        public void setDptDttm(String str) {
            this.dptDttm = str;
        }

        public void setDptRsStnCd(String str) {
            this.dptRsStnCd = str;
        }

        public void setDptRsStnNm(String str) {
            this.dptRsStnNm = str;
        }

        public void setDptStnConsOrdr(String str) {
            this.dptStnConsOrdr = str;
        }

        public void setDptTmQb(String str) {
            this.dptTmQb = str;
        }

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setRunDt(String str) {
            this.runDt = str;
        }

        public void setScarNo(String str) {
            this.scarNo = str;
        }

        public void setSeatNo(String str) {
            this.seatNo = str;
        }

        public void setStlbTrnClsfNm(String str) {
            this.stlbTrnClsfNm = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class SelfCheckinPossibleRequest extends BaseRequest {
        private String jrnySqno;
        private String qrcode;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public SelfCheckinPossibleRequest() {
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getQrcode() {
            return this.qrcode;
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
        }

        public void setQrcode(String str) {
            this.qrcode = str;
        }

        public void setSaleDt(String str) {
            this.saleDt = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }

        public void setTkRetPwd(String str) {
            this.tkRetPwd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        SelfCheckinPossibleRequest selfCheckinPossibleRequest = (SelfCheckinPossibleRequest) getRequest();
        return ticketService.selfCheckinInfo(selfCheckinPossibleRequest.getDevice(), selfCheckinPossibleRequest.getVersion(), selfCheckinPossibleRequest.getKey(), selfCheckinPossibleRequest.getSaleWctNo(), selfCheckinPossibleRequest.getSaleDt(), selfCheckinPossibleRequest.getSaleSqno(), selfCheckinPossibleRequest.getTkRetPwd(), selfCheckinPossibleRequest.getJrnySqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_self_checkin_info;
    }
}
