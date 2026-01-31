package h7;

import Q7.C;
import j7.l;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final a Default = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private static final f f31661a = a7.b.IMPLEMENTATIONS.defaultPlatformRandom();

    public static final class a extends f implements Serializable {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // h7.f
        public int nextBits(int i8) {
            return f.f31661a.nextBits(i8);
        }

        @Override // h7.f
        public boolean nextBoolean() {
            return f.f31661a.nextBoolean();
        }

        @Override // h7.f
        public byte[] nextBytes(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return f.f31661a.nextBytes(array);
        }

        @Override // h7.f
        public double nextDouble() {
            return f.f31661a.nextDouble();
        }

        @Override // h7.f
        public float nextFloat() {
            return f.f31661a.nextFloat();
        }

        @Override // h7.f
        public int nextInt() {
            return f.f31661a.nextInt();
        }

        @Override // h7.f
        public long nextLong() {
            return f.f31661a.nextLong();
        }

        private a() {
        }

        @Override // h7.f
        public byte[] nextBytes(int i8) {
            return f.f31661a.nextBytes(i8);
        }

        @Override // h7.f
        public double nextDouble(double d9) {
            return f.f31661a.nextDouble(d9);
        }

        @Override // h7.f
        public int nextInt(int i8) {
            return f.f31661a.nextInt(i8);
        }

        @Override // h7.f
        public long nextLong(long j8) {
            return f.f31661a.nextLong(j8);
        }

        @Override // h7.f
        public byte[] nextBytes(byte[] array, int i8, int i9) {
            Intrinsics.checkNotNullParameter(array, "array");
            return f.f31661a.nextBytes(array, i8, i9);
        }

        @Override // h7.f
        public double nextDouble(double d9, double d10) {
            return f.f31661a.nextDouble(d9, d10);
        }

        @Override // h7.f
        public int nextInt(int i8, int i9) {
            return f.f31661a.nextInt(i8, i9);
        }

        @Override // h7.f
        public long nextLong(long j8, long j9) {
            return f.f31661a.nextLong(j8, j9);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(f fVar, byte[] bArr, int i8, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return fVar.nextBytes(bArr, i8, i9);
    }

    public abstract int nextBits(int i8);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] array, int i8, int i9) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!new l(0, array.length).contains(i8) || !new l(0, array.length).contains(i9)) {
            throw new IllegalArgumentException(("fromIndex (" + i8 + ") or toIndex (" + i9 + ") are out of range: 0.." + array.length + C.PACKAGE_SEPARATOR_CHAR).toString());
        }
        if (i8 > i9) {
            throw new IllegalArgumentException(("fromIndex (" + i8 + ") must be not greater than toIndex (" + i9 + ").").toString());
        }
        int i10 = (i9 - i8) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            int iNextInt = nextInt();
            array[i8] = (byte) iNextInt;
            array[i8 + 1] = (byte) (iNextInt >>> 8);
            array[i8 + 2] = (byte) (iNextInt >>> 16);
            array[i8 + 3] = (byte) (iNextInt >>> 24);
            i8 += 4;
        }
        int i12 = i9 - i8;
        int iNextBits = nextBits(i12 * 8);
        for (int i13 = 0; i13 < i12; i13++) {
            array[i8 + i13] = (byte) (iNextBits >>> (i13 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return e.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double d9) {
        return nextDouble(0.0d, d9);
    }

    public int nextInt(int i8) {
        return nextInt(0, i8);
    }

    public long nextLong(long j8) {
        return nextLong(0L, j8);
    }

    public double nextDouble(double d9, double d10) {
        double dNextDouble;
        g.checkRangeBounds(d9, d10);
        double d11 = d10 - d9;
        if (Double.isInfinite(d11) && !Double.isInfinite(d9) && !Double.isNaN(d9) && !Double.isInfinite(d10) && !Double.isNaN(d10)) {
            double d12 = 2;
            double dNextDouble2 = nextDouble() * ((d10 / d12) - (d9 / d12));
            dNextDouble = d9 + dNextDouble2 + dNextDouble2;
        } else {
            dNextDouble = d9 + (nextDouble() * d11);
        }
        return dNextDouble >= d10 ? Math.nextAfter(d10, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public int nextInt(int i8, int i9) {
        int iNextInt;
        int i10;
        int iNextBits;
        g.checkRangeBounds(i8, i9);
        int i11 = i9 - i8;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                iNextBits = nextBits(g.fastLog2(i11));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i10 = iNextInt % i11;
                } while ((iNextInt - i10) + (i11 - 1) < 0);
                iNextBits = i10;
            }
            return i8 + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i8 <= iNextInt2 && iNextInt2 < i9) {
                return iNextInt2;
            }
        }
    }

    public long nextLong(long j8, long j9) {
        long jNextLong;
        long j10;
        long jNextBits;
        int iNextInt;
        g.checkRangeBounds(j8, j9);
        long j11 = j9 - j8;
        if (j11 > 0) {
            if (((-j11) & j11) == j11) {
                int i8 = (int) j11;
                int i9 = (int) (j11 >>> 32);
                if (i8 != 0) {
                    iNextInt = nextBits(g.fastLog2(i8));
                } else if (i9 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (nextBits(g.fastLog2(i9)) << 32) + (nextInt() & 4294967295L);
                }
                jNextBits = iNextInt & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j10 = jNextLong % j11;
                } while ((jNextLong - j10) + (j11 - 1) < 0);
                jNextBits = j10;
            }
            return j8 + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j8 <= jNextLong2 && jNextLong2 < j9) {
                return jNextLong2;
            }
        }
    }

    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int i8) {
        return nextBytes(new byte[i8]);
    }
}
