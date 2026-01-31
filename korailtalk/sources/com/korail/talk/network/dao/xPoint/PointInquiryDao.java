package com.korail.talk.network.dao.xPoint;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PointInquiryDao extends BaseDao {

    public class PointInquiryRequest extends BaseRequest {
        private String inpDvCd;
        private String pointDvCd;
        private String stlCrdValidTrm;
        private String xpointNo;
        private String xpointPwd;

        public PointInquiryRequest() {
        }

        public String getInpDvCd() {
            return this.inpDvCd;
        }

        public String getPointDvCd() {
            return this.pointDvCd;
        }

        public String getStlCrdValidTrm() {
            return this.stlCrdValidTrm;
        }

        public String getXpointNo() {
            return this.xpointNo;
        }

        public String getXpointPwd() {
            return this.xpointPwd;
        }

        public void setInpDvCd(String str) {
            this.inpDvCd = str;
        }

        public void setPointDvCd(String str) {
            this.pointDvCd = str;
        }

        public void setStlCrdValidTrm(String str) {
            this.stlCrdValidTrm = str;
        }

        public void setXpointNo(String str) {
            this.xpointNo = str;
        }

        public void setXpointPwd(String str) {
            this.xpointPwd = str;
        }
    }

    public class PointInquiryResponse extends BaseResponse {
        private int h_avl_point;
        private int h_corp_use_point;
        private int h_join_point;
        private int h_korail_point;
        private int h_point;

        public PointInquiryResponse() {
        }

        public int getH_avl_point() {
            return this.h_avl_point;
        }

        public int getH_join_point() {
            return this.h_join_point;
        }

        public int getH_korail_point() {
            return this.h_korail_point;
        }

        public int getH_point() {
            return this.h_point;
        }

        public int geth_corp_use_point() {
            return this.h_corp_use_point;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        XPointService xPointService = (XPointService) getService(XPointService.class);
        PointInquiryRequest pointInquiryRequest = (PointInquiryRequest) getRequest();
        return xPointService.getPoint(pointInquiryRequest.getDevice(), pointInquiryRequest.getVersion(), pointInquiryRequest.getKey(), pointInquiryRequest.getInpDvCd(), pointInquiryRequest.getPointDvCd(), pointInquiryRequest.getXpointNo(), pointInquiryRequest.getXpointPwd(), pointInquiryRequest.getStlCrdValidTrm());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_point_inquiry;
    }
}
