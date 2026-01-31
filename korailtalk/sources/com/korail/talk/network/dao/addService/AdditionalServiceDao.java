package com.korail.talk.network.dao.addService;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AdditionalServiceDao extends BaseDao {

    public class AdditionalServiceRequest extends BaseRequest {
        public static final String JOB_CODE_CANCEL = "C";
        public static final String JOB_CODE_NEW = "N";
        private String addSrvId;
        private ArrayList<String> addSrvReqNo;
        private int cncTgtCnt;
        private int helpSrvTgtCnt;
        private String jobDbCd;
        private String jrnySqno;
        private String pnrNo;
        private ArrayList<String> rcpSqno;
        private int reqQnty;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;

        public AdditionalServiceRequest() {
        }

        public String getAddSrvId() {
            return this.addSrvId;
        }

        public ArrayList<String> getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public int getCncTgtCnt() {
            return this.cncTgtCnt;
        }

        public int getHelpSrvTgtCnt() {
            return this.helpSrvTgtCnt;
        }

        public String getJobDbCd() {
            return this.jobDbCd;
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public ArrayList<String> getRcpSqno() {
            return this.rcpSqno;
        }

        public int getReqQnty() {
            return this.reqQnty;
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public void setAddSrvId(String str) {
            this.addSrvId = str;
        }

        public void setAddSrvReqNo(ArrayList<String> arrayList) {
            this.addSrvReqNo = arrayList;
        }

        public void setCncTgtCnt(int i8) {
            this.cncTgtCnt = i8;
        }

        public void setHelpSrvTgtCnt(int i8) {
            this.helpSrvTgtCnt = i8;
        }

        public void setJobDbCd(String str) {
            this.jobDbCd = str;
        }

        public void setJrnySqno(String str) {
            this.jrnySqno = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setRcpSqno(ArrayList<String> arrayList) {
            this.rcpSqno = arrayList;
        }

        public void setReqQnty(int i8) {
            this.reqQnty = i8;
        }

        public void setSaleDt(String str) {
            this.saleDt = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }
    }

    public class AdditionalServiceResponse extends BaseResponse {
        private List<OutRec2> outrec2;

        public AdditionalServiceResponse() {
        }

        public List<OutRec2> getOutrec2() {
            return this.outrec2;
        }
    }

    public class OutRec2 {
        public String stlMnsCd;

        public OutRec2() {
        }

        public String getStlMnsCd() {
            return this.stlMnsCd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        AddService addService = (AddService) getService(AddService.class);
        AdditionalServiceRequest additionalServiceRequest = (AdditionalServiceRequest) getRequest();
        return addService.additionalService(additionalServiceRequest.getDevice(), additionalServiceRequest.getVersion(), additionalServiceRequest.getKey(), additionalServiceRequest.getPnrNo(), additionalServiceRequest.getJrnySqno(), additionalServiceRequest.getSaleWctNo(), additionalServiceRequest.getSaleDt(), additionalServiceRequest.getSaleSqno(), additionalServiceRequest.getJobDbCd(), additionalServiceRequest.getAddSrvId(), additionalServiceRequest.getReqQnty(), additionalServiceRequest.getHelpSrvTgtCnt(), additionalServiceRequest.getRcpSqno(), additionalServiceRequest.getCncTgtCnt(), additionalServiceRequest.getAddSrvReqNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_additional_service;
    }
}
