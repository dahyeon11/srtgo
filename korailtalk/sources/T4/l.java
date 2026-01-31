package T4;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.TextView;
import com.korail.talk.view.ToggleButtonGroupTableLayout;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6550j;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class l extends C6550j implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final int f4920f;

    /* renamed from: g, reason: collision with root package name */
    private int f4921g;

    /* renamed from: h, reason: collision with root package name */
    private int f4922h;

    /* renamed from: i, reason: collision with root package name */
    private View f4923i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f4924j;

    /* renamed from: k, reason: collision with root package name */
    private TableRow f4925k;

    /* renamed from: l, reason: collision with root package name */
    private ToggleButtonGroupTableLayout f4926l;

    public l(Context context) {
        super(context);
        this.f4920f = 2;
        g();
    }

    private void i(String str, int i8) {
        if (this.f4921g % 2 == 0) {
            this.f4925k = new TableRow(getContext());
        }
        RadioButton radioButton = (RadioButton) View.inflate(getContext(), AbstractC5957h.toggle_btn_blue, null);
        radioButton.setText(str);
        this.f4925k.addView(radioButton);
        this.f4921g++;
        TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) radioButton.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
        layoutParams.height = N.dpToPx(34.6f);
        layoutParams.setMargins(this.f4925k.getChildCount() > 0 ? N.dpToPx(10.0f) : 0, this.f4922h > 0 ? N.dpToPx(15.0f) : 0, 0, 0);
        radioButton.setLayoutParams(layoutParams);
        int i9 = this.f4921g;
        if (i9 % 2 == 0 || i8 == i9) {
            this.f4926l.addView(this.f4925k);
            this.f4922h++;
        }
    }

    private void j() {
        findViewById(AbstractC5955f.headerTitleTxt).setOnClickListener(this);
    }

    private void k() {
        View.inflate(getContext(), AbstractC5957h.passenger_age_option, this);
        View viewFindViewById = findViewById(AbstractC5955f.headerView);
        this.f4923i = viewFindViewById;
        this.f4924j = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerTitleTxt);
        this.f4926l = (ToggleButtonGroupTableLayout) findViewById(AbstractC5955f.radioContainer);
    }

    private void setText() {
        this.f4924j.setText(getContext().getString(AbstractC5959j.booking_passenger_age));
    }

    public void disableSelect(int i8) {
        this.f4926l.disableSelect(i8);
    }

    protected void g() {
        k();
        setText();
        j();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.headerTitleTxt == view.getId()) {
            C6637k.getDialog(8, getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).showDialog();
        }
    }

    public void select(int i8) {
        this.f4926l.select(i8);
    }

    public void setEntries(String[] strArr) {
        if (C6630d.isNotNull(strArr) || strArr.length > 0) {
            int length = strArr.length;
            for (String str : strArr) {
                i(str, length);
            }
            this.f4926l.setSelectMode(0);
        }
    }
}
