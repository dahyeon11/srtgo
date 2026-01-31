package H;

import androidx.camera.core.B0;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile j f1535a;

    private static class a extends j {
        a() {
        }

        @Override // H.j
        o b() {
            return null;
        }

        @Override // H.j
        boolean c() {
            return false;
        }
    }

    private static class b extends j {

        /* renamed from: c, reason: collision with root package name */
        private static ExtensionVersionImpl f1536c;

        /* renamed from: b, reason: collision with root package name */
        private o f1537b;

        b() {
            if (f1536c == null) {
                f1536c = new ExtensionVersionImpl();
            }
            o oVar = o.parse(f1536c.checkApiVersion(p.getCurrentVersion().toVersionString()));
            if (oVar != null && p.getCurrentVersion().getVersion().getMajor() == oVar.getMajor()) {
                this.f1537b = oVar;
            }
            B0.d("ExtenderVersion", "Selected vendor runtime: " + this.f1537b);
        }

        @Override // H.j
        o b() {
            return this.f1537b;
        }

        @Override // H.j
        boolean c() {
            try {
                return f1536c.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    private static j a() {
        if (f1535a != null) {
            return f1535a;
        }
        synchronized (j.class) {
            if (f1535a == null) {
                try {
                    f1535a = new b();
                } catch (NoClassDefFoundError unused) {
                    B0.d("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f1535a = new a();
                }
            }
        }
        return f1535a;
    }

    public static o getRuntimeVersion() {
        return a().b();
    }

    public static boolean isAdvancedExtenderSupported() {
        return a().c();
    }

    public static boolean isExtensionVersionSupported() {
        return a().b() != null;
    }

    abstract o b();

    abstract boolean c();
}
