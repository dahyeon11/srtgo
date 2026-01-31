package d1;

import a1.j;
import com.kakao.sdk.common.Constants;
import e1.AbstractC5342c;

/* renamed from: d1.C */
/* loaded from: classes.dex */
abstract class AbstractC5304C {

    /* renamed from: a */
    private static final AbstractC5342c.a f29977a = AbstractC5342c.a.of("nm", "sy", "pt", "p", "r", "or", Constants.OS, "ir", "is", "hd", "d");

    static a1.j a(AbstractC5342c abstractC5342c, T0.h hVar, int i8) {
        boolean zNextBoolean = false;
        boolean z8 = i8 == 3;
        String strNextString = null;
        j.a aVarForValue = null;
        Z0.b bVar = null;
        Z0.m mVarA = null;
        Z0.b bVar2 = null;
        Z0.b bVar3 = null;
        Z0.b bVar4 = null;
        Z0.b bVar5 = null;
        Z0.b bVar6 = null;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f29977a)) {
                case 0:
                    strNextString = abstractC5342c.nextString();
                    break;
                case 1:
                    aVarForValue = j.a.forValue(abstractC5342c.nextInt());
                    break;
                case 2:
                    bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                    break;
                case 3:
                    mVarA = AbstractC5306a.a(abstractC5342c, hVar);
                    break;
                case 4:
                    bVar2 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                    break;
                case 5:
                    bVar4 = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                    break;
                case 6:
                    bVar6 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                    break;
                case 7:
                    bVar3 = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                    break;
                case 8:
                    bVar5 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                    break;
                case 9:
                    zNextBoolean = abstractC5342c.nextBoolean();
                    break;
                case 10:
                    if (abstractC5342c.nextInt() != 3) {
                        z8 = false;
                        break;
                    } else {
                        z8 = true;
                        break;
                    }
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    break;
            }
        }
        return new a1.j(strNextString, aVarForValue, bVar, mVarA, bVar2, bVar3, bVar4, bVar5, bVar6, zNextBoolean, z8);
    }
}
