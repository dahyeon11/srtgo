package F3;

import a4.C0835b;
import f4.C5502a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    private Map f1146a;

    /* renamed from: b, reason: collision with root package name */
    private o[] f1147b;

    private q a(c cVar) throws m {
        o[] oVarArr = this.f1147b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                try {
                    return oVar.decode(cVar, this.f1146a);
                } catch (p unused) {
                }
            }
        }
        throw m.getNotFoundInstance();
    }

    @Override // F3.o
    public q decode(c cVar) {
        setHints(null);
        return a(cVar);
    }

    public q decodeWithState(c cVar) {
        if (this.f1147b == null) {
            setHints(null);
        }
        return a(cVar);
    }

    @Override // F3.o
    public void reset() {
        o[] oVarArr = this.f1147b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                oVar.reset();
            }
        }
    }

    public void setHints(Map<e, ?> map) {
        this.f1146a = map;
        boolean z8 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z9 = collection.contains(a.UPC_A) || collection.contains(a.UPC_E) || collection.contains(a.EAN_13) || collection.contains(a.EAN_8) || collection.contains(a.CODABAR) || collection.contains(a.CODE_39) || collection.contains(a.CODE_93) || collection.contains(a.CODE_128) || collection.contains(a.ITF) || collection.contains(a.RSS_14) || collection.contains(a.RSS_EXPANDED);
            if (z9 && !z8) {
                arrayList.add(new W3.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new C5502a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new P3.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new G3.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new C0835b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new T3.a());
            }
            if (z9 && z8) {
                arrayList.add(new W3.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z8) {
                arrayList.add(new W3.p(map));
            }
            arrayList.add(new C5502a());
            arrayList.add(new P3.a());
            arrayList.add(new G3.b());
            arrayList.add(new C0835b());
            arrayList.add(new T3.a());
            if (z8) {
                arrayList.add(new W3.p(map));
            }
        }
        this.f1147b = (o[]) arrayList.toArray(new o[arrayList.size()]);
    }

    @Override // F3.o
    public q decode(c cVar, Map<e, ?> map) {
        setHints(map);
        return a(cVar);
    }
}
