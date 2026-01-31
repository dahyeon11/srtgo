package com.korail.talk.network.dao.cart;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;
import z4.C6630d;

/* loaded from: classes.dex */
public class CartListDao extends BaseDao {

    public class CartInfo {
        private String addSrvDvCd;
        private String coptEntRsvNo;
        private String h_add_srv_mrk_ent_id;
        private String h_add_srv_mrk_ent_nm;
        private String h_cust_no;
        private String h_dpt_dt;
        private String h_filler;
        private String h_fld_stl_dv;
        private String h_gd_nm;
        private String h_item_dv_cd;
        private String h_item_dv_nm;
        private String h_item_sqno;
        private String h_jrny_sqno;
        private String h_jrny_tp_cd;
        private String h_lump_stl_tgt_no;
        private String h_pnr_no;
        private String h_rcvd_amt;
        private String h_rsv_rcp_dt;
        private String h_spvs_rs_stn_cd;
        private String h_stl_extns_tno;
        private String h_stl_lmt_tm;
        private String h_stl_mns_allw_val;
        private int h_tk_cnt;
        private String h_vr_rsv_no;
        private String utlClsTm;
        private String utlStDt;
        private String utlStTm;

        public CartInfo() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getCoptEntRsvNo() {
            return this.coptEntRsvNo;
        }

        public String getH_add_srv_mrk_ent_id() {
            return this.h_add_srv_mrk_ent_id;
        }

        public String getH_add_srv_mrk_ent_nm() {
            return this.h_add_srv_mrk_ent_nm;
        }

        public String getH_cust_no() {
            return this.h_cust_no;
        }

        public String getH_dpt_dt() {
            return this.h_dpt_dt;
        }

        public String getH_filler() {
            return this.h_filler;
        }

        public String getH_fld_stl_dv() {
            return this.h_fld_stl_dv;
        }

        public String getH_gd_nm() {
            return this.h_gd_nm;
        }

        public String getH_item_dv_cd() {
            return this.h_item_dv_cd;
        }

        public String getH_item_dv_nm() {
            return this.h_item_dv_nm;
        }

        public String getH_item_sqno() {
            return this.h_item_sqno;
        }

        public String getH_jrny_sqno() {
            return this.h_jrny_sqno;
        }

        public String getH_jrny_tp_cd() {
            return this.h_jrny_tp_cd;
        }

        public String getH_lump_stl_tgt_no() {
            return this.h_lump_stl_tgt_no;
        }

        public String getH_pnr_no() {
            return this.h_pnr_no;
        }

        public String getH_rcvd_amt() {
            return this.h_rcvd_amt;
        }

        public String getH_rsv_rcp_dt() {
            return this.h_rsv_rcp_dt;
        }

        public String getH_spvs_rs_stn_cd() {
            return this.h_spvs_rs_stn_cd;
        }

        public String getH_stl_extns_tno() {
            return this.h_stl_extns_tno;
        }

        public String getH_stl_lmt_tm() {
            return this.h_stl_lmt_tm;
        }

        public String getH_stl_mns_allw_val() {
            return this.h_stl_mns_allw_val;
        }

        public int getH_tk_cnt() {
            return this.h_tk_cnt;
        }

        public String getH_vr_rsv_no() {
            return this.h_vr_rsv_no;
        }

        public String getUtlClsTm() {
            return this.utlClsTm;
        }

        public String getUtlStDt() {
            return this.utlStDt;
        }

        public String getUtlStTm() {
            return this.utlStTm;
        }

        public void setAddSrvDvCd(String str) {
            this.addSrvDvCd = str;
        }

        public void setCoptEntRsvNo(String str) {
            this.coptEntRsvNo = str;
        }

        public void setH_add_srv_mrk_ent_id(String str) {
            this.h_add_srv_mrk_ent_id = str;
        }

        public void setH_add_srv_mrk_ent_nm(String str) {
            this.h_add_srv_mrk_ent_nm = str;
        }

        public void setH_cust_no(String str) {
            this.h_cust_no = str;
        }

        public void setH_dpt_dt(String str) {
            this.h_dpt_dt = str;
        }

        public void setH_filler(String str) {
            this.h_filler = str;
        }

        public void setH_fld_stl_dv(String str) {
            this.h_fld_stl_dv = str;
        }

        public void setH_gd_nm(String str) {
            this.h_gd_nm = str;
        }

        public void setH_item_dv_cd(String str) {
            this.h_item_dv_cd = str;
        }

        public void setH_item_dv_nm(String str) {
            this.h_item_dv_nm = str;
        }

        public void setH_item_sqno(String str) {
            this.h_item_sqno = str;
        }

        public void setH_jrny_sqno(String str) {
            this.h_jrny_sqno = str;
        }

        public void setH_jrny_tp_cd(String str) {
            this.h_jrny_tp_cd = str;
        }

        public void setH_lump_stl_tgt_no(String str) {
            this.h_lump_stl_tgt_no = str;
        }

        public void setH_pnr_no(String str) {
            this.h_pnr_no = str;
        }

        public void setH_rcvd_amt(String str) {
            this.h_rcvd_amt = str;
        }

        public void setH_rsv_rcp_dt(String str) {
            this.h_rsv_rcp_dt = str;
        }

        public void setH_spvs_rs_stn_cd(String str) {
            this.h_spvs_rs_stn_cd = str;
        }

        public void setH_stl_extns_tno(String str) {
            this.h_stl_extns_tno = str;
        }

        public void setH_stl_lmt_tm(String str) {
            this.h_stl_lmt_tm = str;
        }

        public void setH_stl_mns_allw_val(String str) {
            this.h_stl_mns_allw_val = str;
        }

        public void setH_tk_cnt(int i8) {
            this.h_tk_cnt = i8;
        }

        public void setH_vr_rsv_no(String str) {
            this.h_vr_rsv_no = str;
        }

        public void setUtlClsTm(String str) {
            this.utlClsTm = str;
        }

        public void setUtlStDt(String str) {
            this.utlStDt = str;
        }

        public void setUtlStTm(String str) {
            this.utlStTm = str;
        }
    }

    public class CartInfos {
        private List<CartInfo> cart_info;

        public CartInfos() {
        }

        public List<CartInfo> getCart_info() {
            return this.cart_info;
        }
    }

    public class CartListRequest extends BaseRequest {
        public String addSrvReqNo;
        public String pnrNo;

        public CartListRequest() {
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getPnrNo() {
            return C6630d.isNull(this.pnrNo) ? "" : this.pnrNo;
        }

        public void setAddSrvReqNo(String str) {
            this.addSrvReqNo = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }
    }

    public class CartListResponse extends BaseResponse {
        private CartInfos cart_infos;

        public CartListResponse() {
        }

        public CartInfos getCart_infos() {
            return this.cart_infos;
        }
    }

    public class MainInfo {
        private String h_abrd_dt_from;
        private String h_abrd_dt_to;
        private String h_cg_ps_id;
        private String h_cust_no;
        private String h_dv_cd;
        private String h_filler;
        private String h_intSelectPageNo;
        private String h_job_id;
        private String h_msg_cd;
        private String h_page_no;
        private String h_row_cnt;
        private String h_spbk_whl_cnt;
        private String h_stl_scsn_flg;
        private String h_tot_page_cnt;
        private String h_ver_no;
        private String h_wct_no;
        private String h_work_dt;
        private String h_work_tm;

        public MainInfo() {
        }

        public String getH_abrd_dt_from() {
            return this.h_abrd_dt_from;
        }

        public String getH_abrd_dt_to() {
            return this.h_abrd_dt_to;
        }

        public String getH_cg_ps_id() {
            return this.h_cg_ps_id;
        }

        public String getH_cust_no() {
            return this.h_cust_no;
        }

        public String getH_dv_cd() {
            return this.h_dv_cd;
        }

        public String getH_filler() {
            return this.h_filler;
        }

        public String getH_intSelectPageNo() {
            return this.h_intSelectPageNo;
        }

        public String getH_job_id() {
            return this.h_job_id;
        }

        public String getH_msg_cd() {
            return this.h_msg_cd;
        }

        public String getH_page_no() {
            return this.h_page_no;
        }

        public String getH_row_cnt() {
            return this.h_row_cnt;
        }

        public String getH_spbk_whl_cnt() {
            return this.h_spbk_whl_cnt;
        }

        public String getH_stl_scsn_flg() {
            return this.h_stl_scsn_flg;
        }

        public String getH_tot_page_cnt() {
            return this.h_tot_page_cnt;
        }

        public String getH_ver_no() {
            return this.h_ver_no;
        }

        public String getH_wct_no() {
            return this.h_wct_no;
        }

        public String getH_work_dt() {
            return this.h_work_dt;
        }

        public String getH_work_tm() {
            return this.h_work_tm;
        }

        public void setH_abrd_dt_from(String str) {
            this.h_abrd_dt_from = str;
        }

        public void setH_abrd_dt_to(String str) {
            this.h_abrd_dt_to = str;
        }

        public void setH_cg_ps_id(String str) {
            this.h_cg_ps_id = str;
        }

        public void setH_cust_no(String str) {
            this.h_cust_no = str;
        }

        public void setH_dv_cd(String str) {
            this.h_dv_cd = str;
        }

        public void setH_filler(String str) {
            this.h_filler = str;
        }

        public void setH_intSelectPageNo(String str) {
            this.h_intSelectPageNo = str;
        }

        public void setH_job_id(String str) {
            this.h_job_id = str;
        }

        public void setH_msg_cd(String str) {
            this.h_msg_cd = str;
        }

        public void setH_page_no(String str) {
            this.h_page_no = str;
        }

        public void setH_row_cnt(String str) {
            this.h_row_cnt = str;
        }

        public void setH_spbk_whl_cnt(String str) {
            this.h_spbk_whl_cnt = str;
        }

        public void setH_stl_scsn_flg(String str) {
            this.h_stl_scsn_flg = str;
        }

        public void setH_tot_page_cnt(String str) {
            this.h_tot_page_cnt = str;
        }

        public void setH_ver_no(String str) {
            this.h_ver_no = str;
        }

        public void setH_wct_no(String str) {
            this.h_wct_no = str;
        }

        public void setH_work_dt(String str) {
            this.h_work_dt = str;
        }

        public void setH_work_tm(String str) {
            this.h_work_tm = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CartService cartService = (CartService) getService(CartService.class);
        CartListRequest cartListRequest = (CartListRequest) getRequest();
        return cartService.getCartList(cartListRequest.getDevice(), cartListRequest.getVersion(), cartListRequest.getKey(), cartListRequest.getPnrNo(), cartListRequest.getAddSrvReqNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cart_list;
    }
}
