package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.delay.RefundResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayRefundListDao extends BaseDao {

    public class DelayRefundListRequest extends BaseRequest {
        private String dptDtFrom;
        private String dptDtTo;
        private int nowPgNo;

        public DelayRefundListRequest() {
        }

        public String getDptDtFrom() {
            return this.dptDtFrom;
        }

        public String getDptDtTo() {
            return this.dptDtTo;
        }

        public int getNowPgNo() {
            return this.nowPgNo;
        }

        public void setDptDtFrom(String str) {
            this.dptDtFrom = str;
        }

        public void setDptDtTo(String str) {
            this.dptDtTo = str;
        }

        public void setNowPgNo(int i8) {
            this.nowPgNo = i8;
        }
    }

    public class DelayRefundListResponse extends RefundResponse {
        public DelayRefundListResponse() {
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        DelayRefundListRequest delayRefundListRequest = (DelayRefundListRequest) getRequest();
        return delayService.executeDelayRefundList(delayRefundListRequest.getDevice(), delayRefundListRequest.getVersion(), delayRefundListRequest.getKey(), delayRefundListRequest.getNowPgNo(), delayRefundListRequest.getDptDtFrom(), delayRefundListRequest.getDptDtTo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_refund_delay_list;
    }
}
