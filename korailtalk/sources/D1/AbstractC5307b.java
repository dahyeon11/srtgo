package d1;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import e1.AbstractC5342c;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5307b {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29989a = AbstractC5342c.a.of(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5342c.a f29990b = AbstractC5342c.a.of("fc", "sc", "sw", "t");

    private static Z0.k a(AbstractC5342c abstractC5342c, T0.h hVar) {
        abstractC5342c.beginObject();
        Z0.a aVarC = null;
        Z0.a aVarC2 = null;
        Z0.b bVar = null;
        Z0.b bVar2 = null;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29990b);
            if (iSelectName == 0) {
                aVarC = AbstractC5309d.c(abstractC5342c, hVar);
            } else if (iSelectName == 1) {
                aVarC2 = AbstractC5309d.c(abstractC5342c, hVar);
            } else if (iSelectName == 2) {
                bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar);
            } else if (iSelectName != 3) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                bVar2 = AbstractC5309d.parseFloat(abstractC5342c, hVar);
            }
        }
        abstractC5342c.endObject();
        return new Z0.k(aVarC, aVarC2, bVar, bVar2);
    }

    public static Z0.k parse(AbstractC5342c abstractC5342c, T0.h hVar) {
        abstractC5342c.beginObject();
        Z0.k kVarA = null;
        while (abstractC5342c.hasNext()) {
            if (abstractC5342c.selectName(f29989a) != 0) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                kVarA = a(abstractC5342c, hVar);
            }
        }
        abstractC5342c.endObject();
        return kVarA == null ? new Z0.k(null, null, null, null) : kVarA;
    }
}
