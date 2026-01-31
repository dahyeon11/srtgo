package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ConvenienceSettingDao extends BaseDao {

    public class ConvenienceSettingRequest extends BaseRequest {
        private String custMgNo;
        private String medDvCd;
        private String reqSqno;

        public ConvenienceSettingRequest() {
        }

        public String getCustMgNo() {
            return this.custMgNo;
        }

        public String getMedDvCd() {
            return this.medDvCd;
        }

        public String getReqSqno() {
            return this.reqSqno;
        }

        public void setCustMgNo(String str) {
            this.custMgNo = str;
        }

        public void setMedDvCd(String str) {
            this.medDvCd = str;
        }

        public void setReqSqno(String str) {
            this.reqSqno = str;
        }
    }

    public class ConvenienceSettingResponse extends BaseResponse {
        private List<CustTripInfo> mainList;

        public ConvenienceSettingResponse() {
        }

        public List<CustTripInfo> getMainList() {
            return this.mainList;
        }
    }

    public class CustTripInfo implements Serializable {
        private String addSeatAttCd;
        private String adltHdcpPrnb;
        private String adulCnt;
        private String arvStnCd;
        private String arvStnNm;
        private String babyAcpnPrnb;
        private String chgDttm;
        private String chgUsrId;
        private String chilCnt;
        private String chldHdcpPrnb;
        private String custMgNo;
        private String dayCd;
        private String dirSeatAttGpCd;
        private String dirtChtnDvCd;
        private String dptStnCd;
        private String dptStnNm;
        private String ectbTrnDptTm;
        private String edrPrnb;
        private String inclFlg;
        private String jobStHr;
        private String locSeatAttGpCd;
        private String medDvCd;
        private String psrmClCd;
        private String ptwtTtl;
        private String regDttm;
        private String regSqno;
        private String regUsrId;
        private String tripDno;
        private String trnClsfCd;
        private String trnCnecFlg;
        private String trnGpCd;
        private String utlDno;

        public CustTripInfo() {
        }

        public String getAddSeatAttCd() {
            return this.addSeatAttCd;
        }

        public String getAdltHdcpPrnb() {
            return this.adltHdcpPrnb;
        }

        public String getAdulCnt() {
            return this.adulCnt;
        }

        public String getArvStnCd() {
            return this.arvStnCd;
        }

        public String getArvStnNm() {
            return this.arvStnNm;
        }

        public String getBabyAcpnPrnb() {
            return this.babyAcpnPrnb;
        }

        public String getChgDttm() {
            return this.chgDttm;
        }

        public String getChgUsrId() {
            return this.chgUsrId;
        }

        public String getChilCnt() {
            return this.chilCnt;
        }

        public String getChldHdcpPrnb() {
            return this.chldHdcpPrnb;
        }

        public String getCustMgNo() {
            return this.custMgNo;
        }

        public String getDayCd() {
            return this.dayCd;
        }

        public String getDirSeatAttGpCd() {
            return this.dirSeatAttGpCd;
        }

        public String getDirtChtnDvCd() {
            return this.dirtChtnDvCd;
        }

        public String getDptStnCd() {
            return this.dptStnCd;
        }

        public String getDptStnNm() {
            return this.dptStnNm;
        }

        public String getEctbTrnDptTm() {
            return this.ectbTrnDptTm;
        }

        public String getEdrPrnb() {
            return this.edrPrnb;
        }

        public String getInclFlg() {
            return this.inclFlg;
        }

        public String getJobStHr() {
            return this.jobStHr;
        }

        public String getLocSeatAttGpCd() {
            return this.locSeatAttGpCd;
        }

        public String getMedDvCd() {
            return this.medDvCd;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getPtwtTtl() {
            return this.ptwtTtl;
        }

        public String getRegDttm() {
            return this.regDttm;
        }

        public String getRegSqno() {
            return this.regSqno;
        }

        public String getRegUsrId() {
            return this.regUsrId;
        }

        public String getTripDno() {
            return this.tripDno;
        }

        public String getTrnClsfCd() {
            return this.trnClsfCd;
        }

        public String getTrnCnecFlg() {
            return this.trnCnecFlg;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getUtlDno() {
            return this.utlDno;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        ConvenienceSettingRequest convenienceSettingRequest = (ConvenienceSettingRequest) getRequest();
        return researchService.getCustTripInfo(convenienceSettingRequest.getDevice(), convenienceSettingRequest.getVersion(), convenienceSettingRequest.getKey(), convenienceSettingRequest.getCustMgNo(), convenienceSettingRequest.getMedDvCd(), convenienceSettingRequest.getReqSqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_convenience_setting;
    }
}
