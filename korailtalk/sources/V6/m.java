package V6;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class m implements Comparator {
    public static final m INSTANCE = new m();

    private m() {
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return l.INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(Comparable<Object> a9, Comparable<Object> b9) {
        Intrinsics.checkNotNullParameter(a9, "a");
        Intrinsics.checkNotNullParameter(b9, "b");
        return b9.compareTo(a9);
    }
}
