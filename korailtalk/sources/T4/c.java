package T4;

import Q7.X;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.korail.talk.ui.booking.option.passenger.PassengerPicker;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.c;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public abstract class c extends C6550j implements View.OnClickListener {
    public static final int ADULT_INDEX = 0;
    public static final int CHILDREN_ACCOMPANY_INDEX = 2;
    public static final int CHILDREN_INDEX = 1;
    public static final int GUIDE_DOG_INDEX = 6;
    public static final int HIGH_DISABLE_INDEX = 4;
    public static final int LOW_DISABLE_INDEX = 5;
    public static final int SENIOR_INDEX = 3;
    public static final int TEENAGER_INDEX = 7;

    /* renamed from: A, reason: collision with root package name */
    private TextView f4859A;

    /* renamed from: B, reason: collision with root package name */
    protected TextView f4860B;

    /* renamed from: C, reason: collision with root package name */
    protected TextView f4861C;

    /* renamed from: D, reason: collision with root package name */
    protected View[] f4862D;

    /* renamed from: E, reason: collision with root package name */
    private final c.a f4863E;

    /* renamed from: f, reason: collision with root package name */
    private final int f4864f;

    /* renamed from: g, reason: collision with root package name */
    protected int f4865g;

    /* renamed from: h, reason: collision with root package name */
    protected int f4866h;

    /* renamed from: i, reason: collision with root package name */
    protected int f4867i;

    /* renamed from: j, reason: collision with root package name */
    protected int f4868j;

    /* renamed from: k, reason: collision with root package name */
    protected int f4869k;

    /* renamed from: l, reason: collision with root package name */
    protected int f4870l;

    /* renamed from: m, reason: collision with root package name */
    protected int f4871m;

    /* renamed from: n, reason: collision with root package name */
    protected int f4872n;

    /* renamed from: o, reason: collision with root package name */
    protected int[] f4873o;

    /* renamed from: p, reason: collision with root package name */
    protected int[] f4874p;

    /* renamed from: q, reason: collision with root package name */
    protected int[] f4875q;

    /* renamed from: r, reason: collision with root package name */
    protected int[] f4876r;

    /* renamed from: s, reason: collision with root package name */
    protected int[] f4877s;

    /* renamed from: t, reason: collision with root package name */
    protected int[] f4878t;

    /* renamed from: u, reason: collision with root package name */
    protected int[] f4879u;

    /* renamed from: v, reason: collision with root package name */
    protected int[] f4880v;

    /* renamed from: w, reason: collision with root package name */
    protected int f4881w;

    /* renamed from: x, reason: collision with root package name */
    protected int f4882x;

    /* renamed from: y, reason: collision with root package name */
    protected Bundle f4883y;

    /* renamed from: z, reason: collision with root package name */
    protected a f4884z;

    public interface a {
        void onChangePersonInfo(Bundle bundle, int i8, String str);
    }

    public c(Context context) throws Resources.NotFoundException {
        super(context);
        this.f4864f = 9;
        this.f4873o = new int[]{0, 9};
        this.f4874p = new int[]{0, 9};
        this.f4875q = new int[]{0, 9};
        this.f4876r = new int[]{0, 9};
        this.f4877s = new int[]{0, 9};
        this.f4878t = new int[]{0, 9};
        this.f4879u = new int[]{0, 9};
        this.f4880v = new int[]{0, 9};
        this.f4863E = new c.a() { // from class: T4.b
            @Override // v4.c.a
            public final void onCustomClick(View view, int i8) {
                this.f4858a.t(view, i8);
            }
        };
        g();
    }

    private void A() {
        x();
        y();
    }

    private void B() {
        z();
        j();
    }

    private void C(boolean z8, int i8) {
        int i9;
        if (z8) {
            if (r(i8)) {
                return;
            }
        } else if (q(i8)) {
            return;
        }
        switch (i8) {
            case 0:
                i9 = z8 ? this.f4865g + 1 : this.f4865g - 1;
                this.f4865g = i9;
                break;
            case 1:
                i9 = z8 ? this.f4867i + 1 : this.f4867i - 1;
                this.f4867i = i9;
                break;
            case 2:
                i9 = z8 ? this.f4868j + 1 : this.f4868j - 1;
                this.f4868j = i9;
                break;
            case 3:
                i9 = z8 ? this.f4869k + 1 : this.f4869k - 1;
                this.f4869k = i9;
                break;
            case 4:
                i9 = z8 ? this.f4870l + 1 : this.f4870l - 1;
                this.f4870l = i9;
                break;
            case 5:
                i9 = z8 ? this.f4871m + 1 : this.f4871m - 1;
                this.f4871m = i9;
                break;
            case 6:
                i9 = z8 ? this.f4872n + 1 : this.f4872n - 1;
                this.f4872n = i9;
                break;
            case 7:
                i9 = z8 ? this.f4866h + 1 : this.f4866h - 1;
                this.f4866h = i9;
                break;
            default:
                i9 = 0;
                break;
        }
        k(i8).setValue(String.valueOf(i9));
        j();
        x();
        String strL = l(i8);
        if (C6630d.isNotNull(this.f4884z)) {
            this.f4884z.onChangePersonInfo(getPassengerInfo(), i8, strL);
        }
    }

    private void D() {
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC5955f.counterContainer);
        this.f4862D = new View[viewGroup.getChildCount()];
        int i8 = 0;
        while (true) {
            View[] viewArr = this.f4862D;
            if (i8 >= viewArr.length) {
                View viewFindViewById = findViewById(AbstractC5955f.headerView);
                this.f4859A = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerTitleTxt);
                this.f4860B = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerVal0Txt);
                this.f4861C = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerHint1Txt);
                setAutoExpand(true);
                return;
            }
            viewArr[i8] = viewGroup.getChildAt(i8);
            i8++;
        }
    }

    private void g() throws Resources.NotFoundException {
        View.inflate(getContext(), AbstractC5957h.passenger_age_seat_count_option, this);
        D();
        setText();
        u();
    }

    private void j() {
        PassengerPicker passengerPickerK = k(0);
        passengerPickerK.setMinusEnabled(n(this.f4865g, this.f4873o));
        passengerPickerK.setPlusEnabled(o(this.f4865g, this.f4873o));
        PassengerPicker passengerPickerK2 = k(7);
        passengerPickerK2.setMinusEnabled(n(this.f4866h, this.f4874p));
        passengerPickerK2.setPlusEnabled(o(this.f4866h, this.f4874p));
        PassengerPicker passengerPickerK3 = k(1);
        passengerPickerK3.setMinusEnabled(n(this.f4867i, this.f4875q));
        passengerPickerK3.setPlusEnabled(o(this.f4867i, this.f4875q));
        PassengerPicker passengerPickerK4 = k(2);
        passengerPickerK4.setMinusEnabled(n(this.f4868j, this.f4876r));
        passengerPickerK4.setPlusEnabled(o(this.f4868j, this.f4876r));
        PassengerPicker passengerPickerK5 = k(3);
        passengerPickerK5.setMinusEnabled(n(this.f4869k, this.f4877s));
        passengerPickerK5.setPlusEnabled(o(this.f4869k, this.f4877s));
        PassengerPicker passengerPickerK6 = k(4);
        passengerPickerK6.setMinusEnabled(n(this.f4870l, this.f4878t));
        passengerPickerK6.setPlusEnabled(o(this.f4870l, this.f4878t));
        PassengerPicker passengerPickerK7 = k(5);
        passengerPickerK7.setMinusEnabled(n(this.f4871m, this.f4879u));
        passengerPickerK7.setPlusEnabled(o(this.f4871m, this.f4879u));
        PassengerPicker passengerPickerK8 = k(6);
        passengerPickerK8.setMinusEnabled(n(this.f4872n, this.f4880v));
        passengerPickerK8.setPlusEnabled(o(this.f4872n, this.f4880v));
    }

    private boolean n(int i8, int[] iArr) {
        return i8 > iArr[0] && i8 <= iArr[1] && getTotalCount() > this.f4882x;
    }

    private boolean o(int i8, int[] iArr) {
        return i8 >= iArr[0] && i8 < iArr[1] && getTotalCount() < this.f4881w;
    }

    private void setText() {
        this.f4859A.setText(b(AbstractC5959j.booking_passengers_and_seats_count));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view, int i8) {
        C(view.getId() == AbstractC5955f.plusBtn, i8);
    }

    private void u() throws Resources.NotFoundException {
        findViewById(AbstractC5955f.headerTitleTxt).setOnClickListener(this);
        String[] stringArray = getResources().getStringArray(AbstractC5952c.passenger_type);
        int i8 = 0;
        while (true) {
            View[] viewArr = this.f4862D;
            if (i8 >= viewArr.length) {
                return;
            }
            ((TextView) viewArr[i8].findViewById(AbstractC5955f.titleTxt)).setText(stringArray[i8]);
            PassengerPicker passengerPickerK = k(i8);
            passengerPickerK.setMinusEventListener(new v4.c(this.f4863E, i8));
            passengerPickerK.setMinusDescription(stringArray[i8] + b(AbstractC5959j.booking_desc));
            passengerPickerK.setPlusEventListener(new v4.c(this.f4863E, i8));
            passengerPickerK.setPlusDescription(stringArray[i8] + b(AbstractC5959j.booking_inc));
            i8++;
        }
    }

    private void z() {
        int i8;
        for (int i9 = 0; i9 < this.f4862D.length; i9++) {
            switch (i9) {
                case 0:
                    i8 = this.f4865g;
                    break;
                case 1:
                    i8 = this.f4867i;
                    break;
                case 2:
                    i8 = this.f4868j;
                    break;
                case 3:
                    i8 = this.f4869k;
                    break;
                case 4:
                    i8 = this.f4870l;
                    break;
                case 5:
                    i8 = this.f4871m;
                    break;
                case 6:
                    i8 = this.f4872n;
                    break;
                case 7:
                    i8 = this.f4866h;
                    break;
                default:
                    i8 = 0;
                    break;
            }
            PassengerPicker passengerPickerK = k(i9);
            passengerPickerK.setValue(String.valueOf(i8));
            passengerPickerK.setMinusEnabled(i8 > 0);
        }
    }

    public Bundle getPassengerInfo() {
        Bundle bundle = new Bundle();
        bundle.putInt("TEENAGER_COUNT", this.f4866h);
        bundle.putInt("ADULT_COUNT", this.f4865g);
        bundle.putInt("CHILD_COUNT", this.f4867i);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", this.f4868j);
        bundle.putInt("SENIOR_COUNT", this.f4869k);
        bundle.putInt("HIGH_DISABLE_COUNT", this.f4870l);
        bundle.putInt("LOW_DISABLE_COUNT", this.f4871m);
        bundle.putInt("GUIDE_DOG_COUNT", this.f4872n);
        bundle.putInt("TOTAL_PERSON_COUNT", this.f4866h + this.f4865g + this.f4867i + this.f4868j + this.f4869k + this.f4870l + this.f4871m + this.f4872n);
        return bundle;
    }

    public int getTotalCount() {
        return this.f4865g + this.f4866h + this.f4867i + this.f4868j + this.f4869k + this.f4870l + this.f4871m + this.f4872n;
    }

    public String getTotalPassengerText() throws Resources.NotFoundException {
        if (getTotalCount() != 1) {
            return c(AbstractC5959j.booking_total_count, Integer.valueOf(getTotalCount()));
        }
        String[] stringArray = getResources().getStringArray(AbstractC5952c.passenger_type);
        if (this.f4865g == 1) {
            return stringArray[0] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4866h == 1) {
            return stringArray[7] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4867i == 1) {
            return stringArray[1] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4868j == 1) {
            return stringArray[2] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4869k == 1) {
            return stringArray[3] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4870l == 1) {
            return stringArray[4] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4871m == 1) {
            return stringArray[5] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4872n != 1) {
            return "";
        }
        return stringArray[6] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
    }

    protected PassengerPicker k(int i8) {
        return (PassengerPicker) this.f4862D[i8].findViewById(AbstractC5955f.countPicker);
    }

    protected String l(int i8) {
        return N.getText((TextView) this.f4862D[i8].findViewById(AbstractC5955f.titleTxt));
    }

    protected void m() {
        this.f4865g = 0;
        this.f4866h = 0;
        this.f4867i = 0;
        this.f4868j = 0;
        this.f4869k = 0;
        this.f4870l = 0;
        this.f4871m = 0;
        this.f4872n = 0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.headerTitleTxt == view.getId()) {
            C6637k.getDialog(8, getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).showDialog();
        }
    }

    protected boolean p() {
        return true;
    }

    protected boolean q(int i8) {
        boolean z8;
        if (!p()) {
            return false;
        }
        if (i8 == 2 || i8 == 3 || i8 == 7) {
            z8 = false;
        } else if (s()) {
            if (this.f4868j / 2.0d > ((((this.f4865g + this.f4866h) + this.f4869k) + this.f4870l) + this.f4871m) - 1) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning2)).showDialog();
                z8 = true;
            }
            z8 = false;
        } else {
            if (this.f4868j > 0 && 1 == this.f4865g + this.f4866h + this.f4869k + this.f4870l + this.f4871m) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning1)).showDialog();
                z8 = true;
            }
            z8 = false;
        }
        if (6 != i8) {
            if ((4 == i8 || 5 == i8) && this.f4872n >= this.f4870l + this.f4871m) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_guide_dog_warning)).showDialog();
                return true;
            }
            return z8;
        }
        if (this.f4870l + this.f4871m == 0) {
            C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_guide_dog_warning)).showDialog();
            return true;
        }
        this.f4881w = 9;
        j();
        x();
        y();
        return z8;
    }

    protected boolean r(int i8) {
        boolean z8;
        if (!p()) {
            return false;
        }
        if (2 != i8) {
            z8 = false;
        } else if (s()) {
            if ((this.f4868j + 1) / 2.0d > this.f4865g + this.f4866h + this.f4869k + this.f4870l + this.f4871m) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning2)).showDialog();
                z8 = true;
            }
            z8 = false;
        } else {
            if (this.f4865g + this.f4866h + this.f4869k + this.f4870l + this.f4871m == 0) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning1)).showDialog();
                z8 = true;
            }
            z8 = false;
        }
        if (6 == i8) {
            int i9 = this.f4870l;
            int i10 = this.f4871m;
            if (i9 + i10 == 0 || this.f4872n >= i9 + i10) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_guide_dog_warning)).showDialog();
                return true;
            }
        }
        return z8;
    }

    protected boolean s() {
        return false;
    }

    public void setGuideDogView(boolean z8) {
        if (!z8) {
            this.f4881w = 9;
            Bundle passengerInfo = getPassengerInfo();
            passengerInfo.putInt("GUIDE_DOG_COUNT", 0);
            updatePassengerData(passengerInfo);
        }
        this.f4862D[6].setVisibility(z8 ? 0 : 8);
    }

    public void setOnChangePersonInfoListener(a aVar) {
        this.f4884z = aVar;
    }

    public void updatePassengerData(Bundle bundle) {
        this.f4883y = bundle;
        v();
    }

    protected void v() {
        w();
        B();
        A();
    }

    protected abstract void w();

    protected void x() {
        this.f4860B.setText(c(AbstractC5959j.booking_total_count, Integer.valueOf(getTotalCount())));
    }

    public int getPassengerInfo(int i8) {
        if (i8 == 0) {
            return this.f4865g;
        }
        if (7 == i8) {
            return this.f4866h;
        }
        if (1 == i8) {
            return this.f4867i;
        }
        if (2 == i8) {
            return this.f4868j;
        }
        if (3 == i8) {
            return this.f4869k;
        }
        if (4 == i8) {
            return this.f4870l;
        }
        if (5 == i8) {
            return this.f4871m;
        }
        if (6 == i8) {
            return this.f4872n;
        }
        return 0;
    }

    protected void y() {
    }
}
