package q7;

import R6.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n7.AbstractC6002q;
import n7.C5998o;
import n7.InterfaceC5973b0;
import p7.EnumC6064b;
import r7.AbstractC6185b;
import r7.AbstractC6186c;
import r7.AbstractC6187d;

/* renamed from: q7.I */
/* loaded from: classes3.dex */
public class C6123I extends AbstractC6185b implements InterfaceC6117C, InterfaceC6141c, r7.r {

    /* renamed from: e */
    private final int f35180e;

    /* renamed from: f */
    private final int f35181f;

    /* renamed from: g */
    private final EnumC6064b f35182g;

    /* renamed from: h */
    private Object[] f35183h;

    /* renamed from: i */
    private long f35184i;

    /* renamed from: j */
    private long f35185j;

    /* renamed from: k */
    private int f35186k;

    /* renamed from: l */
    private int f35187l;

    /* renamed from: q7.I$a */
    private static final class a implements InterfaceC5973b0 {
        public final W6.d<R6.G> cont;
        public final C6123I flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public a(C6123I c6123i, long j8, Object obj, W6.d<? super R6.G> dVar) {
            this.flow = c6123i;
            this.index = j8;
            this.value = obj;
            this.cont = dVar;
        }

        @Override // n7.InterfaceC5973b0
        public void dispose() {
            this.flow.f(this);
        }
    }

    /* renamed from: q7.I$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6064b.values().length];
            try {
                iArr[EnumC6064b.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6064b.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6064b.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: q7.I$c */
    static final class c extends Y6.d {

        /* renamed from: d */
        Object f35188d;

        /* renamed from: e */
        Object f35189e;

        /* renamed from: f */
        Object f35190f;

        /* renamed from: g */
        Object f35191g;

        /* renamed from: h */
        /* synthetic */ Object f35192h;

        /* renamed from: j */
        int f35194j;

        c(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35192h = obj;
            this.f35194j |= Integer.MIN_VALUE;
            return C6123I.h(C6123I.this, null, this);
        }
    }

    public C6123I(int i8, int i9, EnumC6064b enumC6064b) {
        this.f35180e = i8;
        this.f35181f = i9;
        this.f35182g = enumC6064b;
    }

    public final long A(C6125K c6125k) {
        long j8 = c6125k.index;
        if (j8 < q()) {
            return j8;
        }
        if (this.f35181f <= 0 && j8 <= r() && this.f35187l != 0) {
            return j8;
        }
        return -1L;
    }

    private final Object B(C6125K c6125k) {
        Object obj;
        W6.d<R6.G>[] dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractC6186c.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jA = A(c6125k);
                if (jA < 0) {
                    obj = AbstractC6124J.NO_VALUE;
                } else {
                    long j8 = c6125k.index;
                    Object objT = t(jA);
                    c6125k.index = jA + 1;
                    dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j8);
                    obj = objT;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (W6.d<R6.G> dVar : dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (dVar != null) {
                q.a aVar = R6.q.Companion;
                dVar.resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
            }
        }
        return obj;
    }

    private final void C(long j8, long j9, long j10, long j11) {
        long jMin = Math.min(j9, j8);
        for (long jR = r(); jR < jMin; jR++) {
            Object[] objArr = this.f35183h;
            Intrinsics.checkNotNull(objArr);
            AbstractC6124J.b(objArr, jR, null);
        }
        this.f35184i = j8;
        this.f35185j = j9;
        this.f35186k = (int) (j10 - jMin);
        this.f35187l = (int) (j11 - j10);
    }

    public final Object e(C6125K c6125k, W6.d dVar) {
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        synchronized (this) {
            try {
                if (A(c6125k) < 0) {
                    c6125k.cont = c5998o;
                } else {
                    q.a aVar = R6.q.Companion;
                    c5998o.resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
                }
                R6.G g8 = R6.G.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
    }

    public final void f(a aVar) {
        synchronized (this) {
            if (aVar.index < r()) {
                return;
            }
            Object[] objArr = this.f35183h;
            Intrinsics.checkNotNull(objArr);
            if (AbstractC6124J.a(objArr, aVar.index) != aVar) {
                return;
            }
            AbstractC6124J.b(objArr, aVar.index, AbstractC6124J.NO_VALUE);
            g();
            R6.G g8 = R6.G.INSTANCE;
        }
    }

    private final void g() {
        if (this.f35181f != 0 || this.f35187l > 1) {
            Object[] objArr = this.f35183h;
            Intrinsics.checkNotNull(objArr);
            while (this.f35187l > 0 && AbstractC6124J.a(objArr, (r() + w()) - 1) == AbstractC6124J.NO_VALUE) {
                this.f35187l--;
                AbstractC6124J.b(objArr, r() + w(), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object h(q7.C6123I r8, q7.InterfaceC6148j r9, W6.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6123I.h(q7.I, q7.j, W6.d):java.lang.Object");
    }

    private final void i(long j8) {
        AbstractC6187d[] abstractC6187dArr;
        if (((AbstractC6185b) this).f35801b != 0 && (abstractC6187dArr = ((AbstractC6185b) this).f35800a) != null) {
            for (AbstractC6187d abstractC6187d : abstractC6187dArr) {
                if (abstractC6187d != null) {
                    C6125K c6125k = (C6125K) abstractC6187d;
                    long j9 = c6125k.index;
                    if (j9 >= 0 && j9 < j8) {
                        c6125k.index = j8;
                    }
                }
            }
        }
        this.f35185j = j8;
    }

    private final void l() {
        Object[] objArr = this.f35183h;
        Intrinsics.checkNotNull(objArr);
        AbstractC6124J.b(objArr, r(), null);
        this.f35186k--;
        long jR = r() + 1;
        if (this.f35184i < jR) {
            this.f35184i = jR;
        }
        if (this.f35185j < jR) {
            i(jR);
        }
    }

    static /* synthetic */ Object m(C6123I c6123i, Object obj, W6.d dVar) {
        if (c6123i.tryEmit(obj)) {
            return R6.G.INSTANCE;
        }
        Object objN = c6123i.n(obj, dVar);
        return objN == X6.b.getCOROUTINE_SUSPENDED() ? objN : R6.G.INSTANCE;
    }

    public final Object n(Object obj, W6.d dVar) {
        W6.d<R6.G>[] dVarArrP;
        a aVar;
        C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
        c5998o.initCancellability();
        W6.d<R6.G>[] dVarArrP2 = AbstractC6186c.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (y(obj)) {
                    q.a aVar2 = R6.q.Companion;
                    c5998o.resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
                    dVarArrP = p(dVarArrP2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, w() + r(), obj, c5998o);
                    o(aVar3);
                    this.f35187l++;
                    if (this.f35181f == 0) {
                        dVarArrP2 = p(dVarArrP2);
                    }
                    dVarArrP = dVarArrP2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            AbstractC6002q.disposeOnCancellation(c5998o, aVar);
        }
        for (W6.d<R6.G> dVar2 : dVarArrP) {
            if (dVar2 != null) {
                q.a aVar4 = R6.q.Companion;
                dVar2.resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
            }
        }
        Object result = c5998o.getResult();
        if (result == X6.b.getCOROUTINE_SUSPENDED()) {
            Y6.h.probeCoroutineSuspended(dVar);
        }
        return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
    }

    public final void o(Object obj) {
        int iW = w();
        Object[] objArrX = this.f35183h;
        if (objArrX == null) {
            objArrX = x(null, 0, 2);
        } else if (iW >= objArrX.length) {
            objArrX = x(objArrX, iW, objArrX.length * 2);
        }
        AbstractC6124J.b(objArrX, r() + iW, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final W6.d[] p(W6.d[] dVarArr) {
        AbstractC6187d[] abstractC6187dArr;
        C6125K c6125k;
        W6.d<? super R6.G> dVar;
        int length = dVarArr.length;
        if (((AbstractC6185b) this).f35801b != 0 && (abstractC6187dArr = ((AbstractC6185b) this).f35800a) != null) {
            int length2 = abstractC6187dArr.length;
            int i8 = 0;
            dVarArr = dVarArr;
            while (i8 < length2) {
                AbstractC6187d abstractC6187d = abstractC6187dArr[i8];
                if (abstractC6187d != null && (dVar = (c6125k = (C6125K) abstractC6187d).cont) != null && A(c6125k) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(CopyOf, "copyOf(this, newSize)");
                        dVarArr = CopyOf;
                    }
                    dVarArr[length] = dVar;
                    c6125k.cont = null;
                    length++;
                }
                i8++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long q() {
        return r() + this.f35186k;
    }

    public final long r() {
        return Math.min(this.f35185j, this.f35184i);
    }

    private final Object t(long j8) {
        Object[] objArr = this.f35183h;
        Intrinsics.checkNotNull(objArr);
        Object objA = AbstractC6124J.a(objArr, j8);
        return objA instanceof a ? ((a) objA).value : objA;
    }

    private final long u() {
        return r() + this.f35186k + this.f35187l;
    }

    private final int v() {
        return (int) ((r() + this.f35186k) - this.f35184i);
    }

    public final int w() {
        return this.f35186k + this.f35187l;
    }

    private final Object[] x(Object[] objArr, int i8, int i9) {
        if (i9 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i9];
        this.f35183h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jR = r();
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = i10 + jR;
            AbstractC6124J.b(objArr2, j8, AbstractC6124J.a(objArr, j8));
        }
        return objArr2;
    }

    public final boolean y(Object obj) {
        if (c() == 0) {
            return z(obj);
        }
        if (this.f35186k >= this.f35181f && this.f35185j <= this.f35184i) {
            int i8 = b.$EnumSwitchMapping$0[this.f35182g.ordinal()];
            if (i8 == 1) {
                return false;
            }
            if (i8 == 2) {
                return true;
            }
        }
        o(obj);
        int i9 = this.f35186k + 1;
        this.f35186k = i9;
        if (i9 > this.f35181f) {
            l();
        }
        if (v() > this.f35180e) {
            C(this.f35184i + 1, this.f35185j, q(), u());
        }
        return true;
    }

    private final boolean z(Object obj) {
        if (this.f35180e == 0) {
            return true;
        }
        o(obj);
        int i8 = this.f35186k + 1;
        this.f35186k = i8;
        if (i8 > this.f35180e) {
            l();
        }
        this.f35185j = r() + this.f35186k;
        return true;
    }

    @Override // q7.InterfaceC6117C, q7.InterfaceC6122H, q7.InterfaceC6147i
    public Object collect(InterfaceC6148j interfaceC6148j, W6.d<?> dVar) {
        return h(this, interfaceC6148j, dVar);
    }

    @Override // q7.InterfaceC6117C, q7.InterfaceC6148j
    public Object emit(Object obj, W6.d<? super R6.G> dVar) {
        return m(this, obj, dVar);
    }

    @Override // r7.r
    public InterfaceC6147i fuse(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return AbstractC6124J.fuseSharedFlow(this, gVar, i8, enumC6064b);
    }

    @Override // q7.InterfaceC6117C, q7.InterfaceC6122H
    public List<Object> getReplayCache() {
        synchronized (this) {
            int iV = v();
            if (iV == 0) {
                return S6.r.emptyList();
            }
            ArrayList arrayList = new ArrayList(iV);
            Object[] objArr = this.f35183h;
            Intrinsics.checkNotNull(objArr);
            for (int i8 = 0; i8 < iV; i8++) {
                arrayList.add(AbstractC6124J.a(objArr, this.f35184i + i8));
            }
            return arrayList;
        }
    }

    @Override // r7.AbstractC6185b
    /* renamed from: j */
    public C6125K createSlot() {
        return new C6125K();
    }

    @Override // r7.AbstractC6185b
    /* renamed from: k */
    public C6125K[] createSlotArray(int i8) {
        return new C6125K[i8];
    }

    @Override // q7.InterfaceC6117C
    public void resetReplayCache() {
        synchronized (this) {
            C(q(), this.f35185j, q(), u());
            R6.G g8 = R6.G.INSTANCE;
        }
    }

    protected final Object s() {
        Object[] objArr = this.f35183h;
        Intrinsics.checkNotNull(objArr);
        return AbstractC6124J.a(objArr, (this.f35184i + v()) - 1);
    }

    @Override // q7.InterfaceC6117C
    public boolean tryEmit(Object obj) {
        int i8;
        boolean z8;
        W6.d<R6.G>[] dVarArrP = AbstractC6186c.EMPTY_RESUMES;
        synchronized (this) {
            if (y(obj)) {
                dVarArrP = p(dVarArrP);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (W6.d<R6.G> dVar : dVarArrP) {
            if (dVar != null) {
                q.a aVar = R6.q.Companion;
                dVar.resumeWith(R6.q.m67constructorimpl(R6.G.INSTANCE));
            }
        }
        return z8;
    }

    public final W6.d<R6.G>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j8) {
        long j9;
        long j10;
        long j11;
        AbstractC6187d[] abstractC6187dArr;
        if (j8 > this.f35185j) {
            return AbstractC6186c.EMPTY_RESUMES;
        }
        long jR = r();
        long j12 = this.f35186k + jR;
        if (this.f35181f == 0 && this.f35187l > 0) {
            j12++;
        }
        if (((AbstractC6185b) this).f35801b != 0 && (abstractC6187dArr = ((AbstractC6185b) this).f35800a) != null) {
            for (AbstractC6187d abstractC6187d : abstractC6187dArr) {
                if (abstractC6187d != null) {
                    long j13 = ((C6125K) abstractC6187d).index;
                    if (j13 >= 0 && j13 < j12) {
                        j12 = j13;
                    }
                }
            }
        }
        if (j12 <= this.f35185j) {
            return AbstractC6186c.EMPTY_RESUMES;
        }
        long jQ = q();
        int iMin = c() > 0 ? Math.min(this.f35187l, this.f35181f - ((int) (jQ - j12))) : this.f35187l;
        W6.d<R6.G>[] dVarArr = AbstractC6186c.EMPTY_RESUMES;
        long j14 = this.f35187l + jQ;
        if (iMin > 0) {
            dVarArr = new W6.d[iMin];
            Object[] objArr = this.f35183h;
            Intrinsics.checkNotNull(objArr);
            long j15 = jQ;
            int i8 = 0;
            while (true) {
                if (jQ >= j14) {
                    j9 = j12;
                    j10 = j14;
                    break;
                }
                Object objA = AbstractC6124J.a(objArr, jQ);
                j9 = j12;
                s7.K k8 = AbstractC6124J.NO_VALUE;
                if (objA != k8) {
                    Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objA;
                    int i9 = i8 + 1;
                    j10 = j14;
                    dVarArr[i8] = aVar.cont;
                    AbstractC6124J.b(objArr, jQ, k8);
                    AbstractC6124J.b(objArr, j15, aVar.value);
                    j11 = 1;
                    j15++;
                    if (i9 >= iMin) {
                        break;
                    }
                    i8 = i9;
                } else {
                    j10 = j14;
                    j11 = 1;
                }
                jQ += j11;
                j12 = j9;
                j14 = j10;
            }
            jQ = j15;
        } else {
            j9 = j12;
            j10 = j14;
        }
        int i10 = (int) (jQ - jR);
        long j16 = c() == 0 ? jQ : j9;
        long jMax = Math.max(this.f35184i, jQ - Math.min(this.f35180e, i10));
        if (this.f35181f == 0 && jMax < j10) {
            Object[] objArr2 = this.f35183h;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(AbstractC6124J.a(objArr2, jMax), AbstractC6124J.NO_VALUE)) {
                jQ++;
                jMax++;
            }
        }
        C(jMax, j16, jQ, j10);
        g();
        return !(dVarArr.length == 0) ? p(dVarArr) : dVarArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j8 = this.f35184i;
        if (j8 < this.f35185j) {
            this.f35185j = j8;
        }
        return j8;
    }
}
