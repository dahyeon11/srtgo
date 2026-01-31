package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class authQRLocationDao extends BaseDao {

    public class QRLocationRequest extends BaseRequest {
        private String latitude;
        private String longitude;
        private String qrcode;

        public QRLocationRequest() {
        }

        public String getLatitude() {
            return this.latitude;
        }

        public String getLongitude() {
            return this.longitude;
        }

        public String getQrcode() {
            return this.qrcode;
        }

        public void setLatitude(String str) {
            this.latitude = str;
        }

        public void setLongitude(String str) {
            this.longitude = str;
        }

        public void setQrcode(String str) {
            this.qrcode = str;
        }
    }

    public class QRLocationResponse extends BaseResponse {
        private String jobScsFlg;

        public QRLocationResponse() {
        }

        public String getJobScsFlg() {
            return this.jobScsFlg;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        QRLocationRequest qRLocationRequest = (QRLocationRequest) getRequest();
        return commonService.authQRLocation(qRLocationRequest.getDevice(), qRLocationRequest.getVersion(), qRLocationRequest.getQrcode(), qRLocationRequest.getLatitude(), qRLocationRequest.getLongitude());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_trip_qr_location;
    }
}
