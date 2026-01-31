package n7;

import s7.AbstractC6257s;

/* loaded from: classes3.dex */
public abstract class F0 extends I {
    protected final String b() {
        F0 immediate;
        F0 main = C5971a0.getMain();
        if (this == main) {
            return "Dispatchers.Main";
        }
        try {
            immediate = main.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this == immediate) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract F0 getImmediate();

    @Override // n7.I
    public I limitedParallelism(int i8) {
        AbstractC6257s.checkParallelism(i8);
        return this;
    }

    @Override // n7.I
    public String toString() {
        String strB = b();
        if (strB != null) {
            return strB;
        }
        return P.getClassSimpleName(this) + '@' + P.getHexAddress(this);
    }
}
