package io.grpc.internal;

import com.kakao.sdk.template.Constants;
import io.grpc.AbstractC5727h;
import io.grpc.O;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5769q {

    /* renamed from: f, reason: collision with root package name */
    static final Logger f33083f = Logger.getLogger(AbstractC5727h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Object f33084a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final io.grpc.U f33085b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f33086c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33087d;

    /* renamed from: e, reason: collision with root package name */
    private int f33088e;

    /* renamed from: io.grpc.internal.q$a */
    class a extends ArrayDeque {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33089a;

        a(int i8) {
            this.f33089a = i8;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        public boolean add(O.c.b bVar) {
            if (size() == this.f33089a) {
                removeFirst();
            }
            C5769q.a(C5769q.this);
            return super.add((a) bVar);
        }
    }

    /* renamed from: io.grpc.internal.q$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33091a;

        static {
            int[] iArr = new int[O.c.b.EnumC0316b.values().length];
            f33091a = iArr;
            try {
                iArr[O.c.b.EnumC0316b.CT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33091a[O.c.b.EnumC0316b.CT_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    C5769q(io.grpc.U u8, int i8, long j8, String str) {
        e3.w.checkNotNull(str, Constants.DESCRIPTION);
        this.f33085b = (io.grpc.U) e3.w.checkNotNull(u8, "logId");
        if (i8 > 0) {
            this.f33086c = new a(i8);
        } else {
            this.f33086c = null;
        }
        this.f33087d = j8;
        e(new O.c.b.a().setDescription(str + " created").setSeverity(O.c.b.EnumC0316b.CT_INFO).setTimestampNanos(j8).build());
    }

    static /* synthetic */ int a(C5769q c5769q) {
        int i8 = c5769q.f33088e;
        c5769q.f33088e = i8 + 1;
        return i8;
    }

    static void d(io.grpc.U u8, Level level, String str) {
        Logger logger = f33083f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + u8 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    io.grpc.U b() {
        return this.f33085b;
    }

    boolean c() {
        boolean z8;
        synchronized (this.f33084a) {
            z8 = this.f33086c != null;
        }
        return z8;
    }

    void e(O.c.b bVar) {
        int i8 = b.f33091a[bVar.severity.ordinal()];
        Level level = i8 != 1 ? i8 != 2 ? Level.FINEST : Level.FINER : Level.FINE;
        f(bVar);
        d(this.f33085b, level, bVar.description);
    }

    void f(O.c.b bVar) {
        synchronized (this.f33084a) {
            try {
                Collection collection = this.f33086c;
                if (collection != null) {
                    collection.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void g(O.b.a aVar) {
        synchronized (this.f33084a) {
            try {
                if (this.f33086c == null) {
                    return;
                }
                aVar.setChannelTrace(new O.c.a().setNumEventsLogged(this.f33088e).setCreationTimeNanos(this.f33087d).setEvents(new ArrayList(this.f33086c)).build());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
