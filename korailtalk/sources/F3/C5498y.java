package f3;

import java.util.Queue;

/* renamed from: f3.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5498y extends AbstractC5452b {

    /* renamed from: c, reason: collision with root package name */
    private final Queue f31192c;

    C5498y(Queue queue) {
        this.f31192c = (Queue) e3.w.checkNotNull(queue);
    }

    @Override // f3.AbstractC5452b
    protected Object computeNext() {
        return this.f31192c.isEmpty() ? a() : this.f31192c.remove();
    }
}
