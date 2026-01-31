package org.tensorflow.lite;

/* loaded from: classes3.dex */
public enum a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);


    /* renamed from: b, reason: collision with root package name */
    private static final a[] f34533b = values();

    /* renamed from: a, reason: collision with root package name */
    private final int f34535a;

    /* renamed from: org.tensorflow.lite.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0360a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34536a;

        static {
            int[] iArr = new int[a.values().length];
            f34536a = iArr;
            try {
                iArr[a.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34536a[a.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34536a[a.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34536a[a.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34536a[a.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34536a[a.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34536a[a.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34536a[a.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    a(int i8) {
        this.f34535a = i8;
    }

    public int byteSize() {
        switch (C0360a.f34536a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
            case 5:
                return 1;
            case 6:
                return 8;
            case 7:
            case 8:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
