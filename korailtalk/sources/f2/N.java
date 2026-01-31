package f2;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class N extends P {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f30551f;

    /* synthetic */ N(Callable callable, M m8) {
        super();
        this.f30551f = callable;
    }

    @Override // f2.P
    final String a() {
        try {
            return (String) this.f30551f.call();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }
}
