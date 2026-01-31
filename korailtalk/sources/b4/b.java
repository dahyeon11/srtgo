package B4;

import F4.C0500a;
import T4.c;
import android.content.Context;
import android.os.Bundle;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.SeatAssignData;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao;
import com.korail.talk.network.dao.pass.CommRsvInquiryDao.CommRsvInquiryRequest;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.dao.research.NCardInquiryDao;
import com.korail.talk.network.dao.research.NCardInquiryDao.NCardInquiryRequest;
import com.korail.talk.network.dao.research.SeatAssignScheduleViewDao;
import com.korail.talk.network.dao.research.SeatAssignScheduleViewDao.SeatAssignScheduleViewRequest;
import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import java.util.List;
import r4.d;
import r4.l;
import r4.n;
import r4.o;
import r4.p;
import r4.s;
import z4.C6630d;
import z4.C6634h;
import z4.N;
import z4.O;
import z4.t;

/* loaded from: classes.dex */
public class b {
    public static CommRsvInquiryDao.CommRsvInquiryRequest getCommRsvInquiryRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        CommRsvInquiryDao.CommRsvInquiryRequest commRsvInquiryRequest = new CommRsvInquiryDao().new CommRsvInquiryRequest();
        commRsvInquiryRequest.setTxtCmtrKndCd(str);
        commRsvInquiryRequest.setTxtCmtrUtlTrmCd(str2);
        commRsvInquiryRequest.setTxtCmtrUtlTrmNm(str3);
        commRsvInquiryRequest.setTxtCmtrUtlAgeCd(str4);
        commRsvInquiryRequest.setSelGoTrain(s.ALL.getCode());
        commRsvInquiryRequest.setTxtGoHour("000000");
        commRsvInquiryRequest.setRadChgTrnDvCd(str5);
        commRsvInquiryRequest.setSelGoAbrdDt(str6);
        commRsvInquiryRequest.setTxtGoStart(str7);
        commRsvInquiryRequest.setTxtGoEnd(str8);
        if (N.isNotNull(str9)) {
            commRsvInquiryRequest.setTxtWkndUseFlg(str9);
        }
        return commRsvInquiryRequest;
    }

    public static NCardInquiryDao.NCardInquiryRequest getNCardInquiryRequest(V4.b bVar, X4.b bVar2) {
        NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = new NCardInquiryDao().new NCardInquiryRequest();
        nCardInquiryRequest.setDptDt(C6634h.getToday("yyyyMMdd"));
        nCardInquiryRequest.setDptTm("000000");
        nCardInquiryRequest.setDptRsStnNm(bVar.getStartStationNm());
        nCardInquiryRequest.setArvRsStnNm(bVar.getArrivalStationNm());
        nCardInquiryRequest.setTrnGpCd(s.ALL.getCode());
        nCardInquiryRequest.setDirtChtnDvCd(d.DIRECT_SQ_NO.getCode());
        String discountTypeNumber = bVar2.getDiscountTypeNumber();
        nCardInquiryRequest.setDcntCrdKndCd((discountTypeNumber.equals("B2N18120402") || discountTypeNumber.equals("B2N18120403")) ? "B2N" : "MMM");
        nCardInquiryRequest.setDcntCrdKndMgNo(discountTypeNumber);
        nCardInquiryRequest.setUsePsbTno(bVar2.getNumberOfUses());
        return nCardInquiryRequest;
    }

    public static NCardInquiryDao.NCardInquiryRequest getNCardInquiryVersion2Request(V4.b bVar, X4.a aVar) {
        NCardInquiryDao.NCardInquiryRequest nCardInquiryRequest = new NCardInquiryDao().new NCardInquiryRequest();
        nCardInquiryRequest.setDptDt(C6634h.getToday("yyyyMMdd"));
        nCardInquiryRequest.setDptTm("000000");
        nCardInquiryRequest.setDptRsStnNm(bVar.getStartStationNm());
        nCardInquiryRequest.setArvRsStnNm(bVar.getArrivalStationNm());
        nCardInquiryRequest.setTrnGpCd(s.ALL.getCode());
        nCardInquiryRequest.setDirtChtnDvCd(d.DIRECT_SQ_NO.getCode());
        String discountTypeNumber = aVar.getDiscountTypeNumber();
        nCardInquiryRequest.setDcntCrdKndCd("MMM");
        nCardInquiryRequest.setDcntCrdKndMgNo(discountTypeNumber);
        nCardInquiryRequest.setUseTrmDno(aVar.getNumberOfDate());
        nCardInquiryRequest.setUsePsbTno(aVar.getNumberOfUses());
        return nCardInquiryRequest;
    }

    public static void getRsvInquiryRequest(Context context, RsvInquiryRequest[] rsvInquiryRequestArr, V4.b bVar, com.korail.talk.ui.booking.option.date.a aVar, c cVar, String str, CalendarData calendarData) {
        getRsvInquiryRequest(context, rsvInquiryRequestArr, bVar, aVar, null, cVar, str, calendarData, "11", p.DEFAULT.getCode());
    }

    public static SeatAssignScheduleViewDao.SeatAssignScheduleViewRequest getSeatAssignScheduleViewRequest(TicketDetailDao.TicketDetailResponse ticketDetailResponse, V4.b bVar, com.korail.talk.ui.booking.option.date.a aVar, SeatAssignData seatAssignData, int i8, int i9) {
        CalendarData today = C6634h.getToday();
        if (!aVar.getSelectedDate().isBeforeThan(today)) {
            today = aVar.getSelectedDate();
        }
        List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
        boolean zIsNTicket = C0500a.isNTicket(ticketDetailResponse.getH_tk_knd_cd());
        SeatAssignScheduleViewDao.SeatAssignScheduleViewRequest seatAssignScheduleViewRequest = new SeatAssignScheduleViewDao().new SeatAssignScheduleViewRequest();
        seatAssignScheduleViewRequest.setMenuId(seatAssignData.getMenuId());
        seatAssignScheduleViewRequest.setDptDt(C6634h.getDate(today));
        seatAssignScheduleViewRequest.setDptTm(C6634h.getHour(today));
        seatAssignScheduleViewRequest.setDptRsStnNm(bVar.getStartStationNm());
        seatAssignScheduleViewRequest.setArvRsStnNm(bVar.getArrivalStationNm());
        seatAssignScheduleViewRequest.setTrnGpCd(seatAssignData.getTrnGpCd());
        seatAssignScheduleViewRequest.setPsrmClCd(o.ALL.getCode());
        seatAssignScheduleViewRequest.setSeatAttCd1(seatAssignData.getSeatAttCd1());
        seatAssignScheduleViewRequest.setPsgNum1(i9);
        seatAssignScheduleViewRequest.setStlbDturDvNm1(zIsNTicket ? ticketDetailResponse.getDcnt_crd_info().getAppSeg_info().get(i8).getStlbDturDvNm() : ticketDetailResponse.getH_dtour());
        seatAssignScheduleViewRequest.setDirtChtnDvCd((ticket_info.size() == 1 ? d.DIRECT_SQ_NO : d.TRANSFER_SQ_NO).getCode());
        seatAssignScheduleViewRequest.setChtnArvRsStnNm(ticket_info.size() == 2 ? ticket_info.get(0).getH_arv_rs_stn_nm() : "");
        return seatAssignScheduleViewRequest;
    }

    public static void getRsvInquiryRequest(Context context, RsvInquiryRequest[] rsvInquiryRequestArr, V4.b bVar, com.korail.talk.ui.booking.option.date.a aVar, com.korail.talk.ui.booking.option.date.a aVar2, c cVar, String str, CalendarData calendarData, String str2, String str3) {
        String str4 = str;
        Bundle passengerInfo = cVar.getPassengerInfo();
        int i8 = passengerInfo.getInt("ADULT_COUNT");
        int i9 = passengerInfo.getInt("TEENAGER_COUNT");
        int i10 = passengerInfo.getInt("CHILD_COUNT");
        int i11 = passengerInfo.getInt("CHILD_ACCOMPANY_COUNT");
        int i12 = passengerInfo.getInt("SENIOR_COUNT");
        int i13 = passengerInfo.getInt("HIGH_DISABLE_COUNT");
        int i14 = passengerInfo.getInt("LOW_DISABLE_COUNT");
        int i15 = passengerInfo.getInt("GUIDE_DOG_COUNT");
        int i16 = passengerInfo.getInt("TOTAL_PERSON_COUNT");
        t.d("============================================================");
        t.d("adultCount : " + i8 + ", teenagerCount : " + i9 + ", childCount : " + i10 + ", childAccompanyCount : " + i11 + ", seniorCount : " + i12 + ", highDisableCount : " + i13 + ", lowDisableCount : " + i14 + ", guideDogCount : " + i15);
        t.d("============================================================");
        StringBuilder sb = new StringBuilder();
        sb.append("jobId : ");
        sb.append(str4);
        sb.append(", menuId : ");
        sb.append(str2);
        sb.append(", seatType : ");
        sb.append(str3);
        t.d(sb.toString());
        t.d("============================================================");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" rsvInquiryRequests.length : ");
        sb2.append(rsvInquiryRequestArr.length);
        t.d(sb2.toString());
        int i17 = 0;
        while (i17 < rsvInquiryRequestArr.length) {
            rsvInquiryRequestArr[i17].setTxtMenuId(str2);
            rsvInquiryRequestArr[i17].setRadJobId(str4);
            rsvInquiryRequestArr[i17].setSelGoTrain(O.getTrainGroupCode(context));
            rsvInquiryRequestArr[i17].setTxtTrnGpCd(O.getTrainGroupCode(context));
            rsvInquiryRequestArr[i17].setTxtSeatAttCd_2(l.DEFAULT.getCode());
            rsvInquiryRequestArr[i17].setTxtSeatAttCd_3(n.DEFAULT.getCode());
            rsvInquiryRequestArr[i17].setTxtSeatAttCd_4(str3);
            rsvInquiryRequestArr[i17].setTxtGoStart(i17 == 0 ? bVar.getStartStationNm() : bVar.getArrivalStationNm());
            rsvInquiryRequestArr[i17].setTxtGoEnd(i17 == 0 ? bVar.getArrivalStationNm() : bVar.getStartStationNm());
            t.d("i : " + i17);
            if (i17 == 0) {
                if (C6630d.isNotNull(calendarData)) {
                    rsvInquiryRequestArr[i17].setTxtGoAbrdDt(C6634h.getDate(calendarData));
                    rsvInquiryRequestArr[i17].setTxtGoHour(C6634h.getHour(calendarData));
                } else {
                    CalendarData today = C6634h.getToday();
                    if (!aVar.getSelectedDate().isBeforeThan(today)) {
                        today = aVar.getSelectedDate();
                    }
                    rsvInquiryRequestArr[i17].setTxtGoAbrdDt(C6634h.getDate(today));
                    rsvInquiryRequestArr[i17].setTxtGoHour(C6634h.getHour(today));
                }
            } else if (C6630d.isNotNull(calendarData)) {
                rsvInquiryRequestArr[i17].setTxtGoAbrdDt(C6634h.getDate(calendarData));
                rsvInquiryRequestArr[i17].setTxtGoHour(C6634h.getHour(calendarData));
            } else {
                CalendarData today2 = C6634h.getToday();
                if (!aVar2.getSelectedDate().isBeforeThan(today2)) {
                    today2 = aVar2.getSelectedDate();
                }
                rsvInquiryRequestArr[i17].setTxtGoAbrdDt(C6634h.getDate(today2));
                rsvInquiryRequestArr[i17].setTxtGoHour(C6634h.getHour(today2));
            }
            rsvInquiryRequestArr[i17].setTxtPsgFlg_1(String.valueOf(i8 + i9 + i15));
            rsvInquiryRequestArr[i17].setTxtPsgFlg_2(String.valueOf(i10 + i11));
            rsvInquiryRequestArr[i17].setTxtPsgFlg_3(String.valueOf(i12));
            rsvInquiryRequestArr[i17].setTxtPsgFlg_4(String.valueOf(i13));
            rsvInquiryRequestArr[i17].setTxtPsgFlg_5(String.valueOf(i14));
            rsvInquiryRequestArr[i17].setAdultCount(i8);
            rsvInquiryRequestArr[i17].setTotalCount(i16);
            i17++;
            str4 = str;
        }
    }
}
