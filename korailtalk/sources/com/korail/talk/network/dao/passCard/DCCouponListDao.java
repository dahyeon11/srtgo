package com.korail.talk.network.dao.passCard;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;
import z4.C6630d;

/* loaded from: classes.dex */
public class DCCouponListDao extends BaseDao {

    public class CouponInfos {
        private List<DiscountCoupon> coupon_info;

        public CouponInfos() {
        }

        public List<DiscountCoupon> getCoupon_info() {
            return this.coupon_info;
        }
    }

    public class DCCouponListRequest extends BaseRequest {
        private String pnr;
        private String txtSelPage;

        public DCCouponListRequest() {
        }

        public String getPnr() {
            return this.pnr;
        }

        public String getTxtSelPage() {
            return this.txtSelPage;
        }

        public void setPnr(String str) {
            this.pnr = str;
        }

        public void setTxtSelPage(String str) {
            this.txtSelPage = str;
        }
    }

    public class DCCouponListResponse extends BaseResponse {
        private CouponInfos coupon_infos;
        private String h_page_no;
        private String h_tot_page_cnt;

        public DCCouponListResponse() {
        }

        public CouponInfos getCoupon_infos() {
            return this.coupon_infos;
        }

        public String getH_page_no() {
            return this.h_page_no;
        }

        public String getH_tot_page_cnt() {
            return this.h_tot_page_cnt;
        }
    }

    public class DiscountCoupon {
        private String guide;
        private String h_cpn_no;
        private String h_disc_rt_amt_dv_cd;
        private String h_fdcert_mg_cls_dt;
        private String h_inwk_fare_disc_rt_amt;
        private String h_inwk_prc_disc_rt_amt;
        private String h_rmk_1_cont;
        private String h_rmk_2_cont;
        private String h_rmk_3_cont;
        private String h_wknd_fare_disc_rt_amt;
        private String h_wknd_prc_disc_rt_amt;
        private int mIndex;

        public DiscountCoupon() {
        }

        public String getGuide() {
            return this.guide;
        }

        public String getH_cpn_no() {
            return this.h_cpn_no;
        }

        public String getH_disc_rt_amt_dv_cd() {
            return this.h_disc_rt_amt_dv_cd;
        }

        public String getH_fdcert_mg_cls_dt() {
            return this.h_fdcert_mg_cls_dt;
        }

        public String getH_inwk_fare_disc_rt_amt() {
            return this.h_inwk_fare_disc_rt_amt;
        }

        public String getH_inwk_prc_disc_rt_amt() {
            return this.h_inwk_prc_disc_rt_amt;
        }

        public String getH_rmk_1_cont() {
            return this.h_rmk_1_cont;
        }

        public String getH_rmk_2_cont() {
            return this.h_rmk_2_cont;
        }

        public String getH_rmk_3_cont() {
            return this.h_rmk_3_cont;
        }

        public String getH_wknd_fare_disc_rt_amt() {
            return this.h_wknd_fare_disc_rt_amt;
        }

        public String getH_wknd_prc_disc_rt_amt() {
            return this.h_wknd_prc_disc_rt_amt;
        }

        public int getIndex() {
            return this.mIndex;
        }

        public void setH_cpn_no(String str) {
            this.h_cpn_no = str;
        }

        public void setIndex(int i8) {
            this.mIndex = i8;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassCardService passCardService = (PassCardService) getService(PassCardService.class);
        DCCouponListRequest dCCouponListRequest = (DCCouponListRequest) getRequest();
        return passCardService.getDiscountCoupon(dCCouponListRequest.getDevice(), dCCouponListRequest.getVersion(), dCCouponListRequest.getKey(), dCCouponListRequest.getTxtSelPage(), dCCouponListRequest.getPnr());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_coupon_list;
    }

    public boolean isMore() {
        String h_tot_page_cnt = ((DCCouponListResponse) getResponse()).getH_tot_page_cnt();
        String h_page_no = ((DCCouponListResponse) getResponse()).getH_page_no();
        return (C6630d.isNull(h_tot_page_cnt) || C6630d.isNull(h_page_no) || Integer.parseInt(h_page_no) >= Integer.parseInt(h_tot_page_cnt)) ? false : true;
    }
}
