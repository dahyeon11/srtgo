package com.korail.talk.network.dao.compensate;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.delay.RefundResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CompensateRefundListDao extends BaseDao {

    public class CompensateRefundListRequest extends BaseRequest {
        private String dptDtFrom;
        private String dptDtTo;
        private int nowPgNo;

        public CompensateRefundListRequest() {
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

    public class CompensateRefundListResponse extends RefundResponse {
        public CompensateRefundListResponse() {
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CompensateService compensateService = (CompensateService) getService(CompensateService.class);
        CompensateRefundListRequest compensateRefundListRequest = (CompensateRefundListRequest) getRequest();
        return compensateService.executeCompensateRefundList(compensateRefundListRequest.getDevice(), compensateRefundListRequest.getVersion(), compensateRefundListRequest.getKey(), compensateRefundListRequest.getNowPgNo(), compensateRefundListRequest.getDptDtFrom(), compensateRefundListRequest.getDptDtTo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_compensate_refund_list;
    }
}
