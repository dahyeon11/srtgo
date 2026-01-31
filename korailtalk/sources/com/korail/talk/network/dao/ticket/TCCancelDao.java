package com.korail.talk.network.dao.ticket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.HashMap;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TCCancelDao extends BaseDao {

    public class TCCancelRequest extends BaseRequest {
        private final String LUMP_STL_TGT_NO = "lumpStlTgtNo_";
        private HashMap<String, String> hashMap = new HashMap<>();
        private String lumpStlCnt;

        public TCCancelRequest() {
        }

        public HashMap<String, String> getHashMap() {
            return this.hashMap;
        }

        public String getLumpStlCnt() {
            return this.lumpStlCnt;
        }

        public void setLumpStlCnt(String str) {
            this.lumpStlCnt = str;
        }

        public void setLumpStlTgtNo(int i8, String str) {
            this.hashMap.put("lumpStlTgtNo_" + i8, str);
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        TCCancelRequest tCCancelRequest = (TCCancelRequest) getRequest();
        return ticketService.ticketChangeCancel(tCCancelRequest.getDevice(), tCCancelRequest.getVersion(), tCCancelRequest.getKey(), tCCancelRequest.getLumpStlCnt(), tCCancelRequest.getHashMap());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_tc_cancel;
    }
}
