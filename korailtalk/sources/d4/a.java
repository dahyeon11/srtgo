package D4;

import I4.h;
import T4.c;
import T4.e;
import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.SeatAssignData;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.research.ConvenienceSettingDao;
import com.korail.talk.network.dao.research.NCardReservationDao;
import com.korail.talk.network.dao.research.NCardReservationDao.NCardReservationRequest;
import com.korail.talk.network.dao.reservation.SeatAssignReservationDao;
import com.korail.talk.network.dao.reservation.SeatAssignReservationDao.SeatAssignReservationRequest;
import com.korail.talk.network.dao.reservationCancel.ReservationChangeDao;
import com.korail.talk.network.dao.reservationCancel.ReservationChangeDao.ReservationChangeRequest;
import com.korail.talk.network.data.reservation.RDscp;
import com.korail.talk.network.data.reservation.RJrny;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.data.reservation.RSrcar;
import com.korail.talk.network.data.reservation.old.OJrny;
import com.korail.talk.network.data.reservation.old.OPsg;
import com.korail.talk.network.data.reservation.old.OSeat;
import com.korail.talk.network.request.reservation.ReservationRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import java.util.List;
import q4.C6111b;
import r4.d;
import r4.l;
import r4.m;
import r4.n;
import r4.o;
import r4.p;
import r4.q;
import z4.C6634h;
import z4.N;
import z4.O;
import z4.t;

/* loaded from: classes.dex */
public class a {
    private static void a(ReservationRequest reservationRequest, c cVar, String str) {
        OPsg oPsg = new OPsg();
        Bundle passengerInfo = cVar.getPassengerInfo();
        oPsg.setTotPsgCnt(String.valueOf(passengerInfo.getInt("TOTAL_PERSON_COUNT")));
        oPsg.setCompaCnt(1, String.valueOf(passengerInfo.getInt("ADULT_COUNT")));
        oPsg.setPsgTpCd(1, "1");
        oPsg.setDiscKndCd(1, "000");
        oPsg.setCompaCnt(2, String.valueOf(passengerInfo.getInt("TEENAGER_COUNT")));
        oPsg.setPsgTpCd(2, "1");
        oPsg.setDiscKndCd(2, "P11");
        oPsg.setCompaCnt(3, String.valueOf(passengerInfo.getInt("CHILD_COUNT")));
        oPsg.setPsgTpCd(3, "3");
        oPsg.setDiscKndCd(3, "000");
        oPsg.setCompaCnt(4, String.valueOf(passengerInfo.getInt("CHILD_ACCOMPANY_COUNT")));
        oPsg.setPsgTpCd(4, "3");
        oPsg.setDiscKndCd(4, "321");
        oPsg.setCompaCnt(5, String.valueOf(passengerInfo.getInt("SENIOR_COUNT")));
        oPsg.setPsgTpCd(5, "1");
        oPsg.setDiscKndCd(5, "131");
        oPsg.setCompaCnt(6, String.valueOf(passengerInfo.getInt("HIGH_DISABLE_COUNT")));
        oPsg.setPsgTpCd(6, "1");
        oPsg.setDiscKndCd(6, "111");
        oPsg.setCompaCnt(7, String.valueOf(passengerInfo.getInt("LOW_DISABLE_COUNT")));
        oPsg.setPsgTpCd(7, "1");
        oPsg.setDiscKndCd(7, "112");
        oPsg.setCompaCnt(8, String.valueOf(passengerInfo.getInt("GUIDE_DOG_COUNT")));
        oPsg.setPsgTpCd(8, "1");
        oPsg.setDiscKndCd(8, "173");
        reservationRequest.setOPsg(oPsg);
    }

    private static void b(ReservationRequest reservationRequest, String str, String str2, String str3) {
        reservationRequest.setMenuId(str);
        reservationRequest.setGdNo(str3);
        reservationRequest.setJobId("1101");
        reservationRequest.setHidFreeFlg("N");
        reservationRequest.setStndFlg("N");
        OSeat oSeat = new OSeat();
        oSeat.setSeatAttCd1(q.DISABLE.getCode());
        oSeat.setSeatAttCd2(l.DEFAULT.getCode());
        oSeat.setSeatAttCd3(n.DEFAULT.getCode());
        oSeat.setSeatAttCd4(1, str2);
        oSeat.setSeatAttCd5(m.DISABLE.getCode());
        oSeat.setPsrmClCd(1, o.GENERAL.getCode());
        reservationRequest.setOSeat(oSeat);
    }

    public static ReservationRequest getNCardReservationRequest(TicketDetailDao.TicketDetailResponse ticketDetailResponse, SeatAssignData seatAssignData) {
        ReservationRequest reservationRequest = new ReservationRequest();
        b(reservationRequest, seatAssignData.getMenuId(), seatAssignData.getSeatAttCd1(), "");
        OPsg oPsg = new OPsg();
        oPsg.setTotPsgCnt(String.valueOf(1));
        oPsg.setCompaCnt(1, String.valueOf(1));
        oPsg.setPsgTpCd(1, "1");
        oPsg.setDiscKndCd(1, "153");
        oPsg.setCardNo(1, ticketDetailResponse.getDcnt_crd_info().getH_dcnt_crd_no());
        reservationRequest.setOPsg(oPsg);
        return reservationRequest;
    }

    public static NCardReservationDao.NCardReservationRequest getNCardReservationVersion2Request(X4.a aVar) {
        h hVar = h.getInstance();
        NCardReservationDao.NCardReservationRequest nCardReservationRequest = new NCardReservationDao().new NCardReservationRequest();
        nCardReservationRequest.setDcntCrdKndMgNo(aVar.getDiscountTypeNumber());
        nCardReservationRequest.setCustMgNo(hVar.getCustNo());
        nCardReservationRequest.setVlidTrmStDt(C6634h.getToday("yyyyMMdd"));
        nCardReservationRequest.setUsePsbTno(aVar.getNumberOfUses());
        return nCardReservationRequest;
    }

    public static ReservationRequest getOReservationRequest(c cVar) {
        return getOReservationRequest("11", p.DEFAULT.getCode(), "", cVar);
    }

    public static ReservationChangeDao.ReservationChangeRequest getReservationChangeRequest(ReservationResponse reservationResponse, e eVar) {
        int i8;
        Bundle passengerInfo = eVar.getPassengerInfo();
        int i9 = passengerInfo.getInt("TOTAL_PERSON_COUNT");
        RJrny rJrny = new RJrny();
        RSrcar rSrcar = new RSrcar();
        RSeat rSeat = new RSeat();
        ReservationChangeDao.ReservationChangeRequest reservationChangeRequest = new ReservationChangeDao().new ReservationChangeRequest();
        List<ReservationResponse.JrnyInfo> jrny_info = reservationResponse.getJrny_infos().getJrny_info();
        reservationChangeRequest.setPnrNo(reservationResponse.getH_pnr_no());
        reservationChangeRequest.setTotPrnb(String.valueOf(i9));
        reservationChangeRequest.setStndFlg("N");
        reservationChangeRequest.setEvntWctFlg("N");
        reservationChangeRequest.setWctHndgCncDvCd("N");
        reservationChangeRequest.setLrgCrgFlg("N");
        int i10 = 0;
        reservationChangeRequest.setChgTno(jrny_info.get(0).getH_rsv_chg_no());
        rJrny.setJrnyCnt(reservationResponse.getH_jrny_cnt());
        int i11 = 0;
        while (i11 < jrny_info.size()) {
            int i12 = i11 + 1;
            ReservationResponse.JrnyInfo jrnyInfo = jrny_info.get(i11);
            rJrny.setJrnySqNo(i12, jrnyInfo.getH_jrny_sqno());
            rJrny.setJrnyTpCd(i12, jrnyInfo.getH_jrny_tp_cd());
            rJrny.setTrnNo(i12, N.addZero(5, Integer.parseInt(jrnyInfo.getH_trn_no())));
            rJrny.setRunDt(i12, jrnyInfo.getH_dpt_dt());
            rJrny.setStlbTrnClsfCd(i12, jrnyInfo.getH_stlb_trn_clsf_cd());
            rJrny.setTrnGpCd(i12, jrnyInfo.getH_trn_gp_cd());
            rJrny.setDptDt(i12, jrnyInfo.getH_dpt_dt());
            rJrny.setDptTm(i12, jrnyInfo.getH_dpt_tm());
            rJrny.setDptRsStnCd(i12, jrnyInfo.getH_dpt_rs_stn_cd());
            rJrny.setDptStnConsOrdr(i12, jrnyInfo.getH_dpt_stn_cons_ordr());
            rJrny.setArvRsStnCd(i12, jrnyInfo.getH_arv_rs_stn_cd());
            rJrny.setArvStnConsOrdr(i12, jrnyInfo.getH_arv_stn_cons_ordr());
            rSrcar.setScarCnt(i12, "0");
            ReservationResponse.SeatInfo seatInfo = jrnyInfo.getSeat_infos().getSeat_info().get(0);
            rSeat.setSeatCnt(i12, "1");
            rSeat.setSeatPsrmClCd(i12, 1, seatInfo.getH_psrm_cl_cd());
            rSeat.setRqSeatAttCd(i12, 1, seatInfo.getH_rq_seat_att_cd());
            i11 = i12;
        }
        RPsg rPsg = new RPsg();
        RDscp rDscp = new RDscp();
        rPsg.setPsgCnt(String.valueOf(i9));
        int i13 = passengerInfo.getInt("ADULT_COUNT");
        if (i13 > 0) {
            int i14 = 0;
            i8 = 1;
            while (i14 < i13) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "1");
                rDscp.setDscpCnt(i8, "0");
                i14++;
                i8++;
            }
        } else {
            i8 = 1;
        }
        int i15 = passengerInfo.getInt("CHILD_COUNT");
        if (i15 > 0) {
            int i16 = 0;
            while (i16 < i15) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "3");
                rDscp.setDscpCnt(i8, "0");
                i16++;
                i8++;
            }
        }
        int i17 = passengerInfo.getInt("CHILD_ACCOMPANY_COUNT");
        if (i17 > 0) {
            int i18 = 0;
            while (i18 < i17) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "3");
                rDscp.setDscpCnt(i8, "1");
                rDscp.setDcntKndCd(i8, 1, "321");
                i18++;
                i8++;
            }
        }
        int i19 = passengerInfo.getInt("SENIOR_COUNT");
        if (i19 > 0) {
            int i20 = 0;
            while (i20 < i19) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "1");
                rDscp.setDscpCnt(i8, "1");
                rDscp.setDcntKndCd(i8, 1, "131");
                i20++;
                i8++;
            }
        }
        int i21 = passengerInfo.getInt("HIGH_DISABLE_COUNT");
        if (i21 > 0) {
            int i22 = 0;
            while (i22 < i21) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "1");
                rDscp.setDscpCnt(i8, "1");
                rDscp.setDcntKndCd(i8, 1, "111");
                i22++;
                i8++;
            }
        }
        int i23 = passengerInfo.getInt("LOW_DISABLE_COUNT");
        if (i23 > 0) {
            while (i10 < i23) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "1");
                rDscp.setDscpCnt(i8, "1");
                rDscp.setDcntKndCd(i8, 1, "112");
                i10++;
                i8++;
            }
        }
        reservationChangeRequest.setRJrny(rJrny);
        reservationChangeRequest.setRSrcar(rSrcar);
        reservationChangeRequest.setRSeat(rSeat);
        reservationChangeRequest.setRPsg(rPsg);
        reservationChangeRequest.setRDscp(rDscp);
        return reservationChangeRequest;
    }

    public static SeatAssignReservationDao.SeatAssignReservationRequest getSeatAssignReservationRequest(TicketDetailDao.TicketDetailResponse ticketDetailResponse, SeatAssignData seatAssignData, int i8) {
        h hVar = h.getInstance();
        SeatAssignReservationDao.SeatAssignReservationRequest seatAssignReservationRequest = new SeatAssignReservationDao().new SeatAssignReservationRequest();
        seatAssignReservationRequest.setMenuId(seatAssignData.getMenuId());
        seatAssignReservationRequest.setCustMgNo(hVar.getCustNo());
        seatAssignReservationRequest.setTotPrnb(String.valueOf(i8));
        seatAssignReservationRequest.setStndFlg("N");
        seatAssignReservationRequest.setRqScarNum("0");
        RSeat rSeat = new RSeat();
        rSeat.setSeatCnt(1, "1");
        d dVar = d.DIRECT_SQ_NO;
        rSeat.setSmkSeatAttCd(Integer.parseInt(dVar.getCode()), 1, q.DISABLE.getCode());
        rSeat.setDirSeatAttCd(Integer.parseInt(dVar.getCode()), 1, l.DEFAULT.getCode());
        rSeat.setLocSeatAttCd(Integer.parseInt(dVar.getCode()), 1, n.DEFAULT.getCode());
        rSeat.setRqSeatAttCd(Integer.parseInt(dVar.getCode()), 1, seatAssignData.getSeatAttCd1());
        rSeat.setEtcSeatAttCd(Integer.parseInt(dVar.getCode()), 1, m.DISABLE.getCode());
        seatAssignReservationRequest.setRSeat(rSeat);
        RPsg rPsg = new RPsg();
        rPsg.setPsgCnt(String.valueOf(1));
        rPsg.setPsgInfoPerPrnb(1, String.valueOf(i8));
        rPsg.setPsgTpDvCd(1, "1");
        seatAssignReservationRequest.setRPsg(rPsg);
        ROrtg rOrtg = new ROrtg();
        rOrtg.setOrtgCnt("1");
        rOrtg.setOgtkSaleWctNo(1, ticketDetailResponse.getH_orgtk_wct_no());
        rOrtg.setOgtkSaleDd(1, ticketDetailResponse.getH_orgtk_ret_sale_dt());
        rOrtg.setOgtkSaleSqno(1, ticketDetailResponse.getH_orgtk_sale_sqno());
        rOrtg.setOgtkRetPwd(1, ticketDetailResponse.getH_orgtk_ret_pwd());
        rOrtg.setCmtrDvCd(1, TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE);
        seatAssignReservationRequest.setROrtg(rOrtg);
        return seatAssignReservationRequest;
    }

    public static ReservationRequest getOReservationRequest(String str, String str2, c cVar) {
        return getOReservationRequest(str, str2, "", cVar);
    }

    public static ReservationRequest getOReservationRequest(String str, String str2, String str3, c cVar) {
        t.d("============================================================");
        t.d("menuId = " + str + " seatType = " + str2 + " gdNo = " + str3);
        t.d("============================================================");
        ReservationRequest reservationRequest = new ReservationRequest();
        a(reservationRequest, cVar, str2);
        b(reservationRequest, str, str2, str3);
        return reservationRequest;
    }

    public static ReservationRequest getOReservationRequest(V4.b bVar, com.korail.talk.ui.booking.option.date.a aVar, T4.d dVar, ConvenienceSettingDao.CustTripInfo custTripInfo) {
        ReservationRequest oReservationRequest = getOReservationRequest(dVar);
        CalendarData selectedDate = aVar.getSelectedDate();
        OJrny oJrny = new OJrny();
        d dVar2 = d.DIRECT_SQ_NO;
        oJrny.setJrnyCnt(dVar2.getCode());
        oJrny.setJrnyTpCd(1, (dVar2.getCode().equals(custTripInfo.getDirtChtnDvCd()) ? r4.e.DIRECT : r4.e.TRANSFER).getCode());
        if (!dVar2.getCode().equals(custTripInfo.getDirtChtnDvCd())) {
            dVar2 = d.TRANSFER_SQ_NO;
        }
        oJrny.setJrnySqNo(1, O.getSequenceNo(dVar2.getCode()));
        oJrny.setTrnGpCd(1, custTripInfo.getTrnGpCd());
        oJrny.setTrnClsfCd(1, custTripInfo.getTrnClsfCd());
        oJrny.setDptRsStnCd(1, C6111b.getInstance().getStationDataByName(bVar.getStartStationNm()).getStnCd());
        oJrny.setArvRsStnCd(1, C6111b.getInstance().getStationDataByName(bVar.getArrivalStationNm()).getStnCd());
        oJrny.setDptDt(1, C6634h.getDate(selectedDate));
        oJrny.setDptTm(1, C6634h.getHour(selectedDate));
        oReservationRequest.setOJrny(oJrny);
        OSeat oSeat = new OSeat();
        oSeat.setSeatAttCd2(custTripInfo.getDirSeatAttGpCd());
        oSeat.setSeatAttCd3(custTripInfo.getLocSeatAttGpCd());
        oSeat.setSeatAttCd4(1, custTripInfo.getAddSeatAttCd());
        oSeat.setPsrmClCd(1, custTripInfo.getPsrmClCd());
        oReservationRequest.setOSeat(oSeat);
        return oReservationRequest;
    }

    public static NCardReservationDao.NCardReservationRequest getNCardReservationRequest(X4.b bVar) {
        h hVar = h.getInstance();
        NCardReservationDao.NCardReservationRequest nCardReservationRequest = new NCardReservationDao().new NCardReservationRequest();
        nCardReservationRequest.setDcntCrdKndMgNo(bVar.getDiscountTypeNumber());
        nCardReservationRequest.setCustMgNo(hVar.getCustNo());
        nCardReservationRequest.setVlidTrmStDt(C6634h.getToday("yyyyMMdd"));
        nCardReservationRequest.setUsePsbTno(bVar.getNumberOfUses());
        return nCardReservationRequest;
    }
}
