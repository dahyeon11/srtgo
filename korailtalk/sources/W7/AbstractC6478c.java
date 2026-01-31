package w7;

import s7.K;
import s7.N;

/* renamed from: w7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6478c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f37469a = N.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);

    /* renamed from: b, reason: collision with root package name */
    private static final K f37470b = new K("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    private static final K f37471c = new K("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    private static final K f37472d = new K("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    private static final K f37473e = new K("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    private static final int f37474f = N.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* renamed from: w7.c$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f37475d;

        /* renamed from: e, reason: collision with root package name */
        Object f37476e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37477f;

        /* renamed from: g, reason: collision with root package name */
        int f37478g;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f37477f = obj;
            this.f37478g |= Integer.MIN_VALUE;
            return AbstractC6478c.withPermit(null, null, this);
        }
    }

    public static final InterfaceC6476a Semaphore(int i8, int i9) {
        return new C6477b(i8, i9);
    }

    public static /* synthetic */ InterfaceC6476a Semaphore$default(int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return Semaphore(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6479d a(long j8, C6479d c6479d) {
        return new C6479d(j8, c6479d, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withPermit(w7.InterfaceC6476a r4, f7.InterfaceC5519a r5, W6.d<? super T> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof w7.AbstractC6478c.a
            if (r0 == 0) goto L13
            r0 = r6
            w7.c$a r0 = (w7.AbstractC6478c.a) r0
            int r1 = r0.f37478g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37478g = r1
            goto L18
        L13:
            w7.c$a r0 = new w7.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37477f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f37478g
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f37476e
            r5 = r4
            f7.a r5 = (f7.InterfaceC5519a) r5
            java.lang.Object r4 = r0.f37475d
            w7.a r4 = (w7.InterfaceC6476a) r4
            R6.r.throwOnFailure(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            R6.r.throwOnFailure(r6)
            r0.f37475d = r4
            r0.f37476e = r5
            r0.f37478g = r3
            java.lang.Object r6 = r4.acquire(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.release()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r5
        L58:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.release()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.AbstractC6478c.withPermit(w7.a, f7.a, W6.d):java.lang.Object");
    }
}
