package d1;

import e1.AbstractC5342c;

/* renamed from: d1.D */
/* loaded from: classes.dex */
abstract class AbstractC5305D {

    /* renamed from: a */
    private static final AbstractC5342c.a f29978a = AbstractC5342c.a.of("nm", "p", "s", "r", "hd");

    static a1.k a(AbstractC5342c abstractC5342c, T0.h hVar) {
        String strNextString = null;
        Z0.m mVarA = null;
        Z0.f fVarG = null;
        Z0.b bVar = null;
        boolean zNextBoolean = false;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29978a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                mVarA = AbstractC5306a.a(abstractC5342c, hVar);
            } else if (iSelectName == 2) {
                fVarG = AbstractC5309d.g(abstractC5342c, hVar);
            } else if (iSelectName == 3) {
                bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar);
            } else if (iSelectName != 4) {
                abstractC5342c.skipValue();
            } else {
                zNextBoolean = abstractC5342c.nextBoolean();
            }
        }
        return new a1.k(strNextString, mVarA, fVarG, bVar, zNextBoolean);
    }
}
