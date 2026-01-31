package X0;

import T0.C0784a;
import Y0.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import f1.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f5408d;

    /* renamed from: e, reason: collision with root package name */
    private C0784a f5409e;

    /* renamed from: a, reason: collision with root package name */
    private final i f5405a = new i();

    /* renamed from: b, reason: collision with root package name */
    private final Map f5406b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f5407c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private String f5410f = ".ttf";

    public a(Drawable.Callback callback, C0784a c0784a) {
        this.f5409e = c0784a;
        if (callback instanceof View) {
            this.f5408d = ((View) callback).getContext().getAssets();
        } else {
            f.warning("LottieDrawable must be inside of a view for images to work.");
            this.f5408d = null;
        }
    }

    private Typeface a(String str) {
        String fontPath;
        Typeface typeface = (Typeface) this.f5407c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C0784a c0784a = this.f5409e;
        Typeface typefaceFetchFont = c0784a != null ? c0784a.fetchFont(str) : null;
        C0784a c0784a2 = this.f5409e;
        if (c0784a2 != null && typefaceFetchFont == null && (fontPath = c0784a2.getFontPath(str)) != null) {
            typefaceFetchFont = Typeface.createFromAsset(this.f5408d, fontPath);
        }
        if (typefaceFetchFont == null) {
            typefaceFetchFont = Typeface.createFromAsset(this.f5408d, "fonts/" + str + this.f5410f);
        }
        this.f5407c.put(str, typefaceFetchFont);
        return typefaceFetchFont;
    }

    private Typeface b(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i8 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i8 ? typeface : Typeface.create(typeface, i8);
    }

    public Typeface getTypeface(String str, String str2) {
        this.f5405a.set(str, str2);
        Typeface typeface = (Typeface) this.f5406b.get(this.f5405a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceB = b(a(str), str2);
        this.f5406b.put(this.f5405a, typefaceB);
        return typefaceB;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f5410f = str;
    }

    public void setDelegate(C0784a c0784a) {
        this.f5409e = c0784a;
    }
}
