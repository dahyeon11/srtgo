package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2618dj extends B1.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2503cj f18662a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f18663b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f18664c;

    /* renamed from: d, reason: collision with root package name */
    private final double f18665d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18666e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18667f;

    public C2618dj(InterfaceC2503cj interfaceC2503cj) {
        double dZzb;
        int iZzd;
        InterfaceC6172a interfaceC6172aZzf;
        this.f18662a = interfaceC2503cj;
        Uri uriZze = null;
        try {
            interfaceC6172aZzf = interfaceC2503cj.zzf();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
        Drawable drawable = interfaceC6172aZzf != null ? (Drawable) r2.b.unwrap(interfaceC6172aZzf) : null;
        this.f18663b = drawable;
        try {
            uriZze = this.f18662a.zze();
        } catch (RemoteException e9) {
            L1.n.zzh("", e9);
        }
        this.f18664c = uriZze;
        try {
            dZzb = this.f18662a.zzb();
        } catch (RemoteException e10) {
            L1.n.zzh("", e10);
            dZzb = 1.0d;
        }
        this.f18665d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f18662a.zzd();
        } catch (RemoteException e11) {
            L1.n.zzh("", e11);
            iZzd = -1;
        }
        this.f18666e = iZzd;
        try {
            iZzc = this.f18662a.zzc();
        } catch (RemoteException e12) {
            L1.n.zzh("", e12);
        }
        this.f18667f = iZzc;
    }

    @Override // B1.d
    public final Drawable getDrawable() {
        return this.f18663b;
    }

    @Override // B1.d
    public final double getScale() {
        return this.f18665d;
    }

    @Override // B1.d
    public final Uri getUri() {
        return this.f18664c;
    }

    @Override // B1.d
    public final int zza() {
        return this.f18667f;
    }

    @Override // B1.d
    public final int zzb() {
        return this.f18666e;
    }
}
