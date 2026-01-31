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
public class SearchCarListDao extends BaseDao {

    public class CarInfo {
        private String h_psrm_cl_nm;
        private int h_rest_seat_cnt;
        private int h_srcar_no;
        private List<SeatAttInfo> seatAttInfos;

        public CarInfo() {
        }

        public int getHSrcarNo() {
            return this.h_srcar_no;
        }

        public String getH_psrm_cl_nm() {
            return this.h_psrm_cl_nm;
        }

        public int getH_rest_seat_cnt() {
            return this.h_rest_seat_cnt;
        }

        public List<SeatAttInfo> getSeatAttInfoList() {
            return this.seatAttInfos;
        }
    }

    public class CarInfos {
        private List<CarInfo> srcar_info;

        public CarInfos() {
        }

        public List<CarInfo> getSrcarInfoList() {
            return this.srcar_info;
        }
    }

    public class SearchCarListResponse extends BaseResponse {
        private int h_rcmd_srcar_no;
        private String h_trn_no;
        private CarInfos srcar_infos;

        public SearchCarListResponse() {
        }

        public int getHRcmdSrcarNo() {
            return this.h_rcmd_srcar_no;
        }

        public String getHTrnNo() {
            return this.h_trn_no;
        }

        public CarInfos getSrcar_infos() {
            return this.srcar_infos;
        }
    }

    public class SeatAttInfo {
        private String seatAttNm;

        public SeatAttInfo() {
        }

        public String getSeatAttNm() {
            return this.seatAttNm;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        SeatSearchRequest seatSearchRequest = (SeatSearchRequest) getRequest();
        return researchService.getCarList(seatSearchRequest.getDevice(), seatSearchRequest.getVersion(), seatSearchRequest.getKey(), C6638l.getSid(), seatSearchRequest.getTxtMenuId(), seatSearchRequest.getTxtPsrmClCd(), seatSearchRequest.getTxtRunDt(), seatSearchRequest.getTxtDptDt(), seatSearchRequest.getTxtTrnClsfCd(), seatSearchRequest.getTxtTrnNo(), seatSearchRequest.getTxtDptRsStnCd(), seatSearchRequest.getTxtArvRsStnCd(), seatSearchRequest.getTxtDptStnRunOrdr(), seatSearchRequest.getTxtArvStnRunOrdr(), seatSearchRequest.getTxtTrnGpCd(), seatSearchRequest.getTxtTotPsgCnt(), seatSearchRequest.getTxtSeatAttCd(), seatSearchRequest.getTxtGdNo(), g.SERVER_TYPE == a.REAL ? null : "Y");
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_car_list;
    }
}
