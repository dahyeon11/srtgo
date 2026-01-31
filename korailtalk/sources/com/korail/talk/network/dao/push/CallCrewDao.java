package com.korail.talk.network.dao.push;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CallCrewDao extends BaseDao implements Serializable {

    public class CallCrewDaoRequest extends BaseRequest implements Serializable {
        private String coutMsgDvCd;
        private String intgMsgCd1;
        private String intgMsgCd10;
        private String intgMsgCd2;
        private String intgMsgCd3;
        private String intgMsgCd4;
        private String intgMsgCd5;
        private String intgMsgCd6;
        private String intgMsgCd7;
        private String intgMsgCd8;
        private String intgMsgCd9;
        private String intgMsgCont;
        private String jrnySqno;
        private String pnrNo;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String sndSqno;
        private String tkRetPwd;

        public CallCrewDaoRequest() {
        }

        public String getCoutMsgDvCd() {
            return this.coutMsgDvCd;
        }

        public String getIntgMsgCd1() {
            return this.intgMsgCd1;
        }

        public String getIntgMsgCd10() {
            return this.intgMsgCd10;
        }

        public String getIntgMsgCd2() {
            return this.intgMsgCd2;
        }

        public String getIntgMsgCd3() {
            return this.intgMsgCd3;
        }

        public String getIntgMsgCd4() {
            return this.intgMsgCd4;
        }

        public String getIntgMsgCd5() {
            return this.intgMsgCd5;
        }

        public String getIntgMsgCd6() {
            return this.intgMsgCd6;
        }

        public String getIntgMsgCd7() {
            return this.intgMsgCd7;
        }

        public String getIntgMsgCd8() {
            return this.intgMsgCd8;
        }

        public String getIntgMsgCd9() {
            return this.intgMsgCd9;
        }

        public String getIntgMsgCont() {
            return this.intgMsgCont;
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public String getSndSqno() {
            return this.sndSqno;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }

        public void setCoutMsgDvCd(String str) {
            this.coutMsgDvCd = str;
        }

        public void setIntgMsgCd1(String str) {
            this.intgMsgCd1 = str;
        }

        public void setIntgMsgCd10(String str) {
            this.intgMsgCd10 = str;
        }

        public void setIntgMsgCd2(String str) {
            this.intgMsgCd2 = str;
        }

        public void setIntgMsgCd3(String str) {
            this.intgMsgCd3 = str;
        }

        public void setIntgMsgCd4(String str) {
            this.intgMsgCd4 = str;
        }

        public void setIntgMsgCd5(String str) {
            this.intgMsgCd5 = str;
        }

        public void setIntgMsgCd6(String str) {
            this.intgMsgCd6 = str;
        }

        public void setIntgMsgCd7(String str) {
            this.intgMsgCd7 = str;
        }

        public void setIntgMsgCd8(String str) {
            this.intgMsgCd8 = str;
        }

        public void setIntgMsgCd9(String str) {
            this.intgMsgCd9 = str;
        }

        public void setIntgMsgCont(String str) {
            this.intgMsgCont = str;
        }

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setSaleDt(String str) {
            this.saleDt = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }

        public void setSndSqno(String str) {
            this.sndSqno = str;
        }

        public void setTkRetPwd(String str) {
            this.tkRetPwd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PushService pushService = (PushService) getService(PushService.class);
        CallCrewDaoRequest callCrewDaoRequest = (CallCrewDaoRequest) getRequest();
        return pushService.callCrew(callCrewDaoRequest.getDevice(), callCrewDaoRequest.getVersion(), callCrewDaoRequest.getKey(), callCrewDaoRequest.getPnrNo(), callCrewDaoRequest.getJrnySqno(), callCrewDaoRequest.getSaleWctNo(), callCrewDaoRequest.getSaleDt(), callCrewDaoRequest.getSaleSqno(), callCrewDaoRequest.getTkRetPwd(), callCrewDaoRequest.getSndSqno(), callCrewDaoRequest.getCoutMsgDvCd(), callCrewDaoRequest.getIntgMsgCd1(), callCrewDaoRequest.getIntgMsgCd2(), callCrewDaoRequest.getIntgMsgCd3(), callCrewDaoRequest.getIntgMsgCd4(), callCrewDaoRequest.getIntgMsgCd5(), callCrewDaoRequest.getIntgMsgCd6(), callCrewDaoRequest.getIntgMsgCd7(), callCrewDaoRequest.getIntgMsgCd8(), callCrewDaoRequest.getIntgMsgCd9(), callCrewDaoRequest.getIntgMsgCd10(), callCrewDaoRequest.getIntgMsgCont());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_call_crew;
    }
}
