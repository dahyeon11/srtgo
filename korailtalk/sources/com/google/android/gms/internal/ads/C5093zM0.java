package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zM0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5093zM0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3227j1 f24151a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f24152b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f24153c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Map f24154d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3335jy0 f24155e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3122i5 f24156f;

    public C5093zM0(InterfaceC3227j1 interfaceC3227j1, InterfaceC3122i5 interfaceC3122i5) {
        this.f24151a = interfaceC3227j1;
        this.f24156f = interfaceC3122i5;
    }

    public final void zza(InterfaceC3335jy0 interfaceC3335jy0) {
        if (interfaceC3335jy0 != this.f24155e) {
            this.f24155e = interfaceC3335jy0;
            this.f24152b.clear();
            this.f24154d.clear();
        }
    }
}
