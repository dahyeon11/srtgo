package d1;

import e1.AbstractC5342c;

/* loaded from: classes.dex */
abstract class K {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC5342c.a f29984a = AbstractC5342c.a.of("nm", "ind", "ks", "hd");

    static a1.q a(AbstractC5342c abstractC5342c, T0.h hVar) {
        String strNextString = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        Z0.h hVarI = null;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29984a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                iNextInt = abstractC5342c.nextInt();
            } else if (iSelectName == 2) {
                hVarI = AbstractC5309d.i(abstractC5342c, hVar);
            } else if (iSelectName != 3) {
                abstractC5342c.skipValue();
            } else {
                zNextBoolean = abstractC5342c.nextBoolean();
            }
        }
        return new a1.q(strNextString, iNextInt, hVarI, zNextBoolean);
    }
}
