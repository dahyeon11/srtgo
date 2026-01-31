package com.korail.talk.network.dao.xPoint;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class LPointDao extends BaseDao {

    public class LPointInquiryRequest extends BaseRequest {
        private String custRcgnNoVal;
        private String jobDvCd;
        private String pontPwd;

        public LPointInquiryRequest() {
        }

        public String getCustRcgnNoVal() {
            return this.custRcgnNoVal;
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public String getPontPwd() {
            return this.pontPwd;
        }

        public void setCustRcgnNoVal(String str) {
            this.custRcgnNoVal = str;
        }

        public void setJobDvCd(String str) {
            this.jobDvCd = str;
        }

        public void setPontPwd(String str) {
            this.pontPwd = str;
        }
    }

    public class LPointInquiryResponse extends BaseResponse {
        private String custRcgnNoVal;
        private String extrPontAmt;
        private String prsCnqeVal;
        private String pwdErrTno;

        public LPointInquiryResponse() {
        }

        public String getCustRcgnNoVal() {
            return this.custRcgnNoVal;
        }

        public String getExtrPontAmt() {
            return this.extrPontAmt;
        }

        public String getPrsCnqeVal() {
            return this.prsCnqeVal;
        }

        public String getPwdErrTno() {
            return this.pwdErrTno;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        XPointService xPointService = (XPointService) getService(XPointService.class);
        LPointInquiryRequest lPointInquiryRequest = (LPointInquiryRequest) getRequest();
        return xPointService.getLPoint(lPointInquiryRequest.getDevice(), lPointInquiryRequest.getVersion(), lPointInquiryRequest.getKey(), lPointInquiryRequest.getPontPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_lpoint_inquiry;
    }
}
