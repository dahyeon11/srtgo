package Q7;

import java.nio.charset.Charset;

/* renamed from: Q7.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0713q {
    static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    static Charset b(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

    static String c(String str) {
        return str == null ? Charset.defaultCharset().name() : str;
    }
}
