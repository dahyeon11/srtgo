package io.grpc;

import io.grpc.H;
import io.grpc.J0;
import io.grpc.w0;
import java.util.concurrent.TimeoutException;

/* renamed from: io.grpc.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5805w {

    /* renamed from: io.grpc.w$a */
    private static class a extends H.a {

        /* renamed from: b, reason: collision with root package name */
        private final C5804v f33382b;

        public a(w0.a aVar, C5804v c5804v) {
            super(aVar);
            this.f33382b = c5804v;
        }

        @Override // io.grpc.H.a, io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public void onCancel() {
            C5804v c5804vAttach = this.f33382b.attach();
            try {
                super.onCancel();
            } finally {
                this.f33382b.detach(c5804vAttach);
            }
        }

        @Override // io.grpc.H.a, io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public void onComplete() {
            C5804v c5804vAttach = this.f33382b.attach();
            try {
                super.onComplete();
            } finally {
                this.f33382b.detach(c5804vAttach);
            }
        }

        @Override // io.grpc.H.a, io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public void onHalfClose() {
            C5804v c5804vAttach = this.f33382b.attach();
            try {
                super.onHalfClose();
            } finally {
                this.f33382b.detach(c5804vAttach);
            }
        }

        @Override // io.grpc.H, io.grpc.w0.a
        public void onMessage(Object obj) {
            C5804v c5804vAttach = this.f33382b.attach();
            try {
                super.onMessage(obj);
            } finally {
                this.f33382b.detach(c5804vAttach);
            }
        }

        @Override // io.grpc.H.a, io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public void onReady() {
            C5804v c5804vAttach = this.f33382b.attach();
            try {
                super.onReady();
            } finally {
                this.f33382b.detach(c5804vAttach);
            }
        }
    }

    public static <ReqT, RespT> w0.a interceptCall(C5804v c5804v, w0 w0Var, C5728h0 c5728h0, y0 y0Var) {
        C5804v c5804vAttach = c5804v.attach();
        try {
            return new a(y0Var.startCall(w0Var, c5728h0), c5804v);
        } finally {
            c5804v.detach(c5804vAttach);
        }
    }

    public static J0 statusFromCancelled(C5804v c5804v) {
        e3.w.checkNotNull(c5804v, "context must not be null");
        if (!c5804v.isCancelled()) {
            return null;
        }
        Throwable thCancellationCause = c5804v.cancellationCause();
        if (thCancellationCause == null) {
            return J0.CANCELLED.withDescription("io.grpc.Context was cancelled without error");
        }
        if (thCancellationCause instanceof TimeoutException) {
            return J0.DEADLINE_EXCEEDED.withDescription(thCancellationCause.getMessage()).withCause(thCancellationCause);
        }
        J0 j0FromThrowable = J0.fromThrowable(thCancellationCause);
        return (J0.b.UNKNOWN.equals(j0FromThrowable.getCode()) && j0FromThrowable.getCause() == thCancellationCause) ? J0.CANCELLED.withDescription("Context cancelled").withCause(thCancellationCause) : j0FromThrowable.withCause(thCancellationCause);
    }
}
