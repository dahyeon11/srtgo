package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.g00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2883g00 implements G1.g {

    /* renamed from: a, reason: collision with root package name */
    private final C4850xF f19280a;

    /* renamed from: b, reason: collision with root package name */
    private final TF f19281b;

    /* renamed from: c, reason: collision with root package name */
    private final FJ f19282c;

    /* renamed from: d, reason: collision with root package name */
    private final C4858xJ f19283d;

    /* renamed from: e, reason: collision with root package name */
    private final C2904gB f19284e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f19285f = new AtomicBoolean(false);

    C2883g00(C4850xF c4850xF, TF tf, FJ fj, C4858xJ c4858xJ, C2904gB c2904gB) {
        this.f19280a = c4850xF;
        this.f19281b = tf;
        this.f19282c = fj;
        this.f19283d = c4858xJ;
        this.f19284e = c2904gB;
    }

    @Override // G1.g
    public final synchronized void zza(View view) {
        if (this.f19285f.compareAndSet(false, true)) {
            this.f19284e.zzr();
            this.f19283d.zza(view);
        }
    }

    @Override // G1.g
    public final void zzb() {
        if (this.f19285f.get()) {
            this.f19280a.onAdClicked();
        }
    }

    @Override // G1.g
    public final void zzc() {
        if (this.f19285f.get()) {
            this.f19281b.zza();
            this.f19282c.zza();
        }
    }
}
