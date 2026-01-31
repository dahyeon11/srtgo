package com.korail.talk.network.dao.trainsInfo;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class FresScarDao extends BaseDao {

    public class FresScarRequest extends BaseRequest {
        private String arvStnConsOrdr;
        private String arvStnRunOrdr;
        private String dptStnConsOrdr;
        private String dptStnRunOrdr;
        private String runDt;
        private String trnNo;

        public FresScarRequest() {
        }

        public String getArvStnConsOrdr() {
            return this.arvStnConsOrdr;
        }

        public String getArvStnRunOrdr() {
            return this.arvStnRunOrdr;
        }

        public String getDptStnConsOrdr() {
            return this.dptStnConsOrdr;
        }

        public String getDptStnRunOrdr() {
            return this.dptStnRunOrdr;
        }

        public String getRunDt() {
            return this.runDt;
        }

        public String getTrnNo() {
            return this.trnNo;
        }

        public void setArvStnConsOrdr(String str) {
            this.arvStnConsOrdr = str;
        }

        public void setArvStnRunOrdr(String str) {
            this.arvStnRunOrdr = str;
        }

        public void setDptStnConsOrdr(String str) {
            this.dptStnConsOrdr = str;
        }

        public void setDptStnRunOrdr(String str) {
            this.dptStnRunOrdr = str;
        }

        public void setRunDt(String str) {
            this.runDt = str;
        }

        public void setTrnNo(String str) {
            this.trnNo = str;
        }
    }

    public class FresScarResponse extends BaseResponse {
        private String fresCont;
        private String fresScarNo;
        private String fresTtl;

        public FresScarResponse() {
        }

        public String getFresCont() {
            return this.fresCont;
        }

        public String getFresScarNo() {
            return this.fresScarNo;
        }

        public String getFresTtl() {
            return this.fresTtl;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TrainsInfoService trainsInfoService = (TrainsInfoService) getService(TrainsInfoService.class);
        FresScarRequest fresScarRequest = (FresScarRequest) getRequest();
        return trainsInfoService.getFresScar(fresScarRequest.getDevice(), fresScarRequest.getVersion(), fresScarRequest.getKey(), fresScarRequest.getRunDt(), fresScarRequest.getTrnNo(), fresScarRequest.getDptStnConsOrdr(), fresScarRequest.getArvStnConsOrdr(), fresScarRequest.getDptStnRunOrdr(), fresScarRequest.getArvStnRunOrdr());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_fres_scar;
    }
}
