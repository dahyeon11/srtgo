package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PbpTkWdrwDao extends BaseDao {

    public class PbpTkWdrwRequest extends BaseRequest {
        private int pbpCnt;
        private List<String> pbpRsvNo;
        private List<String> pnrNo;
        private int position;

        public PbpTkWdrwRequest() {
        }

        public int getPbpCnt() {
            return this.pbpCnt;
        }

        public List<String> getPbpRsvNo() {
            return this.pbpRsvNo;
        }

        public List<String> getPnrNo() {
            return this.pnrNo;
        }

        public int getPosition() {
            return this.position;
        }

        public void setPbpCnt(int i8) {
            this.pbpCnt = i8;
        }

        public void setPbpRsvNo(List<String> list) {
            this.pbpRsvNo = list;
        }

        public void setPnrNo(List<String> list) {
            this.pnrNo = list;
        }

        public void setPosition(int i8) {
            this.position = i8;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        PbpTkWdrwRequest pbpTkWdrwRequest = (PbpTkWdrwRequest) getRequest();
        return ticketService.pbpTkWdrw(pbpTkWdrwRequest.getDevice(), pbpTkWdrwRequest.getVersion(), pbpTkWdrwRequest.getKey(), pbpTkWdrwRequest.getPbpCnt(), pbpTkWdrwRequest.getPbpRsvNo(), pbpTkWdrwRequest.getPnrNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_pbp_tk_wdrw;
    }
}
