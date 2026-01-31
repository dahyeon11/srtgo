package com.korail.talk.network.request.reservation;

import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OPsg;
import com.korail.talk.network.data.reservation.old.OSeat;
import com.korail.talk.network.data.reservation.old.OSrcar;
import java.io.Serializable;
import z4.J;
import z4.N;

/* loaded from: classes.dex */
public class ReservationRequest extends BaseRequest implements Serializable {
    private String hidFreeFlg;
    private boolean isNotNonMemberShow;
    private String pbepInfo;
    private String pnrNo;
    private String txtCpNo;
    private String txtCustNm;
    private String txtCustPw;
    private String txtGdNo;
    private String txtJobId;
    private String txtMenuId;
    private String txtStndFlg;
    private OPsg oPsg = new OPsg();
    private OSeat oSeat = new OSeat();
    private OJrny oJrny = new OJrny();
    private OSrcar oSrcar = new OSrcar();

    public Object clone() {
        ReservationRequest reservationRequest = new ReservationRequest();
        reservationRequest.setPnrNo(getPnrNo());
        reservationRequest.setMenuId(getMenuId());
        reservationRequest.setJobId(getJobId());
        reservationRequest.setGdNo(getGdNo());
        reservationRequest.setHidFreeFlg(getHidFreeFlg());
        reservationRequest.setStndFlg(getStndFlg());
        reservationRequest.setCustNm(getCustNm());
        reservationRequest.setCpNo(getCpNo());
        reservationRequest.setCustPw(getCustPw());
        reservationRequest.setPbepInfo(getPbepInfo());
        reservationRequest.setOPsg((OPsg) getOPsg().clone());
        reservationRequest.setOSeat((OSeat) getOSeat().clone());
        reservationRequest.setOJrny((OJrny) getOJrny().clone());
        reservationRequest.setOSrcar((OSrcar) getOSrcar().clone());
        return reservationRequest;
    }

    public String getCpNo() {
        return this.txtCpNo;
    }

    public String getCustNm() {
        return this.txtCustNm;
    }

    public String getCustPw() {
        return this.txtCustPw;
    }

    public String getGdNo() {
        return this.txtGdNo;
    }

    public String getHidFreeFlg() {
        return this.hidFreeFlg;
    }

    public String getJobId() {
        return this.txtJobId;
    }

    public String getMenuId() {
        return this.txtMenuId;
    }

    public OJrny getOJrny() {
        return this.oJrny;
    }

    public OPsg getOPsg() {
        return this.oPsg;
    }

    public OSeat getOSeat() {
        return this.oSeat;
    }

    public OSrcar getOSrcar() {
        return this.oSrcar;
    }

    public String getPbepInfo() {
        return this.pbepInfo;
    }

    public String getPnrNo() {
        return this.pnrNo;
    }

    public String getStndFlg() {
        return this.txtStndFlg;
    }

    public boolean isNonmemberNotEnable() {
        String menuId = getMenuId();
        if (N.isNotNull(menuId) && "41".equals(menuId)) {
            return true;
        }
        String jobId = getJobId();
        if (N.isNotNull(jobId) && "1102".equals(jobId)) {
            return true;
        }
        OSeat oSeat = getOSeat();
        if (J.isSpecialRoom(oSeat.get(OSeat.SEAT_ATT_CD4)) || J.isSpecialRoom(oSeat.get(OSeat.SEAT_ATT_CD4_1))) {
            return true;
        }
        return isNotNonMemberShow();
    }

    public boolean isNotNonMemberShow() {
        return this.isNotNonMemberShow;
    }

    public void setCpNo(String str) {
        this.txtCpNo = str;
    }

    public void setCustNm(String str) {
        this.txtCustNm = str;
    }

    public void setCustPw(String str) {
        this.txtCustPw = str;
    }

    public void setGdNo(String str) {
        this.txtGdNo = str;
    }

    public void setHidFreeFlg(String str) {
        this.hidFreeFlg = str;
    }

    public void setJobId(String str) {
        this.txtJobId = str;
    }

    public void setMenuId(String str) {
        this.txtMenuId = str;
    }

    public void setNotNonMemberShow(boolean z8) {
        this.isNotNonMemberShow = z8;
    }

    public void setOJrny(OJrny oJrny) {
        this.oJrny.putAll(oJrny);
    }

    public void setOPsg(OPsg oPsg) {
        this.oPsg.putAll(oPsg);
    }

    public void setOSeat(OSeat oSeat) {
        this.oSeat.putAll(oSeat);
    }

    public void setOSrcar(OSrcar oSrcar) {
        this.oSrcar.putAll(oSrcar);
    }

    public void setPbepInfo(String str) {
        this.pbepInfo = str;
    }

    public void setPnrNo(String str) {
        this.pnrNo = str;
    }

    public void setStndFlg(String str) {
        this.txtStndFlg = str;
    }
}
