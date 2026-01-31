package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MergeSeatInquiryDao extends BaseDao {

    public class MergeSeatInquiryRequest extends BaseRequest {
        private String abrdDt;
        private String arvRsStnNm;
        private String dptRsStnNm;
        private String psrmClCd;
        private String runtDt;
        private String seatAttCd;
        private String selRsStnNm;
        private String totPsgNum;
        private String trnNo;

        public MergeSeatInquiryRequest() {
        }

        public String getAbrdDt() {
            return this.abrdDt;
        }

        public String getArvRsStnNm() {
            return this.arvRsStnNm;
        }

        public String getDptRsStnNm() {
            return this.dptRsStnNm;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getRuntDt() {
            return this.runtDt;
        }

        public String getSeatAttCd() {
            return this.seatAttCd;
        }

        public String getSelRsStnNm() {
            return this.selRsStnNm;
        }

        public String getTotPsgNum() {
            return this.totPsgNum;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setAbrdDt(String str) {
            this.abrdDt = str;
        }

        public void setArvRsStnNm(String str) {
            this.arvRsStnNm = str;
        }

        public void setDptRsStnNm(String str) {
            this.dptRsStnNm = str;
        }

        public void setPsrmClCd(String str) {
            this.psrmClCd = str;
        }

        public void setRuntDt(String str) {
            this.runtDt = str;
        }

        public void setSeatAttCd(String str) {
            this.seatAttCd = str;
        }

        public void setSelRsStnNm(String str) {
            this.selRsStnNm = str;
        }

        public void setTotPsgNum(String str) {
            this.totPsgNum = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class MergeSeatInquiryResponse extends BaseResponse {
        public List<MidStnList.MidStationInfo> midStnList;
        private RsvInquiryResponse.TrainInfos trn_infos;

        public MergeSeatInquiryResponse() {
        }

        public List<MidStnList.MidStationInfo> getMidStnList() {
            return this.midStnList;
        }

        public RsvInquiryResponse.TrainInfos getTrnInfos() {
            return this.trn_infos;
        }
    }

    public class MidStnList {
        private List<MidStationInfo> midStationInfo;

        public class MidStationInfo {
            private String rsStnCd;
            private String rsStnNm;
            private String runOrdr;

            public MidStationInfo() {
            }

            public String getRsStnCd() {
                return this.rsStnCd;
            }

            public String getRsStnNm() {
                return this.rsStnNm;
            }

            public String getRunOrdr() {
                return this.runOrdr;
            }
        }

        public MidStnList() {
        }

        public List<MidStationInfo> getMidStnList() {
            return this.midStationInfo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        MergeSeatInquiryRequest mergeSeatInquiryRequest = (MergeSeatInquiryRequest) getRequest();
        return researchService.getMergeSeatsInquiry(mergeSeatInquiryRequest.getDevice(), mergeSeatInquiryRequest.getVersion(), mergeSeatInquiryRequest.getKey(), mergeSeatInquiryRequest.getAbrdDt(), mergeSeatInquiryRequest.getRuntDt(), mergeSeatInquiryRequest.getTrnNo(), mergeSeatInquiryRequest.getDptRsStnNm(), mergeSeatInquiryRequest.getArvRsStnNm(), mergeSeatInquiryRequest.getSelRsStnNm(), mergeSeatInquiryRequest.getPsrmClCd(), mergeSeatInquiryRequest.getSeatAttCd(), mergeSeatInquiryRequest.getTotPsgNum());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_merge_seat_inquiry;
    }
}
