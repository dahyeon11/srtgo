package T4;

import Q7.X;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.korail.talk.ui.booking.option.passenger.PassengerPicker;
import com.korail.talk.view.CTextView;
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
public class i extends C6550j implements View.OnClickListener {
    public static final int ADULT_INDEX = 0;
    public static final int CHILDREN_ACCOMPANY_INDEX = 2;
    public static final int CHILDREN_INDEX = 1;
    public static final int GUIDE_DOG_INDEX = 6;
    public static final int HIGH_DISABLE_INDEX = 4;
    public static final int LOW_DISABLE_INDEX = 5;
    public static final int SENIOR_INDEX = 3;
    public static final int TEENAGER_INDEX = 7;

    /* renamed from: A, reason: collision with root package name */
    protected View[] f4888A;

    /* renamed from: B, reason: collision with root package name */
    private final c.a f4889B;

    /* renamed from: f, reason: collision with root package name */
    private final int f4890f;

    /* renamed from: g, reason: collision with root package name */
    protected int f4891g;

    /* renamed from: h, reason: collision with root package name */
    protected int f4892h;

    /* renamed from: i, reason: collision with root package name */
    protected int f4893i;

    /* renamed from: j, reason: collision with root package name */
    protected int f4894j;

    /* renamed from: k, reason: collision with root package name */
    protected int f4895k;

    /* renamed from: l, reason: collision with root package name */
    protected int f4896l;

    /* renamed from: m, reason: collision with root package name */
    protected int f4897m;

    /* renamed from: n, reason: collision with root package name */
    protected int f4898n;

    /* renamed from: o, reason: collision with root package name */
    protected int[] f4899o;

    /* renamed from: p, reason: collision with root package name */
    protected int[] f4900p;

    /* renamed from: q, reason: collision with root package name */
    protected int[] f4901q;

    /* renamed from: r, reason: collision with root package name */
    protected int[] f4902r;

    /* renamed from: s, reason: collision with root package name */
    protected int[] f4903s;

    /* renamed from: t, reason: collision with root package name */
    protected int[] f4904t;

    /* renamed from: u, reason: collision with root package name */
    protected int[] f4905u;

    /* renamed from: v, reason: collision with root package name */
    protected int[] f4906v;

    /* renamed from: w, reason: collision with root package name */
    protected int f4907w;

    /* renamed from: x, reason: collision with root package name */
    protected int f4908x;

    /* renamed from: y, reason: collision with root package name */
    protected Bundle f4909y;

    /* renamed from: z, reason: collision with root package name */
    protected a f4910z;

    public interface a {
        void onChangePersonInfo(Bundle bundle, int i8, String str);
    }

    public i(Context context) throws Resources.NotFoundException {
        super(context);
        this.f4890f = 9;
        this.f4899o = new int[]{0, 9};
        this.f4900p = new int[]{0, 9};
        this.f4901q = new int[]{0, 9};
        this.f4902r = new int[]{0, 9};
        this.f4903s = new int[]{0, 9};
        this.f4904t = new int[]{0, 9};
        this.f4905u = new int[]{0, 9};
        this.f4906v = new int[]{0, 9};
        this.f4889B = new c.a() { // from class: T4.h
            @Override // v4.c.a
            public final void onCustomClick(View view, int i8) {
                this.f4887a.t(view, i8);
            }
        };
        g();
    }

    private void A(boolean z8, int i8) {
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
                i9 = z8 ? this.f4891g + 1 : this.f4891g - 1;
                this.f4891g = i9;
                break;
            case 1:
                i9 = z8 ? this.f4893i + 1 : this.f4893i - 1;
                this.f4893i = i9;
                break;
            case 2:
                i9 = z8 ? this.f4894j + 1 : this.f4894j - 1;
                this.f4894j = i9;
                break;
            case 3:
                i9 = z8 ? this.f4895k + 1 : this.f4895k - 1;
                this.f4895k = i9;
                break;
            case 4:
                i9 = z8 ? this.f4896l + 1 : this.f4896l - 1;
                this.f4896l = i9;
                break;
            case 5:
                i9 = z8 ? this.f4897m + 1 : this.f4897m - 1;
                this.f4897m = i9;
                break;
            case 6:
                i9 = z8 ? this.f4898n + 1 : this.f4898n - 1;
                this.f4898n = i9;
                break;
            case 7:
                i9 = z8 ? this.f4892h + 1 : this.f4892h - 1;
                this.f4892h = i9;
                break;
            default:
                i9 = 0;
                break;
        }
        k(i8).setValue(String.valueOf(i9));
        j();
        String strL = l(i8);
        if (C6630d.isNotNull(this.f4910z)) {
            this.f4910z.onChangePersonInfo(getPassengerInfo(), i8, strL);
        }
    }

    private void B() {
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC5955f.counterContainer);
        this.f4888A = new View[viewGroup.getChildCount()];
        int i8 = 0;
        while (true) {
            View[] viewArr = this.f4888A;
            if (i8 >= viewArr.length) {
                return;
            }
            viewArr[i8] = viewGroup.getChildAt(i8);
            i8++;
        }
    }

    private void g() throws Resources.NotFoundException {
        View.inflate(getContext(), AbstractC5957h.passenger_age_seat_count_option_maas, this);
        B();
        u();
    }

    private void j() {
        PassengerPicker passengerPickerK = k(0);
        passengerPickerK.setMinusEnabled(n(this.f4891g, this.f4899o));
        passengerPickerK.setPlusEnabled(o(this.f4891g, this.f4899o));
        PassengerPicker passengerPickerK2 = k(7);
        passengerPickerK2.setMinusEnabled(n(this.f4892h, this.f4900p));
        passengerPickerK2.setPlusEnabled(o(this.f4892h, this.f4900p));
        PassengerPicker passengerPickerK3 = k(1);
        passengerPickerK3.setMinusEnabled(n(this.f4893i, this.f4901q));
        passengerPickerK3.setPlusEnabled(o(this.f4893i, this.f4901q));
        PassengerPicker passengerPickerK4 = k(2);
        passengerPickerK4.setMinusEnabled(n(this.f4894j, this.f4902r));
        passengerPickerK4.setPlusEnabled(o(this.f4894j, this.f4902r));
        PassengerPicker passengerPickerK5 = k(3);
        passengerPickerK5.setMinusEnabled(n(this.f4895k, this.f4903s));
        passengerPickerK5.setPlusEnabled(o(this.f4895k, this.f4903s));
        PassengerPicker passengerPickerK6 = k(4);
        passengerPickerK6.setMinusEnabled(n(this.f4896l, this.f4904t));
        passengerPickerK6.setPlusEnabled(o(this.f4896l, this.f4904t));
        PassengerPicker passengerPickerK7 = k(5);
        passengerPickerK7.setMinusEnabled(n(this.f4897m, this.f4905u));
        passengerPickerK7.setPlusEnabled(o(this.f4897m, this.f4905u));
        PassengerPicker passengerPickerK8 = k(6);
        passengerPickerK8.setMinusEnabled(n(this.f4898n, this.f4906v));
        passengerPickerK8.setPlusEnabled(o(this.f4898n, this.f4906v));
    }

    private void m(Bundle bundle) throws Resources.NotFoundException {
        g();
        setData(bundle);
        v();
    }

    private boolean n(int i8, int[] iArr) {
        return i8 > iArr[0] && i8 <= iArr[1] && getTotalCount() > this.f4908x;
    }

    private boolean o(int i8, int[] iArr) {
        return i8 >= iArr[0] && i8 < iArr[1] && getTotalCount() < this.f4907w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view, int i8) {
        A(view.getId() == AbstractC5955f.plusBtn, i8);
    }

    private void u() throws Resources.NotFoundException {
        String[] stringArray = getResources().getStringArray(AbstractC5952c.passenger_type);
        String[] stringArray2 = getResources().getStringArray(AbstractC5952c.passenger_info);
        String[] stringArray3 = getResources().getStringArray(AbstractC5952c.passenger_extra);
        int i8 = 0;
        while (true) {
            View[] viewArr = this.f4888A;
            if (i8 >= viewArr.length) {
                return;
            }
            View view = viewArr[i8];
            TextView textView = (TextView) view.findViewById(AbstractC5955f.titleTxt);
            TextView textView2 = (TextView) view.findViewById(AbstractC5955f.infoTxt);
            TextView textView3 = (TextView) view.findViewById(AbstractC5955f.extraTxt);
            textView.setText(stringArray[i8]);
            textView2.setText(stringArray2[i8]);
            if (N.isNotNull(stringArray3[i8])) {
                textView3.setVisibility(0);
                textView3.setText(stringArray3[i8]);
            }
            PassengerPicker passengerPickerK = k(i8);
            passengerPickerK.setMinusEventListener(new v4.c(this.f4889B, i8));
            passengerPickerK.setMinusDescription(stringArray[i8] + b(AbstractC5959j.booking_desc));
            passengerPickerK.setPlusEventListener(new v4.c(this.f4889B, i8));
            passengerPickerK.setPlusDescription(stringArray[i8] + b(AbstractC5959j.booking_inc));
            i8++;
        }
    }

    private void w() {
        this.f4908x = 0;
        this.f4907w = 9;
        this.f4891g = this.f4909y.getInt("ADULT_COUNT", 1);
        this.f4892h = this.f4909y.getInt("TEENAGER_COUNT");
        this.f4893i = this.f4909y.getInt("CHILD_COUNT");
        this.f4894j = this.f4909y.getInt("CHILD_ACCOMPANY_COUNT");
        this.f4895k = this.f4909y.getInt("SENIOR_COUNT");
        this.f4896l = this.f4909y.getInt("HIGH_DISABLE_COUNT");
        this.f4897m = this.f4909y.getInt("LOW_DISABLE_COUNT");
        this.f4898n = this.f4909y.getInt("GUIDE_DOG_COUNT");
    }

    private void x() {
        int i8;
        for (int i9 = 0; i9 < this.f4888A.length; i9++) {
            switch (i9) {
                case 0:
                    i8 = this.f4891g;
                    break;
                case 1:
                    i8 = this.f4893i;
                    break;
                case 2:
                    i8 = this.f4894j;
                    break;
                case 3:
                    i8 = this.f4895k;
                    break;
                case 4:
                    i8 = this.f4896l;
                    break;
                case 5:
                    i8 = this.f4897m;
                    break;
                case 6:
                    i8 = this.f4898n;
                    break;
                case 7:
                    i8 = this.f4892h;
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

    private void y() {
        CTextView cTextView = (CTextView) findViewById(AbstractC5955f.expandHintTxt);
        int i8 = AbstractC5959j.booking_limit_n_n;
        int i9 = this.f4908x;
        if (i9 == 0) {
            i9 = 1;
        }
        cTextView.setText(c(i8, Integer.valueOf(i9), Integer.valueOf(this.f4907w)));
    }

    private void z() {
        x();
        j();
    }

    public Bundle getPassengerInfo() {
        Bundle bundle = new Bundle();
        bundle.putInt("TEENAGER_COUNT", this.f4892h);
        bundle.putInt("ADULT_COUNT", this.f4891g);
        bundle.putInt("CHILD_COUNT", this.f4893i);
        bundle.putInt("CHILD_ACCOMPANY_COUNT", this.f4894j);
        bundle.putInt("SENIOR_COUNT", this.f4895k);
        bundle.putInt("HIGH_DISABLE_COUNT", this.f4896l);
        bundle.putInt("LOW_DISABLE_COUNT", this.f4897m);
        bundle.putInt("GUIDE_DOG_COUNT", this.f4898n);
        bundle.putInt("TOTAL_PERSON_COUNT", this.f4892h + this.f4891g + this.f4893i + this.f4894j + this.f4895k + this.f4896l + this.f4897m + this.f4898n);
        return bundle;
    }

    public int getTotalCount() {
        return this.f4891g + this.f4892h + this.f4893i + this.f4894j + this.f4895k + this.f4896l + this.f4897m + this.f4898n;
    }

    public String getTotalPassengerText() throws Resources.NotFoundException {
        if (getTotalCount() != 1) {
            return c(AbstractC5959j.booking_total_count, Integer.valueOf(getTotalCount()));
        }
        String[] stringArray = getResources().getStringArray(AbstractC5952c.passenger_type);
        if (this.f4891g == 1) {
            return stringArray[0] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4892h == 1) {
            return stringArray[7] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4893i == 1) {
            return stringArray[1] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4894j == 1) {
            return stringArray[2] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4895k == 1) {
            return stringArray[3] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4896l == 1) {
            return stringArray[4] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4897m == 1) {
            return stringArray[5] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
        }
        if (this.f4898n != 1) {
            return "";
        }
        return stringArray[6] + X.SPACE + c(AbstractC5959j.common_s_person_count, 1);
    }

    protected PassengerPicker k(int i8) {
        return (PassengerPicker) this.f4888A[i8].findViewById(AbstractC5955f.countPicker);
    }

    protected String l(int i8) {
        return N.getText((TextView) this.f4888A[i8].findViewById(AbstractC5955f.titleTxt));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    protected boolean p() {
        return true;
    }

    protected boolean q(int i8) {
        boolean z8;
        if (!p()) {
            return false;
        }
        if (i8 == 1 || i8 == 2 || i8 == 6) {
            z8 = false;
        } else if (s()) {
            if (this.f4894j / 2.0d > ((((this.f4891g + this.f4892h) + this.f4895k) + this.f4896l) + this.f4897m) - 1) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning2)).showDialog();
                z8 = true;
            }
            z8 = false;
        } else {
            if (this.f4894j > 0 && 1 == this.f4891g + this.f4892h + this.f4895k + this.f4896l + this.f4897m) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning1)).showDialog();
                z8 = true;
            }
            z8 = false;
        }
        if (6 == i8) {
            if (this.f4896l + this.f4897m == 0) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_guide_dog_warning)).showDialog();
                return true;
            }
            this.f4907w = 9;
            j();
            return z8;
        }
        if ((4 == i8 || 5 == i8) && this.f4898n >= this.f4896l + this.f4897m) {
            C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_guide_dog_warning)).showDialog();
            return true;
        }
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
            if ((this.f4894j + 1) / 2.0d > this.f4891g + this.f4892h + this.f4895k + this.f4896l + this.f4897m) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning2)).showDialog();
                z8 = true;
            }
            z8 = false;
        } else {
            if (this.f4891g + this.f4892h + this.f4895k + this.f4896l + this.f4897m == 0) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_family_child_accompany_warning1)).showDialog();
                z8 = true;
            }
            z8 = false;
        }
        if (6 == i8) {
            int i9 = this.f4896l;
            int i10 = this.f4897m;
            if (i9 + i10 == 0 || this.f4898n >= i9 + i10) {
                C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.normal_booking_guide_dog_warning)).showDialog();
                return true;
            }
        }
        return z8;
    }

    protected boolean s() {
        return false;
    }

    public void setData(Bundle bundle) {
        this.f4909y = bundle;
    }

    public void setGuideDogView(boolean z8) {
        if (!z8) {
            this.f4907w = 9;
            Bundle passengerInfo = getPassengerInfo();
            passengerInfo.putInt("GUIDE_DOG_COUNT", 0);
            updatePassengerData(passengerInfo);
        }
        this.f4888A[6].setVisibility(z8 ? 0 : 8);
    }

    public void setOnChangePersonInfoListener(a aVar) {
        this.f4910z = aVar;
    }

    public void updatePassengerData(Bundle bundle) {
        this.f4909y = bundle;
        v();
    }

    protected void v() {
        w();
        z();
        y();
    }

    public int getPassengerInfo(int i8) {
        if (i8 == 0) {
            return this.f4891g;
        }
        if (7 == i8) {
            return this.f4892h;
        }
        if (1 == i8) {
            return this.f4893i;
        }
        if (2 == i8) {
            return this.f4894j;
        }
        if (3 == i8) {
            return this.f4895k;
        }
        if (4 == i8) {
            return this.f4896l;
        }
        if (5 == i8) {
            return this.f4897m;
        }
        if (6 == i8) {
            return this.f4898n;
        }
        return 0;
    }

    public i(Context context, Bundle bundle) throws Resources.NotFoundException {
        super(context);
        this.f4890f = 9;
        this.f4899o = new int[]{0, 9};
        this.f4900p = new int[]{0, 9};
        this.f4901q = new int[]{0, 9};
        this.f4902r = new int[]{0, 9};
        this.f4903s = new int[]{0, 9};
        this.f4904t = new int[]{0, 9};
        this.f4905u = new int[]{0, 9};
        this.f4906v = new int[]{0, 9};
        this.f4889B = new c.a() { // from class: T4.h
            @Override // v4.c.a
            public final void onCustomClick(View view, int i8) {
                this.f4887a.t(view, i8);
            }
        };
        m(bundle);
    }
}
