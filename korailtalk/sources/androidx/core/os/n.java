package androidx.core.os;

/* loaded from: classes.dex */
public class n extends RuntimeException {
    public n() {
        this(null);
    }

    public n(String str) {
        super(Z.c.toString(str, "The operation has been canceled."));
    }
}
