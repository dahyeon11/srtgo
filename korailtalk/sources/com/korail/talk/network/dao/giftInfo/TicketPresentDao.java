package com.korail.talk.network.dao.giftInfo;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TicketPresentDao extends BaseDao implements Serializable {
    public static final String DEFAULT_HID_INFO_INP_DV_CD = "O";
    public static final String KAKAO_HID_INFO_INP_DV_CD = "K";
    public static final String SMS_HID_INFO_INP_DV_CD = "S";

    public class TicketPresentParams extends LinkedHashMap<String, String> {
        private final String SALE_WCT_NO = "hidSaleWctNo";
        private final String SALE_DT = "hidSaleDt";
        private final String SALE_SQ_NO = "hidSaleSqno";
        private final String SALE_RETURN_PWD = "hidtkRetPwd";

        public TicketPresentParams() {
        }

        public void setHidRetPwd(int i8, String str) {
            String str2 = "hidtkRetPwd";
            if (i8 != 0) {
                str2 = "hidtkRetPwd" + i8;
            }
            put(str2, str);
        }

        public void setHidSaleDt(int i8, String str) {
            String str2 = "hidSaleDt";
            if (i8 != 0) {
                str2 = "hidSaleDt" + i8;
            }
            put(str2, str);
        }

        public void setHidSaleSqno(int i8, String str) {
            String str2 = "hidSaleSqno";
            if (i8 != 0) {
                str2 = "hidSaleSqno" + i8;
            }
            put(str2, str);
        }

        public void setHidSaleWctNo(int i8, String str) {
            String str2 = "hidSaleWctNo";
            if (i8 != 0) {
                str2 = "hidSaleWctNo" + i8;
            }
            put(str2, str);
        }
    }

    public static class TicketPresentRequest extends BaseRequest {
        private String hidAcepPsNm;
        private String hidAcepPsTeln;
        private String hidAcepPwd;
        private String hidInfoInpDvCd;
        private String hidPbpAcepPsCustMgNo;
        private String hidPbpAcepPsMbFlg;
        private String hidPnrNo;
        private String hidRsvChgNo;
        private String hidSaleCnt;
        private String hidTotNewStlAmt;
        private TicketPresentParams ticketPresentParams;

        public String getHidAcepPsNm() {
            return this.hidAcepPsNm;
        }

        public String getHidAcepPsTeln() {
            return this.hidAcepPsTeln;
        }

        public String getHidAcepPwd() {
            return this.hidAcepPwd;
        }

        public String getHidInfoInpDvCd() {
            return this.hidInfoInpDvCd;
        }

        public String getHidPbpAcepPsCustMgNo() {
            return this.hidPbpAcepPsCustMgNo;
        }

        public String getHidPbpAcepPsMbFlg() {
            return this.hidPbpAcepPsMbFlg;
        }

        public String getHidPnrNo() {
            return this.hidPnrNo;
        }

        public String getHidRsvChgNo() {
            return this.hidRsvChgNo;
        }

        public String getHidSaleCnt() {
            return this.hidSaleCnt;
        }

        public String getHidTotNewStlAmt() {
            return this.hidTotNewStlAmt;
        }

        public Map<String, String> getTicketPresentParams() {
            return this.ticketPresentParams;
        }

        public void setHidAcepPsNm(String str) {
            this.hidAcepPsNm = str;
        }

        public void setHidAcepPsTeln(String str) {
            this.hidAcepPsTeln = str;
        }

        public void setHidAcepPwd(String str) {
            this.hidAcepPwd = str;
        }

        public void setHidInfoInpDvCd(String str) {
            this.hidInfoInpDvCd = str;
        }

        public void setHidPbpAcepPsCustMgNo(String str) {
            this.hidPbpAcepPsCustMgNo = str;
        }

        public void setHidPbpAcepPsMbFlg(String str) {
            this.hidPbpAcepPsMbFlg = str;
        }

        public void setHidPnrNo(String str) {
            this.hidPnrNo = str;
        }

        public void setHidRsvChgNo(String str) {
            this.hidRsvChgNo = str;
        }

        public void setHidSaleCnt(String str) {
            this.hidSaleCnt = str;
        }

        public void setHidTotNewStlAmt(String str) {
            this.hidTotNewStlAmt = str;
        }

        public void setTicketPresentParams(TicketPresentParams ticketPresentParams) {
            this.ticketPresentParams = ticketPresentParams;
        }
    }

    public class TicketPresentResponse extends BaseResponse {
        private String chgePbpRsvNo;

        public TicketPresentResponse() {
        }

        public String getChgePbpRsvNo() {
            return this.chgePbpRsvNo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        GiftInfoService giftInfoService = (GiftInfoService) getService(GiftInfoService.class);
        TicketPresentRequest ticketPresentRequest = (TicketPresentRequest) getRequest();
        return giftInfoService.presentTicket(ticketPresentRequest.getDevice(), ticketPresentRequest.getVersion(), ticketPresentRequest.getKey(), ticketPresentRequest.getHidAcepPsNm(), ticketPresentRequest.getHidAcepPsTeln(), ticketPresentRequest.getHidPbpAcepPsMbFlg(), ticketPresentRequest.getHidPbpAcepPsCustMgNo(), ticketPresentRequest.getHidPnrNo(), ticketPresentRequest.getHidTotNewStlAmt(), ticketPresentRequest.getHidRsvChgNo(), ticketPresentRequest.getHidInfoInpDvCd(), ticketPresentRequest.getHidSaleCnt(), ticketPresentRequest.getHidAcepPwd(), ticketPresentRequest.getTicketPresentParams());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_present;
    }
}
