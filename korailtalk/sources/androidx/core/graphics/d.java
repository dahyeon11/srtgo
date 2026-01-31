package androidx.core.graphics;

import Y.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a */
    private static final j f8985a;

    /* renamed from: b */
    private static final O.f f8986b;

    public static class a extends g.c {

        /* renamed from: a */
        private h.f f8987a;

        public a(h.f fVar) {
            this.f8987a = fVar;
        }

        @Override // Y.g.c
        public void onTypefaceRequestFailed(int i8) {
            h.f fVar = this.f8987a;
            if (fVar != null) {
                fVar.c(i8);
            }
        }

        @Override // Y.g.c
        public void onTypefaceRetrieved(Typeface typeface) {
            h.f fVar = this.f8987a;
            if (fVar != null) {
                fVar.d(typeface);
            }
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            f8985a = new i();
        } else if (i8 >= 28) {
            f8985a = new h();
        } else if (i8 >= 26) {
            f8985a = new g();
        } else if (f.isUsable()) {
            f8985a = new f();
        } else {
            f8985a = new e();
        }
        f8986b = new O.f(16);
    }

    private static String a(Resources resources, int i8, String str, int i9, int i10) {
        return resources.getResourcePackageName(i8) + '-' + str + '-' + i9 + '-' + i8 + '-' + i10;
    }

    private static Typeface b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    public static void clearCache() {
        f8986b.evictAll();
    }

    public static Typeface create(Context context, Typeface typeface, int i8) {
        if (context != null) {
            return Typeface.create(typeface, i8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) {
        return f8985a.createFromFontInfo(context, cancellationSignal, bVarArr, i8);
    }

    public static Typeface createFromResourcesFamilyXml(Context context, e.b bVar, Resources resources, int i8, String str, int i9, int i10, h.f fVar, Handler handler, boolean z8) {
        Typeface typefaceCreateFromFontFamilyFilesResourceEntry;
        if (bVar instanceof e.C0134e) {
            e.C0134e c0134e = (e.C0134e) bVar;
            Typeface typefaceB = b(c0134e.getSystemFontFamilyName());
            if (typefaceB != null) {
                if (fVar != null) {
                    fVar.callbackSuccessAsync(typefaceB, handler);
                }
                return typefaceB;
            }
            typefaceCreateFromFontFamilyFilesResourceEntry = Y.g.requestFont(context, c0134e.getRequest(), i10, !z8 ? fVar != null : c0134e.getFetchStrategy() != 0, z8 ? c0134e.getTimeout() : -1, h.f.getHandler(handler), new a(fVar));
        } else {
            typefaceCreateFromFontFamilyFilesResourceEntry = f8985a.createFromFontFamilyFilesResourceEntry(context, (e.c) bVar, resources, i10);
            if (fVar != null) {
                if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
                    fVar.callbackSuccessAsync(typefaceCreateFromFontFamilyFilesResourceEntry, handler);
                } else {
                    fVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceCreateFromFontFamilyFilesResourceEntry != null) {
            f8986b.put(a(resources, i8, str, i9, i10), typefaceCreateFromFontFamilyFilesResourceEntry);
        }
        return typefaceCreateFromFontFamilyFilesResourceEntry;
    }

    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i8, String str, int i9, int i10) {
        Typeface typefaceCreateFromResourcesFontFile = f8985a.createFromResourcesFontFile(context, resources, i8, str, i10);
        if (typefaceCreateFromResourcesFontFile != null) {
            f8986b.put(a(resources, i8, str, i9, i10), typefaceCreateFromResourcesFontFile);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    public static Typeface findFromCache(Resources resources, int i8, String str, int i9, int i10) {
        return (Typeface) f8986b.get(a(resources, i8, str, i9, i10));
    }

    @Deprecated
    public static Typeface findFromCache(Resources resources, int i8, int i9) {
        return findFromCache(resources, i8, null, 0, i9);
    }

    public static Typeface create(Context context, Typeface typeface, int i8, boolean z8) {
        if (context != null) {
            Z.h.checkArgumentInRange(i8, 1, 1000, "weight");
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f8985a.d(context, typeface, i8, z8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Deprecated
    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i8, String str, int i9) {
        return createFromResourcesFontFile(context, resources, i8, str, 0, i9);
    }

    @Deprecated
    public static Typeface createFromResourcesFamilyXml(Context context, e.b bVar, Resources resources, int i8, int i9, h.f fVar, Handler handler, boolean z8) {
        return createFromResourcesFamilyXml(context, bVar, resources, i8, null, 0, i9, fVar, handler, z8);
    }
}
