package com.korail.talk.ui.inquiry.rir.tcr;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import l5.AbstractActivityC5891a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;

/* loaded from: classes.dex */
public class TCTransferInquiryActivity extends AbstractActivityC5891a {
    @Override // h5.AbstractActivityC5631u, g5.c
    public void moveToSRT(Bundle bundle) {
    }

    @Override // h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        if (AbstractC5955f.bookingBtn != view.getId()) {
            super.onClick(view);
        } else if (this.f31585k > -1) {
            e1();
        }
    }

    @Override // l5.AbstractActivityC5891a, j5.AbstractActivityC5831d, i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_train_inquiry);
        if (C6630d.isNull(bundle)) {
            m2();
            setText();
            W1();
            s2();
        }
    }

    @Override // h5.AbstractActivityC5631u
    protected void setText() {
        super.setText();
        setAppTitle(AbstractC5959j.inquiry_train_inquiry);
        c2(getString(AbstractC5959j.common_transfer), null);
    }
}
