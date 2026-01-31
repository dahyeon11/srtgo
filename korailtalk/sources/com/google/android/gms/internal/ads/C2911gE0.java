package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.gms.internal.ads.gE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2911gE0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f19329e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f19330f;

    /* renamed from: g, reason: collision with root package name */
    private long f19331g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19332h;

    public C2911gE0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f19331g;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f19329e;
            int i10 = AbstractC2281am0.zza;
            int i11 = randomAccessFile.read(bArr, i8, (int) Math.min(j8, i9));
            if (i11 > 0) {
                this.f19331g -= i11;
                zzg(i11);
            }
            return i11;
        } catch (IOException e8) {
            throw new C2796fE0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws IOException {
        Uri uri = nb0.zza;
        this.f19330f = uri;
        b(nb0);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f19329e = randomAccessFile;
            try {
                randomAccessFile.seek(nb0.zze);
                long length = nb0.zzf;
                if (length == -1) {
                    length = this.f19329e.length() - nb0.zze;
                }
                this.f19331g = length;
                if (length < 0) {
                    throw new C2796fE0(null, null, 2008);
                }
                this.f19332h = true;
                c(nb0);
                return this.f19331g;
            } catch (IOException e8) {
                throw new C2796fE0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        } catch (FileNotFoundException e9) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C2796fE0(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e9, 1004);
            }
            int i8 = AbstractC2281am0.zza;
            throw new C2796fE0(e9, true != AbstractC2681eE0.b(e9.getCause()) ? 2005 : 2006);
        } catch (SecurityException e10) {
            throw new C2796fE0(e10, 2006);
        } catch (RuntimeException e11) {
            throw new C2796fE0(e11, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f19330f;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        this.f19330f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19329e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f19329e = null;
                if (this.f19332h) {
                    this.f19332h = false;
                    a();
                }
            } catch (IOException e8) {
                throw new C2796fE0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        } catch (Throwable th) {
            this.f19329e = null;
            if (this.f19332h) {
                this.f19332h = false;
                a();
            }
            throw th;
        }
    }
}
