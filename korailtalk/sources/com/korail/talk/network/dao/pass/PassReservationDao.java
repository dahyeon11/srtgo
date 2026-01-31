package com.korail.talk.network.dao.pass;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PassReservationDao extends BaseDao {

    public class MainInfo {
        private String h_cmtr_dv_cd;
        private String h_cmtr_knd_cd;
        private String h_cmtr_utl_age_cd;
        private String h_cmtr_utl_trm_cd;
        private String h_disc_cert_sqno;
        private String h_fmps_cert_no;
        private String h_rcvd_amt;
        private String h_use_cls_dt;
        private String h_use_open_dt;
        private String h_use_psb_dno;

        public MainInfo() {
        }

        public String getH_cmtr_dv_cd() {
            return this.h_cmtr_dv_cd;
        }

        public String getH_cmtr_knd_cd() {
            return this.h_cmtr_knd_cd;
        }

        public String getH_cmtr_utl_age_cd() {
            return this.h_cmtr_utl_age_cd;
        }

        public String getH_cmtr_utl_trm_cd() {
            return this.h_cmtr_utl_trm_cd;
        }

        public String getH_disc_cert_sqno() {
            return this.h_disc_cert_sqno;
        }

        public String getH_fmps_cert_no() {
            return this.h_fmps_cert_no;
        }

        public String getH_rcvd_amt() {
            return this.h_rcvd_amt;
        }

        public String getH_use_cls_dt() {
            return this.h_use_cls_dt;
        }

        public String getH_use_open_dt() {
            return this.h_use_open_dt;
        }

        public String getH_use_psb_dno() {
            return this.h_use_psb_dno;
        }

        public void setH_cmtr_dv_cd(String str) {
            this.h_cmtr_dv_cd = str;
        }

        public void setH_cmtr_knd_cd(String str) {
            this.h_cmtr_knd_cd = str;
        }

        public void setH_cmtr_utl_age_cd(String str) {
            this.h_cmtr_utl_age_cd = str;
        }

        public void setH_cmtr_utl_trm_cd(String str) {
            this.h_cmtr_utl_trm_cd = str;
        }

        public void setH_disc_cert_sqno(String str) {
            this.h_disc_cert_sqno = str;
        }

        public void setH_fmps_cert_no(String str) {
            this.h_fmps_cert_no = str;
        }

        public void setH_rcvd_amt(String str) {
            this.h_rcvd_amt = str;
        }

        public void setH_use_cls_dt(String str) {
            this.h_use_cls_dt = str;
        }

        public void setH_use_open_dt(String str) {
            this.h_use_open_dt = str;
        }

        public void setH_use_psb_dno(String str) {
            this.h_use_psb_dno = str;
        }
    }

    public class PassReservationRequest extends BaseRequest {
        private String hidCmtrKndCd;
        private String hidCmtrUtlAgeCd;
        private String hidCmtrUtlTrmCd;
        private String hidUseOpenDt;

        public PassReservationRequest() {
        }

        public String getHidCmtrKndCd() {
            return this.hidCmtrKndCd;
        }

        public String getHidCmtrUtlAgeCd() {
            return this.hidCmtrUtlAgeCd;
        }

        public String getHidCmtrUtlTrmCd() {
            return this.hidCmtrUtlTrmCd;
        }

        public String getHidUseOpenDt() {
            return this.hidUseOpenDt;
        }

        public void setHidCmtrKndCd(String str) {
            this.hidCmtrKndCd = str;
        }

        public void setHidCmtrUtlAgeCd(String str) {
            this.hidCmtrUtlAgeCd = str;
        }

        public void setHidCmtrUtlTrmCd(String str) {
            this.hidCmtrUtlTrmCd = str;
        }

        public void setHidUseOpenDt(String str) {
            this.hidUseOpenDt = str;
        }
    }

    public class PassReservationResponse extends BaseResponse {
        private MainInfo main_info;

        public PassReservationResponse() {
        }

        public MainInfo getMain_info() {
            return this.main_info;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        PassReservationRequest passReservationRequest = (PassReservationRequest) getRequest();
        return passService.passReservation(passReservationRequest.getDevice(), passReservationRequest.getVersion(), passReservationRequest.getKey(), passReservationRequest.getHidCmtrKndCd(), passReservationRequest.getHidCmtrUtlTrmCd(), passReservationRequest.getHidCmtrUtlAgeCd(), passReservationRequest.getHidUseOpenDt());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_pass_reservation;
    }
}
