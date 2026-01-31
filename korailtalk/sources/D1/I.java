package d1;

import android.graphics.Path;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e1.AbstractC5342c;
import g1.C5534a;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class I {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29982a = AbstractC5342c.a.of("nm", CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C, "o", "fillEnabled", "r", "hd");

    static a1.o a(AbstractC5342c abstractC5342c, T0.h hVar) {
        Z0.d dVar = null;
        String strNextString = null;
        Z0.a aVarC = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29982a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                aVarC = AbstractC5309d.c(abstractC5342c, hVar);
            } else if (iSelectName == 2) {
                dVar = AbstractC5309d.f(abstractC5342c, hVar);
            } else if (iSelectName == 3) {
                zNextBoolean = abstractC5342c.nextBoolean();
            } else if (iSelectName == 4) {
                iNextInt = abstractC5342c.nextInt();
            } else if (iSelectName != 5) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                zNextBoolean2 = abstractC5342c.nextBoolean();
            }
        }
        if (dVar == null) {
            dVar = new Z0.d(Collections.singletonList(new C5534a(100)));
        }
        return new a1.o(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zNextBoolean2);
    }
}
