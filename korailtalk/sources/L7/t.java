package l7;

import Q7.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class t extends s {

    static final class a extends Lambda implements f7.l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // f7.l
        public final String invoke(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return line;
        }
    }

    static final class b extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f34057a = str;
        }

        @Override // f7.l
        public final String invoke(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return this.f34057a + line;
        }
    }

    static final class c extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f34058a = str;
        }

        @Override // f7.l
        public final String invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (C5894A.isBlank(it)) {
                return it.length() < this.f34058a.length() ? this.f34058a : it;
            }
            return this.f34058a + it;
        }
    }

    private static final f7.l a(String str) {
        return str.length() == 0 ? a.INSTANCE : new b(str);
    }

    private static final int b(String str) {
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (!C5898d.isWhitespace(str.charAt(i8))) {
                break;
            }
            i8++;
        }
        return i8 == -1 ? str.length() : i8;
    }

    public static final String prependIndent(String str, String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return k7.p.joinToString$default(k7.p.map(B.lineSequence(str), new c(indent)), X.LF, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    public static final String replaceIndent(String str, String newIndent) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listLines = B.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!C5894A.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(S6.r.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(b((String) it.next())));
        }
        Integer num = (Integer) S6.r.minOrNull((Iterable) arrayList2);
        int i8 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listLines.size());
        f7.l lVarA = a(newIndent);
        int lastIndex = S6.r.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLines) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                S6.r.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i8 == 0 || i8 == lastIndex) && C5894A.isBlank(str3)) {
                str3 = null;
            } else {
                String strDrop = r.drop(str3, iIntValue);
                if (strDrop != null && (str2 = (String) lVarA.invoke(strDrop)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i8 = i9;
        }
        String string = ((StringBuilder) S6.B.joinTo(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : X.LF, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    public static final String replaceIndentByMargin(String str, String newIndent, String marginPrefix) {
        int i8;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (C5894A.isBlank(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listLines = B.lines(str);
        int length = str.length() + (newIndent.length() * listLines.size());
        f7.l lVarA = a(newIndent);
        int lastIndex = S6.r.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (Object obj : listLines) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                S6.r.throwIndexOverflow();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i9 == 0 || i9 == lastIndex) && C5894A.isBlank(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i8 = -1;
                        break;
                    }
                    if (!C5898d.isWhitespace(str3.charAt(i11))) {
                        i8 = i11;
                        break;
                    }
                    i11++;
                }
                if (i8 != -1) {
                    int i12 = i8;
                    if (C5894A.startsWith$default(str3, marginPrefix, i8, false, 4, null)) {
                        int length3 = i12 + marginPrefix.length();
                        Intrinsics.checkNotNull(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str2 = (String) lVarA.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i9 = i10;
        }
        String string = ((StringBuilder) S6.B.joinTo(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : X.LF, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "";
        }
        if ((i8 & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    public static String trimIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    public static final String trimMargin(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}
