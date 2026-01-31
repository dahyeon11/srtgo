package k7;

import R6.G;
import S6.AbstractC0765i;
import f7.InterfaceC5519a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public class s extends r {

    public static final class a implements m {

        /* renamed from: a */
        final /* synthetic */ Iterator f33708a;

        public a(Iterator it) {
            this.f33708a = it;
        }

        @Override // k7.m
        public Iterator<T> iterator() {
            return this.f33708a;
        }
    }

    static final class b extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33709c;

        /* renamed from: d */
        int f33710d;

        /* renamed from: e */
        int f33711e;

        /* renamed from: f */
        private /* synthetic */ Object f33712f;

        /* renamed from: g */
        final /* synthetic */ m f33713g;

        /* renamed from: h */
        final /* synthetic */ f7.p f33714h;

        /* renamed from: i */
        final /* synthetic */ f7.l f33715i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m mVar, f7.p pVar, f7.l lVar, W6.d dVar) {
            super(2, dVar);
            this.f33713g = mVar;
            this.f33714h = pVar;
            this.f33715i = lVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            b bVar = new b(this.f33713g, this.f33714h, this.f33715i, dVar);
            bVar.f33712f = obj;
            return bVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o oVar;
            int i8;
            Iterator<Object> it;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i9 = this.f33711e;
            if (i9 == 0) {
                R6.r.throwOnFailure(obj);
                oVar = (o) this.f33712f;
                i8 = 0;
                it = this.f33713g.iterator();
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = this.f33710d;
                it = (Iterator) this.f33709c;
                oVar = (o) this.f33712f;
                R6.r.throwOnFailure(obj);
                i8 = i10;
            }
            while (it.hasNext()) {
                Object next = it.next();
                f7.p pVar = this.f33714h;
                int i11 = i8 + 1;
                if (i8 < 0) {
                    S6.r.throwIndexOverflow();
                }
                Iterator<Object> it2 = (Iterator) this.f33715i.invoke(pVar.invoke(Y6.b.boxInt(i8), next));
                this.f33712f = oVar;
                this.f33709c = it;
                this.f33710d = i11;
                this.f33711e = 1;
                if (oVar.yieldAll(it2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i8 = i11;
            }
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(o oVar, W6.d<? super G> dVar) {
            return ((b) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    static final class c extends Lambda implements f7.l {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        @Override // f7.l
        public final Iterator<T> invoke(m it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    static final class d extends Lambda implements f7.l {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f7.l
        public final Iterator<T> invoke(Iterable<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    static final class f extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5519a f33716a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC5519a interfaceC5519a) {
            super(1);
            this.f33716a = interfaceC5519a;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
        @Override // f7.l
        public final T invoke(T it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f33716a.invoke();
        }
    }

    static final class g extends Lambda implements InterfaceC5519a {

        /* renamed from: a */
        final /* synthetic */ Object f33717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object obj) {
            super(0);
            this.f33717a = obj;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        @Override // f7.InterfaceC5519a
        public final T invoke() {
            return this.f33717a;
        }
    }

    static final class h extends Y6.k implements f7.p {

        /* renamed from: c */
        int f33718c;

        /* renamed from: d */
        private /* synthetic */ Object f33719d;

        /* renamed from: e */
        final /* synthetic */ m f33720e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC5519a f33721f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m mVar, InterfaceC5519a interfaceC5519a, W6.d dVar) {
            super(2, dVar);
            this.f33720e = mVar;
            this.f33721f = interfaceC5519a;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            h hVar = new h(this.f33720e, this.f33721f, dVar);
            hVar.f33719d = obj;
            return hVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f33718c;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                o oVar = (o) this.f33719d;
                Iterator<Object> it = this.f33720e.iterator();
                if (it.hasNext()) {
                    this.f33718c = 1;
                    if (oVar.yieldAll(it, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    m mVar = (m) this.f33721f.invoke();
                    this.f33718c = 2;
                    if (oVar.yieldAll(mVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R6.r.throwOnFailure(obj);
            }
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(o oVar, W6.d<? super G> dVar) {
            return ((h) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    static final class i extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f33722c;

        /* renamed from: d */
        int f33723d;

        /* renamed from: e */
        private /* synthetic */ Object f33724e;

        /* renamed from: f */
        final /* synthetic */ m f33725f;

        /* renamed from: g */
        final /* synthetic */ h7.f f33726g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m mVar, h7.f fVar, W6.d dVar) {
            super(2, dVar);
            this.f33725f = mVar;
            this.f33726g = fVar;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            i iVar = new i(this.f33725f, this.f33726g, dVar);
            iVar.f33724e = obj;
            return iVar;
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            List mutableList;
            o oVar;
            Object coroutine_suspended = X6.b.getCOROUTINE_SUSPENDED();
            int i8 = this.f33723d;
            if (i8 == 0) {
                R6.r.throwOnFailure(obj);
                o oVar2 = (o) this.f33724e;
                mutableList = u.toMutableList(this.f33725f);
                oVar = oVar2;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableList = (List) this.f33722c;
                oVar = (o) this.f33724e;
                R6.r.throwOnFailure(obj);
            }
            while (!mutableList.isEmpty()) {
                int iNextInt = this.f33726g.nextInt(mutableList.size());
                Object objRemoveLast = S6.r.removeLast(mutableList);
                if (iNextInt < mutableList.size()) {
                    objRemoveLast = mutableList.set(iNextInt, objRemoveLast);
                }
                this.f33724e = oVar;
                this.f33722c = mutableList;
                this.f33723d = 1;
                if (oVar.yield(objRemoveLast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G.INSTANCE;
        }

        @Override // f7.p
        public final Object invoke(o oVar, W6.d<? super G> dVar) {
            return ((i) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    private static final m a(m mVar, f7.l lVar) {
        return mVar instanceof z ? ((z) mVar).flatten$kotlin_stdlib(lVar) : new C5871i(mVar, e.INSTANCE, lVar);
    }

    public static <T> m asSequence(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return p.constrainOnce(new a(it));
    }

    public static <T> m constrainOnce(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar instanceof C5863a ? mVar : new C5863a(mVar);
    }

    public static <T> m emptySequence() {
        return C5869g.INSTANCE;
    }

    public static final <T, C, R> m flatMapIndexed(m source, f7.p transform, f7.l iterator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return p.sequence(new b(source, transform, iterator, null));
    }

    public static final <T> m flatten(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return a(mVar, c.INSTANCE);
    }

    public static final <T> m flattenSequenceOfIterable(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return a(mVar, d.INSTANCE);
    }

    public static <T> m generateSequence(InterfaceC5519a nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return p.constrainOnce(new C5872j(nextFunction, new f(nextFunction)));
    }

    public static final <T> m ifEmpty(m mVar, InterfaceC5519a defaultValue) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return p.sequence(new h(mVar, defaultValue, null));
    }

    public static final <T> m sequenceOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? p.emptySequence() : AbstractC0765i.asSequence(elements);
    }

    public static final <T> m shuffled(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return shuffled(mVar, h7.f.Default);
    }

    public static final <T, R> R6.p unzip(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            R6.p pVar = (R6.p) it.next();
            arrayList.add(pVar.getFirst());
            arrayList2.add(pVar.getSecond());
        }
        return R6.v.to(arrayList, arrayList2);
    }

    public static <T> m generateSequence(T t8, f7.l nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t8 == null ? C5869g.INSTANCE : new C5872j(new g(t8), nextFunction);
    }

    public static final <T> m shuffled(m mVar, h7.f random) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return p.sequence(new i(mVar, random, null));
    }

    public static <T> m generateSequence(InterfaceC5519a seedFunction, f7.l nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new C5872j(seedFunction, nextFunction);
    }

    static final class e extends Lambda implements f7.l {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Override // f7.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
