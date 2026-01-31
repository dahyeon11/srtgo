package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayRefundDao extends BaseDao {

    public class DelayRefundRequest extends BaseRequest {
        private String dlayFarePymtMtdCd;
        private List<String> ogTkRetPwd;
        private List<String> ogTkSaleDd;
        private List<String> ogTkSaleSqNo;
        private List<String> ogTkSaleWctNo;
        private int tkCnt;

        public DelayRefundRequest() {
        }

        public String getDlayFarePymtMtdCd() {
            return this.dlayFarePymtMtdCd;
        }

        public List<String> getOgTkRetPwd() {
            return this.ogTkRetPwd;
        }

        public List<String> getOgTkSaleDd() {
            return this.ogTkSaleDd;
        }

        public List<String> getOgTkSaleSqNo() {
            return this.ogTkSaleSqNo;
        }

        public List<String> getOgTkSaleWctNo() {
            return this.ogTkSaleWctNo;
        }

        public int getTkCnt() {
            return this.tkCnt;
        }

        public void setDlayFarePymtMtdCd(String str) {
            this.dlayFarePymtMtdCd = str;
        }

        public void setOgTkRetPwd(List<String> list) {
            this.ogTkRetPwd = list;
        }

        public void setOgTkSaleDd(List<String> list) {
            this.ogTkSaleDd = list;
        }

        public void setOgTkSaleSqNo(List<String> list) {
            this.ogTkSaleSqNo = list;
        }

        public void setOgTkSaleWctNo(List<String> list) {
            this.ogTkSaleWctNo = list;
        }

        public void setTkCnt(int i8) {
            this.tkCnt = i8;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        DelayRefundRequest delayRefundRequest = (DelayRefundRequest) getRequest();
        return delayService.executeDelayRefund(delayRefundRequest.getDevice(), delayRefundRequest.getVersion(), delayRefundRequest.getKey(), delayRefundRequest.getDlayFarePymtMtdCd(), delayRefundRequest.getTkCnt(), delayRefundRequest.getOgTkSaleWctNo(), delayRefundRequest.getOgTkSaleDd(), delayRefundRequest.getOgTkSaleSqNo(), delayRefundRequest.getOgTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_refund_delay;
    }
}
