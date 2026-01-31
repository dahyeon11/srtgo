package w0;

import z0.InterfaceC6610b;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6457a {
    public final int endVersion;
    public final int startVersion;

    public AbstractC6457a(int i8, int i9) {
        this.startVersion = i8;
        this.endVersion = i9;
    }

    public abstract void migrate(InterfaceC6610b interfaceC6610b);
}
