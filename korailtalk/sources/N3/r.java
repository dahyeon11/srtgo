package n3;

import java.util.Map;
import r3.C6173a;

/* loaded from: classes2.dex */
final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Map.Entry f34242a;

    /* renamed from: b, reason: collision with root package name */
    private final C6173a f34243b;

    private r(Map.Entry entry, C6173a c6173a) {
        this.f34242a = entry;
        this.f34243b = c6173a;
    }

    public static Runnable lambdaFactory$(Map.Entry entry, C6173a c6173a) {
        return new r(entry, c6173a);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((r3.b) this.f34242a.getKey()).handle(this.f34243b);
    }
}
