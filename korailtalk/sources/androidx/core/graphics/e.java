package androidx.core.graphics;

import Y.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class e extends j {

    /* renamed from: b, reason: collision with root package name */
    private static Class f8991b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f8992c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f8993d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f8994e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f8995f = false;

    e() {
    }

    private static boolean l(Object obj, String str, int i8, boolean z8) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        o();
        try {
            return ((Boolean) f8993d.invoke(obj, str, Integer.valueOf(i8), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static Typeface m(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        o();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f8991b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f8994e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private File n(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void o() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f8995f) {
            return;
        }
        f8995f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f8992c = constructor;
        f8991b = cls;
        f8993d = method2;
        f8994e = method;
    }

    private static Object p() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        o();
        try {
            return f8992c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, e.c cVar, Resources resources, int i8) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objP = p();
        for (e.d dVar : cVar.getEntries()) {
            File tempFile = k.getTempFile(context);
            if (tempFile == null) {
                return null;
            }
            try {
                if (!k.copyToFile(tempFile, resources, dVar.getResourceId())) {
                    return null;
                }
                if (!l(objP, tempFile.getPath(), dVar.getWeight(), dVar.isItalic())) {
                    return null;
                }
                tempFile.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                tempFile.delete();
            }
        }
        return m(objP);
    }

    @Override // androidx.core.graphics.j
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) throws IOException {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File fileN = n(parcelFileDescriptorOpenFileDescriptor);
                if (fileN != null && fileN.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileN);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = super.c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
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
