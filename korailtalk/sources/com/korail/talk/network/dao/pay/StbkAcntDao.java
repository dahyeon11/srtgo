package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class StbkAcntDao extends BaseDao {
    public static final String ACCOUNT_NAME_CHECK = "1";
    public static final String ACCOUNT_REGISTER = "4";
    public static final String ARS_CERTIFICATION = "2";
    public static final String ARS_RESULT_CONFIRM = "3";
    public static final String CHANGE_PASSWORD = "5";
    public static final String DELETE_ACCOUNT = "9";

    public class StbkAcntRequest extends BaseRequest {
        public String acntNo;
        public String custCpNo;
        public String jobDvCd;
        public String stbkTxnNo;
        public String stlApvPwd;
        public String stlBankCd;

        public StbkAcntRequest() {
        }

        public String getAcntNo() {
            return this.acntNo;
        }

        public String getCustCpNo() {
            return this.custCpNo;
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public String getStbkTxnNo() {
            return this.stbkTxnNo;
        }

        public String getStlApvPwd() {
            return this.stlApvPwd;
        }

        public String getStlBankCd() {
            return this.stlBankCd;
        }

        public void setAcntNo(String str) {
            this.acntNo = str;
        }

        public void setCustCpNo(String str) {
            this.custCpNo = str;
        }

        public void setJobDvCd(String str) {
            this.jobDvCd = str;
        }

        public void setStbkTxnNo(String str) {
            this.stbkTxnNo = str;
        }

        public void setStlApvPwd(String str) {
            this.stlApvPwd = str;
        }

        public void setStlBankCd(String str) {
            this.stlBankCd = str;
        }
    }

    public class StbkAcntResponse extends BaseResponse {
        public String custNm;
        public String stbkTxnNo;

        public StbkAcntResponse() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getStbkTxnNo() {
            return this.stbkTxnNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        StbkAcntRequest stbkAcntRequest = (StbkAcntRequest) getRequest();
        return payService.stbkAcnt(stbkAcntRequest.getDevice(), stbkAcntRequest.getVersion(), stbkAcntRequest.getKey(), stbkAcntRequest.getStlBankCd(), stbkAcntRequest.getJobDvCd(), stbkAcntRequest.getAcntNo(), stbkAcntRequest.getCustCpNo(), stbkAcntRequest.getStbkTxnNo(), stbkAcntRequest.getStlApvPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_stbk_acnt;
    }
}
