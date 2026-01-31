package d1;

import a1.C0825b;
import e1.AbstractC5342c;

/* renamed from: d1.f */
/* loaded from: classes.dex */
abstract class AbstractC5311f {

    /* renamed from: a */
    private static final AbstractC5342c.a f29995a = AbstractC5342c.a.of("nm", "p", "s", "hd", "d");

    static C0825b a(AbstractC5342c abstractC5342c, T0.h hVar, int i8) {
        boolean z8 = i8 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        Z0.m mVarA = null;
        Z0.f fVarG = null;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29995a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                mVarA = AbstractC5306a.a(abstractC5342c, hVar);
            } else if (iSelectName == 2) {
                fVarG = AbstractC5309d.g(abstractC5342c, hVar);
            } else if (iSelectName == 3) {
                zNextBoolean = abstractC5342c.nextBoolean();
            } else if (iSelectName != 4) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                z8 = abstractC5342c.nextInt() == 3;
            }
        }
        return new C0825b(strNextString, mVarA, fVarG, z8, zNextBoolean);
    }
}
