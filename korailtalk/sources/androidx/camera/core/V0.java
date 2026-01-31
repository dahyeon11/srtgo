package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
final class V0 extends L {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0897p0 f7555c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f7556d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7557e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7558f;

    V0(InterfaceC0902s0 interfaceC0902s0, InterfaceC0897p0 interfaceC0897p0) {
        this(interfaceC0902s0, null, interfaceC0897p0);
    }

    @Override // androidx.camera.core.L, androidx.camera.core.InterfaceC0902s0
    public synchronized Rect getCropRect() {
        if (this.f7556d == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        return new Rect(this.f7556d);
    }

    @Override // androidx.camera.core.L, androidx.camera.core.InterfaceC0902s0
    public synchronized int getHeight() {
        return this.f7558f;
    }

    @Override // androidx.camera.core.L, androidx.camera.core.InterfaceC0902s0
    public InterfaceC0897p0 getImageInfo() {
        return this.f7555c;
    }

    @Override // androidx.camera.core.L, androidx.camera.core.InterfaceC0902s0
    public synchronized int getWidth() {
        return this.f7557e;
    }

    @Override // androidx.camera.core.L, androidx.camera.core.InterfaceC0902s0
    public synchronized void setCropRect(Rect rect) {
        if (rect != null) {
            try {
                Rect rect2 = new Rect(rect);
                if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                    rect2.setEmpty();
                }
                rect = rect2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7556d = rect;
    }

    V0(InterfaceC0902s0 interfaceC0902s0, Size size, InterfaceC0897p0 interfaceC0897p0) {
        super(interfaceC0902s0);
        if (size == null) {
            this.f7557e = super.getWidth();
            this.f7558f = super.getHeight();
        } else {
            this.f7557e = size.getWidth();
            this.f7558f = size.getHeight();
        }
        this.f7555c = interfaceC0897p0;
    }
}
