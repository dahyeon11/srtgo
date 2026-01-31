package R;

import R.e;

/* loaded from: classes.dex */
public class k {
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CACHE_MEASURES = 256;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GRAPH = 64;
    public static final int OPTIMIZATION_GRAPH_WRAP = 128;
    public static final int OPTIMIZATION_GROUPING = 1024;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 257;

    /* renamed from: a */
    static boolean[] f4284a = new boolean[3];

    static void a(f fVar, Q.d dVar, e eVar) {
        eVar.mHorizontalResolution = -1;
        eVar.mVerticalResolution = -1;
        e.b bVar = fVar.mListDimensionBehaviors[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.mListDimensionBehaviors[0] == e.b.MATCH_PARENT) {
            int i8 = eVar.mLeft.mMargin;
            int width = fVar.getWidth() - eVar.mRight.mMargin;
            d dVar2 = eVar.mLeft;
            dVar2.f4152e = dVar.createObjectVariable(dVar2);
            d dVar3 = eVar.mRight;
            dVar3.f4152e = dVar.createObjectVariable(dVar3);
            dVar.addEquality(eVar.mLeft.f4152e, i8);
            dVar.addEquality(eVar.mRight.f4152e, width);
            eVar.mHorizontalResolution = 2;
            eVar.setHorizontalDimension(i8, width);
        }
        if (fVar.mListDimensionBehaviors[1] == bVar2 || eVar.mListDimensionBehaviors[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i9 = eVar.mTop.mMargin;
        int height = fVar.getHeight() - eVar.mBottom.mMargin;
        d dVar4 = eVar.mTop;
        dVar4.f4152e = dVar.createObjectVariable(dVar4);
        d dVar5 = eVar.mBottom;
        dVar5.f4152e = dVar.createObjectVariable(dVar5);
        dVar.addEquality(eVar.mTop.f4152e, i9);
        dVar.addEquality(eVar.mBottom.f4152e, height);
        if (eVar.f4157C > 0 || eVar.getVisibility() == 8) {
            d dVar6 = eVar.mBaseline;
            dVar6.f4152e = dVar.createObjectVariable(dVar6);
            dVar.addEquality(eVar.mBaseline.f4152e, eVar.f4157C + i9);
        }
        eVar.mVerticalResolution = 2;
        eVar.setVerticalDimension(i9, height);
    }

    public static final boolean enabled(int i8, int i9) {
        return (i8 & i9) == i9;
    }
}
