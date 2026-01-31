package S6;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.markers.KMutableList;

/* renamed from: S6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0761e extends AbstractList implements List, KMutableList {
    protected AbstractC0761e() {
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i8, Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i8) {
        return removeAt(i8);
    }

    public abstract Object removeAt(int i8);

    @Override // java.util.AbstractList, java.util.List
    public abstract Object set(int i8, Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
