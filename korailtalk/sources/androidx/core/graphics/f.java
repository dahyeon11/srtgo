package androidx.core.graphics;

import Y.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
class f extends j {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f8996b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f8997c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f8998d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f8999e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            cls = null;
            method = null;
            method2 = null;
        }
        f8997c = constructor;
        f8996b = cls;
        f8998d = method2;
        f8999e = method;
    }

    f() {
    }

    public static boolean isUsable() {
        Method method = f8998d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static boolean l(Object obj, ByteBuffer byteBuffer, int i8, int i9, boolean z8) {
        try {
            return ((Boolean) f8998d.invoke(obj, byteBuffer, Integer.valueOf(i8), null, Integer.valueOf(i9), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface m(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f8996b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f8999e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object n() {
        try {
            return f8997c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, e.c cVar, Resources resources, int i8) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        for (e.d dVar : cVar.getEntries()) {
            ByteBuffer byteBufferCopyToDirectBuffer = k.copyToDirectBuffer(context, resources, dVar.getResourceId());
            if (byteBufferCopyToDirectBuffer == null || !l(objN, byteBufferCopyToDirectBuffer, dVar.getTtcIndex(), dVar.getWeight(), dVar.isItalic())) {
                return null;
            }
        }
        return m(objN);
    }

    @Override // androidx.core.graphics.j
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        O.h hVar = new O.h();
        for (g.b bVar : bVarArr) {
            Uri uri = bVar.getUri();
            ByteBuffer byteBufferMmap = (ByteBuffer) hVar.get(uri);
            if (byteBufferMmap == null) {
                byteBufferMmap = k.mmap(context, cancellationSignal, uri);
                hVar.put(uri, byteBufferMmap);
            }
            if (byteBufferMmap == null || !l(objN, byteBufferMmap, bVar.getTtcIndex(), bVar.getWeight(), bVar.isItalic())) {
                return null;
            }
        }
        Typeface typefaceM = m(objN);
        if (typefaceM == null) {
            return null;
        }
        return Typeface.create(typefaceM, i8);
    }

    @Override // androidx.core.graphics.j
    Typeface d(Context context, Typeface typeface, int i8, boolean z8) {
        Typeface typefaceB;
        try {
            typefaceB = m.b(typeface, i8, z8);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.d(context, typeface, i8, z8) : typefaceB;
    }
}
