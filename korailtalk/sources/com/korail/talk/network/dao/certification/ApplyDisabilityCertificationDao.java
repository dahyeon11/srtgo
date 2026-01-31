package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.HashMap;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ApplyDisabilityCertificationDao extends BaseDao {

    public class ApplyDisabilityCertificationDaoRequest extends BaseRequest {
        private String hidPnrNo;
        private HashMap<String, String> txtJobDvCd0019;
        private HashMap<String, String> txtPsgDisc0019Birth;
        private int txtPsgDisc0019Cnt;
        private HashMap<String, String> txtPsgDisc0019CustNm;
        private HashMap<String, String> txtPsgDisc0019Grade;
        private HashMap<String, String> txtPsgDisc0019PsDvCd;
        private HashMap<String, Integer> txtPsgDisc0019Sqno;

        public ApplyDisabilityCertificationDaoRequest() {
        }

        public String getHidPnrNo() {
            return this.hidPnrNo;
        }

        public HashMap<String, String> getTxtJobDvCd0019() {
            return this.txtJobDvCd0019;
        }

        public HashMap<String, String> getTxtPsgDisc0019Birth() {
            return this.txtPsgDisc0019Birth;
        }

        public int getTxtPsgDisc0019Cnt() {
            return this.txtPsgDisc0019Cnt;
        }

        public HashMap<String, String> getTxtPsgDisc0019CustNm() {
            return this.txtPsgDisc0019CustNm;
        }

        public HashMap<String, String> getTxtPsgDisc0019Grade() {
            return this.txtPsgDisc0019Grade;
        }

        public HashMap<String, String> getTxtPsgDisc0019PsDvCd() {
            return this.txtPsgDisc0019PsDvCd;
        }

        public HashMap<String, Integer> getTxtPsgDisc0019Sqno() {
            return this.txtPsgDisc0019Sqno;
        }

        public void setHidPnrNo(String str) {
            this.hidPnrNo = str;
        }

        public void setTxtJobDvCd0019(HashMap<String, String> map) {
            this.txtJobDvCd0019 = map;
        }

        public void setTxtPsgDisc0019Birth(HashMap<String, String> map) {
            this.txtPsgDisc0019Birth = map;
        }

        public void setTxtPsgDisc0019Cnt(int i8) {
            this.txtPsgDisc0019Cnt = i8;
        }

        public void setTxtPsgDisc0019CustNm(HashMap<String, String> map) {
            this.txtPsgDisc0019CustNm = map;
        }

        public void setTxtPsgDisc0019Grade(HashMap<String, String> map) {
            this.txtPsgDisc0019Grade = map;
        }

        public void setTxtPsgDisc0019PsDvCd(HashMap<String, String> map) {
            this.txtPsgDisc0019PsDvCd = map;
        }

        public void setTxtPsgDisc0019Sqno(HashMap<String, Integer> map) {
            this.txtPsgDisc0019Sqno = map;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        ApplyDisabilityCertificationDaoRequest applyDisabilityCertificationDaoRequest = (ApplyDisabilityCertificationDaoRequest) getRequest();
        return certificationService.applyDisabilityCertification(applyDisabilityCertificationDaoRequest.getDevice(), applyDisabilityCertificationDaoRequest.getVersion(), applyDisabilityCertificationDaoRequest.getKey(), applyDisabilityCertificationDaoRequest.getHidPnrNo(), applyDisabilityCertificationDaoRequest.getTxtPsgDisc0019Cnt(), applyDisabilityCertificationDaoRequest.getTxtPsgDisc0019Sqno(), applyDisabilityCertificationDaoRequest.getTxtJobDvCd0019(), applyDisabilityCertificationDaoRequest.getTxtPsgDisc0019PsDvCd(), applyDisabilityCertificationDaoRequest.getTxtPsgDisc0019CustNm(), applyDisabilityCertificationDaoRequest.getTxtPsgDisc0019Birth(), applyDisabilityCertificationDaoRequest.getTxtPsgDisc0019Grade());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_applied_disability_certification;
    }
}
