package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SelfCheckinPossibleDao extends BaseDao {

    public class ConsList {
        private String arvDttm;
        private String arvRsStnCd;
        private String arvStnConsOrdr;
        private String asgnSqno;
        private String cpsNo;
        private String dptDttm;
        private String dptRsStnCd;
        private String dptStnConsOrdr;
        private String jrnySqno;
        private String pnrNo;
        private String runDt;
        private String scarNo;
        private String seatNo;
        private String tkKndCd;
        private String trnGpCd;
        private String trnNo;

        public ConsList() {
        }

        public String getArvDttm() {
            return this.arvDttm;
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getArvStnConsOrdr() {
            return this.arvStnConsOrdr;
        }

        public String getAsgnSqno() {
            return this.asgnSqno;
        }

        public String getCpsNo() {
            return this.cpsNo;
        }

        public String getDptDttm() {
            return this.dptDttm;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getDptStnConsOrdr() {
            return this.dptStnConsOrdr;
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

        public String getTkKndCd() {
            return this.tkKndCd;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }
    }

    public class SelfCheckinPossibleRequest extends BaseRequest {
        private String jrnySqno;
        private String qrcode;
        private String saleDd;
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

        public String getSaleDd() {
            return this.saleDd;
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

        public void setSaleDd(String str) {
            this.saleDd = str;
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

    public class SelfCheckinPossibleResponse extends BaseResponse {
        private List<ConsList> consList;

        public SelfCheckinPossibleResponse() {
        }

        public List<ConsList> getConsList() {
            return this.consList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        SelfCheckinPossibleRequest selfCheckinPossibleRequest = (SelfCheckinPossibleRequest) getRequest();
        return ticketService.selfCheckinPossible(selfCheckinPossibleRequest.getDevice(), selfCheckinPossibleRequest.getVersion(), selfCheckinPossibleRequest.getKey(), selfCheckinPossibleRequest.getQrcode(), selfCheckinPossibleRequest.getSaleWctNo(), selfCheckinPossibleRequest.getSaleDd(), selfCheckinPossibleRequest.getSaleSqno(), selfCheckinPossibleRequest.getTkRetPwd(), selfCheckinPossibleRequest.getJrnySqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_self_checkin_possible;
    }
}
