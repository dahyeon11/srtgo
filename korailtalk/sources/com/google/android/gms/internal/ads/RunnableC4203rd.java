package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.rd */
/* loaded from: classes2.dex */
final class RunnableC4203rd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f22493a;

    /* renamed from: b */
    final /* synthetic */ C4659vd f22494b;

    RunnableC4203rd(C4659vd c4659vd, View view) {
        this.f22493a = view;
        this.f22494b = c4659vd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22494b.b(this.f22493a);
    }
}
