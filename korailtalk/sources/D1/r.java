package d1;

import e1.AbstractC5342c;

/* loaded from: classes.dex */
public class r implements N {
    public static final r INSTANCE = new r();

    private r() {
    }

    @Override // d1.N
    public Integer parse(AbstractC5342c abstractC5342c, float f8) {
        return Integer.valueOf(Math.round(s.g(abstractC5342c) * f8));
    }
}
