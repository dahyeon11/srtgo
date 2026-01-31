package com.korail.talk.network.dao.trainsInfo;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TrainSelectStationDao extends BaseDao {

    public class TrainSelectStationRequest extends BaseRequest {
        private String arvRsStnCd;
        private String dptRsStnCd;

        public TrainSelectStationRequest() {
        }

        public String getArvRsStnCd() {
            return this.arvRsStnCd;
        }

        public String getDptRsStnCd() {
            return this.dptRsStnCd;
        }

        public void setArvRsStnCd(String str) {
            this.arvRsStnCd = str;
        }

        public void setDptRsStnCd(String str) {
            this.dptRsStnCd = str;
        }
    }

    public class TrainSelectStationResponse extends BaseResponse {
        private List<TransferStationInfo> chtnList;

        public TrainSelectStationResponse() {
        }

        public List<TransferStationInfo> getChtnList() {
            return this.chtnList;
        }
    }

    public static class TransferStationInfo {
        private String chtnRsStnCd = "";
        private String chtnRsStnNm = "전체";

        TransferStationInfo() {
        }

        public String getChtnRsStnCd() {
            return this.chtnRsStnCd;
        }

        public String getChtnRsStnNm() {
            return this.chtnRsStnNm;
        }
    }

    public static TransferStationInfo getAllTransferStationInfo() {
        return new TransferStationInfo();
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TrainsInfoService trainsInfoService = (TrainsInfoService) getService(TrainsInfoService.class);
        TrainSelectStationRequest trainSelectStationRequest = (TrainSelectStationRequest) getRequest();
        return trainsInfoService.getSelectStationInfo(trainSelectStationRequest.getDevice(), trainSelectStationRequest.getVersion(), trainSelectStationRequest.getKey(), trainSelectStationRequest.getDptRsStnCd(), trainSelectStationRequest.getArvRsStnCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_select_station;
    }
}
