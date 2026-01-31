package I7;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class n extends IOException {
    public final b errorCode;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.errorCode = bVar;
    }
}
