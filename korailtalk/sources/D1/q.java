package d1;

import a1.r;
import e1.AbstractC5342c;
import g1.C5534a;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class q {

    /* renamed from: a */
    private static final AbstractC5342c.a f30016a = AbstractC5342c.a.of("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC5342c.a f30017b = AbstractC5342c.a.of("p", "k");

    /* renamed from: c */
    private static final AbstractC5342c.a f30018c = AbstractC5342c.a.of("n", "v");

    static a1.f a(AbstractC5342c abstractC5342c, T0.h hVar) {
        String str;
        Z0.c cVar;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        String strNextString = null;
        a1.g gVar = null;
        Z0.c cVarE = null;
        Z0.f fVarG = null;
        Z0.f fVarG2 = null;
        Z0.b bVar = null;
        r.b bVar2 = null;
        r.c cVar2 = null;
        Z0.b bVar3 = null;
        boolean zNextBoolean = false;
        Z0.d dVar = null;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f30016a)) {
                case 0:
                    strNextString = abstractC5342c.nextString();
                    continue;
                case 1:
                    str = strNextString;
                    abstractC5342c.beginObject();
                    int iNextInt = -1;
                    while (abstractC5342c.hasNext()) {
                        int iSelectName = abstractC5342c.selectName(f30017b);
                        if (iSelectName != 0) {
                            cVar = cVarE;
                            if (iSelectName != 1) {
                                abstractC5342c.skipName();
                                abstractC5342c.skipValue();
                            } else {
                                cVarE = AbstractC5309d.e(abstractC5342c, hVar, iNextInt);
                            }
                        } else {
                            cVar = cVarE;
                            iNextInt = abstractC5342c.nextInt();
                        }
                        cVarE = cVar;
                    }
                    abstractC5342c.endObject();
                    break;
                case 2:
                    dVar = AbstractC5309d.f(abstractC5342c, hVar);
                    continue;
                case 3:
                    str = strNextString;
                    gVar = abstractC5342c.nextInt() == 1 ? a1.g.LINEAR : a1.g.RADIAL;
                    break;
                case 4:
                    fVarG = AbstractC5309d.g(abstractC5342c, hVar);
                    continue;
                case 5:
                    fVarG2 = AbstractC5309d.g(abstractC5342c, hVar);
                    continue;
                case 6:
                    bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                    continue;
                case 7:
                    str = strNextString;
                    bVar2 = r.b.values()[abstractC5342c.nextInt() - 1];
                    break;
                case 8:
                    str = strNextString;
                    cVar2 = r.c.values()[abstractC5342c.nextInt() - 1];
                    break;
                case 9:
                    str = strNextString;
                    fNextDouble = (float) abstractC5342c.nextDouble();
                    break;
                case 10:
                    zNextBoolean = abstractC5342c.nextBoolean();
                    continue;
                case 11:
                    abstractC5342c.beginArray();
                    while (abstractC5342c.hasNext()) {
                        abstractC5342c.beginObject();
                        String strNextString2 = null;
                        Z0.b bVar4 = null;
                        while (abstractC5342c.hasNext()) {
                            int iSelectName2 = abstractC5342c.selectName(f30018c);
                            if (iSelectName2 != 0) {
                                Z0.b bVar5 = bVar3;
                                if (iSelectName2 != 1) {
                                    abstractC5342c.skipName();
                                    abstractC5342c.skipValue();
                                } else {
                                    bVar4 = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                strNextString2 = abstractC5342c.nextString();
                            }
                        }
                        Z0.b bVar6 = bVar3;
                        abstractC5342c.endObject();
                        if (strNextString2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (strNextString2.equals("d") || strNextString2.equals("g")) {
                                hVar.setHasDashPattern(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    Z0.b bVar7 = bVar3;
                    abstractC5342c.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add((Z0.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    continue;
                    break;
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    continue;
            }
            strNextString = str;
        }
        String str2 = strNextString;
        if (dVar == null) {
            dVar = new Z0.d(Collections.singletonList(new C5534a(100)));
        }
        return new a1.f(str2, gVar, cVarE, dVar, fVarG, fVarG2, bVar, bVar2, cVar2, fNextDouble, arrayList, bVar3, zNextBoolean);
    }
}
