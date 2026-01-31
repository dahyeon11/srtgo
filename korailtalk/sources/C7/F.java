package C7;

import java.io.IOException;

/* loaded from: classes3.dex */
public enum F {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: a, reason: collision with root package name */
    private final String f522a;

    F(String str) {
        this.f522a = str;
    }

    public static F get(String str) throws IOException {
        F f8 = HTTP_1_0;
        if (str.equals(f8.f522a)) {
            return f8;
        }
        F f9 = HTTP_1_1;
        if (str.equals(f9.f522a)) {
            return f9;
        }
        F f10 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(f10.f522a)) {
            return f10;
        }
        F f11 = HTTP_2;
        if (str.equals(f11.f522a)) {
            return f11;
        }
        F f12 = SPDY_3;
        if (str.equals(f12.f522a)) {
            return f12;
        }
        F f13 = QUIC;
        if (str.equals(f13.f522a)) {
            return f13;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f522a;
    }
}
