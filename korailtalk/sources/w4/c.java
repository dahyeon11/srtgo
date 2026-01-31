package W4;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.f;
import y6.C6550j;
import z4.C6630d;
import z4.H;
import z4.N;

/* loaded from: classes.dex */
public class c extends C6550j {

    /* renamed from: f, reason: collision with root package name */
    private f.a f5368f;

    /* renamed from: g, reason: collision with root package name */
    private View f5369g;

    /* renamed from: h, reason: collision with root package name */
    private LinearLayout f5370h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f5371i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f5372j;

    /* renamed from: k, reason: collision with root package name */
    private RadioGroup[] f5373k;

    public c(Context context) throws Resources.NotFoundException {
        super(context);
        g();
    }

    private void g() throws Resources.NotFoundException {
        View.inflate(getContext(), AbstractC5957h.option_booking_toggle, this);
        n();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(RadioGroup radioGroup, int i8, int i9) {
        if (C6630d.isNotNull(this.f5368f)) {
            this.f5368f.onCustomCheckedChanged(radioGroup, i8, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        onHeaderClick();
    }

    private void m() {
        this.f5369g.setOnClickListener(new View.OnClickListener() { // from class: W4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5367a.l(view);
            }
        });
    }

    private void n() throws Resources.NotFoundException {
        this.f5373k = new RadioGroup[getContext().getResources().getStringArray(AbstractC5952c.booking_toggle_option_detail_option).length];
        View viewFindViewById = findViewById(AbstractC5955f.headerView);
        this.f5369g = viewFindViewById;
        this.f5371i = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerTitleTxt);
        this.f5372j = (TextView) this.f5369g.findViewById(AbstractC5955f.headerVal0Txt);
        this.f5370h = (LinearLayout) findViewById(AbstractC5955f.expandView);
        setBookingToggleDetail();
    }

    public ArrayList<Integer> getCheckedIndexList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (RadioGroup radioGroup : this.f5373k) {
            arrayList.add(Integer.valueOf(radioGroup.indexOfChild((RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()))));
        }
        return arrayList;
    }

    public void setBookingToggleDetail() throws Resources.NotFoundException {
        ArrayList<Integer> intList = H.getIntList(getContext(), "BOOKING_TOGGLE_OPTION");
        String[] stringArray = getContext().getResources().getStringArray(AbstractC5952c.booking_toggle_option_detail);
        for (int i8 = 0; i8 < stringArray.length; i8++) {
            View viewInflate = View.inflate(getContext(), AbstractC5957h.option_booking_toggle_detail, null);
            this.f5370h.addView(viewInflate);
            ((TextView) viewInflate.findViewById(AbstractC5955f.tv_option_booking_toggle_detail_name)).setText(stringArray[i8]);
            String[] stringArray2 = getContext().getResources().getStringArray(AbstractC5952c.booking_toggle_option_detail_option);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(AbstractC5955f.rg_option_booking_toggle_detail);
            this.f5373k[i8] = radioGroup;
            radioGroup.setOnCheckedChangeListener(new f(new f.a() { // from class: W4.a
                @Override // v4.f.a
                public final void onCustomCheckedChanged(RadioGroup radioGroup2, int i9, int i10) {
                    this.f5366a.k(radioGroup2, i9, i10);
                }
            }, i8));
            int iIntValue = intList.isEmpty() ? 0 : intList.get(i8).intValue();
            int i9 = 0;
            while (i9 < stringArray2.length) {
                RadioButton radioButton = (RadioButton) View.inflate(getContext(), AbstractC5957h.include_dialog_radio_btn, null);
                radioButton.setText(stringArray2[i9]);
                radioButton.setTextSize(1, 16.0f);
                radioGroup.addView(radioButton);
                radioButton.setChecked(iIntValue == i9);
                if (i9 > 0) {
                    RadioGroup.LayoutParams layoutParams = (RadioGroup.LayoutParams) radioButton.getLayoutParams();
                    layoutParams.leftMargin = N.dpToPx(16.0f);
                    radioButton.setLayoutParams(layoutParams);
                }
                i9++;
            }
            if (i8 > 0) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                layoutParams2.topMargin = N.dpToPx(24.0f);
                viewInflate.setLayoutParams(layoutParams2);
            }
        }
    }

    public void setHeaderMessage(String str) {
        this.f5372j.setText(str);
    }

    public void setHeaderSummary(String str) {
        this.f5371i.setText(str);
    }

    public void setOnCustomRadioCheckedChangListener(f.a aVar) {
        this.f5368f = aVar;
    }
}
