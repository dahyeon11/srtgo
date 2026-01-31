package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class XA implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2216aB f17145a;

    XA(C2216aB c2216aB) {
        this.f17145a = c2216aB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        if (C2216aB.c(this.f17145a, map)) {
            this.f17145a.f17916c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.WA
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f17145a.f17917d.zzg();
                }
            });
        }
    }
}
