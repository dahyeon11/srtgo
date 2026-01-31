package d1;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import e1.AbstractC5342c;

/* loaded from: classes.dex */
abstract class E {

    /* renamed from: a */
    private static final AbstractC5342c.a f29979a = AbstractC5342c.a.of("nm", CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C, "o", "tr", "hd");

    static a1.l a(AbstractC5342c abstractC5342c, T0.h hVar) {
        String strNextString = null;
        Z0.b bVar = null;
        Z0.b bVar2 = null;
        Z0.l lVar = null;
        boolean zNextBoolean = false;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29979a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
            } else if (iSelectName == 2) {
                bVar2 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
            } else if (iSelectName == 3) {
                lVar = AbstractC5308c.parse(abstractC5342c, hVar);
            } else if (iSelectName != 4) {
                abstractC5342c.skipValue();
            } else {
                zNextBoolean = abstractC5342c.nextBoolean();
            }
        }
        return new a1.l(strNextString, bVar, bVar2, lVar, zNextBoolean);
    }
}
