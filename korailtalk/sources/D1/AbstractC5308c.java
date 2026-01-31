package d1;

import android.graphics.PointF;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e1.AbstractC5342c;
import g1.C5534a;
import g1.C5537d;

/* renamed from: d1.c */
/* loaded from: classes.dex */
public abstract class AbstractC5308c {

    /* renamed from: a */
    private static final AbstractC5342c.a f29991a = AbstractC5342c.a.of(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A, "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final AbstractC5342c.a f29992b = AbstractC5342c.a.of("k");

    private static boolean a(Z0.e eVar) {
        return eVar == null || (eVar.isStatic() && ((PointF) eVar.getKeyframes().get(0).startValue).equals(0.0f, 0.0f));
    }

    private static boolean b(Z0.m mVar) {
        return mVar == null || (!(mVar instanceof Z0.i) && mVar.isStatic() && ((PointF) mVar.getKeyframes().get(0).startValue).equals(0.0f, 0.0f));
    }

    private static boolean c(Z0.b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C5534a) bVar.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    private static boolean d(Z0.g gVar) {
        return gVar == null || (gVar.isStatic() && ((C5537d) ((C5534a) gVar.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f));
    }

    private static boolean e(Z0.b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C5534a) bVar.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    private static boolean f(Z0.b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C5534a) bVar.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    public static Z0.l parse(AbstractC5342c abstractC5342c, T0.h hVar) {
        boolean z8;
        boolean z9 = false;
        boolean z10 = abstractC5342c.peek() == AbstractC5342c.b.BEGIN_OBJECT;
        if (z10) {
            abstractC5342c.beginObject();
        }
        Z0.b bVar = null;
        Z0.e eVar = null;
        Z0.m mVarA = null;
        Z0.g gVarH = null;
        Z0.b bVar2 = null;
        Z0.b bVar3 = null;
        Z0.d dVarF = null;
        Z0.b bVar4 = null;
        Z0.b bVar5 = null;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f29991a)) {
                case 0:
                    boolean z11 = z9;
                    abstractC5342c.beginObject();
                    while (abstractC5342c.hasNext()) {
                        if (abstractC5342c.selectName(f29992b) != 0) {
                            abstractC5342c.skipName();
                            abstractC5342c.skipValue();
                        } else {
                            eVar = AbstractC5306a.parse(abstractC5342c, hVar);
                        }
                    }
                    abstractC5342c.endObject();
                    z9 = z11;
                    continue;
                case 1:
                    mVarA = AbstractC5306a.a(abstractC5342c, hVar);
                    continue;
                case 2:
                    gVarH = AbstractC5309d.h(abstractC5342c, hVar);
                    continue;
                case 3:
                    hVar.addWarning("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVarF = AbstractC5309d.f(abstractC5342c, hVar);
                    continue;
                case 6:
                    bVar4 = AbstractC5309d.parseFloat(abstractC5342c, hVar, z9);
                    continue;
                case 7:
                    bVar5 = AbstractC5309d.parseFloat(abstractC5342c, hVar, z9);
                    continue;
                case 8:
                    bVar2 = AbstractC5309d.parseFloat(abstractC5342c, hVar, z9);
                    continue;
                case 9:
                    bVar3 = AbstractC5309d.parseFloat(abstractC5342c, hVar, z9);
                    continue;
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    continue;
            }
            Z0.b bVar6 = AbstractC5309d.parseFloat(abstractC5342c, hVar, z9);
            if (bVar6.getKeyframes().isEmpty()) {
                bVar6.getKeyframes().add(new C5534a(hVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(hVar.getEndFrame())));
            } else {
                if (((C5534a) bVar6.getKeyframes().get(0)).startValue == null) {
                    z8 = false;
                    bVar6.getKeyframes().set(0, new C5534a(hVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(hVar.getEndFrame())));
                }
                z9 = z8;
                bVar = bVar6;
            }
            z8 = false;
            z9 = z8;
            bVar = bVar6;
        }
        if (z10) {
            abstractC5342c.endObject();
        }
        Z0.e eVar2 = a(eVar) ? null : eVar;
        Z0.m mVar = b(mVarA) ? null : mVarA;
        Z0.b bVar7 = c(bVar) ? null : bVar;
        if (d(gVarH)) {
            gVarH = null;
        }
        return new Z0.l(eVar2, mVar, gVarH, bVar7, dVarF, bVar4, bVar5, f(bVar2) ? null : bVar2, e(bVar3) ? null : bVar3);
    }
}
