package com.google.android.gms.internal.ads;

import android.view.View;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Kh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1552Kh extends AbstractBinderC1593Lh {

    /* renamed from: a, reason: collision with root package name */
    private final G1.g f13854a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13855b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13856c;

    public BinderC1552Kh(G1.g gVar, String str, String str2) {
        this.f13854a = gVar;
        this.f13855b = str;
        this.f13856c = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1593Lh, com.google.android.gms.internal.ads.InterfaceC1633Mh
    public final String zzb() {
        return this.f13855b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1593Lh, com.google.android.gms.internal.ads.InterfaceC1633Mh
    public final String zzc() {
        return this.f13856c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1593Lh, com.google.android.gms.internal.ads.InterfaceC1633Mh
    public final void zzd(InterfaceC6172a interfaceC6172a) {
        if (interfaceC6172a == null) {
            return;
        }
        this.f13854a.zza((View) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1593Lh, com.google.android.gms.internal.ads.InterfaceC1633Mh
    public final void zze() {
        this.f13854a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1593Lh, com.google.android.gms.internal.ads.InterfaceC1633Mh
    public final void zzf() {
        this.f13854a.zzc();
    }
}
