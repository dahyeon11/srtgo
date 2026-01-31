package retrofit2;

import Q7.C;
import R6.C0752f;
import R6.G;
import R6.q;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.C5998o;
import n7.InterfaceC5996n;

/* loaded from: classes3.dex */
public abstract class k {

    static final class a extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6201b f35981a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6201b interfaceC6201b) {
            super(1);
            this.f35981a = interfaceC6201b;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            this.f35981a.cancel();
        }
    }

    static final class b extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6201b f35982a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6201b interfaceC6201b) {
            super(1);
            this.f35982a = interfaceC6201b;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            this.f35982a.cancel();
        }
    }

    public static final class c implements retrofit2.d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5996n f35983a;

        c(InterfaceC5996n interfaceC5996n) {
            this.f35983a = interfaceC5996n;
        }

        @Override // retrofit2.d
        public void onFailure(InterfaceC6201b<T> call, Throwable t8) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t8, "t");
            InterfaceC5996n interfaceC5996n = this.f35983a;
            q.a aVar = R6.q.Companion;
            interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(t8)));
        }

        @Override // retrofit2.d
        public void onResponse(InterfaceC6201b<T> call, w<T> response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (!response.isSuccessful()) {
                InterfaceC5996n interfaceC5996n = this.f35983a;
                h hVar = new h(response);
                q.a aVar = R6.q.Companion;
                interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(hVar)));
                return;
            }
            Object objBody = response.body();
            if (objBody != null) {
                this.f35983a.resumeWith(R6.q.m67constructorimpl(objBody));
                return;
            }
            Object objTag = call.request().tag(j.class);
            if (objTag == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(objTag, "call.request().tag(Invocation::class.java)!!");
            Method method = ((j) objTag).method();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append(C.PACKAGE_SEPARATOR_CHAR);
            sb.append(method.getName());
            sb.append(" was null but response body type was declared as non-null");
            C0752f c0752f = new C0752f(sb.toString());
            InterfaceC5996n interfaceC5996n2 = this.f35983a;
            q.a aVar2 = R6.q.Companion;
            interfaceC5996n2.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(c0752f)));
        }
    }

    public static final class d implements retrofit2.d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5996n f35984a;

        d(InterfaceC5996n interfaceC5996n) {
            this.f35984a = interfaceC5996n;
        }

        @Override // retrofit2.d
        public void onFailure(InterfaceC6201b<T> call, Throwable t8) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t8, "t");
            InterfaceC5996n interfaceC5996n = this.f35984a;
            q.a aVar = R6.q.Companion;
            interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(t8)));
        }

        @Override // retrofit2.d
        public void onResponse(InterfaceC6201b<T> call, w<T> response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (response.isSuccessful()) {
                this.f35984a.resumeWith(R6.q.m67constructorimpl(response.body()));
                return;
            }
            InterfaceC5996n interfaceC5996n = this.f35984a;
            h hVar = new h(response);
            q.a aVar = R6.q.Companion;
            interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(hVar)));
        }
    }

    static final class e extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6201b f35985a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC6201b interfaceC6201b) {
            super(1);
            this.f35985a = interfaceC6201b;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            this.f35985a.cancel();
        }
    }

    public static final class f implements retrofit2.d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5996n f35986a;

        f(InterfaceC5996n interfaceC5996n) {
            this.f35986a = interfaceC5996n;
        }

        @Override // retrofit2.d
        public void onFailure(InterfaceC6201b<T> call, Throwable t8) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t8, "t");
            InterfaceC5996n interfaceC5996n = this.f35986a;
            q.a aVar = R6.q.Companion;
            interfaceC5996n.resumeWith(R6.q.m67constructorimpl(R6.r.createFailure(t8)));
        }

        @Override // retrofit2.d
        public void onResponse(InterfaceC6201b<T> call, w<T> response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            this.f35986a.resumeWith(R6.q.m67constructorimpl(response));
        }
    }

    static final class g extends Y6.d {

        /* renamed from: d */
        /* synthetic */ Object f35987d;

        /* renamed from: e */
        int f35988e;

        /* renamed from: f */
        Object f35989f;

        g(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35987d = obj;
            this.f35988e |= Integer.MIN_VALUE;
            return k.yieldAndThrow(null, this);
        }
    }

    public static final <T> Object await(InterfaceC6201b<T> interfaceC6201b, W6.d<? super T> dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.invokeOnCancellation(new a(interfaceC6201b));
        interfaceC6201b.enqueue(new c(c5998o));
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object awaitNullable(InterfaceC6201b<T> interfaceC6201b, W6.d<? super T> dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.invokeOnCancellation(new b(interfaceC6201b));
        interfaceC6201b.enqueue(new d(c5998o));
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Object awaitResponse(InterfaceC6201b<T> interfaceC6201b, W6.d<? super w<T>> dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.invokeOnCancellation(new e(interfaceC6201b));
        interfaceC6201b.enqueue(new f(c5998o));
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yieldAndThrow(java.lang.Exception r4, W6.d<?> r5) throws java.lang.Exception {
        /*
            boolean r0 = r5 instanceof retrofit2.k.g
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.k$g r0 = (retrofit2.k.g) r0
            int r1 = r0.f35988e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35988e = r1
            goto L18
        L13:
            retrofit2.k$g r0 = new retrofit2.k$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35987d
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35988e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f35989f
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r0 = r5 instanceof R6.q.b
            if (r0 == 0) goto L49
            R6.q$b r5 = (R6.q.b) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            boolean r2 = r5 instanceof R6.q.b
            if (r2 != 0) goto L4a
            r0.f35989f = r4
            r0.f35988e = r3
            java.lang.Object r5 = n7.Y0.yield(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            throw r4
        L4a:
            R6.q$b r5 = (R6.q.b) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.k.yieldAndThrow(java.lang.Exception, W6.d):java.lang.Object");
    }
}
