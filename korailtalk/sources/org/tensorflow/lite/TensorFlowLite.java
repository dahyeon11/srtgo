package org.tensorflow.lite;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.f;

/* loaded from: classes3.dex */
public abstract class TensorFlowLite {

    /* renamed from: b, reason: collision with root package name */
    private static final String[][] f34520b;

    /* renamed from: c, reason: collision with root package name */
    private static final Throwable f34521c;

    /* renamed from: e, reason: collision with root package name */
    private static AtomicBoolean[] f34523e;

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f34519a = Logger.getLogger(f.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f34522d = false;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final g f34524a;

        /* renamed from: b, reason: collision with root package name */
        private final Exception f34525b;

        public a(String str, String str2) throws NoSuchMethodException, SecurityException {
            g gVar;
            Exception e8 = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(str + ".InterpreterFactoryImpl").getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                gVar = (g) declaredConstructor.newInstance(null);
                try {
                    if (gVar != null) {
                        TensorFlowLite.f34519a.info(String.format("Found %s TF Lite runtime client in %s", str2, str));
                    } else {
                        TensorFlowLite.f34519a.warning(String.format("Failed to construct TF Lite runtime client from %s", str));
                    }
                } catch (Exception e9) {
                    e8 = e9;
                    TensorFlowLite.f34519a.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.f34525b = e8;
                    this.f34524a = gVar;
                }
            } catch (Exception e10) {
                gVar = null;
                e8 = e10;
            }
            this.f34525b = e8;
            this.f34524a = gVar;
        }

        public Exception getException() {
            return this.f34525b;
        }

        public g getFactory() {
            return this.f34524a;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f34526a = new a("org.tensorflow.lite", "application");
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        static final a f34527a = new a("com.google.android.gms.tflite", "system");
    }

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        f34520b = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            for (String str : strArr2) {
                try {
                    System.loadLibrary(str);
                    f34519a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e8) {
                    f34519a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e8;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e8);
                    }
                }
            }
        }
        f34521c = unsatisfiedLinkError;
        f34523e = new AtomicBoolean[f.a.EnumC0361a.values().length];
        for (int i8 = 0; i8 < f.a.EnumC0361a.values().length; i8++) {
            f34523e[i8] = new AtomicBoolean();
        }
    }

    static g b(f.a.EnumC0361a enumC0361a) {
        return c(enumC0361a, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    static g c(f.a.EnumC0361a enumC0361a, String str, String str2) {
        Exception exception;
        if (enumC0361a == null) {
            enumC0361a = f.a.EnumC0361a.FROM_APPLICATION_ONLY;
        }
        f.a.EnumC0361a enumC0361a2 = f.a.EnumC0361a.PREFER_SYSTEM_OVER_APPLICATION;
        if (enumC0361a == enumC0361a2 || enumC0361a == f.a.EnumC0361a.FROM_SYSTEM_ONLY) {
            a aVar = c.f34527a;
            if (aVar.getFactory() != null) {
                if (!f34523e[enumC0361a.ordinal()].getAndSet(true)) {
                    f34519a.info(String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", enumC0361a.name()));
                }
                return aVar.getFactory();
            }
            exception = aVar.getException();
        } else {
            exception = null;
        }
        if (enumC0361a == enumC0361a2 || enumC0361a == f.a.EnumC0361a.FROM_APPLICATION_ONLY) {
            a aVar2 = b.f34526a;
            if (aVar2.getFactory() != null) {
                if (!f34523e[enumC0361a.ordinal()].getAndSet(true)) {
                    f34519a.info(String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", enumC0361a.name()));
                }
                return aVar2.getFactory();
            }
            if (exception == null) {
                exception = aVar2.getException();
            } else if (exception.getSuppressed().length == 0) {
                exception.addSuppressed(aVar2.getException());
            }
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. " + (enumC0361a != f.a.EnumC0361a.FROM_APPLICATION_ONLY ? enumC0361a == f.a.EnumC0361a.FROM_SYSTEM_ONLY ? String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", str2, str, str2) : "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", str2, str, str2)), exception);
    }

    public static void init() {
        if (f34522d) {
            return;
        }
        try {
            nativeDoNothing();
            f34522d = true;
        } catch (UnsatisfiedLinkError e8) {
            Throwable th = f34521c;
            if (th == null) {
                th = e8;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
            unsatisfiedLinkError.initCause(e8);
            throw unsatisfiedLinkError;
        }
    }

    private static native void nativeDoNothing();

    public static String runtimeVersion(f.a.EnumC0361a enumC0361a) {
        return c(enumC0361a, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").runtimeVersion();
    }

    public static String schemaVersion(f.a.EnumC0361a enumC0361a) {
        return c(enumC0361a, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").schemaVersion();
    }

    @Deprecated
    public static String version() {
        return schemaVersion();
    }

    public static String runtimeVersion() {
        return runtimeVersion(null);
    }

    public static String schemaVersion() {
        return schemaVersion(null);
    }
}
