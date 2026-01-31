package S6;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class X extends AbstractC0759c implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final List f4678a;

    /* renamed from: b, reason: collision with root package name */
    private int f4679b;

    /* renamed from: c, reason: collision with root package name */
    private int f4680c;

    public X(List<Object> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f4678a = list;
    }

    @Override // S6.AbstractC0759c, java.util.List
    public Object get(int i8) {
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, this.f4680c);
        return this.f4678a.get(this.f4679b + i8);
    }

    @Override // S6.AbstractC0759c, S6.AbstractC0757a
    public int getSize() {
        return this.f4680c;
    }

    public final void move(int i8, int i9) {
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, this.f4678a.size());
        this.f4679b = i8;
        this.f4680c = i9 - i8;
    }
}
