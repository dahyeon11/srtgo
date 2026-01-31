package W3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p extends r {

    /* renamed from: a */
    private final r[] f5346a;

    public p(Map<F3.e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(F3.e.POSSIBLE_FORMATS);
        boolean z8 = (map == null || map.get(F3.e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(F3.a.EAN_13) || collection.contains(F3.a.UPC_A) || collection.contains(F3.a.EAN_8) || collection.contains(F3.a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(F3.a.CODE_39)) {
                arrayList.add(new e(z8));
            }
            if (collection.contains(F3.a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(F3.a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(F3.a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(F3.a.CODABAR)) {
                arrayList.add(new C0816a());
            }
            if (collection.contains(F3.a.RSS_14)) {
                arrayList.add(new X3.e());
            }
            if (collection.contains(F3.a.RSS_EXPANDED)) {
                arrayList.add(new Y3.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new C0816a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new X3.e());
            arrayList.add(new Y3.d());
        }
        this.f5346a = (r[]) arrayList.toArray(new r[arrayList.size()]);
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) throws F3.m {
        for (r rVar : this.f5346a) {
            try {
                return rVar.decodeRow(i8, aVar, map);
            } catch (F3.p unused) {
            }
        }
        throw F3.m.getNotFoundInstance();
    }

    @Override // W3.r, F3.o
    public void reset() {
        for (r rVar : this.f5346a) {
            rVar.reset();
        }
    }
}
