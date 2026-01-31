package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Cs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1243Cs implements InterfaceC1992Vc {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12584a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f12585b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12586c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12587d;

    public C1243Cs(Context context, String str) {
        this.f12584a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12586c = str;
        this.f12587d = false;
        this.f12585b = new Object();
    }

    public final String zza() {
        return this.f12586c;
    }

    public final void zzb(boolean z8) {
        if (G1.u.zzn().zzp(this.f12584a)) {
            synchronized (this.f12585b) {
                try {
                    if (this.f12587d == z8) {
                        return;
                    }
                    this.f12587d = z8;
                    if (TextUtils.isEmpty(this.f12586c)) {
                        return;
                    }
                    if (this.f12587d) {
                        G1.u.zzn().zzf(this.f12584a, this.f12586c);
                    } else {
                        G1.u.zzn().zzg(this.f12584a, this.f12586c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final void zzdp(C1951Uc c1951Uc) {
        zzb(c1951Uc.zzj);
    }
}
