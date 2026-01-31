package d1;

import a1.s;
import e1.AbstractC5342c;

/* loaded from: classes.dex */
abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29987a = AbstractC5342c.a.of("s", "e", "o", "nm", "m", "hd");

    static a1.s a(AbstractC5342c abstractC5342c, T0.h hVar) {
        String strNextString = null;
        s.a aVarForId = null;
        Z0.b bVar = null;
        Z0.b bVar2 = null;
        Z0.b bVar3 = null;
        boolean zNextBoolean = false;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29987a);
            if (iSelectName == 0) {
                bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
            } else if (iSelectName == 1) {
                bVar2 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
            } else if (iSelectName == 2) {
                bVar3 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
            } else if (iSelectName == 3) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 4) {
                aVarForId = s.a.forId(abstractC5342c.nextInt());
            } else if (iSelectName != 5) {
                abstractC5342c.skipValue();
            } else {
                zNextBoolean = abstractC5342c.nextBoolean();
            }
        }
        return new a1.s(strNextString, aVarForId, bVar, bVar2, bVar3, zNextBoolean);
    }
}
