package k4;

import android.graphics.Rect;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class s {

    class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j4.s f33644a;

        a(j4.s sVar) {
            this.f33644a = sVar;
        }

        @Override // java.util.Comparator
        public int compare(j4.s sVar, j4.s sVar2) {
            return Float.compare(s.this.a(sVar2, this.f33644a), s.this.a(sVar, this.f33644a));
        }
    }

    protected float a(j4.s sVar, j4.s sVar2) {
        return 0.5f;
    }

    public List<j4.s> getBestPreviewOrder(List<j4.s> list, j4.s sVar) {
        if (sVar == null) {
            return list;
        }
        Collections.sort(list, new a(sVar));
        return list;
    }

    public j4.s getBestPreviewSize(List<j4.s> list, j4.s sVar) {
        List<j4.s> bestPreviewOrder = getBestPreviewOrder(list, sVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Viewfinder size: ");
        sb.append(sVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview in order of preference: ");
        sb2.append(bestPreviewOrder);
        return bestPreviewOrder.get(0);
    }

    public abstract Rect scalePreview(j4.s sVar, j4.s sVar2);
}
