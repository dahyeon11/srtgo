package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class UpdatePlatformDao extends BaseDao {

    public class JrnyList {
        private String plfNo;

        public JrnyList() {
        }

        public String getPlfNo() {
            return this.plfNo;
        }
    }

    public class PlfNoRequest extends BaseRequest {
        private String tkCnt;
        private ArrayList<String> tkRetNo;

        public PlfNoRequest() {
        }

        public String getTkCnt() {
            return this.tkCnt;
        }

        public ArrayList<String> getTkRetNo() {
            return this.tkRetNo;
        }

        public void setTkCnt(String str) {
            this.tkCnt = str;
        }

        public void setTkRetNo(ArrayList<String> arrayList) {
            this.tkRetNo = arrayList;
        }
    }

    public class PlfNoResponse extends BaseResponse {
        private List<TkList> tkList;

        public PlfNoResponse() {
        }

        public List<TkList> getAcepList() {
            return this.tkList;
        }
    }

    public class TkList implements Serializable {
        private List<JrnyList> jrnyList;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetNo;
        private String tkRetPwd;

        public TkList() {
        }

        public List<JrnyList> getJrnyList() {
            return this.jrnyList;
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

        public String getTkRetNo() {
            return this.tkRetNo;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        PlfNoRequest plfNoRequest = (PlfNoRequest) getRequest();
        return ticketService.plfNo(plfNoRequest.getDevice(), plfNoRequest.getVersion(), plfNoRequest.getKey(), plfNoRequest.getTkCnt(), plfNoRequest.getTkRetNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_update_platform;
    }
}
