package com.korail.talk.network.dao.receipt;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class ReceiptDao extends BaseDao {

    public class CashReceiptInfo {
        private String h_apv_mtd_nm;
        private String h_athn_dmn_rcgn_no;
        private String h_cash_rcet_apv_no;
        private String h_cash_rcet_txn_dv_cd;
        private int h_tot_apv_amt;

        public CashReceiptInfo() {
        }

        public String getH_apv_mtd_nm() {
            return this.h_apv_mtd_nm;
        }

        public String getH_athn_dmn_rcgn_no() {
            return this.h_athn_dmn_rcgn_no;
        }

        public String getH_cash_rcet_apv_no() {
            return this.h_cash_rcet_apv_no;
        }

        public String getH_cash_rcet_txn_dv_cd() {
            return this.h_cash_rcet_txn_dv_cd;
        }

        public int getH_tot_apv_amt() {
            return this.h_tot_apv_amt;
        }
    }

    public class ReceiptInfo {
        private List<CashReceiptInfo> cash_rcet_info;
        private String h_abrd_dt;
        private String h_arv_rs_stn_nm;
        private String h_arv_tm;
        private String h_cmtr_knd_cd;
        private int h_crd_ret_amt;
        private String h_dpt_rs_stn_nm;
        private String h_dpt_tm;
        private String h_jrny_tp_cd;
        private String h_prt_disc_knd_nm;
        private String h_prt_type;
        private int h_psg_type1_cnt;
        private int h_psg_type2_cnt;
        private int h_psg_type3_cnt;
        private String h_psrm_cl_nm;
        private int h_rcvd_amt;
        private int h_ret_fee;
        private int h_ret_rcvd_amt;
        private String h_stl_mb_crd_no;
        private String h_tk_knd_cd;
        private String h_tk_stt_cd;
        private String h_trn_clsf_cd;
        private String h_trn_clsf_nm;
        private String h_trn_no;
        private int h_xpoint_ret_amt;
        private List<StlInfo> stl_info;

        public ReceiptInfo() {
        }

        public List<CashReceiptInfo> getCash_rcet_info() {
            return this.cash_rcet_info;
        }

        public String getH_abrd_dt() {
            return this.h_abrd_dt;
        }

        public String getH_arv_rs_stn_nm() {
            return this.h_arv_rs_stn_nm;
        }

        public String getH_arv_tm() {
            return this.h_arv_tm;
        }

        public String getH_cmtr_knd_cd() {
            return this.h_cmtr_knd_cd;
        }

        public int getH_crd_ret_amt() {
            return this.h_crd_ret_amt;
        }

        public String getH_dpt_rs_stn_nm() {
            return this.h_dpt_rs_stn_nm;
        }

        public String getH_dpt_tm() {
            return this.h_dpt_tm;
        }

        public String getH_jrny_tp_cd() {
            return this.h_jrny_tp_cd;
        }

        public String getH_prt_disc_knd_nm() {
            return this.h_prt_disc_knd_nm;
        }

        public String getH_prt_type() {
            return this.h_prt_type;
        }

        public int getH_psg_type1_cnt() {
            return this.h_psg_type1_cnt;
        }

        public int getH_psg_type2_cnt() {
            return this.h_psg_type2_cnt;
        }

        public int getH_psg_type3_cnt() {
            return this.h_psg_type3_cnt;
        }

        public String getH_psrm_cl_nm() {
            return this.h_psrm_cl_nm;
        }

        public int getH_rcvd_amt() {
            return this.h_rcvd_amt;
        }

        public int getH_ret_fee() {
            return this.h_ret_fee;
        }

        public int getH_ret_rcvd_amt() {
            return this.h_ret_rcvd_amt;
        }

        public String getH_stl_mb_crd_no() {
            return this.h_stl_mb_crd_no;
        }

        public String getH_tk_knd_cd() {
            return this.h_tk_knd_cd;
        }

        public String getH_tk_stt_cd() {
            return this.h_tk_stt_cd;
        }

        public String getH_trn_clsf_cd() {
            return this.h_trn_clsf_cd;
        }

        public String getH_trn_clsf_nm() {
            return this.h_trn_clsf_nm;
        }

        public String getH_trn_no() {
            return this.h_trn_no;
        }

        public int getH_xpoint_ret_amt() {
            return this.h_xpoint_ret_amt;
        }

        public List<StlInfo> getStl_info() {
            return this.stl_info;
        }
    }

    public class ReceiptInfos {
        private List<ReceiptInfo> receipt_info;

        public ReceiptInfos() {
        }

        public List<ReceiptInfo> getReceipt_info() {
            return this.receipt_info;
        }
    }

    public class ReceiptRequest extends BaseRequest {
        private String h_orgtk_sale_dt;
        private String h_orgtk_sale_sqno;
        private String h_orgtk_tk_ret_pwd;
        private String h_orgtk_wct_no;

        public ReceiptRequest() {
        }

        public String getH_orgtk_sale_dt() {
            return this.h_orgtk_sale_dt;
        }

        public String getH_orgtk_sale_sqno() {
            return this.h_orgtk_sale_sqno;
        }

        public String getH_orgtk_tk_ret_pwd() {
            return this.h_orgtk_tk_ret_pwd;
        }

        public String getH_orgtk_wct_no() {
            return this.h_orgtk_wct_no;
        }

        public void setH_orgtk_sale_dt(String str) {
            this.h_orgtk_sale_dt = str;
        }

        public void setH_orgtk_sale_sqno(String str) {
            this.h_orgtk_sale_sqno = str;
        }

        public void setH_orgtk_tk_ret_pwd(String str) {
            this.h_orgtk_tk_ret_pwd = str;
        }

        public void setH_orgtk_wct_no(String str) {
            this.h_orgtk_wct_no = str;
        }
    }

    public class ReceiptResponse extends BaseResponse {
        private ReceiptInfos receipt_infos;

        public ReceiptResponse() {
        }

        public ReceiptInfos getReceipt_infos() {
            return this.receipt_infos;
        }
    }

    public class StlInfo {
        private String h_acnt_no;
        private String h_apv_dt;
        private String h_apv_no;
        private int h_ismt_mnth_num;
        private int h_stl_amt;
        private String h_stl_crd_no;
        private String h_stl_way_nm;
        private String h_xpot_no;

        public StlInfo() {
        }

        public String getH_acnt_no() {
            return this.h_acnt_no;
        }

        public String getH_apv_dt() {
            return this.h_apv_dt;
        }

        public String getH_apv_no() {
            return this.h_apv_no;
        }

        public int getH_ismt_mnth_num() {
            return this.h_ismt_mnth_num;
        }

        public int getH_stl_amt() {
            return this.h_stl_amt;
        }

        public String getH_stl_crd_no() {
            return this.h_stl_crd_no;
        }

        public String getH_stl_way_nm() {
            return this.h_stl_way_nm;
        }

        public String getH_xpot_no() {
            return this.h_xpot_no;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReceiptService receiptService = (ReceiptService) getService(ReceiptService.class);
        ReceiptRequest receiptRequest = (ReceiptRequest) getRequest();
        return receiptService.getTicketReceipt(receiptRequest.getDevice(), receiptRequest.getVersion(), receiptRequest.getKey(), receiptRequest.getH_orgtk_sale_dt(), receiptRequest.getH_orgtk_wct_no(), receiptRequest.getH_orgtk_sale_sqno(), receiptRequest.getH_orgtk_tk_ret_pwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_receipt;
    }
}
