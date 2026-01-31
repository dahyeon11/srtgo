package j7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface g {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean contains(g gVar, T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(gVar.getStart()) >= 0 && value.compareTo(gVar.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(g gVar) {
            return gVar.getStart().compareTo(gVar.getEndInclusive()) > 0;
        }
    }

    boolean contains(Comparable<Object> comparable);

    Comparable<Object> getEndInclusive();

    Comparable<Object> getStart();

    boolean isEmpty();
}
