package com.korail.talk.ui.scheme;

import android.net.Uri;
import android.os.Bundle;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.view.base.BaseActivity;
import java.lang.reflect.InvocationTargetException;
import z4.C6630d;
import z4.C6641o;
import z4.t;
import z4.y;

/* loaded from: classes.dex */
public class NavigationActivity extends BaseActivity {
    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 1048576) != 0) {
            C6641o.navigation(getApplicationContext(), MainBookingActivity.class);
        } else if (C6630d.isNotNull(getIntent()) && C6630d.isNotNull(getIntent().getData())) {
            Uri data = getIntent().getData();
            Bundle navigationBundle = y.getNavigationBundle(data);
            t.d("uri : " + data);
            if (C6630d.isNotNull(getIntent().getExtras())) {
                navigationBundle.putAll(getIntent().getExtras());
            }
            C6641o.navigation(getApplicationContext(), y.getClassNm(data), navigationBundle);
        }
        finish();
    }
}
