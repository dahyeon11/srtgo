package d1;

import android.graphics.Rect;
import b1.C1067e;
import com.kakao.sdk.user.Constants;
import e1.AbstractC5342c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a */
    private static final AbstractC5342c.a f30030a = AbstractC5342c.a.of("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static AbstractC5342c.a f30031b = AbstractC5342c.a.of(Constants.ID, "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final AbstractC5342c.a f30032c = AbstractC5342c.a.of(com.kakao.sdk.template.Constants.TYPE_LIST);

    /* renamed from: d */
    private static final AbstractC5342c.a f30033d = AbstractC5342c.a.of("cm", "tm", "dr");

    private static void a(AbstractC5342c abstractC5342c, T0.h hVar, Map map, Map map2) {
        abstractC5342c.beginArray();
        while (abstractC5342c.hasNext()) {
            ArrayList arrayList = new ArrayList();
            O.e eVar = new O.e();
            abstractC5342c.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            while (abstractC5342c.hasNext()) {
                int iSelectName = abstractC5342c.selectName(f30031b);
                if (iSelectName == 0) {
                    strNextString = abstractC5342c.nextString();
                } else if (iSelectName == 1) {
                    abstractC5342c.beginArray();
                    while (abstractC5342c.hasNext()) {
                        C1067e c1067e = v.parse(abstractC5342c, hVar);
                        eVar.put(c1067e.getId(), c1067e);
                        arrayList.add(c1067e);
                    }
                    abstractC5342c.endArray();
                } else if (iSelectName == 2) {
                    iNextInt = abstractC5342c.nextInt();
                } else if (iSelectName == 3) {
                    iNextInt2 = abstractC5342c.nextInt();
                } else if (iSelectName == 4) {
                    strNextString2 = abstractC5342c.nextString();
                } else if (iSelectName != 5) {
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                } else {
                    strNextString3 = abstractC5342c.nextString();
                }
            }
            abstractC5342c.endObject();
            if (strNextString2 != null) {
                T0.u uVar = new T0.u(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                map2.put(uVar.getId(), uVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        abstractC5342c.endArray();
    }

    private static void b(AbstractC5342c abstractC5342c, T0.h hVar, O.i iVar) {
        abstractC5342c.beginArray();
        while (abstractC5342c.hasNext()) {
            Y0.d dVarA = AbstractC5318m.a(abstractC5342c, hVar);
            iVar.put(dVarA.hashCode(), dVarA);
        }
        abstractC5342c.endArray();
    }

    private static void c(AbstractC5342c abstractC5342c, Map map) {
        abstractC5342c.beginObject();
        while (abstractC5342c.hasNext()) {
            if (abstractC5342c.selectName(f30032c) != 0) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                abstractC5342c.beginArray();
                while (abstractC5342c.hasNext()) {
                    Y0.c cVarA = AbstractC5319n.a(abstractC5342c);
                    map.put(cVarA.getName(), cVarA);
                }
                abstractC5342c.endArray();
            }
        }
        abstractC5342c.endObject();
    }

    private static void d(AbstractC5342c abstractC5342c, T0.h hVar, List list, O.e eVar) {
        abstractC5342c.beginArray();
        int i8 = 0;
        while (abstractC5342c.hasNext()) {
            C1067e c1067e = v.parse(abstractC5342c, hVar);
            if (c1067e.getLayerType() == C1067e.a.IMAGE) {
                i8++;
            }
            list.add(c1067e);
            eVar.put(c1067e.getId(), c1067e);
            if (i8 > 4) {
                f1.f.warning("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC5342c.endArray();
    }

    private static void e(AbstractC5342c abstractC5342c, List list) {
        abstractC5342c.beginArray();
        while (abstractC5342c.hasNext()) {
            abstractC5342c.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (abstractC5342c.hasNext()) {
                int iSelectName = abstractC5342c.selectName(f30033d);
                if (iSelectName == 0) {
                    strNextString = abstractC5342c.nextString();
                } else if (iSelectName == 1) {
                    fNextDouble = (float) abstractC5342c.nextDouble();
                } else if (iSelectName != 2) {
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                } else {
                    fNextDouble2 = (float) abstractC5342c.nextDouble();
                }
            }
            abstractC5342c.endObject();
            list.add(new Y0.h(strNextString, fNextDouble, fNextDouble2));
        }
        abstractC5342c.endArray();
    }

    public static T0.h parse(AbstractC5342c abstractC5342c) {
        HashMap map;
        ArrayList arrayList;
        AbstractC5342c abstractC5342c2 = abstractC5342c;
        float fDpScale = f1.j.dpScale();
        O.e eVar = new O.e();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        O.i iVar = new O.i();
        T0.h hVar = new T0.h();
        abstractC5342c.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c2.selectName(f30030a)) {
                case 0:
                    iNextInt = abstractC5342c.nextInt();
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 1:
                    iNextInt2 = abstractC5342c.nextInt();
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 2:
                    fNextDouble = (float) abstractC5342c.nextDouble();
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 3:
                    map = map4;
                    arrayList = arrayList3;
                    fNextDouble2 = ((float) abstractC5342c.nextDouble()) - 0.01f;
                    break;
                case 4:
                    map = map4;
                    arrayList = arrayList3;
                    fNextDouble3 = (float) abstractC5342c.nextDouble();
                    break;
                case 5:
                    String[] strArrSplit = abstractC5342c.nextString().split("\\.");
                    if (!f1.j.isAtLeastVersion(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        hVar.addWarning("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    abstractC5342c2 = abstractC5342c;
                case 6:
                    d(abstractC5342c2, hVar, arrayList2, eVar);
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 7:
                    a(abstractC5342c2, hVar, map2, map3);
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 8:
                    c(abstractC5342c2, map4);
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 9:
                    b(abstractC5342c2, hVar, iVar);
                    continue;
                    abstractC5342c2 = abstractC5342c;
                case 10:
                    e(abstractC5342c2, arrayList3);
                    continue;
                    abstractC5342c2 = abstractC5342c;
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    continue;
                    abstractC5342c2 = abstractC5342c;
            }
            map4 = map;
            arrayList3 = arrayList;
            abstractC5342c2 = abstractC5342c;
        }
        hVar.init(new Rect(0, 0, (int) (iNextInt * fDpScale), (int) (iNextInt2 * fDpScale)), fNextDouble, fNextDouble2, fNextDouble3, arrayList2, eVar, map2, map3, iVar, map4, arrayList3);
        return hVar;
    }
}
