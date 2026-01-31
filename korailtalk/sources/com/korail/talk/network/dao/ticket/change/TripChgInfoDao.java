package com.korail.talk.network.dao.ticket.change;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.ticket.TicketService;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class TripChgInfoDao extends BaseDao {

    public class TripChgInfoDaoRequest extends BaseRequest {
        private String tripChgDate;

        public TripChgInfoDaoRequest() {
        }

        public String getTripChgDate() {
            return this.tripChgDate;
        }

        public void setTripChgDate(String str) {
            this.tripChgDate = str;
        }
    }

    public class TripChgInfoDaoResponse extends BaseResponse implements Serializable {
        private String lastRunDt;
        private String tripChgDate;
        private List<String> tripChgDates;

        public TripChgInfoDaoResponse() {
        }

        public String geTtripChgDate() {
            return this.tripChgDate;
        }

        public String getLastRunDt() {
            return this.lastRunDt;
        }

        public List<String> getTripChgDates() {
            return this.tripChgDates;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        TicketService ticketService = (TicketService) getService(TicketService.class);
        TripChgInfoDaoRequest tripChgInfoDaoRequest = (TripChgInfoDaoRequest) getRequest();
        return ticketService.getTripChgDate(tripChgInfoDaoRequest.getDevice(), tripChgInfoDaoRequest.getVersion(), tripChgInfoDaoRequest.getKey(), tripChgInfoDaoRequest.getTripChgDate());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_ticket_trip_chg_info;
    }
}
