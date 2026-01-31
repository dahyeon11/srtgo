package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2407bs extends AbstractBinderC1365Fr {

    /* renamed from: a, reason: collision with root package name */
    private final String f18187a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18188b;

    public BinderC2407bs(U1.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1365Fr, com.google.android.gms.internal.ads.InterfaceC1406Gr
    public final int zze() {
        return this.f18188b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1365Fr, com.google.android.gms.internal.ads.InterfaceC1406Gr
    public final String zzf() {
        return this.f18187a;
    }

    public BinderC2407bs(String str, int i8) {
        this.f18187a = str;
        this.f18188b = i8;
    }
}
