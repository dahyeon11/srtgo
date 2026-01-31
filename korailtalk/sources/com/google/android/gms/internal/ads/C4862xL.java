package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4862xL implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23690a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23691b;

    public C4862xL(XD0 xd0, XD0 xd02) {
        this.f23690a = xd0;
        this.f23691b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        L1.a aVarZza = ((C4357sx) this.f23690a).zza();
        G1.u.zzp();
        return new C1828Rc(UUID.randomUUID().toString(), aVarZza, "native", new JSONObject(), false, true);
    }
}
