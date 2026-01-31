package M3;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class l {
    public static final String GB2312 = "GB2312";
    public static final String SHIFT_JIS = "SJIS";

    /* renamed from: a, reason: collision with root package name */
    private static final String f3134a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f3135b;

    static {
        String strName = Charset.defaultCharset().name();
        f3134a = strName;
        f3135b = SHIFT_JIS.equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String guessEncoding(byte[] r21, java.util.Map<F3.e, ?> r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.l.guessEncoding(byte[], java.util.Map):java.lang.String");
    }
}
