package d1;

import a1.C0824a;
import a1.InterfaceC0826c;
import android.graphics.Color;
import android.graphics.Rect;
import b1.C1067e;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e1.AbstractC5342c;
import g1.C5534a;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f30026a = AbstractC5342c.a.of("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5342c.a f30027b = AbstractC5342c.a.of("d", CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_A);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5342c.a f30028c = AbstractC5342c.a.of("ty", "nm");

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30029a;

        static {
            int[] iArr = new int[C1067e.b.values().length];
            f30029a = iArr;
            try {
                iArr[C1067e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30029a[C1067e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static C1067e parse(T0.h hVar) {
        Rect bounds = hVar.getBounds();
        return new C1067e(Collections.emptyList(), hVar, "__container", -1L, C1067e.a.PRE_COMP, -1L, null, Collections.emptyList(), new Z0.l(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), C1067e.b.NONE, null, false, null, null);
    }

    public static C1067e parse(AbstractC5342c abstractC5342c, T0.h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f8;
        C1067e.b bVar = C1067e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        abstractC5342c.beginObject();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        C1067e.b bVar2 = bVar;
        C1067e.a aVar = null;
        String strNextString = null;
        Z0.l lVar = null;
        Z0.j jVarD = null;
        Z0.k kVar = null;
        Z0.b bVar3 = null;
        C0824a c0824aB = null;
        C5315j c5315jB = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        int iNextInt3 = 0;
        int iNextInt4 = 0;
        boolean zNextBoolean = false;
        float fNextDouble = 1.0f;
        long jNextInt2 = -1;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float endFrame = 0.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        while (abstractC5342c.hasNext()) {
            switch (abstractC5342c.selectName(f30026a)) {
                case 0:
                    strNextString2 = abstractC5342c.nextString();
                    break;
                case 1:
                    jNextInt = abstractC5342c.nextInt();
                    break;
                case 2:
                    strNextString = abstractC5342c.nextString();
                    break;
                case 3:
                    int iNextInt5 = abstractC5342c.nextInt();
                    aVar = C1067e.a.UNKNOWN;
                    if (iNextInt5 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = C1067e.a.values()[iNextInt5];
                        break;
                    }
                case 4:
                    jNextInt2 = abstractC5342c.nextInt();
                    break;
                case 5:
                    iNextInt = (int) (abstractC5342c.nextInt() * f1.j.dpScale());
                    break;
                case 6:
                    iNextInt2 = (int) (abstractC5342c.nextInt() * f1.j.dpScale());
                    break;
                case 7:
                    color = Color.parseColor(abstractC5342c.nextString());
                    break;
                case 8:
                    lVar = AbstractC5308c.parse(abstractC5342c, hVar);
                    break;
                case 9:
                    int iNextInt6 = abstractC5342c.nextInt();
                    if (iNextInt6 >= C1067e.b.values().length) {
                        hVar.addWarning("Unsupported matte type: " + iNextInt6);
                        break;
                    } else {
                        bVar2 = C1067e.b.values()[iNextInt6];
                        int i8 = a.f30029a[bVar2.ordinal()];
                        if (i8 == 1) {
                            hVar.addWarning("Unsupported matte type: Luma");
                        } else if (i8 == 2) {
                            hVar.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        hVar.incrementMatteOrMaskCount(1);
                        break;
                    }
                case 10:
                    abstractC5342c.beginArray();
                    while (abstractC5342c.hasNext()) {
                        arrayList3.add(x.a(abstractC5342c, hVar));
                    }
                    hVar.incrementMatteOrMaskCount(arrayList3.size());
                    abstractC5342c.endArray();
                    break;
                case 11:
                    abstractC5342c.beginArray();
                    while (abstractC5342c.hasNext()) {
                        InterfaceC0826c interfaceC0826cA = AbstractC5313h.a(abstractC5342c, hVar);
                        if (interfaceC0826cA != null) {
                            arrayList4.add(interfaceC0826cA);
                        }
                    }
                    abstractC5342c.endArray();
                    break;
                case 12:
                    abstractC5342c.beginObject();
                    while (abstractC5342c.hasNext()) {
                        int iSelectName = abstractC5342c.selectName(f30027b);
                        if (iSelectName == 0) {
                            jVarD = AbstractC5309d.d(abstractC5342c, hVar);
                        } else if (iSelectName != 1) {
                            abstractC5342c.skipName();
                            abstractC5342c.skipValue();
                        } else {
                            abstractC5342c.beginArray();
                            if (abstractC5342c.hasNext()) {
                                kVar = AbstractC5307b.parse(abstractC5342c, hVar);
                            }
                            while (abstractC5342c.hasNext()) {
                                abstractC5342c.skipValue();
                            }
                            abstractC5342c.endArray();
                        }
                    }
                    abstractC5342c.endObject();
                    break;
                case 13:
                    abstractC5342c.beginArray();
                    ArrayList arrayList5 = new ArrayList();
                    while (abstractC5342c.hasNext()) {
                        abstractC5342c.beginObject();
                        while (abstractC5342c.hasNext()) {
                            int iSelectName2 = abstractC5342c.selectName(f30028c);
                            if (iSelectName2 == 0) {
                                int iNextInt7 = abstractC5342c.nextInt();
                                if (iNextInt7 == 29) {
                                    c0824aB = AbstractC5310e.b(abstractC5342c, hVar);
                                } else if (iNextInt7 == 25) {
                                    c5315jB = new C5316k().b(abstractC5342c, hVar);
                                }
                            } else if (iSelectName2 != 1) {
                                abstractC5342c.skipName();
                                abstractC5342c.skipValue();
                            } else {
                                arrayList5.add(abstractC5342c.nextString());
                            }
                        }
                        abstractC5342c.endObject();
                    }
                    abstractC5342c.endArray();
                    hVar.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    fNextDouble = (float) abstractC5342c.nextDouble();
                    break;
                case 15:
                    fNextDouble3 = (float) abstractC5342c.nextDouble();
                    break;
                case 16:
                    iNextInt3 = (int) (abstractC5342c.nextInt() * f1.j.dpScale());
                    break;
                case 17:
                    iNextInt4 = (int) (abstractC5342c.nextInt() * f1.j.dpScale());
                    break;
                case 18:
                    fNextDouble2 = (float) abstractC5342c.nextDouble();
                    break;
                case 19:
                    endFrame = (float) abstractC5342c.nextDouble();
                    break;
                case 20:
                    bVar3 = AbstractC5309d.parseFloat(abstractC5342c, hVar, false);
                    break;
                case 21:
                    strNextString3 = abstractC5342c.nextString();
                    break;
                case 22:
                    zNextBoolean = abstractC5342c.nextBoolean();
                    break;
                default:
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                    break;
            }
        }
        abstractC5342c.endObject();
        ArrayList arrayList6 = new ArrayList();
        if (fNextDouble2 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C5534a(hVar, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(fNextDouble2)));
            f8 = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f8 = 0.0f;
        }
        if (endFrame <= f8) {
            endFrame = hVar.getEndFrame();
        }
        arrayList2.add(new C5534a(hVar, fValueOf, fValueOf, null, fNextDouble2, Float.valueOf(endFrame)));
        arrayList2.add(new C5534a(hVar, fValueOf2, fValueOf2, null, endFrame, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            hVar.addWarning("Convert your Illustrator layers to shape layers.");
        }
        return new C1067e(arrayList4, hVar, strNextString2, jNextInt, aVar, jNextInt2, strNextString, arrayList, lVar, iNextInt, iNextInt2, color, fNextDouble, fNextDouble3, iNextInt3, iNextInt4, jVarD, kVar, arrayList2, bVar2, bVar3, zNextBoolean, c0824aB, c5315jB);
    }
}
