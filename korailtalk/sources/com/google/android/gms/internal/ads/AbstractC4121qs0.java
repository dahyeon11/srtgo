package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qs0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC4121qs0 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f22025a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f22026b;

    static {
        int[] iArr = new int[EnumC3559lw0.values().length];
        f22026b = iArr;
        try {
            iArr[EnumC3559lw0.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22026b[EnumC3559lw0.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Tw0.values().length];
        f22025a = iArr2;
        try {
            iArr2[Tw0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22025a[Tw0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22025a[Tw0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22025a[Tw0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
