package org.tensorflow.lite;

/* loaded from: classes3.dex */
abstract class b {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34537a;

        static {
            int[] iArr = new int[org.tensorflow.lite.a.values().length];
            f34537a = iArr;
            try {
                iArr[org.tensorflow.lite.a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34537a[org.tensorflow.lite.a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34537a[org.tensorflow.lite.a.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34537a[org.tensorflow.lite.a.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34537a[org.tensorflow.lite.a.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34537a[org.tensorflow.lite.a.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34537a[org.tensorflow.lite.a.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34537a[org.tensorflow.lite.a.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static org.tensorflow.lite.a a(int i8) {
        switch (i8) {
            case 1:
                return org.tensorflow.lite.a.FLOAT32;
            case 2:
                return org.tensorflow.lite.a.INT32;
            case 3:
                return org.tensorflow.lite.a.UINT8;
            case 4:
                return org.tensorflow.lite.a.INT64;
            case 5:
                return org.tensorflow.lite.a.STRING;
            case 6:
                return org.tensorflow.lite.a.BOOL;
            case 7:
                return org.tensorflow.lite.a.INT16;
            case 8:
            default:
                throw new IllegalArgumentException("DataType error: DataType " + i8 + " is not recognized in Java.");
            case 9:
                return org.tensorflow.lite.a.INT8;
        }
    }

    static String b(org.tensorflow.lite.a aVar) {
        switch (a.f34537a[aVar.ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return "long";
            case 7:
                return "bool";
            case 8:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + aVar + " is not supported yet");
        }
    }
}
