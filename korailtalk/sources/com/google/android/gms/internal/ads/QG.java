package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class QG implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f15759a;

    @Override // java.lang.Runnable
    public final void run() {
        SG sg = (SG) this.f15759a.get();
        if (sg != null) {
            sg.a(new InterfaceC4286sI() { // from class: com.google.android.gms.internal.ads.OG
                @Override // com.google.android.gms.internal.ads.InterfaceC4286sI
                public final void zza(Object obj) {
                    ((TG) obj).zza();
                }
            });
        }
    }
}
