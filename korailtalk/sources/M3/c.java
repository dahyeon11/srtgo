package M3;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3100a;

    /* renamed from: b, reason: collision with root package name */
    private int f3101b;

    /* renamed from: c, reason: collision with root package name */
    private int f3102c;

    public c(byte[] bArr) {
        this.f3100a = bArr;
    }

    public int available() {
        return ((this.f3100a.length - this.f3101b) * 8) - this.f3102c;
    }

    public int getBitOffset() {
        return this.f3102c;
    }

    public int getByteOffset() {
        return this.f3101b;
    }

    public int readBits(int i8) {
        if (i8 <= 0 || i8 > 32 || i8 > available()) {
            throw new IllegalArgumentException(String.valueOf(i8));
        }
        int i9 = this.f3102c;
        int i10 = 0;
        if (i9 > 0) {
            int i11 = 8 - i9;
            int i12 = i8 < i11 ? i8 : i11;
            int i13 = i11 - i12;
            byte[] bArr = this.f3100a;
            int i14 = this.f3101b;
            int i15 = (((255 >> (8 - i12)) << i13) & bArr[i14]) >> i13;
            i8 -= i12;
            int i16 = i9 + i12;
            this.f3102c = i16;
            if (i16 == 8) {
                this.f3102c = 0;
                this.f3101b = i14 + 1;
            }
            i10 = i15;
        }
        if (i8 <= 0) {
            return i10;
        }
        while (i8 >= 8) {
            int i17 = i10 << 8;
            byte[] bArr2 = this.f3100a;
            int i18 = this.f3101b;
            i10 = (bArr2[i18] & 255) | i17;
            this.f3101b = i18 + 1;
            i8 -= 8;
        }
        if (i8 <= 0) {
            return i10;
        }
        int i19 = 8 - i8;
        int i20 = (i10 << i8) | ((((255 >> i19) << i19) & this.f3100a[this.f3101b]) >> i19);
        this.f3102c += i8;
        return i20;
    }
}
