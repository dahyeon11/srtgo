package S6;

import java.util.AbstractSet;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: S6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0762f extends AbstractSet implements Set, KMutableSet {
    protected AbstractC0762f() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
