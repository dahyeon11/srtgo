package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.Mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1621Mb implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1703Ob f14669a;

    C1621Mb(C1703Ob c1703Ob) {
        this.f14669a = c1703Ob;
    }

    public final void onOpActiveChanged(String str, int i8, String str2, boolean z8) {
        if (z8) {
            this.f14669a.f15131a = System.currentTimeMillis();
            this.f14669a.f15134d = true;
            return;
        }
        C1703Ob c1703Ob = this.f14669a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c1703Ob.f15132b > 0) {
            C1703Ob c1703Ob2 = this.f14669a;
            if (jCurrentTimeMillis >= c1703Ob2.f15132b) {
                c1703Ob2.f15133c = jCurrentTimeMillis - c1703Ob2.f15132b;
            }
        }
        this.f14669a.f15134d = false;
    }
}
