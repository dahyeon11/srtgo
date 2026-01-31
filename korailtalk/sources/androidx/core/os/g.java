package androidx.core.os;

import R6.q;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class g extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final W6.d f9029a;

    public g(W6.d<Object> dVar) {
        super(false);
        this.f9029a = dVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            W6.d dVar = this.f9029a;
            q.a aVar = R6.q.Companion;
            dVar.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f9029a.resumeWith(R6.q.m67constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
