package com.korail.talk.network.dao.myTicket;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.myTicket.PushUpdateRequest;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class SpecialRoomUpgradeDao extends BaseDao {

    public class Jrnys {
        private String lumpStlTgtNo;

        public Jrnys() {
        }

        public String getLumpStlTgtNo() {
            return this.lumpStlTgtNo;
        }
    }

    public class SpecialRoomUpgradeResponse extends BaseResponse {
        private List<Jrnys> jrnys;
        private TicketInfo ticketInfo;

        public SpecialRoomUpgradeResponse() {
        }

        public List<Jrnys> getJrnys() {
            return this.jrnys;
        }

        public TicketInfo getTicketInfo() {
            return this.ticketInfo;
        }
    }

    public class TicketInfo {
        private String custNm;
        private String scnIndcAmt;
        private String totFare;

        public TicketInfo() {
        }

        public String getCustNm() {
            return this.custNm;
        }

        public String getScnIndcAmt() {
            return this.scnIndcAmt;
        }

        public String getTotFare() {
            return this.totFare;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        MyTicketService myTicketService = (MyTicketService) getService(MyTicketService.class);
        PushUpdateRequest pushUpdateRequest = (PushUpdateRequest) getRequest();
        return myTicketService.requestUpgradeSeat(pushUpdateRequest.getDevice(), pushUpdateRequest.getVersion(), pushUpdateRequest.getKey(), pushUpdateRequest.getOgtkSaleDd(), pushUpdateRequest.getOgtkSaleWctNo(), pushUpdateRequest.getOgtkSaleSqno(), pushUpdateRequest.getOgtkRetPwd(), pushUpdateRequest.getJrnyTpCd(), pushUpdateRequest.getJrnySqno(), pushUpdateRequest.getDptDt(), pushUpdateRequest.getDptStnConsOrdr(), pushUpdateRequest.getDptStnRunOrdr(), pushUpdateRequest.getDptRsStnCd(), pushUpdateRequest.getDptTm(), pushUpdateRequest.getArvDt(), pushUpdateRequest.getArvStnConsOrdr(), pushUpdateRequest.getArvStnRunOrdr(), pushUpdateRequest.getArvRsStnCd(), pushUpdateRequest.getArvTm(), pushUpdateRequest.getTrnNo(), pushUpdateRequest.getRunDt(), pushUpdateRequest.getTrnGpCd(), pushUpdateRequest.getRoomClsfCd(), pushUpdateRequest.getScarNo(), pushUpdateRequest.getSeatNo(), pushUpdateRequest.getRqSeatAttCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cart_upgrade_service;
    }
}
