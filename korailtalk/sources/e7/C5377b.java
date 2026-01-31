package e7;

/* renamed from: e7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5377b extends Error {
    public C5377b() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public C5377b(String str) {
        super(str);
    }

    public C5377b(String str, Throwable th) {
        super(str, th);
    }

    public C5377b(Throwable th) {
        super(th);
    }
}
