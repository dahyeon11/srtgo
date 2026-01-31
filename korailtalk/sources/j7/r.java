package j7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface r {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean contains(r rVar, T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(rVar.getStart()) >= 0 && value.compareTo(rVar.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(r rVar) {
            return rVar.getStart().compareTo(rVar.getEndExclusive()) >= 0;
        }
    }

    boolean contains(Comparable<Object> comparable);

    Comparable<Object> getEndExclusive();

    Comparable<Object> getStart();

    boolean isEmpty();
}
