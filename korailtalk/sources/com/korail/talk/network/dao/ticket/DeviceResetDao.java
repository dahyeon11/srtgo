package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DeviceResetDao extends BaseDao {

    public class DeviceResetRequest extends BaseRequest {
        private String custNm;
        private String dptDttm;
        private String latitude;
        private String longitude;
        private String nonMbPwd;
        private String stlbTrnClsfCd;
        private String teln;
        private String trnNo;

        public DeviceResetRequest() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getDptDttm() {
            return this.dptDttm;
        }

        public String getLatitude() {
            return this.latitude;
        }

        public String getLongitude() {
            return this.longitude;
        }

        public String getNonMbPwd() {
            return this.nonMbPwd;
        }

        public String getStlbTrnClsfCd() {
            return this.stlbTrnClsfCd;
        }

        public String getTeln() {
            return this.teln;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setCustNm(String str) {
            this.custNm = str;
        }

        public void setDptDttm(String str) {
            this.dptDttm = str;
        }

        public void setLatitude(String str) {
            this.latitude = str;
        }

        public void setLongitude(String str) {
            this.longitude = str;
        }

        public void setNonMbPwd(String str) {
            this.nonMbPwd = str;
        }

        public void setStlbTrnClsfCd(String str) {
            this.stlbTrnClsfCd = str;
        }

        public void setTeln(String str) {
            this.teln = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        DeviceResetRequest deviceResetRequest = (DeviceResetRequest) getRequest();
        return ticketService.deviceReset(deviceResetRequest.getDevice(), deviceResetRequest.getVersion(), deviceResetRequest.getKey(), deviceResetRequest.getTeln(), deviceResetRequest.getCustNm(), deviceResetRequest.getNonMbPwd(), deviceResetRequest.getStlbTrnClsfCd(), deviceResetRequest.getDptDttm(), deviceResetRequest.getLatitude(), deviceResetRequest.getLongitude(), deviceResetRequest.getTrnNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_device_reset;
    }
}
