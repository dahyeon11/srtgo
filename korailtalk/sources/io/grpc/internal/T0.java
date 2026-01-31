package io.grpc.internal;

import e3.AbstractC5364f;
import io.grpc.C5728h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f32530a = Logger.getLogger(T0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f32531b = C5728h0.BINARY_HEADER_SUFFIX.getBytes(AbstractC5364f.US_ASCII);

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i8 = length; i8 < bArr.length; i8++) {
            if (bArr[i8] != bArr2[i8 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b9 : bArr) {
            if (b9 < 32 || b9 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int i8) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(bArr[i9]);
        }
        while (i8 < bArr.length) {
            byte[] bArr2 = bArr[i8];
            byte[] bArr3 = bArr[i8 + 1];
            if (a(bArr2, f32531b)) {
                int i10 = 0;
                for (int i11 = 0; i11 <= bArr3.length; i11++) {
                    if (i11 == bArr3.length || bArr3[i11] == 44) {
                        byte[] bArrDecode = h3.b.base64().decode(new String(bArr3, i10, i11 - i10, AbstractC5364f.US_ASCII));
                        arrayList.add(bArr2);
                        arrayList.add(bArrDecode);
                        i10 = i11 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i8 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] toHttp2Headers(C5728h0 c5728h0) {
        byte[][] bArrSerialize = io.grpc.V.serialize(c5728h0);
        if (bArrSerialize == null) {
            return new byte[0][];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < bArrSerialize.length; i9 += 2) {
            byte[] bArr = bArrSerialize[i9];
            byte[] bArr2 = bArrSerialize[i9 + 1];
            if (a(bArr, f32531b)) {
                bArrSerialize[i8] = bArr;
                bArrSerialize[i8 + 1] = io.grpc.V.BASE64_ENCODING_OMIT_PADDING.encode(bArr2).getBytes(AbstractC5364f.US_ASCII);
            } else if (b(bArr2)) {
                bArrSerialize[i8] = bArr;
                bArrSerialize[i8 + 1] = bArr2;
            } else {
                String str = new String(bArr, AbstractC5364f.US_ASCII);
                f32530a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i8 += 2;
        }
        return i8 == bArrSerialize.length ? bArrSerialize : (byte[][]) Arrays.copyOfRange(bArrSerialize, 0, i8);
    }

    public static byte[][] toRawSerializedHeaders(byte[][] bArr) {
        for (int i8 = 0; i8 < bArr.length; i8 += 2) {
            byte[] bArr2 = bArr[i8];
            int i9 = i8 + 1;
            byte[] bArr3 = bArr[i9];
            if (a(bArr2, f32531b)) {
                for (byte b9 : bArr3) {
                    if (b9 == 44) {
                        return c(bArr, i8);
                    }
                }
                bArr[i9] = h3.b.base64().decode(new String(bArr3, AbstractC5364f.US_ASCII));
            }
        }
        return bArr;
    }
}
