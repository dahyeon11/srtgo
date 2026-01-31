package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3589mB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20856a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20857b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f20858c;

    public C3589mB(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f20856a = xd0;
        this.f20857b = xd02;
        this.f20858c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2904gB c2904gB = (C2904gB) this.f20856a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setEmptySet = ((JSONObject) this.f20858c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new C4630vJ(c2904gB, interfaceExecutorServiceC1974Un0));
        OD0.zzb(setEmptySet);
        return setEmptySet;
    }
}
