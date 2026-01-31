package d1;

import android.graphics.PointF;
import e1.AbstractC5342c;

/* renamed from: d1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5303B implements N {
    public static final C5303B INSTANCE = new C5303B();

    private C5303B() {
    }

    @Override // d1.N
    public PointF parse(AbstractC5342c abstractC5342c, float f8) {
        AbstractC5342c.b bVarPeek = abstractC5342c.peek();
        if (bVarPeek == AbstractC5342c.b.BEGIN_ARRAY) {
            return s.e(abstractC5342c, f8);
        }
        if (bVarPeek == AbstractC5342c.b.BEGIN_OBJECT) {
            return s.e(abstractC5342c, f8);
        }
        if (bVarPeek == AbstractC5342c.b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC5342c.nextDouble()) * f8, ((float) abstractC5342c.nextDouble()) * f8);
            while (abstractC5342c.hasNext()) {
                abstractC5342c.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarPeek);
    }
}
