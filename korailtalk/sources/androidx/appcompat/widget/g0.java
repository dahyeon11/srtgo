package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k.AbstractC5836a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: i, reason: collision with root package name */
    private static g0 f7116i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f7118a;

    /* renamed from: b, reason: collision with root package name */
    private O.h f7119b;

    /* renamed from: c, reason: collision with root package name */
    private O.i f7120c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f7121d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f7122e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7123f;

    /* renamed from: g, reason: collision with root package name */
    private c f7124g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f7115h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final a f7117j = new a(6);

    private static class a extends O.f {
        public a(int i8) {
            super(i8);
        }

        private static int e(int i8, PorterDuff.Mode mode) {
            return ((i8 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter f(int i8, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(e(i8, mode)));
        }

        PorterDuffColorFilter g(int i8, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(e(i8, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable createDrawableFor(g0 g0Var, Context context, int i8);

        ColorStateList getTintListForDrawableRes(Context context, int i8);

        PorterDuff.Mode getTintModeForDrawableRes(int i8);

        boolean tintDrawable(Context context, int i8, Drawable drawable);

        boolean tintDrawableUsingColorFilter(Context context, int i8, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            O.e eVar = (O.e) this.f7121d.get(context);
            if (eVar == null) {
                eVar = new O.e();
                this.f7121d.put(context, eVar);
            }
            eVar.put(j8, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i8, ColorStateList colorStateList) {
        if (this.f7118a == null) {
            this.f7118a = new WeakHashMap();
        }
        O.i iVar = (O.i) this.f7118a.get(context);
        if (iVar == null) {
            iVar = new O.i();
            this.f7118a.put(context, iVar);
        }
        iVar.append(i8, colorStateList);
    }

    private void c(Context context) {
        if (this.f7123f) {
            return;
        }
        this.f7123f = true;
        Drawable drawable = getDrawable(context, AbstractC5836a.abc_vector_test);
        if (drawable == null || !m(drawable)) {
            this.f7123f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i8) throws Resources.NotFoundException {
        if (this.f7122e == null) {
            this.f7122e = new TypedValue();
        }
        TypedValue typedValue = this.f7122e;
        context.getResources().getValue(i8, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableG = g(context, jD);
        if (drawableG != null) {
            return drawableG;
        }
        c cVar = this.f7124g;
        Drawable drawableCreateDrawableFor = cVar == null ? null : cVar.createDrawableFor(this, context, i8);
        if (drawableCreateDrawableFor != null) {
            drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableCreateDrawableFor);
        }
        return drawableCreateDrawableFor;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    private synchronized Drawable g(Context context, long j8) {
        O.e eVar = (O.e) this.f7121d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.get(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.remove(j8);
        }
        return null;
    }

    public static synchronized g0 get() {
        try {
            if (f7116i == null) {
                g0 g0Var = new g0();
                f7116i = g0Var;
                l(g0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7116i;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        a aVar = f7117j;
        porterDuffColorFilterF = aVar.f(i8, mode);
        if (porterDuffColorFilterF == null) {
            porterDuffColorFilterF = new PorterDuffColorFilter(i8, mode);
            aVar.g(i8, mode, porterDuffColorFilterF);
        }
        return porterDuffColorFilterF;
    }

    private ColorStateList j(Context context, int i8) {
        O.i iVar;
        WeakHashMap weakHashMap = this.f7118a;
        if (weakHashMap == null || (iVar = (O.i) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) iVar.get(i8);
    }

    private static void l(g0 g0Var) {
    }

    private static boolean m(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.c) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable n(Context context, int i8) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        O.h hVar = this.f7119b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        O.i iVar = this.f7120c;
        if (iVar != null) {
            String str = (String) iVar.get(i8);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f7119b.get(str) == null)) {
                return null;
            }
        } else {
            this.f7120c = new O.i();
        }
        if (this.f7122e == null) {
            this.f7122e = new TypedValue();
        }
        TypedValue typedValue = this.f7122e;
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableG = g(context, jD);
        if (drawableG != null) {
            return drawableG;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i8);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f7120c.append(i8, name);
                b bVar = (b) this.f7119b.get(name);
                if (bVar != null) {
                    drawableG = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableG != null) {
                    drawableG.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableG);
                }
            } catch (Exception e8) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e8);
            }
        }
        if (drawableG == null) {
            this.f7120c.append(i8, "appcompat_skip_skip");
        }
        return drawableG;
    }

    private Drawable p(Context context, int i8, boolean z8, Drawable drawable) {
        ColorStateList colorStateListI = i(context, i8);
        if (colorStateListI == null) {
            c cVar = this.f7124g;
            if ((cVar == null || !cVar.tintDrawable(context, i8, drawable)) && !r(context, i8, drawable) && z8) {
                return null;
            }
            return drawable;
        }
        if (W.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableWrap = androidx.core.graphics.drawable.a.wrap(drawable);
        androidx.core.graphics.drawable.a.setTintList(drawableWrap, colorStateListI);
        PorterDuff.Mode modeK = k(i8);
        if (modeK == null) {
            return drawableWrap;
        }
        androidx.core.graphics.drawable.a.setTintMode(drawableWrap, modeK);
        return drawableWrap;
    }

    static void q(Drawable drawable, p0 p0Var, int[] iArr) {
        if (!W.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            boolean z8 = p0Var.mHasTintList;
            if (z8 || p0Var.mHasTintMode) {
                drawable.setColorFilter(f(z8 ? p0Var.mTintList : null, p0Var.mHasTintMode ? p0Var.mTintMode : f7115h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public synchronized Drawable getDrawable(Context context, int i8) {
        return h(context, i8, false);
    }

    synchronized Drawable h(Context context, int i8, boolean z8) {
        Drawable drawableN;
        try {
            c(context);
            drawableN = n(context, i8);
            if (drawableN == null) {
                drawableN = e(context, i8);
            }
            if (drawableN == null) {
                drawableN = androidx.core.content.a.getDrawable(context, i8);
            }
            if (drawableN != null) {
                drawableN = p(context, i8, z8, drawableN);
            }
            if (drawableN != null) {
                W.a(drawableN);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableN;
    }

    synchronized ColorStateList i(Context context, int i8) {
        ColorStateList colorStateListJ;
        colorStateListJ = j(context, i8);
        if (colorStateListJ == null) {
            c cVar = this.f7124g;
            colorStateListJ = cVar == null ? null : cVar.getTintListForDrawableRes(context, i8);
            if (colorStateListJ != null) {
                b(context, i8, colorStateListJ);
            }
        }
        return colorStateListJ;
    }

    PorterDuff.Mode k(int i8) {
        c cVar = this.f7124g;
        if (cVar == null) {
            return null;
        }
        return cVar.getTintModeForDrawableRes(i8);
    }

    synchronized Drawable o(Context context, x0 x0Var, int i8) {
        try {
            Drawable drawableN = n(context, i8);
            if (drawableN == null) {
                drawableN = x0Var.a(i8);
            }
            if (drawableN == null) {
                return null;
            }
            return p(context, i8, false, drawableN);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onConfigurationChanged(Context context) {
        O.e eVar = (O.e) this.f7121d.get(context);
        if (eVar != null) {
            eVar.clear();
        }
    }

    boolean r(Context context, int i8, Drawable drawable) {
        c cVar = this.f7124g;
        return cVar != null && cVar.tintDrawableUsingColorFilter(context, i8, drawable);
    }

    public synchronized void setHooks(c cVar) {
        this.f7124g = cVar;
    }
}
