package w7;

import W6.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p7.AbstractC6072j;
import s7.H;

/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6479d extends H {

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReferenceArray f37479d;

    public C6479d(long j8, C6479d c6479d, int i8) {
        super(j8, c6479d, i8);
        this.f37479d = new AtomicReferenceArray(AbstractC6478c.f37474f);
    }

    public final boolean cas(int i8, Object obj, Object obj2) {
        return AbstractC6072j.a(getAcquirers(), i8, obj, obj2);
    }

    public final Object get(int i8) {
        return getAcquirers().get(i8);
    }

    public final AtomicReferenceArray getAcquirers() {
        return this.f37479d;
    }

    public final Object getAndSet(int i8, Object obj) {
        return getAcquirers().getAndSet(i8, obj);
    }

    @Override // s7.H
    public int getNumberOfSlots() {
        return AbstractC6478c.f37474f;
    }

    @Override // s7.H
    public void onCancellation(int i8, Throwable th, g gVar) {
        getAcquirers().set(i8, AbstractC6478c.f37473e);
        onSlotCleaned();
    }

    public final void set(int i8, Object obj) {
        getAcquirers().set(i8, obj);
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
