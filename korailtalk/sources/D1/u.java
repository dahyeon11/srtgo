package d1;

import e1.AbstractC5342c;
import g1.C5534a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC5342c.a f30025a = AbstractC5342c.a.of("k");

    static List a(AbstractC5342c abstractC5342c, T0.h hVar, float f8, N n8, boolean z8) {
        ArrayList arrayList = new ArrayList();
        if (abstractC5342c.peek() == AbstractC5342c.b.STRING) {
            hVar.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC5342c.beginObject();
        while (abstractC5342c.hasNext()) {
            if (abstractC5342c.selectName(f30025a) != 0) {
                abstractC5342c.skipValue();
            } else if (abstractC5342c.peek() == AbstractC5342c.b.BEGIN_ARRAY) {
                abstractC5342c.beginArray();
                if (abstractC5342c.peek() == AbstractC5342c.b.NUMBER) {
                    arrayList.add(t.c(abstractC5342c, hVar, f8, n8, false, z8));
                } else {
                    while (abstractC5342c.hasNext()) {
                        arrayList.add(t.c(abstractC5342c, hVar, f8, n8, true, z8));
                    }
                }
                abstractC5342c.endArray();
            } else {
                arrayList.add(t.c(abstractC5342c, hVar, f8, n8, false, z8));
            }
        }
        abstractC5342c.endObject();
        setEndFrames(arrayList);
        return arrayList;
    }

    public static <T> void setEndFrames(List<? extends C5534a> list) {
        int i8;
        Object obj;
        int size = list.size();
        int i9 = 0;
        while (true) {
            i8 = size - 1;
            if (i9 >= i8) {
                break;
            }
            C5534a c5534a = list.get(i9);
            i9++;
            C5534a c5534a2 = list.get(i9);
            c5534a.endFrame = Float.valueOf(c5534a2.startFrame);
            if (c5534a.endValue == null && (obj = c5534a2.startValue) != null) {
                c5534a.endValue = obj;
                if (c5534a instanceof W0.i) {
                    ((W0.i) c5534a).createPath();
                }
            }
        }
        C5534a c5534a3 = list.get(i8);
        if ((c5534a3.startValue == null || c5534a3.endValue == null) && list.size() > 1) {
            list.remove(c5534a3);
        }
    }
}
