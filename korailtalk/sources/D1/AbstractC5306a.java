package d1;

import e1.AbstractC5342c;
import g1.C5534a;
import java.util.ArrayList;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5306a {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29988a = AbstractC5342c.a.of("k", "x", "y");

    static Z0.m a(AbstractC5342c abstractC5342c, T0.h hVar) {
        abstractC5342c.beginObject();
        Z0.e eVar = null;
        Z0.b bVar = null;
        boolean z8 = false;
        Z0.b bVar2 = null;
        while (abstractC5342c.peek() != AbstractC5342c.b.END_OBJECT) {
            int iSelectName = abstractC5342c.selectName(f29988a);
            if (iSelectName == 0) {
                eVar = parse(abstractC5342c, hVar);
            } else if (iSelectName != 1) {
                if (iSelectName != 2) {
                    abstractC5342c.skipName();
                    abstractC5342c.skipValue();
                } else if (abstractC5342c.peek() == AbstractC5342c.b.STRING) {
                    abstractC5342c.skipValue();
                    z8 = true;
                } else {
                    bVar = AbstractC5309d.parseFloat(abstractC5342c, hVar);
                }
            } else if (abstractC5342c.peek() == AbstractC5342c.b.STRING) {
                abstractC5342c.skipValue();
                z8 = true;
            } else {
                bVar2 = AbstractC5309d.parseFloat(abstractC5342c, hVar);
            }
        }
        abstractC5342c.endObject();
        if (z8) {
            hVar.addWarning("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new Z0.i(bVar2, bVar);
    }

    public static Z0.e parse(AbstractC5342c abstractC5342c, T0.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (abstractC5342c.peek() == AbstractC5342c.b.BEGIN_ARRAY) {
            abstractC5342c.beginArray();
            while (abstractC5342c.hasNext()) {
                arrayList.add(z.a(abstractC5342c, hVar));
            }
            abstractC5342c.endArray();
            u.setEndFrames(arrayList);
        } else {
            arrayList.add(new C5534a(s.e(abstractC5342c, f1.j.dpScale())));
        }
        return new Z0.e(arrayList);
    }
}
