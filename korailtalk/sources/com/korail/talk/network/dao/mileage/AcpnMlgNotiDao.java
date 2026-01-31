package com.korail.talk.network.dao.mileage;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AcpnMlgNotiDao extends BaseDao {

    public class AcpnMlgNotiRequest extends BaseRequest {
        private String rcvPsHndyTeln;
        private String retPwd;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;

        public AcpnMlgNotiRequest() {
        }

        public String getRcvPsHndyTeln() {
            return this.rcvPsHndyTeln;
        }

        public String getRetPwd() {
            return this.retPwd;
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public void setRcvPsHndyTeln(String str) {
            this.rcvPsHndyTeln = str;
        }

        public void setRetPwd(String str) {
            this.retPwd = str;
        }

        public void setSaleDt(String str) {
            this.saleDt = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        MileageService mileageService = (MileageService) getService(MileageService.class);
        AcpnMlgNotiRequest acpnMlgNotiRequest = (AcpnMlgNotiRequest) getRequest();
        return mileageService.acpnMlgNoti(acpnMlgNotiRequest.getDevice(), acpnMlgNotiRequest.getVersion(), acpnMlgNotiRequest.getKey(), acpnMlgNotiRequest.getSaleWctNo(), acpnMlgNotiRequest.getSaleDt(), acpnMlgNotiRequest.getSaleSqno(), acpnMlgNotiRequest.getRetPwd(), acpnMlgNotiRequest.getRcvPsHndyTeln());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_acpn_mlg_noti;
    }
}
