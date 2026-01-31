package com.korail.talk.ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import m4.C5908a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.H;

/* loaded from: classes.dex */
public class VeteransNoSettingActivity extends BaseViewActivity implements TextWatcher {

    /* renamed from: i, reason: collision with root package name */
    private final int f28746i = 8;

    /* renamed from: j, reason: collision with root package name */
    private EditText f28747j;

    /* renamed from: k, reason: collision with root package name */
    private Button f28748k;

    private void setText() {
        setAppTitle(AbstractC5959j.title_veterans_no_setting);
        String strDecryptAES = C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "보훈번호"));
        if (C6630d.isNull(strDecryptAES)) {
            return;
        }
        this.f28747j.setText(strDecryptAES);
        this.f28747j.setSelection(strDecryptAES.length());
        this.f28748k.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void u0() {
        this.f28747j.addTextChangedListener(this);
        this.f28748k.setOnClickListener(this);
    }

    private void v0() {
        m0();
        this.f28747j = (EditText) findViewById(AbstractC5955f.cardNoEdit);
        this.f28748k = (Button) findViewById(AbstractC5955f.saveBtn);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f28748k.setEnabled(editable.length() == 8);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        O(view);
        if (AbstractC5955f.saveBtn != view.getId()) {
            super.onClick(view);
            return;
        }
        H.putString(getApplicationContext(), "보훈번호", C5908a.encryptAES(getApplicationContext(), N(this.f28747j)));
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.version_info_saved)).setButtonListener(new DialogInterface.OnClickListener() { // from class: V5.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f5226a.t0(dialogInterface, i8);
            }
        }).showDialog();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.veterans_no_setting_activity);
        if (C6630d.isNull(bundle)) {
            v0();
            setText();
            u0();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
