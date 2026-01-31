package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.jE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3254jE0 extends C3565lz0 {
    public final NB0 zzb;
    public final int zzc;

    public C3254jE0(NB0 nb0, int i8, int i9) {
        super(a(2008, 1));
        this.zzb = nb0;
        this.zzc = 1;
    }

    private static int a(int i8, int i9) {
        if (i8 != 2000) {
            return i8;
        }
        if (i9 != 1) {
            return Z1.b.CREDENTIAL_PICKER_REQUEST_CODE;
        }
        return 2001;
    }

    public static C3254jE0 zza(IOException iOException, NB0 nb0, int i8) {
        String message = iOException.getMessage();
        int i9 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC2963gj0.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i9 == 2007 ? new C3141iE0(iOException, nb0) : new C3254jE0(iOException, nb0, i9, i8);
    }

    public C3254jE0(IOException iOException, NB0 nb0, int i8, int i9) {
        super(iOException, a(i8, i9));
        this.zzb = nb0;
        this.zzc = i9;
    }

    public C3254jE0(String str, NB0 nb0, int i8, int i9) {
        super(str, a(i8, i9));
        this.zzb = nb0;
        this.zzc = i9;
    }

    public C3254jE0(String str, IOException iOException, NB0 nb0, int i8, int i9) {
        super(str, iOException, a(i8, i9));
        this.zzb = nb0;
        this.zzc = i9;
    }
}
