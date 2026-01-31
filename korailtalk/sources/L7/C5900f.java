package l7;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5900f {
    public static final C5900f INSTANCE = new C5900f();
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_16;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    private static volatile Charset f34017a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Charset f34018b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile Charset f34019c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        UTF_8 = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        UTF_16 = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(charsetForName3, "forName(...)");
        UTF_16BE = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName4, "forName(...)");
        UTF_16LE = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(charsetForName5, "forName(...)");
        US_ASCII = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(charsetForName6, "forName(...)");
        ISO_8859_1 = charsetForName6;
    }

    private C5900f() {
    }

    public final Charset UTF32() {
        Charset charset = f34017a;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f34017a = charsetForName;
        return charsetForName;
    }

    public final Charset UTF32_BE() {
        Charset charset = f34019c;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f34019c = charsetForName;
        return charsetForName;
    }

    public final Charset UTF32_LE() {
        Charset charset = f34018b;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f34018b = charsetForName;
        return charsetForName;
    }
}
