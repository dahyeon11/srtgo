package io.grpc.internal;

import io.grpc.AbstractC5727h;
import io.grpc.O;
import java.text.MessageFormat;
import java.util.logging.Level;

/* renamed from: io.grpc.internal.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5767p extends AbstractC5727h {

    /* renamed from: a, reason: collision with root package name */
    private final C5769q f33063a;

    /* renamed from: b, reason: collision with root package name */
    private final S0 f33064b;

    /* renamed from: io.grpc.internal.p$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33065a;

        static {
            int[] iArr = new int[AbstractC5727h.a.values().length];
            f33065a = iArr;
            try {
                iArr[AbstractC5727h.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33065a[AbstractC5727h.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33065a[AbstractC5727h.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C5767p(C5769q c5769q, S0 s02) {
        this.f33063a = (C5769q) e3.w.checkNotNull(c5769q, "tracer");
        this.f33064b = (S0) e3.w.checkNotNull(s02, "time");
    }

    private boolean a(AbstractC5727h.a aVar) {
        return aVar != AbstractC5727h.a.DEBUG && this.f33063a.c();
    }

    static void b(io.grpc.U u8, AbstractC5727h.a aVar, String str) {
        Level levelD = d(aVar);
        if (C5769q.f33083f.isLoggable(levelD)) {
            C5769q.d(u8, levelD, str);
        }
    }

    static void c(io.grpc.U u8, AbstractC5727h.a aVar, String str, Object... objArr) {
        Level levelD = d(aVar);
        if (C5769q.f33083f.isLoggable(levelD)) {
            C5769q.d(u8, levelD, MessageFormat.format(str, objArr));
        }
    }

    private static Level d(AbstractC5727h.a aVar) {
        int i8 = a.f33065a[aVar.ordinal()];
        return (i8 == 1 || i8 == 2) ? Level.FINE : i8 != 3 ? Level.FINEST : Level.FINER;
    }

    private static O.c.b.EnumC0316b e(AbstractC5727h.a aVar) {
        int i8 = a.f33065a[aVar.ordinal()];
        return i8 != 1 ? i8 != 2 ? O.c.b.EnumC0316b.CT_INFO : O.c.b.EnumC0316b.CT_WARNING : O.c.b.EnumC0316b.CT_ERROR;
    }

    private void f(AbstractC5727h.a aVar, String str) {
        if (aVar == AbstractC5727h.a.DEBUG) {
            return;
        }
        this.f33063a.f(new O.c.b.a().setDescription(str).setSeverity(e(aVar)).setTimestampNanos(this.f33064b.currentTimeNanos()).build());
    }

    @Override // io.grpc.AbstractC5727h
    public void log(AbstractC5727h.a aVar, String str) {
        b(this.f33063a.b(), aVar, str);
        if (a(aVar)) {
            f(aVar, str);
        }
    }

    @Override // io.grpc.AbstractC5727h
    public void log(AbstractC5727h.a aVar, String str, Object... objArr) {
        log(aVar, (a(aVar) || C5769q.f33083f.isLoggable(d(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
