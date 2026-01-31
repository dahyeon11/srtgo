package g3;

import e3.AbstractC5358c;
import e3.w;
import j3.AbstractC5820b;
import j3.AbstractC5825g;
import java.io.Serializable;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5554c {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f31323a = "0123456789abcdef".toCharArray();

    /* renamed from: g3.c$a */
    private static final class a extends AbstractC5554c implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final byte[] f31324b;

        a(byte[] bArr) {
            this.f31324b = (byte[]) w.checkNotNull(bArr);
        }

        @Override // g3.AbstractC5554c
        public byte[] asBytes() {
            return (byte[]) this.f31324b.clone();
        }

        @Override // g3.AbstractC5554c
        public int asInt() {
            byte[] bArr = this.f31324b;
            w.checkState(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f31324b;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // g3.AbstractC5554c
        public long asLong() {
            byte[] bArr = this.f31324b;
            w.checkState(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return padToLong();
        }

        @Override // g3.AbstractC5554c
        boolean b(AbstractC5554c abstractC5554c) {
            if (this.f31324b.length != abstractC5554c.d().length) {
                return false;
            }
            boolean z8 = true;
            int i8 = 0;
            while (true) {
                byte[] bArr = this.f31324b;
                if (i8 >= bArr.length) {
                    return z8;
                }
                z8 &= bArr[i8] == abstractC5554c.d()[i8];
                i8++;
            }
        }

        @Override // g3.AbstractC5554c
        public int bits() {
            return this.f31324b.length * 8;
        }

        @Override // g3.AbstractC5554c
        byte[] d() {
            return this.f31324b;
        }

        @Override // g3.AbstractC5554c
        void e(byte[] bArr, int i8, int i9) {
            System.arraycopy(this.f31324b, 0, bArr, i8, i9);
        }

        @Override // g3.AbstractC5554c
        public long padToLong() {
            long j8 = this.f31324b[0] & 255;
            for (int i8 = 1; i8 < Math.min(this.f31324b.length, 8); i8++) {
                j8 |= (this.f31324b[i8] & 255) << (i8 * 8);
            }
            return j8;
        }
    }

    /* renamed from: g3.c$b */
    private static final class b extends AbstractC5554c implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final int f31325b;

        b(int i8) {
            this.f31325b = i8;
        }

        @Override // g3.AbstractC5554c
        public byte[] asBytes() {
            int i8 = this.f31325b;
            return new byte[]{(byte) i8, (byte) (i8 >> 8), (byte) (i8 >> 16), (byte) (i8 >> 24)};
        }

        @Override // g3.AbstractC5554c
        public int asInt() {
            return this.f31325b;
        }

        @Override // g3.AbstractC5554c
        public long asLong() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // g3.AbstractC5554c
        boolean b(AbstractC5554c abstractC5554c) {
            return this.f31325b == abstractC5554c.asInt();
        }

        @Override // g3.AbstractC5554c
        public int bits() {
            return 32;
        }

        @Override // g3.AbstractC5554c
        void e(byte[] bArr, int i8, int i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                bArr[i8 + i10] = (byte) (this.f31325b >> (i10 * 8));
            }
        }

        @Override // g3.AbstractC5554c
        public long padToLong() {
            return AbstractC5825g.toLong(this.f31325b);
        }
    }

    /* renamed from: g3.c$c, reason: collision with other inner class name */
    private static final class C0305c extends AbstractC5554c implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        final long f31326b;

        C0305c(long j8) {
            this.f31326b = j8;
        }

        @Override // g3.AbstractC5554c
        public byte[] asBytes() {
            return new byte[]{(byte) this.f31326b, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
        }

        @Override // g3.AbstractC5554c
        public int asInt() {
            return (int) this.f31326b;
        }

        @Override // g3.AbstractC5554c
        public long asLong() {
            return this.f31326b;
        }

        @Override // g3.AbstractC5554c
        boolean b(AbstractC5554c abstractC5554c) {
            return this.f31326b == abstractC5554c.asLong();
        }

        @Override // g3.AbstractC5554c
        public int bits() {
            return 64;
        }

        @Override // g3.AbstractC5554c
        void e(byte[] bArr, int i8, int i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                bArr[i8 + i10] = (byte) (this.f31326b >> (i10 * 8));
            }
        }

        @Override // g3.AbstractC5554c
        public long padToLong() {
            return this.f31326b;
        }
    }

    AbstractC5554c() {
    }

    private static int a(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c9);
    }

    static AbstractC5554c c(byte[] bArr) {
        return new a(bArr);
    }

    public static AbstractC5554c fromBytes(byte[] bArr) {
        w.checkArgument(bArr.length >= 1, "A HashCode must contain at least 1 byte.");
        return c((byte[]) bArr.clone());
    }

    public static AbstractC5554c fromInt(int i8) {
        return new b(i8);
    }

    public static AbstractC5554c fromLong(long j8) {
        return new C0305c(j8);
    }

    public static AbstractC5554c fromString(String str) {
        w.checkArgument(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        w.checkArgument(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[str.length() / 2];
        for (int i8 = 0; i8 < str.length(); i8 += 2) {
            bArr[i8 / 2] = (byte) ((a(str.charAt(i8)) << 4) + a(str.charAt(i8 + 1)));
        }
        return c(bArr);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    abstract boolean b(AbstractC5554c abstractC5554c);

    public abstract int bits();

    byte[] d() {
        return asBytes();
    }

    abstract void e(byte[] bArr, int i8, int i9);

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5554c)) {
            return false;
        }
        AbstractC5554c abstractC5554c = (AbstractC5554c) obj;
        return bits() == abstractC5554c.bits() && b(abstractC5554c);
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bArrD = d();
        int i8 = bArrD[0] & 255;
        for (int i9 = 1; i9 < bArrD.length; i9++) {
            i8 |= (bArrD[i9] & 255) << (i9 * 8);
        }
        return i8;
    }

    public abstract long padToLong();

    public final String toString() {
        byte[] bArrD = d();
        StringBuilder sb = new StringBuilder(bArrD.length * 2);
        for (byte b9 : bArrD) {
            char[] cArr = f31323a;
            sb.append(cArr[(b9 >> 4) & 15]);
            sb.append(cArr[b9 & AbstractC5358c.SI]);
        }
        return sb.toString();
    }

    public int writeBytesTo(byte[] bArr, int i8, int i9) {
        int iMin = AbstractC5820b.min(i9, bits() / 8);
        w.checkPositionIndexes(i8, i8 + iMin, bArr.length);
        e(bArr, i8, iMin);
        return iMin;
    }
}
