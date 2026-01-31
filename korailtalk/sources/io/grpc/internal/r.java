package io.grpc.internal;

import io.grpc.AbstractC5786j;
import io.grpc.AbstractC5805w;
import io.grpc.C5713a;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.C5801s;
import io.grpc.C5804v;
import io.grpc.C5806x;
import io.grpc.C5808z;
import io.grpc.InterfaceC5796o;
import io.grpc.J0;
import io.grpc.internal.C5762m0;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.Q0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class r extends AbstractC5786j {

    /* renamed from: t, reason: collision with root package name */
    private static final Logger f33103t = Logger.getLogger(r.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final byte[] f33104u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v, reason: collision with root package name */
    private static final double f33105v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a, reason: collision with root package name */
    private final C5730i0 f33106a;

    /* renamed from: b, reason: collision with root package name */
    private final P6.e f33107b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f33108c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33109d;

    /* renamed from: e, reason: collision with root package name */
    private final C5765o f33110e;

    /* renamed from: f, reason: collision with root package name */
    private final C5804v f33111f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ScheduledFuture f33112g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33113h;

    /* renamed from: i, reason: collision with root package name */
    private C5721e f33114i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC5772s f33115j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f33116k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33117l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33118m;

    /* renamed from: n, reason: collision with root package name */
    private final e f33119n;

    /* renamed from: p, reason: collision with root package name */
    private final ScheduledExecutorService f33121p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f33122q;

    /* renamed from: o, reason: collision with root package name */
    private final f f33120o = new f();

    /* renamed from: r, reason: collision with root package name */
    private C5808z f33123r = C5808z.getDefaultInstance();

    /* renamed from: s, reason: collision with root package name */
    private C5801s f33124s = C5801s.getDefaultInstance();

    class b extends AbstractRunnableC5785z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5786j.a f33125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC5786j.a aVar) {
            super(r.this.f33111f);
            this.f33125b = aVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC5785z
        public void runInContext() {
            r rVar = r.this;
            rVar.m(this.f33125b, AbstractC5805w.statusFromCancelled(rVar.f33111f), new C5728h0());
        }
    }

    class c extends AbstractRunnableC5785z {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5786j.a f33127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33128c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC5786j.a aVar, String str) {
            super(r.this.f33111f);
            this.f33127b = aVar;
            this.f33128c = str;
        }

        @Override // io.grpc.internal.AbstractRunnableC5785z
        public void runInContext() {
            r.this.m(this.f33127b, io.grpc.J0.INTERNAL.withDescription(String.format("Unable to find compressor by name %s", this.f33128c)), new C5728h0());
        }
    }

    private class d implements InterfaceC5774t {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5786j.a f33130a;

        /* renamed from: b, reason: collision with root package name */
        private io.grpc.J0 f33131b;

        final class a extends AbstractRunnableC5785z {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ P6.b f33133b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C5728h0 f33134c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P6.b bVar, C5728h0 c5728h0) {
                super(r.this.f33111f);
                this.f33133b = bVar;
                this.f33134c = c5728h0;
            }

            private void a() {
                if (d.this.f33131b != null) {
                    return;
                }
                try {
                    d.this.f33130a.onHeaders(this.f33134c);
                } catch (Throwable th) {
                    d.this.e(io.grpc.J0.CANCELLED.withCause(th).withDescription("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5785z
            public void runInContext() {
                P6.f fVarTraceTask = P6.c.traceTask("ClientCall$Listener.headersRead");
                try {
                    P6.c.attachTag(r.this.f33107b);
                    P6.c.linkIn(this.f33133b);
                    a();
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    if (fVarTraceTask != null) {
                        try {
                            fVarTraceTask.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        final class b extends AbstractRunnableC5785z {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ P6.b f33136b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q0.a f33137c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P6.b bVar, Q0.a aVar) {
                super(r.this.f33111f);
                this.f33136b = bVar;
                this.f33137c = aVar;
            }

            private void a() throws IOException {
                if (d.this.f33131b != null) {
                    U.b(this.f33137c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f33137c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f33130a.onMessage(r.this.f33106a.parseResponse(next));
                            next.close();
                        } catch (Throwable th) {
                            U.closeQuietly(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        U.b(this.f33137c);
                        d.this.e(io.grpc.J0.CANCELLED.withCause(th2).withDescription("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5785z
            public void runInContext() {
                P6.f fVarTraceTask = P6.c.traceTask("ClientCall$Listener.messagesAvailable");
                try {
                    P6.c.attachTag(r.this.f33107b);
                    P6.c.linkIn(this.f33136b);
                    a();
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    if (fVarTraceTask != null) {
                        try {
                            fVarTraceTask.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        final class c extends AbstractRunnableC5785z {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ P6.b f33139b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ io.grpc.J0 f33140c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C5728h0 f33141d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(P6.b bVar, io.grpc.J0 j02, C5728h0 c5728h0) {
                super(r.this.f33111f);
                this.f33139b = bVar;
                this.f33140c = j02;
                this.f33141d = c5728h0;
            }

            private void a() {
                io.grpc.J0 j02 = this.f33140c;
                C5728h0 c5728h0 = this.f33141d;
                if (d.this.f33131b != null) {
                    j02 = d.this.f33131b;
                    c5728h0 = new C5728h0();
                }
                r.this.f33116k = true;
                try {
                    d dVar = d.this;
                    r.this.m(dVar.f33130a, j02, c5728h0);
                } finally {
                    r.this.t();
                    r.this.f33110e.reportCallEnded(j02.isOk());
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5785z
            public void runInContext() {
                P6.f fVarTraceTask = P6.c.traceTask("ClientCall$Listener.onClose");
                try {
                    P6.c.attachTag(r.this.f33107b);
                    P6.c.linkIn(this.f33139b);
                    a();
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    if (fVarTraceTask != null) {
                        try {
                            fVarTraceTask.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        /* renamed from: io.grpc.internal.r$d$d, reason: collision with other inner class name */
        final class C0325d extends AbstractRunnableC5785z {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ P6.b f33143b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0325d(P6.b bVar) {
                super(r.this.f33111f);
                this.f33143b = bVar;
            }

            private void a() {
                if (d.this.f33131b != null) {
                    return;
                }
                try {
                    d.this.f33130a.onReady();
                } catch (Throwable th) {
                    d.this.e(io.grpc.J0.CANCELLED.withCause(th).withDescription("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC5785z
            public void runInContext() {
                P6.f fVarTraceTask = P6.c.traceTask("ClientCall$Listener.onReady");
                try {
                    P6.c.attachTag(r.this.f33107b);
                    P6.c.linkIn(this.f33143b);
                    a();
                    if (fVarTraceTask != null) {
                        fVarTraceTask.close();
                    }
                } catch (Throwable th) {
                    if (fVarTraceTask != null) {
                        try {
                            fVarTraceTask.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        public d(AbstractC5786j.a aVar) {
            this.f33130a = (AbstractC5786j.a) e3.w.checkNotNull(aVar, "observer");
        }

        private void d(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            C5806x c5806xN = r.this.n();
            if (j02.getCode() == J0.b.CANCELLED && c5806xN != null && c5806xN.isExpired()) {
                C5737a0 c5737a0 = new C5737a0();
                r.this.f33115j.appendTimeoutInsight(c5737a0);
                j02 = io.grpc.J0.DEADLINE_EXCEEDED.augmentDescription("ClientCall was cancelled at or after deadline. " + c5737a0);
                c5728h0 = new C5728h0();
            }
            r.this.f33108c.execute(new c(P6.c.linkOut(), j02, c5728h0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(io.grpc.J0 j02) {
            this.f33131b = j02;
            r.this.f33115j.cancel(j02);
        }

        @Override // io.grpc.internal.InterfaceC5774t
        public void closed(io.grpc.J0 j02, InterfaceC5774t.a aVar, C5728h0 c5728h0) {
            P6.f fVarTraceTask = P6.c.traceTask("ClientStreamListener.closed");
            try {
                P6.c.attachTag(r.this.f33107b);
                d(j02, aVar, c5728h0);
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (fVarTraceTask != null) {
                    try {
                        fVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t
        public void headersRead(C5728h0 c5728h0) {
            P6.f fVarTraceTask = P6.c.traceTask("ClientStreamListener.headersRead");
            try {
                P6.c.attachTag(r.this.f33107b);
                r.this.f33108c.execute(new a(P6.c.linkOut(), c5728h0));
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (fVarTraceTask != null) {
                    try {
                        fVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
        public void messagesAvailable(Q0.a aVar) {
            P6.f fVarTraceTask = P6.c.traceTask("ClientStreamListener.messagesAvailable");
            try {
                P6.c.attachTag(r.this.f33107b);
                r.this.f33108c.execute(new b(P6.c.linkOut(), aVar));
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (fVarTraceTask != null) {
                    try {
                        fVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.InterfaceC5774t, io.grpc.internal.Q0
        public void onReady() {
            if (r.this.f33106a.getType().clientSendsOneMessage()) {
                return;
            }
            P6.f fVarTraceTask = P6.c.traceTask("ClientStreamListener.onReady");
            try {
                P6.c.attachTag(r.this.f33107b);
                r.this.f33108c.execute(new C0325d(P6.c.linkOut()));
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } catch (Throwable th) {
                if (fVarTraceTask != null) {
                    try {
                        fVarTraceTask.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    interface e {
        InterfaceC5772s newStream(C5730i0 c5730i0, C5721e c5721e, C5728h0 c5728h0, C5804v c5804v);
    }

    private final class f implements C5804v.f {
        private f() {
        }

        @Override // io.grpc.C5804v.f
        public void cancelled(C5804v c5804v) {
            r.this.f33115j.cancel(AbstractC5805w.statusFromCancelled(c5804v));
        }
    }

    private class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f33146a;

        g(long j8) {
            this.f33146a = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5737a0 c5737a0 = new C5737a0();
            r.this.f33115j.appendTimeoutInsight(c5737a0);
            long jAbs = Math.abs(this.f33146a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f33146a) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f33146a < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            sb.append(c5737a0);
            r.this.f33115j.cancel(io.grpc.J0.DEADLINE_EXCEEDED.augmentDescription(sb.toString()));
        }
    }

    r(C5730i0 c5730i0, Executor executor, C5721e c5721e, e eVar, ScheduledExecutorService scheduledExecutorService, C5765o c5765o, io.grpc.P p8) {
        this.f33106a = c5730i0;
        P6.e eVarCreateTag = P6.c.createTag(c5730i0.getFullMethodName(), System.identityHashCode(this));
        this.f33107b = eVarCreateTag;
        if (executor == com.google.common.util.concurrent.H.directExecutor()) {
            this.f33108c = new I0();
            this.f33109d = true;
        } else {
            this.f33108c = new J0(executor);
            this.f33109d = false;
        }
        this.f33110e = c5765o;
        this.f33111f = C5804v.current();
        this.f33113h = c5730i0.getType() == C5730i0.d.UNARY || c5730i0.getType() == C5730i0.d.SERVER_STREAMING;
        this.f33114i = c5721e;
        this.f33119n = eVar;
        this.f33121p = scheduledExecutorService;
        P6.c.event("ClientCall.<init>", eVarCreateTag);
    }

    private void k() {
        C5762m0.b bVar = (C5762m0.b) this.f33114i.getOption(C5762m0.b.f33007g);
        if (bVar == null) {
            return;
        }
        Long l8 = bVar.f33008a;
        if (l8 != null) {
            C5806x c5806xAfter = C5806x.after(l8.longValue(), TimeUnit.NANOSECONDS);
            C5806x deadline = this.f33114i.getDeadline();
            if (deadline == null || c5806xAfter.compareTo(deadline) < 0) {
                this.f33114i = this.f33114i.withDeadline(c5806xAfter);
            }
        }
        Boolean bool = bVar.f33009b;
        if (bool != null) {
            this.f33114i = bool.booleanValue() ? this.f33114i.withWaitForReady() : this.f33114i.withoutWaitForReady();
        }
        if (bVar.f33010c != null) {
            Integer maxInboundMessageSize = this.f33114i.getMaxInboundMessageSize();
            if (maxInboundMessageSize != null) {
                this.f33114i = this.f33114i.withMaxInboundMessageSize(Math.min(maxInboundMessageSize.intValue(), bVar.f33010c.intValue()));
            } else {
                this.f33114i = this.f33114i.withMaxInboundMessageSize(bVar.f33010c.intValue());
            }
        }
        if (bVar.f33011d != null) {
            Integer maxOutboundMessageSize = this.f33114i.getMaxOutboundMessageSize();
            if (maxOutboundMessageSize != null) {
                this.f33114i = this.f33114i.withMaxOutboundMessageSize(Math.min(maxOutboundMessageSize.intValue(), bVar.f33011d.intValue()));
            } else {
                this.f33114i = this.f33114i.withMaxOutboundMessageSize(bVar.f33011d.intValue());
            }
        }
    }

    private void l(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f33103t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f33117l) {
            return;
        }
        this.f33117l = true;
        try {
            if (this.f33115j != null) {
                io.grpc.J0 j02 = io.grpc.J0.CANCELLED;
                io.grpc.J0 j0WithDescription = str != null ? j02.withDescription(str) : j02.withDescription("Call cancelled without message");
                if (th != null) {
                    j0WithDescription = j0WithDescription.withCause(th);
                }
                this.f33115j.cancel(j0WithDescription);
            }
            t();
        } catch (Throwable th2) {
            t();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(AbstractC5786j.a aVar, io.grpc.J0 j02, C5728h0 c5728h0) {
        aVar.onClose(j02, c5728h0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C5806x n() {
        return r(this.f33114i.getDeadline(), this.f33111f.getDeadline());
    }

    private void o() {
        e3.w.checkState(this.f33115j != null, "Not started");
        e3.w.checkState(!this.f33117l, "call was cancelled");
        e3.w.checkState(!this.f33118m, "call already half-closed");
        this.f33118m = true;
        this.f33115j.halfClose();
    }

    private static boolean p(C5806x c5806x, C5806x c5806x2) {
        if (c5806x == null) {
            return false;
        }
        if (c5806x2 == null) {
            return true;
        }
        return c5806x.isBefore(c5806x2);
    }

    private static void q(C5806x c5806x, C5806x c5806x2, C5806x c5806x3) {
        Logger logger = f33103t;
        if (logger.isLoggable(Level.FINE) && c5806x != null && c5806x.equals(c5806x2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jMax = Math.max(0L, c5806x.timeRemaining(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jMax)));
            if (c5806x3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c5806x3.timeRemaining(timeUnit))));
            }
            logger.fine(sb.toString());
        }
    }

    private static C5806x r(C5806x c5806x, C5806x c5806x2) {
        return c5806x == null ? c5806x2 : c5806x2 == null ? c5806x : c5806x.minimum(c5806x2);
    }

    static void s(C5728h0 c5728h0, C5808z c5808z, io.grpc.r rVar, boolean z8) {
        c5728h0.discardAll(U.f32534c);
        C5728h0.i iVar = U.MESSAGE_ENCODING_KEY;
        c5728h0.discardAll(iVar);
        if (rVar != InterfaceC5796o.b.NONE) {
            c5728h0.put(iVar, rVar.getMessageEncoding());
        }
        C5728h0.i iVar2 = U.MESSAGE_ACCEPT_ENCODING_KEY;
        c5728h0.discardAll(iVar2);
        byte[] rawAdvertisedMessageEncodings = io.grpc.Q.getRawAdvertisedMessageEncodings(c5808z);
        if (rawAdvertisedMessageEncodings.length != 0) {
            c5728h0.put(iVar2, rawAdvertisedMessageEncodings);
        }
        c5728h0.discardAll(U.CONTENT_ENCODING_KEY);
        C5728h0.i iVar3 = U.CONTENT_ACCEPT_ENCODING_KEY;
        c5728h0.discardAll(iVar3);
        if (z8) {
            c5728h0.put(iVar3, f33104u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.f33111f.removeListener(this.f33120o);
        ScheduledFuture scheduledFuture = this.f33112g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void u(Object obj) {
        e3.w.checkState(this.f33115j != null, "Not started");
        e3.w.checkState(!this.f33117l, "call was cancelled");
        e3.w.checkState(!this.f33118m, "call was half-closed");
        try {
            InterfaceC5772s interfaceC5772s = this.f33115j;
            if (interfaceC5772s instanceof C0) {
                ((C0) interfaceC5772s).Y(obj);
            } else {
                interfaceC5772s.writeMessage(this.f33106a.streamRequest(obj));
            }
            if (this.f33113h) {
                return;
            }
            this.f33115j.flush();
        } catch (Error e8) {
            this.f33115j.cancel(io.grpc.J0.CANCELLED.withDescription("Client sendMessage() failed with Error"));
            throw e8;
        } catch (RuntimeException e9) {
            this.f33115j.cancel(io.grpc.J0.CANCELLED.withCause(e9).withDescription("Failed to stream message"));
        }
    }

    private ScheduledFuture y(C5806x c5806x) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jTimeRemaining = c5806x.timeRemaining(timeUnit);
        return this.f33121p.schedule(new RunnableC5749g0(new g(jTimeRemaining)), jTimeRemaining, timeUnit);
    }

    private void z(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        io.grpc.r rVarLookupCompressor;
        e3.w.checkState(this.f33115j == null, "Already started");
        e3.w.checkState(!this.f33117l, "call was cancelled");
        e3.w.checkNotNull(aVar, "observer");
        e3.w.checkNotNull(c5728h0, "headers");
        if (this.f33111f.isCancelled()) {
            this.f33115j = C5771r0.INSTANCE;
            this.f33108c.execute(new b(aVar));
            return;
        }
        k();
        String compressor = this.f33114i.getCompressor();
        if (compressor != null) {
            rVarLookupCompressor = this.f33124s.lookupCompressor(compressor);
            if (rVarLookupCompressor == null) {
                this.f33115j = C5771r0.INSTANCE;
                this.f33108c.execute(new c(aVar, compressor));
                return;
            }
        } else {
            rVarLookupCompressor = InterfaceC5796o.b.NONE;
        }
        s(c5728h0, this.f33123r, rVarLookupCompressor, this.f33122q);
        C5806x c5806xN = n();
        if (c5806xN == null || !c5806xN.isExpired()) {
            q(c5806xN, this.f33111f.getDeadline(), this.f33114i.getDeadline());
            this.f33115j = this.f33119n.newStream(this.f33106a, this.f33114i, c5728h0, this.f33111f);
        } else {
            this.f33115j = new H(io.grpc.J0.DEADLINE_EXCEEDED.withDescription(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", p(this.f33114i.getDeadline(), this.f33111f.getDeadline()) ? "CallOptions" : "Context", Double.valueOf(c5806xN.timeRemaining(TimeUnit.NANOSECONDS) / f33105v))), U.getClientStreamTracers(this.f33114i, c5728h0, 0, false));
        }
        if (this.f33109d) {
            this.f33115j.optimizeForDirectExecutor();
        }
        if (this.f33114i.getAuthority() != null) {
            this.f33115j.setAuthority(this.f33114i.getAuthority());
        }
        if (this.f33114i.getMaxInboundMessageSize() != null) {
            this.f33115j.setMaxInboundMessageSize(this.f33114i.getMaxInboundMessageSize().intValue());
        }
        if (this.f33114i.getMaxOutboundMessageSize() != null) {
            this.f33115j.setMaxOutboundMessageSize(this.f33114i.getMaxOutboundMessageSize().intValue());
        }
        if (c5806xN != null) {
            this.f33115j.setDeadline(c5806xN);
        }
        this.f33115j.setCompressor(rVarLookupCompressor);
        boolean z8 = this.f33122q;
        if (z8) {
            this.f33115j.setFullStreamDecompression(z8);
        }
        this.f33115j.setDecompressorRegistry(this.f33123r);
        this.f33110e.reportCallStarted();
        this.f33115j.start(new d(aVar));
        this.f33111f.addListener(this.f33120o, com.google.common.util.concurrent.H.directExecutor());
        if (c5806xN != null && !c5806xN.equals(this.f33111f.getDeadline()) && this.f33121p != null) {
            this.f33112g = y(c5806xN);
        }
        if (this.f33116k) {
            t();
        }
    }

    @Override // io.grpc.AbstractC5786j
    public void cancel(String str, Throwable th) {
        P6.f fVarTraceTask = P6.c.traceTask("ClientCall.cancel");
        try {
            P6.c.attachTag(this.f33107b);
            l(str, th);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.grpc.AbstractC5786j
    public C5713a getAttributes() {
        InterfaceC5772s interfaceC5772s = this.f33115j;
        return interfaceC5772s != null ? interfaceC5772s.getAttributes() : C5713a.EMPTY;
    }

    @Override // io.grpc.AbstractC5786j
    public void halfClose() {
        P6.f fVarTraceTask = P6.c.traceTask("ClientCall.halfClose");
        try {
            P6.c.attachTag(this.f33107b);
            o();
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.grpc.AbstractC5786j
    public boolean isReady() {
        if (this.f33118m) {
            return false;
        }
        return this.f33115j.isReady();
    }

    @Override // io.grpc.AbstractC5786j
    public void request(int i8) {
        P6.f fVarTraceTask = P6.c.traceTask("ClientCall.request");
        try {
            P6.c.attachTag(this.f33107b);
            e3.w.checkState(this.f33115j != null, "Not started");
            e3.w.checkArgument(i8 >= 0, "Number requested must be non-negative");
            this.f33115j.request(i8);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.grpc.AbstractC5786j
    public void sendMessage(Object obj) {
        P6.f fVarTraceTask = P6.c.traceTask("ClientCall.sendMessage");
        try {
            P6.c.attachTag(this.f33107b);
            u(obj);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.grpc.AbstractC5786j
    public void setMessageCompression(boolean z8) {
        e3.w.checkState(this.f33115j != null, "Not started");
        this.f33115j.setMessageCompression(z8);
    }

    @Override // io.grpc.AbstractC5786j
    public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        P6.f fVarTraceTask = P6.c.traceTask("ClientCall.start");
        try {
            P6.c.attachTag(this.f33107b);
            z(aVar, c5728h0);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("method", this.f33106a).toString();
    }

    r v(C5801s c5801s) {
        this.f33124s = c5801s;
        return this;
    }

    r w(C5808z c5808z) {
        this.f33123r = c5808z;
        return this;
    }

    r x(boolean z8) {
        this.f33122q = z8;
        return this;
    }
}
