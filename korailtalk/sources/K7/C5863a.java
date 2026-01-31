package k7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5863a implements m {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f33660a;

    public C5863a(m sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f33660a = new AtomicReference(sequence);
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        m mVar = (m) this.f33660a.getAndSet(null);
        if (mVar != null) {
            return mVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
