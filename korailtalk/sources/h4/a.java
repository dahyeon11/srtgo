package H4;

import F4.C0500a;
import com.korail.talk.network.dao.refund.TicketDetailDao;

/* loaded from: classes.dex */
public interface a {
    default void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
        callTicketKind(ticketDetailResponse, false, 0);
    }

    void setCommutationTicket(int i8);

    void setGPassTicket(int i8);

    void setGeneralTicket(int i8);

    void setNCCardTicket(int i8);

    void setPassTicket(int i8);

    default void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8) {
        callTicketKind(ticketDetailResponse, z8, 0);
    }

    default void callTicketKind(TicketDetailDao.TicketDetailResponse ticketDetailResponse, boolean z8, int i8) {
        String h_tk_knd_cd = ticketDetailResponse.getH_tk_knd_cd();
        TicketDetailDao.TicketInfo ticketInfo = ticketDetailResponse.getTicket_infos().getTicket_info().get(0);
        String h_schd_tk_knd_cd = ticketDetailResponse.getH_schd_tk_knd_cd();
        String h_cmtr_utl_trm_age_cd = ticketDetailResponse.getH_cmtr_utl_trm_age_cd();
        if (!C0500a.isGeneralTicket(h_tk_knd_cd, ticketInfo.getH_trn_clsf_cd(), z8) && !C0500a.isSeatAssignTicket(h_tk_knd_cd)) {
            if ("13".equals(h_tk_knd_cd)) {
                if (C0500a.isCommutation(h_schd_tk_knd_cd, h_cmtr_utl_trm_age_cd)) {
                    setCommutationTicket(i8);
                    return;
                } else if (C0500a.isGPass(h_schd_tk_knd_cd)) {
                    setGPassTicket(i8);
                    return;
                } else {
                    setPassTicket(i8);
                    return;
                }
            }
            if (C0500a.isNTicket(h_tk_knd_cd)) {
                setNCCardTicket(i8);
                return;
            }
            return;
        }
        setGeneralTicket(i8);
    }
}
