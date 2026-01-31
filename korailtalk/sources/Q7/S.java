package Q7;

import Y7.h;
import ai.maum.m2u.cdk.utils.G711;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class S {
    public static final Y7.b UNESCAPE_CSV;
    public static final Y7.b UNESCAPE_ECMASCRIPT;
    public static final Y7.b UNESCAPE_HTML3;
    public static final Y7.b UNESCAPE_HTML4;
    public static final Y7.b UNESCAPE_JAVA;
    public static final Y7.b UNESCAPE_JSON;
    public static final Y7.b UNESCAPE_XML;
    public static final Y7.b ESCAPE_JAVA = new Y7.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}).with(new Y7.f(Y7.d.JAVA_CTRL_CHARS_ESCAPE())).with(Y7.e.outsideOf(32, 127));
    public static final Y7.b ESCAPE_ECMASCRIPT = new Y7.a(new Y7.f(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new Y7.f(Y7.d.JAVA_CTRL_CHARS_ESCAPE()), Y7.e.outsideOf(32, 127));
    public static final Y7.b ESCAPE_JSON = new Y7.a(new Y7.f(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new Y7.f(Y7.d.JAVA_CTRL_CHARS_ESCAPE()), Y7.e.outsideOf(32, 127));

    @Deprecated
    public static final Y7.b ESCAPE_XML = new Y7.a(new Y7.f(Y7.d.BASIC_ESCAPE()), new Y7.f(Y7.d.APOS_ESCAPE()));
    public static final Y7.b ESCAPE_XML10 = new Y7.a(new Y7.f(Y7.d.BASIC_ESCAPE()), new Y7.f(Y7.d.APOS_ESCAPE()), new Y7.f(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), Y7.g.between(127, G711.BIAS), Y7.g.between(134, 159), new Y7.l());
    public static final Y7.b ESCAPE_XML11 = new Y7.a(new Y7.f(Y7.d.BASIC_ESCAPE()), new Y7.f(Y7.d.APOS_ESCAPE()), new Y7.f(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"\ufffe", ""}, new String[]{"\uffff", ""}), Y7.g.between(1, 8), Y7.g.between(14, 31), Y7.g.between(127, G711.BIAS), Y7.g.between(134, 159), new Y7.l());
    public static final Y7.b ESCAPE_HTML3 = new Y7.a(new Y7.f(Y7.d.BASIC_ESCAPE()), new Y7.f(Y7.d.ISO8859_1_ESCAPE()));
    public static final Y7.b ESCAPE_HTML4 = new Y7.a(new Y7.f(Y7.d.BASIC_ESCAPE()), new Y7.f(Y7.d.ISO8859_1_ESCAPE()), new Y7.f(Y7.d.HTML40_EXTENDED_ESCAPE()));
    public static final Y7.b ESCAPE_CSV = new a();

    static class a extends Y7.b {

        /* renamed from: b */
        private static final String f4097b = String.valueOf('\"');

        /* renamed from: c */
        private static final char[] f4098c = {',', '\"', C0712p.CR, '\n'};

        a() {
        }

        @Override // Y7.b
        public int translate(CharSequence charSequence, int i8, Writer writer) throws IOException {
            if (i8 != 0) {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            if (X.containsNone(charSequence.toString(), f4098c)) {
                writer.write(charSequence.toString());
            } else {
                writer.write(34);
                String string = charSequence.toString();
                String str = f4097b;
                writer.write(X.replace(string, str, str + str));
                writer.write(34);
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static class b extends Y7.b {

        /* renamed from: b */
        private static final String f4099b = String.valueOf('\"');

        /* renamed from: c */
        private static final char[] f4100c = {',', '\"', C0712p.CR, '\n'};

        b() {
        }

        @Override // Y7.b
        public int translate(CharSequence charSequence, int i8, Writer writer) throws IOException {
            if (i8 != 0) {
                throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
            }
            if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
                writer.write(charSequence.toString());
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
            if (X.containsAny(string, f4100c)) {
                StringBuilder sb = new StringBuilder();
                String str = f4099b;
                sb.append(str);
                sb.append(str);
                writer.write(X.replace(string, sb.toString(), str));
            } else {
                writer.write(charSequence.toString());
            }
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
    }

    static {
        Y7.a aVar = new Y7.a(new Y7.i(), new Y7.k(), new Y7.f(Y7.d.JAVA_CTRL_CHARS_UNESCAPE()), new Y7.f(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
        UNESCAPE_JAVA = aVar;
        UNESCAPE_ECMASCRIPT = aVar;
        UNESCAPE_JSON = aVar;
        UNESCAPE_HTML3 = new Y7.a(new Y7.f(Y7.d.BASIC_UNESCAPE()), new Y7.f(Y7.d.ISO8859_1_UNESCAPE()), new Y7.h(new h.a[0]));
        UNESCAPE_HTML4 = new Y7.a(new Y7.f(Y7.d.BASIC_UNESCAPE()), new Y7.f(Y7.d.ISO8859_1_UNESCAPE()), new Y7.f(Y7.d.HTML40_EXTENDED_UNESCAPE()), new Y7.h(new h.a[0]));
        UNESCAPE_XML = new Y7.a(new Y7.f(Y7.d.BASIC_UNESCAPE()), new Y7.f(Y7.d.APOS_UNESCAPE()), new Y7.h(new h.a[0]));
        UNESCAPE_CSV = new b();
    }

    public static final String escapeCsv(String str) {
        return ESCAPE_CSV.translate(str);
    }

    public static final String escapeEcmaScript(String str) {
        return ESCAPE_ECMASCRIPT.translate(str);
    }

    public static final String escapeHtml3(String str) {
        return ESCAPE_HTML3.translate(str);
    }

    public static final String escapeHtml4(String str) {
        return ESCAPE_HTML4.translate(str);
    }

    public static final String escapeJava(String str) {
        return ESCAPE_JAVA.translate(str);
    }

    public static final String escapeJson(String str) {
        return ESCAPE_JSON.translate(str);
    }

    @Deprecated
    public static final String escapeXml(String str) {
        return ESCAPE_XML.translate(str);
    }

    public static String escapeXml10(String str) {
        return ESCAPE_XML10.translate(str);
    }

    public static String escapeXml11(String str) {
        return ESCAPE_XML11.translate(str);
    }

    public static final String unescapeCsv(String str) {
        return UNESCAPE_CSV.translate(str);
    }

    public static final String unescapeEcmaScript(String str) {
        return UNESCAPE_ECMASCRIPT.translate(str);
    }

    public static final String unescapeHtml3(String str) {
        return UNESCAPE_HTML3.translate(str);
    }

    public static final String unescapeHtml4(String str) {
        return UNESCAPE_HTML4.translate(str);
    }

    public static final String unescapeJava(String str) {
        return UNESCAPE_JAVA.translate(str);
    }

    public static final String unescapeJson(String str) {
        return UNESCAPE_JSON.translate(str);
    }

    public static final String unescapeXml(String str) {
        return UNESCAPE_XML.translate(str);
    }
}
