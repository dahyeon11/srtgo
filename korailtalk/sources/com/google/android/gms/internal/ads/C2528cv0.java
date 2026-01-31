package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.cv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2528cv0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f18369e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f18370f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f18371g;

    /* renamed from: h, reason: collision with root package name */
    private long f18372h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18373i;

    public C2528cv0(Context context) {
        super(false);
        this.f18369e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f18372h;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new Bu0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        InputStream inputStream = this.f18371g;
        int i10 = AbstractC2281am0.zza;
        int i11 = inputStream.read(bArr, i8, i9);
        if (i11 == -1) {
            return -1;
        }
        long j9 = this.f18372h;
        if (j9 != -1) {
            this.f18372h = j9 - i11;
        }
        zzg(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws IOException {
        try {
            Uri uri = nb0.zza;
            this.f18370f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(nb0);
            InputStream inputStreamOpen = this.f18369e.open(path, 1);
            this.f18371g = inputStreamOpen;
            if (inputStreamOpen.skip(nb0.zze) < nb0.zze) {
                throw new Bu0(null, 2008);
            }
            long j8 = nb0.zzf;
            if (j8 != -1) {
                this.f18372h = j8;
            } else {
                long jAvailable = this.f18371g.available();
                this.f18372h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f18372h = -1L;
                }
            }
            this.f18373i = true;
            c(nb0);
            return this.f18372h;
        } catch (Bu0 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new Bu0(e9, true != (e9 instanceof FileNotFoundException) ? Z1.b.CREDENTIAL_PICKER_REQUEST_CODE : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f18370f;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        this.f18370f = null;
        try {
            try {
                InputStream inputStream = this.f18371g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f18371g = null;
                if (this.f18373i) {
                    this.f18373i = false;
                    a();
                }
            } catch (IOException e8) {
                throw new Bu0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        } catch (Throwable th) {
            this.f18371g = null;
            if (this.f18373i) {
                this.f18373i = false;
                a();
            }
            throw th;
        }
    }
}
