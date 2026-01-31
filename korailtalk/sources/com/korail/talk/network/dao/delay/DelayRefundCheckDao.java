package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayRefundCheckDao extends BaseDao {

    public class DelayRefundCheckRequest extends BaseRequest {
        private List<String> ogTkRetPwd;
        private List<String> ogTkSaleDd;
        private List<String> ogTkSaleSqNo;
        private List<String> ogTkSaleWctNo;
        private int tkCnt;

        public DelayRefundCheckRequest() {
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
        DelayRefundCheckRequest delayRefundCheckRequest = (DelayRefundCheckRequest) getRequest();
        return delayService.executeDelayRefundDetail(delayRefundCheckRequest.getDevice(), delayRefundCheckRequest.getVersion(), delayRefundCheckRequest.getKey(), delayRefundCheckRequest.getTkCnt(), delayRefundCheckRequest.getOgTkSaleWctNo(), delayRefundCheckRequest.getOgTkSaleDd(), delayRefundCheckRequest.getOgTkSaleSqNo(), delayRefundCheckRequest.getOgTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_refund_delay_detail;
    }
}
