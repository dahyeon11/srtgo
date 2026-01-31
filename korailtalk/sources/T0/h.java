package T0;

import android.graphics.Rect;
import b1.C1067e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Map f4801c;

    /* renamed from: d, reason: collision with root package name */
    private Map f4802d;

    /* renamed from: e, reason: collision with root package name */
    private Map f4803e;

    /* renamed from: f, reason: collision with root package name */
    private List f4804f;

    /* renamed from: g, reason: collision with root package name */
    private O.i f4805g;

    /* renamed from: h, reason: collision with root package name */
    private O.e f4806h;

    /* renamed from: i, reason: collision with root package name */
    private List f4807i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f4808j;

    /* renamed from: k, reason: collision with root package name */
    private float f4809k;

    /* renamed from: l, reason: collision with root package name */
    private float f4810l;

    /* renamed from: m, reason: collision with root package name */
    private float f4811m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4812n;

    /* renamed from: a, reason: collision with root package name */
    private final B f4799a = new B();

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f4800b = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private int f4813o = 0;

    public void addWarning(String str) {
        f1.f.warning(str);
        this.f4800b.add(str);
    }

    public Rect getBounds() {
        return this.f4808j;
    }

    public O.i getCharacters() {
        return this.f4805g;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.f4811m) * 1000.0f);
    }

    public float getDurationFrames() {
        return this.f4810l - this.f4809k;
    }

    public float getEndFrame() {
        return this.f4810l;
    }

    public Map<String, Y0.c> getFonts() {
        return this.f4803e;
    }

    public float getFrameForProgress(float f8) {
        return f1.i.lerp(this.f4809k, this.f4810l, f8);
    }

    public float getFrameRate() {
        return this.f4811m;
    }

    public Map<String, u> getImages() {
        return this.f4802d;
    }

    public List<C1067e> getLayers() {
        return this.f4807i;
    }

    public Y0.h getMarker(String str) {
        int size = this.f4804f.size();
        for (int i8 = 0; i8 < size; i8++) {
            Y0.h hVar = (Y0.h) this.f4804f.get(i8);
            if (hVar.matchesName(str)) {
                return hVar;
            }
        }
        return null;
    }

    public List<Y0.h> getMarkers() {
        return this.f4804f;
    }

    public int getMaskAndMatteCount() {
        return this.f4813o;
    }

    public B getPerformanceTracker() {
        return this.f4799a;
    }

    public List<C1067e> getPrecomps(String str) {
        return (List) this.f4801c.get(str);
    }

    public float getProgressForFrame(float f8) {
        float f9 = this.f4809k;
        return (f8 - f9) / (this.f4810l - f9);
    }

    public float getStartFrame() {
        return this.f4809k;
    }

    public ArrayList<String> getWarnings() {
        HashSet hashSet = this.f4800b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    public boolean hasDashPattern() {
        return this.f4812n;
    }

    public boolean hasImages() {
        return !this.f4802d.isEmpty();
    }

    public void incrementMatteOrMaskCount(int i8) {
        this.f4813o += i8;
    }

    public void init(Rect rect, float f8, float f9, float f10, List<C1067e> list, O.e eVar, Map<String, List<C1067e>> map, Map<String, u> map2, O.i iVar, Map<String, Y0.c> map3, List<Y0.h> list2) {
        this.f4808j = rect;
        this.f4809k = f8;
        this.f4810l = f9;
        this.f4811m = f10;
        this.f4807i = list;
        this.f4806h = eVar;
        this.f4801c = map;
        this.f4802d = map2;
        this.f4805g = iVar;
        this.f4803e = map3;
        this.f4804f = list2;
    }

    public C1067e layerModelForId(long j8) {
        return (C1067e) this.f4806h.get(j8);
    }

    public void setHasDashPattern(boolean z8) {
        this.f4812n = z8;
    }

    public void setPerformanceTrackingEnabled(boolean z8) {
        this.f4799a.a(z8);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f4807i.iterator();
        while (it.hasNext()) {
            sb.append(((C1067e) it.next()).toString("\t"));
        }
        return sb.toString();
    }
}
