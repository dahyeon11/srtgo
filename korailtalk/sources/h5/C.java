package H5;

import Q7.X;
import android.os.Bundle;
import android.view.ViewGroup;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao.DiscountCoupon;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao.DelayCoupon;
import com.korail.talk.network.dao.reservation.TCReservationDao;
import com.korail.talk.network.data.reservation.RDscp;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.view.payment.discount.sub.BusinessTripCoupon;
import com.korail.talk.view.payment.discount.sub.CongresspersonDiscountOption;
import com.korail.talk.view.payment.discount.sub.DelayDiscountCoupon;
import com.korail.talk.view.payment.discount.sub.DiscountMemberCoupon;
import com.korail.talk.view.payment.discount.sub.NationalMeritPersonDiscount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r6.C6181b;
import s6.C6233d;
import u6.C6420a;
import x6.ViewOnClickListenerC6495c;
import z4.C6625A;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class C extends s {
    public static final String TAG = "TDiscountFragment";

    /* renamed from: y0 */
    private TCReservationDao.TCReservationRequest f1808y0;

    /* renamed from: z0 */
    private C6233d f1809z0;

    private void C0() {
        ViewGroup viewGroup = (ViewGroup) p0(AbstractC5955f.v_discount_container);
        List<ReservationResponse.JrnyInfo> jrnyInfoList = getJrnyInfoList();
        C6181b c6181b = new C6181b(getActivity());
        c6181b.setJrnyData(getReservedTicketType(), jrnyInfoList);
        viewGroup.addView(c6181b);
        ViewOnClickListenerC6495c viewOnClickListenerC6495c = new ViewOnClickListenerC6495c(getActivity());
        viewOnClickListenerC6495c.setJrnyData(jrnyInfoList);
        viewGroup.addView(viewOnClickListenerC6495c);
        C6233d c6233d = new C6233d(getActivity());
        this.f1809z0 = c6233d;
        viewGroup.addView(c6233d);
        P1(viewGroup);
    }

    private void W1() {
        this.f1808y0 = (TCReservationDao.TCReservationRequest) C6625A.getSerializable(getArguments(), "TICKET_CHANGE_RESERVATION_REQUEST");
    }

    private void k2() {
        TCReservationDao tCReservationDao = new TCReservationDao();
        tCReservationDao.setRequest(this.f1808y0);
        executeDao(tCReservationDao);
    }

    private void l2() {
        T0(AbstractC5955f.btn_payment_bottom1, AbstractC5959j.common_change_cancel);
    }

    public static C newInstance(TCReservationDao.TCReservationRequest tCReservationRequest) {
        C c9 = new C();
        Bundle bundle = new Bundle();
        bundle.putSerializable("TICKET_CHANGE_RESERVATION_REQUEST", tCReservationRequest);
        c9.setArguments(bundle);
        return c9;
    }

    @Override // H5.s
    void N1() {
        int i8;
        int i9;
        String str;
        List<DiscountObjectData> list;
        ArrayList<Integer> arrayList;
        ArrayList<Integer> arrayList2;
        String str2;
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            RDscp rDscp = (RDscp) this.f1808y0.getOrgRDscp().clone();
            BusinessTripCoupon businessTripCoupon = c6420aL0.getBusinessTripCoupon();
            ArrayList<Integer> couponData = businessTripCoupon.getCouponData();
            ArrayList<Integer> targetData = businessTripCoupon.getTargetData();
            List<DiscountObjectData> couponEntries = businessTripCoupon.getCouponEntries();
            int i10 = 0;
            while (true) {
                i8 = 4;
                i9 = -1;
                if (i10 >= targetData.size()) {
                    break;
                }
                if (targetData.get(i10).intValue() > -1 && couponData.get(i10).intValue() > -1) {
                    String h_cpn_no = ((DCCouponListDao.DiscountCoupon) couponEntries.get(couponData.get(i10).intValue()).getObject()).getH_cpn_no();
                    int iIntValue = targetData.get(i10).intValue() + 1;
                    int i11 = Integer.parseInt(rDscp.getDscpCnt(iIntValue)) + 1;
                    z4.t.e("sqNo : " + iIntValue + " dscpCnt : " + i11 + " couponNum : " + h_cpn_no);
                    rDscp.setDscpCnt(iIntValue, N.addZero(4, i11));
                    rDscp.setDcntKndCd(iIntValue, i11, "151");
                    rDscp.setDscpNo(iIntValue, i11, h_cpn_no);
                }
                i10++;
            }
            DiscountMemberCoupon discountMemberCoupon = c6420aL0.getDiscountMemberCoupon();
            ArrayList<Integer> couponData2 = discountMemberCoupon.getCouponData();
            ArrayList<Integer> targetData2 = discountMemberCoupon.getTargetData();
            List<DiscountObjectData> couponEntries2 = discountMemberCoupon.getCouponEntries();
            int i12 = 0;
            while (true) {
                int size = targetData2.size();
                str = X.SPACE;
                if (i12 >= size) {
                    break;
                }
                z4.t.e(couponData2.get(i12) + X.SPACE + targetData2.get(i12));
                if (couponData2.get(i12).intValue() > i9 && targetData2.get(i12).intValue() > i9) {
                    String h_cpn_no2 = ((DCCouponListDao.DiscountCoupon) couponEntries2.get(couponData2.get(i12).intValue()).getObject()).getH_cpn_no();
                    int iIntValue2 = targetData2.get(i12).intValue() + 1;
                    int i13 = Integer.parseInt(rDscp.getDscpCnt(iIntValue2)) + 1;
                    z4.t.e("sqNo : " + iIntValue2 + " dscpCnt : " + i13 + " couponNum : " + h_cpn_no2);
                    rDscp.setDscpCnt(iIntValue2, N.addZero(4, i13));
                    rDscp.setDcntKndCd(iIntValue2, i13, "151");
                    rDscp.setDscpNo(iIntValue2, i13, h_cpn_no2);
                }
                i12++;
                i9 = -1;
            }
            DelayDiscountCoupon delayDiscountCoupon = c6420aL0.getDelayDiscountCoupon();
            ArrayList<Integer> couponData3 = delayDiscountCoupon.getCouponData();
            ArrayList<Integer> targetData3 = delayDiscountCoupon.getTargetData();
            List<DiscountObjectData> couponEntries3 = delayDiscountCoupon.getCouponEntries();
            int i14 = 0;
            while (i14 < targetData3.size()) {
                if (couponData3.get(i14).intValue() <= -1 || targetData3.get(i14).intValue() <= -1) {
                    list = couponEntries3;
                    arrayList = couponData3;
                    arrayList2 = targetData3;
                    str2 = str;
                } else {
                    DelayTicketListDao.DelayCoupon delayCoupon = (DelayTicketListDao.DelayCoupon) couponEntries3.get(couponData3.get(i14).intValue()).getObject();
                    String h_orgtk_wct_no = delayCoupon.getH_orgtk_wct_no();
                    String h_orgtk_ret_sale_dt = delayCoupon.getH_orgtk_ret_sale_dt();
                    list = couponEntries3;
                    if (h_orgtk_ret_sale_dt.length() > i8) {
                        h_orgtk_ret_sale_dt = h_orgtk_ret_sale_dt.substring(h_orgtk_ret_sale_dt.length() - i8);
                    }
                    String h_orgtk_sale_sqno = delayCoupon.getH_orgtk_sale_sqno();
                    String h_orgtk_ret_pwd = delayCoupon.getH_orgtk_ret_pwd();
                    int iIntValue3 = targetData3.get(i14).intValue() + 1;
                    arrayList = couponData3;
                    int i15 = Integer.parseInt(rDscp.getDscpCnt(iIntValue3)) + 1;
                    arrayList2 = targetData3;
                    z4.t.e("sqNo : " + iIntValue3 + " dscpCnt : " + i15 + " couponNum : " + h_orgtk_wct_no + str + h_orgtk_ret_sale_dt + str + h_orgtk_sale_sqno + str + h_orgtk_ret_pwd);
                    str2 = str;
                    rDscp.setDscpCnt(iIntValue3, N.addZero(4, i15));
                    rDscp.setDcntKndCd(iIntValue3, i15, "401");
                    rDscp.setDlayOgtkWctNo(iIntValue3, i15, h_orgtk_wct_no);
                    rDscp.setDlayOgtkSaleDd(iIntValue3, i15, h_orgtk_ret_sale_dt);
                    rDscp.setDlayOgtkSaleSqno(iIntValue3, i15, h_orgtk_sale_sqno);
                    rDscp.setDlayOgtkRetPwd(iIntValue3, i15, h_orgtk_ret_pwd);
                }
                i14++;
                couponEntries3 = list;
                targetData3 = arrayList2;
                couponData3 = arrayList;
                str = str2;
                i8 = 4;
            }
            NationalMeritPersonDiscount nationalMeritPersonDiscount = c6420aL0.getNationalMeritPersonDiscount();
            ArrayList<Integer> targetData4 = nationalMeritPersonDiscount.getTargetData();
            for (int i16 = 0; i16 < targetData4.size(); i16++) {
                if (targetData4.get(i16).intValue() > -1) {
                    String str3 = nationalMeritPersonDiscount.getIsFee(i16) ? "152" : "151";
                    int iIntValue4 = targetData4.get(i16).intValue() + 1;
                    int i17 = Integer.parseInt(rDscp.getDscpCnt(iIntValue4)) + 1;
                    String coupon = nationalMeritPersonDiscount.getCoupon(i16);
                    z4.t.e("sqNo : " + iIntValue4 + " dscpCnt : " + i17 + " couponNum : " + coupon);
                    rDscp.setDscpCnt(iIntValue4, N.addZero(4, i17));
                    rDscp.setDcntKndCd(iIntValue4, i17, str3);
                    rDscp.setDscpNo(iIntValue4, i17, coupon);
                }
            }
            ArrayList<Integer> targetData5 = c6420aL0.getNationalMeritGuardianDiscount().getTargetData();
            for (int i18 = 0; i18 < targetData5.size(); i18++) {
                if (targetData5.get(i18).intValue() > -1) {
                    int iIntValue5 = targetData5.get(i18).intValue() + 1;
                    int i19 = Integer.parseInt(rDscp.getDscpCnt(iIntValue5)) + 1;
                    z4.t.e("sqNo : " + iIntValue5 + " dscpCnt : " + i19);
                    rDscp.setDscpCnt(iIntValue5, N.addZero(4, i19));
                    rDscp.setDcntKndCd(iIntValue5, i19, "172");
                }
            }
            CongresspersonDiscountOption congresspersonDiscountOption = c6420aL0.getCongresspersonDiscountOption();
            ArrayList<Integer> targetIndexArray = congresspersonDiscountOption.getTargetIndexArray();
            for (int i20 = 0; i20 < targetIndexArray.size(); i20++) {
                if (targetIndexArray.get(i20).intValue() > -1) {
                    int iIntValue6 = targetIndexArray.get(i20).intValue() + 1;
                    int i21 = Integer.parseInt(rDscp.getDscpCnt(iIntValue6)) + 1;
                    String coupon2 = congresspersonDiscountOption.getCoupon(i20);
                    z4.t.e("sqNo : " + iIntValue6 + " dscpCnt : " + i21 + " couponNum : " + coupon2);
                    rDscp.setDscpCnt(iIntValue6, N.addZero(4, i21));
                    rDscp.setDcntKndCd(iIntValue6, i21, "402");
                    rDscp.setDscpNo(iIntValue6, i21, coupon2);
                }
            }
            ArrayList<Integer> targetData6 = c6420aL0.getDisabledPersonGuardianDiscount().getTargetData();
            for (int i22 = 0; i22 < targetData6.size(); i22++) {
                if (targetData6.get(i22).intValue() > -1) {
                    int iIntValue7 = targetData6.get(i22).intValue() + 1;
                    int i23 = Integer.parseInt(rDscp.getDscpCnt(iIntValue7)) + 1;
                    z4.t.e("sqNo : " + iIntValue7 + " dscpCnt : " + i23);
                    rDscp.setDscpCnt(iIntValue7, N.addZero(4, i23));
                    rDscp.setDcntKndCd(iIntValue7, i23, "171");
                }
            }
            ArrayList<Integer> targetData7 = c6420aL0.getSoldierDiscount().getTargetData();
            for (int i24 = 0; i24 < targetData7.size(); i24++) {
                if (targetData7.get(i24).intValue() > -1) {
                    int iIntValue8 = targetData7.get(i24).intValue() + 1;
                    int i25 = Integer.parseInt(rDscp.getDscpCnt(iIntValue8)) + 1;
                    z4.t.e("sqNo : " + iIntValue8 + " dscpCnt : " + i25);
                    rDscp.setDscpCnt(iIntValue8, N.addZero(4, i25));
                    rDscp.setDcntKndCd(iIntValue8, i25, "432");
                }
            }
            this.f1808y0.setRDscp(rDscp);
            k2();
        }
    }

    @Override // H5.s
    void O1(IBaseDao iBaseDao) {
        ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
        setIPaymentRequest(C4.b.getIntgStlRequest(reservationResponse));
        setReservationResponse(reservationResponse);
        y0();
        U0();
    }

    @Override // H5.s
    void Q1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        List<ReservationResponse.PsgInfo> psgInfos = getReservationResponse().getPsg_infos().getPsgInfos();
        int i8 = 0;
        while (i8 < psgInfos.size()) {
            ReservationResponse.PsgInfo psgInfo = psgInfos.get(i8);
            String h_psg_tp_cd = psgInfo.getH_psg_tp_cd();
            String h_dcnt_knd_cd = psgInfo.getH_dcnt_knd_cd();
            String h_dcnt_knd_cd2 = psgInfo.getH_dcnt_knd_cd2();
            boolean zIsNonMember = I4.h.getInstance().isNonMember();
            StringBuilder sb = new StringBuilder();
            sb.append("여행 변경 psgTpCd = ");
            sb.append(h_psg_tp_cd);
            sb.append(" 지연할인증 = ");
            sb.append(psgInfo.getDlayOgtkWctNo());
            sb.append(g5.e.STATE_NAME_NONE);
            List<ReservationResponse.PsgInfo> list = psgInfos;
            sb.append(psgInfo.getDlayOgtkSaleDt());
            sb.append(g5.e.STATE_NAME_NONE);
            sb.append(psgInfo.getDlayOgtkSaleSqno());
            sb.append(g5.e.STATE_NAME_NONE);
            sb.append(psgInfo.getDlayOgtkRetPwd());
            z4.t.e(sb.toString());
            z4.t.e("여행 변경 psgTpCd = " + h_psg_tp_cd + ", dcntKndCd1 = " + h_dcnt_knd_cd + ",  h_dcsp_no = " + psgInfo.getH_dcsp_no());
            z4.t.e("여행 변경 psgTpCd = " + h_psg_tp_cd + ", dcntKndCd2 = " + h_dcnt_knd_cd2 + ",  h_dcsp_no2 = " + psgInfo.getH_dcsp_no2());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isLogin = ");
            sb2.append(zIsNonMember);
            z4.t.e(sb2.toString());
            if (A4.b.isDelayCoupon(psgInfo.getDlayOgtkWctNo(), psgInfo.getDlayOgtkSaleDt(), psgInfo.getDlayOgtkSaleSqno(), psgInfo.getDlayOgtkRetPwd())) {
                z4.t.e("지연할인증");
                DelayTicketListDao.DelayCoupon delayCoupon = new DelayTicketListDao().new DelayCoupon();
                delayCoupon.setH_orgtk_wct_no(psgInfo.getDlayOgtkWctNo());
                delayCoupon.setH_orgtk_ret_sale_dt(psgInfo.getDlayOgtkSaleDt());
                delayCoupon.setH_orgtk_sale_sqno(N.getIntegerString(psgInfo.getDlayOgtkSaleSqno()));
                delayCoupon.setH_orgtk_ret_pwd(psgInfo.getDlayOgtkRetPwd());
                delayCoupon.setIndex(i8);
                this.f1856v0.add(delayCoupon);
                arrayList = arrayList6;
                arrayList2 = arrayList7;
            } else {
                ArrayList arrayList8 = arrayList7;
                if (A4.b.isMeritDC(h_psg_tp_cd + h_dcnt_knd_cd, psgInfo.getH_dcsp_no())) {
                    z4.t.e("국가유공자 할인");
                    HashMap map = new HashMap();
                    map.put("INDEX", String.valueOf(i8));
                    map.put("VALUE", psgInfo.getH_dcsp_no());
                    map.put("NATIONAL_MERIT_PERSON_DISCOUNT", "Y");
                    arrayList3.add(map);
                    arrayList = arrayList6;
                } else {
                    ArrayList arrayList9 = arrayList6;
                    if (A4.b.isMeritDC(h_psg_tp_cd + h_dcnt_knd_cd2, psgInfo.getH_dcsp_no2())) {
                        z4.t.e("국가유공자 할인");
                        HashMap map2 = new HashMap();
                        map2.put("INDEX", String.valueOf(i8));
                        map2.put("VALUE", psgInfo.getH_dcsp_no2());
                        map2.put("NATIONAL_MERIT_PERSON_DISCOUNT", "Y");
                        arrayList3.add(map2);
                    } else if (A4.b.isCoupon(h_psg_tp_cd, h_dcnt_knd_cd)) {
                        z4.t.e("할인쿠폰");
                        DCCouponListDao.DiscountCoupon discountCoupon = new DCCouponListDao().new DiscountCoupon();
                        discountCoupon.setH_cpn_no(psgInfo.getH_dcsp_no());
                        discountCoupon.setIndex(i8);
                        this.f1854t0.add(discountCoupon);
                    } else if (A4.b.isCoupon(h_psg_tp_cd, h_dcnt_knd_cd2)) {
                        z4.t.e("할인쿠폰");
                        DCCouponListDao.DiscountCoupon discountCoupon2 = new DCCouponListDao().new DiscountCoupon();
                        discountCoupon2.setH_cpn_no(psgInfo.getH_dcsp_no2());
                        discountCoupon2.setIndex(i8);
                        this.f1854t0.add(discountCoupon2);
                    } else {
                        if (A4.b.isMeritFree(h_psg_tp_cd + h_dcnt_knd_cd, psgInfo.getH_dcsp_no())) {
                            z4.t.e("국가 유공자 무임");
                            HashMap map3 = new HashMap();
                            map3.put("INDEX", String.valueOf(i8));
                            map3.put("VALUE", psgInfo.getH_dcsp_no());
                            map3.put("NATIONAL_MERIT_PERSON_DISCOUNT", "N");
                            arrayList3.add(map3);
                        } else {
                            if (A4.b.isMeritFree(h_psg_tp_cd + h_dcnt_knd_cd2, psgInfo.getH_dcsp_no())) {
                                z4.t.e("국가 유공자 무임");
                                HashMap map4 = new HashMap();
                                map4.put("INDEX", String.valueOf(i8));
                                map4.put("VALUE", psgInfo.getH_dcsp_no2());
                                map4.put("NATIONAL_MERIT_PERSON_DISCOUNT", "N");
                                arrayList3.add(map4);
                            } else if (A4.b.isMeritProtector(h_psg_tp_cd, h_dcnt_knd_cd)) {
                                z4.t.e("유공보호");
                                HashMap map5 = new HashMap();
                                map5.put("INDEX", String.valueOf(i8));
                                map5.put("VALUE", psgInfo.getH_dcsp_no());
                                arrayList4.add(map5);
                            } else if (A4.b.isMeritProtector(h_psg_tp_cd, h_dcnt_knd_cd2)) {
                                z4.t.e("유공보호");
                                HashMap map6 = new HashMap();
                                map6.put("INDEX", String.valueOf(i8));
                                map6.put("VALUE", psgInfo.getH_dcsp_no2());
                                arrayList4.add(map6);
                            } else if (A4.b.isDisabledProtector(h_psg_tp_cd, h_dcnt_knd_cd)) {
                                z4.t.e("장애인 1~3급 보호자");
                                HashMap map7 = new HashMap();
                                map7.put("INDEX", String.valueOf(i8));
                                map7.put("VALUE", psgInfo.getH_dcsp_no());
                                arrayList5.add(map7);
                            } else if (A4.b.isDisabledProtector(h_psg_tp_cd, h_dcnt_knd_cd2)) {
                                z4.t.e("장애인 1~3급 보호자");
                                HashMap map8 = new HashMap();
                                map8.put("INDEX", String.valueOf(i8));
                                map8.put("VALUE", psgInfo.getH_dcsp_no2());
                                arrayList5.add(map8);
                            } else if (A4.b.isEmployee(h_psg_tp_cd, h_dcnt_knd_cd)) {
                                z4.t.e("공무출장증");
                                DCCouponListDao.DiscountCoupon discountCoupon3 = new DCCouponListDao().new DiscountCoupon();
                                discountCoupon3.setH_cpn_no(psgInfo.getH_dcsp_no());
                                discountCoupon3.setIndex(i8);
                                this.f1852r0.add(discountCoupon3);
                            } else if (A4.b.isEmployee(h_psg_tp_cd, h_dcnt_knd_cd2)) {
                                z4.t.e("공무출장증");
                                DCCouponListDao.DiscountCoupon discountCoupon4 = new DCCouponListDao().new DiscountCoupon();
                                discountCoupon4.setH_cpn_no(psgInfo.getH_dcsp_no2());
                                discountCoupon4.setIndex(i8);
                                this.f1852r0.add(discountCoupon4);
                            } else if (A4.b.isCongressPerson(h_psg_tp_cd, h_dcnt_knd_cd)) {
                                z4.t.e("국회의원");
                                HashMap map9 = new HashMap();
                                map9.put("INDEX", String.valueOf(i8));
                                map9.put("VALUE", I4.h.getInstance().getMemberNum());
                                arrayList = arrayList9;
                                arrayList.add(map9);
                            } else {
                                arrayList = arrayList9;
                                if (A4.b.isCongressPerson(h_psg_tp_cd, h_dcnt_knd_cd2)) {
                                    z4.t.e("국회의원");
                                    HashMap map10 = new HashMap();
                                    map10.put("INDEX", String.valueOf(i8));
                                    map10.put("VALUE", I4.h.getInstance().getMemberNum());
                                    arrayList.add(map10);
                                } else if (A4.b.isSoldier(h_psg_tp_cd, h_dcnt_knd_cd)) {
                                    z4.t.e("병역 의무복무자");
                                    HashMap map11 = new HashMap();
                                    map11.put("INDEX", String.valueOf(i8));
                                    arrayList2 = arrayList8;
                                    arrayList2.add(map11);
                                } else {
                                    arrayList2 = arrayList8;
                                    if (A4.b.isSoldier(h_psg_tp_cd, h_dcnt_knd_cd2)) {
                                        z4.t.e("병역 의무복무자");
                                        HashMap map12 = new HashMap();
                                        map12.put("INDEX", String.valueOf(i8));
                                        arrayList2.add(map12);
                                    } else {
                                        z4.t.e(h_psg_tp_cd + h_dcnt_knd_cd + X.SPACE + h_psg_tp_cd + h_dcnt_knd_cd2);
                                    }
                                }
                            }
                        }
                    }
                    arrayList2 = arrayList8;
                    arrayList = arrayList9;
                }
                arrayList2 = arrayList8;
            }
            i8++;
            arrayList6 = arrayList;
            arrayList7 = arrayList2;
            psgInfos = list;
        }
        R1(arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
    }

    @Override // com.korail.talk.view.base.a, n6.j
    public boolean appBack() {
        K0();
        return false;
    }

    @Override // H5.s, H5.x, G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            W1();
            C0();
            l2();
            y0();
        }
    }

    @Override // H5.s
    String u1() {
        C6420a c6420aL0 = L0();
        String string = null;
        if (C6630d.isNotNull(c6420aL0)) {
            NationalMeritPersonDiscount nationalMeritPersonDiscount = c6420aL0.getNationalMeritPersonDiscount();
            ArrayList<Integer> targetData = nationalMeritPersonDiscount.getTargetData();
            for (int i8 = 0; i8 < targetData.size(); i8++) {
                if (targetData.get(i8).intValue() > -1 && !nationalMeritPersonDiscount.isCheck()) {
                    z0(nationalMeritPersonDiscount);
                    nationalMeritPersonDiscount.expand();
                    string = getString(AbstractC5959j.dialog_payment_merit_msg);
                }
            }
            if (N.isNull(string)) {
                CongresspersonDiscountOption congresspersonDiscountOption = c6420aL0.getCongresspersonDiscountOption();
                ArrayList<Integer> targetIndexArray = congresspersonDiscountOption.getTargetIndexArray();
                for (int i9 = 0; i9 < targetIndexArray.size(); i9++) {
                    if (targetIndexArray.get(i9).intValue() > -1 && !congresspersonDiscountOption.isCheck()) {
                        z0(congresspersonDiscountOption);
                        congresspersonDiscountOption.expand();
                        string = getString(AbstractC5959j.dialog_payment_congress_msg);
                    }
                }
            }
        }
        return string;
    }

    @Override // H5.s, H5.x, G5.a
    protected void y0() {
        super.y0();
        this.f1809z0.setAmount(getReservationResponse());
    }
}
