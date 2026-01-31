package n7;

import W6.g;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import n7.InterfaceC6008t0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class z0 {
    /* renamed from: Job */
    public static final InterfaceC6019z m530Job(InterfaceC6008t0 interfaceC6008t0) {
        return new C6014w0(interfaceC6008t0);
    }

    /* renamed from: Job$default */
    public static /* synthetic */ InterfaceC6019z m531Job$default(InterfaceC6008t0 interfaceC6008t0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC6008t0 = null;
        }
        return AbstractC6016x0.m528Job(interfaceC6008t0);
    }

    private static final Throwable a(Throwable th, InterfaceC6008t0 interfaceC6008t0) {
        return th == null ? new C6010u0("Job was cancelled", null, interfaceC6008t0) : th;
    }

    public static final void cancel(W6.g gVar, CancellationException cancellationException) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 != null) {
            interfaceC6008t0.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancel$default(W6.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC6016x0.cancel(gVar, cancellationException);
    }

    public static final Object cancelAndJoin(InterfaceC6008t0 interfaceC6008t0, W6.d<? super R6.G> dVar) {
        InterfaceC6008t0.a.cancel$default(interfaceC6008t0, (CancellationException) null, 1, (Object) null);
        Object objJoin = interfaceC6008t0.join(dVar);
        return objJoin == X6.b.getCOROUTINE_SUSPENDED() ? objJoin : R6.G.INSTANCE;
    }

    public static final void cancelChildren(InterfaceC6008t0 interfaceC6008t0, CancellationException cancellationException) {
        Iterator<Object> it = interfaceC6008t0.getChildren().iterator();
        while (it.hasNext()) {
            ((InterfaceC6008t0) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(InterfaceC6008t0 interfaceC6008t0, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC6016x0.cancelChildren(interfaceC6008t0, cancellationException);
    }

    public static final InterfaceC5973b0 disposeOnCompletion(InterfaceC6008t0 interfaceC6008t0, InterfaceC5973b0 interfaceC5973b0) {
        return interfaceC6008t0.invokeOnCompletion(new C5977d0(interfaceC5973b0));
    }

    public static final void ensureActive(InterfaceC6008t0 interfaceC6008t0) {
        if (!interfaceC6008t0.isActive()) {
            throw interfaceC6008t0.getCancellationException();
        }
    }

    public static final InterfaceC6008t0 getJob(W6.g gVar) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 != null) {
            return interfaceC6008t0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final boolean isActive(W6.g gVar) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 != null) {
            return interfaceC6008t0.isActive();
        }
        return true;
    }

    public static final /* synthetic */ InterfaceC6008t0 Job(InterfaceC6008t0 interfaceC6008t0) {
        return AbstractC6016x0.m528Job(interfaceC6008t0);
    }

    public static /* synthetic */ InterfaceC6008t0 Job$default(InterfaceC6008t0 interfaceC6008t0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC6008t0 = null;
        }
        return Job(interfaceC6008t0);
    }

    public static /* synthetic */ void cancel$default(InterfaceC6008t0 interfaceC6008t0, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        AbstractC6016x0.cancel(interfaceC6008t0, str, th);
    }

    public static /* synthetic */ void cancelChildren$default(InterfaceC6008t0 interfaceC6008t0, Throwable th, int i8, Object obj) throws Throwable {
        if ((i8 & 1) != 0) {
            th = null;
        }
        cancelChildren(interfaceC6008t0, th);
    }

    public static final void ensureActive(W6.g gVar) {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 != null) {
            AbstractC6016x0.ensureActive(interfaceC6008t0);
        }
    }

    public static final void cancel(InterfaceC6008t0 interfaceC6008t0, String str, Throwable th) {
        interfaceC6008t0.cancel(AbstractC5991k0.CancellationException(str, th));
    }

    public static /* synthetic */ boolean cancel$default(W6.g gVar, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        return cancel(gVar, th);
    }

    public static /* synthetic */ void cancelChildren$default(W6.g gVar, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC6016x0.cancelChildren(gVar, cancellationException);
    }

    public static final /* synthetic */ boolean cancel(W6.g gVar, Throwable th) throws Throwable {
        g.b bVar = gVar.get(InterfaceC6008t0.Key);
        B0 b02 = bVar instanceof B0 ? (B0) bVar : null;
        if (b02 == null) {
            return false;
        }
        b02.cancelInternal(a(th, b02));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(W6.g gVar, Throwable th, int i8, Object obj) throws Throwable {
        if ((i8 & 1) != 0) {
            th = null;
        }
        cancelChildren(gVar, th);
    }

    public static final /* synthetic */ void cancelChildren(InterfaceC6008t0 interfaceC6008t0, Throwable th) throws Throwable {
        for (InterfaceC6008t0 interfaceC6008t02 : interfaceC6008t0.getChildren()) {
            B0 b02 = interfaceC6008t02 instanceof B0 ? (B0) interfaceC6008t02 : null;
            if (b02 != null) {
                b02.cancelInternal(a(th, interfaceC6008t0));
            }
        }
    }

    public static final void cancelChildren(W6.g gVar, CancellationException cancellationException) {
        k7.m children;
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 == null || (children = interfaceC6008t0.getChildren()) == null) {
            return;
        }
        Iterator<Object> it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC6008t0) it.next()).cancel(cancellationException);
        }
    }

    public static final /* synthetic */ void cancelChildren(W6.g gVar, Throwable th) throws Throwable {
        InterfaceC6008t0 interfaceC6008t0 = (InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key);
        if (interfaceC6008t0 == null) {
            return;
        }
        for (InterfaceC6008t0 interfaceC6008t02 : interfaceC6008t0.getChildren()) {
            B0 b02 = interfaceC6008t02 instanceof B0 ? (B0) interfaceC6008t02 : null;
            if (b02 != null) {
                b02.cancelInternal(a(th, interfaceC6008t0));
            }
        }
    }
}
