package com.korail.talk.network.dao.myTicket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SpecialRoomUpgradeProcessDao extends BaseDao {

    public static class SpecialRoomUpgradeProcessRequest extends BaseRequest {
        private String crdInpWayCd;
        private String feeProyStlSqno;
        private String ismtMnthNum;
        private String lumpStlTgtNo;
        private String mnsGridcnt;
        private String mnsStlAmt;
        private String pontDvCd;
        private String pontInpDvCd;
        private String prepCrdTxnAftAmt;
        private String prepCrdTxnBfAmt;
        private String stlMnsCd;
        private String stlMnsSqno;
        private String totCncRetAmt;
        private String totCncRetFee;
        private String totTxnAmt;

        public String getCrdInpWayCd() {
            return this.crdInpWayCd;
        }

        public String getFeeProyStlSqno() {
            return this.feeProyStlSqno;
        }

        public String getIsmtMnthNum() {
            return this.ismtMnthNum;
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public String getMnsGridcnt() {
            return this.mnsGridcnt;
        }

        public String getMnsStlAmt() {
            return this.mnsStlAmt;
        }

        public String getPontDvCd() {
            return this.pontDvCd;
        }

        public String getPontInpDvCd() {
            return this.pontInpDvCd;
        }

        public String getPrepCrdTxnAftAmt() {
            return this.prepCrdTxnAftAmt;
        }

        public String getPrepCrdTxnBfAmt() {
            return this.prepCrdTxnBfAmt;
        }

        public String getStlMnsCd() {
            return this.stlMnsCd;
        }

        public String getStlMnsSqno() {
            return this.stlMnsSqno;
        }

        public String getTotCncRetAmt() {
            return this.totCncRetAmt;
        }

        public String getTotCncRetFee() {
            return this.totCncRetFee;
        }

        public String getTotTxnAmt() {
            return this.totTxnAmt;
        }

        public void setCrdInpWayCd(String str) {
            this.crdInpWayCd = str;
        }

        public void setFeeProyStlSqno(String str) {
            this.feeProyStlSqno = str;
        }

        public void setIsmtMnthNum(String str) {
            this.ismtMnthNum = str;
        }

        public void setLumpStlTgtNo(String str) {
            this.lumpStlTgtNo = str;
        }

        public void setMnsGridcnt(String str) {
            this.mnsGridcnt = str;
        }

        public void setMnsStlAmt(String str) {
            this.mnsStlAmt = str;
        }

        public void setPontDvCd(String str) {
            this.pontDvCd = str;
        }

        public void setPontInpDvCd(String str) {
            this.pontInpDvCd = str;
        }

        public void setPrepCrdTxnAftAmt(String str) {
            this.prepCrdTxnAftAmt = str;
        }

        public void setPrepCrdTxnBfAmt(String str) {
            this.prepCrdTxnBfAmt = str;
        }

        public void setStlMnsCd(String str) {
            this.stlMnsCd = str;
        }

        public void setStlMnsSqno(String str) {
            this.stlMnsSqno = str;
        }

        public void setTotCncRetAmt(String str) {
            this.totCncRetAmt = str;
        }

        public void setTotCncRetFee(String str) {
            this.totCncRetFee = str;
        }

        public void setTotTxnAmt(String str) {
            this.totTxnAmt = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        MyTicketService myTicketService = (MyTicketService) getService(MyTicketService.class);
        SpecialRoomUpgradeProcessRequest specialRoomUpgradeProcessRequest = (SpecialRoomUpgradeProcessRequest) getRequest();
        return myTicketService.procUpgrade(specialRoomUpgradeProcessRequest.getDevice(), specialRoomUpgradeProcessRequest.getVersion(), specialRoomUpgradeProcessRequest.getKey(), specialRoomUpgradeProcessRequest.getTotTxnAmt(), specialRoomUpgradeProcessRequest.getTotCncRetAmt(), specialRoomUpgradeProcessRequest.getTotCncRetFee(), specialRoomUpgradeProcessRequest.getFeeProyStlSqno(), specialRoomUpgradeProcessRequest.getLumpStlTgtNo(), specialRoomUpgradeProcessRequest.getMnsGridcnt(), specialRoomUpgradeProcessRequest.getStlMnsSqno(), specialRoomUpgradeProcessRequest.getStlMnsCd(), specialRoomUpgradeProcessRequest.getMnsStlAmt(), specialRoomUpgradeProcessRequest.getCrdInpWayCd(), specialRoomUpgradeProcessRequest.getIsmtMnthNum(), specialRoomUpgradeProcessRequest.getPontDvCd(), specialRoomUpgradeProcessRequest.getPontInpDvCd(), specialRoomUpgradeProcessRequest.getPrepCrdTxnBfAmt(), specialRoomUpgradeProcessRequest.getPrepCrdTxnAftAmt());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cart_upgradeproc_service;
    }
}
