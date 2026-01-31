package f3;

import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
interface j1 extends Iterable {
    Comparator<Object> comparator();

    @Override // java.lang.Iterable
    Iterator<Object> iterator();
}
