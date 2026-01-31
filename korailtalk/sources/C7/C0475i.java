package C7;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: C7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0475i {

    /* renamed from: a, reason: collision with root package name */
    private final String f667a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f668b;

    public C0475i(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.f667a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f668b = Collections.unmodifiableMap(linkedHashMap);
    }

    public Map<String, String> authParams() {
        return this.f668b;
    }

    public Charset charset() {
        String str = (String) this.f668b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0475i) {
            C0475i c0475i = (C0475i) obj;
            if (c0475i.f667a.equals(this.f667a) && c0475i.f668b.equals(this.f668b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f667a.hashCode()) * 31) + this.f668b.hashCode();
    }

    public String realm() {
        return (String) this.f668b.get("realm");
    }

    public String scheme() {
        return this.f667a;
    }

    public String toString() {
        return this.f667a + " authParams=" + this.f668b;
    }

    public C0475i withCharset(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f668b);
        linkedHashMap.put("charset", charset.name());
        return new C0475i(this.f667a, linkedHashMap);
    }

    public C0475i(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 != null) {
            this.f667a = str;
            this.f668b = Collections.singletonMap("realm", str2);
            return;
        }
        throw new NullPointerException("realm == null");
    }
}
