package com.korail.talk.network.dao.trainsInfo;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TourTrainInfoDao extends BaseDao {

    public class SeatAddInfo implements Serializable {
        private int h_psg_num;

        public SeatAddInfo() {
        }

        public int getH_psg_num() {
            return this.h_psg_num;
        }
    }

    public class SeatAddInfos implements Serializable {
        private List<SeatAddInfo> seat_add_info;

        public SeatAddInfos() {
        }

        public List<SeatAddInfo> getSeat_add_info() {
            return this.seat_add_info;
        }
    }

    public class SeatInfo implements Serializable {
        private String h_seat_att_cd;
        private SeatAddInfos seat_add_infos;

        public SeatInfo() {
        }

        public String getH_seat_att_cd() {
            return this.h_seat_att_cd;
        }

        public SeatAddInfos getSeat_add_infos() {
            return this.seat_add_infos;
        }
    }

    public class SeatInfos implements Serializable {
        private List<SeatInfo> seat_info;

        public SeatInfos() {
        }

        public List<SeatInfo> getSeat_info() {
            return this.seat_info;
        }
    }

    public class TourTrainInfoRequest extends BaseRequest {
        private String arrivalStn;
        private String jobDv;
        private String startStn;
        private String title;
        private String txtTrnGpCd;

        public TourTrainInfoRequest() {
        }

        public String getArrivalStn() {
            return this.arrivalStn;
        }

        public String getJobDv() {
            return this.jobDv;
        }

        public String getStartStn() {
            return this.startStn;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTxtTrnGpCd() {
            return this.txtTrnGpCd;
        }

        public void setArrivalStn(String str) {
            this.arrivalStn = str;
        }

        public void setJobDv(String str) {
            this.jobDv = str;
        }

        public void setStartStn(String str) {
            this.startStn = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTxtTrnGpCd(String str) {
            this.txtTrnGpCd = str;
        }
    }

    public class TourTrainInfoResponse extends BaseResponse {
        private SeatInfos seat_infos;

        public TourTrainInfoResponse() {
        }

        public SeatInfos getSeat_infos() {
            return this.seat_infos;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TrainsInfoService trainsInfoService = (TrainsInfoService) getService(TrainsInfoService.class);
        TourTrainInfoRequest tourTrainInfoRequest = (TourTrainInfoRequest) getRequest();
        return trainsInfoService.getTourTrainInfo(tourTrainInfoRequest.getDevice(), tourTrainInfoRequest.getVersion(), tourTrainInfoRequest.getKey(), tourTrainInfoRequest.getTxtTrnGpCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_tour_train_info;
    }
}
