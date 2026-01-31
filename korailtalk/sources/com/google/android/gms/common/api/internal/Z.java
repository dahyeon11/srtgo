package com.google.android.gms.common.api.internal;

import I2.AbstractC0608l;
import I2.C0609m;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import f2.C5392b;
import f2.C5397g;
import g2.C5540b;
import h2.InterfaceC5589f;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class Z extends w0 {

    /* renamed from: f, reason: collision with root package name */
    private C0609m f11976f;

    private Z(InterfaceC5589f interfaceC5589f) {
        super(interfaceC5589f, C5397g.getInstance());
        this.f11976f = new C0609m();
        this.f11930a.addCallback("GmsAvailabilityHelper", this);
    }

    public static Z zaa(Activity activity) {
        InterfaceC5589f fragment = LifecycleCallback.getFragment(activity);
        Z z8 = (Z) fragment.getCallbackOrNull("GmsAvailabilityHelper", Z.class);
        if (z8 == null) {
            return new Z(fragment);
        }
        if (z8.f11976f.getTask().isComplete()) {
            z8.f11976f = new C0609m();
        }
        return z8;
    }

    @Override // com.google.android.gms.common.api.internal.w0
    protected final void c(C5392b c5392b, int i8) {
        String errorMessage = c5392b.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "Error connecting to Google Play services";
        }
        this.f11976f.setException(new C5540b(new Status(c5392b, errorMessage, c5392b.getErrorCode())));
    }

    @Override // com.google.android.gms.common.api.internal.w0
    protected final void d() {
        Activity lifecycleActivity = this.f11930a.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.f11976f.trySetException(new C5540b(new Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.f12110e.isGooglePlayServicesAvailable(lifecycleActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.f11976f.trySetResult(null);
        } else {
            if (this.f11976f.getTask().isComplete()) {
                return;
            }
            zah(new C5392b(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onDestroy() {
        super.onDestroy();
        this.f11976f.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final AbstractC0608l zad() {
        return this.f11976f.getTask();
    }
}
