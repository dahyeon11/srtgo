package w3;

import w3.C6462a;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6465d {

    /* renamed from: w3.d$a */
    public static abstract class a {
        public abstract AbstractC6465d build();

        public abstract a setAuthToken(AbstractC6466e abstractC6466e);

        public abstract a setFid(String str);

        public abstract a setRefreshToken(String str);

        public abstract a setResponseCode(b bVar);

        public abstract a setUri(String str);
    }

    /* renamed from: w3.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a builder() {
        return new C6462a.b();
    }

    public abstract AbstractC6466e getAuthToken();

    public abstract String getFid();

    public abstract String getRefreshToken();

    public abstract b getResponseCode();

    public abstract String getUri();

    public abstract a toBuilder();
}
