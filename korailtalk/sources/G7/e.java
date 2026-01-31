package G7;

import C7.A;
import C7.C0475i;
import C7.C0481o;
import C7.H;
import C7.J;
import C7.p;
import C7.z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final P7.f f1496a = P7.f.encodeUtf8("\"\\");

    /* renamed from: b, reason: collision with root package name */
    private static final P7.f f1497b = P7.f.encodeUtf8("\t ,=");

    /* JADX WARN: Code restructure failed: missing block: B:61:0x007d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.util.List r8, P7.c r9) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            f(r9)
            java.lang.String r1 = c(r9)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = f(r9)
            java.lang.String r3 = c(r9)
            if (r3 != 0) goto L2c
            boolean r9 = r9.exhausted()
            if (r9 != 0) goto L1f
            return
        L1f:
            C7.i r9 = new C7.i
            java.util.Map r0 = java.util.Collections.emptyMap()
            r9.<init>(r1, r0)
            r8.add(r9)
            return
        L2c:
            r4 = 61
            int r5 = e(r9, r4)
            boolean r6 = f(r9)
            if (r2 != 0) goto L60
            if (r6 != 0) goto L40
            boolean r2 = r9.exhausted()
            if (r2 == 0) goto L60
        L40:
            C7.i r2 = new C7.i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = d(r4, r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L60:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = e(r9, r4)
            int r5 = r5 + r6
        L6a:
            if (r3 != 0) goto L7b
            java.lang.String r3 = c(r9)
            boolean r5 = f(r9)
            if (r5 == 0) goto L77
            goto L7d
        L77:
            int r5 = e(r9, r4)
        L7b:
            if (r5 != 0) goto L88
        L7d:
            C7.i r4 = new C7.i
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L88:
            r6 = 1
            if (r5 <= r6) goto L8c
            return
        L8c:
            boolean r6 = f(r9)
            if (r6 == 0) goto L93
            return
        L93:
            boolean r6 = r9.exhausted()
            if (r6 != 0) goto La8
            r6 = 0
            byte r6 = r9.getByte(r6)
            r7 = 34
            if (r6 != r7) goto La8
            java.lang.String r6 = b(r9)
            goto Lac
        La8:
            java.lang.String r6 = c(r9)
        Lac:
            if (r6 != 0) goto Laf
            return
        Laf:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = f(r9)
            if (r3 != 0) goto Lc5
            boolean r3 = r9.exhausted()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: G7.e.a(java.util.List, P7.c):void");
    }

    private static String b(P7.c cVar) {
        if (cVar.readByte() != 34) {
            throw new IllegalArgumentException();
        }
        P7.c cVar2 = new P7.c();
        while (true) {
            long jIndexOfElement = cVar.indexOfElement(f1496a);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (cVar.getByte(jIndexOfElement) == 34) {
                cVar2.write(cVar, jIndexOfElement);
                cVar.readByte();
                return cVar2.readUtf8();
            }
            if (cVar.size() == jIndexOfElement + 1) {
                return null;
            }
            cVar2.write(cVar, jIndexOfElement);
            cVar.readByte();
            cVar2.write(cVar, 1L);
        }
    }

    private static String c(P7.c cVar) {
        try {
            long jIndexOfElement = cVar.indexOfElement(f1497b);
            if (jIndexOfElement == -1) {
                jIndexOfElement = cVar.size();
            }
            if (jIndexOfElement != 0) {
                return cVar.readUtf8(jIndexOfElement);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static long contentLength(J j8) {
        return contentLength(j8.headers());
    }

    private static String d(char c9, int i8) {
        char[] cArr = new char[i8];
        Arrays.fill(cArr, c9);
        return new String(cArr);
    }

    private static int e(P7.c cVar, byte b9) {
        int i8 = 0;
        while (!cVar.exhausted() && cVar.getByte(0L) == b9) {
            i8++;
            cVar.readByte();
        }
        return i8;
    }

    private static boolean f(P7.c cVar) {
        boolean z8 = false;
        while (!cVar.exhausted()) {
            byte b9 = cVar.getByte(0L);
            if (b9 != 44) {
                if (b9 != 32 && b9 != 9) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z8 = true;
            }
        }
        return z8;
    }

    private static long g(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static Set h(J j8) {
        return varyFields(j8.headers());
    }

    public static boolean hasBody(J j8) {
        if (j8.request().method().equals("HEAD")) {
            return false;
        }
        int iCode = j8.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && contentLength(j8) == -1 && !"chunked".equalsIgnoreCase(j8.header("Transfer-Encoding"))) ? false : true;
    }

    public static boolean hasVaryAll(J j8) {
        return hasVaryAll(j8.headers());
    }

    public static List<C0475i> parseChallenges(z zVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < zVar.size(); i8++) {
            if (str.equalsIgnoreCase(zVar.name(i8))) {
                a(arrayList, new P7.c().writeUtf8(zVar.value(i8)));
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i8) throws NumberFormatException {
        try {
            long j8 = Long.parseLong(str);
            if (j8 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j8 < 0) {
                return 0;
            }
            return (int) j8;
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    public static void receiveHeaders(p pVar, A a9, z zVar) {
        if (pVar == p.NO_COOKIES) {
            return;
        }
        List<C0481o> all = C0481o.parseAll(a9, zVar);
        if (all.isEmpty()) {
            return;
        }
        pVar.saveFromResponse(a9, all);
    }

    public static int skipUntil(String str, int i8, String str2) {
        while (i8 < str.length() && str2.indexOf(str.charAt(i8)) == -1) {
            i8++;
        }
        return i8;
    }

    public static int skipWhitespace(String str, int i8) {
        char cCharAt;
        while (i8 < str.length() && ((cCharAt = str.charAt(i8)) == ' ' || cCharAt == '\t')) {
            i8++;
        }
        return i8;
    }

    public static Set<String> varyFields(z zVar) {
        Set<String> setEmptySet = Collections.emptySet();
        int size = zVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            if ("Vary".equalsIgnoreCase(zVar.name(i8))) {
                String strValue = zVar.value(i8);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strValue.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }

    public static z varyHeaders(J j8) {
        return varyHeaders(j8.networkResponse().request().headers(), j8.headers());
    }

    public static boolean varyMatches(J j8, z zVar, H h8) {
        for (String str : h(j8)) {
            if (!Objects.equals(zVar.values(str), h8.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static long contentLength(z zVar) {
        return g(zVar.get("Content-Length"));
    }

    public static boolean hasVaryAll(z zVar) {
        return varyFields(zVar).contains("*");
    }

    public static z varyHeaders(z zVar, z zVar2) {
        Set<String> setVaryFields = varyFields(zVar2);
        if (setVaryFields.isEmpty()) {
            return D7.e.EMPTY_HEADERS;
        }
        z.a aVar = new z.a();
        int size = zVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            String strName = zVar.name(i8);
            if (setVaryFields.contains(strName)) {
                aVar.add(strName, zVar.value(i8));
            }
        }
        return aVar.build();
    }
}
