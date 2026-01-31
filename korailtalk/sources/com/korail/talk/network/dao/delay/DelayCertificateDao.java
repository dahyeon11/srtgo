package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayCertificateDao extends BaseDao {

    public class DelayCertificateRequest extends BaseRequest {
        private String ogTkRetPwd;
        private String ogTkSaleDd;
        private String ogTkSaleSqNo;
        private String ogTkSaleWctNo;
        private String runDt;
        private String trnNo;

        public DelayCertificateRequest() {
        }

        public String getOgTkRetPwd() {
            return this.ogTkRetPwd;
        }

        public String getOgTkSaleDd() {
            return this.ogTkSaleDd;
        }

        public String getOgTkSaleSqNo() {
            return this.ogTkSaleSqNo;
        }

        public String getOgTkSaleWctNo() {
            return this.ogTkSaleWctNo;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setOgTkRetPwd(String str) {
            this.ogTkRetPwd = str;
        }

        public void setOgTkSaleDd(String str) {
            this.ogTkSaleDd = str;
        }

        public void setOgTkSaleSqNo(String str) {
            this.ogTkSaleSqNo = str;
        }

        public void setOgTkSaleWctNo(String str) {
            this.ogTkSaleWctNo = str;
        }

        public void setRunDt(String str) {
            this.runDt = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class DelayCertificateResponse extends BaseResponse {
        private List<DelayInfo> dlayList;

        public DelayCertificateResponse() {
        }

        public List<DelayInfo> getDlayList() {
            return this.dlayList;
        }
    }

    public class DelayInfo {
        private String arvRsStnCd;
        private String arvRsStnNm;
        private String dlayArvFlg;
        private String dptRsStnCd;
        private String runDay;
        private String runDt;
        private String trnDlayTm;
        private String trnNo;

        public DelayInfo() {
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getDlayArvFlg() {
            return this.dlayArvFlg;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getRunDay() {
            return this.runDay;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getTrnDlayTm() {
            return this.trnDlayTm;
        }

        public String getTrnNo() {
            return this.trnNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        DelayCertificateRequest delayCertificateRequest = (DelayCertificateRequest) getRequest();
        return delayService.athnIsu(delayCertificateRequest.getDevice(), delayCertificateRequest.getVersion(), delayCertificateRequest.getKey(), delayCertificateRequest.getOgTkSaleWctNo(), delayCertificateRequest.getOgTkSaleDd(), delayCertificateRequest.getOgTkSaleSqNo(), delayCertificateRequest.getOgTkRetPwd(), delayCertificateRequest.getRunDt(), delayCertificateRequest.getTrnNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delay_certificate;
    }
}
