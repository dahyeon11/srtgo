package o1;

import android.util.Base64;
import o1.C6026c;

/* loaded from: classes.dex */
public abstract class l {

    public static abstract class a {
        public abstract l build();

        public abstract a setBackendName(String str);

        public abstract a setExtras(byte[] bArr);

        public abstract a setPriority(m1.d dVar);
    }

    public static a builder() {
        return new C6026c.b().setPriority(m1.d.DEFAULT);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract m1.d getPriority();

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", getBackendName(), getPriority(), getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2));
    }

    public l withPriority(m1.d dVar) {
        return builder().setBackendName(getBackendName()).setPriority(dVar).setExtras(getExtras()).build();
    }
}
