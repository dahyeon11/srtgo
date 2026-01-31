package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3361kB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20365a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20366b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f20367c;

    public C3361kB(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f20365a = xd0;
        this.f20366b = xd02;
        this.f20367c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        L1.a aVarZza = ((C4357sx) this.f20365a).zza();
        JSONObject jSONObject = (JSONObject) this.f20366b.zzb();
        String str = (String) this.f20367c.zzb();
        boolean zEquals = "native".equals(str);
        G1.u.zzp();
        return new C1828Rc(UUID.randomUUID().toString(), aVarZza, str, jSONObject, false, zEquals);
    }
}
