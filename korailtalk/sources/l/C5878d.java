package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import h.AbstractC5571i;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5878d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f33834a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f33835b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f33836c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f33837d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f33838e;

    public C5878d() {
        super(null);
    }

    private Resources a() {
        if (this.f33838e == null) {
            Configuration configuration = this.f33837d;
            if (configuration == null) {
                this.f33838e = super.getResources();
            } else {
                this.f33838e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f33838e;
    }

    private void b() {
        boolean z8 = this.f33835b == null;
        if (z8) {
            this.f33835b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f33835b.setTo(theme);
            }
        }
        c(this.f33835b, this.f33834a, z8);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.f33838e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f33837d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f33837d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    protected void c(Resources.Theme theme, int i8, boolean z8) {
        theme.applyStyle(i8, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f33836c == null) {
            this.f33836c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f33836c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f33835b;
        if (theme != null) {
            return theme;
        }
        if (this.f33834a == 0) {
            this.f33834a = AbstractC5571i.Theme_AppCompat_Light;
        }
        b();
        return this.f33835b;
    }

    public int getThemeResId() {
        return this.f33834a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        if (this.f33834a != i8) {
            this.f33834a = i8;
            b();
        }
    }

    public C5878d(Context context, int i8) {
        super(context);
        this.f33834a = i8;
    }

    public C5878d(Context context, Resources.Theme theme) {
        super(context);
        this.f33835b = theme;
    }
}
