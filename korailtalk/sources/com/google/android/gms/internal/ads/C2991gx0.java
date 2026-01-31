package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.kakao.sdk.template.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.gms.internal.ads.gx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2991gx0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f19480e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f19481f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f19482g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f19483h;

    /* renamed from: i, reason: collision with root package name */
    private long f19484i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19485j;

    public C2991gx0(Context context) {
        super(false);
        this.f19480e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f19484i;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new Fw0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        FileInputStream fileInputStream = this.f19483h;
        int i10 = AbstractC2281am0.zza;
        int i11 = fileInputStream.read(bArr, i8, i9);
        if (i11 == -1) {
            return -1;
        }
        long j9 = this.f19484i;
        if (j9 != -1) {
            this.f19484i = j9 - i11;
        }
        zzg(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws IOException {
        int i8;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = nb0.zza.normalizeScheme();
                this.f19481f = uriNormalizeScheme;
                b(nb0);
                if (Constants.CONTENT.equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f19480e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f19480e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f19482g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + String.valueOf(uriNormalizeScheme));
                    i8 = Z1.b.CREDENTIAL_PICKER_REQUEST_CODE;
                    try {
                        throw new Fw0(iOException, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
                    } catch (IOException e8) {
                        e = e8;
                        if (true == (e instanceof FileNotFoundException)) {
                            i8 = 2005;
                        }
                        throw new Fw0(e, i8);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f19483h = fileInputStream;
                if (length != -1 && nb0.zze > length) {
                    throw new Fw0(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(nb0.zze + startOffset) - startOffset;
                if (jSkip != nb0.zze) {
                    throw new Fw0(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f19484i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f19484i = jPosition;
                        if (jPosition < 0) {
                            throw new Fw0(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f19484i = jPosition;
                    if (jPosition < 0) {
                        throw new Fw0(null, 2008);
                    }
                }
                long jMin = nb0.zzf;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f19484i = jMin;
                }
                this.f19485j = true;
                c(nb0);
                long j8 = nb0.zzf;
                return j8 != -1 ? j8 : this.f19484i;
            } catch (IOException e9) {
                e = e9;
                i8 = Z1.b.CREDENTIAL_PICKER_REQUEST_CODE;
            }
        } catch (Fw0 e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f19481f;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        this.f19481f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f19483h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f19483h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19482g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f19482g = null;
                        if (this.f19485j) {
                            this.f19485j = false;
                            a();
                        }
                    } catch (IOException e8) {
                        throw new Fw0(e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
                    }
                } catch (Throwable th) {
                    this.f19483h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f19482g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f19482g = null;
                        if (this.f19485j) {
                            this.f19485j = false;
                            a();
                        }
                        throw th;
                    } catch (IOException e9) {
                        throw new Fw0(e9, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
                    }
                }
            } catch (Throwable th2) {
                this.f19482g = null;
                if (this.f19485j) {
                    this.f19485j = false;
                    a();
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new Fw0(e10, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }
}
