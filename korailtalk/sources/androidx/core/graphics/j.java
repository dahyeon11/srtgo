package androidx.core.graphics;

import Y.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f9007a = new ConcurrentHashMap();

    class a implements d {
        a() {
        }

        @Override // androidx.core.graphics.j.d
        public int getWeight(g.b bVar) {
            return bVar.getWeight();
        }

        @Override // androidx.core.graphics.j.d
        public boolean isItalic(g.b bVar) {
            return bVar.isItalic();
        }
    }

    class b implements d {
        b() {
        }

        @Override // androidx.core.graphics.j.d
        public int getWeight(e.d dVar) {
            return dVar.getWeight();
        }

        @Override // androidx.core.graphics.j.d
        public boolean isItalic(e.d dVar) {
            return dVar.isItalic();
        }
    }

    class c implements d {
        c() {
        }

        @Override // androidx.core.graphics.j.d
        public int getWeight(e.d dVar) {
            return dVar.getWeight();
        }

        @Override // androidx.core.graphics.j.d
        public boolean isItalic(e.d dVar) {
            return dVar.isItalic();
        }
    }

    private interface d {
        int getWeight(Object obj);

        boolean isItalic(Object obj);
    }

    j() {
    }

    private void a(Typeface typeface, e.c cVar) throws NoSuchFieldException, SecurityException {
        long jK = k(typeface);
        if (jK != 0) {
            this.f9007a.put(Long.valueOf(jK), cVar);
        }
    }

    private e.d e(e.c cVar, int i8) {
        return (e.d) g(cVar.getEntries(), i8, new b());
    }

    private e.d f(e.c cVar, int i8, boolean z8) {
        return (e.d) h(cVar.getEntries(), i8, z8, new c());
    }

    private static Object g(Object[] objArr, int i8, d dVar) {
        return h(objArr, (i8 & 1) == 0 ? 400 : 700, (i8 & 2) != 0, dVar);
    }

    private static Object h(Object[] objArr, int i8, boolean z8, d dVar) {
        Object obj = null;
        int i9 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(dVar.getWeight(obj2) - i8) * 2) + (dVar.isItalic(obj2) == z8 ? 0 : 1);
            if (obj == null || i9 > iAbs) {
                obj = obj2;
                i9 = iAbs;
            }
        }
        return obj;
    }

    private static long k(Typeface typeface) throws NoSuchFieldException, SecurityException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e8) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e8);
            return 0L;
        } catch (NoSuchFieldException e9) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e9);
            return 0L;
        }
    }

    Typeface b(Context context, e.c cVar, Resources resources, int i8, boolean z8) throws NoSuchFieldException, SecurityException {
        e.d dVarF = f(cVar, i8, z8);
        if (dVarF == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.d.createFromResourcesFontFile(context, resources, dVarF.getResourceId(), dVarF.getFileName(), 0, 0);
        a(typefaceCreateFromResourcesFontFile, cVar);
        return typefaceCreateFromResourcesFontFile;
    }

    protected Typeface c(Context context, InputStream inputStream) {
        File tempFile = k.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (k.copyToFile(tempFile, inputStream)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public Typeface createFromFontFamilyFilesResourceEntry(Context context, e.c cVar, Resources resources, int i8) throws NoSuchFieldException, SecurityException {
        e.d dVarE = e(cVar, i8);
        if (dVarE == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.d.createFromResourcesFontFile(context, resources, dVarE.getResourceId(), dVarE.getFileName(), 0, i8);
        a(typefaceCreateFromResourcesFontFile, cVar);
        return typefaceCreateFromResourcesFontFile;
    }

    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(i(bVarArr, i8).getUri());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceC = c(context, inputStreamOpenInputStream);
            k.closeQuietly(inputStreamOpenInputStream);
            return typefaceC;
        } catch (IOException unused2) {
            k.closeQuietly(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            k.closeQuietly(inputStream);
            throw th;
        }
    }

    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i8, String str, int i9) {
        File tempFile = k.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (k.copyToFile(tempFile, resources, i8)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    Typeface d(Context context, Typeface typeface, int i8, boolean z8) {
        Typeface typefaceA;
        try {
            typefaceA = l.a(this, context, typeface, i8, z8);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    protected g.b i(g.b[] bVarArr, int i8) {
        return (g.b) g(bVarArr, i8, new a());
    }

    e.c j(Typeface typeface) throws NoSuchFieldException, SecurityException {
        long jK = k(typeface);
        if (jK == 0) {
            return null;
        }
        return (e.c) this.f9007a.get(Long.valueOf(jK));
    }
}
