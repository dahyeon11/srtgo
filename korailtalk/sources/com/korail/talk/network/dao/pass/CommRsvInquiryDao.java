package com.korail.talk.network.dao.pass;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CommRsvInquiryDao extends BaseDao implements Serializable {

    public class CommRsvInquiryRequest extends BaseRequest implements Serializable {
        private String radChgTrnDvCd;
        private String selGoAbrdDt;
        private String selGoTrain;
        private String txtCmtrKndCd;
        private String txtCmtrUtlAgeCd;
        private String txtCmtrUtlTrmCd;
        private String txtCmtrUtlTrmNm;
        private String txtCntPerPage;
        private String txtGoEnd;
        private String txtGoHour;
        private String txtGoStart;
        private String txtSelPage;
        private String txtWkndUseFlg;

        public CommRsvInquiryRequest() {
        }

        public String getRadChgTrnDvCd() {
            return this.radChgTrnDvCd;
        }

        public String getSelGoAbrdDt() {
            return this.selGoAbrdDt;
        }

        public String getSelGoTrain() {
            return this.selGoTrain;
        }

        public String getTxtCmtrKndCd() {
            return this.txtCmtrKndCd;
        }

        public String getTxtCmtrUtlAgeCd() {
            return this.txtCmtrUtlAgeCd;
        }

        public String getTxtCmtrUtlTrmCd() {
            return this.txtCmtrUtlTrmCd;
        }

        public String getTxtCmtrUtlTrmNm() {
            return this.txtCmtrUtlTrmNm;
        }

        public String getTxtCntPerPage() {
            return this.txtCntPerPage;
        }

        public String getTxtGoEnd() {
            return this.txtGoEnd;
        }

        public String getTxtGoHour() {
            return this.txtGoHour;
        }

        public String getTxtGoStart() {
            return this.txtGoStart;
        }

        public String getTxtSelPage() {
            return this.txtSelPage;
        }

        public String getTxtWkndUseFlg() {
            return this.txtWkndUseFlg;
        }

        public void setRadChgTrnDvCd(String str) {
            this.radChgTrnDvCd = str;
        }

        public void setSelGoAbrdDt(String str) {
            this.selGoAbrdDt = str;
        }

        public void setSelGoTrain(String str) {
            this.selGoTrain = str;
        }

        public void setTxtCmtrKndCd(String str) {
            this.txtCmtrKndCd = str;
        }

        public void setTxtCmtrUtlAgeCd(String str) {
            this.txtCmtrUtlAgeCd = str;
        }

        public void setTxtCmtrUtlTrmCd(String str) {
            this.txtCmtrUtlTrmCd = str;
        }

        public void setTxtCmtrUtlTrmNm(String str) {
            this.txtCmtrUtlTrmNm = str;
        }

        public void setTxtCntPerPage(String str) {
            this.txtCntPerPage = str;
        }

        public void setTxtGoEnd(String str) {
            this.txtGoEnd = str;
        }

        public void setTxtGoHour(String str) {
            this.txtGoHour = str;
        }

        public void setTxtGoStart(String str) {
            this.txtGoStart = str;
        }

        public void setTxtSelPage(String str) {
            this.txtSelPage = str;
        }

        public void setTxtWkndUseFlg(String str) {
            this.txtWkndUseFlg = str;
        }
    }

    public class CommRsvInquiryResponse extends BaseResponse implements Serializable {
        private List<ScheduleInfoList> schedule_info;

        public class ScheduleInfoList {
            private List<TrainList> train_list;

            public ScheduleInfoList() {
            }

            public List<TrainList> getTrain_list() {
                return this.train_list;
            }
        }

        public CommRsvInquiryResponse() {
        }

        public List<ScheduleInfoList> getSchedule_info() {
            return this.schedule_info;
        }
    }

    public class TrainList {
        private String h_arv_rs_stn_cd;
        private String h_arv_rs_stn_nm;
        private String h_dpt_rs_stn_cd;
        private String h_dpt_rs_stn_nm;
        private String h_dtour;
        private String h_schd_prc;
        private String h_trn_gp_cd;
        private String h_trn_no;

        public TrainList() {
        }

        public String getH_arv_rs_stn_cd() {
            return this.h_arv_rs_stn_cd;
        }

        public String getH_arv_rs_stn_nm() {
            return this.h_arv_rs_stn_nm;
        }

        public String getH_dpt_rs_stn_cd() {
            return this.h_dpt_rs_stn_cd;
        }

        public String getH_dpt_rs_stn_nm() {
            return this.h_dpt_rs_stn_nm;
        }

        public String getH_dtour() {
            return this.h_dtour;
        }

        public String getH_schd_prc() {
            return this.h_schd_prc;
        }

        public String getH_trn_gp_cd() {
            return this.h_trn_gp_cd;
        }

        public String getH_trn_no() {
            return this.h_trn_no;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        CommRsvInquiryRequest commRsvInquiryRequest = (CommRsvInquiryRequest) getRequest();
        return passService.getCommRsvInquiry(commRsvInquiryRequest.getDevice(), commRsvInquiryRequest.getVersion(), commRsvInquiryRequest.getKey(), commRsvInquiryRequest.getSelGoTrain(), commRsvInquiryRequest.getSelGoAbrdDt(), commRsvInquiryRequest.getTxtGoHour(), commRsvInquiryRequest.getRadChgTrnDvCd(), commRsvInquiryRequest.getTxtCmtrKndCd(), commRsvInquiryRequest.getTxtCmtrUtlTrmCd(), commRsvInquiryRequest.getTxtCmtrUtlAgeCd(), commRsvInquiryRequest.getTxtSelPage(), commRsvInquiryRequest.getTxtCntPerPage(), commRsvInquiryRequest.getTxtGoStart(), commRsvInquiryRequest.getTxtGoEnd(), commRsvInquiryRequest.getTxtWkndUseFlg());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_comm_rsv_inquiry;
    }
}
