package p7;

import R6.AbstractC0747a;
import R6.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import n7.W0;
import p7.C6071i;
import s7.AbstractC6236C;
import s7.U;

/* renamed from: p7.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6093r extends C6065c {

    /* renamed from: l, reason: collision with root package name */
    private final int f34902l;

    /* renamed from: m, reason: collision with root package name */
    private final EnumC6064b f34903m;

    public /* synthetic */ C6093r(int i8, EnumC6064b enumC6064b, f7.l lVar, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i8, enumC6064b, (i9 & 4) != 0 ? null : lVar);
    }

    static /* synthetic */ Object s0(C6093r c6093r, Object obj, W6.d dVar) throws Throwable {
        U uCallUndeliveredElementCatchingException$default;
        Object objW0 = c6093r.w0(obj, true);
        if (!(objW0 instanceof C6071i.a)) {
            return G.INSTANCE;
        }
        C6071i.m544exceptionOrNullimpl(objW0);
        f7.l lVar = c6093r.onUndeliveredElement;
        if (lVar == null || (uCallUndeliveredElementCatchingException$default = AbstractC6236C.callUndeliveredElementCatchingException$default(lVar, obj, null, 2, null)) == null) {
            throw c6093r.q();
        }
        AbstractC0747a.addSuppressed(uCallUndeliveredElementCatchingException$default, c6093r.q());
        throw uCallUndeliveredElementCatchingException$default;
    }

    static /* synthetic */ Object t0(C6093r c6093r, Object obj, W6.d dVar) {
        Object objW0 = c6093r.w0(obj, true);
        if (objW0 instanceof C6071i.c) {
            return Y6.b.boxBoolean(false);
        }
        return Y6.b.boxBoolean(true);
    }

    private final Object u0(Object obj, boolean z8) {
        f7.l lVar;
        U uCallUndeliveredElementCatchingException$default;
        Object objMo535trySendJP2dKIU = super.mo535trySendJP2dKIU(obj);
        if (C6071i.m550isSuccessimpl(objMo535trySendJP2dKIU) || C6071i.m548isClosedimpl(objMo535trySendJP2dKIU)) {
            return objMo535trySendJP2dKIU;
        }
        if (!z8 || (lVar = this.onUndeliveredElement) == null || (uCallUndeliveredElementCatchingException$default = AbstractC6236C.callUndeliveredElementCatchingException$default(lVar, obj, null, 2, null)) == null) {
            return C6071i.Companion.m555successJP2dKIU(G.INSTANCE);
        }
        throw uCallUndeliveredElementCatchingException$default;
    }

    private final Object v0(Object obj) {
        C6073k c6073k;
        Object obj2 = AbstractC6066d.BUFFERED;
        C6073k c6073k2 = (C6073k) C6065c.f34636g.get(this);
        while (true) {
            long andIncrement = C6065c.f34632c.getAndIncrement(this);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zX = x(andIncrement);
            int i8 = AbstractC6066d.SEGMENT_SIZE;
            long j9 = j8 / i8;
            int i9 = (int) (j8 % i8);
            if (c6073k2.id != j9) {
                C6073k c6073kM = m(j9, c6073k2);
                if (c6073kM != null) {
                    c6073k = c6073kM;
                } else if (zX) {
                    return C6071i.Companion.m553closedJP2dKIU(q());
                }
            } else {
                c6073k = c6073k2;
            }
            int iO0 = o0(c6073k, i9, obj, j8, obj2, zX);
            if (iO0 == 0) {
                c6073k.cleanPrev();
                return C6071i.Companion.m555successJP2dKIU(G.INSTANCE);
            }
            if (iO0 == 1) {
                return C6071i.Companion.m555successJP2dKIU(G.INSTANCE);
            }
            if (iO0 == 2) {
                if (zX) {
                    c6073k.onSlotCleaned();
                    return C6071i.Companion.m553closedJP2dKIU(q());
                }
                W0 w02 = obj2 instanceof W0 ? (W0) obj2 : null;
                if (w02 != null) {
                    P(w02, c6073k, i9);
                }
                i((c6073k.id * i8) + i9);
                return C6071i.Companion.m555successJP2dKIU(G.INSTANCE);
            }
            if (iO0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iO0 == 4) {
                if (j8 < getReceiversCounter$kotlinx_coroutines_core()) {
                    c6073k.cleanPrev();
                }
                return C6071i.Companion.m553closedJP2dKIU(q());
            }
            if (iO0 == 5) {
                c6073k.cleanPrev();
            }
            c6073k2 = c6073k;
        }
    }

    private final Object w0(Object obj, boolean z8) {
        return this.f34903m == EnumC6064b.DROP_LATEST ? u0(obj, z8) : v0(obj);
    }

    @Override // p7.C6065c
    protected void Z(v7.l lVar, Object obj) {
        Object objMo535trySendJP2dKIU = mo535trySendJP2dKIU(obj);
        if (!(objMo535trySendJP2dKIU instanceof C6071i.c)) {
            lVar.selectInRegistrationPhase(G.INSTANCE);
        } else {
            if (!(objMo535trySendJP2dKIU instanceof C6071i.a)) {
                throw new IllegalStateException("unreachable");
            }
            C6071i.m544exceptionOrNullimpl(objMo535trySendJP2dKIU);
            lVar.selectInRegistrationPhase(AbstractC6066d.getCHANNEL_CLOSED());
        }
    }

    @Override // p7.C6065c, p7.InterfaceC6067e, p7.InterfaceC6099x
    public Object send(Object obj, W6.d<? super G> dVar) {
        return s0(this, obj, dVar);
    }

    @Override // p7.C6065c
    public Object sendBroadcast$kotlinx_coroutines_core(Object obj, W6.d<? super Boolean> dVar) {
        return t0(this, obj, dVar);
    }

    @Override // p7.C6065c
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // p7.C6065c, p7.InterfaceC6067e, p7.InterfaceC6099x
    /* renamed from: trySend-JP2dKIU */
    public Object mo535trySendJP2dKIU(Object obj) {
        return w0(obj, false);
    }

    @Override // p7.C6065c
    protected boolean y() {
        return this.f34903m == EnumC6064b.DROP_OLDEST;
    }

    public C6093r(int i8, EnumC6064b enumC6064b, f7.l lVar) {
        super(i8, lVar);
        this.f34902l = i8;
        this.f34903m = enumC6064b;
        if (enumC6064b == EnumC6064b.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(C6065c.class).getSimpleName() + " instead").toString());
        }
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
    }
}
