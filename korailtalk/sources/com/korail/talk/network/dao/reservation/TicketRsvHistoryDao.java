package com.korail.talk.network.dao.reservation;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TicketRsvHistoryDao extends BaseDao {

    public class JrnyInfo {
        private TrainInfos train_infos;

        public JrnyInfo() {
        }

        public TrainInfos getTrain_infos() {
            return this.train_infos;
        }
    }

    public class JrnyInfos {
        private List<JrnyInfo> jrny_info;

        public JrnyInfos() {
        }

        public List<JrnyInfo> getJrny_info() {
            return this.jrny_info;
        }
    }

    public class TicketRsvHistoryResponse extends BaseResponse {
        private JrnyInfos jrny_infos;

        public TicketRsvHistoryResponse() {
        }

        public JrnyInfos getJrny_infos() {
            return this.jrny_infos;
        }
    }

    public class TrainInfo {
        private String h_acpt_ps_flg;
        private String h_arv_rs_stn_nm;
        private String h_arv_tm;
        private String h_dpt_rs_stn_nm;
        private String h_dpt_tm;
        private String h_ise_psb_tm;
        private String h_ntisu_lmt_dt;
        private String h_ntisu_lmt_tm;
        private String h_ntisu_psb_dt;
        private String h_payment_flg;
        private String h_payment_msg;
        private String h_pnr_no;
        private String h_rsv_tp_cd;
        private String h_run_dt;
        private String h_stl_flg;
        private int h_tot_seat_cnt;
        private int h_tot_stnd_cnt;
        private String h_trn_clsf_cd;
        private String h_trn_clsf_nm;
        private String h_trn_no;

        public TrainInfo() {
        }

        public String getH_acpt_ps_flg() {
            return this.h_acpt_ps_flg;
        }

        public String getH_arv_rs_stn_nm() {
            return this.h_arv_rs_stn_nm;
        }

        public String getH_arv_tm() {
            return this.h_arv_tm;
        }

        public String getH_dpt_rs_stn_nm() {
            return this.h_dpt_rs_stn_nm;
        }

        public String getH_dpt_tm() {
            return this.h_dpt_tm;
        }

        public String getH_ise_psb_tm() {
            return this.h_ise_psb_tm;
        }

        public String getH_ntisu_lmt_dt() {
            return this.h_ntisu_lmt_dt;
        }

        public String getH_ntisu_lmt_tm() {
            return this.h_ntisu_lmt_tm;
        }

        public String getH_ntisu_psb_dt() {
            return this.h_ntisu_psb_dt;
        }

        public String getH_payment_flg() {
            return this.h_payment_flg;
        }

        public String getH_payment_msg() {
            return this.h_payment_msg;
        }

        public String getH_pnr_no() {
            return this.h_pnr_no;
        }

        public String getH_rsv_tp_cd() {
            return this.h_rsv_tp_cd;
        }

        public String getH_run_dt() {
            return this.h_run_dt;
        }

        public String getH_stl_flg() {
            return this.h_stl_flg;
        }

        public int getH_tot_seat_cnt() {
            return this.h_tot_seat_cnt;
        }

        public int getH_tot_stnd_cnt() {
            return this.h_tot_stnd_cnt;
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
    }

    public class TrainInfos {
        private List<TrainInfo> train_info;

        public TrainInfos() {
        }

        public List<TrainInfo> getTrain_info() {
            return this.train_info;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ReservationService reservationService = (ReservationService) getService(ReservationService.class);
        BaseRequest baseRequest = new BaseRequest();
        return reservationService.getRsvHistory(baseRequest.getDevice(), baseRequest.getVersion(), baseRequest.getKey());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_rsv_history;
    }
}
