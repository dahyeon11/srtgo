package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3368kE0 extends C3254jE0 {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public C3368kE0(int i8, String str, IOException iOException, Map map, NB0 nb0, byte[] bArr) {
        super("Response code: " + i8, iOException, nb0, 2004, 1);
        this.zzd = i8;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
