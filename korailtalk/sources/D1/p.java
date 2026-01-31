package d1;

import android.graphics.Path;
import e1.AbstractC5342c;
import g1.C5534a;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class p {

    /* renamed from: a */
    private static final AbstractC5342c.a f30014a = AbstractC5342c.a.of("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final AbstractC5342c.a f30015b = AbstractC5342c.a.of("p", "k");

    static a1.e a(AbstractC5342c abstractC5342c, T0.h hVar) {
        Z0.d dVarF = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        a1.g gVar = null;
        Z0.c cVarE = null;
        Z0.f fVarG = null;
        Z0.f fVarG2 = null;
        boolean zNextBoolean = false;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f30014a)) {
                case 0:
                    strNextString = abstractC5342c.nextString();
                    break;
                case 1:
                    abstractC5342c.beginObject();
                    int iNextInt = -1;
                    while (abstractC5342c.hasNext()) {
                        int iSelectName = abstractC5342c.selectName(f30015b);
                        if (iSelectName == 0) {
                            iNextInt = abstractC5342c.nextInt();
                        } else if (iSelectName != 1) {
                            abstractC5342c.skipName();
                            abstractC5342c.skipValue();
                        } else {
                            cVarE = AbstractC5309d.e(abstractC5342c, hVar, iNextInt);
                        }
                    }
                    abstractC5342c.endObject();
                    break;
                case 2:
                    dVarF = AbstractC5309d.f(abstractC5342c, hVar);
                    break;
                case 3:
                    gVar = abstractC5342c.nextInt() == 1 ? a1.g.LINEAR : a1.g.RADIAL;
                    break;
                case 4:
                    fVarG = AbstractC5309d.g(abstractC5342c, hVar);
                    break;
                case 5:
                    fVarG2 = AbstractC5309d.g(abstractC5342c, hVar);
                    break;
                case 6:
                    fillType = abstractC5342c.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zNextBoolean = abstractC5342c.nextBoolean();
                    break;
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    break;
            }
        }
        return new a1.e(strNextString, gVar, fillType, cVarE, dVarF == null ? new Z0.d(Collections.singletonList(new C5534a(100))) : dVarF, fVarG, fVarG2, null, null, zNextBoolean);
    }
}
