package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0920d {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    /* renamed from: androidx.core.app.d$a */
    private static class a extends AbstractC0920d {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityOptions f8709a;

        a(ActivityOptions activityOptions) {
            this.f8709a = activityOptions;
        }

        @Override // androidx.core.app.AbstractC0920d
        public Rect getLaunchBounds() {
            return C0128d.a(this.f8709a);
        }

        @Override // androidx.core.app.AbstractC0920d
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            c.c(this.f8709a, pendingIntent);
        }

        @Override // androidx.core.app.AbstractC0920d
        public AbstractC0920d setLaunchBounds(Rect rect) {
            return new a(C0128d.b(this.f8709a, rect));
        }

        @Override // androidx.core.app.AbstractC0920d
        public AbstractC0920d setShareIdentityEnabled(boolean z8) {
            return Build.VERSION.SDK_INT < 34 ? this : new a(e.a(this.f8709a, z8));
        }

        @Override // androidx.core.app.AbstractC0920d
        public Bundle toBundle() {
            return this.f8709a.toBundle();
        }

        @Override // androidx.core.app.AbstractC0920d
        public void update(AbstractC0920d abstractC0920d) {
            if (abstractC0920d instanceof a) {
                this.f8709a.update(((a) abstractC0920d).f8709a);
            }
        }
    }

    /* renamed from: androidx.core.app.d$b */
    static class b {
        static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* renamed from: androidx.core.app.d$c */
    static class c {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        static ActivityOptions b(View view, int i8, int i9, int i10, int i11) {
            return ActivityOptions.makeClipRevealAnimation(view, i8, i9, i10, i11);
        }

        static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    static class C0128d {
        static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* renamed from: androidx.core.app.d$e */
    static class e {
        static ActivityOptions a(ActivityOptions activityOptions, boolean z8) {
            return activityOptions.setShareIdentityEnabled(z8);
        }
    }

    protected AbstractC0920d() {
    }

    public static AbstractC0920d makeBasic() {
        return new a(c.a());
    }

    public static AbstractC0920d makeClipRevealAnimation(View view, int i8, int i9, int i10, int i11) {
        return new a(c.b(view, i8, i9, i10, i11));
    }

    public static AbstractC0920d makeCustomAnimation(Context context, int i8, int i9) {
        return new a(ActivityOptions.makeCustomAnimation(context, i8, i9));
    }

    public static AbstractC0920d makeScaleUpAnimation(View view, int i8, int i9, int i10, int i11) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i8, i9, i10, i11));
    }

    public static AbstractC0920d makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new a(b.a(activity, view, str));
    }

    public static AbstractC0920d makeTaskLaunchBehind() {
        return new a(b.c());
    }

    public static AbstractC0920d makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i8, int i9) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i8, i9));
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public AbstractC0920d setLaunchBounds(Rect rect) {
        return this;
    }

    public AbstractC0920d setShareIdentityEnabled(boolean z8) {
        return this;
    }

    public Bundle toBundle() {
        return null;
    }

    public void update(AbstractC0920d abstractC0920d) {
    }

    public static AbstractC0920d makeSceneTransitionAnimation(Activity activity, Z.d... dVarArr) {
        Pair[] pairArr;
        if (dVarArr != null) {
            pairArr = new Pair[dVarArr.length];
            for (int i8 = 0; i8 < dVarArr.length; i8++) {
                Z.d dVar = dVarArr[i8];
                pairArr[i8] = Pair.create((View) dVar.first, (String) dVar.second);
            }
        } else {
            pairArr = null;
        }
        return new a(b.b(activity, pairArr));
    }
}
