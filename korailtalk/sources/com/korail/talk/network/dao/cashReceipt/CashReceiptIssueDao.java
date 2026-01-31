package com.korail.talk.network.dao.cashReceipt;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.HashMap;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CashReceiptIssueDao extends BaseDao {

    public class CashReceiptIssueRequest extends BaseRequest {
        private int apvCnt;
        private String athnDmnRcgnNo;
        private String cashRcetAthnMtdCd;
        private String cashRcetTxnDvCd;
        private HashMap<String, String> lumpStlTgtNo;
        private String vltIsuFlg;

        public CashReceiptIssueRequest() {
        }

        public int getApvCnt() {
            return this.apvCnt;
        }

        public String getAthnDmnRcgnNo() {
            return this.athnDmnRcgnNo;
        }

        public String getCashRcetAthnMtdCd() {
            return this.cashRcetAthnMtdCd;
        }

        public String getCashRcetTxnDvCd() {
            return this.cashRcetTxnDvCd;
        }

        public HashMap<String, String> getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public String getVltIsuFlg() {
            return this.vltIsuFlg;
        }

        public void setApvCnt(int i8) {
            this.apvCnt = i8;
        }

        public void setAthnDmnRcgnNo(String str) {
            this.athnDmnRcgnNo = str;
        }

        public void setCashRcetAthnMtdCd(String str) {
            this.cashRcetAthnMtdCd = str;
        }

        public void setCashRcetTxnDvCd(String str) {
            this.cashRcetTxnDvCd = str;
        }

        public void setLumpStlTgtNo(HashMap<String, String> map) {
            this.lumpStlTgtNo = map;
        }

        public void setVltIsuFlg(String str) {
            this.vltIsuFlg = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CashReceipt cashReceipt = (CashReceipt) getService(CashReceipt.class);
        CashReceiptIssueRequest cashReceiptIssueRequest = (CashReceiptIssueRequest) getRequest();
        return cashReceipt.issue(cashReceiptIssueRequest.getDevice(), cashReceiptIssueRequest.getVersion(), cashReceiptIssueRequest.getKey(), cashReceiptIssueRequest.getCashRcetTxnDvCd(), cashReceiptIssueRequest.getVltIsuFlg(), cashReceiptIssueRequest.getCashRcetAthnMtdCd(), cashReceiptIssueRequest.getAthnDmnRcgnNo(), cashReceiptIssueRequest.getApvCnt(), cashReceiptIssueRequest.getLumpStlTgtNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cash_receipt_issue;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
