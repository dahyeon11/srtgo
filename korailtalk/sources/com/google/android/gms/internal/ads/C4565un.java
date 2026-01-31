package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4565un implements InterfaceC1367Ft {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2135Ym f23103a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f23104b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1203Bt f23105c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4907xn f23106d;

    C4565un(C4907xn c4907xn, C2135Ym c2135Ym, Object obj, C1203Bt c1203Bt) {
        this.f23103a = c2135Ym;
        this.f23104b = obj;
        this.f23105c = c1203Bt;
        this.f23106d = c4907xn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1367Ft
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        AbstractC0667v0.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f23104b;
        C1203Bt c1203Bt = this.f23105c;
        C4907xn.b(this.f23106d, this.f23103a, (InterfaceC2855fn) obj, obj2, c1203Bt);
    }
}
