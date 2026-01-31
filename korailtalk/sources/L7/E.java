package l7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class E {
    public static final E INSTANCE = new E();
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.checkNotNull(property);
        LINE_SEPARATOR = property;
    }

    private E() {
    }
}
