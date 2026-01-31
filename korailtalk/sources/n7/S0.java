package n7;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class S0 extends CancellationException implements G {
    public final transient InterfaceC6008t0 coroutine;

    public S0(String str, InterfaceC6008t0 interfaceC6008t0) {
        super(str);
        this.coroutine = interfaceC6008t0;
    }

    @Override // n7.G
    public S0 createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        S0 s02 = new S0(message, this.coroutine);
        s02.initCause(this);
        return s02;
    }

    public S0(String str) {
        this(str, null);
    }
}
