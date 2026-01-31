package p7;

import R6.G;
import R6.q;
import f7.InterfaceC5519a;
import kotlin.jvm.internal.Lambda;
import n7.H;
import n7.InterfaceC5996n;
import n7.L;
import n7.N;

/* renamed from: p7.s */
/* loaded from: classes3.dex */
public abstract class AbstractC6094s {

    /* renamed from: p7.s$a */
    static final class a extends Y6.d {

        /* renamed from: d */
        Object f34904d;

        /* renamed from: e */
        Object f34905e;

        /* renamed from: f */
        /* synthetic */ Object f34906f;

        /* renamed from: g */
        int f34907g;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34906f = obj;
            this.f34907g |= Integer.MIN_VALUE;
            return AbstractC6094s.awaitClose(null, null, this);
        }
    }

    /* renamed from: p7.s$b */
    static final class b extends Lambda implements InterfaceC5519a {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @Override // f7.InterfaceC5519a
        public /* bridge */ /* synthetic */ Object invoke() {
            m556invoke();
            return G.INSTANCE;
        }

        /* renamed from: invoke */
        public final void m556invoke() {
        }
    }

    /* renamed from: p7.s$c */
    static final class c extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5996n f34908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5996n interfaceC5996n) {
            super(1);
            this.f34908a = interfaceC5996n;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            InterfaceC5996n interfaceC5996n = this.f34908a;
            q.a aVar = R6.q.Companion;
            interfaceC5996n.resumeWith(R6.q.m67constructorimpl(G.INSTANCE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitClose(p7.InterfaceC6096u r4, f7.InterfaceC5519a r5, W6.d<? super R6.G> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof p7.AbstractC6094s.a
            if (r0 == 0) goto L13
            r0 = r6
            p7.s$a r0 = (p7.AbstractC6094s.a) r0
            int r1 = r0.f34907g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34907g = r1
            goto L18
        L13:
            p7.s$a r0 = new p7.s$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34906f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34907g
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f34905e
            r5 = r4
            f7.a r5 = (f7.InterfaceC5519a) r5
            java.lang.Object r4 = r0.f34904d
            p7.u r4 = (p7.InterfaceC6096u) r4
            R6.r.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            R6.r.throwOnFailure(r6)
            W6.g r6 = r0.getContext()
            n7.t0$b r2 = n7.InterfaceC6008t0.Key
            W6.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f34904d = r4     // Catch: java.lang.Throwable -> L32
            r0.f34905e = r5     // Catch: java.lang.Throwable -> L32
            r0.f34907g = r3     // Catch: java.lang.Throwable -> L32
            n7.o r6 = new n7.o     // Catch: java.lang.Throwable -> L32
            W6.d r2 = X6.b.intercepted(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.initCancellability()     // Catch: java.lang.Throwable -> L32
            p7.s$c r2 = new p7.s$c     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.getResult()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = X6.b.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            Y6.h.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            R6.G r4 = R6.G.INSTANCE
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6094s.awaitClose(p7.u, f7.a, W6.d):java.lang.Object");
    }

    public static /* synthetic */ Object awaitClose$default(InterfaceC6096u interfaceC6096u, InterfaceC5519a interfaceC5519a, W6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC5519a = b.INSTANCE;
        }
        return awaitClose(interfaceC6096u, interfaceC5519a, dVar);
    }

    public static final <E> InterfaceC6098w produce(L l8, W6.g gVar, int i8, f7.p pVar) {
        return produce(l8, gVar, i8, EnumC6064b.SUSPEND, N.DEFAULT, null, pVar);
    }

    public static /* synthetic */ InterfaceC6098w produce$default(L l8, W6.g gVar, int i8, f7.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = W6.h.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return produce(l8, gVar, i8, pVar);
    }

    public static final <E> InterfaceC6098w produce(L l8, W6.g gVar, int i8, N n8, f7.l lVar, f7.p pVar) {
        return produce(l8, gVar, i8, EnumC6064b.SUSPEND, n8, lVar, pVar);
    }

    public static final <E> InterfaceC6098w produce(L l8, W6.g gVar, int i8, EnumC6064b enumC6064b, N n8, f7.l lVar, f7.p pVar) {
        C6095t c6095t = new C6095t(H.newCoroutineContext(l8, gVar), AbstractC6070h.Channel$default(i8, enumC6064b, null, 4, null));
        if (lVar != null) {
            c6095t.invokeOnCompletion(lVar);
        }
        c6095t.start(n8, c6095t, pVar);
        return c6095t;
    }

    public static /* synthetic */ InterfaceC6098w produce$default(L l8, W6.g gVar, int i8, N n8, f7.l lVar, f7.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = W6.h.INSTANCE;
        }
        W6.g gVar2 = gVar;
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        int i10 = i8;
        if ((i9 & 4) != 0) {
            n8 = N.DEFAULT;
        }
        N n9 = n8;
        if ((i9 & 8) != 0) {
            lVar = null;
        }
        return produce(l8, gVar2, i10, n9, lVar, pVar);
    }

    public static /* synthetic */ InterfaceC6098w produce$default(L l8, W6.g gVar, int i8, EnumC6064b enumC6064b, N n8, f7.l lVar, f7.p pVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            gVar = W6.h.INSTANCE;
        }
        W6.g gVar2 = gVar;
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        int i10 = i8;
        if ((i9 & 4) != 0) {
            enumC6064b = EnumC6064b.SUSPEND;
        }
        EnumC6064b enumC6064b2 = enumC6064b;
        if ((i9 & 8) != 0) {
            n8 = N.DEFAULT;
        }
        N n9 = n8;
        if ((i9 & 16) != 0) {
            lVar = null;
        }
        return produce(l8, gVar2, i10, enumC6064b2, n9, lVar, pVar);
    }
}
