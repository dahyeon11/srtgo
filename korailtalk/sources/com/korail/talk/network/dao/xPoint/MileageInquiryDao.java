package com.korail.talk.network.dao.xPoint;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MileageInquiryDao extends BaseDao {

    public class MileageInquiryRequest extends BaseRequest {
        private String nowPgNo;
        private String pgPrCnt;
        private String pontTpVal;
        private String qryClsDt;
        private String qryDvVal;
        private String qryStDt;

        public MileageInquiryRequest() {
        }

        public String getNowPgNo() {
            return this.nowPgNo;
        }

        public String getPgPrCnt() {
            return this.pgPrCnt;
        }

        public String getPontTpVal() {
            return this.pontTpVal;
        }

        public String getQryClsDt() {
            return this.qryClsDt;
        }

        public String getQryDvVal() {
            return this.qryDvVal;
        }

        public String getQryStDt() {
            return this.qryStDt;
        }

        public void setNowPgNo(String str) {
            this.nowPgNo = str;
        }

        public void setPgPrCnt(String str) {
            this.pgPrCnt = str;
        }

        public void setPontTpVal(String str) {
            this.pontTpVal = str;
        }

        public void setQryClsDt(String str) {
            this.qryClsDt = str;
        }

        public void setQryDvVal(String str) {
            this.qryDvVal = str;
        }

        public void setQryStDt(String str) {
            this.qryStDt = str;
        }
    }

    public class MileageInquiryResponse extends BaseResponse {
        private String delPontValNum;
        private String ktxMlgInfo;
        private String pgCnt;
        private String railNowSavePontValNum1;
        private List<SpecList> specList;
        private String totAcmRailPontValNum1;
        private String totAvlAfltPontValNum;
        private String totAvlRailPontValNum;
        private String totAvlRailPontValNum1;
        private String totUseRailPontValNum1;

        public MileageInquiryResponse() {
        }

        public String getDelPontValNum() {
            return this.delPontValNum;
        }

        public String getKtxMlgInfo() {
            return this.ktxMlgInfo;
        }

        public String getPgCnt() {
            return this.pgCnt;
        }

        public List<SpecList> getSpecList() {
            return this.specList;
        }

        public String getTotAvlAfltPontValNum() {
            return this.totAvlAfltPontValNum;
        }

        public String getTotAvlRailPontValNum() {
            return this.totAvlRailPontValNum;
        }

        public String getrailNowSavePontValNum1() {
            return this.railNowSavePontValNum1;
        }

        public String gettotAcmRailPontValNum1() {
            return this.totAcmRailPontValNum1;
        }

        public String gettotAvlRailPontValNum1() {
            return this.totAvlRailPontValNum1;
        }

        public String gettotUseRailPontValNum1() {
            return this.totUseRailPontValNum1;
        }
    }

    public class SpecList {
        private String dptDt;
        private String mlgAcmDvCdNm;
        private String pontAmt;
        private String pontDvNm;
        private String rcpDvNm;
        private String savePontValNum;
        private String stlAmt;

        public SpecList() {
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public String getMlgAcmDvCdNm() {
            return this.mlgAcmDvCdNm;
        }

        public String getPontAmt() {
            return this.pontAmt;
        }

        public String getPontDvNm() {
            return this.pontDvNm;
        }

        public String getRcpDvNm() {
            return this.rcpDvNm;
        }

        public String getSavePontValNum() {
            return this.savePontValNum;
        }

        public String getStlAmt() {
            return this.stlAmt;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        XPointService xPointService = (XPointService) getService(XPointService.class);
        MileageInquiryRequest mileageInquiryRequest = (MileageInquiryRequest) getRequest();
        return xPointService.getMileage(mileageInquiryRequest.getDevice(), mileageInquiryRequest.getVersion(), mileageInquiryRequest.getKey(), mileageInquiryRequest.getPontTpVal(), mileageInquiryRequest.getQryDvVal(), mileageInquiryRequest.getQryStDt(), mileageInquiryRequest.getQryClsDt(), mileageInquiryRequest.getPgPrCnt(), mileageInquiryRequest.getNowPgNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_mileage_inquiry;
    }
}
