package com.korail.talk.network.dao.cust;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MchdDcntTgtDao extends BaseDao {

    public class Fmly {
        private String btdt;
        private String custFmlyNm;
        private String dcntKndCd;
        private String fmlySqno;
        private String psgTpCd;
        private String psgTpNm;
        private String psrmClCd;
        private String rqDcntKndCd;

        public Fmly() {
        }

        public String getBtdt() {
            return this.btdt;
        }

        public String getCustFmlyNm() {
            return this.custFmlyNm;
        }

        public String getDcntKndCd() {
            return this.dcntKndCd;
        }

        public String getFmlySqno() {
            return this.fmlySqno;
        }

        public String getPsgTpCd() {
            return this.psgTpCd;
        }

        public String getPsgTpNm() {
            return this.psgTpNm;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getRqdcntKndCd() {
            return this.rqDcntKndCd;
        }

        public void setPsrmClCd(String str) {
            this.psrmClCd = str;
        }

        public void setRqdcntKndCd(String str) {
            this.rqDcntKndCd = str;
        }
    }

    public class MchdDcntTgtRequest extends BaseRequest {
        private String dptDt;

        public MchdDcntTgtRequest() {
        }

        public String getDptDt() {
            return this.dptDt;
        }

        public void setDptDt(String str) {
            this.dptDt = str;
        }
    }

    public class MchdDcntTgtResponse extends BaseResponse {
        private List<Fmly> fmlyList;

        public MchdDcntTgtResponse() {
        }

        public List<Fmly> getFmlyList() {
            return this.fmlyList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CustService custService = (CustService) getService(CustService.class);
        MchdDcntTgtRequest mchdDcntTgtRequest = (MchdDcntTgtRequest) getRequest();
        return custService.mchdDcntTgt(mchdDcntTgtRequest.getDevice(), mchdDcntTgtRequest.getVersion(), mchdDcntTgtRequest.getKey(), mchdDcntTgtRequest.getDptDt());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_mchd_dcnt_tgt;
    }
}
