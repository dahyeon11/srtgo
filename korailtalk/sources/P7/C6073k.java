package p7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import s7.H;

/* renamed from: p7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6073k extends H {

    /* renamed from: d, reason: collision with root package name */
    private final C6065c f34687d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f34688e;

    public C6073k(long j8, C6073k c6073k, C6065c c6065c, int i8) {
        super(j8, c6073k, i8);
        this.f34687d = c6065c;
        this.f34688e = new AtomicReferenceArray(AbstractC6066d.SEGMENT_SIZE * 2);
    }

    private final void d(int i8, Object obj) {
        this.f34688e.lazySet(i8 * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i8, Object obj, Object obj2) {
        return AbstractC6072j.a(this.f34688e, (i8 * 2) + 1, obj, obj2);
    }

    public final void cleanElement$kotlinx_coroutines_core(int i8) {
        d(i8, null);
    }

    public final Object getAndSetState$kotlinx_coroutines_core(int i8, Object obj) {
        return this.f34688e.getAndSet((i8 * 2) + 1, obj);
    }

    public final C6065c getChannel() {
        C6065c c6065c = this.f34687d;
        Intrinsics.checkNotNull(c6065c);
        return c6065c;
    }

    public final Object getElement$kotlinx_coroutines_core(int i8) {
        return this.f34688e.get(i8 * 2);
    }

    @Override // s7.H
    public int getNumberOfSlots() {
        return AbstractC6066d.SEGMENT_SIZE;
    }

    public final Object getState$kotlinx_coroutines_core(int i8) {
        return this.f34688e.get((i8 * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        cleanElement$kotlinx_coroutines_core(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = getChannel().onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        s7.AbstractC6236C.callUndeliveredElement(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // s7.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancellation(int r4, java.lang.Throwable r5, W6.g r6) {
        /*
            r3 = this;
            int r5 = p7.AbstractC6066d.SEGMENT_SIZE
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.getElement$kotlinx_coroutines_core(r4)
        Le:
            java.lang.Object r1 = r3.getState$kotlinx_coroutines_core(r4)
            boolean r2 = r1 instanceof n7.W0
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof p7.C6100y
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            s7.K r2 = p7.AbstractC6066d.access$getINTERRUPTED_SEND$p()
            if (r1 == r2) goto L63
            s7.K r2 = p7.AbstractC6066d.access$getINTERRUPTED_RCV$p()
            if (r1 != r2) goto L28
            goto L63
        L28:
            s7.K r2 = p7.AbstractC6066d.access$getRESUMING_BY_EB$p()
            if (r1 == r2) goto Le
            s7.K r2 = p7.AbstractC6066d.access$getRESUMING_BY_RCV$p()
            if (r1 != r2) goto L35
            goto Le
        L35:
            s7.K r4 = p7.AbstractC6066d.access$getDONE_RCV$p()
            if (r1 == r4) goto L62
            s7.K r4 = p7.AbstractC6066d.BUFFERED
            if (r1 != r4) goto L40
            goto L62
        L40:
            s7.K r4 = p7.AbstractC6066d.getCHANNEL_CLOSED()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.cleanElement$kotlinx_coroutines_core(r4)
            if (r0 == 0) goto L73
            p7.c r4 = r3.getChannel()
            f7.l r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L73
            s7.AbstractC6236C.callUndeliveredElement(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            s7.K r2 = p7.AbstractC6066d.access$getINTERRUPTED_SEND$p()
            goto L7f
        L7b:
            s7.K r2 = p7.AbstractC6066d.access$getINTERRUPTED_RCV$p()
        L7f:
            boolean r1 = r3.casState$kotlinx_coroutines_core(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.cleanElement$kotlinx_coroutines_core(r4)
            r1 = r0 ^ 1
            r3.onCancelledRequest(r4, r1)
            if (r0 == 0) goto L9a
            p7.c r4 = r3.getChannel()
            f7.l r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L9a
            s7.AbstractC6236C.callUndeliveredElement(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C6073k.onCancellation(int, java.lang.Throwable, W6.g):void");
    }

    public final void onCancelledRequest(int i8, boolean z8) {
        if (z8) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.id * AbstractC6066d.SEGMENT_SIZE) + i8);
        }
        onSlotCleaned();
    }

    public final Object retrieveElement$kotlinx_coroutines_core(int i8) {
        Object element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i8);
        cleanElement$kotlinx_coroutines_core(i8);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i8, Object obj) {
        this.f34688e.set((i8 * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i8, Object obj) {
        d(i8, obj);
    }
}
