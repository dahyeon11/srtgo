package T3;

import F3.d;
import F3.e;
import F3.h;
import F3.m;
import F3.o;
import F3.q;
import F3.r;
import F3.s;
import M3.b;
import U3.c;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f4854b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final c f4855a = new c();

    private static b a(b bVar) throws m {
        int[] enclosingRectangle = bVar.getEnclosingRectangle();
        if (enclosingRectangle == null) {
            throw m.getNotFoundInstance();
        }
        int i8 = enclosingRectangle[0];
        int i9 = enclosingRectangle[1];
        int i10 = enclosingRectangle[2];
        int i11 = enclosingRectangle[3];
        b bVar2 = new b(30, 33);
        for (int i12 = 0; i12 < 33; i12++) {
            int i13 = (((i12 * i11) + (i11 / 2)) / 33) + i9;
            for (int i14 = 0; i14 < 30; i14++) {
                if (bVar.get(((((i14 * i10) + (i10 / 2)) + (((i12 & 1) * i10) / 2)) / 30) + i8, i13)) {
                    bVar2.set(i14, i12);
                }
            }
        }
        return bVar2;
    }

    @Override // F3.o
    public q decode(F3.c cVar) {
        return decode(cVar, null);
    }

    @Override // F3.o
    public q decode(F3.c cVar, Map<e, ?> map) throws d, h, m {
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            throw m.getNotFoundInstance();
        }
        M3.e eVarDecode = this.f4855a.decode(a(cVar.getBlackMatrix()), map);
        q qVar = new q(eVarDecode.getText(), eVarDecode.getRawBytes(), f4854b, F3.a.MAXICODE);
        String eCLevel = eVarDecode.getECLevel();
        if (eCLevel != null) {
            qVar.putMetadata(r.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return qVar;
    }

    @Override // F3.o
    public void reset() {
    }
}
