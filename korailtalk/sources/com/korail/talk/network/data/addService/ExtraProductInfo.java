package com.korail.talk.network.data.addService;

import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import z4.C6630d;

/* loaded from: classes.dex */
public class ExtraProductInfo extends BaseResponse implements Serializable {
    private List<AddSrvInfo> addSrvList;
    private String arvDt;
    private String arvRsStnCd;
    private String arvTm;
    private String dptDt;
    private String dptRsStnCd;
    private String dptTm;
    private String jrnySqno;
    private String pnrNo;

    public class AddSrvInfo implements Serializable {
        public String addSrvDvCd;
        public String addSrvMrkEntId;
        public String addSrvMrkEntNm;
        public String addSrvNm;
        public String addSrvPrgSttCd;
        public String addSrvReqNo;
        public String addSrvUtlAmt;
        public String cgPsRefAtclCont;
        public String coptEntRsvNo;
        public String imgPath;
        public String leadMsgCont1;
        public String leadMsgCont2;
        public String leadTeln;
        public String reqDt;
        public String reqQnty;
        public String reservationUrl;
        public String shopMapImgPath;
        public String spvsRsStnCd;
        public String spvsRsStnCdNm;

        public AddSrvInfo() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getAddSrvMrkEntId() {
            return this.addSrvMrkEntId;
        }

        public String getAddSrvMrkEntNm() {
            return this.addSrvMrkEntNm;
        }

        public String getAddSrvNm() {
            return this.addSrvNm;
        }

        public String getAddSrvPrgSttCd() {
            return this.addSrvPrgSttCd;
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getAddSrvUtlAmt() {
            return this.addSrvUtlAmt;
        }

        public String getCgPsRefAtclCont() {
            return this.cgPsRefAtclCont;
        }

        public String getCoptEntRsvNo() {
            return this.coptEntRsvNo;
        }

        public String getImgPath() {
            return this.imgPath;
        }

        public String getLeadMsgCont1() {
            return this.leadMsgCont1;
        }

        public String getLeadMsgCont2() {
            return this.leadMsgCont2;
        }

        public String getLeadTeln() {
            return this.leadTeln;
        }

        public String getReqDt() {
            return this.reqDt;
        }

        public String getReqQnty() {
            return this.reqQnty;
        }

        public String getReservationUrl() {
            return this.reservationUrl;
        }

        public String getShopMapImgPath() {
            return this.shopMapImgPath;
        }

        public String getSpvsRsStnCd() {
            return this.spvsRsStnCd;
        }

        public String getSpvsRsStnCdNm() {
            return this.spvsRsStnCdNm;
        }
    }

    public List<AddSrvInfo> getAddSrvList() {
        if (!C6630d.isNull(this.addSrvList)) {
            return this.addSrvList;
        }
        ArrayList arrayList = new ArrayList();
        this.addSrvList = arrayList;
        return arrayList;
    }

    public String getArvDt() {
        return this.arvDt;
    }

    public String getArvRsStnCd() {
        return this.arvRsStnCd;
    }

    public String getArvTm() {
        return this.arvTm;
    }

    public String getDptDt() {
        return this.dptDt;
    }

    public String getDptRsStnCd() {
        return this.dptRsStnCd;
    }

    public String getDptTm() {
        return this.dptTm;
    }

    public String getJrnySqno() {
        return this.jrnySqno;
    }

    public String getPnrNo() {
        return this.pnrNo;
    }
}
