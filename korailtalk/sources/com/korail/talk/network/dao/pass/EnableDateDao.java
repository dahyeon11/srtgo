package com.korail.talk.network.dao.pass;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class EnableDateDao extends BaseDao {

    public class EnableDateRequest extends BaseRequest {
        private String txtCmtrKndCd;
        private String txtCmtrUtlAgeCd;
        private String txtCmtrUtlTrmCd;

        public EnableDateRequest() {
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

        public void setTxtCmtrKndCd(String str) {
            this.txtCmtrKndCd = str;
        }

        public void setTxtCmtrUtlAgeCd(String str) {
            this.txtCmtrUtlAgeCd = str;
        }

        public void setTxtCmtrUtlTrmCd(String str) {
            this.txtCmtrUtlTrmCd = str;
        }
    }

    public class EnableDateResponse extends BaseResponse {
        private List<PassInfo> pass_info;
        private List<Ticket_info> ticket_info;
        private List<WctInfo> wct_info;

        public EnableDateResponse() {
        }

        public List<PassInfo> getPass_info() {
            return this.pass_info;
        }

        public List<Ticket_info> getTicket_info() {
            return this.ticket_info;
        }

        public List<WctInfo> getWct_info() {
            return this.wct_info;
        }
    }

    public class PassInfo {
        private String h_use_open_dt;

        public PassInfo() {
        }

        public String getH_use_open_dt() {
            return this.h_use_open_dt;
        }
    }

    public class Ticket_info {
        private String h_ise_dt2;

        public Ticket_info() {
        }

        public String getH_ise_dt2() {
            return this.h_ise_dt2;
        }
    }

    public class WctInfo {
        private String eng_cd_val;
        private String kor_cd_val;

        public WctInfo() {
        }

        public String getEng_cd_val() {
            return this.eng_cd_val;
        }

        public String getKor_cd_val() {
            return this.kor_cd_val;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        EnableDateRequest enableDateRequest = (EnableDateRequest) getRequest();
        return passService.getEnableDate(enableDateRequest.getDevice(), enableDateRequest.getVersion(), enableDateRequest.getKey(), enableDateRequest.getTxtCmtrKndCd(), enableDateRequest.getTxtCmtrUtlTrmCd(), enableDateRequest.getTxtCmtrUtlAgeCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_enable_date;
    }
}
