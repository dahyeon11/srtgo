package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.ArrayList;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SpayCphdDatValDao extends BaseDao {

    public class SpayCphdDatValRequest extends BaseRequest {
        private ArrayList<String> data;
        private String mainPgCode;
        private String paymentMethodType;
        private String spayDvCd;
        private String type;

        public SpayCphdDatValRequest() {
        }

        public ArrayList<String> getData() {
            return this.data;
        }

        public String getMainPgCode() {
            return this.mainPgCode;
        }

        public String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        public String getSpayDvCd() {
            return this.spayDvCd;
        }

        public String getType() {
            return this.type;
        }

        public void setData(ArrayList<String> arrayList) {
            this.data = arrayList;
        }

        public void setMainPgCode(String str) {
            this.mainPgCode = str;
        }

        public void setPaymentMethodType(String str) {
            this.paymentMethodType = str;
        }

        public void setSpayDvCd(String str) {
            this.spayDvCd = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public class SpayCphdDatValResponse extends BaseResponse {
        private String spayCphdDatVal;
        private String stlCrCrdNo;

        public SpayCphdDatValResponse() {
        }

        public String getSpayCphdDatVal() {
            return this.spayCphdDatVal;
        }

        public String getStlCrCrdNo() {
            return this.stlCrCrdNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        SpayCphdDatValRequest spayCphdDatValRequest = (SpayCphdDatValRequest) getRequest();
        return payService.getSpayCphdDatVal(spayCphdDatValRequest.getDevice(), spayCphdDatValRequest.getVersion(), spayCphdDatValRequest.getKey(), spayCphdDatValRequest.getSpayDvCd(), spayCphdDatValRequest.getData());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_spay_cphd_data_val;
    }
}
