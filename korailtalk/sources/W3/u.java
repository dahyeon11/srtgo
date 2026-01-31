package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class u implements F3.u {

    /* renamed from: a, reason: collision with root package name */
    private final j f5349a = new j();

    private static String a(String str) {
        int length = str.length();
        if (length == 11) {
            int iCharAt = 0;
            for (int i8 = 0; i8 < 11; i8++) {
                iCharAt += (str.charAt(i8) - '0') * (i8 % 2 == 0 ? 3 : 1);
            }
            str = str + ((1000 - iCharAt) % 10);
        } else if (length != 12) {
            throw new IllegalArgumentException("Requested contents should be 11 or 12 digits long, but got " + str.length());
        }
        return "0" + str;
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9) {
        return encode(str, aVar, i8, i9, null);
    }

    @Override // F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.UPC_A) {
            return this.f5349a.encode(a(str), F3.a.EAN_13, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
    }
}
