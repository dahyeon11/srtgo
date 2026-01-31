package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Ii, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1472Ii {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f13488a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f13489b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f13490c = new AtomicBoolean();

    static InterfaceC1349Fi a() {
        return (InterfaceC1349Fi) f13488a.get();
    }

    static InterfaceC1431Hi b() {
        android.support.v4.media.session.f.a(f13489b.get());
        return null;
    }

    public static void zzc(InterfaceC1349Fi interfaceC1349Fi) {
        f13488a.set(interfaceC1349Fi);
    }
}
