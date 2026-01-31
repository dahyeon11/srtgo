package r5;

import android.os.Bundle;
import android.text.InputFilter;
import androidx.fragment.app.Fragment;
import k0.AbstractC5837a;
import m4.C5908a;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.H;
import z4.u;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6178c extends ViewOnFocusChangeListenerC6177b {
    public static final String TAG = "MemberLoginFragment";

    private void H0() {
        this.f35771d0 = 10;
    }

    private void J0() {
        this.f35777j0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        this.f35777j0.setInputType(2);
    }

    private void K0() {
        this.f35776i0.setText(this.f35772e0.getTitle(2));
        this.f35779l0.setText(getString(AbstractC5959j.member_number_save));
    }

    public static Fragment newInstance(Bundle bundle) {
        C6178c c6178c = new C6178c();
        c6178c.setArguments(bundle);
        return c6178c;
    }

    private void y0() {
        String string = H.getString(getApplicationContext(), "KEY_LOGIN_TYPE");
        if (string.equals("2") || u.isEasyLoginType(string)) {
            boolean z8 = H.getBoolean(getApplicationContext(), "KEY_MEMBER_NUM");
            this.f35779l0.setChecked(z8);
            this.f35780m0.setChecked(H.getBoolean(getApplicationContext(), "KEY_AUTO_LOGIN"));
            if (!this.f35772e0.isAutoLogin()) {
                if (z8) {
                    this.f35777j0.setText(C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_ID")));
                }
            } else {
                this.f35777j0.setText(C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_ID")));
                this.f35778k0.setText(C5908a.decryptAES(getApplicationContext(), H.getString(getApplicationContext(), "KEY_LOGIN_PW")));
                if (getArguments().containsKey("WEB_POST_URL") && getArguments().containsKey("WEB_POST_PARAMETER")) {
                    G0(getArguments().getString("WEB_POST_URL", ""), getArguments().getString("WEB_POST_PARAMETER", ""));
                }
            }
        }
    }

    @Override // r5.ViewOnFocusChangeListenerC6177b, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // r5.ViewOnFocusChangeListenerC6177b, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            H0();
            J0();
            K0();
            I0();
            y0();
        }
    }

    private void I0() {
    }
}
