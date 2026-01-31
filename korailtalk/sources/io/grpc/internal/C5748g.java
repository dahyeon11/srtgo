package io.grpc.internal;

import io.grpc.internal.C5766o0;
import io.grpc.internal.Q0;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: io.grpc.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5748g implements C5766o0.b {

    /* renamed from: a, reason: collision with root package name */
    private final d f32736a;

    /* renamed from: b, reason: collision with root package name */
    private final C5766o0.b f32737b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f32738c = new ArrayDeque();

    /* renamed from: io.grpc.internal.g$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f32739a;

        a(int i8) {
            this.f32739a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5748g.this.f32737b.bytesRead(this.f32739a);
        }
    }

    /* renamed from: io.grpc.internal.g$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32741a;

        b(boolean z8) {
            this.f32741a = z8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5748g.this.f32737b.deframerClosed(this.f32741a);
        }
    }

    /* renamed from: io.grpc.internal.g$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f32743a;

        c(Throwable th) {
            this.f32743a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5748g.this.f32737b.deframeFailed(this.f32743a);
        }
    }

    /* renamed from: io.grpc.internal.g$d */
    public interface d {
        void runOnTransportThread(Runnable runnable);
    }

    public C5748g(C5766o0.b bVar, d dVar) {
        this.f32737b = (C5766o0.b) e3.w.checkNotNull(bVar, "listener");
        this.f32736a = (d) e3.w.checkNotNull(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.C5766o0.b
    public void bytesRead(int i8) {
        this.f32736a.runOnTransportThread(new a(i8));
    }

    @Override // io.grpc.internal.C5766o0.b
    public void deframeFailed(Throwable th) {
        this.f32736a.runOnTransportThread(new c(th));
    }

    @Override // io.grpc.internal.C5766o0.b
    public void deframerClosed(boolean z8) {
        this.f32736a.runOnTransportThread(new b(z8));
    }

    public InputStream messageReadQueuePoll() {
        return (InputStream) this.f32738c.poll();
    }

    @Override // io.grpc.internal.C5766o0.b
    public void messagesAvailable(Q0.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f32738c.add(next);
            }
        }
    }
}
