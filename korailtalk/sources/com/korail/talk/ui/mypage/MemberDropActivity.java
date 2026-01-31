package com.korail.talk.ui.mypage;

import D5.a;
import android.os.Bundle;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class MemberDropActivity extends BaseViewActivity {
    private void s0() {
        a aVarNewInstance = (a) getFragment(a.TAG);
        if (C6630d.isNull(aVarNewInstance)) {
            aVarNewInstance = a.newInstance();
        }
        replaceTransaction(AbstractC5955f.fragment_content, aVarNewInstance, a.TAG);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.drawer_menu_member_drop);
    }

    private void t0() {
        m0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_member_drop);
        if (C6630d.isNull(bundle)) {
            t0();
            setText();
            s0();
        }
    }
}
