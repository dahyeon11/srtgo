package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5752i implements InterfaceC5751h0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f32752a = new AtomicLong();

    C5752i() {
    }

    @Override // io.grpc.internal.InterfaceC5751h0
    public void add(long j8) {
        this.f32752a.getAndAdd(j8);
    }

    @Override // io.grpc.internal.InterfaceC5751h0
    public long value() {
        return this.f32752a.get();
    }
}
