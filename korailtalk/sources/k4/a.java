package K4;

/* loaded from: classes.dex */
public enum a {
    DEV("0"),
    STAGING("1"),
    TEST("2"),
    REAL("3");


    /* renamed from: a, reason: collision with root package name */
    private final String f2908a;

    a(String str) {
        this.f2908a = str;
    }

    public static a fromCode(String str) {
        for (a aVar : values()) {
            if (aVar.f2908a.equals(str)) {
                return aVar;
            }
        }
        throw new IllegalArgumentException("Unknown ServerTypeCode: " + str);
    }

    public String getCode() {
        return this.f2908a;
    }
}
