package S6;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.jvm.internal.markers.KMutableCollection;

/* renamed from: S6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0760d extends AbstractCollection implements Collection, KMutableCollection {
    protected AbstractC0760d() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
