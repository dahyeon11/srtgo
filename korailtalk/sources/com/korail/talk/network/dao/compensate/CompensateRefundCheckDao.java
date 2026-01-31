package com.korail.talk.network.dao.compensate;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CompensateRefundCheckDao extends BaseDao {

    public class CompensateRefundCheckRequest extends BaseRequest {
        private List<String> jrnyStpTkFlg;
        private List<String> ogTkRetPwd;
        private List<String> ogTkSaleDd;
        private List<String> ogTkSaleSqNo;
        private List<String> ogTkSaleWctNo;
        private int tkCnt;
        private List<String> trnStpRsStnCd;

        public CompensateRefundCheckRequest() {
        }

        public List<String> getJrnyStpTkFlg() {
            return this.jrnyStpTkFlg;
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

        public List<String> getTrnStpRsStnCd() {
            return this.trnStpRsStnCd;
        }

        public void setJrnyStpTkFlg(List<String> list) {
            this.jrnyStpTkFlg = list;
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

        public void setTrnStpRsStnCd(List<String> list) {
            this.trnStpRsStnCd = list;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CompensateService compensateService = (CompensateService) getService(CompensateService.class);
        CompensateRefundCheckRequest compensateRefundCheckRequest = (CompensateRefundCheckRequest) getRequest();
        return compensateService.executeCompensateRefundDetail(compensateRefundCheckRequest.getDevice(), compensateRefundCheckRequest.getVersion(), compensateRefundCheckRequest.getKey(), compensateRefundCheckRequest.getTkCnt(), compensateRefundCheckRequest.getTrnStpRsStnCd(), compensateRefundCheckRequest.getJrnyStpTkFlg(), compensateRefundCheckRequest.getOgTkSaleWctNo(), compensateRefundCheckRequest.getOgTkSaleDd(), compensateRefundCheckRequest.getOgTkSaleSqNo(), compensateRefundCheckRequest.getOgTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_compensate_refund_detail;
    }
}
