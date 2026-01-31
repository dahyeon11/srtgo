package M3;

import com.h2osystech.smartalimi.common.Const;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, l.GB2312, "EUC_CN", "GBK"),
    EUC_KR(30, Const.EUCENCODING);


    /* renamed from: c, reason: collision with root package name */
    private static final Map f3103c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Map f3104d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f3106a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f3107b;

    static {
        for (d dVar : values()) {
            for (int i8 : dVar.f3106a) {
                f3103c.put(Integer.valueOf(i8), dVar);
            }
            f3104d.put(dVar.name(), dVar);
            for (String str : dVar.f3107b) {
                f3104d.put(str, dVar);
            }
        }
    }

    d(int i8) {
        this(new int[]{i8}, new String[0]);
    }

    public static d getCharacterSetECIByName(String str) {
        return (d) f3104d.get(str);
    }

    public static d getCharacterSetECIByValue(int i8) throws F3.h {
        if (i8 < 0 || i8 >= 900) {
            throw F3.h.getFormatInstance();
        }
        return (d) f3103c.get(Integer.valueOf(i8));
    }

    public int getValue() {
        return this.f3106a[0];
    }

    d(int i8, String... strArr) {
        this.f3106a = new int[]{i8};
        this.f3107b = strArr;
    }

    d(int[] iArr, String... strArr) {
        this.f3106a = iArr;
        this.f3107b = strArr;
    }
}
