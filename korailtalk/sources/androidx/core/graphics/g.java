package androidx.core.graphics;

import Y.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f9000g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f9001h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f9002i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f9003j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f9004k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f9005l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f9006m;

    public g() {
        Class clsZ;
        Constructor constructorA;
        Method methodW;
        Method methodX;
        Method methodB;
        Method methodV;
        Method methodY;
        try {
            clsZ = z();
            constructorA = A(clsZ);
            methodW = w(clsZ);
            methodX = x(clsZ);
            methodB = B(clsZ);
            methodV = v(clsZ);
            methodY = y(clsZ);
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e8.getClass().getName(), e8);
            clsZ = null;
            constructorA = null;
            methodW = null;
            methodX = null;
            methodB = null;
            methodV = null;
            methodY = null;
        }
        this.f9000g = clsZ;
        this.f9001h = constructorA;
        this.f9002i = methodW;
        this.f9003j = methodX;
        this.f9004k = methodB;
        this.f9005l = methodV;
        this.f9006m = methodY;
    }

    private Object p() {
        try {
            return this.f9001h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void q(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f9005l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean r(Context context, Object obj, String str, int i8, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9002i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj, ByteBuffer byteBuffer, int i8, int i9, int i10) {
        try {
            return ((Boolean) this.f9003j.invoke(obj, byteBuffer, Integer.valueOf(i8), null, Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t(Object obj) {
        try {
            return ((Boolean) this.f9004k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean u() {
        if (this.f9002i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f9002i != null;
    }

    protected Constructor A(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method B(Class cls) {
        return cls.getMethod("freeze", null);
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, e.c cVar, Resources resources, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!u()) {
            return super.createFromFontFamilyFilesResourceEntry(context, cVar, resources, i8);
        }
        Object objP = p();
        if (objP == null) {
            return null;
        }
        for (e.d dVar : cVar.getEntries()) {
            if (!r(context, objP, dVar.getFileName(), dVar.getTtcIndex(), dVar.getWeight(), dVar.isItalic() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.getVariationSettings()))) {
                q(objP);
                return null;
            }
        }
        if (t(objP)) {
            return m(objP);
        }
        return null;
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceM;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!u()) {
            g.b bVarI = i(bVarArr, i8);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarI.getUri(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarI.getWeight()).setItalic(bVarI.isItalic()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> fontInfoIntoByteBuffer = k.readFontInfoIntoByteBuffer(context, bVarArr, cancellationSignal);
        Object objP = p();
        if (objP == null) {
            return null;
        }
        boolean z8 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = fontInfoIntoByteBuffer.get(bVar.getUri());
            if (byteBuffer != null) {
                if (!s(objP, byteBuffer, bVar.getTtcIndex(), bVar.getWeight(), bVar.isItalic() ? 1 : 0)) {
                    q(objP);
                    return null;
                }
                z8 = true;
            }
        }
        if (!z8) {
            q(objP);
            return null;
        }
        if (t(objP) && (typefaceM = m(objP)) != null) {
            return Typeface.create(typefaceM, i8);
        }
        return null;
    }

    @Override // androidx.core.graphics.j
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i8, String str, int i9) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!u()) {
            return super.createFromResourcesFontFile(context, resources, i8, str, i9);
        }
        Object objP = p();
        if (objP == null) {
            return null;
        }
        if (!r(context, objP, str, 0, -1, -1, null)) {
            q(objP);
            return null;
        }
        if (t(objP)) {
            return m(objP);
        }
        return null;
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    Typeface d(Context context, Typeface typeface, int i8, boolean z8) {
        Typeface typefaceB;
        try {
            typefaceB = n.b(typeface, i8, z8);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.d(context, typeface, i8, z8) : typefaceB;
    }

    protected Typeface m(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f9000g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f9006m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method v(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method w(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method x(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method y(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class z() {
        return Class.forName("android.graphics.FontFamily");
    }
}
