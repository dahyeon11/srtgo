package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3390kQ implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20415a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f20416b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f20417c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f20418d;

    public C3390kQ(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04) {
        this.f20415a = xd0;
        this.f20416b = xd02;
        this.f20417c = xd03;
        this.f20418d = xd04;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String str = (String) this.f20415a.zzb();
        Context contextZza = ((C2990gx) this.f20416b).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        Map mapZzb = ((KD0) this.f20418d).zzb();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeT)).booleanValue()) {
            C4775we c4775we = new C4775we(new C1300Ee(contextZza));
            c4775we.zzc(new InterfaceC4661ve() { // from class: com.google.android.gms.internal.ads.lQ
                @Override // com.google.android.gms.internal.ads.InterfaceC4661ve
                public final void zza(C1713Og c1713Og) {
                    c1713Og.zzO(str);
                }
            });
            setEmptySet = Collections.singleton(new C4630vJ(new C3732nQ(c4775we, mapZzb), interfaceExecutorServiceC1974Un0));
        } else {
            setEmptySet = Collections.emptySet();
        }
        OD0.zzb(setEmptySet);
        return setEmptySet;
    }
}
