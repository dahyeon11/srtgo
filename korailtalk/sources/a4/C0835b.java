package a4;

import F3.h;
import F3.m;
import F3.o;
import F3.q;
import F3.r;
import F3.s;
import M3.e;
import b4.j;
import d4.AbstractC5323a;
import d4.C5324b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: a4.b */
/* loaded from: classes2.dex */
public final class C0835b implements o, V3.a {
    private static q[] a(F3.c cVar, Map map, boolean z8) {
        ArrayList arrayList = new ArrayList();
        C5324b c5324bDetect = AbstractC5323a.detect(cVar, map, z8);
        for (s[] sVarArr : c5324bDetect.getPoints()) {
            e eVarDecode = j.decode(c5324bDetect.getBits(), sVarArr[4], sVarArr[5], sVarArr[6], sVarArr[7], d(sVarArr), b(sVarArr));
            q qVar = new q(eVarDecode.getText(), eVarDecode.getRawBytes(), sVarArr, F3.a.PDF_417);
            qVar.putMetadata(r.ERROR_CORRECTION_LEVEL, eVarDecode.getECLevel());
            c cVar2 = (c) eVarDecode.getOther();
            if (cVar2 != null) {
                qVar.putMetadata(r.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(qVar);
        }
        return (q[]) arrayList.toArray(new q[arrayList.size()]);
    }

    private static int b(s[] sVarArr) {
        return Math.max(Math.max(c(sVarArr[0], sVarArr[4]), (c(sVarArr[6], sVarArr[2]) * 17) / 18), Math.max(c(sVarArr[1], sVarArr[5]), (c(sVarArr[7], sVarArr[3]) * 17) / 18));
    }

    private static int c(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return 0;
        }
        return (int) Math.abs(sVar.getX() - sVar2.getX());
    }

    private static int d(s[] sVarArr) {
        return Math.min(Math.min(e(sVarArr[0], sVarArr[4]), (e(sVarArr[6], sVarArr[2]) * 17) / 18), Math.min(e(sVarArr[1], sVarArr[5]), (e(sVarArr[7], sVarArr[3]) * 17) / 18));
    }

    private static int e(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(sVar.getX() - sVar2.getX());
    }

    @Override // F3.o
    public q decode(F3.c cVar) {
        return decode(cVar, null);
    }

    @Override // V3.a
    public q[] decodeMultiple(F3.c cVar) {
        return decodeMultiple(cVar, null);
    }

    @Override // F3.o
    public q decode(F3.c cVar, Map<F3.e, ?> map) throws m {
        q qVar;
        q[] qVarArrA = a(cVar, map, false);
        if (qVarArrA == null || qVarArrA.length == 0 || (qVar = qVarArrA[0]) == null) {
            throw m.getNotFoundInstance();
        }
        return qVar;
    }

    @Override // V3.a
    public q[] decodeMultiple(F3.c cVar, Map<F3.e, ?> map) throws m {
        try {
            return a(cVar, map, true);
        } catch (F3.d | h unused) {
            throw m.getNotFoundInstance();
        }
    }

    @Override // F3.o
    public void reset() {
    }
}
