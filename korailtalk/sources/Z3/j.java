package Z3;

import p4.C6054a;
import s7.x;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final M3.a f5721a;

    /* renamed from: b, reason: collision with root package name */
    private final s f5722b;

    j(M3.a aVar) {
        this.f5721a = aVar;
        this.f5722b = new s(aVar);
    }

    public static j createDecoder(M3.a aVar) {
        if (aVar.get(1)) {
            return new g(aVar);
        }
        if (!aVar.get(2)) {
            return new k(aVar);
        }
        int iG = s.g(aVar, 1, 4);
        if (iG == 4) {
            return new a(aVar);
        }
        if (iG == 5) {
            return new b(aVar);
        }
        int iG2 = s.g(aVar, 1, 5);
        if (iG2 == 12) {
            return new c(aVar);
        }
        if (iG2 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", "11");
            case 57:
                return new e(aVar, "320", "11");
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case x.FROZEN_SHIFT /* 60 */:
                return new e(aVar, "310", C6054a.AFTER_DEPARTURE);
            case x.CLOSED_SHIFT /* 61 */:
                return new e(aVar, "320", C6054a.AFTER_DEPARTURE);
            case 62:
                return new e(aVar, "310", "17");
            case androidx.core.text.b.FROM_HTML_MODE_COMPACT /* 63 */:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    protected final s a() {
        return this.f5722b;
    }

    protected final M3.a b() {
        return this.f5721a;
    }

    public abstract String parseInformation();
}
