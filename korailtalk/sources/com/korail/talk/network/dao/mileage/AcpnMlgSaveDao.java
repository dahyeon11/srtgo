package com.korail.talk.network.dao.mileage;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AcpnMlgSaveDao extends BaseDao {

    public class AcpnMlgSaveRequest extends BaseRequest {
        private String custNm;
        private String mlgAcmMbCrdNo;
        private String rsvMbCrdNo;
        private String saleDd;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public AcpnMlgSaveRequest() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getMlgAcmMbCrdNo() {
            return this.mlgAcmMbCrdNo;
        }

        public String getRsvMbCrdNo() {
            return this.rsvMbCrdNo;
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

        public void setCustNm(String str) {
            this.custNm = str;
        }

        public void setMlgAcmMbCrdNo(String str) {
            this.mlgAcmMbCrdNo = str;
        }

        public void setRsvMbCrdNo(String str) {
            this.rsvMbCrdNo = str;
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

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        MileageService mileageService = (MileageService) getService(MileageService.class);
        AcpnMlgSaveRequest acpnMlgSaveRequest = (AcpnMlgSaveRequest) getRequest();
        return mileageService.acpnMlgSave(acpnMlgSaveRequest.getDevice(), acpnMlgSaveRequest.getVersion(), acpnMlgSaveRequest.getKey(), acpnMlgSaveRequest.getRsvMbCrdNo(), acpnMlgSaveRequest.getCustNm(), acpnMlgSaveRequest.getMlgAcmMbCrdNo(), acpnMlgSaveRequest.getSaleWctNo(), acpnMlgSaveRequest.getSaleDd(), acpnMlgSaveRequest.getSaleSqno(), acpnMlgSaveRequest.getTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_acpn_mlg_save_key;
    }
}
