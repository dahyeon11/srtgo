package d1;

import a1.i;
import e1.AbstractC5342c;

/* loaded from: classes.dex */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f30034a = AbstractC5342c.a.of("nm", "mm", "hd");

    static a1.i a(AbstractC5342c abstractC5342c) {
        String strNextString = null;
        boolean zNextBoolean = false;
        i.a aVarForId = null;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f30034a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                aVarForId = i.a.forId(abstractC5342c.nextInt());
            } else if (iSelectName != 2) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                zNextBoolean = abstractC5342c.nextBoolean();
            }
        }
        return new a1.i(strNextString, aVarForId, zNextBoolean);
    }
}
