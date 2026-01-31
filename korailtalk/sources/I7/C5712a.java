package i7;

import h7.AbstractC5637a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5712a extends AbstractC5637a {
    @Override // h7.AbstractC5637a
    public Random getImpl() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // h7.f
    public double nextDouble(double d9) {
        return ThreadLocalRandom.current().nextDouble(d9);
    }

    @Override // h7.f
    public int nextInt(int i8, int i9) {
        return ThreadLocalRandom.current().nextInt(i8, i9);
    }

    @Override // h7.f
    public long nextLong(long j8) {
        return ThreadLocalRandom.current().nextLong(j8);
    }

    @Override // h7.f
    public long nextLong(long j8, long j9) {
        return ThreadLocalRandom.current().nextLong(j8, j9);
    }
}
