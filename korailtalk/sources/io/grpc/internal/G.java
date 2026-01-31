package io.grpc.internal;

import io.grpc.internal.InterfaceC5757k;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class G implements InterfaceC5757k {

    /* renamed from: a, reason: collision with root package name */
    private Random f32464a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private long f32465b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c, reason: collision with root package name */
    private long f32466c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d, reason: collision with root package name */
    private double f32467d = 1.6d;

    /* renamed from: e, reason: collision with root package name */
    private double f32468e = 0.2d;

    /* renamed from: f, reason: collision with root package name */
    private long f32469f = this.f32465b;

    public static final class a implements InterfaceC5757k.a {
        @Override // io.grpc.internal.InterfaceC5757k.a
        public InterfaceC5757k get() {
            return new G();
        }
    }

    private long a(double d9, double d10) {
        e3.w.checkArgument(d10 >= d9);
        return (long) ((this.f32464a.nextDouble() * (d10 - d9)) + d9);
    }

    @Override // io.grpc.internal.InterfaceC5757k
    public long nextBackoffNanos() {
        long j8 = this.f32469f;
        double d9 = j8;
        this.f32469f = Math.min((long) (this.f32467d * d9), this.f32466c);
        double d10 = this.f32468e;
        return j8 + a((-d10) * d9, d10 * d9);
    }
}
