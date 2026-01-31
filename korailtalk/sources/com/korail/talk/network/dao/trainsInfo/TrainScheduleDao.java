package com.korail.talk.network.dao.trainsInfo;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TrainScheduleDao extends BaseDao {

    public class TimeInfo {
        private int actArvDlayTnum;
        private String actArvDt;
        private String actArvTm;
        private String actDptDt;
        private String actDptTm;
        private String arvDt;
        private String arvTm;
        private String dptDt;
        private String dptTm;
        private String expnArvDlayTnum;
        private String expnDptDlayTnum;
        private String rgulFlg;
        private String saodFlg;
        private String stopStnNm;

        public TimeInfo() {
        }

        public int getActArvDlayTnum() {
            return this.actArvDlayTnum;
        }

        public String getActArvDt() {
            return this.actArvDt;
        }

        public String getActArvTm() {
            return this.actArvTm;
        }

        public String getActDptDt() {
            return this.actDptDt;
        }

        public String getActDptTm() {
            return this.actDptTm;
        }

        public String getArvDt() {
            return this.arvDt;
        }

        public String getArvTm() {
            return this.arvTm;
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public String getDptTm() {
            return this.dptTm;
        }

        public String getExpnArvDlayTnum() {
            return this.expnArvDlayTnum;
        }

        public String getExpnDptDlayTnum() {
            return this.expnDptDlayTnum;
        }

        public String getRgulFlg() {
            return this.rgulFlg;
        }

        public String getSaodFlg() {
            return this.saodFlg;
        }

        public String getStopStnNm() {
            return this.stopStnNm;
        }

        public void setSaodFlg(String str) {
            this.saodFlg = str;
        }
    }

    public class TrainScheduleRequest extends BaseRequest {
        private String txtRunDt;
        private String txtTrnNo;

        public TrainScheduleRequest() {
        }

        public String getTxtRunDt() {
            return this.txtRunDt;
        }

        public String getTxtTrnNo() {
            return this.txtTrnNo;
        }

        public void setTxtRunDt(String str) {
            this.txtRunDt = str;
        }

        public void setTxtTrnNo(String str) {
            this.txtTrnNo = str;
        }
    }

    public class TrainScheduleResponse extends BaseResponse {
        private String dlayDtlRsnCont;
        private List<TimeInfo> dlayList;
        private String msgCont;
        private String runDt1;
        private String runSegOrdr;
        private String trnDptFlg;
        private String trnNo1;

        public TrainScheduleResponse() {
        }

        public String getDlayDtlRsnCont() {
            return this.dlayDtlRsnCont;
        }

        public List<TimeInfo> getDlayList() {
            return this.dlayList;
        }

        public String getMsgCont() {
            return this.msgCont;
        }

        public String getRunDt1() {
            return this.runDt1;
        }

        public String getRunSegOrdr() {
            return this.runSegOrdr;
        }

        public String getTranNo1() {
            return this.trnNo1;
        }

        public String getTrnDptFlg() {
            return this.trnDptFlg;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TrainsInfoService trainsInfoService = (TrainsInfoService) getService(TrainsInfoService.class);
        TrainScheduleRequest trainScheduleRequest = (TrainScheduleRequest) getRequest();
        return trainsInfoService.getTrainSchedule(trainScheduleRequest.getDevice(), trainScheduleRequest.getVersion(), trainScheduleRequest.getTxtRunDt(), trainScheduleRequest.getTxtTrnNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_train_schedule;
    }
}
