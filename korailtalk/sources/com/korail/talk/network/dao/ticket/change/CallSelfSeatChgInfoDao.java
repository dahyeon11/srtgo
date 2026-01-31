package com.korail.talk.network.dao.ticket.change;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.ticket.TicketService;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CallSelfSeatChgInfoDao extends BaseDao {

    public class CallSelfSeatChgInfoDaoRequest extends BaseRequest {
        private String arvRsStnCd;
        private String dptRsStnCd;
        private String psrmClCd;
        private String runDt;
        private String trnNo;

        public CallSelfSeatChgInfoDaoRequest() {
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setArvRsStnCd(String str) {
            this.arvRsStnCd = str;
        }

        public void setDptRsStnCd(String str) {
            this.dptRsStnCd = str;
        }

        public void setPsrmClCd(String str) {
            this.psrmClCd = str;
        }

        public void setRunDt(String str) {
            this.runDt = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class CallSelfSeatChgInfoResponse extends BaseResponse implements Serializable {
        private String chgBfArvStnConsOrdr;
        private String chgBfDptStnConsOrdr;
        private List<ChgRsnList> chgRsnList;
        private List<ChgStnList> chgStnList;
        private String exsArvStnRunOrdr;
        private String exsDptStnRunOrdr;
        private String gnrmRsvPsbCd;
        private String runDt;
        private String sprmRsvPsbCd;
        private String trnClsfCd;
        private String trnClsfNm;
        private String trnGpCd;
        private String trnGpNm;
        private String trnNo;

        public CallSelfSeatChgInfoResponse() {
        }

        public String getChgBfArvStnConsOrdr() {
            return this.chgBfArvStnConsOrdr;
        }

        public String getChgBfDptStnConsOrdr() {
            return this.chgBfDptStnConsOrdr;
        }

        public List<ChgRsnList> getChgRsnList() {
            return this.chgRsnList;
        }

        public List<ChgStnList> getChgStnList() {
            return this.chgStnList;
        }

        public String getExsArvStnRunOrdr() {
            return this.exsArvStnRunOrdr;
        }

        public String getExsDptStnRunOrdr() {
            return this.exsDptStnRunOrdr;
        }

        public String getGnrmRsvPsbCd() {
            return this.gnrmRsvPsbCd;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getSprmRsvPsbCd() {
            return this.sprmRsvPsbCd;
        }

        public String getTrnClsfCd() {
            return this.trnClsfCd;
        }

        public String getTrnClsfNm() {
            return this.trnClsfNm;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnGpNm() {
            return this.trnGpNm;
        }

        public String getTrnNo() {
            return this.trnNo;
        }
    }

    public class ChgRsnList {
        private String frcSaleRsnCont;
        private String qryCode;
        private String qryOrdr;

        public ChgRsnList() {
        }

        public String getFrcSaleRsnCont() {
            return this.frcSaleRsnCont;
        }

        public String getQryCode() {
            return this.qryCode;
        }

        public String getQryOrdr() {
            return this.qryOrdr;
        }
    }

    public class ChgStnList {
        private String arvDt;
        private String arvTm;
        private String dptDt;
        private String dptRsStnCd;
        private String dptRsStnNm;
        private String dptStnConsOrdr;
        private String dptStnRunOrdr;
        private String dptTm;
        private String gnrmRestSeatNum;
        private String sprmRestSeatNum;

        public ChgStnList() {
        }

        public String getArvDt() {
            return this.arvDt;
        }

        public String getArvTm() {
            return this.arvTm;
        }

        public String getDptDt() {
            return this.dptDt;
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

        public String getDptStnRunOrdr() {
            return this.dptStnRunOrdr;
        }

        public String getDptTm() {
            return this.dptTm;
        }

        public String getGnrmRestSeatNum() {
            return this.gnrmRestSeatNum;
        }

        public String getSprmRestSeatNum() {
            return this.sprmRestSeatNum;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        CallSelfSeatChgInfoDaoRequest callSelfSeatChgInfoDaoRequest = (CallSelfSeatChgInfoDaoRequest) getRequest();
        return ticketService.getSelfSeatChgInfo(callSelfSeatChgInfoDaoRequest.getDevice(), callSelfSeatChgInfoDaoRequest.getVersion(), callSelfSeatChgInfoDaoRequest.getKey(), callSelfSeatChgInfoDaoRequest.getRunDt(), callSelfSeatChgInfoDaoRequest.getTrnNo(), callSelfSeatChgInfoDaoRequest.getDptRsStnCd(), callSelfSeatChgInfoDaoRequest.getArvRsStnCd(), callSelfSeatChgInfoDaoRequest.getPsrmClCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_self_seat_chg_info;
    }
}
