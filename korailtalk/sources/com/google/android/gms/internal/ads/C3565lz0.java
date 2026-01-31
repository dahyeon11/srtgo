package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3565lz0 extends IOException {
    public final int zza;

    public C3565lz0(int i8) {
        this.zza = i8;
    }

    public C3565lz0(String str, int i8) {
        super(str);
        this.zza = i8;
    }

    public C3565lz0(String str, Throwable th, int i8) {
        super(str, th);
        this.zza = i8;
    }

    public C3565lz0(Throwable th, int i8) {
        super(th);
        this.zza = i8;
    }
}
