package o2;

/* loaded from: classes.dex */
public abstract class m {
    public static int murmurhash3_x86_32(byte[] bArr, int i8, int i9, int i10) {
        int i11;
        int i12 = i8;
        while (true) {
            i11 = (i9 & (-4)) + i8;
            if (i12 >= i11) {
                break;
            }
            int i13 = ((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | (bArr[i12 + 3] << 24)) * (-862048943);
            int i14 = i10 ^ (((i13 >>> 17) | (i13 << 15)) * 461845907);
            i10 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i12 += 4;
        }
        int i15 = i9 & 3;
        if (i15 == 1) {
            int i16 = ((bArr[i11] & 255) | i) * (-862048943);
            i10 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        } else {
            if (i15 != 2) {
                i = i15 == 3 ? (bArr[i11 + 2] & 255) << 16 : 0;
            }
            i |= (bArr[i11 + 1] & 255) << 8;
            int i162 = ((bArr[i11] & 255) | i) * (-862048943);
            i10 ^= ((i162 >>> 17) | (i162 << 15)) * 461845907;
        }
        int i17 = i10 ^ i9;
        int i18 = (i17 ^ (i17 >>> 16)) * (-2048144789);
        int i19 = (i18 ^ (i18 >>> 13)) * (-1028477387);
        return i19 ^ (i19 >>> 16);
    }
}
