package com.korail.talk.network.dao.refund;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class RefundVerifyTicketDao extends BaseDao {

    public class RefundVerifyTicketRequest extends BaseRequest {
        private String retNo1;
        private String retNo2;
        private String retNo3;
        private String retNo4;
        private String strName;

        public RefundVerifyTicketRequest() {
        }

        public String getRetNo1() {
            return this.retNo1;
        }

        public String getRetNo2() {
            return this.retNo2;
        }

        public String getRetNo3() {
            return this.retNo3;
        }

        public String getRetNo4() {
            return this.retNo4;
        }

        public String getStrName() {
            return this.strName;
        }

        public void setRetNo1(String str) {
            this.retNo1 = str;
        }

        public void setRetNo2(String str) {
            this.retNo2 = str;
        }

        public void setRetNo3(String str) {
            this.retNo3 = str;
        }

        public void setRetNo4(String str) {
            this.retNo4 = str;
        }

        public void setStrName(String str) {
            this.strName = str;
        }
    }

    public class RefundVerifyTicketResponse extends BaseResponse implements Serializable {
        private ArrayList<Orgtkinfo> orgtkinfo_list;
        private String poppMsg;
        private String rcvd_amt;
        private String ret_amt;
        private String ret_fee;

        public class JrnyInfo implements Serializable {
            private String arv_rs_stn_cd;
            private String arv_tm;
            private String dpt_dt;
            private String dpt_rs_stn_cd;
            private String dpt_tm;
            private ArrayList<SeatInfo> seatinfo_list;
            private String trn_gp_cd;
            private String trn_no;

            public JrnyInfo() {
            }

            public String geArv_tm() {
                return this.arv_tm;
            }

            public String getArv_rs_stn_cd() {
                return this.arv_rs_stn_cd;
            }

            public String getDpt_dt() {
                return this.dpt_dt;
            }

            public String getDpt_rs_stn_cd() {
                return this.dpt_rs_stn_cd;
            }

            public String getDpt_tm() {
                return this.dpt_tm;
            }

            public ArrayList<SeatInfo> getSeatinfo_list() {
                return this.seatinfo_list;
            }

            public String getTrn_gp_cd() {
                return this.trn_gp_cd;
            }

            public String getTrn_no() {
                return this.trn_no;
            }
        }

        public class Orgtkinfo implements Serializable {
            private ArrayList<JrnyInfo> jrnyinfo_list;
            private String ogtk_ret_pwd;
            private String ogtk_sale_dt;
            private String ogtk_sale_sqno;
            private String ogtk_sale_wct_no;
            private String prnNo;
            private String ret_dv_cd;
            private String ret_rsn_cd;
            private String tk_knd_cd;

            public Orgtkinfo() {
            }

            public ArrayList<JrnyInfo> getJrnyinfo_list() {
                return this.jrnyinfo_list;
            }

            public String getOgtk_ret_pwd() {
                return this.ogtk_ret_pwd;
            }

            public String getOgtk_sale_dt() {
                return this.ogtk_sale_dt;
            }

            public String getOgtk_sale_sqno() {
                return this.ogtk_sale_sqno;
            }

            public String getOgtk_sale_wct_no() {
                return this.ogtk_sale_wct_no;
            }

            public String getPrnNo() {
                return this.prnNo;
            }

            public String getRet_dv_cd() {
                return this.ret_dv_cd;
            }

            public String getRet_rsn_cd() {
                return this.ret_rsn_cd;
            }

            public String getTk_knd_cd() {
                return this.tk_knd_cd;
            }
        }

        public class SeatInfo implements Serializable {
            private String psrm_cl_nm;
            private String scar_no;
            private String seat_no;

            public SeatInfo() {
            }

            public String getPsrm_cl_nm() {
                return this.psrm_cl_nm;
            }

            public String getScar_no() {
                return this.scar_no;
            }

            public String getSeat_no() {
                return this.seat_no;
            }
        }

        public RefundVerifyTicketResponse() {
        }

        public ArrayList<Orgtkinfo> getOrgTkInfos() {
            return this.orgtkinfo_list;
        }

        public String getPopMsg() {
            return this.poppMsg;
        }

        public String getRcvd_amt() {
            return this.rcvd_amt;
        }

        public String getRet_amt() {
            return this.ret_amt;
        }

        public String getRet_fee() {
            return this.ret_fee;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        RefundService refundService = (RefundService) getService(RefundService.class);
        RefundVerifyTicketRequest refundVerifyTicketRequest = (RefundVerifyTicketRequest) getRequest();
        return refundService.verifyOnlineRefunds(refundVerifyTicketRequest.getDevice(), refundVerifyTicketRequest.getVersion(), refundVerifyTicketRequest.getKey(), refundVerifyTicketRequest.getRetNo1(), refundVerifyTicketRequest.getRetNo2(), refundVerifyTicketRequest.getRetNo3(), refundVerifyTicketRequest.getRetNo4(), refundVerifyTicketRequest.getStrName());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_refund_verify_ticket;
    }
}
