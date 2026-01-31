package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class x0 extends Resources {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f7310b = false;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f7311a;

    public x0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f7311a = new WeakReference(context);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return f7310b;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z8) {
        f7310b = z8;
    }

    public static boolean shouldBeUsed() {
        isCompatVectorFromResourcesEnabled();
        return false;
    }

    final Drawable a(int i8) {
        return super.getDrawable(i8);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i8) {
        Context context = (Context) this.f7311a.get();
        return context != null ? g0.get().o(context, this, i8) : super.getDrawable(i8);
    }
}
