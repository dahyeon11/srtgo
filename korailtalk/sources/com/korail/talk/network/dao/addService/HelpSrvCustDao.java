package com.korail.talk.network.dao.addService;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class HelpSrvCustDao extends BaseDao {

    public class HelpSrvCustRequest extends BaseRequest {

        /* renamed from: A, reason: collision with root package name */
        public static final String f27548A = "A";

        /* renamed from: D, reason: collision with root package name */
        public static final String f27549D = "D";
        private String addSrvDvCd;
        private String qryDvCd;
        private String rcpSqno;
        private List<String> reqAddRcpSrvCd;
        private List<String> reqAddSrvDvCd;
        private int reqCnt;
        private List<String> reqCntcChnCont;
        private List<String> reqCustNm;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;

        public HelpSrvCustRequest() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getQryDvCd() {
            return this.qryDvCd;
        }

        public String getRcpSqno() {
            return this.rcpSqno;
        }

        public List<String> getReqAddRcpSrvCd() {
            return this.reqAddRcpSrvCd;
        }

        public List<String> getReqAddSrvDvCd() {
            return this.reqAddSrvDvCd;
        }

        public int getReqCnt() {
            return this.reqCnt;
        }

        public List<String> getReqCntcChnCont() {
            return this.reqCntcChnCont;
        }

        public List<String> getReqCustNm() {
            return this.reqCustNm;
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

        public void setAddSrvDvCd(String str) {
            this.addSrvDvCd = str;
        }

        public void setQryDvCd(String str) {
            this.qryDvCd = str;
        }

        public void setRcpSqno(String str) {
            this.rcpSqno = str;
        }

        public void setReqAddRcpSrvCd(List<String> list) {
            this.reqAddRcpSrvCd = list;
        }

        public void setReqAddSrvDvCd(List<String> list) {
            this.reqAddSrvDvCd = list;
        }

        public void setReqCnt(int i8) {
            this.reqCnt = i8;
        }

        public void setReqCntcChnCont(List<String> list) {
            this.reqCntcChnCont = list;
        }

        public void setReqCustNm(List<String> list) {
            this.reqCustNm = list;
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

    public class HelpSrvCustResponse extends BaseResponse {
        private List<ReqSpec> reqSpecList;

        public HelpSrvCustResponse() {
        }

        public List<ReqSpec> getReqSpecList() {
            return this.reqSpecList;
        }
    }

    public class ReqSpec implements Serializable {
        private String addRcpSrvCd;
        private String addSrvDvCd;
        private String custNm;
        private String custTeln;
        private String rcpSqno;

        public ReqSpec() {
        }

        public String getAddRcpSrvCd() {
            return this.addRcpSrvCd;
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getCustTeln() {
            return this.custTeln;
        }

        public String getRcpSqno() {
            return this.rcpSqno;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        AddService addService = (AddService) getService(AddService.class);
        HelpSrvCustRequest helpSrvCustRequest = (HelpSrvCustRequest) getRequest();
        return addService.helpSrvCust(helpSrvCustRequest.getDevice(), helpSrvCustRequest.getVersion(), helpSrvCustRequest.getKey(), helpSrvCustRequest.getSaleWctNo(), helpSrvCustRequest.getSaleDt(), helpSrvCustRequest.getSaleSqno(), helpSrvCustRequest.getReqCnt(), helpSrvCustRequest.getReqAddSrvDvCd(), helpSrvCustRequest.getReqAddRcpSrvCd(), helpSrvCustRequest.getReqCustNm(), helpSrvCustRequest.getReqCntcChnCont(), helpSrvCustRequest.getQryDvCd(), helpSrvCustRequest.getAddSrvDvCd(), helpSrvCustRequest.getRcpSqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_help_srv_cust;
    }
}
