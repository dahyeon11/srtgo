package I7;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final P7.f f2383a = P7.f.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f2384b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    static final String[] f2385c = new String[64];

    /* renamed from: d, reason: collision with root package name */
    static final String[] f2386d = new String[256];

    static {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = f2386d;
            if (i9 >= strArr.length) {
                break;
            }
            strArr[i9] = D7.e.format("%8s", Integer.toBinaryString(i9)).replace(' ', '0');
            i9++;
        }
        String[] strArr2 = f2385c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f2385c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f2385c;
            if (i8 >= strArr4.length) {
                return;
            }
            if (strArr4[i8] == null) {
                strArr4[i8] = f2386d[i8];
            }
            i8++;
        }
    }

    static String a(byte b9, byte b10) {
        if (b10 == 0) {
            return "";
        }
        if (b9 != 2 && b9 != 3) {
            if (b9 == 4 || b9 == 6) {
                return b10 == 1 ? "ACK" : f2386d[b10];
            }
            if (b9 != 7 && b9 != 8) {
                String[] strArr = f2385c;
                String str = b10 < strArr.length ? strArr[b10] : f2386d[b10];
                return (b9 != 5 || (b10 & 4) == 0) ? (b9 != 0 || (b10 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f2386d[b10];
    }

    static String b(boolean z8, int i8, int i9, byte b9, byte b10) {
        String[] strArr = f2384b;
        return D7.e.format("%s 0x%08x %5d %-13s %s", z8 ? "<<" : ">>", Integer.valueOf(i8), Integer.valueOf(i9), b9 < strArr.length ? strArr[b9] : D7.e.format("0x%02x", Byte.valueOf(b9)), a(b9, b10));
    }

    static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(D7.e.format(str, objArr));
    }

    static IOException d(String str, Object... objArr) throws IOException {
        throw new IOException(D7.e.format(str, objArr));
    }
}
