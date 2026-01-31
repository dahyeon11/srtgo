package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class BusReservationSeatListDao extends ReservationDao {

    public class BusSeatListRequest extends BaseRequest implements Serializable {
        private String arvRsStnCd;
        private String arvStnRunOrdr;
        private String dptRsStnCd;
        private String dptStnRunOrdr;
        private String gdNo;
        private boolean isArrow;
        private SeatListResponse mReservationResponse;
        private String psrmClCd;
        private String runDt;
        private String seatAttCd;
        private String srcarNo;
        private String totPsgCnt;
        private String trnClsfCd;
        private String trnGpCd;
        private String trnNo;

        public BusSeatListRequest() {
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getArvStnRunOrdr() {
            return this.arvStnRunOrdr;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public String getDptStnRunOrdr() {
            return this.dptStnRunOrdr;
        }

        public String getGdNo() {
            return this.gdNo;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public SeatListResponse getReservationResponse() {
            return this.mReservationResponse;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getSeatAttCd() {
            return this.seatAttCd;
        }

        public String getSrcarNo() {
            return this.srcarNo;
        }

        public String getTotPsgCnt() {
            return this.totPsgCnt;
        }

        public String getTrnClsfCd() {
            return this.trnClsfCd;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public SeatListResponse getmReservationResponse() {
            return this.mReservationResponse;
        }

        public boolean isArrow() {
            return this.isArrow;
        }

        public void setArrow(boolean z8) {
            this.isArrow = z8;
        }

        public void setArvRsStnCd(String str) {
            this.arvRsStnCd = str;
        }

        public void setArvStnRunOrdr(String str) {
            this.arvStnRunOrdr = str;
        }

        public void setDptRsStnCd(String str) {
            this.dptRsStnCd = str;
        }

        public void setDptStnRunOrdr(String str) {
            this.dptStnRunOrdr = str;
        }

        public void setGdNo(String str) {
            this.gdNo = str;
        }

        public void setPsrmClCd(String str) {
            this.psrmClCd = str;
        }

        public void setReservationResponse(SeatListResponse seatListResponse) {
            this.mReservationResponse = seatListResponse;
        }

        public void setRunDt(String str) {
            this.runDt = str;
        }

        public void setSeatAttCd(String str) {
            this.seatAttCd = str;
        }

        public void setSrcarNo(String str) {
            this.srcarNo = str;
        }

        public void setTotPsgCnt(String str) {
            this.totPsgCnt = str;
        }

        public void setTrnClsfCd(String str) {
            this.trnClsfCd = str;
        }

        public void setTrnGpCd(String str) {
            this.trnGpCd = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }

        public void setmReservationResponse(SeatListResponse seatListResponse) {
            this.mReservationResponse = seatListResponse;
        }
    }

    public class SeatList implements Serializable {
        private String dir_seat_att_cd;
        private String etc_seat_att_cd;
        private String intg_msg;
        private String intg_msg_cd;
        private boolean isDisable = false;
        private boolean isSelected = false;
        private String rq_seat_att_cd;
        private String sale_psb_flg;
        private String seat_no;
        private String seat_spec;
        private String sqr_no;
        private String vz_msg_dv_cd;

        public SeatList() {
        }

        public String getDir_seat_att_cd() {
            return this.dir_seat_att_cd;
        }

        public String getEtc_seat_att_cd() {
            return this.etc_seat_att_cd;
        }

        public String getIntg_msg() {
            return this.intg_msg;
        }

        public String getIntg_msg_cd() {
            return this.intg_msg_cd;
        }

        public String getRq_seat_att_cd() {
            return this.rq_seat_att_cd;
        }

        public String getSale_psb_flg() {
            return this.sale_psb_flg;
        }

        public String getSeat_no() {
            return this.seat_no;
        }

        public String getSeat_spec() {
            return this.seat_spec;
        }

        public String getSqr_no() {
            return this.sqr_no;
        }

        public String getVz_msg_dv_cd() {
            return this.vz_msg_dv_cd;
        }

        public boolean isDisable() {
            return this.isDisable;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public void setDisable(boolean z8) {
            this.isDisable = z8;
        }

        public void setSale_psb_flg(String str) {
            this.sale_psb_flg = str;
        }

        public void setSelected(boolean z8) {
            this.isSelected = z8;
        }
    }

    public class SeatListResponse extends BaseResponse implements Serializable {
        private String car_tp_cd;
        private String scar_no;
        private ArrayList<SeatList> seatList;
        private String seat_ary_cd;
        private String up_dn_dv_cd;

        public SeatListResponse() {
        }

        public String getCar_tp_cd() {
            return this.car_tp_cd;
        }

        public String getScar_no() {
            return this.scar_no;
        }

        public ArrayList<SeatList> getSeat() {
            return this.seatList;
        }

        public String getSeat_ary_cd() {
            return this.seat_ary_cd;
        }

        public String getUp_dn_dv_cd() {
            return this.up_dn_dv_cd;
        }
    }

    @Override // com.korail.talk.network.dao.certification.ReservationDao, com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        BusReservationService busReservationService = (BusReservationService) getService(BusReservationService.class);
        BusSeatListRequest busSeatListRequest = (BusSeatListRequest) getRequest();
        return busReservationService.reservationSeatList(busSeatListRequest.getDevice(), busSeatListRequest.getVersion(), busSeatListRequest.getKey(), busSeatListRequest.getTrnClsfCd(), busSeatListRequest.getTrnGpCd(), busSeatListRequest.getRunDt(), busSeatListRequest.getTrnNo(), busSeatListRequest.getSrcarNo(), busSeatListRequest.getPsrmClCd(), busSeatListRequest.getDptRsStnCd(), busSeatListRequest.getArvRsStnCd(), busSeatListRequest.getSeatAttCd(), busSeatListRequest.getDptStnRunOrdr(), busSeatListRequest.getArvStnRunOrdr(), busSeatListRequest.getTotPsgCnt(), busSeatListRequest.getGdNo(), busSeatListRequest.isArrow());
    }

    @Override // com.korail.talk.network.dao.certification.ReservationDao, com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_bus_reservation_seat_list;
    }
}
