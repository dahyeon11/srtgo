package r7;

import R6.G;
import R6.q;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import q7.InterfaceC6132S;

/* renamed from: r7.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6185b {

    /* renamed from: a */
    private AbstractC6187d[] f35800a;

    /* renamed from: b */
    private int f35801b;

    /* renamed from: c */
    private int f35802c;

    /* renamed from: d */
    private C6182A f35803d;

    protected final AbstractC6187d a() {
        AbstractC6187d abstractC6187dCreateSlot;
        C6182A c6182a;
        synchronized (this) {
            try {
                AbstractC6187d[] abstractC6187dArrCreateSlotArray = this.f35800a;
                if (abstractC6187dArrCreateSlotArray == null) {
                    abstractC6187dArrCreateSlotArray = createSlotArray(2);
                    this.f35800a = abstractC6187dArrCreateSlotArray;
                } else if (this.f35801b >= abstractC6187dArrCreateSlotArray.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC6187dArrCreateSlotArray, abstractC6187dArrCreateSlotArray.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    this.f35800a = (AbstractC6187d[]) objArrCopyOf;
                    abstractC6187dArrCreateSlotArray = (AbstractC6187d[]) objArrCopyOf;
                }
                int i8 = this.f35802c;
                do {
                    abstractC6187dCreateSlot = abstractC6187dArrCreateSlotArray[i8];
                    if (abstractC6187dCreateSlot == null) {
                        abstractC6187dCreateSlot = createSlot();
                        abstractC6187dArrCreateSlotArray[i8] = abstractC6187dCreateSlot;
                    }
                    i8++;
                    if (i8 >= abstractC6187dArrCreateSlotArray.length) {
                        i8 = 0;
                    }
                    Intrinsics.checkNotNull(abstractC6187dCreateSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC6187dCreateSlot.allocateLocked(this));
                this.f35802c = i8;
                this.f35801b++;
                c6182a = this.f35803d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6182a != null) {
            c6182a.increment(1);
        }
        return abstractC6187dCreateSlot;
    }

    protected final void b(AbstractC6187d abstractC6187d) {
        C6182A c6182a;
        int i8;
        W6.d<G>[] dVarArrFreeLocked;
        synchronized (this) {
            try {
                int i9 = this.f35801b - 1;
                this.f35801b = i9;
                c6182a = this.f35803d;
                if (i9 == 0) {
                    this.f35802c = 0;
                }
                Intrinsics.checkNotNull(abstractC6187d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrFreeLocked = abstractC6187d.freeLocked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (W6.d<G> dVar : dVarArrFreeLocked) {
            if (dVar != null) {
                q.a aVar = R6.q.Companion;
                dVar.resumeWith(R6.q.m67constructorimpl(G.INSTANCE));
            }
        }
        if (c6182a != null) {
            c6182a.increment(-1);
        }
    }

    protected final int c() {
        return this.f35801b;
    }

    protected abstract AbstractC6187d createSlot();

    protected abstract AbstractC6187d[] createSlotArray(int i8);

    protected final AbstractC6187d[] d() {
        return this.f35800a;
    }

    public final InterfaceC6132S getSubscriptionCount() {
        C6182A c6182a;
        synchronized (this) {
            c6182a = this.f35803d;
            if (c6182a == null) {
                c6182a = new C6182A(this.f35801b);
                this.f35803d = c6182a;
            }
        }
        return c6182a;
    }
}
