package d1;

import e1.AbstractC5342c;

/* renamed from: d1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5319n {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f30012a = AbstractC5342c.a.of("fFamily", "fName", "fStyle", "ascent");

    static Y0.c a(AbstractC5342c abstractC5342c) {
        abstractC5342c.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        String strNextString3 = null;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f30012a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                strNextString3 = abstractC5342c.nextString();
            } else if (iSelectName == 2) {
                strNextString2 = abstractC5342c.nextString();
            } else if (iSelectName != 3) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                fNextDouble = (float) abstractC5342c.nextDouble();
            }
        }
        abstractC5342c.endObject();
        return new Y0.c(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
