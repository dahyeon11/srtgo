package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class NCardExtensionDao extends BaseDao implements Serializable {

    public class NCardExtensionRequest extends BaseRequest implements Serializable {
        private String saleDd;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public NCardExtensionRequest() {
        }

        public String getSaleDd() {
            return this.saleDd;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }

        public void setSaleDd(String str) {
            this.saleDd = str;
        }

        public void setSaleSqno(String str) {
            this.saleSqno = str;
        }

        public void setSaleWctNo(String str) {
            this.saleWctNo = str;
        }

        public void setTkRetPwd(String str) {
            this.tkRetPwd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        NCardExtensionRequest nCardExtensionRequest = (NCardExtensionRequest) getRequest();
        return researchService.setNCardExtension(nCardExtensionRequest.getDevice(), nCardExtensionRequest.getVersion(), nCardExtensionRequest.getKey(), nCardExtensionRequest.getSaleWctNo(), nCardExtensionRequest.getSaleDd(), nCardExtensionRequest.getSaleSqno(), nCardExtensionRequest.getTkRetPwd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_n_card_extension;
    }
}
