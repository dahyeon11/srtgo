package d1;

import e1.AbstractC5342c;
import g1.C5537d;

/* loaded from: classes.dex */
public class G implements N {
    public static final G INSTANCE = new G();

    private G() {
    }

    @Override // d1.N
    public C5537d parse(AbstractC5342c abstractC5342c, float f8) {
        boolean z8 = abstractC5342c.peek() == AbstractC5342c.b.BEGIN_ARRAY;
        if (z8) {
            abstractC5342c.beginArray();
        }
        float fNextDouble = (float) abstractC5342c.nextDouble();
        float fNextDouble2 = (float) abstractC5342c.nextDouble();
        while (abstractC5342c.hasNext()) {
            abstractC5342c.skipValue();
        }
        if (z8) {
            abstractC5342c.endArray();
        }
        return new C5537d((fNextDouble / 100.0f) * f8, (fNextDouble2 / 100.0f) * f8);
    }
}
