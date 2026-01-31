package o1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o1.C6024a;

/* loaded from: classes.dex */
public abstract class h {

    public static abstract class a {
        protected abstract Map a();

        public final a addMetadata(String str, String str2) {
            a().put(str, str2);
            return this;
        }

        protected abstract a b(Map map);

        public abstract h build();

        public abstract a setCode(Integer num);

        public abstract a setEncodedPayload(g gVar);

        public abstract a setEventMillis(long j8);

        public abstract a setTransportName(String str);

        public abstract a setUptimeMillis(long j8);

        public final a addMetadata(String str, long j8) {
            a().put(str, String.valueOf(j8));
            return this;
        }

        public final a addMetadata(String str, int i8) {
            a().put(str, String.valueOf(i8));
            return this;
        }
    }

    public static a builder() {
        return new C6024a.b().b(new HashMap());
    }

    protected abstract Map a();

    public final String get(String str) {
        String str2 = (String) a().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Integer getCode();

    public abstract g getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String str) {
        String str2 = (String) a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = (String) a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(a());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = (String) a().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public a toBuilder() {
        return new C6024a.b().setTransportName(getTransportName()).setCode(getCode()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).b(new HashMap(a()));
    }
}
