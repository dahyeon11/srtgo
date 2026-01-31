package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.zC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5072zC implements InterfaceC1992Vc {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2065Wv f24132a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f24133b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f24134c = new AtomicReference();

    C5072zC(InterfaceC2065Wv interfaceC2065Wv, Executor executor) {
        this.f24132a = interfaceC2065Wv;
        this.f24133b = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    public final synchronized void zzdp(C1951Uc c1951Uc) {
        if (this.f24132a != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmA)).booleanValue()) {
                if (c1951Uc.zzj) {
                    AtomicReference atomicReference = this.f24134c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f24133b;
                        final InterfaceC2065Wv interfaceC2065Wv = this.f24132a;
                        Objects.requireNonNull(interfaceC2065Wv);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xC
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC2065Wv.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!c1951Uc.zzj) {
                    AtomicReference atomicReference2 = this.f24134c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f24133b;
                        final InterfaceC2065Wv interfaceC2065Wv2 = this.f24132a;
                        Objects.requireNonNull(interfaceC2065Wv2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yC
                            @Override // java.lang.Runnable
                            public final void run() {
                                interfaceC2065Wv2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
