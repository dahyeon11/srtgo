package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4504uD implements J1.w {

    /* renamed from: a, reason: collision with root package name */
    private final C3144iG f22989a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f22990b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f22991c = new AtomicBoolean(false);

    public C4504uD(C3144iG c3144iG) {
        this.f22989a = c3144iG;
    }

    private final void a() {
        if (this.f22991c.get()) {
            return;
        }
        this.f22991c.set(true);
        this.f22989a.zza();
    }

    @Override // J1.w
    public final void zzdH() {
    }

    @Override // J1.w
    public final void zzdk() {
    }

    @Override // J1.w
    public final void zzdq() {
        a();
    }

    @Override // J1.w
    public final void zzdr() {
        this.f22989a.zzc();
    }

    @Override // J1.w
    public final void zzdt() {
    }

    @Override // J1.w
    public final void zzdu(int i8) {
        this.f22990b.set(true);
        a();
    }

    public final boolean zzg() {
        return this.f22990b.get();
    }
}
