package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class PaycoDao extends BaseDao {

    public class PayCoBridgeInfo {
        private String orderSheetUrl;

        public PayCoBridgeInfo() {
        }

        public String getOrderSheetUrl() {
            return this.orderSheetUrl;
        }
    }

    public class PaycoPaymentRequest extends BaseRequest {
        private String ticketName;
        private String ticketPrice;

        public PaycoPaymentRequest() {
        }

        public String getTicketName() {
            return this.ticketName;
        }

        public String getTicketPrice() {
            return this.ticketPrice;
        }

        public void setTicketName(String str) {
            this.ticketName = str;
        }

        public void setTicketPrice(String str) {
            this.ticketPrice = str;
        }
    }

    public class PaycoPaymentResponse extends BaseResponse {
        private RecvData recvData;

        public PaycoPaymentResponse() {
        }

        public RecvData getRecvData() {
            return this.recvData;
        }
    }

    public class RecvData {
        private PayCoBridgeInfo result;

        public RecvData() {
        }

        public PayCoBridgeInfo getResult() {
            return this.result;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        PaycoPaymentRequest paycoPaymentRequest = (PaycoPaymentRequest) getRequest();
        return payService.getPaycoResult(paycoPaymentRequest.getDevice(), paycoPaymentRequest.getVersion(), paycoPaymentRequest.getKey(), paycoPaymentRequest.getTicketPrice(), paycoPaymentRequest.getTicketName());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_easypay_payco;
    }
}
