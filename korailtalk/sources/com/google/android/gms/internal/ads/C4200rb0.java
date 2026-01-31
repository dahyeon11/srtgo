package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.rb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4200rb0 {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f22489a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable f22490b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f22491c;

    public C4200rb0(Callable callable, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f22490b = callable;
        this.f22491c = interfaceExecutorServiceC1974Un0;
    }

    public final synchronized com.google.common.util.concurrent.C zza() {
        zzc(1);
        return (com.google.common.util.concurrent.C) this.f22489a.poll();
    }

    public final synchronized void zzb(com.google.common.util.concurrent.C c9) {
        this.f22489a.addFirst(c9);
    }

    public final synchronized void zzc(int i8) {
        int size = i8 - this.f22489a.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f22489a.add(this.f22491c.zzb(this.f22490b));
        }
    }
}
