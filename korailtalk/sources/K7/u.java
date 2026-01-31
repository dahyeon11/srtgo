package k7;

import Q7.C;
import R6.G;
import S6.AbstractC0765i;
import S6.I;
import S6.J;
import S6.d0;
import S6.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public class u extends k7.t {

    static final class A extends Lambda implements f7.p {
        public static final A INSTANCE = new A();

        A() {
            super(2);
        }

        @Override // f7.p
        public final R6.p invoke(T t8, T t9) {
            return R6.v.to(t8, t9);
        }
    }

    static final class B extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33728c;

        /* renamed from: d */
        Object f33729d;

        /* renamed from: e */
        int f33730e;

        /* renamed from: f */
        private /* synthetic */ Object f33731f;

        /* renamed from: g */
        final /* synthetic */ k7.m f33732g;

        /* renamed from: h */
        final /* synthetic */ f7.p f33733h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(k7.m mVar, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f33732g = mVar;
            this.f33733h = pVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            B b9 = new B(this.f33732g, this.f33733h, dVar);
            b9.f33731f = obj;
            return b9;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005b -> B:27:0x0018). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r6.f33730e
                r2 = 1
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r6.f33729d
                java.lang.Object r3 = r6.f33728c
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r6.f33731f
                k7.o r4 = (k7.o) r4
                R6.r.throwOnFailure(r7)
            L18:
                r7 = r1
                goto L3f
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                R6.r.throwOnFailure(r7)
                java.lang.Object r7 = r6.f33731f
                k7.o r7 = (k7.o) r7
                k7.m r1 = r6.f33732g
                java.util.Iterator r1 = r1.iterator()
                boolean r3 = r1.hasNext()
                if (r3 != 0) goto L38
                R6.G r7 = R6.G.INSTANCE
                return r7
            L38:
                java.lang.Object r3 = r1.next()
                r4 = r7
                r7 = r3
                r3 = r1
            L3f:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r3.next()
                f7.p r5 = r6.f33733h
                java.lang.Object r7 = r5.invoke(r7, r1)
                r6.f33731f = r4
                r6.f33728c = r3
                r6.f33729d = r1
                r6.f33730e = r2
                java.lang.Object r7 = r4.yield(r7, r6)
                if (r7 != r0) goto L18
                return r0
            L5e:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.u.B.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super G> dVar) {
            return ((B) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    /* renamed from: k7.u$a */
    public static final class C5873a implements Iterable, KMappedMarker {

        /* renamed from: a */
        final /* synthetic */ k7.m f33734a;

        public C5873a(k7.m mVar) {
            this.f33734a = mVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f33734a.iterator();
        }
    }

    static final class c extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ int f33735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8) {
            super(1);
            this.f33735a = i8;
        }

        public final T invoke(int i8) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f33735a + C.PACKAGE_SEPARATOR_CHAR);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    static final class d extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ f7.p f33736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f7.p pVar) {
            super(1);
            this.f33736a = pVar;
        }

        @Override // f7.l
        public final Boolean invoke(J it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Boolean) this.f33736a.invoke(Integer.valueOf(it.getIndex()), it.getValue());
        }
    }

    static final class e extends Lambda implements f7.l {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // f7.l
        public final T invoke(J it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }
    }

    public static final class f extends Lambda implements f7.l {
        public static final f INSTANCE = new f();

        public f() {
            super(1);
        }

        @Override // f7.l
        public final Boolean invoke(Object obj) {
            Intrinsics.reifiedOperationMarker(3, "R");
            return Boolean.valueOf(Objects.nonNull(obj));
        }
    }

    static final class g extends Lambda implements f7.l {
        public static final g INSTANCE = new g();

        g() {
            super(1);
        }

        @Override // f7.l
        public final Boolean invoke(T t8) {
            return Boolean.valueOf(t8 == 0);
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((g) obj);
        }
    }

    /* synthetic */ class h extends FunctionReferenceImpl implements f7.l {
        public static final h INSTANCE = new h();

        h() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f7.l
        public final Iterator<R> invoke(Iterable<? extends R> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.iterator();
        }
    }

    /* synthetic */ class i extends FunctionReferenceImpl implements f7.l {
        public static final i INSTANCE = new i();

        i() {
            super(1, k7.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // f7.l
        public final Iterator<R> invoke(k7.m p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.iterator();
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements f7.l {
        public static final j INSTANCE = new j();

        j() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f7.l
        public final Iterator<R> invoke(Iterable<? extends R> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.iterator();
        }
    }

    /* synthetic */ class k extends FunctionReferenceImpl implements f7.l {
        public static final k INSTANCE = new k();

        k() {
            super(1, k7.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // f7.l
        public final Iterator<R> invoke(k7.m p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.iterator();
        }
    }

    public static final class l implements I {

        /* renamed from: a */
        final /* synthetic */ k7.m f33737a;

        /* renamed from: b */
        final /* synthetic */ f7.l f33738b;

        public l(k7.m mVar, f7.l lVar) {
            this.f33737a = mVar;
            this.f33738b = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // S6.I
        public K keyOf(T t8) {
            return this.f33738b.invoke(t8);
        }

        @Override // S6.I
        public Iterator<T> sourceIterator() {
            return this.f33737a.iterator();
        }
    }

    public static final class m implements k7.m {

        /* renamed from: a */
        final /* synthetic */ k7.m f33739a;

        /* renamed from: b */
        final /* synthetic */ Object f33740b;

        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ Ref.BooleanRef f33741a;

            /* renamed from: b */
            final /* synthetic */ Object f33742b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ref.BooleanRef booleanRef, Object obj) {
                super(1);
                this.f33741a = booleanRef;
                this.f33742b = obj;
            }

            @Override // f7.l
            public final Boolean invoke(T t8) {
                boolean z8 = true;
                if (!this.f33741a.element && Intrinsics.areEqual(t8, this.f33742b)) {
                    this.f33741a.element = true;
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((a) obj);
            }
        }

        m(k7.m mVar, Object obj) {
            this.f33739a = mVar;
            this.f33740b = obj;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            return u.filter(this.f33739a, new a(new Ref.BooleanRef(), this.f33740b)).iterator();
        }
    }

    public static final class n implements k7.m {

        /* renamed from: a */
        final /* synthetic */ k7.m f33743a;

        /* renamed from: b */
        final /* synthetic */ Object[] f33744b;

        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ Object[] f33745a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object[] objArr) {
                super(1);
                this.f33745a = objArr;
            }

            @Override // f7.l
            public final Boolean invoke(T t8) {
                return Boolean.valueOf(AbstractC0765i.contains(this.f33745a, t8));
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((a) obj);
            }
        }

        n(k7.m mVar, Object[] objArr) {
            this.f33743a = mVar;
            this.f33744b = objArr;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            return u.filterNot(this.f33743a, new a(this.f33744b)).iterator();
        }
    }

    public static final class o implements k7.m {

        /* renamed from: a */
        final /* synthetic */ Iterable f33746a;

        /* renamed from: b */
        final /* synthetic */ k7.m f33747b;

        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ Collection f33748a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Collection collection) {
                super(1);
                this.f33748a = collection;
            }

            @Override // f7.l
            public final Boolean invoke(T t8) {
                return Boolean.valueOf(this.f33748a.contains(t8));
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((a) obj);
            }
        }

        o(Iterable iterable, k7.m mVar) {
            this.f33746a = iterable;
            this.f33747b = mVar;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            Collection collectionConvertToListIfNotCollection = S6.r.convertToListIfNotCollection(this.f33746a);
            return collectionConvertToListIfNotCollection.isEmpty() ? this.f33747b.iterator() : u.filterNot(this.f33747b, new a(collectionConvertToListIfNotCollection)).iterator();
        }
    }

    public static final class p implements k7.m {

        /* renamed from: a */
        final /* synthetic */ k7.m f33749a;

        /* renamed from: b */
        final /* synthetic */ k7.m f33750b;

        static final class a extends Lambda implements f7.l {

            /* renamed from: a */
            final /* synthetic */ List f33751a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.f33751a = list;
            }

            @Override // f7.l
            public final Boolean invoke(T t8) {
                return Boolean.valueOf(this.f33751a.contains(t8));
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((a) obj);
            }
        }

        p(k7.m mVar, k7.m mVar2) {
            this.f33749a = mVar;
            this.f33750b = mVar2;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            List list = k7.p.toList(this.f33749a);
            return list.isEmpty() ? this.f33750b.iterator() : u.filterNot(this.f33750b, new a(list)).iterator();
        }
    }

    static final class q extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ f7.l f33752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(f7.l lVar) {
            super(1);
            this.f33752a = lVar;
        }

        @Override // f7.l
        public final T invoke(T t8) {
            this.f33752a.invoke(t8);
            return t8;
        }
    }

    static final class r extends Lambda implements f7.p {

        /* renamed from: a */
        final /* synthetic */ f7.p f33753a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(f7.p pVar) {
            super(2);
            this.f33753a = pVar;
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (int) obj2);
        }

        public final T invoke(int i8, T t8) {
            this.f33753a.invoke(Integer.valueOf(i8), t8);
            return t8;
        }
    }

    static final class s extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ k7.m f33754a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(k7.m mVar) {
            super(1);
            this.f33754a = mVar;
        }

        @Override // f7.l
        public final T invoke(T t8) {
            if (t8 != 0) {
                return t8;
            }
            throw new IllegalArgumentException("null element found in " + this.f33754a + C.PACKAGE_SEPARATOR_CHAR);
        }
    }

    static final class t extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33755c;

        /* renamed from: d */
        Object f33756d;

        /* renamed from: e */
        int f33757e;

        /* renamed from: f */
        private /* synthetic */ Object f33758f;

        /* renamed from: g */
        final /* synthetic */ Object f33759g;

        /* renamed from: h */
        final /* synthetic */ k7.m f33760h;

        /* renamed from: i */
        final /* synthetic */ f7.p f33761i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Object obj, k7.m mVar, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f33759g = obj;
            this.f33760h = mVar;
            this.f33761i = pVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            t tVar = new t(this.f33759g, this.f33760h, this.f33761i, dVar);
            tVar.f33758f = obj;
            return tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0068 -> B:29:0x001b). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r6.f33757e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.f33756d
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.f33755c
                java.lang.Object r4 = r6.f33758f
                k7.o r4 = (k7.o) r4
                R6.r.throwOnFailure(r7)
            L1b:
                r7 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.f33758f
                k7.o r1 = (k7.o) r1
                R6.r.throwOnFailure(r7)
                goto L42
            L2d:
                R6.r.throwOnFailure(r7)
                java.lang.Object r7 = r6.f33758f
                r1 = r7
                k7.o r1 = (k7.o) r1
                java.lang.Object r7 = r6.f33759g
                r6.f33758f = r1
                r6.f33757e = r3
                java.lang.Object r7 = r1.yield(r7, r6)
                if (r7 != r0) goto L42
                return r0
            L42:
                java.lang.Object r7 = r6.f33759g
                k7.m r3 = r6.f33760h
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                f7.p r5 = r6.f33761i
                java.lang.Object r3 = r5.invoke(r7, r3)
                r6.f33758f = r4
                r6.f33755c = r3
                r6.f33756d = r1
                r6.f33757e = r2
                java.lang.Object r7 = r4.yield(r3, r6)
                if (r7 != r0) goto L1b
                return r0
            L6b:
                R6.G r7 = R6.G.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.u.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super G> dVar) {
            return ((t) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    /* renamed from: k7.u$u */
    static final class C0340u extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33762c;

        /* renamed from: d */
        Object f33763d;

        /* renamed from: e */
        int f33764e;

        /* renamed from: f */
        int f33765f;

        /* renamed from: g */
        private /* synthetic */ Object f33766g;

        /* renamed from: h */
        final /* synthetic */ Object f33767h;

        /* renamed from: i */
        final /* synthetic */ k7.m f33768i;

        /* renamed from: j */
        final /* synthetic */ f7.q f33769j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0340u(Object obj, k7.m mVar, f7.q qVar, W6.d dVar) {
            super(2, dVar);
            this.f33767h = obj;
            this.f33768i = mVar;
            this.f33769j = qVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            C0340u c0340u = new C0340u(this.f33767h, this.f33768i, this.f33769j, dVar);
            c0340u.f33766g = obj;
            return c0340u;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r8.f33765f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r8.f33764e
                java.lang.Object r3 = r8.f33763d
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r8.f33762c
                java.lang.Object r5 = r8.f33766g
                k7.o r5 = (k7.o) r5
                R6.r.throwOnFailure(r9)
                r9 = r4
                r4 = r1
                goto L4f
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                java.lang.Object r1 = r8.f33766g
                k7.o r1 = (k7.o) r1
                R6.r.throwOnFailure(r9)
                goto L45
            L30:
                R6.r.throwOnFailure(r9)
                java.lang.Object r9 = r8.f33766g
                r1 = r9
                k7.o r1 = (k7.o) r1
                java.lang.Object r9 = r8.f33767h
                r8.f33766g = r1
                r8.f33765f = r3
                java.lang.Object r9 = r1.yield(r9, r8)
                if (r9 != r0) goto L45
                return r0
            L45:
                java.lang.Object r9 = r8.f33767h
                k7.m r3 = r8.f33768i
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = r1
            L4f:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L7e
                java.lang.Object r1 = r3.next()
                f7.q r6 = r8.f33769j
                int r7 = r4 + 1
                if (r4 >= 0) goto L62
                S6.r.throwIndexOverflow()
            L62:
                java.lang.Integer r4 = Y6.b.boxInt(r4)
                java.lang.Object r4 = r6.invoke(r4, r9, r1)
                r8.f33766g = r5
                r8.f33762c = r4
                r8.f33763d = r3
                r8.f33764e = r7
                r8.f33765f = r2
                java.lang.Object r9 = r5.yield(r4, r8)
                if (r9 != r0) goto L7b
                return r0
            L7b:
                r9 = r4
                r4 = r7
                goto L4f
            L7e:
                R6.G r9 = R6.G.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.u.C0340u.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super G> dVar) {
            return ((C0340u) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    static final class v extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33770c;

        /* renamed from: d */
        Object f33771d;

        /* renamed from: e */
        int f33772e;

        /* renamed from: f */
        private /* synthetic */ Object f33773f;

        /* renamed from: g */
        final /* synthetic */ k7.m f33774g;

        /* renamed from: h */
        final /* synthetic */ f7.p f33775h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(k7.m mVar, f7.p pVar, W6.d dVar) {
            super(2, dVar);
            this.f33774g = mVar;
            this.f33775h = pVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            v vVar = new v(this.f33774g, this.f33775h, dVar);
            vVar.f33773f = obj;
            return vVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k7.o oVar;
            Object next;
            Iterator<Object> it;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f33772e;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                oVar = (k7.o) this.f33773f;
                Iterator<Object> it2 = this.f33774g.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f33773f = oVar;
                    this.f33770c = it2;
                    this.f33771d = next;
                    this.f33772e = 1;
                    if (oVar.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = it2;
                }
                return G.INSTANCE;
            }
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f33771d;
            it = (Iterator) this.f33770c;
            oVar = (k7.o) this.f33773f;
            R6.r.throwOnFailure(obj);
            while (it.hasNext()) {
                next = this.f33775h.invoke(next, it.next());
                this.f33773f = oVar;
                this.f33770c = it;
                this.f33771d = next;
                this.f33772e = 2;
                if (oVar.yield(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super G> dVar) {
            return ((v) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    static final class w extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33776c;

        /* renamed from: d */
        Object f33777d;

        /* renamed from: e */
        int f33778e;

        /* renamed from: f */
        int f33779f;

        /* renamed from: g */
        private /* synthetic */ Object f33780g;

        /* renamed from: h */
        final /* synthetic */ k7.m f33781h;

        /* renamed from: i */
        final /* synthetic */ f7.q f33782i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(k7.m mVar, f7.q qVar, W6.d dVar) {
            super(2, dVar);
            this.f33781h = mVar;
            this.f33782i = qVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            w wVar = new w(this.f33781h, this.f33782i, dVar);
            wVar.f33780g = obj;
            return wVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k7.o oVar;
            Iterator<Object> it;
            Object next;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f33779f;
            int i9 = 1;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                oVar = (k7.o) this.f33780g;
                it = this.f33781h.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.f33780g = oVar;
                    this.f33776c = it;
                    this.f33777d = next;
                    this.f33779f = 1;
                    if (oVar.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G.INSTANCE;
            }
            if (i8 == 1) {
                next = this.f33777d;
                it = (Iterator) this.f33776c;
                oVar = (k7.o) this.f33780g;
                R6.r.throwOnFailure(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = this.f33778e;
                Object obj2 = this.f33777d;
                it = (Iterator) this.f33776c;
                oVar = (k7.o) this.f33780g;
                R6.r.throwOnFailure(obj);
                i9 = i10;
                next = obj2;
            }
            while (it.hasNext()) {
                f7.q qVar = this.f33782i;
                int i11 = i9 + 1;
                if (i9 < 0) {
                    S6.r.throwIndexOverflow();
                }
                Object objInvoke = qVar.invoke(Y6.b.boxInt(i9), next, it.next());
                this.f33780g = oVar;
                this.f33776c = it;
                this.f33777d = objInvoke;
                this.f33778e = i11;
                this.f33779f = 2;
                if (oVar.yield(objInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = objInvoke;
                i9 = i11;
            }
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super G> dVar) {
            return ((w) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public static final class x implements k7.m {

        /* renamed from: a */
        final /* synthetic */ k7.m f33783a;

        x(k7.m mVar) {
            this.f33783a = mVar;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            List mutableList = u.toMutableList(this.f33783a);
            S6.r.sort(mutableList);
            return mutableList.iterator();
        }
    }

    public static final class y implements k7.m {

        /* renamed from: a */
        final /* synthetic */ k7.m f33784a;

        /* renamed from: b */
        final /* synthetic */ Comparator f33785b;

        y(k7.m mVar, Comparator comparator) {
            this.f33784a = mVar;
            this.f33785b = comparator;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            List mutableList = u.toMutableList(this.f33784a);
            S6.r.sortWith(mutableList, this.f33785b);
            return mutableList.iterator();
        }
    }

    static final class z extends Lambda implements f7.p {
        public static final z INSTANCE = new z();

        z() {
            super(2);
        }

        @Override // f7.p
        public final R6.p invoke(T t8, R r8) {
            return R6.v.to(t8, r8);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((z) obj, obj2);
        }
    }

    public static final <T> boolean all(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    public static <T> Iterable<T> asIterable(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new C5873a(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(k7.m mVar, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            R6.p pVar = (R6.p) transform.invoke(it.next());
            linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(k7.m mVar, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            linkedHashMap.put(keySelector.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(k7.m mVar, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (Object obj : mVar) {
            destination.put(keySelector.invoke(obj), obj);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(k7.m mVar, M destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            R6.p pVar = (R6.p) transform.invoke(it.next());
            destination.put(pVar.getFirst(), pVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(k7.m mVar, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            linkedHashMap.put(obj, valueSelector.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(k7.m mVar, M destination, f7.l valueSelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (Object obj : mVar) {
            destination.put(obj, valueSelector.invoke(obj));
        }
        return destination;
    }

    public static final double averageOfByte(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dByteValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dByteValue += ((Number) it.next()).byteValue();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dByteValue / i8;
    }

    public static final double averageOfDouble(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dDoubleValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i8;
    }

    public static final double averageOfFloat(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dFloatValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dFloatValue += ((Number) it.next()).floatValue();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dFloatValue / i8;
    }

    public static final double averageOfInt(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dIntValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dIntValue += ((Number) it.next()).intValue();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dIntValue / i8;
    }

    public static final double averageOfLong(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dLongValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dLongValue / i8;
    }

    public static final double averageOfShort(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dShortValue = 0.0d;
        int i8 = 0;
        while (it.hasNext()) {
            dShortValue += ((Number) it.next()).shortValue();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        if (i8 == 0) {
            return Double.NaN;
        }
        return dShortValue / i8;
    }

    public static final <T> k7.m chunked(k7.m mVar, int i8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return windowed(mVar, i8, i8, true);
    }

    public static final <T> boolean contains(k7.m mVar, T t8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return indexOf(mVar, t8) >= 0;
    }

    public static <T> int count(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 < 0) {
                S6.r.throwCountOverflow();
            }
        }
        return i8;
    }

    public static final <T> k7.m distinct(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return distinctBy(mVar, C5874b.INSTANCE);
    }

    public static final <T, K> k7.m distinctBy(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new C5865c(mVar, selector);
    }

    public static final <T> k7.m drop(k7.m mVar, int i8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i8 >= 0) {
            return i8 == 0 ? mVar : mVar instanceof InterfaceC5867e ? ((InterfaceC5867e) mVar).drop(i8) : new C5866d(mVar, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> k7.m dropWhile(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C5868f(mVar, predicate);
    }

    public static final <T> T elementAt(k7.m mVar, int i8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (T) elementAtOrElse(mVar, i8, new c(i8));
    }

    public static final <T> T elementAtOrElse(k7.m mVar, int i8, f7.l defaultValue) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i8 < 0) {
            return (T) defaultValue.invoke(Integer.valueOf(i8));
        }
        Iterator<Object> it = mVar.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            T t8 = (T) it.next();
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t8;
            }
            i9 = i10;
        }
        return (T) defaultValue.invoke(Integer.valueOf(i8));
    }

    public static final <T> T elementAtOrNull(k7.m mVar, int i8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i8 < 0) {
            return null;
        }
        Iterator<Object> it = mVar.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            T t8 = (T) it.next();
            int i10 = i9 + 1;
            if (i8 == i9) {
                return t8;
            }
            i9 = i10;
        }
        return null;
    }

    public static final <T> k7.m filter(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C5870h(mVar, true, predicate);
    }

    public static final <T> k7.m filterIndexed(k7.m mVar, f7.p predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new k7.z(new C5870h(new k7.k(mVar), true, new d(predicate)), e.INSTANCE);
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(k7.m mVar, C destination, f7.p predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i8), obj)).booleanValue()) {
                destination.add(obj);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final /* synthetic */ <R> k7.m filterIsInstance(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.needClassReification();
        k7.m mVarFilter = filter(mVar, f.INSTANCE);
        Intrinsics.checkNotNull(mVarFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return mVarFilter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(k7.m mVar, C destination) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : mVar) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> k7.m filterNot(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C5870h(mVar, false, predicate);
    }

    public static final <T> k7.m filterNotNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        k7.m mVarFilterNot = filterNot(mVar, g.INSTANCE);
        Intrinsics.checkNotNull(mVarFilterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return mVarFilterNot;
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(k7.m mVar, C destination) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : mVar) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(k7.m mVar, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object obj : mVar) {
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(k7.m mVar, C destination, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> T first(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T> T firstOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }

    public static final <T, R> k7.m flatMap(k7.m mVar, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C5871i(mVar, transform, i.INSTANCE);
    }

    public static final <T, R> k7.m flatMapIndexedIterable(k7.m mVar, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return k7.s.flatMapIndexed(mVar, transform, j.INSTANCE);
    }

    public static final <T, R> k7.m flatMapIndexedSequence(k7.m mVar, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return k7.s.flatMapIndexed(mVar, transform, k.INSTANCE);
    }

    public static final <T, R> k7.m flatMapIterable(k7.m mVar, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C5871i(mVar, transform, h.INSTANCE);
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(k7.m mVar, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            S6.r.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(k7.m mVar, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            S6.r.addAll(destination, (k7.m) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(k7.m mVar, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            r8 = (R) operation.invoke(r8, it.next());
        }
        return r8;
    }

    public static final <T, R> R foldIndexed(k7.m mVar, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, obj);
            i8 = i9;
        }
        return r8;
    }

    public static final <T> void forEach(k7.m mVar, f7.l action) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(k7.m mVar, f7.p action) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i8), obj);
            i8 = i9;
        }
    }

    public static final <T, K> Map<K, List<T>> groupBy(k7.m mVar, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(k7.m mVar, M destination, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (Object obj : mVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        return destination;
    }

    public static final <T, K> I groupingBy(k7.m mVar, f7.l keySelector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new l(mVar, keySelector);
    }

    public static final <T> int indexOf(k7.m mVar, T t8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i8 = 0;
        for (Object obj : mVar) {
            if (i8 < 0) {
                S6.r.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t8, obj)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (Object obj : mVar) {
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i8 = -1;
        int i9 = 0;
        for (Object obj : mVar) {
            if (i9 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T, A extends Appendable> A joinTo(k7.m mVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : mVar) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            l7.r.appendElement(buffer, obj, lVar);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(k7.m mVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, f7.l lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(mVar, new StringBuilder(), separator, prefix, postfix, i8, truncated, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(k7.m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, f7.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        return joinToString(mVar, charSequence, charSequence5, charSequence6, i10, charSequence7, lVar);
    }

    public static <T> T last(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            t8 = (T) it.next();
        }
        return t8;
    }

    public static final <T> int lastIndexOf(k7.m mVar, T t8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i8 = -1;
        int i9 = 0;
        for (Object obj : mVar) {
            if (i9 < 0) {
                S6.r.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t8, obj)) {
                i8 = i9;
            }
            i9++;
        }
        return i8;
    }

    public static final <T> T lastOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            t8 = (T) it.next();
        }
        return t8;
    }

    public static <T, R> k7.m map(k7.m mVar, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new k7.z(mVar, transform);
    }

    public static final <T, R> k7.m mapIndexed(k7.m mVar, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new k7.y(mVar, transform);
    }

    public static final <T, R> k7.m mapIndexedNotNull(k7.m mVar, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return filterNotNull(new k7.y(mVar, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(k7.m mVar, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            Object objInvoke = transform.invoke(Integer.valueOf(i8), obj);
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i8 = i9;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(k7.m mVar, C destination, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        for (Object obj : mVar) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i8), obj));
            i8 = i9;
        }
        return destination;
    }

    public static <T, R> k7.m mapNotNull(k7.m mVar, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return filterNotNull(new k7.z(mVar, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(k7.m mVar, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(k7.m mVar, C destination, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        if (!it.hasNext()) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t8 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t8;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t8 = (T) it.next();
        if (!it.hasNext()) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t8 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t8;
    }

    /* renamed from: maxOrNull */
    public static final Double m414maxOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double maxOrThrow(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T maxWithOrNull(k7.m mVar, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t8, next) < 0) {
                t8 = (T) next;
            }
        }
        return t8;
    }

    public static final <T> T maxWithOrThrow(k7.m mVar, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t8, next) < 0) {
                t8 = (T) next;
            }
        }
        return t8;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        if (!it.hasNext()) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t8 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t8;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t8 = (T) it.next();
        if (!it.hasNext()) {
            return t8;
        }
        Comparable comparable = (Comparable) selector.invoke(t8);
        do {
            Object next = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t8 = (T) next;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return t8;
    }

    /* renamed from: minOrNull */
    public static final Double m418minOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double minOrThrow(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T minWithOrNull(k7.m mVar, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t8, next) > 0) {
                t8 = (T) next;
            }
        }
        return t8;
    }

    public static final <T> T minWithOrThrow(k7.m mVar, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t8, next) > 0) {
                t8 = (T) next;
            }
        }
        return t8;
    }

    public static final <T> k7.m minus(k7.m mVar, T t8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new m(mVar, t8);
    }

    public static final <T> boolean none(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    public static final <T> k7.m onEach(k7.m mVar, f7.l action) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return k7.p.map(mVar, new q(action));
    }

    public static final <T> k7.m onEachIndexed(k7.m mVar, f7.p action) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return mapIndexed(mVar, new r(action));
    }

    public static final <T> R6.p partition(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new R6.p(arrayList, arrayList2);
    }

    public static final <T> k7.m plus(k7.m mVar, T t8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return k7.s.flatten(k7.s.sequenceOf(mVar, k7.s.sequenceOf(t8)));
    }

    public static final <S, T extends S> S reduce(k7.m mVar, f7.p operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S s8 = (S) it.next();
        while (it.hasNext()) {
            s8 = (S) operation.invoke(s8, it.next());
        }
        return s8;
    }

    public static final <S, T extends S> S reduceIndexed(k7.m mVar, f7.q operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S s8 = (S) it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            s8 = (S) operation.invoke(Integer.valueOf(i8), s8, it.next());
            i8 = i9;
        }
        return s8;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(k7.m mVar, f7.q operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S s8 = (S) it.next();
        int i8 = 1;
        while (it.hasNext()) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                S6.r.throwIndexOverflow();
            }
            s8 = (S) operation.invoke(Integer.valueOf(i8), s8, it.next());
            i8 = i9;
        }
        return s8;
    }

    public static final <S, T extends S> S reduceOrNull(k7.m mVar, f7.p operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S s8 = (S) it.next();
        while (it.hasNext()) {
            s8 = (S) operation.invoke(s8, it.next());
        }
        return s8;
    }

    public static final <T> k7.m requireNoNulls(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return k7.p.map(mVar, new s(mVar));
    }

    public static final <T, R> k7.m runningFold(k7.m mVar, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return k7.p.sequence(new t(r8, mVar, operation, null));
    }

    public static final <T, R> k7.m runningFoldIndexed(k7.m mVar, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return k7.p.sequence(new C0340u(r8, mVar, operation, null));
    }

    public static final <S, T extends S> k7.m runningReduce(k7.m mVar, f7.p operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return k7.p.sequence(new v(mVar, operation, null));
    }

    public static final <S, T extends S> k7.m runningReduceIndexed(k7.m mVar, f7.q operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return k7.p.sequence(new w(mVar, operation, null));
    }

    public static final <T, R> k7.m scan(k7.m mVar, R r8, f7.p operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return runningFold(mVar, r8, operation);
    }

    public static final <T, R> k7.m scanIndexed(k7.m mVar, R r8, f7.q operation) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return runningFoldIndexed(mVar, r8, operation);
    }

    public static final <T> T single(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T t8 = (T) it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return t8;
    }

    public static final <T> T singleOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        if (it.hasNext()) {
            return null;
        }
        return t8;
    }

    public static final <T extends Comparable<? super T>> k7.m sorted(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new x(mVar);
    }

    public static final <T, R extends Comparable<? super R>> k7.m sortedBy(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(mVar, new V6.g(selector));
    }

    public static final <T, R extends Comparable<? super R>> k7.m sortedByDescending(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(mVar, new V6.h(selector));
    }

    public static final <T extends Comparable<? super T>> k7.m sortedDescending(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return sortedWith(mVar, V6.a.reverseOrder());
    }

    public static final <T> k7.m sortedWith(k7.m mVar, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new y(mVar, comparator);
    }

    public static final <T> int sumBy(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) selector.invoke(it.next())).intValue();
        }
        return iIntValue;
    }

    public static final <T> double sumByDouble(k7.m mVar, f7.l selector) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<Object> it = mVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return dDoubleValue;
    }

    public static final int sumOfByte(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += ((Number) it.next()).byteValue();
        }
        return iByteValue;
    }

    public static final double sumOfDouble(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static final float sumOfFloat(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static final int sumOfInt(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static final long sumOfLong(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static final int sumOfShort(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += ((Number) it.next()).shortValue();
        }
        return iShortValue;
    }

    public static final <T> k7.m take(k7.m mVar, int i8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i8 >= 0) {
            return i8 == 0 ? k7.p.emptySequence() : mVar instanceof InterfaceC5867e ? ((InterfaceC5867e) mVar).take(i8) : new k7.w(mVar, i8);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static final <T> k7.m takeWhile(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new k7.x(mVar, predicate);
    }

    public static final <T, C extends Collection<? super T>> C toCollection(k7.m mVar, C destination) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final <T> HashSet<T> toHashSet(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (HashSet) toCollection(mVar, new HashSet());
    }

    public static <T> List<T> toList(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return S6.r.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return S6.r.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final <T> List<T> toMutableList(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (List) toCollection(mVar, new ArrayList());
    }

    public static final <T> Set<T> toMutableSet(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> toSet(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return d0.emptySet();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return d0.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> k7.m windowed(k7.m mVar, int i8, int i9, boolean z8) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return i0.windowedSequence(mVar, i8, i9, z8, false);
    }

    public static /* synthetic */ k7.m windowed$default(k7.m mVar, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowed(mVar, i8, i9, z8);
    }

    public static final <T> k7.m withIndex(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new k7.k(mVar);
    }

    public static final <T, R> k7.m zip(k7.m mVar, k7.m other) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new k7.l(mVar, other, z.INSTANCE);
    }

    public static final <T> k7.m zipWithNext(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return zipWithNext(mVar, A.INSTANCE);
    }

    public static final <T> boolean any(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, R> k7.m chunked(k7.m mVar, int i8, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(mVar, i8, i8, true, transform);
    }

    public static final <T> int count(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue() && (i8 = i8 + 1) < 0) {
                if (!a7.b.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                S6.r.throwCountOverflow();
            }
        }
        return i8;
    }

    public static final <T> k7.m minus(k7.m mVar, T[] elements) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? mVar : new n(mVar, elements);
    }

    public static final <T> boolean none(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> k7.m plus(k7.m mVar, T[] elements) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return plus(mVar, (Iterable) AbstractC0765i.asList(elements));
    }

    public static final <T, R> k7.m windowed(k7.m mVar, int i8, int i9, boolean z8, f7.l transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return k7.p.map(i0.windowedSequence(mVar, i8, i9, z8, true), transform);
    }

    public static /* synthetic */ k7.m windowed$default(k7.m mVar, int i8, int i9, boolean z8, f7.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return windowed(mVar, i8, i9, z8, lVar);
    }

    public static final <T, R, V> k7.m zip(k7.m mVar, k7.m other, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new k7.l(mVar, other, transform);
    }

    public static final <T, R> k7.m zipWithNext(k7.m mVar, f7.p transform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return k7.p.sequence(new B(mVar, transform, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(k7.m mVar, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object obj : mVar) {
            destination.put(keySelector.invoke(obj), valueTransform.invoke(obj));
        }
        return destination;
    }

    public static final <T> k7.m plus(k7.m mVar, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return k7.s.flatten(k7.s.sequenceOf(mVar, S6.r.asSequence(elements)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(k7.m mVar, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            linkedHashMap.put(keySelector.invoke(obj), valueTransform.invoke(obj));
        }
        return linkedHashMap;
    }

    public static final <T> T firstOrNull(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            T t8 = (T) it.next();
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    public static final <T> k7.m minus(k7.m mVar, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new o(elements, mVar);
    }

    public static final <T> k7.m plus(k7.m mVar, k7.m elements) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return k7.s.flatten(k7.s.sequenceOf(mVar, elements));
    }

    public static final <T> T first(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            T t8 = (T) it.next();
            if (((Boolean) predicate.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> k7.m minus(k7.m mVar, k7.m elements) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new p(elements, mVar);
    }

    public static final <T> T singleOrNull(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean z8 = false;
        T t8 = null;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (z8) {
                    return null;
                }
                z8 = true;
                t8 = (T) obj;
            }
        }
        if (z8) {
            return t8;
        }
        return null;
    }

    public static final <T> T lastOrNull(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                t8 = (T) obj;
            }
        }
        return t8;
    }

    public static final <T> T last(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        boolean z8 = false;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                z8 = true;
                t8 = (T) obj;
            }
        }
        if (z8) {
            return t8;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T single(k7.m mVar, f7.l predicate) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t8 = null;
        boolean z8 = false;
        for (Object obj : mVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                if (z8) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z8 = true;
                t8 = (T) obj;
            }
        }
        if (z8) {
            return t8;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(k7.m mVar, M destination, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object obj : mVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object arrayList = destination.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(obj));
        }
        return destination;
    }

    /* renamed from: maxOrNull */
    public static final Float m415maxOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: maxOrThrow */
    public static final float m416maxOrThrow(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrNull */
    public static final Float m419minOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: minOrThrow */
    public static final float m420minOrThrow(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, List<V>> groupBy(k7.m mVar, f7.l keySelector, f7.l valueTransform) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object arrayList = linkedHashMap.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(objInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(obj));
        }
        return linkedHashMap;
    }

    public static final <T extends Comparable<? super T>> T maxOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            if (t8.compareTo(comparable) < 0) {
                t8 = (T) comparable;
            }
        }
        return t8;
    }

    /* renamed from: maxOrThrow */
    public static final <T extends Comparable<? super T>> T m417maxOrThrow(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            T t8 = (T) it.next();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                if (t8.compareTo(comparable) < 0) {
                    t8 = (T) comparable;
                }
            }
            return t8;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T minOrNull(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t8 = (T) it.next();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            if (t8.compareTo(comparable) > 0) {
                t8 = (T) comparable;
            }
        }
        return t8;
    }

    /* renamed from: minOrThrow */
    public static final <T extends Comparable<? super T>> T m421minOrThrow(k7.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Object> it = mVar.iterator();
        if (it.hasNext()) {
            T t8 = (T) it.next();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                if (t8.compareTo(comparable) > 0) {
                    t8 = (T) comparable;
                }
            }
            return t8;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: k7.u$b */
    static final class C5874b extends Lambda implements f7.l {
        public static final C5874b INSTANCE = new C5874b();

        C5874b() {
            super(1);
        }

        @Override // f7.l
        public final T invoke(T t8) {
            return t8;
        }
    }
}
