package F7;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private IOException f1324a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f1325b;

    i(IOException iOException) {
        super(iOException);
        this.f1324a = iOException;
        this.f1325b = iOException;
    }

    void a(IOException iOException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        D7.e.addSuppressedIfPossible(this.f1324a, iOException);
        this.f1325b = iOException;
    }

    public IOException getFirstConnectException() {
        return this.f1324a;
    }

    public IOException getLastConnectException() {
        return this.f1325b;
    }
}
