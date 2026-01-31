package a1;

import b1.AbstractC1064b;

/* loaded from: classes.dex */
public class i implements InterfaceC0826c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5793a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5794b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5795c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i8) {
            return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public i(String str, a aVar, boolean z8) {
        this.f5793a = str;
        this.f5794b = aVar;
        this.f5795c = z8;
    }

    public a getMode() {
        return this.f5794b;
    }

    public String getName() {
        return this.f5793a;
    }

    public boolean isHidden() {
        return this.f5795c;
    }

    @Override // a1.InterfaceC0826c
    public V0.c toContent(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b) {
        if (pVar.enableMergePathsForKitKatAndAbove()) {
            return new V0.l(this);
        }
        f1.f.warning("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f5794b + '}';
    }
}
