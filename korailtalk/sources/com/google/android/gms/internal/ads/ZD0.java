package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ZD0 extends androidx.browser.customtabs.e {

    /* renamed from: a */
    private final WeakReference f17530a;

    public ZD0(C1838Rh c1838Rh) {
        this.f17530a = new WeakReference(c1838Rh);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        C1838Rh c1838Rh = (C1838Rh) this.f17530a.get();
        if (c1838Rh != null) {
            c1838Rh.zzc(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1838Rh c1838Rh = (C1838Rh) this.f17530a.get();
        if (c1838Rh != null) {
            c1838Rh.zzd();
        }
    }
}
