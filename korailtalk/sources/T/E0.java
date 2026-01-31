package t;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* loaded from: classes.dex */
class E0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Size f36398d = new Size(1920, 1080);

    /* renamed from: e, reason: collision with root package name */
    private static final Object f36399e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile E0 f36400f;

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f36401a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Size f36402b = null;

    /* renamed from: c, reason: collision with root package name */
    private final x.h f36403c = new x.h();

    private E0(Context context) {
        this.f36401a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Point point = new Point();
        c().getRealSize(point);
        Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
        int width = size.getWidth() * size.getHeight();
        Size size2 = f36398d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f36403c.getMaxPreviewResolution(size);
    }

    static E0 b(Context context) {
        if (f36400f == null) {
            synchronized (f36399e) {
                try {
                    if (f36400f == null) {
                        f36400f = new E0(context);
                    }
                } finally {
                }
            }
        }
        return f36400f;
    }

    Display c() {
        Display[] displays = this.f36401a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i8 = -1;
        for (Display display2 : displays) {
            Point point = new Point();
            display2.getRealSize(point);
            int i9 = point.x;
            int i10 = point.y;
            if (i9 * i10 > i8) {
                display = display2;
                i8 = i9 * i10;
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    Size d() {
        if (this.f36402b != null) {
            return this.f36402b;
        }
        this.f36402b = a();
        return this.f36402b;
    }

    void e() {
        this.f36402b = a();
    }
}
