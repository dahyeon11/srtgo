package d1;

import a1.InterfaceC0826c;
import e1.AbstractC5342c;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class J {

    /* renamed from: a */
    private static final AbstractC5342c.a f29983a = AbstractC5342c.a.of("nm", "hd", "it");

    static a1.p a(AbstractC5342c abstractC5342c, T0.h hVar) {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29983a);
            if (iSelectName == 0) {
                strNextString = abstractC5342c.nextString();
            } else if (iSelectName == 1) {
                zNextBoolean = abstractC5342c.nextBoolean();
            } else if (iSelectName != 2) {
                abstractC5342c.skipValue();
            } else {
                abstractC5342c.beginArray();
                while (abstractC5342c.hasNext()) {
                    InterfaceC0826c interfaceC0826cA = AbstractC5313h.a(abstractC5342c, hVar);
                    if (interfaceC0826cA != null) {
                        arrayList.add(interfaceC0826cA);
                    }
                }
                abstractC5342c.endArray();
            }
        }
        return new a1.p(strNextString, arrayList, zNextBoolean);
    }
}
