package Z6;

import S6.AbstractC0759c;
import S6.AbstractC0765i;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c extends AbstractC0759c implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f5749a;

    public c(Enum<Object>[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f5749a = entries;
    }

    @Override // S6.AbstractC0757a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum<Object>) obj);
        }
        return false;
    }

    @Override // S6.AbstractC0759c, S6.AbstractC0757a
    public int getSize() {
        return this.f5749a.length;
    }

    @Override // S6.AbstractC0759c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum<Object>) obj);
        }
        return -1;
    }

    @Override // S6.AbstractC0759c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum<Object>) obj);
        }
        return -1;
    }

    public boolean contains(Enum<Object> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) AbstractC0765i.getOrNull(this.f5749a, element.ordinal())) == element;
    }

    @Override // S6.AbstractC0759c, java.util.List
    public Enum<Object> get(int i8) {
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, this.f5749a.length);
        return this.f5749a[i8];
    }

    public int indexOf(Enum<Object> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC0765i.getOrNull(this.f5749a, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(Enum<Object> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((Object) element);
    }
}
