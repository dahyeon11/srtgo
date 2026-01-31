package d1;

import e1.AbstractC5342c;
import java.util.ArrayList;

/* renamed from: d1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5318m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f30010a = AbstractC5342c.a.of("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5342c.a f30011b = AbstractC5342c.a.of("shapes");

    static Y0.d a(AbstractC5342c abstractC5342c, T0.h hVar) {
        ArrayList arrayList = new ArrayList();
        abstractC5342c.beginObject();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f30010a);
            if (iSelectName == 0) {
                cCharAt = abstractC5342c.nextString().charAt(0);
            } else if (iSelectName == 1) {
                dNextDouble2 = abstractC5342c.nextDouble();
            } else if (iSelectName == 2) {
                dNextDouble = abstractC5342c.nextDouble();
            } else if (iSelectName == 3) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 4) {
                strNextString2 = abstractC5342c.nextString();
            } else if (iSelectName != 5) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                abstractC5342c.beginObject();
                while (abstractC5342c.hasNext()) {
                    if (abstractC5342c.selectName(f30011b) != 0) {
                        abstractC5342c.skipName();
                        abstractC5342c.skipValue();
                    } else {
                        abstractC5342c.beginArray();
                        while (abstractC5342c.hasNext()) {
                            arrayList.add((a1.p) AbstractC5313h.a(abstractC5342c, hVar));
                        }
                        abstractC5342c.endArray();
                    }
                }
                abstractC5342c.endObject();
            }
        }
        abstractC5342c.endObject();
        return new Y0.d(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
