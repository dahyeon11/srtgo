package K3;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f2887a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    static final Set f2888b;

    /* renamed from: c, reason: collision with root package name */
    static final Set f2889c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f2890d;

    /* renamed from: e, reason: collision with root package name */
    static final Set f2891e;

    /* renamed from: f, reason: collision with root package name */
    static final Set f2892f;

    /* renamed from: g, reason: collision with root package name */
    static final Set f2893g;

    /* renamed from: h, reason: collision with root package name */
    static final Set f2894h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map f2895i;

    static {
        EnumSet enumSetOf = EnumSet.of(F3.a.QR_CODE);
        f2891e = enumSetOf;
        EnumSet enumSetOf2 = EnumSet.of(F3.a.DATA_MATRIX);
        f2892f = enumSetOf2;
        EnumSet enumSetOf3 = EnumSet.of(F3.a.AZTEC);
        f2893g = enumSetOf3;
        EnumSet enumSetOf4 = EnumSet.of(F3.a.PDF_417);
        f2894h = enumSetOf4;
        EnumSet enumSetOf5 = EnumSet.of(F3.a.UPC_A, F3.a.UPC_E, F3.a.EAN_13, F3.a.EAN_8, F3.a.RSS_14, F3.a.RSS_EXPANDED);
        f2888b = enumSetOf5;
        EnumSet enumSetOf6 = EnumSet.of(F3.a.CODE_39, F3.a.CODE_93, F3.a.CODE_128, F3.a.ITF, F3.a.CODABAR);
        f2889c = enumSetOf6;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        f2890d = enumSetCopyOf;
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        f2895i = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }

    private static Set a(Iterable iterable, String str) {
        if (iterable != null) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(F3.a.class);
            try {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    enumSetNoneOf.add(F3.a.valueOf((String) it.next()));
                }
                return enumSetNoneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return (Set) f2895i.get(str);
        }
        return null;
    }

    public static Set<F3.a> parseDecodeFormats(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return a(stringExtra != null ? Arrays.asList(f2887a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }
}
