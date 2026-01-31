package com.korail.talk.network.dao.passCard;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DelayTicketListDao extends BaseDao {

    public class DelayCoupon {
        private String h_dlay_fare;
        private String h_orgtk_ret_pwd;
        private String h_orgtk_ret_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_wct_no;
        private String h_use_psb_dt;
        private int mIndex;

        public DelayCoupon() {
        }

        public String getH_dlay_fare() {
            return this.h_dlay_fare;
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

        public String getH_use_psb_dt() {
            return this.h_use_psb_dt;
        }

        public int getIndex() {
            return this.mIndex;
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

        public void setIndex(int i8) {
            this.mIndex = i8;
        }
    }

    public class DelayTicketListRequest extends BaseRequest {
        private String dptDtTo;

        public DelayTicketListRequest() {
        }

        public String getDptDtTo() {
            return this.dptDtTo;
        }

        public void setDptDtTo(String str) {
            this.dptDtTo = str;
        }
    }

    public class DelayTicketListResponse extends BaseResponse {
        private DiscInfos disc_infos;

        public DelayTicketListResponse() {
        }

        public DiscInfos getDisc_infos() {
            return this.disc_infos;
        }
    }

    public class DiscInfos {
        private List<DelayCoupon> disc_info;

        public DiscInfos() {
        }

        public List<DelayCoupon> getDisc_info() {
            return this.disc_info;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassCardService passCardService = (PassCardService) getService(PassCardService.class);
        DelayTicketListRequest delayTicketListRequest = (DelayTicketListRequest) getRequest();
        return passCardService.getDelayTicketList(delayTicketListRequest.getDevice(), delayTicketListRequest.getVersion(), delayTicketListRequest.getKey(), delayTicketListRequest.getDptDtTo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_delay_ticket_list;
    }
}
