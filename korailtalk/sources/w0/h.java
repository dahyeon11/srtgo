package W0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final List f5263a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5264b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5265c;

    public h(List<a1.h> list) {
        this.f5265c = list;
        this.f5263a = new ArrayList(list.size());
        this.f5264b = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f5263a.add(list.get(i8).getMaskPath().createAnimation());
            this.f5264b.add(list.get(i8).getOpacity().createAnimation());
        }
    }

    public List<a> getMaskAnimations() {
        return this.f5263a;
    }

    public List<a1.h> getMasks() {
        return this.f5265c;
    }

    public List<a> getOpacityAnimations() {
        return this.f5264b;
    }
}
