package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayReturnReceiptDao extends BaseDao {

    public class DelayReturnReceiptRequest extends BaseRequest {
        private String saleDd;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public DelayReturnReceiptRequest() {
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

    public class DelayReturnReceiptResponse extends BaseResponse {
        private String dlayFarePymtMtdNm;
        private String dlayFareRetAmt;
        private String retDt;

        public DelayReturnReceiptResponse() {
        }

        public String getDlayFarePymtMtdNm() {
            return this.dlayFarePymtMtdNm;
        }

        public String getDlayFareRetAmt() {
            return this.dlayFareRetAmt;
        }

        public String getRetDt() {
            return this.retDt;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        DelayReturnReceiptRequest delayReturnReceiptRequest = (DelayReturnReceiptRequest) getRequest();
        return delayService.dealyReturnReceipt(delayReturnReceiptRequest.getDevice(), delayReturnReceiptRequest.getVersion(), delayReturnReceiptRequest.getKey(), delayReturnReceiptRequest.getSaleWctNo(), delayReturnReceiptRequest.getSaleDd(), delayReturnReceiptRequest.getSaleSqno(), delayReturnReceiptRequest.getTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delay_return_receipt;
    }
}
