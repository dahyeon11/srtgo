package f3;

import java.util.Map;

/* loaded from: classes2.dex */
public interface B0 {

    public interface a {
        boolean equals(Object obj);

        int hashCode();

        Object leftValue();

        Object rightValue();
    }

    boolean areEqual();

    Map<Object, a> entriesDiffering();

    Map<Object, Object> entriesInCommon();

    Map<Object, Object> entriesOnlyOnLeft();

    Map<Object, Object> entriesOnlyOnRight();

    boolean equals(Object obj);

    int hashCode();
}
