package H5;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.DiscountPriceDao;
import com.korail.talk.network.dao.certification.DiscountPriceDao.DiscountPriceRequest;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao.DiscountCoupon;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao.DelayCoupon;
import com.korail.talk.network.data.certification.DiscountPriceParams;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.payment.PaymentActivity;
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
import o4.C6038a;
import r6.C6181b;
import s6.C6232c;
import u6.C6420a;
import x6.C6493a;
import x6.ViewOnClickListenerC6494b;
import x6.ViewOnClickListenerC6495c;
import y4.C6536a;
import z4.C6630d;
import z4.D;
import z4.N;

/* loaded from: classes.dex */
public class B extends s {
    public static final String TAG = "NDiscountFragment";

    /* renamed from: A0 */
    protected C6232c f1805A0;

    /* renamed from: y0 */
    private DiscountPriceParams[] f1806y0;

    /* renamed from: z0 */
    protected DiscountPriceParams[] f1807z0;

    private void C0() {
        ViewGroup viewGroup = (ViewGroup) p0(AbstractC5955f.v_discount_container);
        List<ReservationResponse.JrnyInfo> jrnyInfoList = getJrnyInfoList();
        C6181b c6181b = new C6181b(getActivity());
        c6181b.setJrnyData(getReservedTicketType(), jrnyInfoList);
        viewGroup.addView(c6181b);
        if (r4.j.WAIT != getReservedTicketType()) {
            C6493a viewOnClickListenerC6494b = this instanceof A ? new ViewOnClickListenerC6494b(getActivity()) : new ViewOnClickListenerC6495c(getActivity());
            viewOnClickListenerC6494b.setJrnyData(jrnyInfoList);
            viewGroup.addView(viewOnClickListenerC6494b);
        }
        C6232c c6232c = new C6232c(getActivity());
        this.f1805A0 = c6232c;
        viewGroup.addView(c6232c);
        P1(viewGroup);
    }

    private void W1() {
        this.f1806y0 = D.initDiscountParamArray(getJrnyInfo(), getJrnyInfo().getSeat_infos().getSeat_info().size());
    }

    public static Fragment newInstance() {
        return new B();
    }

    @Override // H5.s
    void N1() {
        int i8;
        ArrayList<Integer> arrayList;
        List<DiscountObjectData> list;
        ArrayList<Integer> arrayList2;
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            this.f1807z0 = (DiscountPriceParams[]) this.f1806y0.clone();
            ReservationResponse.JrnyInfo jrnyInfo = getJrnyInfo();
            HashMap map = new HashMap();
            DiscountPriceParams[] discountPriceParamsArr = (DiscountPriceParams[]) this.f1806y0.clone();
            boolean z8 = false;
            for (int i9 = 0; i9 < discountPriceParamsArr.length; i9++) {
                String dcnt_knd_cd1 = discountPriceParamsArr[i9].getDcnt_knd_cd1();
                if (!dcnt_knd_cd1.equals("000") && "432".equals(dcnt_knd_cd1)) {
                    map.put(Integer.valueOf(i9), "432");
                    z8 = true;
                }
            }
            BusinessTripCoupon businessTripCoupon = c6420aL0.getBusinessTripCoupon();
            ArrayList<Integer> couponData = businessTripCoupon.getCouponData();
            ArrayList<Integer> targetData = businessTripCoupon.getTargetData();
            List<DiscountObjectData> couponEntries = businessTripCoupon.getCouponEntries();
            int i10 = 0;
            while (true) {
                i8 = -1;
                if (i10 >= targetData.size()) {
                    break;
                }
                if (targetData.get(i10).intValue() > -1 && couponData.get(i10).intValue() > 0) {
                    this.f1807z0[targetData.get(i10).intValue()] = D.makeDiscountParams(jrnyInfo, targetData.get(i10).intValue(), ((DCCouponListDao.DiscountCoupon) couponEntries.get(couponData.get(i10).intValue()).getObject()).getH_cpn_no(), "152");
                }
                i10++;
            }
            DiscountMemberCoupon discountMemberCoupon = c6420aL0.getDiscountMemberCoupon();
            ArrayList<Integer> couponData2 = discountMemberCoupon.getCouponData();
            ArrayList<Integer> targetData2 = discountMemberCoupon.getTargetData();
            List<DiscountObjectData> couponEntries2 = discountMemberCoupon.getCouponEntries();
            int i11 = 0;
            while (i11 < targetData2.size()) {
                if (couponData2.get(i11).intValue() > i8 && targetData2.get(i11).intValue() > i8) {
                    this.f1807z0[targetData2.get(i11).intValue()] = D.makeDiscountParams(jrnyInfo, targetData2.get(i11).intValue(), ((DCCouponListDao.DiscountCoupon) couponEntries2.get(couponData2.get(i11).intValue()).getObject()).getH_cpn_no(), "151");
                }
                i11++;
                i8 = -1;
            }
            DelayDiscountCoupon delayDiscountCoupon = c6420aL0.getDelayDiscountCoupon();
            ArrayList<Integer> couponData3 = delayDiscountCoupon.getCouponData();
            ArrayList<Integer> targetData3 = delayDiscountCoupon.getTargetData();
            List<DiscountObjectData> couponEntries3 = delayDiscountCoupon.getCouponEntries();
            int i12 = 0;
            while (i12 < targetData3.size()) {
                if (couponData3.get(i12).intValue() <= -1 || targetData3.get(i12).intValue() <= -1) {
                    list = couponEntries3;
                    arrayList2 = couponData3;
                } else {
                    DelayTicketListDao.DelayCoupon delayCoupon = (DelayTicketListDao.DelayCoupon) couponEntries3.get(couponData3.get(i12).intValue()).getObject();
                    list = couponEntries3;
                    arrayList2 = couponData3;
                    this.f1807z0[targetData3.get(i12).intValue()] = D.makeDiscountParams(jrnyInfo, targetData3.get(i12).intValue(), C6038a.getReturnNumber(delayCoupon.getH_orgtk_wct_no(), delayCoupon.getH_orgtk_ret_sale_dt(), delayCoupon.getH_orgtk_sale_sqno(), delayCoupon.getH_orgtk_ret_pwd()), "401");
                }
                i12++;
                couponEntries3 = list;
                couponData3 = arrayList2;
            }
            NationalMeritPersonDiscount nationalMeritPersonDiscount = c6420aL0.getNationalMeritPersonDiscount();
            ArrayList<Integer> targetData4 = nationalMeritPersonDiscount.getTargetData();
            int i13 = 0;
            while (i13 < targetData4.size()) {
                if (targetData4.get(i13).intValue() > -1) {
                    arrayList = targetData4;
                    this.f1807z0[targetData4.get(i13).intValue()] = D.makeDiscountParams(jrnyInfo, targetData4.get(i13).intValue(), nationalMeritPersonDiscount.getCoupon(i13), nationalMeritPersonDiscount.getIsFee(i13) ? "152" : "151");
                } else {
                    arrayList = targetData4;
                }
                i13++;
                targetData4 = arrayList;
            }
            ArrayList<Integer> targetData5 = c6420aL0.getNationalMeritGuardianDiscount().getTargetData();
            for (int i14 = 0; i14 < targetData5.size(); i14++) {
                if (targetData5.get(i14).intValue() > -1) {
                    this.f1807z0[targetData5.get(i14).intValue()] = D.makeDiscountParams(jrnyInfo, targetData5.get(i14).intValue(), "", "172");
                }
            }
            CongresspersonDiscountOption congresspersonDiscountOption = c6420aL0.getCongresspersonDiscountOption();
            ArrayList<Integer> targetIndexArray = congresspersonDiscountOption.getTargetIndexArray();
            for (int i15 = 0; i15 < targetIndexArray.size(); i15++) {
                if (targetIndexArray.get(i15).intValue() > -1) {
                    this.f1807z0[targetIndexArray.get(i15).intValue()] = D.makeDiscountParams(jrnyInfo, targetIndexArray.get(i15).intValue(), congresspersonDiscountOption.getCoupon(i15), "402");
                }
            }
            ArrayList<Integer> targetData6 = c6420aL0.getDisabledPersonGuardianDiscount().getTargetData();
            for (int i16 = 0; i16 < targetData6.size(); i16++) {
                if (targetData6.get(i16).intValue() > -1) {
                    this.f1807z0[targetData6.get(i16).intValue()] = D.makeDiscountParams(jrnyInfo, targetData6.get(i16).intValue(), "", "171");
                }
            }
            ArrayList<Integer> targetData7 = c6420aL0.getSoldierDiscount().getTargetData();
            for (int i17 = 0; i17 < targetData7.size(); i17++) {
                if (targetData7.get(i17).intValue() > -1) {
                    this.f1807z0[targetData7.get(i17).intValue()] = D.makeDiscountParams(jrnyInfo, targetData7.get(i17).intValue(), "", "432");
                } else if (z8) {
                    for (int i18 = 0; i18 < this.f1807z0.length; i18++) {
                        if (map.containsKey(Integer.valueOf(i18)) && ((String) map.get(Integer.valueOf(i18))).equals("432")) {
                            this.f1807z0[i18].setDcnt_knd_cd1("000");
                        }
                    }
                }
            }
            k2();
        }
    }

    @Override // H5.s
    void O1(IBaseDao iBaseDao) {
        ReservationResponse reservationResponse = (ReservationResponse) iBaseDao.getResponse();
        setIPaymentRequest(C4.b.getRecalculationRsvPaymentRequest(getIPaymentRequest(), reservationResponse));
        setReservationResponse(reservationResponse);
        y0();
        U0();
        if (I4.h.getInstance().isLogin()) {
            H0(reservationResponse.getH_pnr_no());
        }
        getActivity().setResult(-1);
    }

    @Override // H5.s
    void Q1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        List<ReservationResponse.SeatInfo> seat_info = getJrnyInfo().getSeat_infos().getSeat_info();
        for (int i8 = 0; i8 < seat_info.size(); i8++) {
            ReservationResponse.SeatInfo seatInfo = seat_info.get(i8);
            String h_psg_tp_cd = seatInfo.getH_psg_tp_cd();
            String h_dcnt_knd_cd1 = seatInfo.getH_dcnt_knd_cd1();
            String h_dcnt_knd_cd2 = seatInfo.getH_dcnt_knd_cd2();
            z4.t.e("일반 psgTpCd = " + h_psg_tp_cd + " dcntKndCd1 = " + h_dcnt_knd_cd1 + "  dcntKndCd2 = " + h_dcnt_knd_cd2 + " No = " + seatInfo.getDcnt_reld_no());
            if ("1".equals(h_psg_tp_cd) || "3".equals(h_psg_tp_cd)) {
                if (A4.a.isEmployee(h_dcnt_knd_cd1) || A4.a.isEmployee(h_dcnt_knd_cd2)) {
                    DCCouponListDao.DiscountCoupon discountCoupon = new DCCouponListDao().new DiscountCoupon();
                    discountCoupon.setH_cpn_no(seatInfo.getDcnt_reld_no());
                    discountCoupon.setIndex(i8);
                    this.f1852r0.add(discountCoupon);
                } else if (A4.a.isCoupon(h_dcnt_knd_cd1) || A4.a.isCoupon(h_dcnt_knd_cd2)) {
                    DCCouponListDao.DiscountCoupon discountCoupon2 = new DCCouponListDao().new DiscountCoupon();
                    discountCoupon2.setH_cpn_no(seatInfo.getDcnt_reld_no());
                    discountCoupon2.setIndex(i8);
                    this.f1854t0.add(discountCoupon2);
                } else if (A4.a.isDelayCoupon(h_dcnt_knd_cd1) || A4.a.isDelayCoupon(h_dcnt_knd_cd2)) {
                    String dcnt_reld_no = seatInfo.getDcnt_reld_no();
                    DelayTicketListDao.DelayCoupon delayCoupon = new DelayTicketListDao().new DelayCoupon();
                    delayCoupon.setH_orgtk_wct_no(dcnt_reld_no.substring(0, 5));
                    delayCoupon.setH_orgtk_ret_sale_dt(dcnt_reld_no.substring(5, 9));
                    delayCoupon.setH_orgtk_sale_sqno(dcnt_reld_no.substring(9, 14));
                    delayCoupon.setH_orgtk_ret_pwd(dcnt_reld_no.substring(14, 16));
                    delayCoupon.setIndex(i8);
                    this.f1856v0.add(delayCoupon);
                } else if (A4.a.isMerit(h_dcnt_knd_cd1) || A4.a.isMerit(h_dcnt_knd_cd2)) {
                    HashMap map = new HashMap();
                    map.put("INDEX", String.valueOf(i8));
                    map.put("VALUE", seatInfo.getDcnt_reld_no());
                    arrayList.add(map);
                } else if (A4.a.isMeritProjector(h_dcnt_knd_cd1) || A4.a.isMeritProjector(h_dcnt_knd_cd2)) {
                    HashMap map2 = new HashMap();
                    map2.put("INDEX", String.valueOf(i8));
                    map2.put("VALUE", seatInfo.getDcnt_reld_no());
                    arrayList2.add(map2);
                } else if (A4.a.isDisabledProtector(h_dcnt_knd_cd1) || A4.a.isDisabledProtector(h_dcnt_knd_cd2)) {
                    HashMap map3 = new HashMap();
                    map3.put("INDEX", String.valueOf(i8));
                    map3.put("VALUE", seatInfo.getDcnt_reld_no());
                    arrayList3.add(map3);
                } else if (A4.a.isCongressperson(h_dcnt_knd_cd1) || A4.a.isCongressperson(h_dcnt_knd_cd2)) {
                    HashMap map4 = new HashMap();
                    map4.put("INDEX", String.valueOf(i8));
                    map4.put("VALUE", I4.h.getInstance().getMemberNum());
                    arrayList4.add(map4);
                } else if (A4.a.isSoldier(h_dcnt_knd_cd1) || A4.a.isSoldier(h_dcnt_knd_cd2)) {
                    HashMap map5 = new HashMap();
                    map5.put("INDEX", String.valueOf(i8));
                    arrayList5.add(map5);
                }
            }
        }
        R1(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // H5.s, H5.x, G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    protected void k2() {
        DiscountPriceDao discountPriceDao = new DiscountPriceDao();
        DiscountPriceDao.DiscountPriceRequest discountPriceRequest = discountPriceDao.new DiscountPriceRequest();
        discountPriceRequest.setTxtJobId("1101");
        discountPriceRequest.setHidPnrNo(getPNRNo());
        discountPriceRequest.setTxtPsgGridcnt(String.valueOf(getJrnyInfo().getSeat_infos().getSeat_info().size()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (DiscountPriceParams discountPriceParams : this.f1807z0) {
            arrayList.add(discountPriceParams.getPsg_tp_dv_cd());
            arrayList2.add(discountPriceParams.getPsrm_cl_cd());
            arrayList3.add(discountPriceParams.getDcnt_knd_cd1());
            arrayList4.add(discountPriceParams.getHidDscpNo());
            arrayList5.add(discountPriceParams.getHidDcntKndCd());
            arrayList6.add(discountPriceParams.getHidFmlyNo());
        }
        discountPriceRequest.setPsg_tp_dv_cd(arrayList);
        discountPriceRequest.setPsrm_cl_cd(arrayList2);
        discountPriceRequest.setDcnt_knd_cd1(arrayList3);
        discountPriceRequest.setHidDscpNo(arrayList4);
        discountPriceRequest.setHidDcntKndCd(arrayList5);
        discountPriceRequest.setHidFmlyNo(arrayList6);
        I4.h hVar = I4.h.getInstance();
        if (hVar.isNonMember()) {
            discountPriceRequest.setHiduserYn("N");
            discountPriceRequest.setHidCustNo(hVar.getNonMemberNumber());
        }
        discountPriceDao.setRequest(discountPriceRequest);
        executeDao(discountPriceDao);
    }

    @Override // G5.a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            W1();
            C0();
            y0();
        }
    }

    @Override // H5.s, com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_discount_price == iBaseDao.getId()) {
            if (isReservationHistory()) {
                B0(1);
            } else {
                B0(0);
            }
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
        PaymentActivity paymentActivity = (PaymentActivity) getActivity();
        this.f1805A0.setAmount(paymentActivity.getmTotPrc(), paymentActivity.getmTotFare(), paymentActivity.getmTotDcnt(), paymentActivity.getmSprmFareAmount());
    }
}
