package G5;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.korail.talk.data.DiscountObjectData;
import com.korail.talk.network.dao.pass.CommPaymentDao;
import com.korail.talk.network.dao.pass.PassPaymentDao;
import com.korail.talk.network.dao.passCard.DCCouponListDao;
import com.korail.talk.network.dao.passCard.DelayTicketListDao;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.i;
import r4.j;
import u6.C6420a;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class a extends com.korail.talk.view.base.a implements ViewTreeObserver.OnGlobalLayoutListener, F5.a, View.OnClickListener {

    /* renamed from: d0, reason: collision with root package name */
    private F5.a f1480d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f1481e0;

    /* renamed from: f0, reason: collision with root package name */
    protected ScrollView f1482f0;

    /* renamed from: g0, reason: collision with root package name */
    protected TextView f1483g0;

    /* renamed from: h0, reason: collision with root package name */
    protected TextView f1484h0;

    /* renamed from: i0, reason: collision with root package name */
    protected Button f1485i0;

    /* renamed from: j0, reason: collision with root package name */
    protected Button f1486j0;
    public final int NEXT = 0;
    public final int ADD_DISCOUNT = 1;
    public final int ISSUE = 2;
    public final int PAYMENT = 3;

    /* renamed from: G5.a$a, reason: collision with other inner class name */
    class C0033a extends Animation {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1488b;

        C0033a(View view, int i8) {
            this.f1487a = view;
            this.f1488b = i8;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f8, Transformation transformation) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1487a.getLayoutParams();
            layoutParams.bottomMargin = (int) (this.f1488b * f8);
            this.f1487a.setLayoutParams(layoutParams);
        }
    }

    private void A0() {
        getView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f1485i0.setOnClickListener(this);
        this.f1486j0.setOnClickListener(this);
    }

    private void C0() {
        this.f1482f0 = (ScrollView) p0(AbstractC5955f.sv_payment);
        this.f1483g0 = (TextView) p0(AbstractC5955f.tv_payment_count);
        this.f1484h0 = (TextView) p0(AbstractC5955f.tv_payment_amount);
        this.f1485i0 = (Button) p0(AbstractC5955f.btn_payment_bottom0);
        this.f1486j0 = (Button) p0(AbstractC5955f.btn_payment_bottom1);
    }

    private void w0() {
        this.f1483g0.setText(String.format(getString(AbstractC5959j.payment_payment_amount), Integer.valueOf(getSelectedItemCount())));
        this.f1485i0.setVisibility(isOnlyPayment() ? 8 : 0);
    }

    private void x0(ViewGroup viewGroup, ViewParent viewParent, View view, Point point) {
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        point.x += view.getLeft();
        point.y += view.getTop();
        if (viewGroup2.equals(viewGroup)) {
            return;
        }
        x0(viewGroup, viewGroup2.getParent(), viewGroup2, point);
    }

    protected void B0(int i8) {
        String string = getString(AbstractC5959j.common_next);
        if (i8 == 0) {
            string = getString(AbstractC5959j.common_next);
        } else if (i8 == 1) {
            string = getString(AbstractC5959j.payment_apply_add_discount);
        } else if (i8 == 2) {
            string = getString(AbstractC5959j.payment_reservation_issue);
        } else if (i8 == 3) {
            string = getString(AbstractC5959j.payment_reservation_payment_issue);
        }
        this.f1486j0.setTag(Integer.valueOf(i8));
        this.f1486j0.setText(string);
    }

    @Override // F5.a
    public boolean disableDiscountPoint() {
        return this.f1480d0.disableDiscountPoint();
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // F5.a
    public int getDiscountAmount() {
        return this.f1480d0.getDiscountAmount();
    }

    @Override // F5.a
    public IPaymentRequest getIPaymentRequest() {
        return this.f1480d0.getIPaymentRequest();
    }

    @Override // F5.a
    public String getJrnyCnt() {
        return this.f1480d0.getJrnyCnt();
    }

    @Override // F5.a
    public ReservationResponse.JrnyInfo getJrnyInfo() {
        return this.f1480d0.getJrnyInfo();
    }

    @Override // F5.a
    public List<ReservationResponse.JrnyInfo> getJrnyInfoList() {
        return this.f1480d0.getJrnyInfoList();
    }

    @Override // F5.a
    public String getPNRNo() {
        return this.f1480d0.getPNRNo();
    }

    @Override // F5.a
    public i getPaymentType() {
        return this.f1480d0.getPaymentType();
    }

    @Override // F5.a
    public int getReceivedAmount() {
        return this.f1480d0.getReceivedAmount();
    }

    @Override // F5.a
    public ReservationResponse getReservationResponse() {
        return this.f1480d0.getReservationResponse();
    }

    @Override // F5.a
    public j getReservedTicketType() {
        return this.f1480d0.getReservedTicketType();
    }

    @Override // F5.a
    public int getSelectedItemCount() {
        return this.f1480d0.getSelectedItemCount();
    }

    @Override // F5.a
    public boolean isCommPaymentRequest() {
        return getIPaymentRequest() instanceof CommPaymentDao.CommPaymentRequest;
    }

    @Override // F5.a
    public boolean isEnableMeritProtector() {
        return this.f1480d0.isEnableMeritProtector();
    }

    @Override // F5.a
    public boolean isEnableTarget(C6420a c6420a, int i8) {
        return this.f1480d0.isEnableTarget(c6420a, i8);
    }

    @Override // F5.a
    public boolean isExistHighDisable() {
        return this.f1480d0.isExistHighDisable();
    }

    @Override // F5.a
    public boolean isIntgStlRequest() {
        return getIPaymentRequest() instanceof IntgStlDao.IntgStlRequest;
    }

    @Override // F5.a
    public boolean isOnlyPayment() {
        return this.f1480d0.isOnlyPayment();
    }

    @Override // F5.a
    public boolean isPassPaymentRequest() {
        return getIPaymentRequest() instanceof PassPaymentDao.PassPaymentRequest;
    }

    @Override // F5.a
    public boolean isReservationHistory() {
        return this.f1480d0.isReservationHistory();
    }

    @Override // F5.a
    public boolean isReservationResponseNull() {
        return this.f1480d0.isReservationResponseNull();
    }

    @Override // F5.a
    public boolean isRsvPaymentRequest() {
        return getIPaymentRequest() instanceof RsvPaymentDao.RsvPaymentRequest;
    }

    @Override // F5.a
    public boolean isTravelPackages() {
        return this.f1480d0.isTravelPackages();
    }

    @Override // F5.a
    public ArrayList<DiscountObjectData> makeDelayCouponEntries(Context context, List<DelayTicketListDao.DelayCoupon> list) {
        return this.f1480d0.makeDelayCouponEntries(context, list);
    }

    @Override // F5.a
    public ArrayList<DiscountObjectData> makeDiscountCouponEntries(Context context, List<DCCouponListDao.DiscountCoupon> list) {
        return this.f1480d0.makeDiscountCouponEntries(context, list);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            C0();
            A0();
            w0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f1480d0 = (F5.a) context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (isAdded()) {
            boolean z8 = ((double) (getView().getRootView().getHeight() - getView().getHeight())) > ((double) getView().getRootView().getHeight()) / 2.5d;
            if (this.f1481e0 != z8) {
                this.f1481e0 = z8;
                View viewP0 = p0(AbstractC5955f.v_payment_animation);
                C0033a c0033a = new C0033a(viewP0, z8 ? -p0(AbstractC5955f.v_payment_bottom).getHeight() : 0);
                c0033a.setAnimationListener(new b());
                c0033a.setDuration(400L);
                viewP0.startAnimation(c0033a);
            }
        }
    }

    @Override // F5.a
    public void setIPaymentRequest(IPaymentRequest iPaymentRequest) {
        this.f1480d0.setIPaymentRequest(iPaymentRequest);
    }

    @Override // F5.a
    public void setReservationResponse(ReservationResponse reservationResponse) {
        this.f1480d0.setReservationResponse(reservationResponse);
    }

    protected void y0() {
        this.f1484h0.setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(getReceivedAmount())));
    }

    protected void z0(View view) {
        Point point = new Point();
        x0(this.f1482f0, view.getParent(), view, point);
        this.f1482f0.smoothScrollTo(0, point.y);
    }

    class b implements Animation.AnimationListener {
        b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C6630d.isNull(a.this.getView())) {
                return;
            }
            a.this.getView().getViewTreeObserver().addOnGlobalLayoutListener(a.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (C6630d.isNull(a.this.getView())) {
                return;
            }
            a.this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(a.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
