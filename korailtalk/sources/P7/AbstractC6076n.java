package p7;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC5991k0;
import p7.InterfaceC6098w;

/* renamed from: p7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6076n {

    /* renamed from: p7.n$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f34696d;

        /* renamed from: e, reason: collision with root package name */
        Object f34697e;

        /* renamed from: f, reason: collision with root package name */
        Object f34698f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f34699g;

        /* renamed from: h, reason: collision with root package name */
        int f34700h;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34699g = obj;
            this.f34700h |= Integer.MIN_VALUE;
            return AbstractC6076n.consumeEach((InterfaceC6098w) null, (f7.l) null, this);
        }
    }

    /* renamed from: p7.n$b */
    static final class b extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f34701d;

        /* renamed from: e, reason: collision with root package name */
        Object f34702e;

        /* renamed from: f, reason: collision with root package name */
        Object f34703f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f34704g;

        /* renamed from: h, reason: collision with root package name */
        int f34705h;

        b(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34704g = obj;
            this.f34705h |= Integer.MIN_VALUE;
            return AbstractC6076n.consumeEach((InterfaceC6063a) null, (f7.l) null, this);
        }
    }

    /* renamed from: p7.n$c */
    static final class c extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f34706d;

        /* renamed from: e, reason: collision with root package name */
        Object f34707e;

        /* renamed from: f, reason: collision with root package name */
        Object f34708f;

        /* renamed from: g, reason: collision with root package name */
        Object f34709g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f34710h;

        /* renamed from: i, reason: collision with root package name */
        int f34711i;

        c(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34710h = obj;
            this.f34711i |= Integer.MIN_VALUE;
            return AbstractC6074l.toList(null, this);
        }
    }

    public static final void cancelConsumed(InterfaceC6098w interfaceC6098w, Throwable th) {
        if (th != null) {
            CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (CancellationException == null) {
                CancellationException = AbstractC5991k0.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC6098w.cancel(CancellationException);
    }

    public static final <E, R> R consume(InterfaceC6063a interfaceC6063a, f7.l lVar) {
        InterfaceC6098w interfaceC6098wB = interfaceC6063a.b();
        try {
            return (R) lVar.invoke(interfaceC6098wB);
        } finally {
            InlineMarker.finallyStart(1);
            InterfaceC6098w.a.cancel$default(interfaceC6098wB, (CancellationException) null, 1, (Object) null);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:39:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(p7.InterfaceC6098w r5, f7.l r6, W6.d<? super R6.G> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p7.AbstractC6076n.a
            if (r0 == 0) goto L13
            r0 = r7
            p7.n$a r0 = (p7.AbstractC6076n.a) r0
            int r1 = r0.f34700h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34700h = r1
            goto L18
        L13:
            p7.n$a r0 = new p7.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34699g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34700h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f34698f
            p7.g r5 = (p7.InterfaceC6069g) r5
            java.lang.Object r6 = r0.f34697e
            p7.w r6 = (p7.InterfaceC6098w) r6
            java.lang.Object r2 = r0.f34696d
            f7.l r2 = (f7.l) r2
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L80
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            R6.r.throwOnFailure(r7)
            p7.g r7 = r5.iterator()     // Catch: java.lang.Throwable -> L7c
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f34696d = r7     // Catch: java.lang.Throwable -> L35
            r0.f34697e = r6     // Catch: java.lang.Throwable -> L35
            r0.f34698f = r5     // Catch: java.lang.Throwable -> L35
            r0.f34700h = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r4 = r2
            r2 = r7
            r7 = r4
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            r2.invoke(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            R6.G r5 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L35
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r5 = 0
            p7.AbstractC6074l.cancelConsumed(r6, r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            R6.G r5 = R6.G.INSTANCE
            return r5
        L7c:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L80:
            throw r5     // Catch: java.lang.Throwable -> L81
        L81:
            r7 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            p7.AbstractC6074l.cancelConsumed(r6, r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6076n.consumeEach(p7.w, f7.l, W6.d):java.lang.Object");
    }

    public static final /* synthetic */ v7.f onReceiveOrNull(InterfaceC6098w interfaceC6098w) {
        Intrinsics.checkNotNull(interfaceC6098w, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return interfaceC6098w.getOnReceiveOrNull();
    }

    public static final /* synthetic */ Object receiveOrNull(InterfaceC6098w interfaceC6098w, W6.d dVar) {
        Intrinsics.checkNotNull(interfaceC6098w, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return interfaceC6098w.receiveOrNull(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object toList(p7.InterfaceC6098w r7, W6.d<? super java.util.List<? extends E>> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6076n.c
            if (r0 == 0) goto L13
            r0 = r8
            p7.n$c r0 = (p7.AbstractC6076n.c) r0
            int r1 = r0.f34711i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34711i = r1
            goto L18
        L13:
            p7.n$c r0 = new p7.n$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34710h
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34711i
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f34709g
            p7.g r7 = (p7.InterfaceC6069g) r7
            java.lang.Object r2 = r0.f34708f
            p7.w r2 = (p7.InterfaceC6098w) r2
            java.lang.Object r4 = r0.f34707e
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.f34706d
            java.util.List r5 = (java.util.List) r5
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L39
            goto L67
        L39:
            r7 = move-exception
            r8 = r2
            goto L89
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            R6.r.throwOnFailure(r8)
            java.util.List r8 = S6.r.createListBuilder()
            p7.g r2 = r7.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r8
            r5 = r4
            r8 = r7
            r7 = r2
        L53:
            r0.f34706d = r5     // Catch: java.lang.Throwable -> L83
            r0.f34707e = r4     // Catch: java.lang.Throwable -> L83
            r0.f34708f = r8     // Catch: java.lang.Throwable -> L83
            r0.f34709g = r7     // Catch: java.lang.Throwable -> L83
            r0.f34711i = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L64
            return r1
        L64:
            r6 = r2
            r2 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L39
            r4.add(r8)     // Catch: java.lang.Throwable -> L39
            r8 = r2
            goto L53
        L78:
            R6.G r7 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L39
            r7 = 0
            p7.AbstractC6074l.cancelConsumed(r2, r7)
            java.util.List r7 = S6.r.build(r5)
            return r7
        L83:
            r7 = move-exception
            goto L89
        L85:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L89:
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            p7.AbstractC6074l.cancelConsumed(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6076n.toList(p7.w, W6.d):java.lang.Object");
    }

    public static final <E, R> R consume(InterfaceC6098w interfaceC6098w, f7.l lVar) {
        try {
            R r8 = (R) lVar.invoke(interfaceC6098w);
            InlineMarker.finallyStart(1);
            AbstractC6074l.cancelConsumed(interfaceC6098w, null);
            InlineMarker.finallyEnd(1);
            return r8;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d, B:31:0x007a), top: B:40:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d, B:31:0x007a), top: B:40:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(p7.InterfaceC6063a r6, f7.l r7, W6.d<? super R6.G> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6076n.b
            if (r0 == 0) goto L13
            r0 = r8
            p7.n$b r0 = (p7.AbstractC6076n.b) r0
            int r1 = r0.f34705h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34705h = r1
            goto L18
        L13:
            p7.n$b r0 = new p7.n$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34704g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34705h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r6 = r0.f34703f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f34702e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f34701d
            f7.l r2 = (f7.l) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3a
            r5 = r0
            r0 = r7
            r7 = r2
        L38:
            r2 = r5
            goto L65
        L3a:
            r6 = move-exception
            goto L8f
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            R6.r.throwOnFailure(r8)
            p7.w r6 = r6.b()
            p7.g r8 = r6.iterator()     // Catch: java.lang.Throwable -> L8b
            r5 = r8
            r8 = r6
            r6 = r5
        L52:
            r0.f34701d = r7     // Catch: java.lang.Throwable -> L88
            r0.f34702e = r8     // Catch: java.lang.Throwable -> L88
            r0.f34703f = r6     // Catch: java.lang.Throwable -> L88
            r0.f34705h = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != r1) goto L61
            return r1
        L61:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L38
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L77
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L77
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L77
            r8 = r0
            r0 = r2
            goto L52
        L77:
            r6 = move-exception
            r7 = r0
            goto L8f
        L7a:
            R6.G r6 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L77
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            p7.InterfaceC6098w.a.cancel$default(r0, r3, r4, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            R6.G r6 = R6.G.INSTANCE
            return r6
        L88:
            r6 = move-exception
            r7 = r8
            goto L8f
        L8b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L8f:
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            p7.InterfaceC6098w.a.cancel$default(r7, r3, r4, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6076n.consumeEach(p7.a, f7.l, W6.d):java.lang.Object");
    }
}
