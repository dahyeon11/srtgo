package k7;

import S6.AbstractC0758b;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5864b extends AbstractC0758b {

    /* renamed from: c, reason: collision with root package name */
    private final Iterator f33661c;

    /* renamed from: d, reason: collision with root package name */
    private final f7.l f33662d;

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f33663e;

    public C5864b(Iterator<Object> source, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f33661c = source;
        this.f33662d = keySelector;
        this.f33663e = new HashSet();
    }

    @Override // S6.AbstractC0758b
    protected void a() {
        while (this.f33661c.hasNext()) {
            Object next = this.f33661c.next();
            if (this.f33663e.add(this.f33662d.invoke(next))) {
                c(next);
                return;
            }
        }
        b();
    }
}
