package e3;

import e3.AbstractC5360e;
import java.util.BitSet;

/* renamed from: e3.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5351A extends AbstractC5360e.v {

    /* renamed from: b, reason: collision with root package name */
    private final char[] f30299b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30300c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30301d;

    private C5351A(char[] cArr, long j8, boolean z8, String str) {
        super(str);
        this.f30299b = cArr;
        this.f30301d = j8;
        this.f30300c = z8;
    }

    private boolean i(int i8) {
        return 1 == ((this.f30301d >> i8) & 1);
    }

    static int j(int i8) {
        if (i8 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i8 - 1) << 1;
        while (iHighestOneBit * 0.5d < i8) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static AbstractC5360e k(BitSet bitSet, String str) {
        int i8;
        int iCardinality = bitSet.cardinality();
        boolean z8 = bitSet.get(0);
        int iJ = j(iCardinality);
        char[] cArr = new char[iJ];
        int i9 = iJ - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j8 = 0;
        while (iNextSetBit != -1) {
            long j9 = (1 << iNextSetBit) | j8;
            int iL = l(iNextSetBit);
            while (true) {
                i8 = iL & i9;
                if (cArr[i8] == 0) {
                    break;
                }
                iL = i8 + 1;
            }
            cArr[i8] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j8 = j9;
        }
        return new C5351A(cArr, j8, z8, str);
    }

    static int l(int i8) {
        return Integer.rotateLeft(i8 * (-862048943), 15) * 461845907;
    }

    @Override // e3.AbstractC5360e
    void g(BitSet bitSet) {
        if (this.f30300c) {
            bitSet.set(0);
        }
        for (char c9 : this.f30299b) {
            if (c9 != 0) {
                bitSet.set(c9);
            }
        }
    }

    @Override // e3.AbstractC5360e
    public boolean matches(char c9) {
        if (c9 == 0) {
            return this.f30300c;
        }
        if (!i(c9)) {
            return false;
        }
        int length = this.f30299b.length - 1;
        int iL = l(c9) & length;
        int i8 = iL;
        do {
            char c10 = this.f30299b[i8];
            if (c10 == 0) {
                return false;
            }
            if (c10 == c9) {
                return true;
            }
            i8 = (i8 + 1) & length;
        } while (i8 != iL);
        return false;
    }
}
