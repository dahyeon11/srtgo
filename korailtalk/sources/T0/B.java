package T0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4773a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set f4774b = new O.b();

    /* renamed from: c, reason: collision with root package name */
    private final Map f4775c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator f4776d = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Z.d dVar, Z.d dVar2) {
            float fFloatValue = ((Float) dVar.second).floatValue();
            float fFloatValue2 = ((Float) dVar2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
    }

    void a(boolean z8) {
        this.f4773a = z8;
    }

    public void addFrameListener(b bVar) {
        this.f4774b.add(bVar);
    }

    public void clearRenderTimes() {
        this.f4775c.clear();
    }

    public List<Z.d> getSortedRenderTimes() {
        if (!this.f4773a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f4775c.size());
        for (Map.Entry entry : this.f4775c.entrySet()) {
            arrayList.add(new Z.d((String) entry.getKey(), Float.valueOf(((f1.h) entry.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.f4776d);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.f4773a) {
            List<Z.d> sortedRenderTimes = getSortedRenderTimes();
            for (int i8 = 0; i8 < sortedRenderTimes.size(); i8++) {
                Z.d dVar = sortedRenderTimes.get(i8);
                String.format("\t\t%30s:%.2f", dVar.first, dVar.second);
            }
        }
    }

    public void recordRenderTime(String str, float f8) {
        if (this.f4773a) {
            f1.h hVar = (f1.h) this.f4775c.get(str);
            if (hVar == null) {
                hVar = new f1.h();
                this.f4775c.put(str, hVar);
            }
            hVar.add(f8);
            if (str.equals("__container")) {
                Iterator it = this.f4774b.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.f.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void removeFrameListener(b bVar) {
        this.f4774b.remove(bVar);
    }
}
