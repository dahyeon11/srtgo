package f3;

import f3.B0;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public interface l1 extends B0 {
    @Override // f3.B0
    /* synthetic */ boolean areEqual();

    @Override // f3.B0
    SortedMap<Object, B0.a> entriesDiffering();

    @Override // f3.B0
    SortedMap<Object, Object> entriesInCommon();

    @Override // f3.B0
    SortedMap<Object, Object> entriesOnlyOnLeft();

    @Override // f3.B0
    SortedMap<Object, Object> entriesOnlyOnRight();
}
