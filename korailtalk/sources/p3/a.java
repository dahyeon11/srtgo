package P3;

import F3.c;
import F3.e;
import F3.m;
import F3.o;
import F3.q;
import F3.r;
import F3.s;
import M3.g;
import Q3.d;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f3684b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final d f3685a = new d();

    private static M3.b a(M3.b bVar) throws m {
        int[] topLeftOnBit = bVar.getTopLeftOnBit();
        int[] bottomRightOnBit = bVar.getBottomRightOnBit();
        if (topLeftOnBit == null || bottomRightOnBit == null) {
            throw m.getNotFoundInstance();
        }
        int iB = b(topLeftOnBit, bVar);
        int i8 = topLeftOnBit[1];
        int i9 = bottomRightOnBit[1];
        int i10 = topLeftOnBit[0];
        int i11 = ((bottomRightOnBit[0] - i10) + 1) / iB;
        int i12 = ((i9 - i8) + 1) / iB;
        if (i11 <= 0 || i12 <= 0) {
            throw m.getNotFoundInstance();
        }
        int i13 = iB / 2;
        int i14 = i8 + i13;
        int i15 = i10 + i13;
        M3.b bVar2 = new M3.b(i11, i12);
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i16 * iB) + i14;
            for (int i18 = 0; i18 < i11; i18++) {
                if (bVar.get((i18 * iB) + i15, i17)) {
                    bVar2.set(i18, i16);
                }
            }
        }
        return bVar2;
    }

    private static int b(int[] iArr, M3.b bVar) throws m {
        int width = bVar.getWidth();
        int i8 = iArr[0];
        int i9 = iArr[1];
        while (i8 < width && bVar.get(i8, i9)) {
            i8++;
        }
        if (i8 == width) {
            throw m.getNotFoundInstance();
        }
        int i10 = i8 - iArr[0];
        if (i10 != 0) {
            return i10;
        }
        throw m.getNotFoundInstance();
    }

    @Override // F3.o
    public q decode(c cVar) {
        return decode(cVar, null);
    }

    @Override // F3.o
    public q decode(c cVar, Map<e, ?> map) throws F3.d, m {
        s[] points;
        M3.e eVarDecode;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g gVarDetect = new R3.a(cVar.getBlackMatrix()).detect();
            M3.e eVarDecode2 = this.f3685a.decode(gVarDetect.getBits());
            points = gVarDetect.getPoints();
            eVarDecode = eVarDecode2;
        } else {
            eVarDecode = this.f3685a.decode(a(cVar.getBlackMatrix()));
            points = f3684b;
        }
        q qVar = new q(eVarDecode.getText(), eVarDecode.getRawBytes(), points, F3.a.DATA_MATRIX);
        List<byte[]> byteSegments = eVarDecode.getByteSegments();
        if (byteSegments != null) {
            qVar.putMetadata(r.BYTE_SEGMENTS, byteSegments);
        }
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
