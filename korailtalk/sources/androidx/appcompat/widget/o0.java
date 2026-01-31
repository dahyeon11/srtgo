package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7213c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f7214d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f7215a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f7216b;

    private o0(Context context) {
        super(context);
        if (!x0.shouldBeUsed()) {
            this.f7215a = new q0(this, context.getResources());
            this.f7216b = null;
            return;
        }
        x0 x0Var = new x0(this, context.getResources());
        this.f7215a = x0Var;
        Resources.Theme themeNewTheme = x0Var.newTheme();
        this.f7216b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof o0) || (context.getResources() instanceof q0) || (context.getResources() instanceof x0)) {
            return false;
        }
        return x0.shouldBeUsed();
    }

    public static Context wrap(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f7213c) {
            try {
                ArrayList arrayList = f7214d;
                if (arrayList == null) {
                    f7214d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f7214d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f7214d.remove(size);
                        }
                    }
                    for (int size2 = f7214d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f7214d.get(size2);
                        o0 o0Var = weakReference2 != null ? (o0) weakReference2.get() : null;
                        if (o0Var != null && o0Var.getBaseContext() == context) {
                            return o0Var;
                        }
                    }
                }
                o0 o0Var2 = new o0(context);
                f7214d.add(new WeakReference(o0Var2));
                return o0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f7215a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f7215a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7216b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        Resources.Theme theme = this.f7216b;
        if (theme == null) {
            super.setTheme(i8);
        } else {
            theme.applyStyle(i8, true);
        }
    }
}
