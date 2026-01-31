package com.korail.talk.network.dao.addService;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class HelpSrvTkDao extends BaseDao {

    public class HelpSrvTkDaoRequest extends BaseRequest {
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;

        public HelpSrvTkDaoRequest() {
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

    public class HelpSrvTkDaoResponse extends BaseResponse {
        private List<helpSrv> helpSrvList;

        public HelpSrvTkDaoResponse() {
        }

        public List<helpSrv> getHelpSrvList() {
            return this.helpSrvList;
        }
    }

    public class helpSrv {
        private String addSrvReqNo;
        private String addSrvSpotCont;
        private String arvEpctTm;
        private List<helpSrvTgt> helpSrvTgtList;
        private String jrnyInfo300;
        private String leadMsgCont;

        public helpSrv() {
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getAddSrvSpotCont() {
            return this.addSrvSpotCont;
        }

        public String getArvEpctTm() {
            return this.arvEpctTm;
        }

        public List<helpSrvTgt> getHelpSrvTgtList() {
            return this.helpSrvTgtList;
        }

        public String getJrnyInfo300() {
            return this.jrnyInfo300;
        }

        public String getLeadMsgCont() {
            return this.leadMsgCont;
        }
    }

    public class helpSrvTgt {
        private String custNm;
        private String custTeln;

        public helpSrvTgt() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getCustTeln() {
            return this.custTeln;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        AddService addService = (AddService) getService(AddService.class);
        HelpSrvTkDaoRequest helpSrvTkDaoRequest = (HelpSrvTkDaoRequest) getRequest();
        return addService.helpSrvTk(helpSrvTkDaoRequest.getDevice(), helpSrvTkDaoRequest.getVersion(), helpSrvTkDaoRequest.getKey(), helpSrvTkDaoRequest.getSaleWctNo(), helpSrvTkDaoRequest.getSaleDt(), helpSrvTkDaoRequest.getSaleSqno());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_help_srv_tk;
    }
}
