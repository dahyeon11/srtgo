package d1;

import e1.AbstractC5342c;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29980a = AbstractC5342c.a.of("nm", "r", "hd");

    static a1.m a(AbstractC5342c abstractC5342c, T0.h hVar) {
        boolean zNextBoolean = false;
        String strNextString = null;
        Z0.b bVar = null;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29980a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar, true);
            } else if (iSelectName != 2) {
                abstractC5342c.skipValue();
            } else {
                zNextBoolean = abstractC5342c.nextBoolean();
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new a1.m(strNextString, bVar);
    }
}
