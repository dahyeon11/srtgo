package q7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.EnumC6064b;
import r7.AbstractC6188e;

/* renamed from: q7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6140b extends C6144f {

    /* renamed from: b, reason: collision with root package name */
    private final f7.p f35245b;

    /* renamed from: q7.b$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35246d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35247e;

        /* renamed from: g, reason: collision with root package name */
        int f35249g;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35247e = obj;
            this.f35249g |= Integer.MIN_VALUE;
            return C6140b.this.c(null, this);
        }
    }

    public /* synthetic */ C6140b(f7.p pVar, W6.g gVar, int i8, EnumC6064b enumC6064b, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i9 & 2) != 0 ? W6.h.INSTANCE : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC6064b.SUSPEND : enumC6064b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q7.C6144f, r7.AbstractC6188e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object c(p7.InterfaceC6096u r5, W6.d r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q7.C6140b.a
            if (r0 == 0) goto L13
            r0 = r6
            q7.b$a r0 = (q7.C6140b.a) r0
            int r1 = r0.f35249g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35249g = r1
            goto L18
        L13:
            q7.b$a r0 = new q7.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35247e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35249g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f35246d
            p7.u r5 = (p7.InterfaceC6096u) r5
            R6.r.throwOnFailure(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            R6.r.throwOnFailure(r6)
            r0.f35246d = r5
            r0.f35249g = r3
            java.lang.Object r6 = super.c(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L4c
            R6.G r5 = R6.G.INSTANCE
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6140b.c(p7.u, W6.d):java.lang.Object");
    }

    @Override // q7.C6144f, r7.AbstractC6188e
    protected AbstractC6188e d(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return new C6140b(this.f35245b, gVar, i8, enumC6064b);
    }

    public C6140b(f7.p pVar, W6.g gVar, int i8, EnumC6064b enumC6064b) {
        super(pVar, gVar, i8, enumC6064b);
        this.f35245b = pVar;
    }
}
