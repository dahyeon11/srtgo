package com.korail.talk.network.dao.passCard;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayTicketAddDao extends BaseDao {

    public class DelayTicketAddRequest extends BaseRequest {
        private int delayCouponInputViewIndex;
        private String h_dlay_disc_cnt;
        private String h_orgtk_ret_pwd;
        private String h_orgtk_ret_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_wct_no;

        public DelayTicketAddRequest() {
        }

        public int getDelayCouponInputViewIndex() {
            return this.delayCouponInputViewIndex;
        }

        public String getH_dlay_disc_cnt() {
            return this.h_dlay_disc_cnt;
        }

        public String getH_orgtk_ret_pwd() {
            return this.h_orgtk_ret_pwd;
        }

        public String getH_orgtk_ret_sale_dt() {
            return this.h_orgtk_ret_sale_dt;
        }

        public String getH_orgtk_sale_sqno() {
            return this.h_orgtk_sale_sqno;
        }

        public String getH_orgtk_wct_no() {
            return this.h_orgtk_wct_no;
        }

        public void setDelayCouponInputViewIndex(int i8) {
            this.delayCouponInputViewIndex = i8;
        }

        public void setH_dlay_disc_cnt(String str) {
            this.h_dlay_disc_cnt = str;
        }

        public void setH_orgtk_ret_pwd(String str) {
            this.h_orgtk_ret_pwd = str;
        }

        public void setH_orgtk_ret_sale_dt(String str) {
            this.h_orgtk_ret_sale_dt = str;
        }

        public void setH_orgtk_sale_sqno(String str) {
            this.h_orgtk_sale_sqno = str;
        }

        public void setH_orgtk_wct_no(String str) {
            this.h_orgtk_wct_no = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassCardService passCardService = (PassCardService) getService(PassCardService.class);
        DelayTicketAddRequest delayTicketAddRequest = (DelayTicketAddRequest) getRequest();
        return passCardService.addDelayTicket(delayTicketAddRequest.getDevice(), delayTicketAddRequest.getVersion(), delayTicketAddRequest.getKey(), delayTicketAddRequest.getH_dlay_disc_cnt(), delayTicketAddRequest.getH_orgtk_ret_sale_dt(), delayTicketAddRequest.getH_orgtk_wct_no(), delayTicketAddRequest.getH_orgtk_sale_sqno(), delayTicketAddRequest.getH_orgtk_ret_pwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delay_ticket_add;
    }
}
