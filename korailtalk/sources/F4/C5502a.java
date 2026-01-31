package f4;

import F3.c;
import F3.d;
import F3.h;
import F3.m;
import F3.o;
import F3.q;
import F3.r;
import F3.s;
import M3.g;
import g4.e;
import g4.i;
import java.util.List;
import java.util.Map;

/* renamed from: f4.a */
/* loaded from: classes2.dex */
public class C5502a implements o {

    /* renamed from: b */
    private static final s[] f31197b = new s[0];

    /* renamed from: a */
    private final e f31198a = new e();

    private static M3.b a(M3.b bVar) throws m {
        int[] topLeftOnBit = bVar.getTopLeftOnBit();
        int[] bottomRightOnBit = bVar.getBottomRightOnBit();
        if (topLeftOnBit == null || bottomRightOnBit == null) {
            throw m.getNotFoundInstance();
        }
        float fB = b(topLeftOnBit, bVar);
        int i8 = topLeftOnBit[1];
        int i9 = bottomRightOnBit[1];
        int i10 = topLeftOnBit[0];
        int i11 = bottomRightOnBit[0];
        if (i10 >= i11 || i8 >= i9) {
            throw m.getNotFoundInstance();
        }
        int i12 = i9 - i8;
        if (i12 != i11 - i10 && (i11 = i10 + i12) >= bVar.getWidth()) {
            throw m.getNotFoundInstance();
        }
        int iRound = Math.round(((i11 - i10) + 1) / fB);
        int iRound2 = Math.round((i12 + 1) / fB);
        if (iRound <= 0 || iRound2 <= 0) {
            throw m.getNotFoundInstance();
        }
        if (iRound2 != iRound) {
            throw m.getNotFoundInstance();
        }
        int i13 = (int) (fB / 2.0f);
        int i14 = i8 + i13;
        int i15 = i10 + i13;
        int i16 = (((int) ((iRound - 1) * fB)) + i15) - i11;
        if (i16 > 0) {
            if (i16 > i13) {
                throw m.getNotFoundInstance();
            }
            i15 -= i16;
        }
        int i17 = (((int) ((iRound2 - 1) * fB)) + i14) - i9;
        if (i17 > 0) {
            if (i17 > i13) {
                throw m.getNotFoundInstance();
            }
            i14 -= i17;
        }
        M3.b bVar2 = new M3.b(iRound, iRound2);
        for (int i18 = 0; i18 < iRound2; i18++) {
            int i19 = ((int) (i18 * fB)) + i14;
            for (int i20 = 0; i20 < iRound; i20++) {
                if (bVar.get(((int) (i20 * fB)) + i15, i19)) {
                    bVar2.set(i20, i18);
                }
            }
        }
        return bVar2;
    }

    private static float b(int[] iArr, M3.b bVar) throws m {
        int height = bVar.getHeight();
        int width = bVar.getWidth();
        int i8 = iArr[0];
        boolean z8 = true;
        int i9 = iArr[1];
        int i10 = 0;
        while (i8 < width && i9 < height) {
            if (z8 != bVar.get(i8, i9)) {
                i10++;
                if (i10 == 5) {
                    break;
                }
                z8 = !z8;
            }
            i8++;
            i9++;
        }
        if (i8 == width || i9 == height) {
            throw m.getNotFoundInstance();
        }
        return (i8 - iArr[0]) / 7.0f;
    }

    @Override // F3.o
    public q decode(c cVar) {
        return decode(cVar, null);
    }

    @Override // F3.o
    public final q decode(c cVar, Map<F3.e, ?> map) throws d, h, m {
        s[] points;
        M3.e eVarDecode;
        if (map == null || !map.containsKey(F3.e.PURE_BARCODE)) {
            g gVarDetect = new h4.c(cVar.getBlackMatrix()).detect(map);
            M3.e eVarDecode2 = this.f31198a.decode(gVarDetect.getBits(), map);
            points = gVarDetect.getPoints();
            eVarDecode = eVarDecode2;
        } else {
            eVarDecode = this.f31198a.decode(a(cVar.getBlackMatrix()), map);
            points = f31197b;
        }
        if (eVarDecode.getOther() instanceof i) {
            ((i) eVarDecode.getOther()).applyMirroredCorrection(points);
        }
        q qVar = new q(eVarDecode.getText(), eVarDecode.getRawBytes(), points, F3.a.QR_CODE);
        List<byte[]> byteSegments = eVarDecode.getByteSegments();
        if (byteSegments != null) {
            qVar.putMetadata(r.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = eVarDecode.getECLevel();
        if (eCLevel != null) {
            qVar.putMetadata(r.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        if (eVarDecode.hasStructuredAppend()) {
            qVar.putMetadata(r.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVarDecode.getStructuredAppendSequenceNumber()));
            qVar.putMetadata(r.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVarDecode.getStructuredAppendParity()));
        }
        return qVar;
    }

    @Override // F3.o
    public void reset() {
    }
}
