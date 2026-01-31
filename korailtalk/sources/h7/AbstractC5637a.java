package h7;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5637a extends f {
    public abstract Random getImpl();

    @Override // h7.f
    public int nextBits(int i8) {
        return g.takeUpperBits(getImpl().nextInt(), i8);
    }

    @Override // h7.f
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // h7.f
    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        getImpl().nextBytes(array);
        return array;
    }

    @Override // h7.f
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // h7.f
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // h7.f
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // h7.f
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // h7.f
    public int nextInt(int i8) {
        return getImpl().nextInt(i8);
    }
}
