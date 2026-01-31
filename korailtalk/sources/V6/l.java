package V6;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class l implements Comparator {
    public static final l INSTANCE = new l();

    private l() {
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return m.INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(Comparable<Object> a9, Comparable<Object> b9) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(b9, "b");
        return a9.compareTo(b9);
    }
}
