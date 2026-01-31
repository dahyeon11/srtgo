package com.korail.talk.network.dao.research;

import K4.a;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.research.SeatSearchRequest;
import java.util.List;
import n4.AbstractC5955f;
import r4.g;
import z4.C6638l;

/* loaded from: classes.dex */
public class SearchSeatListDao extends BaseDao {

    public class SearchSeatListResponse extends BaseResponse {
        private int layout_type;
        private List<Seat> seatList;
        private String seat_ary_cd;
        private int seat_remain_count;
        private int seat_total_count;
        private String vrBnrUrl;
        private List<Window> windowList;

        public SearchSeatListResponse() {
        }

        public int getLayout_type() {
            return this.layout_type;
        }

        public List<Seat> getSeatList() {
            return this.seatList;
        }

        public String getSeat_ary_cd() {
            return this.seat_ary_cd;
        }

        public int getSeat_remain_count() {
            return this.seat_remain_count;
        }

        public int getSeat_total_count() {
            return this.seat_total_count;
        }

        public String getVrBnrUrl() {
            return this.vrBnrUrl;
        }

        public List<Window> getWindowList() {
            return this.windowList;
        }
    }

    public class Seat {
        private String dir_seat_att_cd;
        private String etc_seat_att_cd;
        private String floor;
        private String intg_msg;
        private String intg_msg_cd;
        private String rq_seat_att_cd;
        private String sale_psb_flg;
        private String seat_no;
        private String seat_spec;
        private String sqr_no;
        private String vz_msg_dv_cd;

        public Seat() {
        }

        public String getDir_seat_att_cd() {
            return this.dir_seat_att_cd;
        }

        public String getEtc_seat_att_cd() {
            return this.etc_seat_att_cd;
        }

        public String getFloor() {
            return this.floor;
        }

        public String getIntg_msg() {
            return this.intg_msg;
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

        public void setFloor(String str) {
            this.floor = str;
        }
    }

    public class Window {
        private float cls_loc_rt;
        private float st_loc_rt;

        public Window() {
        }

        public float getCls_loc_rt() {
            return this.cls_loc_rt;
        }

        public float getSt_loc_rt() {
            return this.st_loc_rt;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        SeatSearchRequest seatSearchRequest = (SeatSearchRequest) getRequest();
        return researchService.getSeatList(seatSearchRequest.getDevice(), seatSearchRequest.getVersion(), seatSearchRequest.getKey(), seatSearchRequest.getTxtTrnClsfCd(), seatSearchRequest.getTxtTrnGpCd(), seatSearchRequest.getTxtRunDt(), seatSearchRequest.getTxtTrnNo(), seatSearchRequest.getTxtSrcarNo(), seatSearchRequest.getTxtPsrmClCd(), seatSearchRequest.getTxtDptRsStnCd(), seatSearchRequest.getTxtArvRsStnCd(), seatSearchRequest.getTxtSeatAttCd(), seatSearchRequest.getTxtDptStnRunOrdr(), seatSearchRequest.getTxtArvStnRunOrdr(), seatSearchRequest.getTxtTotPsgCnt(), seatSearchRequest.getTxtGdNo(), true, C6638l.getSid(), g.SERVER_TYPE == a.REAL ? null : "Y", seatSearchRequest.getCtlDvCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_seat_list;
    }
}
