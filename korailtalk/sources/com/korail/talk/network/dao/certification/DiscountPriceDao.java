package com.korail.talk.network.dao.certification;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DiscountPriceDao extends BaseDao {

    public class DiscountPriceRequest extends BaseRequest {
        private List<String> dcnt_knd_cd1;
        private String hidCustNo;
        private List<String> hidDcntKndCd;
        private List<String> hidDscpNo;
        private List<String> hidFmlyNo;
        private String hidPnrNo;
        private String hiduserYn;
        private List<String> psg_tp_dv_cd;
        private List<String> psrm_cl_cd;
        private String txtJobId;
        private String txtPsgGridcnt;

        public DiscountPriceRequest() {
        }

        public List<String> getDcnt_knd_cd1() {
            return this.dcnt_knd_cd1;
        }

        public String getHidCustNo() {
            return this.hidCustNo;
        }

        public List<String> getHidDcntKndCd() {
            return this.hidDcntKndCd;
        }

        public List<String> getHidDscpNo() {
            return this.hidDscpNo;
        }

        public List<String> getHidFmlyNo() {
            return this.hidFmlyNo;
        }

        public String getHidPnrNo() {
            return this.hidPnrNo;
        }

        public String getHiduserYn() {
            return this.hiduserYn;
        }

        public List<String> getPsg_tp_dv_cd() {
            return this.psg_tp_dv_cd;
        }

        public List<String> getPsrm_cl_cd() {
            return this.psrm_cl_cd;
        }

        public String getTxtJobId() {
            return this.txtJobId;
        }

        public String getTxtPsgGridcnt() {
            return this.txtPsgGridcnt;
        }

        public void setDcnt_knd_cd1(List<String> list) {
            this.dcnt_knd_cd1 = list;
        }

        public void setHidCustNo(String str) {
            this.hidCustNo = str;
        }

        public void setHidDcntKndCd(List<String> list) {
            this.hidDcntKndCd = list;
        }

        public void setHidDscpNo(List<String> list) {
            this.hidDscpNo = list;
        }

        public void setHidFmlyNo(List<String> list) {
            this.hidFmlyNo = list;
        }

        public void setHidPnrNo(String str) {
            this.hidPnrNo = str;
        }

        public void setHiduserYn(String str) {
            this.hiduserYn = str;
        }

        public void setPsg_tp_dv_cd(List<String> list) {
            this.psg_tp_dv_cd = list;
        }

        public void setPsrm_cl_cd(List<String> list) {
            this.psrm_cl_cd = list;
        }

        public void setTxtJobId(String str) {
            this.txtJobId = str;
        }

        public void setTxtPsgGridcnt(String str) {
            this.txtPsgGridcnt = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CertificationService certificationService = (CertificationService) getService(CertificationService.class);
        DiscountPriceRequest discountPriceRequest = (DiscountPriceRequest) getRequest();
        return certificationService.getDiscountPrice(discountPriceRequest.getDevice(), discountPriceRequest.getVersion(), discountPriceRequest.getKey(), discountPriceRequest.getHidPnrNo(), discountPriceRequest.getTxtJobId(), discountPriceRequest.getHiduserYn(), discountPriceRequest.getHidCustNo(), discountPriceRequest.getTxtPsgGridcnt(), discountPriceRequest.getPsg_tp_dv_cd(), discountPriceRequest.getHidDcntKndCd(), discountPriceRequest.getDcnt_knd_cd1(), discountPriceRequest.getHidDscpNo(), discountPriceRequest.getPsrm_cl_cd(), discountPriceRequest.getHidFmlyNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_discount_price;
    }
}
