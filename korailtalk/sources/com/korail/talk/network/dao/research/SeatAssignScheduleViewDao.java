package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;
import r4.d;

/* loaded from: classes.dex */
public class SeatAssignScheduleViewDao extends BaseDao implements Serializable {

    public class SeatAssignScheduleViewRequest extends BaseRequest implements Serializable {
        private String arvRsStnNm;
        private String chtnArvRsStnNm;
        private String dirtChtnDvCd;
        private String dptDt;
        private String dptRsStnNm;
        private String dptTm;
        private String menuId;
        private int psgNum1;
        private String psrmClCd;
        private String seatAttCd1;
        private String stlbDturDvNm1;
        private String stlbDturDvNm2;
        private String trnGpCd;
        private String trnNo;

        public SeatAssignScheduleViewRequest() {
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getChtnArvRsStnNm() {
            return this.chtnArvRsStnNm;
        }

        public String getDirtChtnDvCd() {
            return this.dirtChtnDvCd;
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getDptTm() {
            return this.dptTm;
        }

        public String getMenuId() {
            return this.menuId;
        }

        public int getPsgNum1() {
            return this.psgNum1;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getSeatAttCd1() {
            return this.seatAttCd1;
        }

        public String getStlbDturDvNm1() {
            return this.stlbDturDvNm1;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setArvRsStnNm(String str) {
            this.arvRsStnNm = str;
        }

        public void setChtnArvRsStnNm(String str) {
            this.chtnArvRsStnNm = str;
        }

        public void setDirtChtnDvCd(String str) {
            this.dirtChtnDvCd = str;
        }

        public void setDptDt(String str) {
            this.dptDt = str;
        }

        public void setDptRsStnNm(String str) {
            this.dptRsStnNm = str;
        }

        public void setDptTm(String str) {
            this.dptTm = str;
        }

        public void setMenuId(String str) {
            this.menuId = str;
        }

        public void setNextStartTime(List<RsvInquiryResponse.TrainInfo> list) {
            StringBuffer stringBuffer = new StringBuffer();
            if (d.DIRECT_SQ_NO.getCode().equals(list.get(list.size() - 1).getH_chg_trn_seq())) {
                stringBuffer.append(list.get(list.size() - 1).getH_dpt_tm());
            } else {
                stringBuffer.append(list.get(list.size() - 2).getH_dpt_tm());
            }
            setDptTm(stringBuffer.toString());
        }

        public void setPsgNum1(int i8) {
            this.psgNum1 = i8;
        }

        public void setPsrmClCd(String str) {
            this.psrmClCd = str;
        }

        public void setSeatAttCd1(String str) {
            this.seatAttCd1 = str;
        }

        public void setStlbDturDvNm1(String str) {
            this.stlbDturDvNm1 = str;
        }

        public void setTrnGpCd(String str) {
            this.trnGpCd = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class SeatAssignScheduleViewResponse extends BaseResponse {
        private String h_next_pg_flg;
        private RsvInquiryResponse.TrainInfos trn_infos;

        public SeatAssignScheduleViewResponse() {
        }

        public String getH_next_pg_flg() {
            return this.h_next_pg_flg;
        }

        public RsvInquiryResponse.TrainInfos getTrn_infos() {
            return this.trn_infos;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        SeatAssignScheduleViewRequest seatAssignScheduleViewRequest = (SeatAssignScheduleViewRequest) getRequest();
        return researchService.getAssignScheduleView(seatAssignScheduleViewRequest.getDevice(), seatAssignScheduleViewRequest.getVersion(), seatAssignScheduleViewRequest.getKey(), seatAssignScheduleViewRequest.getMenuId(), seatAssignScheduleViewRequest.getDptDt(), seatAssignScheduleViewRequest.getDptTm(), seatAssignScheduleViewRequest.getDptRsStnNm(), seatAssignScheduleViewRequest.getArvRsStnNm(), seatAssignScheduleViewRequest.getTrnGpCd(), seatAssignScheduleViewRequest.getPsrmClCd(), seatAssignScheduleViewRequest.getSeatAttCd1(), seatAssignScheduleViewRequest.getPsgNum1(), seatAssignScheduleViewRequest.getStlbDturDvNm1(), seatAssignScheduleViewRequest.getDirtChtnDvCd(), seatAssignScheduleViewRequest.getChtnArvRsStnNm());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_seat_assign_schedule_view;
    }
}
