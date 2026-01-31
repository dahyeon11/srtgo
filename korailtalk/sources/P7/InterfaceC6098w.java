package p7;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import s7.J;

/* renamed from: p7.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6098w {

    /* renamed from: p7.w$a */
    public static final class a {

        /* renamed from: p7.w$a$a, reason: collision with other inner class name */
        static final class C0368a extends Y6.d {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f34909d;

            /* renamed from: e, reason: collision with root package name */
            int f34910e;

            C0368a(W6.d dVar) {
                super(dVar);
            }

            @Override // Y6.a
            public final Object invokeSuspend(Object obj) {
                this.f34909d = obj;
                this.f34910e |= Integer.MIN_VALUE;
                return a.receiveOrNull(null, this);
            }
        }

        public static /* synthetic */ void cancel$default(InterfaceC6098w interfaceC6098w, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC6098w.cancel(cancellationException);
        }

        public static <E> v7.f getOnReceiveOrNull(InterfaceC6098w interfaceC6098w) {
            Intrinsics.checkNotNull(interfaceC6098w, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((C6065c) interfaceC6098w).getOnReceiveOrNull();
        }

        public static <E> E poll(InterfaceC6098w interfaceC6098w) throws Throwable {
            Object objMo534tryReceivePtdJZtk = interfaceC6098w.mo534tryReceivePtdJZtk();
            if (C6071i.m550isSuccessimpl(objMo534tryReceivePtdJZtk)) {
                return (E) C6071i.m546getOrThrowimpl(objMo534tryReceivePtdJZtk);
            }
            Throwable thM544exceptionOrNullimpl = C6071i.m544exceptionOrNullimpl(objMo534tryReceivePtdJZtk);
            if (thM544exceptionOrNullimpl == null) {
                return null;
            }
            throw J.recoverStackTrace(thM544exceptionOrNullimpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <E> java.lang.Object receiveOrNull(p7.InterfaceC6098w r4, W6.d<? super E> r5) throws java.lang.Throwable {
            /*
                boolean r0 = r5 instanceof p7.InterfaceC6098w.a.C0368a
                if (r0 == 0) goto L13
                r0 = r5
                p7.w$a$a r0 = (p7.InterfaceC6098w.a.C0368a) r0
                int r1 = r0.f34910e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f34910e = r1
                goto L18
            L13:
                p7.w$a$a r0 = new p7.w$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f34909d
                java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
                int r2 = r0.f34910e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                R6.r.throwOnFailure(r5)
                p7.i r5 = (p7.C6071i) r5
                java.lang.Object r4 = r5.m552unboximpl()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                R6.r.throwOnFailure(r5)
                r0.f34910e = r3
                java.lang.Object r4 = r4.mo533receiveCatchingJP2dKIU(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = p7.C6071i.m545getOrNullimpl(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.InterfaceC6098w.a.receiveOrNull(p7.w, W6.d):java.lang.Object");
        }

        public static /* synthetic */ boolean cancel$default(InterfaceC6098w interfaceC6098w, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return interfaceC6098w.cancel(th);
        }

        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }
    }

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    v7.f getOnReceive();

    v7.f getOnReceiveCatching();

    v7.f getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    InterfaceC6069g iterator();

    Object poll();

    Object receive(W6.d<Object> dVar);

    /* renamed from: receiveCatching-JP2dKIU */
    Object mo533receiveCatchingJP2dKIU(W6.d<? super C6071i> dVar);

    Object receiveOrNull(W6.d<Object> dVar);

    /* renamed from: tryReceive-PtdJZtk */
    Object mo534tryReceivePtdJZtk();
}
