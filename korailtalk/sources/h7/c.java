package h7;

import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c extends Random {

    /* renamed from: c, reason: collision with root package name */
    private static final a f31656c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f31657a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31658b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(f impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f31657a = impl;
    }

    public final f getImpl() {
        return this.f31657a;
    }

    @Override // java.util.Random
    protected int next(int i8) {
        return this.f31657a.nextBits(i8);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f31657a.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f31657a.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f31657a.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f31657a.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f31657a.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f31657a.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j8) {
        if (this.f31658b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f31658b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i8) {
        return this.f31657a.nextInt(i8);
    }
}
