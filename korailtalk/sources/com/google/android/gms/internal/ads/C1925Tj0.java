package com.google.android.gms.internal.ads;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* renamed from: com.google.android.gms.internal.ads.Tj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1925Tj0 implements InterfaceC1843Rj0 {

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1843Rj0 f16504c = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.Sj0
        @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC1843Rj0 f16505a;

    /* renamed from: b, reason: collision with root package name */
    private Object f16506b;

    C1925Tj0(InterfaceC1843Rj0 interfaceC1843Rj0) {
        this.f16505a = interfaceC1843Rj0;
    }

    public final String toString() {
        Object obj = this.f16505a;
        if (obj == f16504c) {
            obj = "<supplier that returned " + String.valueOf(this.f16506b) + SimpleComparison.GREATER_THAN_OPERATION;
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
    public final Object zza() {
        InterfaceC1843Rj0 interfaceC1843Rj0 = this.f16505a;
        InterfaceC1843Rj0 interfaceC1843Rj02 = f16504c;
        if (interfaceC1843Rj0 != interfaceC1843Rj02) {
            synchronized (this) {
                try {
                    if (this.f16505a != interfaceC1843Rj02) {
                        Object objZza = this.f16505a.zza();
                        this.f16506b = objZza;
                        this.f16505a = interfaceC1843Rj02;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.f16506b;
    }
}
