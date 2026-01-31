package y6;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.korail.talk.ui.certification.DisabilityCertificationActivity;
import java.io.UnsupportedEncodingException;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import x4.C6491a;
import z4.N;
import z4.t;

/* renamed from: y6.f */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6546f extends C6542b implements View.OnClickListener {

    /* renamed from: a */
    private final int f37630a;

    /* renamed from: b */
    private Bundle f37631b;

    /* renamed from: c */
    private final Z4.b f37632c;

    /* renamed from: d */
    private TextView f37633d;

    /* renamed from: e */
    private TextView f37634e;

    /* renamed from: f */
    private EditText f37635f;

    /* renamed from: g */
    private EditText f37636g;

    /* renamed from: h */
    private Button f37637h;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC6546f(Context context, Bundle bundle) {
        super(context);
        this.f37630a = 6;
        this.f37632c = (Z4.b) context;
        h(bundle);
    }

    private String g(String str) {
        return b("205".equals(str) ? AbstractC5959j.common_high_disabled : AbstractC5959j.common_low_disabled);
    }

    private void h(Bundle bundle) {
        setData(bundle);
        j();
        setText();
        i();
    }

    private void i() {
        this.f37637h.setOnClickListener(this);
        this.f37635f.addTextChangedListener(new C6491a(6, this.f37636g));
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.item_disability_certification, this);
        this.f37633d = (TextView) findViewById(AbstractC5955f.tv_item_disability_certification_grade);
        this.f37635f = (EditText) findViewById(AbstractC5955f.et_resident_registration_number_before);
        this.f37636g = (EditText) findViewById(AbstractC5955f.et_resident_registration_number_after);
        this.f37637h = (Button) findViewById(AbstractC5955f.btn_disability_certification);
        this.f37634e = (TextView) findViewById(AbstractC5955f.item_disability_certification_info);
    }

    private void setData(Bundle bundle) {
        this.f37631b = bundle;
    }

    private void setText() {
        this.f37633d.setText(g(this.f37631b.getString(DisabilityCertificationActivity.DISABILITY_CERTIFICATION_CODE)));
        DisabilityCertificationActivity.a aVar = (DisabilityCertificationActivity.a) this.f37631b.getSerializable(DisabilityCertificationActivity.CERTIFICATION_STEP);
        if (aVar == DisabilityCertificationActivity.a.NONE) {
            this.f37634e.setText(N.applySpannable(b(AbstractC5959j.common_resident_registration_number), new ForegroundColorSpan(Color.parseColor("#1b3c5d"))));
        } else if (aVar == DisabilityCertificationActivity.a.DISABILITY_CERTIFICATION_SUCCESS) {
            String string = this.f37631b.getString(DisabilityCertificationActivity.CERTIFICATION_MESSAGE);
            TextView textView = this.f37634e;
            if (!N.isNotNull(string)) {
                string = b(AbstractC5959j.common_certification_success);
            }
            textView.setText(N.applySpannable(string, new ForegroundColorSpan(Color.parseColor("#f04922"))));
        } else {
            this.f37634e.setText(N.applySpannable(b(AbstractC5959j.common_certification_fail), new ForegroundColorSpan(Color.parseColor("#f04922"))));
        }
        boolean z8 = aVar == DisabilityCertificationActivity.a.DISABILITY_CERTIFICATION_SUCCESS;
        this.f37635f.setEnabled(!z8);
        this.f37636g.setEnabled(!z8);
        this.f37637h.setEnabled(!z8);
    }

    public Bundle getBuntData() {
        return this.f37631b;
    }

    public boolean isDisabilityCertification() {
        return this.f37631b.getSerializable(DisabilityCertificationActivity.CERTIFICATION_STEP) == DisabilityCertificationActivity.a.DISABILITY_CERTIFICATION_SUCCESS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r4v8, types: [Z4.b] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ?? r02 = DisabilityCertificationActivity.RESIDENT_REGISTRATION_NUMBER;
        if (AbstractC5955f.btn_disability_certification == view.getId()) {
            String str = "";
            try {
                try {
                    String strEncryptBase64 = C5908a.encryptBase64(e(this.f37635f) + e(this.f37636g));
                    ?? r12 = this.f37631b;
                    r12.putString(DisabilityCertificationActivity.RESIDENT_REGISTRATION_NUMBER, strEncryptBase64);
                    str = r12;
                } catch (UnsupportedEncodingException e8) {
                    t.e(e8.getMessage());
                    this.f37631b.putString(DisabilityCertificationActivity.RESIDENT_REGISTRATION_NUMBER, "");
                    str = str;
                }
                ?? r42 = this.f37632c;
                r02 = this.f37631b;
                r42.disabilityCertificationCheck(r02);
            } catch (Throwable th) {
                this.f37631b.putString(r02, str);
                this.f37632c.disabilityCertificationCheck(this.f37631b);
                throw th;
            }
        }
    }

    public void refreshView(Bundle bundle) {
        setData(bundle);
        setText();
    }

    public void setMargin() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById(AbstractC5955f.item_top).getLayoutParams();
        layoutParams.bottomMargin = N.dpToPx(12.0f);
        setLayoutParams(layoutParams);
    }
}
