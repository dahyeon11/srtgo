package C7;

import Q7.X;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a */
    private final String[] f714a;

    z(a aVar) {
        List list = aVar.f715a;
        this.f714a = (String[]) list.toArray(new String[list.size()]);
    }

    static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(D7.e.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i8), str));
            }
        }
    }

    static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                throw new IllegalArgumentException(D7.e.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i8), str2, str));
            }
        }
    }

    private static String c(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static z of(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i8 = 0; i8 < strArr2.length; i8++) {
            String str = strArr2[i8];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i8] = str.trim();
        }
        for (int i9 = 0; i9 < strArr2.length; i9 += 2) {
            String str2 = strArr2[i9];
            String str3 = strArr2[i9 + 1];
            a(str2);
            b(str3, str2);
        }
        return new z(strArr2);
    }

    public long byteCount() {
        String[] strArr = this.f714a;
        long length = strArr.length * 2;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            length += this.f714a[i8].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && Arrays.equals(((z) obj).f714a, this.f714a);
    }

    public String get(String str) {
        return c(this.f714a, str);
    }

    public Date getDate(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return G7.d.parse(str2);
        }
        return null;
    }

    public Instant getInstant(String str) {
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f714a);
    }

    public String name(int i8) {
        return this.f714a[i8 * 2];
    }

    public Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            treeSet.add(name(i8));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public a newBuilder() {
        a aVar = new a();
        Collections.addAll(aVar.f715a, this.f714a);
        return aVar;
    }

    public int size() {
        return this.f714a.length / 2;
    }

    public Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            String lowerCase = name(i8).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i8));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(name(i8));
            sb.append(": ");
            sb.append(value(i8));
            sb.append(X.LF);
        }
        return sb.toString();
    }

    public String value(int i8) {
        return this.f714a[(i8 * 2) + 1];
    }

    public List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            if (str.equalsIgnoreCase(name(i8))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i8));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public static final class a {

        /* renamed from: a */
        final List f715a = new ArrayList(20);

        a a(String str) {
            int iIndexOf = str.indexOf(":", 1);
            return iIndexOf != -1 ? b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)) : str.startsWith(":") ? b("", str.substring(1)) : b("", str);
        }

        public a add(String str) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                return add(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: " + str);
        }

        public a addAll(z zVar) {
            int size = zVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                b(zVar.name(i8), zVar.value(i8));
            }
            return this;
        }

        public a addUnsafeNonAscii(String str, String str2) {
            z.a(str);
            return b(str, str2);
        }

        a b(String str, String str2) {
            this.f715a.add(str);
            this.f715a.add(str2.trim());
            return this;
        }

        public z build() {
            return new z(this);
        }

        public String get(String str) {
            for (int size = this.f715a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f715a.get(size))) {
                    return (String) this.f715a.get(size + 1);
                }
            }
            return null;
        }

        public a removeAll(String str) {
            int i8 = 0;
            while (i8 < this.f715a.size()) {
                if (str.equalsIgnoreCase((String) this.f715a.get(i8))) {
                    this.f715a.remove(i8);
                    this.f715a.remove(i8);
                    i8 -= 2;
                }
                i8 += 2;
            }
            return this;
        }

        public a set(String str, Date date) {
            if (date != null) {
                set(str, G7.d.format(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a set(String str, Instant instant) {
            if (instant != null) {
                return set(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a add(String str, String str2) {
            z.a(str);
            z.b(str2, str);
            return b(str, str2);
        }

        public a set(String str, String str2) {
            z.a(str);
            z.b(str2, str);
            removeAll(str);
            b(str, str2);
            return this;
        }

        public a add(String str, Date date) {
            if (date != null) {
                add(str, G7.d.format(date));
                return this;
            }
            throw new NullPointerException("value for name " + str + " == null");
        }

        public a add(String str, Instant instant) {
            if (instant != null) {
                return add(str, new Date(instant.toEpochMilli()));
            }
            throw new NullPointerException("value for name " + str + " == null");
        }
    }

    private z(String[] strArr) {
        this.f714a = strArr;
    }

    public static z of(Map<String, String> map) {
        if (map != null) {
            String[] strArr = new String[map.size() * 2];
            int i8 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    String strTrim = entry.getKey().trim();
                    String strTrim2 = entry.getValue().trim();
                    a(strTrim);
                    b(strTrim2, strTrim);
                    strArr[i8] = strTrim;
                    strArr[i8 + 1] = strTrim2;
                    i8 += 2;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            return new z(strArr);
        }
        throw new NullPointerException("headers == null");
    }
}
