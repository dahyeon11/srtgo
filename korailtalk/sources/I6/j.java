package I6;

import e3.w;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Logger f2320a;

    /* renamed from: b, reason: collision with root package name */
    private final Level f2321b;

    enum a {
        INBOUND,
        OUTBOUND
    }

    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* renamed from: a, reason: collision with root package name */
        private final int f2324a;

        b(int i8) {
            this.f2324a = i8;
        }

        public int getBit() {
            return this.f2324a;
        }
    }

    j(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean a() {
        return this.f2320a.isLoggable(this.f2321b);
    }

    private static String l(K6.i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.isSet(bVar.getBit())) {
                enumMap.put((EnumMap) bVar, (b) Integer.valueOf(iVar.get(bVar.getBit())));
            }
        }
        return enumMap.toString();
    }

    private static String m(P7.c cVar) {
        if (cVar.size() <= 64) {
            return cVar.snapshot().hex();
        }
        return cVar.snapshot((int) Math.min(cVar.size(), 64L)).hex() + "...";
    }

    void b(a aVar, int i8, P7.c cVar, int i9, boolean z8) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " DATA: streamId=" + i8 + " endStream=" + z8 + " length=" + i9 + " bytes=" + m(cVar));
        }
    }

    void c(a aVar, int i8, K6.a aVar2, P7.f fVar) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " GO_AWAY: lastStreamId=" + i8 + " errorCode=" + aVar2 + " length=" + fVar.size() + " bytes=" + m(new P7.c().write(fVar)));
        }
    }

    void d(a aVar, int i8, List list, boolean z8) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " HEADERS: streamId=" + i8 + " headers=" + list + " endStream=" + z8);
        }
    }

    void e(a aVar, long j8) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " PING: ack=false bytes=" + j8);
        }
    }

    void f(a aVar, long j8) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " PING: ack=true bytes=" + j8);
        }
    }

    void g(a aVar, int i8, int i9, List list) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " PUSH_PROMISE: streamId=" + i8 + " promisedStreamId=" + i9 + " headers=" + list);
        }
    }

    void h(a aVar, int i8, K6.a aVar2) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " RST_STREAM: streamId=" + i8 + " errorCode=" + aVar2);
        }
    }

    void i(a aVar, K6.i iVar) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    void j(a aVar) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " SETTINGS: ack=true");
        }
    }

    void k(a aVar, int i8, long j8) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " WINDOW_UPDATE: streamId=" + i8 + " windowSizeIncrement=" + j8);
        }
    }

    public void logPriority(a aVar, int i8, int i9, int i10, boolean z8) {
        if (a()) {
            this.f2320a.log(this.f2321b, aVar + " PRIORITY: streamId=" + i8 + " streamDependency=" + i9 + " weight=" + i10 + " exclusive=" + z8);
        }
    }

    j(Level level, Logger logger) {
        this.f2321b = (Level) w.checkNotNull(level, "level");
        this.f2320a = (Logger) w.checkNotNull(logger, "logger");
    }
}
