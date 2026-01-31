package p7;

import R6.AbstractC0747a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.C5971a0;
import n7.C5995m0;

/* renamed from: p7.o */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC6077o {

    /* renamed from: p7.o$A */
    static final class A extends Y6.d {

        /* renamed from: d */
        Object f34712d;

        /* renamed from: e */
        Object f34713e;

        /* renamed from: f */
        Object f34714f;

        /* renamed from: g */
        Object f34715g;

        /* renamed from: h */
        /* synthetic */ Object f34716h;

        /* renamed from: i */
        int f34717i;

        A(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34716h = obj;
            this.f34717i |= Integer.MIN_VALUE;
            return AbstractC6077o.minWith(null, null, this);
        }
    }

    /* renamed from: p7.o$B */
    static final class B extends Y6.d {

        /* renamed from: d */
        Object f34718d;

        /* renamed from: e */
        /* synthetic */ Object f34719e;

        /* renamed from: f */
        int f34720f;

        B(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34719e = obj;
            this.f34720f |= Integer.MIN_VALUE;
            return AbstractC6077o.none(null, this);
        }
    }

    /* renamed from: p7.o$C */
    static final class C extends Y6.l implements f7.p {

        /* renamed from: e */
        int f34721e;

        /* renamed from: f */
        /* synthetic */ Object f34722f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC6098w f34723g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(InterfaceC6098w interfaceC6098w, W6.d dVar) {
            super(2, dVar);
            this.f34723g = interfaceC6098w;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C c9 = new C(this.f34723g, dVar);
            c9.f34722f = obj;
            return c9;
        }

        @Override // f7.p
        public final Object invoke(Object obj, W6.d dVar) {
            return ((C) create(obj, dVar)).invokeSuspend(R6.G.INSTANCE);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            X6.b.getCOROUTINE_SUSPENDED();
            if (this.f34721e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            Object obj2 = this.f34722f;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException("null element found in " + this.f34723g + Q7.C.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: p7.o$D */
    static final class D extends Y6.d {

        /* renamed from: d */
        Object f34724d;

        /* renamed from: e */
        Object f34725e;

        /* renamed from: f */
        /* synthetic */ Object f34726f;

        /* renamed from: g */
        int f34727g;

        D(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34726f = obj;
            this.f34727g |= Integer.MIN_VALUE;
            return AbstractC6077o.single(null, this);
        }
    }

    /* renamed from: p7.o$E */
    static final class E extends Y6.d {

        /* renamed from: d */
        Object f34728d;

        /* renamed from: e */
        Object f34729e;

        /* renamed from: f */
        /* synthetic */ Object f34730f;

        /* renamed from: g */
        int f34731g;

        E(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34730f = obj;
            this.f34731g |= Integer.MIN_VALUE;
            return AbstractC6077o.singleOrNull(null, this);
        }
    }

    /* renamed from: p7.o$F */
    static final class F extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34732e;

        /* renamed from: f */
        int f34733f;

        /* renamed from: g */
        int f34734g;

        /* renamed from: h */
        private /* synthetic */ Object f34735h;

        /* renamed from: i */
        final /* synthetic */ int f34736i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC6098w f34737j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(int i8, InterfaceC6098w interfaceC6098w, W6.d dVar) {
            super(2, dVar);
            this.f34736i = i8;
            this.f34737j = interfaceC6098w;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            F f8 = new F(this.f34736i, this.f34737j, dVar);
            f8.f34735h = obj;
            return f8;
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0078 -> B:44:0x001b). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r7.f34734g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L33
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                int r1 = r7.f34733f
                java.lang.Object r4 = r7.f34732e
                p7.g r4 = (p7.InterfaceC6069g) r4
                java.lang.Object r5 = r7.f34735h
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r8)
            L1b:
                r8 = r5
                goto L7b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                int r1 = r7.f34733f
                java.lang.Object r4 = r7.f34732e
                p7.g r4 = (p7.InterfaceC6069g) r4
                java.lang.Object r5 = r7.f34735h
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r8)
                goto L60
            L33:
                R6.r.throwOnFailure(r8)
                java.lang.Object r8 = r7.f34735h
                p7.u r8 = (p7.InterfaceC6096u) r8
                int r1 = r7.f34736i
                if (r1 != 0) goto L41
                R6.G r8 = R6.G.INSTANCE
                return r8
            L41:
                if (r1 < 0) goto L45
                r4 = r3
                goto L46
            L45:
                r4 = 0
            L46:
                if (r4 == 0) goto L85
                p7.w r4 = r7.f34737j
                p7.g r4 = r4.iterator()
            L4e:
                r7.f34735h = r8
                r7.f34732e = r4
                r7.f34733f = r1
                r7.f34734g = r3
                java.lang.Object r5 = r4.hasNext(r7)
                if (r5 != r0) goto L5d
                return r0
            L5d:
                r6 = r5
                r5 = r8
                r8 = r6
            L60:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r4.next()
                r7.f34735h = r5
                r7.f34732e = r4
                r7.f34733f = r1
                r7.f34734g = r2
                java.lang.Object r8 = r5.send(r8, r7)
                if (r8 != r0) goto L1b
                return r0
            L7b:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L4e
                R6.G r8 = R6.G.INSTANCE
                return r8
            L82:
                R6.G r8 = R6.G.INSTANCE
                return r8
            L85:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Requested element count "
                r8.append(r0)
                r8.append(r1)
                java.lang.String r0 = " is less than zero."
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.F.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((F) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$G */
    static final class G extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34738e;

        /* renamed from: f */
        Object f34739f;

        /* renamed from: g */
        int f34740g;

        /* renamed from: h */
        private /* synthetic */ Object f34741h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC6098w f34742i;

        /* renamed from: j */
        final /* synthetic */ f7.p f34743j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(InterfaceC6098w interfaceC6098w, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34742i = interfaceC6098w;
            this.f34743j = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            G g8 = new G(this.f34742i, this.f34743j, dVar);
            g8.f34741h = obj;
            return g8;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0097 -> B:45:0x004d). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r8.f34740g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L33
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f34738e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r5 = r8.f34741h
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r9)
                goto L4d
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f34739f
                java.lang.Object r5 = r8.f34738e
                p7.g r5 = (p7.InterfaceC6069g) r5
                java.lang.Object r6 = r8.f34741h
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r9)
                goto L7c
            L33:
                java.lang.Object r1 = r8.f34738e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r5 = r8.f34741h
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r9)
                goto L5a
            L3f:
                R6.r.throwOnFailure(r9)
                java.lang.Object r9 = r8.f34741h
                p7.u r9 = (p7.InterfaceC6096u) r9
                p7.w r1 = r8.f34742i
                p7.g r1 = r1.iterator()
                r5 = r9
            L4d:
                r8.f34741h = r5
                r8.f34738e = r1
                r8.f34740g = r4
                java.lang.Object r9 = r1.hasNext(r8)
                if (r9 != r0) goto L5a
                return r0
            L5a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9a
                java.lang.Object r9 = r1.next()
                f7.p r6 = r8.f34743j
                r8.f34741h = r5
                r8.f34738e = r1
                r8.f34739f = r9
                r8.f34740g = r3
                java.lang.Object r6 = r6.invoke(r9, r8)
                if (r6 != r0) goto L77
                return r0
            L77:
                r7 = r1
                r1 = r9
                r9 = r6
                r6 = r5
                r5 = r7
            L7c:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L87
                R6.G r9 = R6.G.INSTANCE
                return r9
            L87:
                r8.f34741h = r6
                r8.f34738e = r5
                r9 = 0
                r8.f34739f = r9
                r8.f34740g = r2
                java.lang.Object r9 = r6.send(r1, r8)
                if (r9 != r0) goto L97
                return r0
            L97:
                r1 = r5
                r5 = r6
                goto L4d
            L9a:
                R6.G r9 = R6.G.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.G.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((G) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$H */
    static final class H extends Y6.d {

        /* renamed from: d */
        Object f34744d;

        /* renamed from: e */
        Object f34745e;

        /* renamed from: f */
        Object f34746f;

        /* renamed from: g */
        /* synthetic */ Object f34747g;

        /* renamed from: h */
        int f34748h;

        H(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34747g = obj;
            this.f34748h |= Integer.MIN_VALUE;
            return AbstractC6074l.toChannel(null, null, this);
        }
    }

    /* renamed from: p7.o$I */
    static final class I extends Y6.d {

        /* renamed from: d */
        Object f34749d;

        /* renamed from: e */
        Object f34750e;

        /* renamed from: f */
        Object f34751f;

        /* renamed from: g */
        /* synthetic */ Object f34752g;

        /* renamed from: h */
        int f34753h;

        I(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34752g = obj;
            this.f34753h |= Integer.MIN_VALUE;
            return AbstractC6074l.toCollection(null, null, this);
        }
    }

    /* renamed from: p7.o$J */
    static final class J extends Y6.d {

        /* renamed from: d */
        Object f34754d;

        /* renamed from: e */
        Object f34755e;

        /* renamed from: f */
        Object f34756f;

        /* renamed from: g */
        /* synthetic */ Object f34757g;

        /* renamed from: h */
        int f34758h;

        J(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34757g = obj;
            this.f34758h |= Integer.MIN_VALUE;
            return AbstractC6074l.toMap(null, null, this);
        }
    }

    /* renamed from: p7.o$K */
    static final class K extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34759e;

        /* renamed from: f */
        int f34760f;

        /* renamed from: g */
        int f34761g;

        /* renamed from: h */
        private /* synthetic */ Object f34762h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC6098w f34763i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        K(InterfaceC6098w interfaceC6098w, W6.d dVar) {
            super(2, dVar);
            this.f34763i = interfaceC6098w;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            K k8 = new K(this.f34763i, dVar);
            k8.f34762h = obj;
            return k8;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x007b -> B:34:0x0044). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r10.f34761g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f34760f
                java.lang.Object r4 = r10.f34759e
                p7.g r4 = (p7.InterfaceC6069g) r4
                java.lang.Object r5 = r10.f34762h
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r11)
                r11 = r5
                r8 = r4
                r4 = r1
                r1 = r8
                goto L44
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f34760f
                java.lang.Object r4 = r10.f34759e
                p7.g r4 = (p7.InterfaceC6069g) r4
                java.lang.Object r5 = r10.f34762h
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r11)
                goto L59
            L36:
                R6.r.throwOnFailure(r11)
                java.lang.Object r11 = r10.f34762h
                p7.u r11 = (p7.InterfaceC6096u) r11
                p7.w r1 = r10.f34763i
                p7.g r1 = r1.iterator()
                r4 = 0
            L44:
                r10.f34762h = r11
                r10.f34759e = r1
                r10.f34760f = r4
                r10.f34761g = r3
                java.lang.Object r5 = r1.hasNext(r10)
                if (r5 != r0) goto L53
                return r0
            L53:
                r8 = r5
                r5 = r11
                r11 = r8
                r9 = r4
                r4 = r1
                r1 = r9
            L59:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L7f
                java.lang.Object r11 = r4.next()
                S6.J r6 = new S6.J
                int r7 = r1 + 1
                r6.<init>(r1, r11)
                r10.f34762h = r5
                r10.f34759e = r4
                r10.f34760f = r7
                r10.f34761g = r2
                java.lang.Object r11 = r5.send(r6, r10)
                if (r11 != r0) goto L7b
                return r0
            L7b:
                r1 = r4
                r11 = r5
                r4 = r7
                goto L44
            L7f:
                R6.G r11 = R6.G.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.K.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((K) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$L */
    static final class L extends Lambda implements f7.p {
        public static final L INSTANCE = new L();

        L() {
            super(2);
        }

        @Override // f7.p
        public final R6.p invoke(Object obj, Object obj2) {
            return R6.v.to(obj, obj2);
        }
    }

    /* renamed from: p7.o$M */
    static final class M extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34764e;

        /* renamed from: f */
        Object f34765f;

        /* renamed from: g */
        Object f34766g;

        /* renamed from: h */
        Object f34767h;

        /* renamed from: i */
        Object f34768i;

        /* renamed from: j */
        int f34769j;

        /* renamed from: k */
        private /* synthetic */ Object f34770k;

        /* renamed from: l */
        final /* synthetic */ InterfaceC6098w f34771l;

        /* renamed from: m */
        final /* synthetic */ InterfaceC6098w f34772m;

        /* renamed from: n */
        final /* synthetic */ f7.p f34773n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(InterfaceC6098w interfaceC6098w, InterfaceC6098w interfaceC6098w2, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34771l = interfaceC6098w;
            this.f34772m = interfaceC6098w2;
            this.f34773n = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            M m8 = new M(this.f34771l, this.f34772m, this.f34773n, dVar);
            m8.f34770k = obj;
            return m8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x0088, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00a5 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:61:0x0026, B:77:0x0088, B:80:0x009d, B:82:0x00a5, B:92:0x00ef, B:73:0x006b, B:76:0x0080), top: B:103:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00cd A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:86:0x00c5, B:88:0x00cd, B:68:0x004b), top: B:99:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00ef A[Catch: all -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:61:0x0026, B:77:0x0088, B:80:0x009d, B:82:0x00a5, B:92:0x00ef, B:73:0x006b, B:76:0x0080), top: B:103:0x000a }] */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.M.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
            return ((M) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$a */
    static final class C6078a extends Y6.d {

        /* renamed from: d */
        Object f34774d;

        /* renamed from: e */
        /* synthetic */ Object f34775e;

        /* renamed from: f */
        int f34776f;

        C6078a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34775e = obj;
            this.f34776f |= Integer.MIN_VALUE;
            return AbstractC6077o.any(null, this);
        }
    }

    /* renamed from: p7.o$b */
    static final class C6079b extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6098w f34777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6079b(InterfaceC6098w interfaceC6098w) {
            super(1);
            this.f34777a = interfaceC6098w;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return R6.G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            AbstractC6074l.cancelConsumed(this.f34777a, th);
        }
    }

    /* renamed from: p7.o$c */
    static final class C6080c extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6098w[] f34778a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6080c(InterfaceC6098w[] interfaceC6098wArr) {
            super(1);
            this.f34778a = interfaceC6098wArr;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((Throwable) obj);
            return R6.G.INSTANCE;
        }

        public final void invoke(Throwable th) throws Throwable {
            Throwable th2 = null;
            for (InterfaceC6098w interfaceC6098w : this.f34778a) {
                try {
                    AbstractC6074l.cancelConsumed(interfaceC6098w, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        AbstractC0747a.addSuppressed(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* renamed from: p7.o$d */
    static final class C6081d extends Y6.d {

        /* renamed from: d */
        Object f34779d;

        /* renamed from: e */
        Object f34780e;

        /* renamed from: f */
        Object f34781f;

        /* renamed from: g */
        /* synthetic */ Object f34782g;

        /* renamed from: h */
        int f34783h;

        C6081d(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34782g = obj;
            this.f34783h |= Integer.MIN_VALUE;
            return AbstractC6077o.count(null, this);
        }
    }

    /* renamed from: p7.o$e */
    static final class C6082e extends Y6.l implements f7.p {

        /* renamed from: e */
        int f34784e;

        /* renamed from: f */
        /* synthetic */ Object f34785f;

        C6082e(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6082e c6082e = new C6082e(dVar);
            c6082e.f34785f = obj;
            return c6082e;
        }

        @Override // f7.p
        public final Object invoke(Object obj, W6.d dVar) {
            return ((C6082e) create(obj, dVar)).invokeSuspend(R6.G.INSTANCE);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            X6.b.getCOROUTINE_SUSPENDED();
            if (this.f34784e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            return this.f34785f;
        }
    }

    /* renamed from: p7.o$f */
    static final class C6083f extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34786e;

        /* renamed from: f */
        Object f34787f;

        /* renamed from: g */
        Object f34788g;

        /* renamed from: h */
        int f34789h;

        /* renamed from: i */
        private /* synthetic */ Object f34790i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC6098w f34791j;

        /* renamed from: k */
        final /* synthetic */ f7.p f34792k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6083f(InterfaceC6098w interfaceC6098w, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34791j = interfaceC6098w;
            this.f34792k = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6083f c6083f = new C6083f(this.f34791j, this.f34792k, dVar);
            c6083f.f34790i = obj;
            return c6083f;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a1 -> B:61:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00b4 -> B:60:0x00b6). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r10.f34789h
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L51
                if (r1 == r4) goto L41
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r10.f34788g
                java.lang.Object r5 = r10.f34787f
                p7.g r5 = (p7.InterfaceC6069g) r5
                java.lang.Object r6 = r10.f34786e
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f34790i
                p7.u r7 = (p7.InterfaceC6096u) r7
                R6.r.throwOnFailure(r11)
                goto Lb6
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2c:
                java.lang.Object r1 = r10.f34788g
                java.lang.Object r5 = r10.f34787f
                p7.g r5 = (p7.InterfaceC6069g) r5
                java.lang.Object r6 = r10.f34786e
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f34790i
                p7.u r7 = (p7.InterfaceC6096u) r7
                R6.r.throwOnFailure(r11)
                r9 = r5
                r5 = r1
                r1 = r9
                goto L9d
            L41:
                java.lang.Object r1 = r10.f34787f
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r5 = r10.f34786e
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.f34790i
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r11)
                goto L79
            L51:
                R6.r.throwOnFailure(r11)
                java.lang.Object r11 = r10.f34790i
                p7.u r11 = (p7.InterfaceC6096u) r11
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                p7.w r5 = r10.f34791j
                p7.g r5 = r5.iterator()
                r6 = r11
                r9 = r5
                r5 = r1
                r1 = r9
            L67:
                r10.f34790i = r6
                r10.f34786e = r5
                r10.f34787f = r1
                r11 = 0
                r10.f34788g = r11
                r10.f34789h = r4
                java.lang.Object r11 = r1.hasNext(r10)
                if (r11 != r0) goto L79
                return r0
            L79:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbd
                java.lang.Object r11 = r1.next()
                f7.p r7 = r10.f34792k
                r10.f34790i = r6
                r10.f34786e = r5
                r10.f34787f = r1
                r10.f34788g = r11
                r10.f34789h = r3
                java.lang.Object r7 = r7.invoke(r11, r10)
                if (r7 != r0) goto L98
                return r0
            L98:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9d:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lba
                r10.f34790i = r7
                r10.f34786e = r6
                r10.f34787f = r1
                r10.f34788g = r11
                r10.f34789h = r2
                java.lang.Object r5 = r7.send(r5, r10)
                if (r5 != r0) goto Lb4
                return r0
            Lb4:
                r5 = r1
                r1 = r11
            Lb6:
                r6.add(r1)
                r1 = r5
            Lba:
                r5 = r6
                r6 = r7
                goto L67
            Lbd:
                R6.G r11 = R6.G.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.C6083f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
            return ((C6083f) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$g */
    static final class C6084g extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34793e;

        /* renamed from: f */
        int f34794f;

        /* renamed from: g */
        int f34795g;

        /* renamed from: h */
        private /* synthetic */ Object f34796h;

        /* renamed from: i */
        final /* synthetic */ int f34797i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC6098w f34798j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6084g(int i8, InterfaceC6098w interfaceC6098w, W6.d dVar) {
            super(2, dVar);
            this.f34797i = i8;
            this.f34798j = interfaceC6098w;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6084g c6084g = new C6084g(this.f34797i, this.f34798j, dVar);
            c6084g.f34796h = obj;
            return c6084g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
        
            if (r1 == 0) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00a7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0065 -> B:65:0x0068). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00a4 -> B:50:0x001c). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r8.f34795g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L40
                if (r1 == r4) goto L32
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r8.f34793e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r4 = r8.f34796h
                p7.u r4 = (p7.InterfaceC6096u) r4
                R6.r.throwOnFailure(r9)
            L1c:
                r9 = r4
                goto L7e
            L1e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L26:
                java.lang.Object r1 = r8.f34793e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r4 = r8.f34796h
                p7.u r4 = (p7.InterfaceC6096u) r4
                R6.r.throwOnFailure(r9)
                goto L8e
            L32:
                int r1 = r8.f34794f
                java.lang.Object r5 = r8.f34793e
                p7.g r5 = (p7.InterfaceC6069g) r5
                java.lang.Object r6 = r8.f34796h
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r9)
                goto L68
            L40:
                R6.r.throwOnFailure(r9)
                java.lang.Object r9 = r8.f34796h
                p7.u r9 = (p7.InterfaceC6096u) r9
                int r1 = r8.f34797i
                if (r1 < 0) goto L4d
                r5 = r4
                goto L4e
            L4d:
                r5 = 0
            L4e:
                if (r5 == 0) goto Laa
                if (r1 <= 0) goto L78
                p7.w r5 = r8.f34798j
                p7.g r5 = r5.iterator()
                r6 = r9
            L59:
                r8.f34796h = r6
                r8.f34793e = r5
                r8.f34794f = r1
                r8.f34795g = r4
                java.lang.Object r9 = r5.hasNext(r8)
                if (r9 != r0) goto L68
                return r0
            L68:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L77
                r5.next()
                int r1 = r1 + (-1)
                if (r1 != 0) goto L59
            L77:
                r9 = r6
            L78:
                p7.w r1 = r8.f34798j
                p7.g r1 = r1.iterator()
            L7e:
                r8.f34796h = r9
                r8.f34793e = r1
                r8.f34795g = r3
                java.lang.Object r4 = r1.hasNext(r8)
                if (r4 != r0) goto L8b
                return r0
            L8b:
                r7 = r4
                r4 = r9
                r9 = r7
            L8e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La7
                java.lang.Object r9 = r1.next()
                r8.f34796h = r4
                r8.f34793e = r1
                r8.f34795g = r2
                java.lang.Object r9 = r4.send(r9, r8)
                if (r9 != r0) goto L1c
                return r0
            La7:
                R6.G r9 = R6.G.INSTANCE
                return r9
            Laa:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Requested element count "
                r9.append(r0)
                r9.append(r1)
                java.lang.String r0 = " is less than zero."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.C6084g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((C6084g) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$h */
    static final class C6085h extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34799e;

        /* renamed from: f */
        Object f34800f;

        /* renamed from: g */
        int f34801g;

        /* renamed from: h */
        private /* synthetic */ Object f34802h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC6098w f34803i;

        /* renamed from: j */
        final /* synthetic */ f7.p f34804j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6085h(InterfaceC6098w interfaceC6098w, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34803i = interfaceC6098w;
            this.f34804j = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6085h c6085h = new C6085h(this.f34803i, this.f34804j, dVar);
            c6085h.f34802h = obj;
            return c6085h;
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00ef  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x009f -> B:64:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x00ec -> B:58:0x0023). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.C6085h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((C6085h) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$i */
    static final class C6086i extends Y6.d {

        /* renamed from: d */
        int f34805d;

        /* renamed from: e */
        int f34806e;

        /* renamed from: f */
        Object f34807f;

        /* renamed from: g */
        Object f34808g;

        /* renamed from: h */
        /* synthetic */ Object f34809h;

        /* renamed from: i */
        int f34810i;

        C6086i(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34809h = obj;
            this.f34810i |= Integer.MIN_VALUE;
            return AbstractC6077o.elementAt(null, 0, this);
        }
    }

    /* renamed from: p7.o$j */
    static final class C6087j extends Y6.d {

        /* renamed from: d */
        int f34811d;

        /* renamed from: e */
        int f34812e;

        /* renamed from: f */
        Object f34813f;

        /* renamed from: g */
        Object f34814g;

        /* renamed from: h */
        /* synthetic */ Object f34815h;

        /* renamed from: i */
        int f34816i;

        C6087j(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34815h = obj;
            this.f34816i |= Integer.MIN_VALUE;
            return AbstractC6077o.elementAtOrNull(null, 0, this);
        }
    }

    /* renamed from: p7.o$k */
    static final class C6088k extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34817e;

        /* renamed from: f */
        Object f34818f;

        /* renamed from: g */
        int f34819g;

        /* renamed from: h */
        private /* synthetic */ Object f34820h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC6098w f34821i;

        /* renamed from: j */
        final /* synthetic */ f7.p f34822j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6088k(InterfaceC6098w interfaceC6098w, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34821i = interfaceC6098w;
            this.f34822j = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6088k c6088k = new C6088k(this.f34821i, this.f34822j, dVar);
            c6088k.f34820h = obj;
            return c6088k;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r9.f34819g
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L43
                if (r1 == r5) goto L37
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r1 = r9.f34817e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r6 = r9.f34820h
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r10)
                goto L51
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f34818f
                java.lang.Object r6 = r9.f34817e
                p7.g r6 = (p7.InterfaceC6069g) r6
                java.lang.Object r7 = r9.f34820h
                p7.u r7 = (p7.InterfaceC6096u) r7
                R6.r.throwOnFailure(r10)
                r8 = r6
                r6 = r1
                r1 = r8
                goto L81
            L37:
                java.lang.Object r1 = r9.f34817e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r6 = r9.f34820h
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r10)
                goto L60
            L43:
                R6.r.throwOnFailure(r10)
                java.lang.Object r10 = r9.f34820h
                p7.u r10 = (p7.InterfaceC6096u) r10
                p7.w r1 = r9.f34821i
                p7.g r1 = r1.iterator()
                r6 = r10
            L51:
                r9.f34820h = r6
                r9.f34817e = r1
                r9.f34818f = r2
                r9.f34819g = r5
                java.lang.Object r10 = r1.hasNext(r9)
                if (r10 != r0) goto L60
                return r0
            L60:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9a
                java.lang.Object r10 = r1.next()
                f7.p r7 = r9.f34822j
                r9.f34820h = r6
                r9.f34817e = r1
                r9.f34818f = r10
                r9.f34819g = r4
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r0) goto L7d
                return r0
            L7d:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L81:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L98
                r9.f34820h = r7
                r9.f34817e = r1
                r9.f34818f = r2
                r9.f34819g = r3
                java.lang.Object r10 = r7.send(r6, r9)
                if (r10 != r0) goto L98
                return r0
            L98:
                r6 = r7
                goto L51
            L9a:
                R6.G r10 = R6.G.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.C6088k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
            return ((C6088k) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$l */
    static final class C6089l extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34823e;

        /* renamed from: f */
        Object f34824f;

        /* renamed from: g */
        int f34825g;

        /* renamed from: h */
        int f34826h;

        /* renamed from: i */
        private /* synthetic */ Object f34827i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC6098w f34828j;

        /* renamed from: k */
        final /* synthetic */ f7.q f34829k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6089l(InterfaceC6098w interfaceC6098w, f7.q qVar, W6.d dVar) {
            super(2, dVar);
            this.f34828j = interfaceC6098w;
            this.f34829k = qVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6089l c6089l = new C6089l(this.f34828j, this.f34829k, dVar);
            c6089l.f34827i = obj;
            return c6089l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x005b, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r11.f34826h
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L49
                if (r1 == r5) goto L3b
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                int r1 = r11.f34825g
                java.lang.Object r6 = r11.f34823e
                p7.g r6 = (p7.InterfaceC6069g) r6
                java.lang.Object r7 = r11.f34827i
                p7.u r7 = (p7.InterfaceC6096u) r7
                R6.r.throwOnFailure(r12)
                goto L5b
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f34825g
                java.lang.Object r6 = r11.f34824f
                java.lang.Object r7 = r11.f34823e
                p7.g r7 = (p7.InterfaceC6069g) r7
                java.lang.Object r8 = r11.f34827i
                p7.u r8 = (p7.InterfaceC6096u) r8
                R6.r.throwOnFailure(r12)
                r10 = r7
                r7 = r6
                r6 = r10
                goto L95
            L3b:
                int r1 = r11.f34825g
                java.lang.Object r6 = r11.f34823e
                p7.g r6 = (p7.InterfaceC6069g) r6
                java.lang.Object r7 = r11.f34827i
                p7.u r7 = (p7.InterfaceC6096u) r7
                R6.r.throwOnFailure(r12)
                goto L6c
            L49:
                R6.r.throwOnFailure(r12)
                java.lang.Object r12 = r11.f34827i
                p7.u r12 = (p7.InterfaceC6096u) r12
                p7.w r1 = r11.f34828j
                p7.g r1 = r1.iterator()
                r6 = 0
                r7 = r12
                r10 = r6
                r6 = r1
                r1 = r10
            L5b:
                r11.f34827i = r7
                r11.f34823e = r6
                r11.f34824f = r2
                r11.f34825g = r1
                r11.f34826h = r5
                java.lang.Object r12 = r6.hasNext(r11)
                if (r12 != r0) goto L6c
                return r0
            L6c:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r6.next()
                f7.q r8 = r11.f34829k
                int r9 = r1 + 1
                java.lang.Integer r1 = Y6.b.boxInt(r1)
                r11.f34827i = r7
                r11.f34823e = r6
                r11.f34824f = r12
                r11.f34825g = r9
                r11.f34826h = r4
                java.lang.Object r1 = r8.invoke(r1, r12, r11)
                if (r1 != r0) goto L91
                return r0
            L91:
                r8 = r7
                r7 = r12
                r12 = r1
                r1 = r9
            L95:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lae
                r11.f34827i = r8
                r11.f34823e = r6
                r11.f34824f = r2
                r11.f34825g = r1
                r11.f34826h = r3
                java.lang.Object r12 = r8.send(r7, r11)
                if (r12 != r0) goto Lae
                return r0
            Lae:
                r7 = r8
                goto L5b
            Lb0:
                R6.G r12 = R6.G.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.C6089l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((C6089l) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$m */
    static final class C6090m extends Y6.l implements f7.p {

        /* renamed from: e */
        int f34830e;

        /* renamed from: f */
        /* synthetic */ Object f34831f;

        /* renamed from: g */
        final /* synthetic */ f7.p f34832g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6090m(f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34832g = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            C6090m c6090m = new C6090m(this.f34832g, dVar);
            c6090m.f34831f = obj;
            return c6090m;
        }

        @Override // f7.p
        public final Object invoke(Object obj, W6.d dVar) {
            return ((C6090m) create(obj, dVar)).invokeSuspend(R6.G.INSTANCE);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f34830e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                Object obj2 = this.f34831f;
                f7.p pVar = this.f34832g;
                this.f34830e = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return Y6.b.boxBoolean(!((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: p7.o$n */
    static final class n extends Y6.l implements f7.p {

        /* renamed from: e */
        int f34833e;

        /* renamed from: f */
        /* synthetic */ Object f34834f;

        n(W6.d dVar) {
            super(2, dVar);
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.f34834f = obj;
            return nVar;
        }

        public final Object invoke(E e8, W6.d<? super Boolean> dVar) {
            return ((n) create(e8, dVar)).invokeSuspend(R6.G.INSTANCE);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            X6.b.getCOROUTINE_SUSPENDED();
            if (this.f34833e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R6.r.throwOnFailure(obj);
            return Y6.b.boxBoolean(this.f34834f != null);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((n) obj, (W6.d<? super Boolean>) obj2);
        }
    }

    /* renamed from: p7.o$o */
    static final class C0367o extends Y6.d {

        /* renamed from: d */
        Object f34835d;

        /* renamed from: e */
        Object f34836e;

        /* renamed from: f */
        Object f34837f;

        /* renamed from: g */
        /* synthetic */ Object f34838g;

        /* renamed from: h */
        int f34839h;

        C0367o(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34838g = obj;
            this.f34839h |= Integer.MIN_VALUE;
            return AbstractC6077o.filterNotNullTo((InterfaceC6098w) null, (Collection) null, this);
        }
    }

    /* renamed from: p7.o$p */
    static final class p extends Y6.d {

        /* renamed from: d */
        Object f34840d;

        /* renamed from: e */
        Object f34841e;

        /* renamed from: f */
        Object f34842f;

        /* renamed from: g */
        /* synthetic */ Object f34843g;

        /* renamed from: h */
        int f34844h;

        p(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34843g = obj;
            this.f34844h |= Integer.MIN_VALUE;
            return AbstractC6077o.filterNotNullTo((InterfaceC6098w) null, (InterfaceC6099x) null, this);
        }
    }

    /* renamed from: p7.o$q */
    static final class q extends Y6.d {

        /* renamed from: d */
        Object f34845d;

        /* renamed from: e */
        Object f34846e;

        /* renamed from: f */
        /* synthetic */ Object f34847f;

        /* renamed from: g */
        int f34848g;

        q(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34847f = obj;
            this.f34848g |= Integer.MIN_VALUE;
            return AbstractC6077o.first(null, this);
        }
    }

    /* renamed from: p7.o$r */
    static final class r extends Y6.d {

        /* renamed from: d */
        Object f34849d;

        /* renamed from: e */
        Object f34850e;

        /* renamed from: f */
        /* synthetic */ Object f34851f;

        /* renamed from: g */
        int f34852g;

        r(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34851f = obj;
            this.f34852g |= Integer.MIN_VALUE;
            return AbstractC6077o.firstOrNull(null, this);
        }
    }

    /* renamed from: p7.o$s */
    static final class s extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34853e;

        /* renamed from: f */
        int f34854f;

        /* renamed from: g */
        private /* synthetic */ Object f34855g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC6098w f34856h;

        /* renamed from: i */
        final /* synthetic */ f7.p f34857i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(InterfaceC6098w interfaceC6098w, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34856h = interfaceC6098w;
            this.f34857i = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            s sVar = new s(this.f34856h, this.f34857i, dVar);
            sVar.f34855g = obj;
            return sVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x007f -> B:39:0x004b). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r7.f34854f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f34853e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r5 = r7.f34855g
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r8)
                goto L4b
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.f34853e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r5 = r7.f34855g
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r8)
                goto L73
            L31:
                java.lang.Object r1 = r7.f34853e
                p7.g r1 = (p7.InterfaceC6069g) r1
                java.lang.Object r5 = r7.f34855g
                p7.u r5 = (p7.InterfaceC6096u) r5
                R6.r.throwOnFailure(r8)
                goto L58
            L3d:
                R6.r.throwOnFailure(r8)
                java.lang.Object r8 = r7.f34855g
                p7.u r8 = (p7.InterfaceC6096u) r8
                p7.w r1 = r7.f34856h
                p7.g r1 = r1.iterator()
                r5 = r8
            L4b:
                r7.f34855g = r5
                r7.f34853e = r1
                r7.f34854f = r4
                java.lang.Object r8 = r1.hasNext(r7)
                if (r8 != r0) goto L58
                return r0
            L58:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L82
                java.lang.Object r8 = r1.next()
                f7.p r6 = r7.f34857i
                r7.f34855g = r5
                r7.f34853e = r1
                r7.f34854f = r3
                java.lang.Object r8 = r6.invoke(r8, r7)
                if (r8 != r0) goto L73
                return r0
            L73:
                p7.w r8 = (p7.InterfaceC6098w) r8
                r7.f34855g = r5
                r7.f34853e = r1
                r7.f34854f = r2
                java.lang.Object r8 = p7.AbstractC6074l.toChannel(r8, r5, r7)
                if (r8 != r0) goto L4b
                return r0
            L82:
                R6.G r8 = R6.G.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d dVar) {
            return ((s) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$t */
    static final class t extends Y6.d {

        /* renamed from: d */
        Object f34858d;

        /* renamed from: e */
        Object f34859e;

        /* renamed from: f */
        Object f34860f;

        /* renamed from: g */
        Object f34861g;

        /* renamed from: h */
        /* synthetic */ Object f34862h;

        /* renamed from: i */
        int f34863i;

        t(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34862h = obj;
            this.f34863i |= Integer.MIN_VALUE;
            return AbstractC6077o.indexOf(null, null, this);
        }
    }

    /* renamed from: p7.o$u */
    static final class u extends Y6.d {

        /* renamed from: d */
        Object f34864d;

        /* renamed from: e */
        Object f34865e;

        /* renamed from: f */
        Object f34866f;

        /* renamed from: g */
        /* synthetic */ Object f34867g;

        /* renamed from: h */
        int f34868h;

        u(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34867g = obj;
            this.f34868h |= Integer.MIN_VALUE;
            return AbstractC6077o.last(null, this);
        }
    }

    /* renamed from: p7.o$v */
    static final class v extends Y6.d {

        /* renamed from: d */
        Object f34869d;

        /* renamed from: e */
        Object f34870e;

        /* renamed from: f */
        Object f34871f;

        /* renamed from: g */
        Object f34872g;

        /* renamed from: h */
        Object f34873h;

        /* renamed from: i */
        /* synthetic */ Object f34874i;

        /* renamed from: j */
        int f34875j;

        v(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34874i = obj;
            this.f34875j |= Integer.MIN_VALUE;
            return AbstractC6077o.lastIndexOf(null, null, this);
        }
    }

    /* renamed from: p7.o$w */
    static final class w extends Y6.d {

        /* renamed from: d */
        Object f34876d;

        /* renamed from: e */
        Object f34877e;

        /* renamed from: f */
        Object f34878f;

        /* renamed from: g */
        /* synthetic */ Object f34879g;

        /* renamed from: h */
        int f34880h;

        w(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34879g = obj;
            this.f34880h |= Integer.MIN_VALUE;
            return AbstractC6077o.lastOrNull(null, this);
        }
    }

    /* renamed from: p7.o$x */
    static final class x extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34881e;

        /* renamed from: f */
        Object f34882f;

        /* renamed from: g */
        Object f34883g;

        /* renamed from: h */
        Object f34884h;

        /* renamed from: i */
        int f34885i;

        /* renamed from: j */
        private /* synthetic */ Object f34886j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC6098w f34887k;

        /* renamed from: l */
        final /* synthetic */ f7.p f34888l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(InterfaceC6098w interfaceC6098w, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f34887k = interfaceC6098w;
            this.f34888l = pVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            x xVar = new x(this.f34887k, this.f34888l, dVar);
            xVar.f34886j = obj;
            return xVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0091 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:59:0x0022, B:75:0x0075, B:79:0x0089, B:81:0x0091, B:89:0x00c5, B:71:0x005f, B:74:0x006e), top: B:96:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00c5 A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:59:0x0022, B:75:0x0075, B:79:0x0089, B:81:0x0091, B:89:0x00c5, B:71:0x005f, B:74:0x006e), top: B:96:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x00c0 -> B:75:0x0075). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
            return ((x) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$y */
    static final class y extends Y6.l implements f7.p {

        /* renamed from: e */
        Object f34889e;

        /* renamed from: f */
        Object f34890f;

        /* renamed from: g */
        int f34891g;

        /* renamed from: h */
        int f34892h;

        /* renamed from: i */
        private /* synthetic */ Object f34893i;

        /* renamed from: j */
        final /* synthetic */ InterfaceC6098w f34894j;

        /* renamed from: k */
        final /* synthetic */ f7.q f34895k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(InterfaceC6098w interfaceC6098w, f7.q qVar, W6.d dVar) {
            super(2, dVar);
            this.f34894j = interfaceC6098w;
            this.f34895k = qVar;
        }

        @Override // Y6.a
        public final W6.d<R6.G> create(Object obj, W6.d<?> dVar) {
            y yVar = new y(this.f34894j, this.f34895k, dVar);
            yVar.f34893i = obj;
            return yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00a5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a6 -> B:42:0x0059). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r10.f34892h
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L48
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f34891g
                java.lang.Object r5 = r10.f34889e
                p7.g r5 = (p7.InterfaceC6069g) r5
                java.lang.Object r6 = r10.f34893i
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r11)
                r11 = r6
                goto L59
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                int r1 = r10.f34891g
                java.lang.Object r5 = r10.f34890f
                p7.u r5 = (p7.InterfaceC6096u) r5
                java.lang.Object r6 = r10.f34889e
                p7.g r6 = (p7.InterfaceC6069g) r6
                java.lang.Object r7 = r10.f34893i
                p7.u r7 = (p7.InterfaceC6096u) r7
                R6.r.throwOnFailure(r11)
                goto L94
            L3a:
                int r1 = r10.f34891g
                java.lang.Object r5 = r10.f34889e
                p7.g r5 = (p7.InterfaceC6069g) r5
                java.lang.Object r6 = r10.f34893i
                p7.u r6 = (p7.InterfaceC6096u) r6
                R6.r.throwOnFailure(r11)
                goto L6b
            L48:
                R6.r.throwOnFailure(r11)
                java.lang.Object r11 = r10.f34893i
                p7.u r11 = (p7.InterfaceC6096u) r11
                p7.w r1 = r10.f34894j
                p7.g r1 = r1.iterator()
                r5 = 0
                r9 = r5
                r5 = r1
                r1 = r9
            L59:
                r10.f34893i = r11
                r10.f34889e = r5
                r10.f34891g = r1
                r10.f34892h = r4
                java.lang.Object r6 = r5.hasNext(r10)
                if (r6 != r0) goto L68
                return r0
            L68:
                r9 = r6
                r6 = r11
                r11 = r9
            L6b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La9
                java.lang.Object r11 = r5.next()
                f7.q r7 = r10.f34895k
                int r8 = r1 + 1
                java.lang.Integer r1 = Y6.b.boxInt(r1)
                r10.f34893i = r6
                r10.f34889e = r5
                r10.f34890f = r6
                r10.f34891g = r8
                r10.f34892h = r3
                java.lang.Object r11 = r7.invoke(r1, r11, r10)
                if (r11 != r0) goto L90
                return r0
            L90:
                r7 = r6
                r1 = r8
                r6 = r5
                r5 = r7
            L94:
                r10.f34893i = r7
                r10.f34889e = r6
                r8 = 0
                r10.f34890f = r8
                r10.f34891g = r1
                r10.f34892h = r2
                java.lang.Object r11 = r5.send(r11, r10)
                if (r11 != r0) goto La6
                return r0
            La6:
                r5 = r6
                r11 = r7
                goto L59
            La9:
                R6.G r11 = R6.G.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(InterfaceC6096u interfaceC6096u, W6.d<? super R6.G> dVar) {
            return ((y) create(interfaceC6096u, dVar)).invokeSuspend(R6.G.INSTANCE);
        }
    }

    /* renamed from: p7.o$z */
    static final class z extends Y6.d {

        /* renamed from: d */
        Object f34896d;

        /* renamed from: e */
        Object f34897e;

        /* renamed from: f */
        Object f34898f;

        /* renamed from: g */
        Object f34899g;

        /* renamed from: h */
        /* synthetic */ Object f34900h;

        /* renamed from: i */
        int f34901i;

        z(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f34900h = obj;
            this.f34901i |= Integer.MIN_VALUE;
            return AbstractC6077o.maxWith(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object any(p7.InterfaceC6098w r4, W6.d r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof p7.AbstractC6077o.C6078a
            if (r0 == 0) goto L13
            r0 = r5
            p7.o$a r0 = (p7.AbstractC6077o.C6078a) r0
            int r1 = r0.f34776f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34776f = r1
            goto L18
        L13:
            p7.o$a r0 = new p7.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f34775e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34776f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f34774d
            p7.w r4 = (p7.InterfaceC6098w) r4
            R6.r.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            R6.r.throwOnFailure(r5)
            p7.g r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.f34774d = r4     // Catch: java.lang.Throwable -> L2d
            r0.f34776f = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = 0
            p7.AbstractC6074l.cancelConsumed(r4, r0)
            return r5
        L4e:
            throw r5     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            p7.AbstractC6074l.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.any(p7.w, W6.d):java.lang.Object");
    }

    public static final f7.l consumes(InterfaceC6098w interfaceC6098w) {
        return new C6079b(interfaceC6098w);
    }

    public static final f7.l consumesAll(InterfaceC6098w... interfaceC6098wArr) {
        return new C6080c(interfaceC6098wArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:59:0x0031, B:72:0x0060, B:74:0x0068, B:75:0x0072), top: B:88:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x005d -> B:72:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object count(p7.InterfaceC6098w r6, W6.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p7.AbstractC6077o.C6081d
            if (r0 == 0) goto L13
            r0 = r7
            p7.o$d r0 = (p7.AbstractC6077o.C6081d) r0
            int r1 = r0.f34783h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34783h = r1
            goto L18
        L13:
            p7.o$d r0 = new p7.o$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34782g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34783h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f34781f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r2 = r0.f34780e
            p7.w r2 = (p7.InterfaceC6098w) r2
            java.lang.Object r4 = r0.f34779d
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L85
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            R6.r.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            p7.g r2 = r6.iterator()     // Catch: java.lang.Throwable -> L82
            r4 = r7
            r7 = r6
            r6 = r2
        L4e:
            r0.f34779d = r4     // Catch: java.lang.Throwable -> L7f
            r0.f34780e = r7     // Catch: java.lang.Throwable -> L7f
            r0.f34781f = r6     // Catch: java.lang.Throwable -> L7f
            r0.f34783h = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r5 = r2
            r2 = r7
            r7 = r5
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L35
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L72
            r6.next()     // Catch: java.lang.Throwable -> L35
            int r7 = r4.element     // Catch: java.lang.Throwable -> L35
            int r7 = r7 + r3
            r4.element = r7     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4e
        L72:
            R6.G r6 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L35
            r6 = 0
            p7.AbstractC6074l.cancelConsumed(r2, r6)
            int r6 = r4.element
            java.lang.Integer r6 = Y6.b.boxInt(r6)
            return r6
        L7f:
            r6 = move-exception
            r2 = r7
            goto L85
        L82:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L85:
            throw r6     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            p7.AbstractC6074l.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.count(p7.w, W6.d):java.lang.Object");
    }

    public static final <E, K> InterfaceC6098w distinctBy(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new C6083f(interfaceC6098w, pVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w distinctBy$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return AbstractC6074l.distinctBy(interfaceC6098w, gVar, pVar);
    }

    public static final /* synthetic */ InterfaceC6098w drop(InterfaceC6098w interfaceC6098w, int i8, W6.g gVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new C6084g(i8, interfaceC6098w, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w drop$default(InterfaceC6098w interfaceC6098w, int i8, W6.g gVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return drop(interfaceC6098w, i8, gVar);
    }

    public static final /* synthetic */ InterfaceC6098w dropWhile(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new C6085h(interfaceC6098w, pVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w dropWhile$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return dropWhile(interfaceC6098w, gVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:60:0x0035, B:73:0x0064, B:75:0x006c, B:81:0x007d, B:82:0x0094), top: B:94:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x005f -> B:73:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object elementAt(p7.InterfaceC6098w r9, int r10, W6.d r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof p7.AbstractC6077o.C6086i
            if (r0 == 0) goto L13
            r0 = r11
            p7.o$i r0 = (p7.AbstractC6077o.C6086i) r0
            int r1 = r0.f34810i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34810i = r1
            goto L18
        L13:
            p7.o$i r0 = new p7.o$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f34809h
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34810i
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 != r5) goto L3c
            int r9 = r0.f34806e
            int r10 = r0.f34805d
            java.lang.Object r2 = r0.f34808g
            p7.g r2 = (p7.InterfaceC6069g) r2
            java.lang.Object r6 = r0.f34807f
            p7.w r6 = (p7.InterfaceC6098w) r6
            R6.r.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L39
            goto L64
        L39:
            r9 = move-exception
            goto Lb1
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L44:
            R6.r.throwOnFailure(r11)
            if (r10 < 0) goto L99
            p7.g r11 = r9.iterator()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L4e:
            r0.f34807f = r9     // Catch: java.lang.Throwable -> L95
            r0.f34808g = r11     // Catch: java.lang.Throwable -> L95
            r0.f34805d = r10     // Catch: java.lang.Throwable -> L95
            r0.f34806e = r2     // Catch: java.lang.Throwable -> L95
            r0.f34810i = r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r11.hasNext(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L64:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L7d
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L39
            int r7 = r9 + 1
            if (r10 != r9) goto L79
            r9 = 0
            p7.AbstractC6074l.cancelConsumed(r6, r9)
            return r11
        L79:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4e
        L7d:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            r11.append(r4)     // Catch: java.lang.Throwable -> L39
            r11.append(r10)     // Catch: java.lang.Throwable -> L39
            r11.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L39
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L39
            throw r9     // Catch: java.lang.Throwable -> L39
        L95:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb1
        L99:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            r0.append(r4)     // Catch: java.lang.Throwable -> L95
            r0.append(r10)     // Catch: java.lang.Throwable -> L95
            r0.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L95
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L95
            throw r11     // Catch: java.lang.Throwable -> L95
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r10 = move-exception
            p7.AbstractC6074l.cancelConsumed(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.elementAt(p7.w, int, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:76:0x0068, B:78:0x0070, B:72:0x0053, B:71:0x004e), top: B:92:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0064 -> B:76:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object elementAtOrNull(p7.InterfaceC6098w r8, int r9, W6.d r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p7.AbstractC6077o.C6087j
            if (r0 == 0) goto L13
            r0 = r10
            p7.o$j r0 = (p7.AbstractC6077o.C6087j) r0
            int r1 = r0.f34816i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34816i = r1
            goto L18
        L13:
            p7.o$j r0 = new p7.o$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f34815h
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34816i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r8 = r0.f34812e
            int r9 = r0.f34811d
            java.lang.Object r2 = r0.f34814g
            p7.g r2 = (p7.InterfaceC6069g) r2
            java.lang.Object r5 = r0.f34813f
            p7.w r5 = (p7.InterfaceC6098w) r5
            R6.r.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L3b
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r0
            r0 = r7
            goto L68
        L3b:
            r8 = move-exception
            goto L88
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            R6.r.throwOnFailure(r10)
            if (r9 >= 0) goto L4e
            p7.AbstractC6074l.cancelConsumed(r8, r4)
            return r4
        L4e:
            p7.g r10 = r8.iterator()     // Catch: java.lang.Throwable -> L80
            r2 = 0
        L53:
            r0.f34813f = r8     // Catch: java.lang.Throwable -> L80
            r0.f34814g = r10     // Catch: java.lang.Throwable -> L80
            r0.f34811d = r9     // Catch: java.lang.Throwable -> L80
            r0.f34812e = r2     // Catch: java.lang.Throwable -> L80
            r0.f34816i = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r5 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L80
            if (r5 != r1) goto L64
            return r1
        L64:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r7
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L80
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r10 == 0) goto L84
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L80
            int r6 = r2 + 1
            if (r9 != r2) goto L7c
            p7.AbstractC6074l.cancelConsumed(r8, r4)
            return r10
        L7c:
            r10 = r0
            r0 = r5
            r2 = r6
            goto L53
        L80:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L88
        L84:
            p7.AbstractC6074l.cancelConsumed(r8, r4)
            return r4
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            p7.AbstractC6074l.cancelConsumed(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.elementAtOrNull(p7.w, int, W6.d):java.lang.Object");
    }

    public static final <E> InterfaceC6098w filter(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new C6088k(interfaceC6098w, pVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w filter$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return AbstractC6074l.filter(interfaceC6098w, gVar, pVar);
    }

    public static final /* synthetic */ InterfaceC6098w filterIndexed(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new C6089l(interfaceC6098w, qVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w filterIndexed$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return filterIndexed(interfaceC6098w, gVar, qVar);
    }

    public static final /* synthetic */ InterfaceC6098w filterNot(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6074l.filter(interfaceC6098w, gVar, new C6090m(pVar, null));
    }

    public static /* synthetic */ InterfaceC6098w filterNot$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return filterNot(interfaceC6098w, gVar, pVar);
    }

    public static final <E> InterfaceC6098w filterNotNull(InterfaceC6098w interfaceC6098w) {
        InterfaceC6098w interfaceC6098wFilter$default = filter$default(interfaceC6098w, null, new n(null), 1, null);
        Intrinsics.checkNotNull(interfaceC6098wFilter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return interfaceC6098wFilter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:58:0x0031, B:71:0x005c, B:73:0x0064, B:75:0x006a, B:67:0x004a, B:77:0x006f), top: B:86:0x0031 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0059 -> B:71:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(p7.InterfaceC6098w r5, java.util.Collection r6, W6.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p7.AbstractC6077o.C0367o
            if (r0 == 0) goto L13
            r0 = r7
            p7.o$o r0 = (p7.AbstractC6077o.C0367o) r0
            int r1 = r0.f34839h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34839h = r1
            goto L18
        L13:
            p7.o$o r0 = new p7.o$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34838g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34839h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f34837f
            p7.g r5 = (p7.InterfaceC6069g) r5
            java.lang.Object r6 = r0.f34836e
            p7.w r6 = (p7.InterfaceC6098w) r6
            java.lang.Object r2 = r0.f34835d
            java.util.Collection r2 = (java.util.Collection) r2
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L7a
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            R6.r.throwOnFailure(r7)
            p7.g r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f34835d = r7     // Catch: java.lang.Throwable -> L35
            r0.f34836e = r6     // Catch: java.lang.Throwable -> L35
            r0.f34837f = r5     // Catch: java.lang.Throwable -> L35
            r0.f34839h = r3     // Catch: java.lang.Throwable -> L35
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
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L6d
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
        L6d:
            r7 = r2
            goto L4a
        L6f:
            R6.G r5 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L35
            r5 = 0
            p7.AbstractC6074l.cancelConsumed(r6, r5)
            return r2
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            p7.AbstractC6074l.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.filterNotNullTo(p7.w, java.util.Collection, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:53:0x002d, B:64:0x0053, B:66:0x005b, B:69:0x0064, B:70:0x006b), top: B:79:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object first(p7.InterfaceC6098w r5, W6.d r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof p7.AbstractC6077o.q
            if (r0 == 0) goto L13
            r0 = r6
            p7.o$q r0 = (p7.AbstractC6077o.q) r0
            int r1 = r0.f34848g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34848g = r1
            goto L18
        L13:
            p7.o$q r0 = new p7.o$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34847f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34848g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f34846e
            p7.g r5 = (p7.InterfaceC6069g) r5
            java.lang.Object r0 = r0.f34845d
            p7.w r0 = (p7.InterfaceC6098w) r0
            R6.r.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            R6.r.throwOnFailure(r6)
            p7.g r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6c
            r0.f34845d = r5     // Catch: java.lang.Throwable -> L6c
            r0.f34846e = r6     // Catch: java.lang.Throwable -> L6c
            r0.f34848g = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L64
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            r6 = 0
            p7.AbstractC6074l.cancelConsumed(r0, r6)
            return r5
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r5     // Catch: java.lang.Throwable -> L31
        L6c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L70
        L70:
            r6 = move-exception
            p7.AbstractC6074l.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.first(p7.w, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object firstOrNull(p7.InterfaceC6098w r5, W6.d r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof p7.AbstractC6077o.r
            if (r0 == 0) goto L13
            r0 = r6
            p7.o$r r0 = (p7.AbstractC6077o.r) r0
            int r1 = r0.f34852g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34852g = r1
            goto L18
        L13:
            p7.o$r r0 = new p7.o$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34851f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34852g
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f34850e
            p7.g r5 = (p7.InterfaceC6069g) r5
            java.lang.Object r0 = r0.f34849d
            p7.w r0 = (p7.InterfaceC6098w) r0
            R6.r.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L31
            goto L53
        L31:
            r5 = move-exception
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            R6.r.throwOnFailure(r6)
            p7.g r6 = r5.iterator()     // Catch: java.lang.Throwable -> L68
            r0.f34849d = r5     // Catch: java.lang.Throwable -> L68
            r0.f34850e = r6     // Catch: java.lang.Throwable -> L68
            r0.f34852g = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L53:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L31
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r6 != 0) goto L60
            p7.AbstractC6074l.cancelConsumed(r0, r1)
            return r1
        L60:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L31
            p7.AbstractC6074l.cancelConsumed(r0, r1)
            return r5
        L68:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6b:
            throw r5     // Catch: java.lang.Throwable -> L6c
        L6c:
            r6 = move-exception
            p7.AbstractC6074l.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.firstOrNull(p7.w, W6.d):java.lang.Object");
    }

    public static final /* synthetic */ InterfaceC6098w flatMap(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new s(interfaceC6098w, pVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w flatMap$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return flatMap(interfaceC6098w, gVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:59:0x0033, B:72:0x0067, B:74:0x0070, B:76:0x007a, B:79:0x0084, B:68:0x0053, B:80:0x008b), top: B:91:0x0033 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0064 -> B:72:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object indexOf(p7.InterfaceC6098w r7, java.lang.Object r8, W6.d r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p7.AbstractC6077o.t
            if (r0 == 0) goto L13
            r0 = r9
            p7.o$t r0 = (p7.AbstractC6077o.t) r0
            int r1 = r0.f34863i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34863i = r1
            goto L18
        L13:
            p7.o$t r0 = new p7.o$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34862h
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34863i
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f34861g
            p7.g r7 = (p7.InterfaceC6069g) r7
            java.lang.Object r8 = r0.f34860f
            p7.w r8 = (p7.InterfaceC6098w) r8
            java.lang.Object r2 = r0.f34859e
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.f34858d
            R6.r.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L37
            goto L67
        L37:
            r7 = move-exception
            goto L9a
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            R6.r.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            p7.g r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L53:
            r0.f34858d = r9     // Catch: java.lang.Throwable -> L37
            r0.f34859e = r2     // Catch: java.lang.Throwable -> L37
            r0.f34860f = r8     // Catch: java.lang.Throwable -> L37
            r0.f34861g = r7     // Catch: java.lang.Throwable -> L37
            r0.f34863i = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L37
            if (r4 != r1) goto L64
            return r1
        L64:
            r6 = r4
            r4 = r9
            r9 = r6
        L67:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L37
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r9)     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L84
            int r7 = r2.element     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r7 = Y6.b.boxInt(r7)     // Catch: java.lang.Throwable -> L37
            p7.AbstractC6074l.cancelConsumed(r8, r5)
            return r7
        L84:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L37
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L37
            r9 = r4
            goto L53
        L8b:
            R6.G r7 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L37
            p7.AbstractC6074l.cancelConsumed(r8, r5)
            r7 = -1
            java.lang.Integer r7 = Y6.b.boxInt(r7)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            p7.AbstractC6074l.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.indexOf(p7.w, java.lang.Object, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:71:0x0032, B:95:0x008b, B:97:0x0093), top: B:109:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0087 -> B:95:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object last(p7.InterfaceC6098w r6, W6.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p7.AbstractC6077o.u
            if (r0 == 0) goto L13
            r0 = r7
            p7.o$u r0 = (p7.AbstractC6077o.u) r0
            int r1 = r0.f34868h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34868h = r1
            goto L18
        L13:
            p7.o$u r0 = new p7.o$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34867g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34868h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r6 = r0.f34866f
            java.lang.Object r2 = r0.f34865e
            p7.g r2 = (p7.InterfaceC6069g) r2
            java.lang.Object r4 = r0.f34864d
            p7.w r4 = (p7.InterfaceC6098w) r4
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L36
            goto L8b
        L36:
            r6 = move-exception
            r2 = r4
            goto Laa
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            java.lang.Object r6 = r0.f34865e
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r2 = r0.f34864d
            p7.w r2 = (p7.InterfaceC6098w) r2
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4e
            goto L69
        L4e:
            r6 = move-exception
            goto Laa
        L51:
            R6.r.throwOnFailure(r7)
            p7.g r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f34864d = r6     // Catch: java.lang.Throwable -> L9e
            r0.f34865e = r7     // Catch: java.lang.Throwable -> L9e
            r0.f34868h = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L69:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4e
            r5 = r2
            r2 = r6
            r6 = r5
        L78:
            r0.f34864d = r6     // Catch: java.lang.Throwable -> L9e
            r0.f34865e = r2     // Catch: java.lang.Throwable -> L9e
            r0.f34866f = r7     // Catch: java.lang.Throwable -> L9e
            r0.f34868h = r3     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r4 != r1) goto L87
            return r1
        L87:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L99
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L36
            r6 = r4
            goto L78
        L99:
            r7 = 0
            p7.AbstractC6074l.cancelConsumed(r4, r7)
            return r6
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto Laa
        La2:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4e
            throw r6     // Catch: java.lang.Throwable -> L4e
        Laa:
            throw r6     // Catch: java.lang.Throwable -> Lab
        Lab:
            r7 = move-exception
            p7.AbstractC6074l.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.last(p7.w, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:58:0x0037, B:71:0x0075, B:73:0x007d, B:75:0x0087, B:76:0x008b, B:67:0x005f, B:77:0x0092), top: B:88:0x0037 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0072 -> B:71:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object lastIndexOf(p7.InterfaceC6098w r7, java.lang.Object r8, W6.d r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p7.AbstractC6077o.v
            if (r0 == 0) goto L13
            r0 = r9
            p7.o$v r0 = (p7.AbstractC6077o.v) r0
            int r1 = r0.f34875j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34875j = r1
            goto L18
        L13:
            p7.o$v r0 = new p7.o$v
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f34874i
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34875j
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.f34873h
            p7.g r7 = (p7.InterfaceC6069g) r7
            java.lang.Object r8 = r0.f34872g
            p7.w r8 = (p7.InterfaceC6098w) r8
            java.lang.Object r2 = r0.f34871f
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            java.lang.Object r4 = r0.f34870e
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref.IntRef) r4
            java.lang.Object r5 = r0.f34869d
            R6.r.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3b
            goto L75
        L3b:
            r7 = move-exception
            goto La3
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            R6.r.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            r2 = -1
            r9.element = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            p7.g r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5f:
            r0.f34869d = r9     // Catch: java.lang.Throwable -> L3b
            r0.f34870e = r4     // Catch: java.lang.Throwable -> L3b
            r0.f34871f = r2     // Catch: java.lang.Throwable -> L3b
            r0.f34872g = r8     // Catch: java.lang.Throwable -> L3b
            r0.f34873h = r7     // Catch: java.lang.Throwable -> L3b
            r0.f34875j = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L3b
            if (r5 != r1) goto L72
            return r1
        L72:
            r6 = r5
            r5 = r9
            r9 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3b
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L92
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L3b
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L8b
            int r9 = r2.element     // Catch: java.lang.Throwable -> L3b
            r4.element = r9     // Catch: java.lang.Throwable -> L3b
        L8b:
            int r9 = r2.element     // Catch: java.lang.Throwable -> L3b
            int r9 = r9 + r3
            r2.element = r9     // Catch: java.lang.Throwable -> L3b
            r9 = r5
            goto L5f
        L92:
            R6.G r7 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L3b
            r7 = 0
            p7.AbstractC6074l.cancelConsumed(r8, r7)
            int r7 = r4.element
            java.lang.Integer r7 = Y6.b.boxInt(r7)
            return r7
        L9f:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La3:
            throw r7     // Catch: java.lang.Throwable -> La4
        La4:
            r9 = move-exception
            p7.AbstractC6074l.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.lastIndexOf(p7.w, java.lang.Object, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:72:0x0033, B:98:0x008f, B:100:0x0097), top: B:114:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x008b -> B:98:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object lastOrNull(p7.InterfaceC6098w r7, W6.d r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6077o.w
            if (r0 == 0) goto L13
            r0 = r8
            p7.o$w r0 = (p7.AbstractC6077o.w) r0
            int r1 = r0.f34880h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34880h = r1
            goto L18
        L13:
            p7.o$w r0 = new p7.o$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34879g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34880h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.f34878f
            java.lang.Object r2 = r0.f34877e
            p7.g r2 = (p7.InterfaceC6069g) r2
            java.lang.Object r4 = r0.f34876d
            p7.w r4 = (p7.InterfaceC6098w) r4
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L37
            goto L8f
        L37:
            r7 = move-exception
            r2 = r4
            goto La4
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            java.lang.Object r7 = r0.f34877e
            p7.g r7 = (p7.InterfaceC6069g) r7
            java.lang.Object r2 = r0.f34876d
            p7.w r2 = (p7.InterfaceC6098w) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4f
            goto L69
        L4f:
            r7 = move-exception
            goto La4
        L51:
            R6.r.throwOnFailure(r8)
            p7.g r8 = r7.iterator()     // Catch: java.lang.Throwable -> La1
            r0.f34876d = r7     // Catch: java.lang.Throwable -> La1
            r0.f34877e = r8     // Catch: java.lang.Throwable -> La1
            r0.f34880h = r4     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L75
            p7.AbstractC6074l.cancelConsumed(r2, r5)
            return r5
        L75:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4f
            r6 = r2
            r2 = r7
            r7 = r6
        L7c:
            r0.f34876d = r7     // Catch: java.lang.Throwable -> La1
            r0.f34877e = r2     // Catch: java.lang.Throwable -> La1
            r0.f34878f = r8     // Catch: java.lang.Throwable -> La1
            r0.f34880h = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 != r1) goto L8b
            return r1
        L8b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L37
            r7 = r4
            goto L7c
        L9d:
            p7.AbstractC6074l.cancelConsumed(r4, r5)
            return r7
        La1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La4:
            throw r7     // Catch: java.lang.Throwable -> La5
        La5:
            r8 = move-exception
            p7.AbstractC6074l.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.lastOrNull(p7.w, W6.d):java.lang.Object");
    }

    public static final <E, R> InterfaceC6098w map(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new x(interfaceC6098w, pVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w map$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return AbstractC6074l.map(interfaceC6098w, gVar, pVar);
    }

    public static final <E, R> InterfaceC6098w mapIndexed(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new y(interfaceC6098w, qVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w mapIndexed$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return AbstractC6074l.mapIndexed(interfaceC6098w, gVar, qVar);
    }

    public static final /* synthetic */ InterfaceC6098w mapIndexedNotNull(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar) {
        return AbstractC6074l.filterNotNull(AbstractC6074l.mapIndexed(interfaceC6098w, gVar, qVar));
    }

    public static /* synthetic */ InterfaceC6098w mapIndexedNotNull$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.q qVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return mapIndexedNotNull(interfaceC6098w, gVar, qVar);
    }

    public static final /* synthetic */ InterfaceC6098w mapNotNull(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6074l.filterNotNull(AbstractC6074l.map(interfaceC6098w, gVar, pVar));
    }

    public static /* synthetic */ InterfaceC6098w mapNotNull$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return mapNotNull(interfaceC6098w, gVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:102:0x00a3, B:104:0x00ab, B:98:0x008e, B:88:0x0062), top: B:120:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x009f -> B:77:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object maxWith(p7.InterfaceC6098w r8, java.util.Comparator r9, W6.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.maxWith(p7.w, java.util.Comparator, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #2 {all -> 0x00b9, blocks: (B:102:0x00a3, B:104:0x00ab, B:98:0x008e, B:88:0x0062), top: B:120:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x009f -> B:77:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object minWith(p7.InterfaceC6098w r8, java.util.Comparator r9, W6.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.minWith(p7.w, java.util.Comparator, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object none(p7.InterfaceC6098w r4, W6.d r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof p7.AbstractC6077o.B
            if (r0 == 0) goto L13
            r0 = r5
            p7.o$B r0 = (p7.AbstractC6077o.B) r0
            int r1 = r0.f34720f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34720f = r1
            goto L18
        L13:
            p7.o$B r0 = new p7.o$B
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f34719e
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34720f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f34718d
            p7.w r4 = (p7.InterfaceC6098w) r4
            R6.r.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r5 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            R6.r.throwOnFailure(r5)
            p7.g r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2d
            r0.f34718d = r4     // Catch: java.lang.Throwable -> L2d
            r0.f34720f = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2d
            r5 = r5 ^ r3
            java.lang.Boolean r5 = Y6.b.boxBoolean(r5)     // Catch: java.lang.Throwable -> L2d
            r0 = 0
            p7.AbstractC6074l.cancelConsumed(r4, r0)
            return r5
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            p7.AbstractC6074l.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.none(p7.w, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:76:0x0046, B:85:0x0064, B:87:0x006c, B:97:0x0096, B:98:0x009d), top: B:109:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object single(p7.InterfaceC6098w r6, W6.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p7.AbstractC6077o.D
            if (r0 == 0) goto L13
            r0 = r7
            p7.o$D r0 = (p7.AbstractC6077o.D) r0
            int r1 = r0.f34727g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34727g = r1
            goto L18
        L13:
            p7.o$D r0 = new p7.o$D
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34726f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34727g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f34725e
            java.lang.Object r0 = r0.f34724d
            p7.w r0 = (p7.InterfaceC6098w) r0
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r6 = move-exception
            r2 = r0
            goto La1
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f34725e
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r2 = r0.f34724d
            p7.w r2 = (p7.InterfaceC6098w) r2
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r6 = move-exception
            goto La1
        L4c:
            R6.r.throwOnFailure(r7)
            p7.g r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9e
            r0.f34724d = r6     // Catch: java.lang.Throwable -> L9e
            r0.f34725e = r7     // Catch: java.lang.Throwable -> L9e
            r0.f34727g = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L64:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L96
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4a
            r0.f34724d = r2     // Catch: java.lang.Throwable -> L4a
            r0.f34725e = r7     // Catch: java.lang.Throwable -> L4a
            r0.f34727g = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L4a
            if (r6 != r1) goto L7d
            return r1
        L7d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L81:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L32
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto L8e
            r7 = 0
            p7.AbstractC6074l.cancelConsumed(r0, r7)
            return r6
        L8e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L32
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L96:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            throw r6     // Catch: java.lang.Throwable -> L4a
        L9e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        La1:
            throw r6     // Catch: java.lang.Throwable -> La2
        La2:
            r7 = move-exception
            p7.AbstractC6074l.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.single(p7.w, W6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object singleOrNull(p7.InterfaceC6098w r7, W6.d r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6077o.E
            if (r0 == 0) goto L13
            r0 = r8
            p7.o$E r0 = (p7.AbstractC6077o.E) r0
            int r1 = r0.f34731g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34731g = r1
            goto L18
        L13:
            p7.o$E r0 = new p7.o$E
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34730f
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34731g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f34729e
            java.lang.Object r0 = r0.f34728d
            p7.w r0 = (p7.InterfaceC6098w) r0
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L33
            goto L86
        L33:
            r7 = move-exception
            r2 = r0
            goto L99
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.f34729e
            p7.g r7 = (p7.InterfaceC6069g) r7
            java.lang.Object r2 = r0.f34728d
            p7.w r2 = (p7.InterfaceC6098w) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7 = move-exception
            goto L99
        L4d:
            R6.r.throwOnFailure(r8)
            p7.g r8 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r0.f34728d = r7     // Catch: java.lang.Throwable -> L96
            r0.f34729e = r8     // Catch: java.lang.Throwable -> L96
            r0.f34731g = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L61
            return r1
        L61:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L71
            p7.AbstractC6074l.cancelConsumed(r2, r5)
            return r5
        L71:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r0.f34728d = r2     // Catch: java.lang.Throwable -> L4b
            r0.f34729e = r8     // Catch: java.lang.Throwable -> L4b
            r0.f34731g = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L82
            return r1
        L82:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L92
            p7.AbstractC6074l.cancelConsumed(r0, r5)
            return r5
        L92:
            p7.AbstractC6074l.cancelConsumed(r0, r5)
            return r7
        L96:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L99:
            throw r7     // Catch: java.lang.Throwable -> L9a
        L9a:
            r8 = move-exception
            p7.AbstractC6074l.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.singleOrNull(p7.w, W6.d):java.lang.Object");
    }

    public static final /* synthetic */ InterfaceC6098w take(InterfaceC6098w interfaceC6098w, int i8, W6.g gVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new F(i8, interfaceC6098w, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w take$default(InterfaceC6098w interfaceC6098w, int i8, W6.g gVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return take(interfaceC6098w, i8, gVar);
    }

    public static final /* synthetic */ InterfaceC6098w takeWhile(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new G(interfaceC6098w, pVar, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w takeWhile$default(InterfaceC6098w interfaceC6098w, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return takeWhile(interfaceC6098w, gVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:68:0x0051), top: B:94:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:61:0x0034, B:76:0x0070, B:78:0x0078, B:81:0x008b, B:68:0x0051), top: B:94:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends p7.x] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p7.w] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, p7.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0088 -> B:62:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends p7.InterfaceC6099x> java.lang.Object toChannel(p7.InterfaceC6098w r6, C r7, W6.d<? super C> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6077o.H
            if (r0 == 0) goto L13
            r0 = r8
            p7.o$H r0 = (p7.AbstractC6077o.H) r0
            int r1 = r0.f34748h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34748h = r1
            goto L18
        L13:
            p7.o$H r0 = new p7.o$H
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34747g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34748h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r6 = r0.f34746f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f34745e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f34744d
            p7.x r2 = (p7.InterfaceC6099x) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3b
        L37:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L3b:
            r6 = move-exception
            goto L96
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.f34746f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f34745e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f34744d
            p7.x r2 = (p7.InterfaceC6099x) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L3b
            goto L70
        L55:
            R6.r.throwOnFailure(r8)
            p7.g r8 = r6.iterator()     // Catch: java.lang.Throwable -> L92
        L5c:
            r0.f34744d = r7     // Catch: java.lang.Throwable -> L92
            r0.f34745e = r6     // Catch: java.lang.Throwable -> L92
            r0.f34746f = r8     // Catch: java.lang.Throwable -> L92
            r0.f34748h = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L3b
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L3b
            r0.f34744d = r2     // Catch: java.lang.Throwable -> L3b
            r0.f34745e = r7     // Catch: java.lang.Throwable -> L3b
            r0.f34746f = r6     // Catch: java.lang.Throwable -> L3b
            r0.f34748h = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r1) goto L37
            return r1
        L8b:
            R6.G r6 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L3b
            r6 = 0
            p7.AbstractC6074l.cancelConsumed(r7, r6)
            return r2
        L92:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r8 = move-exception
            p7.AbstractC6074l.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.toChannel(p7.w, p7.x, W6.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x006d), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(p7.InterfaceC6098w r5, C r6, W6.d<? super C> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof p7.AbstractC6077o.I
            if (r0 == 0) goto L13
            r0 = r7
            p7.o$I r0 = (p7.AbstractC6077o.I) r0
            int r1 = r0.f34753h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34753h = r1
            goto L18
        L13:
            p7.o$I r0 = new p7.o$I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34752g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34753h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f34751f
            p7.g r5 = (p7.InterfaceC6069g) r5
            java.lang.Object r6 = r0.f34750e
            p7.w r6 = (p7.InterfaceC6098w) r6
            java.lang.Object r2 = r0.f34749d
            java.util.Collection r2 = (java.util.Collection) r2
            R6.r.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r5 = move-exception
            goto L78
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            R6.r.throwOnFailure(r7)
            p7.g r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4a:
            r0.f34749d = r7     // Catch: java.lang.Throwable -> L35
            r0.f34750e = r6     // Catch: java.lang.Throwable -> L35
            r0.f34751f = r5     // Catch: java.lang.Throwable -> L35
            r0.f34753h = r3     // Catch: java.lang.Throwable -> L35
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
            r2.add(r7)     // Catch: java.lang.Throwable -> L35
            r7 = r2
            goto L4a
        L6d:
            R6.G r5 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L35
            r5 = 0
            p7.AbstractC6074l.cancelConsumed(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            p7.AbstractC6074l.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.toCollection(p7.w, java.util.Collection, W6.d):java.lang.Object");
    }

    public static final <E> Object toMutableSet(InterfaceC6098w interfaceC6098w, W6.d<? super Set<E>> dVar) {
        return AbstractC6074l.toCollection(interfaceC6098w, new LinkedHashSet(), dVar);
    }

    public static final /* synthetic */ InterfaceC6098w withIndex(InterfaceC6098w interfaceC6098w, W6.g gVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumes(interfaceC6098w), new K(interfaceC6098w, null), 6, null);
    }

    public static /* synthetic */ InterfaceC6098w withIndex$default(InterfaceC6098w interfaceC6098w, W6.g gVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return withIndex(interfaceC6098w, gVar);
    }

    public static /* synthetic */ InterfaceC6098w zip$default(InterfaceC6098w interfaceC6098w, InterfaceC6098w interfaceC6098w2, W6.g gVar, f7.p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = C5971a0.getUnconfined();
        }
        return AbstractC6074l.zip(interfaceC6098w, interfaceC6098w2, gVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:55:0x0031, B:68:0x005c, B:70:0x0064, B:64:0x004a, B:71:0x0077), top: B:82:0x0031 }] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0059 -> B:68:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(p7.InterfaceC6098w r6, M r7, W6.d<? super M> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6077o.J
            if (r0 == 0) goto L13
            r0 = r8
            p7.o$J r0 = (p7.AbstractC6077o.J) r0
            int r1 = r0.f34758h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34758h = r1
            goto L18
        L13:
            p7.o$J r0 = new p7.o$J
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34757g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34758h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.f34756f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f34755e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f34754d
            java.util.Map r2 = (java.util.Map) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L35
            goto L5c
        L35:
            r6 = move-exception
            goto L82
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            R6.r.throwOnFailure(r8)
            p7.g r8 = r6.iterator()     // Catch: java.lang.Throwable -> L7e
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4a:
            r0.f34754d = r8     // Catch: java.lang.Throwable -> L35
            r0.f34755e = r7     // Catch: java.lang.Throwable -> L35
            r0.f34756f = r6     // Catch: java.lang.Throwable -> L35
            r0.f34758h = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r8
            r8 = r5
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L35
            R6.p r8 = (R6.p) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r8.getFirst()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.getSecond()     // Catch: java.lang.Throwable -> L35
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L35
            r8 = r2
            goto L4a
        L77:
            R6.G r6 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L35
            r6 = 0
            p7.AbstractC6074l.cancelConsumed(r7, r6)
            return r2
        L7e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L82:
            throw r6     // Catch: java.lang.Throwable -> L83
        L83:
            r8 = move-exception
            p7.AbstractC6074l.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.toMap(p7.w, java.util.Map, W6.d):java.lang.Object");
    }

    public static final <E, R, V> InterfaceC6098w zip(InterfaceC6098w interfaceC6098w, InterfaceC6098w interfaceC6098w2, W6.g gVar, f7.p pVar) {
        return AbstractC6094s.produce$default(C5995m0.INSTANCE, gVar, 0, null, AbstractC6074l.consumesAll(interfaceC6098w, interfaceC6098w2), new M(interfaceC6098w2, interfaceC6098w, pVar, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:64:0x0034, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:71:0x004f), top: B:98:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008f A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:64:0x0034, B:79:0x006e, B:81:0x0076, B:83:0x007c, B:87:0x008f, B:71:0x004f), top: B:98:0x0022 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p7.x] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p7.w] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, p7.w] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x007a -> B:86:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0088 -> B:86:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(p7.InterfaceC6098w r6, p7.InterfaceC6099x r7, W6.d r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p7.AbstractC6077o.p
            if (r0 == 0) goto L13
            r0 = r8
            p7.o$p r0 = (p7.AbstractC6077o.p) r0
            int r1 = r0.f34844h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34844h = r1
            goto L18
        L13:
            p7.o$p r0 = new p7.o$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34843g
            java.lang.Object r1 = X6.b.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34844h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.f34842f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f34841e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f34840d
            p7.x r2 = (p7.InterfaceC6099x) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L8b
        L38:
            r6 = move-exception
            goto L9a
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.f34842f
            p7.g r6 = (p7.InterfaceC6069g) r6
            java.lang.Object r7 = r0.f34841e
            p7.w r7 = (p7.InterfaceC6098w) r7
            java.lang.Object r2 = r0.f34840d
            p7.x r2 = (p7.InterfaceC6099x) r2
            R6.r.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L38
            goto L6e
        L53:
            R6.r.throwOnFailure(r8)
            p7.g r8 = r6.iterator()     // Catch: java.lang.Throwable -> L96
        L5a:
            r0.f34840d = r7     // Catch: java.lang.Throwable -> L96
            r0.f34841e = r6     // Catch: java.lang.Throwable -> L96
            r0.f34842f = r8     // Catch: java.lang.Throwable -> L96
            r0.f34844h = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L96
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L38
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto L8b
            r0.f34840d = r2     // Catch: java.lang.Throwable -> L38
            r0.f34841e = r7     // Catch: java.lang.Throwable -> L38
            r0.f34842f = r6     // Catch: java.lang.Throwable -> L38
            r0.f34844h = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L38
            if (r8 != r1) goto L8b
            return r1
        L8b:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5a
        L8f:
            R6.G r6 = R6.G.INSTANCE     // Catch: java.lang.Throwable -> L38
            r6 = 0
            p7.AbstractC6074l.cancelConsumed(r7, r6)
            return r2
        L96:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L9a:
            throw r6     // Catch: java.lang.Throwable -> L9b
        L9b:
            r8 = move-exception
            p7.AbstractC6074l.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.AbstractC6077o.filterNotNullTo(p7.w, p7.x, W6.d):java.lang.Object");
    }
}
