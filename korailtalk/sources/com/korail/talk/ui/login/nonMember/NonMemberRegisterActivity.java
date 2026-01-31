package com.korail.talk.ui.login.nonMember;

import I4.h;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class NonMemberRegisterActivity extends BaseViewActivity implements TextWatcher {

    /* renamed from: i, reason: collision with root package name */
    private final int f28162i = 9;

    /* renamed from: j, reason: collision with root package name */
    private final int f28163j = 5;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28164k;

    /* renamed from: l, reason: collision with root package name */
    private EditText f28165l;

    /* renamed from: m, reason: collision with root package name */
    private EditText f28166m;

    /* renamed from: n, reason: collision with root package name */
    private EditText f28167n;

    /* renamed from: o, reason: collision with root package name */
    private EditText f28168o;

    /* renamed from: p, reason: collision with root package name */
    private Button f28169p;

    private void setText() {
        setAppTitle(AbstractC5959j.title_non_member);
    }

    private SpannableStringBuilder t0() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(AbstractC5959j.member_register_non_registered_agrees_popup, N(this.f28165l), C.makePhoneNumber(N(this.f28166m))));
        if (this.f28164k) {
            spannableStringBuilder.append((CharSequence) "\n\n");
            String string = getString(AbstractC5959j.member_register_non_registered_agrees_popup_sub);
            spannableStringBuilder.append((CharSequence) getString(AbstractC5959j.member_register_non_registered_agrees_popup1, string));
            int iIndexOf = spannableStringBuilder.toString().indexOf(string);
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, string.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(String str, String str2, String str3, DialogInterface dialogInterface, int i8) {
        if (102 == i8) {
            h hVar = h.getInstance();
            hVar.setNonMember(true);
            hVar.setNonMemberName(str);
            hVar.setNonMemberPhoneNumber(str2);
            hVar.setNonMemberPassword(str3);
            setResult(-1);
            finish();
        }
    }

    private void v0() {
        this.f28164k = getIntent().getBooleanExtra("IS_RESERVATION_DAO", false);
    }

    private void w0() {
        this.f28165l.addTextChangedListener(this);
        this.f28166m.addTextChangedListener(this);
        this.f28167n.addTextChangedListener(this);
        this.f28168o.addTextChangedListener(this);
        this.f28169p.setOnClickListener(this);
    }

    private void x0() {
        m0();
        this.f28165l = (EditText) findViewById(AbstractC5955f.et_name);
        this.f28166m = (EditText) findViewById(AbstractC5955f.et_phone_num);
        this.f28167n = (EditText) findViewById(AbstractC5955f.et_pw);
        this.f28168o = (EditText) findViewById(AbstractC5955f.et_pw_confirm);
        findViewById(AbstractC5955f.layout_pw_confirm).setVisibility(this.f28164k ? 0 : 8);
        Button button = (Button) findViewById(AbstractC5955f.btn_confirm);
        this.f28169p = button;
        button.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f28169p.setEnabled(N(this.f28165l).length() > 0 && N(this.f28166m).length() >= 9 && N(this.f28167n).length() == 5 && (!this.f28164k || N(this.f28168o).length() == 5));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_confirm != view.getId()) {
            super.onClick(view);
            return;
        }
        final String strN = N(this.f28165l);
        final String strN2 = N(this.f28166m);
        final String strN3 = N(this.f28167n);
        String strN4 = N(this.f28168o);
        if (!C.isInvalidName(strN)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.nonmember_check_name_message2)).showDialog();
            return;
        }
        if (N.isNull(C.makePhoneNumber(strN2))) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.nonmember_check_phone_number)).showDialog();
        } else if (strN3.equals(strN4) || !this.f28164k) {
            C6637k.getCDialog(K(), 1005, 0, getString(AbstractC5959j.dialog_title)).setContent(t0()).setCheckBoxMessage(getString(AbstractC5959j.dialog_checkbox_confirm)).setButtonListener(new DialogInterface.OnClickListener() { // from class: s5.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f36302a.u0(strN, strN2, strN3, dialogInterface, i8);
                }
            }).showDialog();
        } else {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.nonmember_check_password_equal)).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_non_member_register);
        if (C6630d.isNull(bundle)) {
            v0();
            x0();
            setText();
            w0();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
