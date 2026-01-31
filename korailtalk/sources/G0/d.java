package G0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f1354a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1355b;

    /* renamed from: c, reason: collision with root package name */
    private int f1356c;

    public d(int i8, List<String> list, int i9) {
        ArrayList arrayList = new ArrayList();
        this.f1355b = arrayList;
        this.f1354a = i8;
        arrayList.addAll(list);
        this.f1356c = i9;
    }

    public List<String> getCustomIncludedCategories() {
        return this.f1355b;
    }

    public int getPredefinedCategories() {
        return this.f1354a;
    }

    public int getTracingMode() {
        return this.f1356c;
    }
}
