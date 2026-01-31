package s7;

/* renamed from: s7.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6257s {
    public static final void checkParallelism(int i8) {
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i8).toString());
    }
}
