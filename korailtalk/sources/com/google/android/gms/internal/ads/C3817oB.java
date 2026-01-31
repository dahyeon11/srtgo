package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3817oB implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f21428a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f21429b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f21430c;

    public C3817oB(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f21428a = xd0;
        this.f21429b = xd02;
        this.f21430c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C2904gB c2904gB = (C2904gB) this.f21428a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Set setEmptySet = ((JSONObject) this.f21430c.zzb()) == null ? Collections.emptySet() : Collections.singleton(new C4630vJ(c2904gB, interfaceExecutorServiceC1974Un0));
        OD0.zzb(setEmptySet);
        return setEmptySet;
    }
}
