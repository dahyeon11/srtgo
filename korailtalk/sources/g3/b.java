package G3;

import F3.o;
import F3.q;

/* loaded from: classes2.dex */
public final class b implements o {
    @Override // F3.o
    public q decode(F3.c cVar) {
        return decode(cVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0060 A[LOOP:0: B:80:0x005e->B:81:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0091  */
    @Override // F3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F3.q decode(F3.c r11, java.util.Map<F3.e, ?> r12) throws F3.h, F3.m {
        /*
            r10 = this;
            I3.a r0 = new I3.a
            M3.b r11 = r11.getBlackMatrix()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            G3.a r2 = r0.detect(r11)     // Catch: F3.h -> L25 F3.m -> L28
            F3.s[] r3 = r2.getPoints()     // Catch: F3.h -> L25 F3.m -> L28
            H3.a r4 = new H3.a     // Catch: F3.h -> L21 F3.m -> L23
            r4.<init>()     // Catch: F3.h -> L21 F3.m -> L23
            M3.e r2 = r4.decode(r2)     // Catch: F3.h -> L21 F3.m -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L31
        L21:
            r2 = move-exception
            goto L2b
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            r3 = r1
            goto L2b
        L28:
            r2 = move-exception
            r3 = r1
            goto L2f
        L2b:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L31
        L2f:
            r4 = r3
            r3 = r1
        L31:
            if (r1 != 0) goto L45
            r1 = 1
            G3.a r0 = r0.detect(r1)     // Catch: F3.h -> L47 F3.m -> L49
            F3.s[] r4 = r0.getPoints()     // Catch: F3.h -> L47 F3.m -> L49
            H3.a r1 = new H3.a     // Catch: F3.h -> L47 F3.m -> L49
            r1.<init>()     // Catch: F3.h -> L47 F3.m -> L49
            M3.e r1 = r1.decode(r0)     // Catch: F3.h -> L47 F3.m -> L49
        L45:
            r6 = r4
            goto L51
        L47:
            r11 = move-exception
            goto L4a
        L49:
            r11 = move-exception
        L4a:
            if (r2 != 0) goto L50
            if (r3 == 0) goto L4f
            throw r3
        L4f:
            throw r11
        L50:
            throw r2
        L51:
            if (r12 == 0) goto L68
            F3.e r0 = F3.e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            F3.t r12 = (F3.t) r12
            if (r12 == 0) goto L68
            int r0 = r6.length
        L5e:
            if (r11 >= r0) goto L68
            r2 = r6[r11]
            r12.foundPossibleResultPoint(r2)
            int r11 = r11 + 1
            goto L5e
        L68:
            F3.q r11 = new F3.q
            java.lang.String r3 = r1.getText()
            byte[] r4 = r1.getRawBytes()
            int r5 = r1.getNumBits()
            F3.a r7 = F3.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.getByteSegments()
            if (r12 == 0) goto L8b
            F3.r r0 = F3.r.BYTE_SEGMENTS
            r11.putMetadata(r0, r12)
        L8b:
            java.lang.String r12 = r1.getECLevel()
            if (r12 == 0) goto L96
            F3.r r0 = F3.r.ERROR_CORRECTION_LEVEL
            r11.putMetadata(r0, r12)
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.b.decode(F3.c, java.util.Map):F3.q");
    }

    @Override // F3.o
    public void reset() {
    }
}
