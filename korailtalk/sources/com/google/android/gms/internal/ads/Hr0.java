package com.google.android.gms.internal.ads;

import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public abstract class Hr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f13366a = new Gr0();
    public static final /* synthetic */ int zza = 0;

    public static Cipher zza() {
        return (Cipher) f13366a.get();
    }
}
