package I7;

import androidx.core.view.C0924a0;
import e3.AbstractC5358c;
import java.io.ByteArrayOutputStream;
import maum.m2u.map.Map;

/* loaded from: classes3.dex */
class k {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f2507b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, C0924a0.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, C0924a0.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, C0924a0.TYPE_ZOOM_IN, C0924a0.TYPE_ZOOM_OUT, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, C0924a0.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, Map.MapException.CALLED_INTERFACE_FIELD_NUMBER, 104, 105, 106, 107, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f2508c = {AbstractC5358c.CR, AbstractC5358c.ETB, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.CAN, AbstractC5358c.RS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.RS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.RS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, AbstractC5358c.FS, 6, 10, 10, AbstractC5358c.FF, AbstractC5358c.CR, 6, 8, AbstractC5358c.VT, 10, 10, 8, AbstractC5358c.VT, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, AbstractC5358c.SI, 6, AbstractC5358c.FF, 10, AbstractC5358c.CR, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, AbstractC5358c.CR, 19, AbstractC5358c.CR, AbstractC5358c.SO, 6, AbstractC5358c.SI, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, AbstractC5358c.SI, AbstractC5358c.VT, AbstractC5358c.SO, AbstractC5358c.CR, AbstractC5358c.FS, AbstractC5358c.DC4, AbstractC5358c.SYN, AbstractC5358c.DC4, AbstractC5358c.DC4, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.CAN, AbstractC5358c.ETB, AbstractC5358c.CAN, AbstractC5358c.CAN, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.CAN, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.NAK, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.CAN, AbstractC5358c.SYN, AbstractC5358c.NAK, AbstractC5358c.DC4, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.NAK, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.CAN, AbstractC5358c.NAK, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.NAK, AbstractC5358c.NAK, AbstractC5358c.SYN, AbstractC5358c.NAK, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.ETB, AbstractC5358c.DC4, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.SUB, AbstractC5358c.SUB, AbstractC5358c.DC4, 19, AbstractC5358c.SYN, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.EM, AbstractC5358c.SUB, AbstractC5358c.SUB, AbstractC5358c.SUB, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.SUB, AbstractC5358c.CAN, AbstractC5358c.EM, 19, AbstractC5358c.NAK, AbstractC5358c.SUB, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.SUB, AbstractC5358c.ESC, AbstractC5358c.CAN, AbstractC5358c.NAK, AbstractC5358c.NAK, AbstractC5358c.SUB, AbstractC5358c.SUB, AbstractC5358c.FS, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.DC4, AbstractC5358c.CAN, AbstractC5358c.DC4, AbstractC5358c.NAK, AbstractC5358c.SYN, AbstractC5358c.NAK, AbstractC5358c.NAK, AbstractC5358c.ETB, AbstractC5358c.SYN, AbstractC5358c.SYN, AbstractC5358c.EM, AbstractC5358c.EM, AbstractC5358c.CAN, AbstractC5358c.CAN, AbstractC5358c.SUB, AbstractC5358c.ETB, AbstractC5358c.SUB, AbstractC5358c.ESC, AbstractC5358c.SUB, AbstractC5358c.SUB, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.FS, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.ESC, AbstractC5358c.SUB};

    /* renamed from: d, reason: collision with root package name */
    private static final k f2509d = new k();

    /* renamed from: a, reason: collision with root package name */
    private final a f2510a = new a();

    private k() {
        b();
    }

    private void a(int i8, int i9, byte b9) {
        a aVar = new a(i8, b9);
        a aVar2 = this.f2510a;
        while (b9 > 8) {
            b9 = (byte) (b9 - 8);
            int i10 = (i9 >>> b9) & 255;
            a[] aVarArr = aVar2.f2511a;
            if (aVarArr == null) {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (aVarArr[i10] == null) {
                aVarArr[i10] = new a();
            }
            aVar2 = aVar2.f2511a[i10];
        }
        int i11 = 8 - b9;
        int i12 = (i9 << i11) & 255;
        int i13 = 1 << i11;
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            aVar2.f2511a[i14] = aVar;
        }
    }

    private void b() {
        int i8 = 0;
        while (true) {
            byte[] bArr = f2508c;
            if (i8 >= bArr.length) {
                return;
            }
            a(i8, f2507b[i8], bArr[i8]);
            i8++;
        }
    }

    public static k get() {
        return f2509d;
    }

    byte[] c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a aVar = this.f2510a;
        int i8 = 0;
        int i9 = 0;
        for (byte b9 : bArr) {
            i8 = (i8 << 8) | (b9 & 255);
            i9 += 8;
            while (i9 >= 8) {
                aVar = aVar.f2511a[(i8 >>> (i9 - 8)) & 255];
                if (aVar.f2511a == null) {
                    byteArrayOutputStream.write(aVar.f2512b);
                    i9 -= aVar.f2513c;
                    aVar = this.f2510a;
                } else {
                    i9 -= 8;
                }
            }
        }
        while (i9 > 0) {
            a aVar2 = aVar.f2511a[(i8 << (8 - i9)) & 255];
            if (aVar2.f2511a != null || aVar2.f2513c > i9) {
                break;
            }
            byteArrayOutputStream.write(aVar2.f2512b);
            i9 -= aVar2.f2513c;
            aVar = this.f2510a;
        }
        return byteArrayOutputStream.toByteArray();
    }

    void d(P7.f fVar, P7.d dVar) {
        long j8 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < fVar.size(); i9++) {
            int i10 = fVar.getByte(i9) & 255;
            int i11 = f2507b[i10];
            byte b9 = f2508c[i10];
            j8 = (j8 << b9) | i11;
            i8 += b9;
            while (i8 >= 8) {
                i8 -= 8;
                dVar.writeByte((int) (j8 >> i8));
            }
        }
        if (i8 > 0) {
            dVar.writeByte((int) ((j8 << (8 - i8)) | (255 >>> i8)));
        }
    }

    int e(P7.f fVar) {
        long j8 = 0;
        for (int i8 = 0; i8 < fVar.size(); i8++) {
            j8 += f2508c[fVar.getByte(i8) & 255];
        }
        return (int) ((j8 + 7) >> 3);
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final a[] f2511a;

        /* renamed from: b, reason: collision with root package name */
        final int f2512b;

        /* renamed from: c, reason: collision with root package name */
        final int f2513c;

        a() {
            this.f2511a = new a[256];
            this.f2512b = 0;
            this.f2513c = 0;
        }

        a(int i8, int i9) {
            this.f2511a = null;
            this.f2512b = i8;
            int i10 = i9 & 7;
            this.f2513c = i10 == 0 ? 8 : i10;
        }
    }
}
