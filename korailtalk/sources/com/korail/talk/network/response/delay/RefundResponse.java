package com.korail.talk.network.response.delay;

import com.korail.talk.network.BaseResponse;
import g5.e;
import java.util.List;
import z4.N;

/* loaded from: classes.dex */
public class RefundResponse extends BaseResponse {
    private List<TicketList> ticketList;
    private int whlPgNum;

    public class StlList {
        public String stlMnsCd;

        public StlList() {
        }

        public String getStlMnsCd() {
            return this.stlMnsCd;
        }
    }

    public class TicketList {
        private String arvDt;
        private String arvRsStnNm;
        private int dlayFare;
        private String dptRsStnNm;
        private String jrnyOrdr;
        private String jrnyStpTkFlg;
        private String jrnyTpCd;
        private int rcVdAmt;
        private int rcvdAmt;
        private String refundAmount;
        private String refundInfo;
        private String refundJrny;
        private String saleDd;
        private String saleSqNo;
        private String saleWctNo;
        private List<StlList> stlList;
        private String stlbTrnClsfNm;
        private String tkRetPwd;
        private int trnNo;
        private int trnRunStpCpstAmt;
        private String trnStpRsStnCd;
        private String trnStpRsStnCdNm;

        public TicketList() {
        }

        public String getArvDt() {
            return this.arvDt;
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public int getDlayFare() {
            return this.dlayFare;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getJrnyOrdr() {
            return this.jrnyOrdr;
        }

        public String getJrnyStpTkFlg() {
            return this.jrnyStpTkFlg;
        }

        public String getJrnyTpCd() {
            return this.jrnyTpCd;
        }

        public int getRcVdAmt() {
            return this.rcVdAmt;
        }

        public int getRcvdAmt() {
            return this.rcvdAmt;
        }

        public String getRefundAmount() {
            return this.refundAmount;
        }

        public String getRefundInfo() {
            return this.refundInfo;
        }

        public String getRefundJrny() {
            return this.refundJrny;
        }

        public String getReturnNo() {
            return getSaleWctNo() + e.STATE_NAME_NONE + getSaleDd() + e.STATE_NAME_NONE + N.getInteger(getSaleSqNo()) + e.STATE_NAME_NONE + getTkRetPwd();
        }

        public String getSaleDd() {
            return this.saleDd;
        }

        public String getSaleSqNo() {
            return this.saleSqNo;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public List<StlList> getStlList() {
            return this.stlList;
        }

        public String getStlbTrnClsfNm() {
            return this.stlbTrnClsfNm;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }

        public int getTrnNo() {
            return this.trnNo;
        }

        public int getTrnRunStpCpstAmt() {
            return this.trnRunStpCpstAmt;
        }

        public String getTrnStpRsStnCd() {
            return this.trnStpRsStnCd;
        }

        public String getTrnStpRsStnCdNm() {
            return this.trnStpRsStnCdNm;
        }

        public void setRefundAmount(String str) {
            this.refundAmount = str;
        }

        public void setRefundInfo(String str) {
            this.refundInfo = str;
        }

        public void setRefundJrny(String str) {
            this.refundJrny = str;
        }
    }

    public List<TicketList> getTicketList() {
        return this.ticketList;
    }

    public int getWhlPgNum() {
        return this.whlPgNum;
    }
}
