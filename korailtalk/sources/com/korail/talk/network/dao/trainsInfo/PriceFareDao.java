package com.korail.talk.network.dao.trainsInfo;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import java.util.LinkedHashMap;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PriceFareDao extends BaseDao {

    public class PriceFare {
        private String h_psg_tp_nm;
        private String h_psrm_cl_nm;
        private String h_rg_rcvd_amt;

        public PriceFare() {
        }

        public String getH_psg_tp_nm() {
            return this.h_psg_tp_nm;
        }

        public String getH_psrm_cl_nm() {
            return this.h_psrm_cl_nm;
        }

        public String getH_rg_rcvd_amt() {
            return this.h_rg_rcvd_amt;
        }
    }

    public class PriceFareParams extends LinkedHashMap<String, String> {
        private final String TRN_CLSF_CD1 = "txtTrnClsfCd1";
        private final String DPT_RS_STN_CD1 = "txtDptRsStnCd1";
        private final String ARV_RS_STN_CD1 = "txtArvRsStnCd1";
        private final String RUN_DT1 = "txtRunDt1";
        private final String TRN_NO1 = "txtTrnNo1";
        private final String TRN_GP_CD1 = "txtTrnGpCd1";
        private final String TRN_CLSF_CD1_1 = "txtTrnClsfCd1_1";
        private final String DPT_RS_STN_CD1_1 = "txtDptRsStnCd1_1";
        private final String ARV_RS_STN_CD1_1 = "txtArvRsStnCd1_1";
        private final String RUN_DT1_1 = "txtRunDt1_1";
        private final String TRN_NO1_1 = "txtTrnNo1_1";
        private final String TRN_GP_CD1_1 = "txtTrnGpCd1_1";

        public PriceFareParams() {
        }

        public void setTxtArvRsStnCd(int i8, String str) {
            put(i8 == 0 ? "txtArvRsStnCd1" : "txtArvRsStnCd1_1", str);
        }

        public void setTxtDptRsStnCd(int i8, String str) {
            put(i8 == 0 ? "txtDptRsStnCd1" : "txtDptRsStnCd1_1", str);
        }

        public void setTxtRunDt(int i8, String str) {
            put(i8 == 0 ? "txtRunDt1" : "txtRunDt1_1", str);
        }

        public void setTxtTrnClsfCd(int i8, String str) {
            put(i8 == 0 ? "txtTrnClsfCd1" : "txtTrnClsfCd1_1", str);
        }

        public void setTxtTrnGpCd(int i8, String str) {
            put(i8 == 0 ? "txtTrnGpCd1" : "txtTrnGpCd1_1", str);
        }

        public void setTxtTrnNo(int i8, String str) {
            put(i8 == 0 ? "txtTrnNo1" : "txtTrnNo1_1", str);
        }
    }

    public class PriceFareRequest extends BaseRequest {
        private int mSelectIndex;
        private RsvInquiryResponse.TrainInfo mTrainInfo;
        private PriceFareParams priceFareParams;
        private String txtChtrDvCd1;
        private String txtMenuId;
        private String txtRtnDvCd;
        private String txtSeatAttCd4;

        public PriceFareRequest() {
        }

        public LinkedHashMap<String, String> getPriceFareParams() {
            return this.priceFareParams;
        }

        public int getSelectIndex() {
            return this.mSelectIndex;
        }

        public RsvInquiryResponse.TrainInfo getTrainInfo() {
            return this.mTrainInfo;
        }

        public String getTxtChtrDvCd1() {
            return this.txtChtrDvCd1;
        }

        public String getTxtMenuId() {
            return this.txtMenuId;
        }

        public String getTxtRtnDvCd() {
            return this.txtRtnDvCd;
        }

        public String getTxtSeatAttCd4() {
            return this.txtSeatAttCd4;
        }

        public void setPriceFareParams(PriceFareParams priceFareParams) {
            this.priceFareParams = priceFareParams;
        }

        public void setSelectIndex(int i8) {
            this.mSelectIndex = i8;
        }

        public void setTrainInfo(RsvInquiryResponse.TrainInfo trainInfo) {
            this.mTrainInfo = trainInfo;
        }

        public void setTxtChtrDvCd1(String str) {
            this.txtChtrDvCd1 = str;
        }

        public void setTxtMenuId(String str) {
            this.txtMenuId = str;
        }

        public void setTxtRtnDvCd(String str) {
            this.txtRtnDvCd = str;
        }

        public void setTxtSeatAttCd4(String str) {
            this.txtSeatAttCd4 = str;
        }
    }

    public class PriceFareResponse extends BaseResponse {
        private PrcFareList prc_fare_list;

        public class PrcFareList {
            private List<JrnyInfo> jrny_info;

            public class JrnyInfo {
                private List<PriceFare> prc_fare;

                public JrnyInfo() {
                }

                public List<PriceFare> getPrc_fare() {
                    return this.prc_fare;
                }
            }

            public PrcFareList() {
            }

            public List<JrnyInfo> getJrny_info() {
                return this.jrny_info;
            }
        }

        public PriceFareResponse() {
        }

        public PrcFareList getPrc_fare_list() {
            return this.prc_fare_list;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TrainsInfoService trainsInfoService = (TrainsInfoService) getService(TrainsInfoService.class);
        PriceFareRequest priceFareRequest = (PriceFareRequest) getRequest();
        return trainsInfoService.getPriceFare(priceFareRequest.getDevice(), priceFareRequest.getVersion(), priceFareRequest.getKey(), priceFareRequest.getTxtMenuId(), priceFareRequest.getTxtRtnDvCd(), priceFareRequest.getTxtChtrDvCd1(), priceFareRequest.getTxtSeatAttCd4(), priceFareRequest.getPriceFareParams());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_price_fare;
    }
}
