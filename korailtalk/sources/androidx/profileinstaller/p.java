package androidx.profileinstaller;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class p {
    public static final int MAX_SUPPORTED_SDK = 34;
    public static final int MIN_SUPPORTED_SDK = 24;

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f10170a = {48, 49, 53, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f10171b = {48, 49, 48, 0};

    /* renamed from: c, reason: collision with root package name */
    static final byte[] f10172c = {48, 48, 57, 0};

    /* renamed from: d, reason: collision with root package name */
    static final byte[] f10173d = {48, 48, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    static final byte[] f10174e = {48, 48, 49, 0};

    /* renamed from: f, reason: collision with root package name */
    static final byte[] f10175f = {48, 48, 49, 0};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f10176g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f10174e) || Arrays.equals(bArr, f10173d)) ? ":" : "!";
    }
}
