package d1;

import a1.C0824a;
import e1.AbstractC5342c;

/* renamed from: d1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5310e {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29993a = AbstractC5342c.a.of("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5342c.a f29994b = AbstractC5342c.a.of("ty", "v");

    private static C0824a a(AbstractC5342c abstractC5342c, T0.h hVar) {
        abstractC5342c.beginObject();
        C0824a c0824a = null;
        while (true) {
            boolean z8 = false;
            while (abstractC5342c.hasNext()) {
                int iSelectName = abstractC5342c.selectName(f29994b);
                if (iSelectName != 0) {
                    if (iSelectName != 1) {
                        abstractC5342c.skipName();
                        abstractC5342c.skipValue();
                    } else if (z8) {
                        c0824a = new C0824a(AbstractC5309d.parseFloat(abstractC5342c, hVar));
                    } else {
                        abstractC5342c.skipValue();
                    }
                } else if (abstractC5342c.nextInt() == 0) {
                    z8 = true;
                }
            }
            abstractC5342c.endObject();
            return c0824a;
        }
    }

    static C0824a b(AbstractC5342c abstractC5342c, T0.h hVar) {
        C0824a c0824a = null;
        while (abstractC5342c.hasNext()) {
            if (abstractC5342c.selectName(f29993a) != 0) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                abstractC5342c.beginArray();
                while (abstractC5342c.hasNext()) {
                    C0824a c0824aA = a(abstractC5342c, hVar);
                    if (c0824aA != null) {
                        c0824a = c0824aA;
                    }
                }
                abstractC5342c.endArray();
            }
        }
        return c0824a;
    }
}
