package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Sc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1870Sc0 {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.util.concurrent.C f16308d = AbstractC1483In0.zzh(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f16309a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f16310b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1911Tc0 f16311c;

    public AbstractC1870Sc0(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, ScheduledExecutorService scheduledExecutorService, InterfaceC1911Tc0 interfaceC1911Tc0) {
        this.f16309a = interfaceExecutorServiceC1974Un0;
        this.f16310b = scheduledExecutorService;
        this.f16311c = interfaceC1911Tc0;
    }

    protected abstract String d(Object obj);

    public final C1461Ic0 zza(Object obj, com.google.common.util.concurrent.C... cArr) {
        return new C1461Ic0(this, obj, Arrays.asList(cArr), null);
    }

    public final C1829Rc0 zzb(Object obj, com.google.common.util.concurrent.C c9) {
        return new C1829Rc0(this, obj, c9, Collections.singletonList(c9), c9);
    }
}
