package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5034yt0 extends RuntimeException {
    public C5034yt0(String str) {
        super(str);
    }

    public static Object zza(InterfaceC4920xt0 interfaceC4920xt0) {
        try {
            return interfaceC4920xt0.zza();
        } catch (Exception e8) {
            throw new C5034yt0(e8);
        }
    }

    public C5034yt0(String str, Throwable th) {
        super(str, th);
    }

    public C5034yt0(Throwable th) {
        super(th);
    }
}
