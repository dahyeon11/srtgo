package Y0;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5567b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5568c;

    /* renamed from: d, reason: collision with root package name */
    private final float f5569d;

    /* renamed from: e, reason: collision with root package name */
    private Typeface f5570e;

    public c(String str, String str2, String str3, float f8) {
        this.f5566a = str;
        this.f5567b = str2;
        this.f5568c = str3;
        this.f5569d = f8;
    }

    public String getFamily() {
        return this.f5566a;
    }

    public String getName() {
        return this.f5567b;
    }

    public String getStyle() {
        return this.f5568c;
    }

    public Typeface getTypeface() {
        return this.f5570e;
    }

    public void setTypeface(Typeface typeface) {
        this.f5570e = typeface;
    }
}
