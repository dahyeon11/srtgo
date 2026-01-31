package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CashRfnDao extends BaseDao {

    /* renamed from: A */
    public static final String f27550A = "A";

    /* renamed from: B */
    public static final String f27551B = "B";

    /* renamed from: I */
    public static final String f27552I = "I";

    public class CashRfnRequest extends BaseRequest {
        private String custNm;
        private String custTeln;
        private String dmnPrsDvCd;
        private String dptnAcntNo;
        private String dptnBankCd;
        private String rmk1Cont;
        private String saleDd;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public CashRfnRequest() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getCustTeln() {
            return this.custTeln;
        }

        public String getDmnPrsDvCd() {
            return this.dmnPrsDvCd;
        }

        public String getDptnAcntNo() {
            return this.dptnAcntNo;
        }

        public String getDptnBankCd() {
            return this.dptnBankCd;
        }

        public String getRmk1Cont() {
            return this.rmk1Cont;
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

        public void setCustNm(String str) {
            this.custNm = str;
        }

        public void setCustTeln(String str) {
            this.custTeln = str;
        }

        public void setDmnPrsDvCd(String str) {
            this.dmnPrsDvCd = str;
        }

        public void setDptnAcntNo(String str) {
            this.dptnAcntNo = str;
        }

        public void setDptnBankCd(String str) {
            this.dptnBankCd = str;
        }

        public void setRmk1Cont(String str) {
            this.rmk1Cont = str;
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

    public class CashRfnResponse extends BaseResponse {
        private String rfnAmt;

        public CashRfnResponse() {
        }

        public String getRfnAmt() {
            return this.rfnAmt;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        CashRfnRequest cashRfnRequest = (CashRfnRequest) getRequest();
        return delayService.cashRfn(cashRfnRequest.getDevice(), cashRfnRequest.getVersion(), cashRfnRequest.getKey(), cashRfnRequest.getDmnPrsDvCd(), cashRfnRequest.getSaleWctNo(), cashRfnRequest.getSaleDd(), cashRfnRequest.getSaleSqno(), cashRfnRequest.getTkRetPwd(), cashRfnRequest.getDptnBankCd(), cashRfnRequest.getDptnAcntNo(), cashRfnRequest.getCustNm(), cashRfnRequest.getCustTeln(), cashRfnRequest.getRmk1Cont());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cash_rfn;
    }
}
