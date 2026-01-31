package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.x0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import l.AbstractC5876b;

/* loaded from: classes.dex */
public abstract class g {
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;

    /* renamed from: a */
    private static int f6319a = -100;

    /* renamed from: b */
    private static final O.b f6320b = new O.b();

    /* renamed from: c */
    private static final Object f6321c = new Object();

    g() {
    }

    static void a(g gVar) {
        synchronized (f6321c) {
            d(gVar);
            f6320b.add(new WeakReference(gVar));
        }
    }

    private static void b() {
        synchronized (f6321c) {
            try {
                Iterator<Object> it = f6320b.iterator();
                while (it.hasNext()) {
                    g gVar = (g) ((WeakReference) it.next()).get();
                    if (gVar != null) {
                        gVar.applyDayNight();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void c(g gVar) {
        synchronized (f6321c) {
            d(gVar);
        }
    }

    public static g create(Activity activity, f fVar) {
        return new h(activity, fVar);
    }

    private static void d(g gVar) {
        synchronized (f6321c) {
            try {
                Iterator<Object> it = f6320b.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int getDefaultNightMode() {
        return f6319a;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return x0.isCompatVectorFromResourcesEnabled();
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z8) {
        x0.setCompatVectorFromResourcesEnabled(z8);
    }

    public static void setDefaultNightMode(int i8) {
        if ((i8 == -1 || i8 == 0 || i8 == 1 || i8 == 2 || i8 == 3) && f6319a != i8) {
            f6319a = i8;
            b();
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i8);

    public abstract b getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract a getSupportActionBar();

    public abstract boolean hasWindowFeature(int i8);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i8);

    public abstract void setContentView(int i8);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z8);

    public abstract void setLocalNightMode(int i8);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public void setTheme(int i8) {
    }

    public abstract void setTitle(CharSequence charSequence);

    public abstract AbstractC5876b startSupportActionMode(AbstractC5876b.a aVar);

    public static g create(Dialog dialog, f fVar) {
        return new h(dialog, fVar);
    }

    public static g create(Context context, Window window, f fVar) {
        return new h(context, window, fVar);
    }

    public static g create(Context context, Activity activity, f fVar) {
        return new h(context, activity, fVar);
    }
}
