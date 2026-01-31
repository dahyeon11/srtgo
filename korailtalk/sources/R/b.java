package R;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r8 r15
  0x002f: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r15v31 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r8 r15
  0x0031: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r15v3 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0189  */
    /* JADX WARN: Type inference failed for: r2v56, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [R.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(R.f r37, Q.d r38, int r39, int r40, R.c r41) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R.b.a(R.f, Q.d, int, int, R.c):void");
    }

    public static void applyChainConstraints(f fVar, Q.d dVar, ArrayList<e> arrayList, int i8) {
        int i9;
        c[] cVarArr;
        int i10;
        if (i8 == 0) {
            i9 = fVar.mHorizontalChainsSize;
            cVarArr = fVar.f4224o0;
            i10 = 0;
        } else {
            i9 = fVar.mVerticalChainsSize;
            cVarArr = fVar.f4223n0;
            i10 = 2;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            c cVar = cVarArr[i11];
            cVar.define();
            if (arrayList == null || arrayList.contains(cVar.f4126a)) {
                a(fVar, dVar, i8, i10, cVar);
            }
        }
    }
}
