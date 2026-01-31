package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PbpAcepSpecDao extends BaseDao {

    public class Jrny {
        private String acepCustNm;
        private String acepCustTeln;
        private String jrnyTpCd;
        private String mbDvNm;
        private String pbpAcepKndNm;
        private String pbpRsvNo;
        private String regDt;
        private List<Seat> seatList;
        private String wdrwPsbFlg;

        public Jrny() {
        }

        public String getAcepCustNm() {
            return this.acepCustNm;
        }

        public String getAcepCustTeln() {
            return this.acepCustTeln;
        }

        public String getJrnyTpCd() {
            return this.jrnyTpCd;
        }

        public String getMbDvNm() {
            return this.mbDvNm;
        }

        public String getPbpAcepKndNm() {
            return this.pbpAcepKndNm;
        }

        public String getPbpRsvNo() {
            return this.pbpRsvNo;
        }

        public String getRegDt() {
            return this.regDt;
        }

        public List<Seat> getSeatList() {
            return this.seatList;
        }

        public String getWdrwPsbFlg() {
            return this.wdrwPsbFlg;
        }
    }

    public class PbpAcepSpecRequest extends BaseRequest {
        int tkCnt;
        List<String> tkRetNoList;

        public PbpAcepSpecRequest() {
        }

        public int getTkCnt() {
            return this.tkCnt;
        }

        public List<String> getTkRetNoList() {
            return this.tkRetNoList;
        }

        public void setTkCnt(int i8) {
            this.tkCnt = i8;
        }

        public void setTkRetNoList(List<String> list) {
            this.tkRetNoList = list;
        }
    }

    public class PbpAcepSpecResponse extends BaseResponse {
        private List<Tk> tkList;

        public PbpAcepSpecResponse() {
        }

        public List<Tk> getTkList() {
            return this.tkList;
        }
    }

    public class Seat {
        private String psgTpDvNm;
        private String psrmClCd;
        private String psrmClNm;
        private int scarNo;
        private String seatNo;

        public Seat() {
        }

        public String getPsgTpDvNm() {
            return this.psgTpDvNm;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getPsrmClNm() {
            return this.psrmClNm;
        }

        public int getScarNo() {
            return this.scarNo;
        }

        public String getSeatNo() {
            return this.seatNo;
        }
    }

    public class Tk {
        private List<Jrny> jrnyList;
        private String pnrNo;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public Tk() {
        }

        public List<Jrny> getJrnyList() {
            return this.jrnyList;
        }

        public String getPnrNo() {
            return this.pnrNo;
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
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        PbpAcepSpecRequest pbpAcepSpecRequest = (PbpAcepSpecRequest) getRequest();
        return ticketService.pbpAcepSpec(pbpAcepSpecRequest.getDevice(), pbpAcepSpecRequest.getVersion(), pbpAcepSpecRequest.getKey(), pbpAcepSpecRequest.getTkCnt(), pbpAcepSpecRequest.getTkRetNoList());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_pbp_acep_spec;
    }
}
