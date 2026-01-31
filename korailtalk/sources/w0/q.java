package W0;

import g1.C5534a;
import g1.C5536c;
import java.util.Collections;

/* loaded from: classes.dex */
public class q extends a {

    /* renamed from: i, reason: collision with root package name */
    private final Object f5301i;

    public q(C5536c c5536c) {
        this(c5536c, null);
    }

    @Override // W0.a
    float b() {
        return 1.0f;
    }

    @Override // W0.a
    public Object getValue() {
        C5536c c5536c = this.f5243e;
        Object obj = this.f5301i;
        return c5536c.getValueInternal(0.0f, 0.0f, obj, obj, getProgress(), getProgress(), getProgress());
    }

    @Override // W0.a
    public void notifyListeners() {
        if (this.f5243e != null) {
            super.notifyListeners();
        }
    }

    @Override // W0.a
    public void setProgress(float f8) {
        this.f5242d = f8;
    }

    public q(C5536c c5536c, Object obj) {
        super(Collections.emptyList());
        setValueCallback(c5536c);
        this.f5301i = obj;
    }

    @Override // W0.a
    Object getValue(C5534a c5534a, float f8) {
        return getValue();
    }
}
