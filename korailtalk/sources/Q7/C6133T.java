package q7;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p7.EnumC6064b;
import r7.AbstractC6185b;
import r7.AbstractC6187d;

/* renamed from: q7.T, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6133T extends AbstractC6185b implements InterfaceC6118D, InterfaceC6141c, r7.r {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f35215f = AtomicReferenceFieldUpdater.newUpdater(C6133T.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    private int f35216e;

    /* renamed from: q7.T$a */
    static final class a extends Y6.d {

        /* renamed from: d, reason: collision with root package name */
        Object f35217d;

        /* renamed from: e, reason: collision with root package name */
        Object f35218e;

        /* renamed from: f, reason: collision with root package name */
        Object f35219f;

        /* renamed from: g, reason: collision with root package name */
        Object f35220g;

        /* renamed from: h, reason: collision with root package name */
        Object f35221h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f35222i;

        /* renamed from: k, reason: collision with root package name */
        int f35224k;

        a(W6.d dVar) {
            super(dVar);
        }

        @Override // Y6.a
        public final Object invokeSuspend(Object obj) {
            this.f35222i = obj;
            this.f35224k |= Integer.MIN_VALUE;
            return C6133T.this.collect(null, this);
        }
    }

    public C6133T(Object obj) {
        this._state = obj;
    }

    private final boolean g(Object obj, Object obj2) {
        int i8;
        AbstractC6187d[] abstractC6187dArrD;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35215f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f35216e;
            if ((i9 & 1) != 0) {
                this.f35216e = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f35216e = i10;
            AbstractC6187d[] abstractC6187dArrD2 = d();
            R6.G g8 = R6.G.INSTANCE;
            while (true) {
                C6135V[] c6135vArr = (C6135V[]) abstractC6187dArrD2;
                if (c6135vArr != null) {
                    for (C6135V c6135v : c6135vArr) {
                        if (c6135v != null) {
                            c6135v.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i8 = this.f35216e;
                    if (i8 == i10) {
                        this.f35216e = i10 + 1;
                        return true;
                    }
                    abstractC6187dArrD = d();
                    R6.G g9 = R6.G.INSTANCE;
                }
                abstractC6187dArrD2 = abstractC6187dArrD;
                i10 = i8;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:40:0x00b8, B:42:0x00be], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:42:0x00be, B:40:0x00b8], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [r7.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [r7.b] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00dd -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ef -> B:36:0x00ab). Please report as a decompilation issue!!! */
    @Override // q7.InterfaceC6118D, q7.InterfaceC6132S, q7.InterfaceC6122H, q7.InterfaceC6147i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(q7.InterfaceC6148j r11, W6.d<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6133T.collect(q7.j, W6.d):java.lang.Object");
    }

    @Override // q7.InterfaceC6118D
    public boolean compareAndSet(Object obj, Object obj2) {
        if (obj == null) {
            obj = r7.u.NULL;
        }
        if (obj2 == null) {
            obj2 = r7.u.NULL;
        }
        return g(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r7.AbstractC6185b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C6135V createSlot() {
        return new C6135V();
    }

    @Override // q7.InterfaceC6118D, q7.InterfaceC6117C, q7.InterfaceC6148j
    public Object emit(Object obj, W6.d<? super R6.G> dVar) {
        setValue(obj);
        return R6.G.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r7.AbstractC6185b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6135V[] createSlotArray(int i8) {
        return new C6135V[i8];
    }

    @Override // r7.r
    public InterfaceC6147i fuse(W6.g gVar, int i8, EnumC6064b enumC6064b) {
        return AbstractC6134U.fuseStateFlow(this, gVar, i8, enumC6064b);
    }

    @Override // q7.InterfaceC6118D, q7.InterfaceC6132S, q7.InterfaceC6122H
    public List<Object> getReplayCache() {
        return S6.r.listOf(getValue());
    }

    @Override // q7.InterfaceC6118D, q7.InterfaceC6132S
    public Object getValue() {
        s7.K k8 = r7.u.NULL;
        Object obj = f35215f.get(this);
        if (obj == k8) {
            return null;
        }
        return obj;
    }

    @Override // q7.InterfaceC6118D, q7.InterfaceC6117C
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // q7.InterfaceC6118D
    public void setValue(Object obj) {
        if (obj == null) {
            obj = r7.u.NULL;
        }
        g(null, obj);
    }

    @Override // q7.InterfaceC6118D, q7.InterfaceC6117C
    public boolean tryEmit(Object obj) {
        setValue(obj);
        return true;
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
