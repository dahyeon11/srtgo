package w3;

import w3.C6463b;

/* renamed from: w3.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6466e {

    /* renamed from: w3.e$a */
    public static abstract class a {
        public abstract AbstractC6466e build();

        public abstract a setResponseCode(b bVar);

        public abstract a setToken(String str);

        public abstract a setTokenExpirationTimestamp(long j8);
    }

    /* renamed from: w3.e$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a builder() {
        return new C6463b.C0430b().setTokenExpirationTimestamp(0L);
    }

    public abstract b getResponseCode();

    public abstract String getToken();

    public abstract long getTokenExpirationTimestamp();

    public abstract a toBuilder();
}
