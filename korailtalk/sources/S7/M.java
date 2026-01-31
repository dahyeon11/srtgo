package s7;

/* loaded from: classes3.dex */
abstract /* synthetic */ class M {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36328a = Runtime.getRuntime().availableProcessors();

    public static final int getAVAILABLE_PROCESSORS() {
        return f36328a;
    }

    public static final String systemProp(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
