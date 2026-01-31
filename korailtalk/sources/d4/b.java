package D4;

import T4.d;
import android.os.Bundle;
import com.korail.talk.network.dao.research.OgTkInquiryDao;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.dao.reservation.TCReservationDao.TCReservationRequest;
import com.korail.talk.network.data.reservation.RDscp;
import com.korail.talk.network.data.reservation.ROrtg;
import com.korail.talk.network.data.reservation.RPsg;
import com.korail.talk.network.data.reservation.RSeat;
import com.korail.talk.network.response.research.OrgTk;
import java.util.List;
import r4.e;
import r4.l;
import r4.m;
import r4.n;
import r4.p;
import r4.q;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class b {
    private static int a(RDscp rDscp, RDscp rDscp2, String str, String str2, String str3, String str4, String str5, int i8, int i9) {
        if (!N.isNotNull(str2) || !N.isNotNull(str3)) {
            if (!N.isNotNull(str2) || !A4.b.isSoldier(str, str2)) {
                return i9;
            }
            t.e("병역 의무복무자");
            if (!"1".equals(str4)) {
                return i9;
            }
            t.e("어른만 가능");
            int i10 = i9 + 1;
            rDscp2.setDcntKndCd(i8, i10, str + str2);
            rDscp2.setDscpNo(i8, i10, str3);
            return i10;
        }
        if (A4.a.isNCard(str + str2)) {
            t.e("N 카드 할인");
            if (!"1".equals(str4) || !"000".equals(str5)) {
                return i9;
            }
            t.e("어른만 가능");
            int i11 = i9 + 1;
            rDscp.setDscpCnt(i8, N.addZero(4, i11));
            rDscp.setDcntKndCd(i8, i11, str + str2);
            rDscp.setDscpNo(i8, i11, str3);
            rDscp2.setDscpCnt(i8, N.addZero(4, i11));
            rDscp2.setDcntKndCd(i8, i11, str + str2);
            rDscp2.setDscpNo(i8, i11, str3);
            return i11;
        }
        if (A4.b.isCoupon(str, str2)) {
            t.e("할인쿠폰, 국가유공자 본인 할인");
            if (!"1".equals(str4) && (!"3".equals(str4) || !"000".equals(str5))) {
                return i9;
            }
            t.e("어른, 경로, 중증, 경증 || 어린이");
            int i12 = i9 + 1;
            rDscp2.setDcntKndCd(i8, i12, str + str2);
            rDscp2.setDscpNo(i8, i12, str3);
            return i12;
        }
        if (A4.b.isMeritFree(str, str2, str3)) {
            t.e("국가유공자 무임");
            if (!"1".equals(str4) || !"000".equals(str5)) {
                return i9;
            }
            t.e("어른, 중증, 경증만 가능");
            int i13 = i9 + 1;
            rDscp2.setDcntKndCd(i8, i13, str + str2);
            rDscp2.setDscpNo(i8, i13, str3);
            return i13;
        }
        if (A4.b.isMeritProtector(str, str2)) {
            t.e("국가유공자 보호자");
            if (!"1".equals(str4) || !"000".equals(str5)) {
                return i9;
            }
            t.e("어른만 가능");
            int i14 = i9 + 1;
            rDscp2.setDcntKndCd(i8, i14, str + str2);
            rDscp2.setDscpNo(i8, i14, str3);
            return i14;
        }
        if (!A4.b.isDisabledProtector(str, str2)) {
            if (!A4.b.isCongressPerson(str, str2)) {
                return i9;
            }
            t.e("국회의원");
            if (!"1".equals(str4)) {
                return i9;
            }
            t.e(" 어른, 경로, 중증, 경증 ");
            int i15 = i9 + 1;
            rDscp2.setDcntKndCd(i8, i15, "402");
            rDscp2.setDscpNo(i8, i15, str3);
            return i15;
        }
        t.e("장애인 1~3급 보호자");
        if (!"1".equals(str4) || !"000".equals(str5)) {
            return i9;
        }
        t.e("어른만 가능");
        int i16 = i9 + 1;
        rDscp2.setDcntKndCd(i8, i16, str + str2);
        rDscp2.setDscpNo(i8, i16, str3);
        return i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(com.korail.talk.network.data.reservation.RDscp r18, com.korail.talk.network.data.reservation.RDscp r19, java.util.List r20, java.lang.String r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.b.b(com.korail.talk.network.data.reservation.RDscp, com.korail.talk.network.data.reservation.RDscp, java.util.List, java.lang.String, java.lang.String, int):void");
    }

    public static TCReservationDao.TCReservationRequest getTicketChangeReservationRequest(OgTkInquiryDao.OgTkInquiryResponse ogTkInquiryResponse, d dVar, String str) {
        String str2;
        int i8;
        String str3;
        int i9;
        int i10;
        int i11;
        TCReservationDao.TCReservationRequest tCReservationRequest = new TCReservationDao().new TCReservationRequest();
        List<OrgTk> orgTkList = ogTkInquiryResponse.getOrgTkList();
        tCReservationRequest.setTrvlKndCd("1");
        tCReservationRequest.setTotPrnb(String.valueOf(orgTkList.size()));
        tCReservationRequest.setIsePrnb(String.valueOf(orgTkList.size()));
        tCReservationRequest.setStndSeatFlg(N.getInteger(orgTkList.get(0).getJrnyList().get(0).getTotStndNum()) > 0 ? "Y" : "N");
        tCReservationRequest.setIntgTktIseFlg("N");
        tCReservationRequest.setAlcSeatDmnPsDvCd("000");
        tCReservationRequest.setJrny2Cnt(N.addZero(4, 0));
        tCReservationRequest.setPsg2Cnt(N.addZero(4, 0));
        ROrtg rOrtg = new ROrtg();
        rOrtg.setOrtgCnt(N.addZero(4, orgTkList.size()));
        int i12 = 0;
        while (i12 < orgTkList.size()) {
            OrgTk orgTk = orgTkList.get(i12);
            i12++;
            rOrtg.setOgtkSaleWctNo(i12, orgTk.getOgtkSaleWctNo());
            rOrtg.setOgtkSaleDd(i12, orgTk.getOgtkSaleDt());
            rOrtg.setOgtkSaleSqno(i12, orgTk.getOgtkSaleSqno());
            rOrtg.setOgtkRetPwd(i12, orgTk.getOgtkRetPwd());
            rOrtg.setRetNoMnlInpFlg(i12, "N");
        }
        tCReservationRequest.setROrtg(rOrtg);
        RSeat rSeat = new RSeat();
        String jrnyTpCd = ogTkInquiryResponse.getOrgTkList().get(0).getJrnyList().get(0).getJrnyTpCd();
        int i13 = 0;
        while (true) {
            if (i13 >= (e.DIRECT.getCode().equals(jrnyTpCd) ? 1 : 2)) {
                break;
            }
            i13++;
            rSeat.setSeatCnt(i13, String.valueOf(i13));
            rSeat.setSmkSeatAttCd(i13, 1, q.DISABLE.getCode());
            rSeat.setDirSeatAttCd(i13, 1, l.DEFAULT.getCode());
            rSeat.setLocSeatAttCd(i13, 1, n.DEFAULT.getCode());
            rSeat.setRqSeatAttCd(i13, 1, p.DEFAULT.getCode());
            rSeat.setEtcSeatAttCd(i13, 1, m.DISABLE.getCode());
        }
        tCReservationRequest.setRSeat(rSeat);
        Bundle passengerInfo = dVar.getPassengerInfo();
        int i14 = passengerInfo.getInt("TOTAL_PERSON_COUNT");
        RPsg rPsg = new RPsg();
        rPsg.setPsgCnt(String.valueOf(i14));
        RDscp rDscp = new RDscp();
        RDscp rDscp2 = new RDscp();
        int i15 = passengerInfo.getInt("HIGH_DISABLE_COUNT");
        StringBuilder sb = new StringBuilder();
        sb.append("중증 : ");
        sb.append(i15);
        String str4 = " passengerIndex : ";
        sb.append(" passengerIndex : ");
        sb.append(1);
        t.e(sb.toString());
        if (i15 > 0) {
            int i16 = 0;
            i8 = 1;
            while (i16 < i15) {
                rPsg.setPsgInfoPerPrnb(i8, "1");
                rPsg.setPsgTpDvCd(i8, "1");
                int i17 = i8;
                b(rDscp, rDscp2, orgTkList.get(i8 - 1).getCmpnList(), "1", "111", i17);
                i8 = i17 + 1;
                i16++;
                str4 = str4;
                i15 = i15;
            }
            str2 = str4;
        } else {
            str2 = " passengerIndex : ";
            i8 = 1;
        }
        int i18 = passengerInfo.getInt("LOW_DISABLE_COUNT");
        t.e("경증 : " + i18 + str2 + i8);
        if (i18 > 0) {
            int i19 = i8;
            int i20 = 0;
            while (i20 < i18) {
                rPsg.setPsgInfoPerPrnb(i19, "1");
                rPsg.setPsgTpDvCd(i19, "1");
                int i21 = i19;
                b(rDscp, rDscp2, orgTkList.get(i19 - 1).getCmpnList(), "1", "112", i21);
                i19 = i21 + 1;
                i20++;
                i18 = i18;
            }
            i8 = i19;
        }
        int i22 = passengerInfo.getInt("ADULT_COUNT");
        t.e("어른 : " + i22 + str2 + i8);
        if (i22 > 0) {
            int i23 = i8;
            int i24 = 0;
            while (i24 < i22) {
                rPsg.setPsgInfoPerPrnb(i23, "1");
                rPsg.setPsgTpDvCd(i23, "1");
                if (str == null || !str.equals("TC")) {
                    i9 = i24;
                    i10 = i23;
                    i11 = i22;
                    b(rDscp, rDscp2, orgTkList.get(i10 - 1).getCmpnList(), "1", "000", i10);
                } else {
                    i9 = i24;
                    i10 = i23;
                    i11 = i22;
                    b(rDscp, rDscp2, orgTkList.get(i23 - 1).getCmpnList(), "1", "514", i10);
                }
                i23 = i10 + 1;
                i24 = i9 + 1;
                i22 = i11;
            }
            i8 = i23;
        }
        int i25 = passengerInfo.getInt("SENIOR_COUNT");
        t.e("경로 : " + i25 + str2 + i8);
        if (i25 > 0) {
            int i26 = i8;
            for (int i27 = 0; i27 < i25; i27++) {
                rPsg.setPsgInfoPerPrnb(i26, "1");
                rPsg.setPsgTpDvCd(i26, "1");
                b(rDscp, rDscp2, orgTkList.get(i26 - 1).getCmpnList(), "1", "131", i26);
                i26++;
            }
            i8 = i26;
        }
        int i28 = passengerInfo.getInt("CHILD_COUNT");
        t.e("어린이 : " + i28 + str2 + i8);
        String str5 = "3";
        if (i28 > 0) {
            int i29 = i8;
            int i30 = 0;
            while (i30 < i28) {
                rPsg.setPsgInfoPerPrnb(i29, "1");
                rPsg.setPsgTpDvCd(i29, str5);
                int i31 = i29;
                b(rDscp, rDscp2, orgTkList.get(i29 - 1).getCmpnList(), "3", "000", i31);
                i29 = i31 + 1;
                i30++;
                str5 = str5;
            }
            str3 = str5;
            i8 = i29;
        } else {
            str3 = "3";
        }
        int i32 = passengerInfo.getInt("CHILD_ACCOMPANY_COUNT");
        t.e("동반 유아 : " + i32 + str2 + i8);
        if (i32 > 0) {
            int i33 = i8;
            for (int i34 = 0; i34 < i32; i34++) {
                rPsg.setPsgInfoPerPrnb(i33, "1");
                rPsg.setPsgTpDvCd(i33, str3);
                b(rDscp, rDscp2, orgTkList.get(i33 - 1).getCmpnList(), "3", "321", i33);
                i33++;
            }
            i8 = i33;
        }
        tCReservationRequest.setRPsg(rPsg);
        tCReservationRequest.setOrgRDscp(rDscp);
        tCReservationRequest.setRDscp(rDscp2);
        t.e("적용된 사람 수 : " + (i8 - 1));
        t.e("----------------------------------------------------------------------------");
        t.e(z4.q.toJson(rDscp));
        t.e("----------------------------------------------------------------------------");
        return tCReservationRequest;
    }
}
