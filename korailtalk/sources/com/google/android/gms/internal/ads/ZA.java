package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class ZA implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2216aB f17525a;

    ZA(C2216aB c2216aB) {
        this.f17525a = c2216aB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        if (C2216aB.c(this.f17525a, map)) {
            this.f17525a.f17916c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.YA
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f17525a.f17917d.zzj();
                }
            });
        }
    }
}
