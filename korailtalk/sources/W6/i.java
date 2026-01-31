package W6;

import R6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements d, Y6.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f5385b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f5386c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    private final d f5387a;
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(d<Object> delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5387a = delegate;
        this.result = obj;
    }

    @Override // Y6.e
    public Y6.e getCallerFrame() {
        d dVar = this.f5387a;
        if (dVar instanceof Y6.e) {
            return (Y6.e) dVar;
        }
        return null;
    }

    @Override // W6.d
    public g getContext() {
        return this.f5387a.getContext();
    }

    public final Object getOrThrow() throws Throwable {
        Object obj = this.result;
        X6.a aVar = X6.a.UNDECIDED;
        if (obj == aVar) {
            if (androidx.concurrent.futures.b.a(f5386c, this, aVar, X6.b.getCOROUTINE_SUSPENDED())) {
                return X6.b.getCOROUTINE_SUSPENDED();
            }
            obj = this.result;
        }
        if (obj == X6.a.RESUMED) {
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        if (obj instanceof q.b) {
            throw ((q.b) obj).exception;
        }
        return obj;
    }

    @Override // Y6.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // W6.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            X6.a aVar = X6.a.UNDECIDED;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.b.a(f5386c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != X6.b.getCOROUTINE_SUSPENDED()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f5386c, this, X6.b.getCOROUTINE_SUSPENDED(), X6.a.RESUMED)) {
                    this.f5387a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f5387a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<Object> delegate) {
        this(delegate, X6.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
