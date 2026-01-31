package s7;

import R6.AbstractC0747a;
import kotlin.jvm.internal.Lambda;

/* renamed from: s7.C */
/* loaded from: classes3.dex */
public abstract class AbstractC6236C {

    /* renamed from: s7.C$a */
    static final class a extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ f7.l f36320a;

        /* renamed from: b */
        final /* synthetic */ Object f36321b;

        /* renamed from: c */
        final /* synthetic */ W6.g f36322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f7.l lVar, Object obj, W6.g gVar) {
            super(1);
            this.f36320a = lVar;
            this.f36321b = obj;
            this.f36322c = gVar;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return R6.G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            AbstractC6236C.callUndeliveredElement(this.f36320a, this.f36321b, this.f36322c);
        }
    }

    public static final <E> f7.l bindCancellationFun(f7.l lVar, E e8, W6.g gVar) {
        return new a(lVar, e8, gVar);
    }

    public static final <E> void callUndeliveredElement(f7.l lVar, E e8, W6.g gVar) {
        U uCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(lVar, e8, null);
        if (uCallUndeliveredElementCatchingException != null) {
            n7.K.handleCoroutineException(gVar, uCallUndeliveredElementCatchingException);
        }
    }

    public static final <E> U callUndeliveredElementCatchingException(f7.l lVar, E e8, U u8) {
        try {
            lVar.invoke(e8);
        } catch (Throwable th) {
            if (u8 == null || u8.getCause() == th) {
                return new U("Exception in undelivered element handler for " + e8, th);
            }
            AbstractC0747a.addSuppressed(u8, th);
        }
        return u8;
    }

    public static /* synthetic */ U callUndeliveredElementCatchingException$default(f7.l lVar, Object obj, U u8, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            u8 = null;
        }
        return callUndeliveredElementCatchingException(lVar, obj, u8);
    }
}
