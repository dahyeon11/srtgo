package com.google.android.gms.internal.ads;

import Q1.c;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Ap, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1158Ap extends c.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2503cj f12212a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f12213b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f12214c;

    /* renamed from: d, reason: collision with root package name */
    private final double f12215d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12216e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12217f;

    public C1158Ap(InterfaceC2503cj interfaceC2503cj) {
        double dZzb;
        int iZzd;
        InterfaceC6172a interfaceC6172aZzf;
        this.f12212a = interfaceC2503cj;
        Uri uriZze = null;
        try {
            interfaceC6172aZzf = interfaceC2503cj.zzf();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        Drawable drawable = interfaceC6172aZzf != null ? (Drawable) r2.b.unwrap(interfaceC6172aZzf) : null;
        this.f12213b = drawable;
        try {
            uriZze = this.f12212a.zze();
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
        this.f12214c = uriZze;
        try {
            dZzb = this.f12212a.zzb();
        } catch (RemoteException e10) {
            L1.n.zzh("", e10);
            dZzb = 1.0d;
        }
        this.f12215d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f12212a.zzd();
        } catch (RemoteException e11) {
            L1.n.zzh("", e11);
            iZzd = -1;
        }
        this.f12216e = iZzd;
        try {
            iZzc = this.f12212a.zzc();
        } catch (RemoteException e12) {
            L1.n.zzh("", e12);
        }
        this.f12217f = iZzc;
    }

    @Override // Q1.c.b
    public final Drawable getDrawable() {
        return this.f12213b;
    }

    @Override // Q1.c.b
    public final double getScale() {
        return this.f12215d;
    }

    @Override // Q1.c.b
    public final Uri getUri() {
        return this.f12214c;
    }

    @Override // Q1.c.b
    public final int zza() {
        return this.f12217f;
    }

    @Override // Q1.c.b
    public final int zzb() {
        return this.f12216e;
    }
}
