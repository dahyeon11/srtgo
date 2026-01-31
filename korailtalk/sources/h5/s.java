package H5;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.certification.CongresspersonCertDao;
import com.korail.talk.network.dao.certification.CongresspersonCertDao.CongresspersonCertRequest;
import com.korail.talk.network.dao.certification.MeritCertDao;
import com.korail.talk.network.dao.certification.MeritCertDao.MeritCertRequest;
import com.korail.talk.network.dao.passCard.DCCouponCertDao;
import com.korail.talk.network.dao.passCard.DCCouponCertDao.DCCouponCertRequest;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao.DCCouponListRequest;
import com.korail.talk.network.dao.passCard.DCCouponListDao.DiscountCoupon;
import com.korail.talk.network.dao.passCard.DCEmployeeCouponCertDao;
import com.korail.talk.network.dao.passCard.DelayTicketAddDao;
import com.korail.talk.network.dao.passCard.DelayTicketAddDao.DelayTicketAddRequest;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao.DelayCoupon;
import com.korail.talk.network.dao.passCard.DelayTicketListDao.DelayTicketListRequest;
import com.korail.talk.view.payment.discount.sub.BusinessTripCoupon;
import com.korail.talk.view.payment.discount.sub.CongresspersonDiscountOption;
import com.korail.talk.view.payment.discount.sub.DelayDiscountCoupon;
import com.korail.talk.view.payment.discount.sub.DisabledPersonGuardianDiscount;
import com.korail.talk.view.payment.discount.sub.DiscountMemberCoupon;
import com.korail.talk.view.payment.discount.sub.NationalMeritGuardianDiscount;
import com.korail.talk.view.payment.discount.sub.NationalMeritPersonDiscount;
import com.korail.talk.view.payment.discount.sub.SoldierDiscount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import u6.C6420a;
import y4.C6536a;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.D;
import z4.N;

/* loaded from: classes.dex */
public abstract class s extends x implements v4.g {

    /* renamed from: n0, reason: collision with root package name */
    protected final String f1848n0 = "INDEX";

    /* renamed from: o0, reason: collision with root package name */
    protected final String f1849o0 = "VALUE";

    /* renamed from: p0, reason: collision with root package name */
    protected final String f1850p0 = "NATIONAL_MERIT_PERSON_DISCOUNT";

    /* renamed from: q0, reason: collision with root package name */
    private int f1851q0 = 1;

    /* renamed from: r0, reason: collision with root package name */
    protected ArrayList f1852r0;

    /* renamed from: s0, reason: collision with root package name */
    protected List f1853s0;

    /* renamed from: t0, reason: collision with root package name */
    protected ArrayList f1854t0;

    /* renamed from: u0, reason: collision with root package name */
    protected List f1855u0;

    /* renamed from: v0, reason: collision with root package name */
    protected ArrayList f1856v0;

    /* renamed from: w0, reason: collision with root package name */
    protected List f1857w0;

    /* renamed from: x0, reason: collision with root package name */
    private C6420a f1858x0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1() {
        B0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(C6420a c6420a, DelayDiscountCoupon delayDiscountCoupon, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 <= 0 || isEnableTarget(c6420a, index)) {
            B0(1);
            if (i9 == 0) {
                index = -1;
            }
            delayDiscountCoupon.setTargetIndex(i8, i9, index);
        } else {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
        }
        delayDiscountCoupon.setAddBtnEnable(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(C6420a c6420a, DisabledPersonGuardianDiscount disabledPersonGuardianDiscount, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 > 0 && !isEnableTarget(c6420a, index)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
            return;
        }
        B0(1);
        if (i9 == 0) {
            index = -1;
        }
        disabledPersonGuardianDiscount.setTargetIndex(i8, i9, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1() {
        B0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(C6420a c6420a, DiscountMemberCoupon discountMemberCoupon, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 <= 0 || isEnableTarget(c6420a, index)) {
            B0(1);
            if (i9 == 0) {
                index = -1;
            }
            discountMemberCoupon.setTargetIndex(i8, i9, index);
        } else {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
        }
        discountMemberCoupon.setAddBtnEnable(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1(C6420a c6420a, NationalMeritGuardianDiscount nationalMeritGuardianDiscount, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 > 0 && !isEnableTarget(c6420a, index)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
            return;
        }
        B0(1);
        if (i9 == 0) {
            index = -1;
        }
        nationalMeritGuardianDiscount.setTargetIndex(i8, i9, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(C6420a c6420a, NationalMeritPersonDiscount nationalMeritPersonDiscount, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 > 0 && !isEnableTarget(c6420a, index)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
            return;
        }
        B0(1);
        if (i9 == 0) {
            index = -1;
        }
        nationalMeritPersonDiscount.setTargetIndex(i8, i9, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1() {
        B0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(SoldierDiscount soldierDiscount, int i8, int i9, int i10, DialogInterface dialogInterface, int i11) {
        if (102 == i11) {
            B0(1);
            if (i9 == 0) {
                i10 = -1;
            }
            soldierDiscount.setTargetIndex(i8, i9, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(C6420a c6420a, final SoldierDiscount soldierDiscount, final int i8, final int i9, DiscountObjectData discountObjectData) {
        final int index = discountObjectData.getIndex();
        if (i9 > 0 && !isEnableTarget(c6420a, index)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
            return;
        }
        if (i9 > 0) {
            C6637k.getCDialog(getActivity(), 1002, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_soilder_discount_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: H5.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f1826a.L1(soldierDiscount, i8, i9, index, dialogInterface, i10);
                }
            }).showDialog();
            return;
        }
        B0(1);
        if (i9 == 0) {
            index = -1;
        }
        soldierDiscount.setTargetIndex(i8, i9, index);
    }

    private void T1(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> arrayListMakeDiscountCouponEntries = makeDiscountCouponEntries(getApplicationContext(), this.f1853s0);
            final BusinessTripCoupon businessTripCoupon = c6420aL0.getBusinessTripCoupon();
            businessTripCoupon.setEntries(getString(AbstractC5959j.payment_select_employee), arrayListMakeDiscountCouponEntries, getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (businessTripCoupon.getInputViewCount() == 0) {
                businessTripCoupon.addInputView();
            }
            businessTripCoupon.setCouponSelectListener(new BusinessTripCoupon.b() { // from class: H5.p
                @Override // com.korail.talk.view.payment.discount.sub.BusinessTripCoupon.b
                public final void onCouponSelect() {
                    this.f1843a.v1();
                }
            });
            businessTripCoupon.setTargetSelectListener(new BusinessTripCoupon.c() { // from class: H5.q
                @Override // com.korail.talk.view.payment.discount.sub.BusinessTripCoupon.c
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1844a.w1(c6420aL0, businessTripCoupon, i8, i9, discountObjectData);
                }
            });
            businessTripCoupon.setOnCouponInputListener(new BusinessTripCoupon.a() { // from class: H5.r
                @Override // com.korail.talk.view.payment.discount.sub.BusinessTripCoupon.a
                public final void onApplied(int i8, String str) {
                    this.f1847a.x1(i8, str);
                }
            });
        }
    }

    private void V1(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            final CongresspersonDiscountOption congresspersonDiscountOption = c6420aL0.getCongresspersonDiscountOption();
            congresspersonDiscountOption.setEntries(getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (congresspersonDiscountOption.getInputViewCount() == 0) {
                congresspersonDiscountOption.addInputView();
            }
            congresspersonDiscountOption.setOnCertifyListener(new CongresspersonDiscountOption.a() { // from class: H5.n
                @Override // com.korail.talk.view.payment.discount.sub.CongresspersonDiscountOption.a
                public final void onCertify(int i8, String str, String str2) {
                    this.f1839a.y1(i8, str, str2);
                }
            });
            congresspersonDiscountOption.setTargetSelectListener(new CongresspersonDiscountOption.b() { // from class: H5.o
                @Override // com.korail.talk.view.payment.discount.sub.CongresspersonDiscountOption.b
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1840a.z1(c6420aL0, congresspersonDiscountOption, i8, i9, discountObjectData);
                }
            });
            congresspersonDiscountOption.expand();
        }
    }

    private void W1() {
        this.f1852r0 = new ArrayList();
        this.f1853s0 = new ArrayList();
        this.f1854t0 = new ArrayList();
        this.f1855u0 = new ArrayList();
        this.f1856v0 = new ArrayList();
        this.f1857w0 = new ArrayList();
    }

    private void X1(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> arrayListMakeDelayCouponEntries = makeDelayCouponEntries(getApplicationContext(), this.f1857w0);
            final DelayDiscountCoupon delayDiscountCoupon = c6420aL0.getDelayDiscountCoupon();
            delayDiscountCoupon.setEntries(getString(AbstractC5959j.payment_select_delay), arrayListMakeDelayCouponEntries, getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (delayDiscountCoupon.getInputViewCount() == 0) {
                delayDiscountCoupon.addInputView();
            }
            delayDiscountCoupon.setCouponSelectListener(new DelayDiscountCoupon.b() { // from class: H5.b
                @Override // com.korail.talk.view.payment.discount.sub.DelayDiscountCoupon.b
                public final void onCouponSelect() {
                    this.f1813a.A1();
                }
            });
            delayDiscountCoupon.setTargetSelectListener(new DelayDiscountCoupon.c() { // from class: H5.c
                @Override // com.korail.talk.view.payment.discount.sub.DelayDiscountCoupon.c
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1814a.B1(c6420aL0, delayDiscountCoupon, i8, i9, discountObjectData);
                }
            });
            delayDiscountCoupon.setOnCouponInputListener(new DelayDiscountCoupon.a() { // from class: H5.d
                @Override // com.korail.talk.view.payment.discount.sub.DelayDiscountCoupon.a
                public final void onApplied(int i8, String str, String str2, String str3, String str4) {
                    this.f1817a.C1(i8, str, str2, str3, str4);
                }
            });
        }
    }

    private void Z1(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            final DisabledPersonGuardianDiscount disabledPersonGuardianDiscount = c6420aL0.getDisabledPersonGuardianDiscount();
            disabledPersonGuardianDiscount.setEntries(getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (!isExistHighDisable()) {
                disabledPersonGuardianDiscount.setHeaderValTxt(getString(AbstractC5959j.common_no_applied_passenger));
                return;
            }
            disabledPersonGuardianDiscount.setHeaderValTxt(g5.e.STATE_NAME_NONE);
            if (disabledPersonGuardianDiscount.getInputViewCount() == 0) {
                disabledPersonGuardianDiscount.addInputView();
            }
            disabledPersonGuardianDiscount.setTargetSelectListener(new DisabledPersonGuardianDiscount.a() { // from class: H5.a
                @Override // com.korail.talk.view.payment.discount.sub.DisabledPersonGuardianDiscount.a
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1810a.D1(c6420aL0, disabledPersonGuardianDiscount, i8, i9, discountObjectData);
                }
            });
        }
    }

    private void c2(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> arrayListMakeDiscountCouponEntries = makeDiscountCouponEntries(getApplicationContext(), this.f1855u0);
            final DiscountMemberCoupon discountMemberCoupon = c6420aL0.getDiscountMemberCoupon();
            discountMemberCoupon.setEntries(getString(AbstractC5959j.payment_select_coupon), arrayListMakeDiscountCouponEntries, getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (discountMemberCoupon.getInputViewCount() == 0) {
                discountMemberCoupon.addInputView();
            }
            discountMemberCoupon.setCouponSelectListener(new DiscountMemberCoupon.b() { // from class: H5.f
                @Override // com.korail.talk.view.payment.discount.sub.DiscountMemberCoupon.b
                public final void onCouponSelect() {
                    this.f1821a.E1();
                }
            });
            discountMemberCoupon.setTargetSelectListener(new DiscountMemberCoupon.c() { // from class: H5.g
                @Override // com.korail.talk.view.payment.discount.sub.DiscountMemberCoupon.c
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1822a.F1(c6420aL0, discountMemberCoupon, i8, i9, discountObjectData);
                }
            });
            discountMemberCoupon.setOnCouponInputListener(new DiscountMemberCoupon.a() { // from class: H5.h
                @Override // com.korail.talk.view.payment.discount.sub.DiscountMemberCoupon.a
                public final void onApplied(int i8, String str, String str2) {
                    this.f1825a.G1(i8, str, str2);
                }
            });
        }
    }

    private void e2(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            final NationalMeritGuardianDiscount nationalMeritGuardianDiscount = c6420aL0.getNationalMeritGuardianDiscount();
            nationalMeritGuardianDiscount.setEntries(getString(AbstractC5959j.payment_select_passenger), arrayList);
            nationalMeritGuardianDiscount.setHeaderValTxt(isEnableMeritProtector() ? g5.e.STATE_NAME_NONE : getString(AbstractC5959j.common_no_applied_passenger));
            if (nationalMeritGuardianDiscount.getInputViewCount() == 0) {
                nationalMeritGuardianDiscount.addInputView();
            }
            nationalMeritGuardianDiscount.setTargetSelectListener(new NationalMeritGuardianDiscount.a() { // from class: H5.e
                @Override // com.korail.talk.view.payment.discount.sub.NationalMeritGuardianDiscount.a
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1818a.H1(c6420aL0, nationalMeritGuardianDiscount, i8, i9, discountObjectData);
                }
            });
        }
    }

    private void g2(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            final NationalMeritPersonDiscount nationalMeritPersonDiscount = c6420aL0.getNationalMeritPersonDiscount();
            nationalMeritPersonDiscount.setEntries(getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (nationalMeritPersonDiscount.getInputViewCount() == 0) {
                nationalMeritPersonDiscount.addInputView(getApplicationContext());
            }
            nationalMeritPersonDiscount.setOnCertifyListener(new NationalMeritPersonDiscount.a() { // from class: H5.k
                @Override // com.korail.talk.view.payment.discount.sub.NationalMeritPersonDiscount.a
                public final void onCertify(int i8, String str, String str2, String str3) {
                    this.f1834a.K1(i8, str, str2, str3);
                }
            });
            nationalMeritPersonDiscount.setTargetSelectListener(new NationalMeritPersonDiscount.c() { // from class: H5.l
                @Override // com.korail.talk.view.payment.discount.sub.NationalMeritPersonDiscount.c
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1835a.I1(c6420aL0, nationalMeritPersonDiscount, i8, i9, discountObjectData);
                }
            });
            nationalMeritPersonDiscount.setOnCheckedChangeListener(new NationalMeritPersonDiscount.b() { // from class: H5.m
                @Override // com.korail.talk.view.payment.discount.sub.NationalMeritPersonDiscount.b
                public final void OnCheckedChange() {
                    this.f1838a.J1();
                }
            });
        }
    }

    private void h2(ArrayList arrayList) throws NumberFormatException {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "432");
            i2(targetUser);
            if (arrayList.size() > 0) {
                SoldierDiscount soldierDiscount = c6420aL0.getSoldierDiscount();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    int i9 = Integer.parseInt((String) ((HashMap) arrayList.get(i8)).get("INDEX"));
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (i9 == discountObjectData.getIndex()) {
                            soldierDiscount.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    soldierDiscount.expand();
                }
            }
        }
    }

    private void i2(ArrayList arrayList) {
        final C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            final SoldierDiscount soldierDiscount = c6420aL0.getSoldierDiscount();
            soldierDiscount.setEntries(getString(AbstractC5959j.payment_select_passenger), arrayList);
            if (soldierDiscount.getInputViewCount() == 0) {
                soldierDiscount.addInputView();
            }
            soldierDiscount.setTargetSelectListener(new SoldierDiscount.a() { // from class: H5.j
                @Override // com.korail.talk.view.payment.discount.sub.SoldierDiscount.a
                public final void onTargetSelect(int i8, int i9, DiscountObjectData discountObjectData) {
                    this.f1831a.M1(c6420aL0, soldierDiscount, i8, i9, discountObjectData);
                }
            });
        }
    }

    private void j2() {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            c6420aL0.getBusinessTripCoupon().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "152"));
            c6420aL0.getDiscountMemberCoupon().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "151"));
            c6420aL0.getDelayDiscountCoupon().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "401"));
            c6420aL0.getNationalMeritPersonDiscount().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "152"));
            NationalMeritGuardianDiscount nationalMeritGuardianDiscount = c6420aL0.getNationalMeritGuardianDiscount();
            nationalMeritGuardianDiscount.updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "172"));
            boolean zIsEnableMeritProtector = isEnableMeritProtector();
            nationalMeritGuardianDiscount.setHeaderValTxt(zIsEnableMeritProtector ? g5.e.STATE_NAME_NONE : getString(AbstractC5959j.common_no_applied_passenger));
            if (!zIsEnableMeritProtector) {
                nationalMeritGuardianDiscount.collapse();
            }
            c6420aL0.getDisabledPersonGuardianDiscount().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "171"));
            c6420aL0.getCongresspersonDiscountOption().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "402"));
            c6420aL0.getSoldierDiscount().updateTargets(D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "432"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public void y1(String str, String str2, int i8) {
        CongresspersonCertDao congresspersonCertDao = new CongresspersonCertDao();
        CongresspersonCertDao.CongresspersonCertRequest congresspersonCertRequest = congresspersonCertDao.new CongresspersonCertRequest();
        congresspersonCertRequest.setfreeDiscCertNo(str);
        congresspersonCertRequest.setcertNo(str2);
        congresspersonCertRequest.setabrdDt(getJrnyInfo().getH_dpt_dt());
        congresspersonCertRequest.setViewIndex(i8);
        congresspersonCertDao.setRequest(congresspersonCertRequest);
        executeDao(congresspersonCertDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public void x1(String str, int i8) {
        DCEmployeeCouponCertDao dCEmployeeCouponCertDao = new DCEmployeeCouponCertDao();
        DCCouponCertDao.DCCouponCertRequest dCCouponCertRequest = new DCCouponCertDao.DCCouponCertRequest();
        dCCouponCertRequest.setTxtCertNo(str);
        dCCouponCertRequest.setTxtCertPwd("");
        dCCouponCertRequest.setCouponInputViewIndex(i8);
        dCEmployeeCouponCertDao.setRequest(dCCouponCertRequest);
        executeDao(dCEmployeeCouponCertDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public void G1(String str, String str2, int i8) {
        DCCouponCertDao dCCouponCertDao = new DCCouponCertDao();
        DCCouponCertDao.DCCouponCertRequest dCCouponCertRequest = dCCouponCertDao.new DCCouponCertRequest();
        dCCouponCertRequest.setTxtCertNo(str);
        dCCouponCertRequest.setTxtCertPwd(str2);
        dCCouponCertRequest.setCouponInputViewIndex(i8);
        dCCouponCertDao.setRequest(dCCouponCertRequest);
        executeDao(dCCouponCertDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void C1(String str, String str2, String str3, String str4, int i8) {
        DelayTicketAddDao delayTicketAddDao = new DelayTicketAddDao();
        DelayTicketAddDao.DelayTicketAddRequest delayTicketAddRequest = delayTicketAddDao.new DelayTicketAddRequest();
        delayTicketAddRequest.setH_dlay_disc_cnt("1");
        delayTicketAddRequest.setH_orgtk_wct_no(str);
        delayTicketAddRequest.setH_orgtk_ret_sale_dt(str2);
        delayTicketAddRequest.setH_orgtk_sale_sqno(str3);
        delayTicketAddRequest.setH_orgtk_ret_pwd(str4);
        delayTicketAddRequest.setDelayCouponInputViewIndex(i8);
        delayTicketAddDao.setRequest(delayTicketAddRequest);
        executeDao(delayTicketAddDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public void K1(String str, String str2, String str3, int i8) {
        MeritCertDao meritCertDao = new MeritCertDao();
        MeritCertDao.MeritCertRequest meritCertRequest = meritCertDao.new MeritCertRequest();
        meritCertRequest.setTxtFreeDiscCertNo(str);
        meritCertRequest.setTxtAcptPwd(str2);
        meritCertRequest.setTxtJuminNo7(str3);
        meritCertRequest.setTxtAbrdDt(getJrnyInfo().getH_dpt_dt());
        meritCertRequest.setViewIndex(i8);
        meritCertDao.setRequest(meritCertRequest);
        executeDao(meritCertDao);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1() {
        B0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(C6420a c6420a, BusinessTripCoupon businessTripCoupon, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 <= 0 || isEnableTarget(c6420a, index)) {
            B0(1);
            if (i9 == 0) {
                index = -1;
            }
            businessTripCoupon.setTargetIndex(i8, i9, index);
        } else {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
        }
        businessTripCoupon.setAddBtnEnable(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(C6420a c6420a, CongresspersonDiscountOption congresspersonDiscountOption, int i8, int i9, DiscountObjectData discountObjectData) {
        int index = discountObjectData.getIndex();
        if (i9 > 0 && !isEnableTarget(c6420a, index)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_select_another_passenger)).showDialog();
            return;
        }
        B0(1);
        if (i9 == 0) {
            index = -1;
        }
        congresspersonDiscountOption.setTargetIndex(i8, i9, index);
    }

    @Override // H5.x
    C6420a L0() {
        return this.f1858x0;
    }

    abstract void N1();

    abstract void O1(IBaseDao iBaseDao);

    protected void P1(ViewGroup viewGroup) {
        C6420a c6420a = new C6420a(getActivity());
        this.f1858x0 = c6420a;
        c6420a.getBusinessTripCoupon().setHeaderClickListener(this);
        this.f1858x0.getDiscountMemberCoupon().setHeaderClickListener(this);
        this.f1858x0.getDelayDiscountCoupon().setHeaderClickListener(this);
        this.f1858x0.getNationalMeritPersonDiscount().setHeaderClickListener(this);
        this.f1858x0.getNationalMeritGuardianDiscount().setHeaderClickListener(this);
        this.f1858x0.getDisabledPersonGuardianDiscount().setHeaderClickListener(this);
        this.f1858x0.getCongresspersonDiscountOption().setHeaderClickListener(this);
        this.f1858x0.getSoldierDiscount().setHeaderClickListener(this);
        viewGroup.addView(this.f1858x0);
        Q1();
        boolean zIsLogin = I4.h.getInstance().isLogin();
        if (this.f1854t0.size() > 0 && zIsLogin) {
            o1();
        }
        if (this.f1856v0.size() <= 0 || !zIsLogin) {
            return;
        }
        s1();
    }

    abstract void Q1();

    protected void R1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        b2();
        a2();
        S1();
        f2(arrayList);
        d2(arrayList2);
        Y1(arrayList3);
        U1(arrayList4);
        h2(arrayList5);
    }

    protected void S1() {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            BusinessTripCoupon businessTripCoupon = c6420aL0.getBusinessTripCoupon();
            if (this.f1852r0.size() > 0) {
                this.f1853s0.addAll(this.f1852r0);
            }
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "152");
            T1(targetUser);
            if (this.f1852r0.size() > 0) {
                for (int i8 = 0; i8 < this.f1852r0.size(); i8++) {
                    DCCouponListDao.DiscountCoupon discountCoupon = (DCCouponListDao.DiscountCoupon) this.f1852r0.get(i8);
                    for (int i9 = 0; i9 < this.f1853s0.size(); i9++) {
                        if (discountCoupon.getH_cpn_no().equals(((DCCouponListDao.DiscountCoupon) this.f1853s0.get(i9)).getH_cpn_no())) {
                            businessTripCoupon.setCouponIndex(i8, i9 + 1);
                        }
                    }
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (discountCoupon.getIndex() == discountObjectData.getIndex()) {
                            businessTripCoupon.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    if (i8 < this.f1852r0.size() - 1) {
                        businessTripCoupon.addInputView();
                    }
                }
                businessTripCoupon.setAddBtnEnable(this.f1852r0.size() - 1);
                businessTripCoupon.expand();
            }
        }
    }

    protected void U1(ArrayList arrayList) throws NumberFormatException {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "402");
            V1(targetUser);
            if (arrayList.size() > 0) {
                CongresspersonDiscountOption congresspersonDiscountOption = c6420aL0.getCongresspersonDiscountOption();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    HashMap map = (HashMap) arrayList.get(i8);
                    int i9 = Integer.parseInt((String) map.get("INDEX"));
                    congresspersonDiscountOption.setCoupon(i8, (String) map.get("VALUE"));
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (i9 == discountObjectData.getIndex()) {
                            congresspersonDiscountOption.setTargetIndex(i8, i10, discountObjectData.getIndex());
                            congresspersonDiscountOption.setCheck(true);
                        }
                    }
                    if (i8 < arrayList.size() - 1) {
                        congresspersonDiscountOption.addInputView();
                    }
                }
                congresspersonDiscountOption.expand();
            }
        }
    }

    protected void Y1(ArrayList arrayList) throws NumberFormatException {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "171");
            Z1(targetUser);
            if (arrayList.size() > 0) {
                DisabledPersonGuardianDiscount disabledPersonGuardianDiscount = c6420aL0.getDisabledPersonGuardianDiscount();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    int i9 = Integer.parseInt((String) ((HashMap) arrayList.get(i8)).get("INDEX"));
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (i9 == discountObjectData.getIndex()) {
                            disabledPersonGuardianDiscount.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    if (i8 < arrayList.size() - 1) {
                        disabledPersonGuardianDiscount.addInputView();
                    }
                }
                disabledPersonGuardianDiscount.setInputAddBtn(true);
                disabledPersonGuardianDiscount.expand();
            }
        }
    }

    protected void a2() {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            DelayDiscountCoupon delayDiscountCoupon = c6420aL0.getDelayDiscountCoupon();
            if (this.f1856v0.size() > 0) {
                this.f1857w0.addAll(this.f1856v0);
            }
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "401");
            X1(targetUser);
            if (this.f1856v0.size() > 0) {
                for (int i8 = 0; i8 < this.f1856v0.size(); i8++) {
                    DelayTicketListDao.DelayCoupon delayCoupon = (DelayTicketListDao.DelayCoupon) this.f1856v0.get(i8);
                    for (int i9 = 0; i9 < this.f1857w0.size(); i9++) {
                        DelayTicketListDao.DelayCoupon delayCoupon2 = (DelayTicketListDao.DelayCoupon) this.f1857w0.get(i9);
                        if ((delayCoupon.getH_orgtk_wct_no() + delayCoupon.getH_orgtk_ret_sale_dt() + delayCoupon.getH_orgtk_sale_sqno() + delayCoupon.getH_orgtk_ret_pwd()).equals(delayCoupon2.getH_orgtk_wct_no() + delayCoupon2.getH_orgtk_ret_sale_dt() + delayCoupon2.getH_orgtk_sale_sqno() + delayCoupon2.getH_orgtk_ret_pwd())) {
                            delayDiscountCoupon.setCouponIndex(i8, i9 + 1);
                        }
                    }
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (delayCoupon.getIndex() == discountObjectData.getIndex()) {
                            delayDiscountCoupon.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    if (i8 < this.f1856v0.size() - 1) {
                        delayDiscountCoupon.addInputView();
                    }
                }
                delayDiscountCoupon.setAddBtnEnable(this.f1856v0.size() - 1);
                delayDiscountCoupon.expand();
            }
        }
    }

    protected void b2() {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            DiscountMemberCoupon discountMemberCoupon = c6420aL0.getDiscountMemberCoupon();
            if (this.f1854t0.size() > 0) {
                this.f1855u0.addAll(this.f1854t0);
            }
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "151");
            c2(targetUser);
            if (this.f1854t0.size() > 0) {
                for (int i8 = 0; i8 < this.f1854t0.size(); i8++) {
                    DCCouponListDao.DiscountCoupon discountCoupon = (DCCouponListDao.DiscountCoupon) this.f1854t0.get(i8);
                    for (int i9 = 0; i9 < this.f1855u0.size(); i9++) {
                        if (discountCoupon.getH_cpn_no().equals(((DCCouponListDao.DiscountCoupon) this.f1855u0.get(i9)).getH_cpn_no())) {
                            discountMemberCoupon.setCouponIndex(i8, i9 + 1);
                        }
                    }
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (discountCoupon.getIndex() == discountObjectData.getIndex()) {
                            discountMemberCoupon.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    if (i8 < this.f1854t0.size() - 1) {
                        discountMemberCoupon.addInputView();
                    }
                }
                discountMemberCoupon.setAddBtnEnable(this.f1854t0.size() - 1);
                discountMemberCoupon.expand();
            }
        }
    }

    protected void d2(ArrayList arrayList) throws NumberFormatException {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "172");
            e2(targetUser);
            if (arrayList.size() > 0) {
                NationalMeritGuardianDiscount nationalMeritGuardianDiscount = c6420aL0.getNationalMeritGuardianDiscount();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    int i9 = Integer.parseInt((String) ((HashMap) arrayList.get(i8)).get("INDEX"));
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (i9 == discountObjectData.getIndex()) {
                            nationalMeritGuardianDiscount.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    if (i8 < arrayList.size() - 1) {
                        nationalMeritGuardianDiscount.addInputView();
                    }
                }
                nationalMeritGuardianDiscount.expand();
            }
        }
    }

    protected void f2(ArrayList arrayList) throws Resources.NotFoundException, NumberFormatException {
        C6420a c6420aL0 = L0();
        if (C6630d.isNotNull(c6420aL0)) {
            ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "152");
            g2(targetUser);
            if (arrayList.size() > 0) {
                NationalMeritPersonDiscount nationalMeritPersonDiscount = c6420aL0.getNationalMeritPersonDiscount();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    HashMap map = (HashMap) arrayList.get(i8);
                    int i9 = Integer.parseInt((String) map.get("INDEX"));
                    nationalMeritPersonDiscount.setCoupon(i8, (String) map.get("VALUE"));
                    for (int i10 = 1; i10 < targetUser.size(); i10++) {
                        DiscountObjectData discountObjectData = targetUser.get(i10);
                        if (i9 == discountObjectData.getIndex()) {
                            nationalMeritPersonDiscount.setTargetIndex(i8, i10, discountObjectData.getIndex());
                        }
                    }
                    nationalMeritPersonDiscount.setEnableTargetSelect(i8, map.containsKey("NATIONAL_MERIT_PERSON_DISCOUNT") && "Y".equals(map.get("NATIONAL_MERIT_PERSON_DISCOUNT")));
                    nationalMeritPersonDiscount.setCheck(true);
                    if (i8 < arrayList.size() - 1) {
                        nationalMeritPersonDiscount.addInputView(getApplicationContext());
                    }
                }
                nationalMeritPersonDiscount.expand();
            }
        }
    }

    @Override // H5.x, G5.a, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    protected void o1() {
        DCCouponListDao dCCouponListDao = new DCCouponListDao();
        DCCouponListDao.DCCouponListRequest dCCouponListRequest = dCCouponListDao.new DCCouponListRequest();
        dCCouponListRequest.setPnr(getPNRNo());
        dCCouponListRequest.setTxtSelPage(String.valueOf(this.f1851q0));
        dCCouponListDao.setRequest(dCCouponListRequest);
        executeDao(dCCouponListDao);
    }

    @Override // H5.x, G5.a, android.view.View.OnClickListener
    public void onClick(View view) {
        t0(view);
        if (AbstractC5955f.btn_payment_bottom1 != view.getId()) {
            super.onClick(view);
            return;
        }
        int iIntValue = ((Integer) this.f1486j0.getTag()).intValue();
        String strU1 = u1();
        if (N.isNotNull(strU1)) {
            C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(strU1).showDialog();
        } else if (1 == iIntValue) {
            N1();
        } else {
            R0();
        }
    }

    @Override // v4.g
    public void onOptionHeaderClick(C6550j c6550j, boolean z8) {
        C6420a c6420aL0 = L0();
        if (z8) {
            if (c6550j instanceof DiscountMemberCoupon) {
                if (C6630d.isNotNull(c6420aL0)) {
                    DiscountMemberCoupon discountMemberCoupon = c6420aL0.getDiscountMemberCoupon();
                    if (discountMemberCoupon.isLoaded()) {
                        discountMemberCoupon.expand();
                        return;
                    } else if (I4.h.getInstance().isNonMember()) {
                        discountMemberCoupon.expand();
                        return;
                    } else {
                        o1();
                        return;
                    }
                }
                return;
            }
            if (c6550j instanceof DelayDiscountCoupon) {
                if (C6630d.isNotNull(c6420aL0)) {
                    DelayDiscountCoupon delayDiscountCoupon = c6420aL0.getDelayDiscountCoupon();
                    if (delayDiscountCoupon.isLoaded()) {
                        delayDiscountCoupon.expand();
                        return;
                    } else if (I4.h.getInstance().isNonMember()) {
                        delayDiscountCoupon.expand();
                        return;
                    } else {
                        s1();
                        return;
                    }
                }
                return;
            }
            if (c6550j instanceof NationalMeritGuardianDiscount) {
                if (C6630d.isNotNull(c6420aL0)) {
                    if (isEnableMeritProtector()) {
                        c6420aL0.getNationalMeritGuardianDiscount().expand();
                        return;
                    } else {
                        C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.dc_merit_message)).showDialog();
                        return;
                    }
                }
                return;
            }
            if (c6550j instanceof DisabledPersonGuardianDiscount) {
                if (C6630d.isNotNull(c6420aL0) && isExistHighDisable()) {
                    c6420aL0.getDisabledPersonGuardianDiscount().expand();
                    return;
                }
                return;
            }
            if ((c6550j instanceof SoldierDiscount) && C6630d.isNotNull(c6420aL0)) {
                c6420aL0.getSoldierDiscount().expand();
            }
        }
    }

    @Override // H5.x, com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_discount_price == id || AbstractC5955f.dao_tc_reservation == id) {
            O1(iBaseDao);
            return;
        }
        if (AbstractC5955f.dao_employee_cert_coupon == id) {
            C6420a c6420aL0 = L0();
            if (C6630d.isNotNull(c6420aL0)) {
                DCCouponCertDao.DCCouponCertRequest dCCouponCertRequest = (DCCouponCertDao.DCCouponCertRequest) ((DCEmployeeCouponCertDao) iBaseDao).getRequest();
                String txtCertNo = dCCouponCertRequest.getTxtCertNo();
                int couponInputViewIndex = dCCouponCertRequest.getCouponInputViewIndex();
                DCCouponListDao.DiscountCoupon discountCoupon = new DCCouponListDao().new DiscountCoupon();
                discountCoupon.setH_cpn_no(txtCertNo);
                this.f1853s0.add(discountCoupon);
                ArrayList<DiscountObjectData> arrayListMakeDiscountCouponEntries = makeDiscountCouponEntries(getApplicationContext(), this.f1853s0);
                BusinessTripCoupon businessTripCoupon = c6420aL0.getBusinessTripCoupon();
                businessTripCoupon.setCouponEntries(couponInputViewIndex, arrayListMakeDiscountCouponEntries);
                businessTripCoupon.selectCoupon(couponInputViewIndex, arrayListMakeDiscountCouponEntries.size() - 2);
                businessTripCoupon.setTargetDropDownSelectorEnable(couponInputViewIndex);
                businessTripCoupon.setAddBtnEnable(couponInputViewIndex);
                ArrayList<DiscountObjectData> targetUser = D.getTargetUser(getApplicationContext(), getJrnyInfoList(), "152");
                z4.t.d("taruser.size : " + targetUser.size());
                if (targetUser.size() == 2) {
                    B0(1);
                    businessTripCoupon.setTargetIndex(0, 1, 0);
                }
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_inquiry_completed)).showDialog();
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_cert_coupon == id) {
            C6420a c6420aL02 = L0();
            if (C6630d.isNotNull(c6420aL02)) {
                DCCouponCertDao.DCCouponCertRequest dCCouponCertRequest2 = (DCCouponCertDao.DCCouponCertRequest) iBaseDao.getRequest();
                int couponInputViewIndex2 = dCCouponCertRequest2.getCouponInputViewIndex();
                DCCouponListDao.DiscountCoupon discountCoupon2 = new DCCouponListDao().new DiscountCoupon();
                discountCoupon2.setH_cpn_no(dCCouponCertRequest2.getTxtCertNo());
                this.f1855u0.add(discountCoupon2);
                ArrayList<DiscountObjectData> arrayListMakeDiscountCouponEntries2 = makeDiscountCouponEntries(getApplicationContext(), this.f1855u0);
                DiscountMemberCoupon discountMemberCoupon = c6420aL02.getDiscountMemberCoupon();
                discountMemberCoupon.updateCouponList(arrayListMakeDiscountCouponEntries2);
                discountMemberCoupon.selectCoupon(couponInputViewIndex2, arrayListMakeDiscountCouponEntries2.size() - 2);
                discountMemberCoupon.setTargetDropDownSelectorEnable(couponInputViewIndex2);
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_inquiry_completed)).showDialog();
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_delay_ticket_add == id) {
            C6420a c6420aL03 = L0();
            if (C6630d.isNotNull(c6420aL03)) {
                DelayTicketAddDao.DelayTicketAddRequest delayTicketAddRequest = (DelayTicketAddDao.DelayTicketAddRequest) iBaseDao.getRequest();
                int delayCouponInputViewIndex = delayTicketAddRequest.getDelayCouponInputViewIndex();
                DelayTicketListDao.DelayCoupon delayCoupon = new DelayTicketListDao().new DelayCoupon();
                delayCoupon.setH_orgtk_wct_no(delayTicketAddRequest.getH_orgtk_wct_no());
                delayCoupon.setH_orgtk_ret_sale_dt(delayTicketAddRequest.getH_orgtk_ret_sale_dt());
                delayCoupon.setH_orgtk_sale_sqno(delayTicketAddRequest.getH_orgtk_sale_sqno());
                delayCoupon.setH_orgtk_ret_pwd(delayTicketAddRequest.getH_orgtk_ret_pwd());
                this.f1857w0.add(delayCoupon);
                ArrayList<DiscountObjectData> arrayListMakeDelayCouponEntries = makeDelayCouponEntries(getApplicationContext(), this.f1857w0);
                DelayDiscountCoupon delayDiscountCoupon = c6420aL03.getDelayDiscountCoupon();
                delayDiscountCoupon.updateCouponList(arrayListMakeDelayCouponEntries);
                delayDiscountCoupon.selectCoupon(delayCouponInputViewIndex, arrayListMakeDelayCouponEntries.size() - 2);
                delayDiscountCoupon.setTargetDropDownSelectorEnable(delayCouponInputViewIndex);
                C6637k.getCDialog(getActivity(), 1001, 1, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.payment_inquiry_completed)).showDialog();
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_cert_merit == id) {
            C6420a c6420aL04 = L0();
            if (C6630d.isNotNull(c6420aL04)) {
                MeritCertDao.MeritCertRequest meritCertRequest = (MeritCertDao.MeritCertRequest) iBaseDao.getRequest();
                MeritCertDao.MeritCertResponse meritCertResponse = (MeritCertDao.MeritCertResponse) iBaseDao.getResponse();
                NationalMeritPersonDiscount nationalMeritPersonDiscount = c6420aL04.getNationalMeritPersonDiscount();
                nationalMeritPersonDiscount.setCoupon(meritCertRequest.getViewIndex(), meritCertResponse.getH_free_disc_cert_no());
                nationalMeritPersonDiscount.setEnableTargetSelect(meritCertRequest.getViewIndex());
                try {
                    C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(String.format(getString(AbstractC5959j.dc_merit_count_message), Integer.valueOf(Integer.parseInt(meritCertResponse.getH_free_psb_tno())), Integer.valueOf(Integer.parseInt(meritCertResponse.getH_free_acm_use_tno())))).showDialog();
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (AbstractC5955f.dao_coupon_list == id) {
            C6420a c6420aL05 = L0();
            if (C6630d.isNotNull(c6420aL05)) {
                this.f1855u0.addAll(((DCCouponListDao.DCCouponListResponse) iBaseDao.getResponse()).getCoupon_infos().getCoupon_info());
                DiscountMemberCoupon discountMemberCoupon2 = c6420aL05.getDiscountMemberCoupon();
                discountMemberCoupon2.setIsCouponListLoaded();
                if (((DCCouponListDao) iBaseDao).isMore()) {
                    this.f1851q0++;
                    o1();
                    return;
                } else {
                    discountMemberCoupon2.updateCouponList(makeDiscountCouponEntries(getApplicationContext(), this.f1855u0));
                    discountMemberCoupon2.expand();
                    return;
                }
            }
            return;
        }
        if (AbstractC5955f.dao_delay_ticket_list == id) {
            C6420a c6420aL06 = L0();
            if (C6630d.isNotNull(c6420aL06)) {
                this.f1857w0.addAll(((DelayTicketListDao.DelayTicketListResponse) iBaseDao.getResponse()).getDisc_infos().getDisc_info());
                DelayDiscountCoupon delayDiscountCoupon2 = c6420aL06.getDelayDiscountCoupon();
                delayDiscountCoupon2.setIsCouponListLoaded();
                delayDiscountCoupon2.updateCouponList(makeDelayCouponEntries(getApplicationContext(), this.f1857w0));
                delayDiscountCoupon2.expand();
                return;
            }
            return;
        }
        if (AbstractC5955f.dao_cert_congressperson == id) {
            C6420a c6420aL07 = L0();
            if (C6630d.isNotNull(c6420aL07)) {
                CongresspersonCertDao.CongresspersonCertRequest congresspersonCertRequest = (CongresspersonCertDao.CongresspersonCertRequest) iBaseDao.getRequest();
                CongresspersonCertDao.CongresspersonCertResponse congresspersonCertResponse = (CongresspersonCertDao.CongresspersonCertResponse) iBaseDao.getResponse();
                CongresspersonDiscountOption congresspersonDiscountOption = c6420aL07.getCongresspersonDiscountOption();
                congresspersonDiscountOption.setCoupon(congresspersonCertRequest.getViewIndex(), congresspersonCertResponse.getfreeDiscCertNo());
                congresspersonDiscountOption.setEnableTargetSelect(congresspersonCertRequest.getViewIndex());
            }
        }
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        if (AbstractC5955f.dao_tc_cancel == iBaseDao.getId()) {
            S0();
        }
    }

    @Override // H5.x, com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C6630d.isNull(bundle)) {
            W1();
        }
    }

    protected void s1() {
        DelayTicketListDao delayTicketListDao = new DelayTicketListDao();
        DelayTicketListDao.DelayTicketListRequest delayTicketListRequest = delayTicketListDao.new DelayTicketListRequest();
        delayTicketListRequest.setDptDtTo(getJrnyInfo().getH_dpt_dt());
        delayTicketListDao.setRequest(delayTicketListRequest);
        executeDao(delayTicketListDao);
    }

    abstract String u1();

    @Override // H5.x, G5.a
    protected void y0() {
        super.y0();
        j2();
    }
}
