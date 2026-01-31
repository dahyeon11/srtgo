package p0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import m7.AbstractC5916c;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6048b {
    public static final C6048b INSTANCE = new C6048b();

    /* renamed from: p0.b$a */
    private static final class a {
        public static final a INSTANCE = new a();

        private a() {
        }

        public final int getAdServicesVersion() {
            return SdkExtensions.getExtensionVersion(AbstractC5916c.NANOS_IN_MILLIS);
        }
    }

    private C6048b() {
    }

    public final int version() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.INSTANCE.getAdServicesVersion();
        }
        return 0;
    }
}
