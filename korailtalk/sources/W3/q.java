package W3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    private final y[] f5347a;

    public q(Map<F3.e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(F3.e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(F3.a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(F3.a.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(F3.a.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(F3.a.UPC_E)) {
                arrayList.add(new A());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new A());
        }
        this.f5347a = (y[]) arrayList.toArray(new y[arrayList.size()]);
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) throws F3.m {
        int[] iArrL = y.l(aVar);
        for (y yVar : this.f5347a) {
            try {
                F3.q qVarDecodeRow = yVar.decodeRow(i8, aVar, iArrL, map);
                boolean z8 = qVarDecodeRow.getBarcodeFormat() == F3.a.EAN_13 && qVarDecodeRow.getText().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(F3.e.POSSIBLE_FORMATS);
                boolean z9 = collection == null || collection.contains(F3.a.UPC_A);
                if (!z8 || !z9) {
                    return qVarDecodeRow;
                }
                F3.q qVar = new F3.q(qVarDecodeRow.getText().substring(1), qVarDecodeRow.getRawBytes(), qVarDecodeRow.getResultPoints(), F3.a.UPC_A);
                qVar.putAllMetadata(qVarDecodeRow.getResultMetadata());
                return qVar;
            } catch (F3.p unused) {
            }
        }
        throw F3.m.getNotFoundInstance();
    }

    @Override // W3.r, F3.o
    public void reset() {
        for (y yVar : this.f5347a) {
            yVar.reset();
        }
    }
}
