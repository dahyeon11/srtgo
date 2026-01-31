package com.korail.talk.network.dao.xPoint;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class KorailPointInquiryDao extends BaseDao {

    public class KorailPointInquiryResponse extends BaseResponse {
        private String h_cntc_chn_cont1;
        private String h_cp_athn_flg;
        private String h_cust_lead_flg_nm;
        private String h_delay_cnt;
        private String h_disc_coup_cnt;
        private String h_emil_athn_flg;
        private String h_hdcp_flg;
        private String h_korail_point;
        private String h_logn_tp_cd1;
        private String h_logn_tp_cd2;
        private String h_logn_tp_cd4;
        private String h_logn_tp_cd5;
        private String h_subt_dcs_cl_cd;
        private String h_subt_dcs_cl_nm;

        public KorailPointInquiryResponse() {
        }

        public String getH_cntc_chn_cont1() {
            return this.h_cntc_chn_cont1;
        }

        public String getH_cp_athn_flg() {
            return this.h_cp_athn_flg;
        }

        public String getH_cust_lead_flg_nm() {
            return this.h_cust_lead_flg_nm;
        }

        public String getH_delay_cnt() {
            return this.h_delay_cnt;
        }

        public String getH_disc_coup_cnt() {
            return this.h_disc_coup_cnt;
        }

        public String getH_emil_athn_flg() {
            return this.h_emil_athn_flg;
        }

        public String getH_hdcp_flg() {
            return this.h_hdcp_flg;
        }

        public String getH_korail_point() {
            return this.h_korail_point;
        }

        public String getH_logn_tp_cd1() {
            return this.h_logn_tp_cd1;
        }

        public String getH_logn_tp_cd2() {
            return this.h_logn_tp_cd2;
        }

        public String getH_logn_tp_cd4() {
            return this.h_logn_tp_cd4;
        }

        public String getH_logn_tp_cd5() {
            return this.h_logn_tp_cd5;
        }

        public String getH_subt_dcs_cl_cd() {
            return this.h_subt_dcs_cl_cd;
        }

        public String getH_subt_dcs_cl_nm() {
            return this.h_subt_dcs_cl_nm;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        XPointService xPointService = (XPointService) getService(XPointService.class);
        BaseRequest baseRequest = new BaseRequest();
        return xPointService.getKorailPoint(baseRequest.getDevice(), baseRequest.getVersion(), baseRequest.getKey(), "0");
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_korail_point_inquiry;
    }
}
