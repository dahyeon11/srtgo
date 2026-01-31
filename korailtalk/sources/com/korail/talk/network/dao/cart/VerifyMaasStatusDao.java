package com.korail.talk.network.dao.cart;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class VerifyMaasStatusDao extends BaseDao {

    public class VerifyMaasStatusRequest extends BaseRequest {
        private String addSrvDvCd;
        private String addSrvReqNo;
        private String coptEntRsvNo;
        private String lumpStlTgtNo;
        private int seletedPos;

        public VerifyMaasStatusRequest() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getCoptEntRsvNo() {
            return this.coptEntRsvNo;
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }

        public int getSeletedPos() {
            return this.seletedPos;
        }

        public void setAddSrvDvCd(String str) {
            this.addSrvDvCd = str;
        }

        public void setAddSrvReqNo(String str) {
            this.addSrvReqNo = str;
        }

        public void setCoptEntRsvNo(String str) {
            this.coptEntRsvNo = str;
        }

        public void setLumpStlTgtNo(String str) {
            this.lumpStlTgtNo = str;
        }

        public void setSeletedPos(int i8) {
            this.seletedPos = i8;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CartService cartService = (CartService) getService(CartService.class);
        VerifyMaasStatusRequest verifyMaasStatusRequest = (VerifyMaasStatusRequest) getRequest();
        return cartService.verifyMaasStatus(verifyMaasStatusRequest.getDevice(), verifyMaasStatusRequest.getVersion(), verifyMaasStatusRequest.getKey(), verifyMaasStatusRequest.getAddSrvDvCd(), verifyMaasStatusRequest.getAddSrvReqNo(), verifyMaasStatusRequest.getCoptEntRsvNo(), verifyMaasStatusRequest.getLumpStlTgtNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_verify_maas_status;
    }
}
