package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class U0 {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f16566a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f16567b = new AtomicBoolean(false);

    public U0(T0 t02) {
        this.f16566a = t02;
    }

    public final InterfaceC2425c1 zza(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.f16567b) {
            if (!this.f16567b.get()) {
                try {
                    constructorZza = this.f16566a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f16567b.set(true);
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating extension", e8);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (InterfaceC2425c1) constructorZza.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }
}
