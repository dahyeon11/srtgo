package X4;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.korail.talk.ui.booking.option.passenger.PassengerPicker;
import com.korail.talk.viewGroup.DropDownSelector;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6541a;
import z4.C;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class b extends C6541a implements DropDownSelector.b, View.OnClickListener {
    public static int PERIOD_2MONTH_MAX = 20;
    public static int PERIOD_2MONTH_MIN = 10;
    public static int PERIOD_3MONTH_MAX = 30;
    public static int PERIOD_3MONTH_MIN = 21;

    /* renamed from: a, reason: collision with root package name */
    private String f5461a;

    /* renamed from: b, reason: collision with root package name */
    private String f5462b;

    /* renamed from: c, reason: collision with root package name */
    private DropDownSelector f5463c;

    /* renamed from: d, reason: collision with root package name */
    private PassengerPicker f5464d;

    public b(Context context) {
        super(context);
        this.f5461a = "B2N18120402";
        this.f5462b = "B2N18120403";
        e();
    }

    private void d() {
        f();
    }

    private void e() {
        g();
        j();
        i();
        h();
        d();
    }

    private void f() {
        TextView textView = (TextView) this.f5464d.findViewById(AbstractC5955f.valueTxt);
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(Color.parseColor("#808080"));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = N.dpToPx(70.0f);
        textView.setLayoutParams(layoutParams);
        this.f5464d.setMinusEnabled(false);
    }

    private void h() {
        this.f5463c.setOnSelectorItemClickListener(this);
        this.f5464d.setMinusEventListener(this);
        this.f5464d.setPlusEventListener(this);
    }

    private void i() {
        this.f5463c.setEntries(getResources().getStringArray(AbstractC5952c.select_number_of_usage_period), (String[]) null, 0);
        this.f5464d.setValue(b(AbstractC5959j.common_s_time, Integer.valueOf(PERIOD_2MONTH_MIN)));
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_select_number_of_usage, this);
        this.f5463c = (DropDownSelector) findViewById(AbstractC5955f.dds_select_number_of_usage);
        this.f5464d = (PassengerPicker) findViewById(AbstractC5955f.pcp_select_number_of_usage);
    }

    public String getDiscountTypeNumber() {
        return this.f5463c.getSelectIndex() == 0 ? this.f5461a : this.f5462b;
    }

    public String getNumberOfUses() {
        return C.getNumber(this.f5464d.getValue());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws NumberFormatException {
        int id = view.getId();
        if (AbstractC5955f.minusBtn == id) {
            int selectIndex = this.f5463c.getSelectIndex();
            int i8 = Integer.parseInt(C.getNumber(this.f5464d.getValue()));
            int i9 = selectIndex == 0 ? PERIOD_2MONTH_MIN : PERIOD_3MONTH_MIN;
            if (i8 > i9) {
                this.f5464d.setValue(b(AbstractC5959j.common_s_time, Integer.valueOf(i8 - 1)));
            }
            this.f5464d.setMinusEnabled(i8 > i9 + 1);
            this.f5464d.setPlusEnabled(true);
            return;
        }
        if (AbstractC5955f.plusBtn == id) {
            int selectIndex2 = this.f5463c.getSelectIndex();
            int i10 = Integer.parseInt(C.getNumber(this.f5464d.getValue()));
            int i11 = selectIndex2 == 0 ? PERIOD_2MONTH_MAX : PERIOD_3MONTH_MAX;
            if (i10 < i11) {
                this.f5464d.setValue(b(AbstractC5959j.common_s_time, Integer.valueOf(i10 + 1)));
            }
            this.f5464d.setMinusEnabled(true);
            this.f5464d.setPlusEnabled(i10 < i11 - 1);
        }
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
        this.f5464d.setValue(b(AbstractC5959j.common_s_time, Integer.valueOf(i8 == 0 ? PERIOD_2MONTH_MIN : PERIOD_3MONTH_MIN)));
        this.f5464d.setMinusEnabled(false);
        this.f5464d.setPlusEnabled(true);
        C6637k.getCDialog(getContext(), 1001, 0, a(AbstractC5959j.dialog_title)).setContent(a(i8 == 0 ? AbstractC5959j.n_card_2_month_init : AbstractC5959j.n_card_3_month_init)).showDialog();
    }

    public void setNCardTypeCode(String str, String str2) {
        this.f5461a = str;
        this.f5462b = str2;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5461a = "B2N18120402";
        this.f5462b = "B2N18120403";
        e();
    }

    public b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f5461a = "B2N18120402";
        this.f5462b = "B2N18120403";
        e();
    }

    private void g() {
    }
}
