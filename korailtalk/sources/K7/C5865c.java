package k7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5865c implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33664a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.l f33665b;

    public C5865c(m source, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f33664a = source;
        this.f33665b = keySelector;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new C5864b(this.f33664a.iterator(), this.f33665b);
    }
}
