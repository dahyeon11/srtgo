package u6;

import I4.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.korail.talk.view.payment.discount.sub.BusinessTripCoupon;
import com.korail.talk.view.payment.discount.sub.CongresspersonDiscountOption;
import com.korail.talk.view.payment.discount.sub.DelayDiscountCoupon;
import com.korail.talk.view.payment.discount.sub.DisabledPersonGuardianDiscount;
import com.korail.talk.view.payment.discount.sub.DiscountMemberCoupon;
import com.korail.talk.view.payment.discount.sub.NationalMeritGuardianDiscount;
import com.korail.talk.view.payment.discount.sub.NationalMeritPersonDiscount;
import com.korail.talk.view.payment.discount.sub.SoldierDiscount;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import y6.C6542b;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6420a extends C6542b {

    /* renamed from: a, reason: collision with root package name */
    private BusinessTripCoupon f37149a;

    /* renamed from: b, reason: collision with root package name */
    private DiscountMemberCoupon f37150b;

    /* renamed from: c, reason: collision with root package name */
    private DelayDiscountCoupon f37151c;

    /* renamed from: d, reason: collision with root package name */
    private NationalMeritPersonDiscount f37152d;

    /* renamed from: e, reason: collision with root package name */
    private NationalMeritGuardianDiscount f37153e;

    /* renamed from: f, reason: collision with root package name */
    private CongresspersonDiscountOption f37154f;

    /* renamed from: g, reason: collision with root package name */
    private DisabledPersonGuardianDiscount f37155g;

    /* renamed from: h, reason: collision with root package name */
    private SoldierDiscount f37156h;

    public C6420a(Context context) {
        super(context);
        g();
    }

    private void g() {
        View.inflate(getContext(), AbstractC5957h.view_add_discount, this);
        this.f37149a = (BusinessTripCoupon) findViewById(AbstractC5955f.businessTripCoupon);
        this.f37150b = (DiscountMemberCoupon) findViewById(AbstractC5955f.discountMemberCoupon);
        this.f37151c = (DelayDiscountCoupon) findViewById(AbstractC5955f.delayDiscountCoupon);
        this.f37152d = (NationalMeritPersonDiscount) findViewById(AbstractC5955f.nationalMeritPersonDiscount);
        this.f37153e = (NationalMeritGuardianDiscount) findViewById(AbstractC5955f.nationalMeritGuardianDiscount);
        this.f37154f = (CongresspersonDiscountOption) findViewById(AbstractC5955f.congresspersonDiscountOption);
        this.f37155g = (DisabledPersonGuardianDiscount) findViewById(AbstractC5955f.disabledPersonGuardianDiscount);
        this.f37156h = (SoldierDiscount) findViewById(AbstractC5955f.soldierDiscount);
        this.f37151c.setVisibility(8);
        h hVar = h.getInstance();
        this.f37154f.setVisibility(hVar.isDeffMember() ? 0 : 8);
        this.f37149a.setVisibility(hVar.isEmployee() ? 0 : 8);
        this.f37156h.setVisibility(hVar.isNonMember() ? 8 : 0);
    }

    public BusinessTripCoupon getBusinessTripCoupon() {
        return this.f37149a;
    }

    public CongresspersonDiscountOption getCongresspersonDiscountOption() {
        return this.f37154f;
    }

    public DelayDiscountCoupon getDelayDiscountCoupon() {
        return this.f37151c;
    }

    public DisabledPersonGuardianDiscount getDisabledPersonGuardianDiscount() {
        return this.f37155g;
    }

    public DiscountMemberCoupon getDiscountMemberCoupon() {
        return this.f37150b;
    }

    public NationalMeritGuardianDiscount getNationalMeritGuardianDiscount() {
        return this.f37153e;
    }

    public NationalMeritPersonDiscount getNationalMeritPersonDiscount() {
        return this.f37152d;
    }

    public SoldierDiscount getSoldierDiscount() {
        return this.f37156h;
    }

    public C6420a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
