package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.g1;
import com.google.common.util.concurrent.C;

/* loaded from: classes.dex */
abstract class l {

    /* renamed from: a, reason: collision with root package name */
    Size f7992a;

    /* renamed from: b, reason: collision with root package name */
    FrameLayout f7993b;

    /* renamed from: c, reason: collision with root package name */
    private final f f7994c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7995d = false;

    interface a {
        void onSurfaceNotInUse();
    }

    l(FrameLayout frameLayout, f fVar) {
        this.f7993b = frameLayout;
        this.f7994c = fVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f7994c.a(bitmapC, new Size(this.f7993b.getWidth(), this.f7993b.getHeight()), this.f7993b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f7995d = true;
        h();
    }

    abstract void g(g1 g1Var, a aVar);

    void h() {
        View viewB = b();
        if (viewB == null || !this.f7995d) {
            return;
        }
        this.f7994c.p(new Size(this.f7993b.getWidth(), this.f7993b.getHeight()), this.f7993b.getLayoutDirection(), viewB);
    }

    abstract C i();
}
