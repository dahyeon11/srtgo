package d1;

import android.graphics.PointF;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e1.AbstractC5342c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class H implements N {
    public static final H INSTANCE = new H();

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC5342c.a f29981a = AbstractC5342c.a.of(CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_C, "v", "i", "o");

    private H() {
    }

    @Override // d1.N
    public a1.n parse(AbstractC5342c abstractC5342c, float f8) {
        if (abstractC5342c.peek() == AbstractC5342c.b.BEGIN_ARRAY) {
            abstractC5342c.beginArray();
        }
        abstractC5342c.beginObject();
        List listF = null;
        List listF2 = null;
        List listF3 = null;
        boolean zNextBoolean = false;
        while (abstractC5342c.hasNext()) {
            int iSelectName = abstractC5342c.selectName(f29981a);
            if (iSelectName == 0) {
                zNextBoolean = abstractC5342c.nextBoolean();
            } else if (iSelectName == 1) {
                listF = s.f(abstractC5342c, f8);
            } else if (iSelectName == 2) {
                listF2 = s.f(abstractC5342c, f8);
            } else if (iSelectName != 3) {
                abstractC5342c.skipName();
                abstractC5342c.skipValue();
            } else {
                listF3 = s.f(abstractC5342c, f8);
            }
        }
        abstractC5342c.endObject();
        if (abstractC5342c.peek() == AbstractC5342c.b.END_ARRAY) {
            abstractC5342c.endArray();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new a1.n(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = (PointF) listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 1; i8 < size; i8++) {
            PointF pointF2 = (PointF) listF.get(i8);
            int i9 = i8 - 1;
            arrayList.add(new Y0.a(f1.i.addPoints((PointF) listF.get(i9), (PointF) listF3.get(i9)), f1.i.addPoints(pointF2, (PointF) listF2.get(i8)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = (PointF) listF.get(0);
            int i10 = size - 1;
            arrayList.add(new Y0.a(f1.i.addPoints((PointF) listF.get(i10), (PointF) listF3.get(i10)), f1.i.addPoints(pointF3, (PointF) listF2.get(0)), pointF3));
        }
        return new a1.n(pointF, zNextBoolean, arrayList);
    }
}
