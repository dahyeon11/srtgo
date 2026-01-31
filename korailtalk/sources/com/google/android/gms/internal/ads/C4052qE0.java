package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4052qE0 extends Dv0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f21892e;

    /* renamed from: f, reason: collision with root package name */
    private NB0 f21893f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f21894g;

    /* renamed from: h, reason: collision with root package name */
    private InputStream f21895h;

    /* renamed from: i, reason: collision with root package name */
    private long f21896i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21897j;

    public C4052qE0(Context context) {
        super(false);
        this.f21892e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i8) {
        return Uri.parse("rawresource:///" + i8);
    }

    private static int d(String str) throws C3938pE0 {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new C3938pE0("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor e(Context context, NB0 nb0) throws Resources.NotFoundException, PackageManager.NameNotFoundException, C3938pE0 {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = nb0.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C3938pE0("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = d(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C3938pE0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new C3938pE0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e8, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = d(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new C3938pE0("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new C3938pE0("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Resources.NotFoundException e9) {
            throw new C3938pE0(null, e9, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f21896i;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new C3938pE0(null, e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        InputStream inputStream = this.f21895h;
        int i10 = AbstractC2281am0.zza;
        int i11 = inputStream.read(bArr, i8, i9);
        if (i11 == -1) {
            if (this.f21896i == -1) {
                return -1;
            }
            throw new C3938pE0("End of stream reached having not read sufficient data.", new EOFException(), Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        }
        long j9 = this.f21896i;
        if (j9 != -1) {
            this.f21896i = j9 - i11;
        }
        zzg(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws C3565lz0, Resources.NotFoundException, PackageManager.NameNotFoundException {
        long size;
        this.f21893f = nb0;
        b(nb0);
        AssetFileDescriptor assetFileDescriptorE = e(this.f21892e, nb0);
        this.f21894g = assetFileDescriptorE;
        long length = assetFileDescriptorE.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f21894g.getFileDescriptor());
        this.f21895h = fileInputStream;
        if (length != -1) {
            try {
                if (nb0.zze > length) {
                    throw new C3938pE0(null, null, 2008);
                }
            } catch (C3938pE0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new C3938pE0(null, e9, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        long startOffset = this.f21894g.getStartOffset();
        long jSkip = fileInputStream.skip(nb0.zze + startOffset) - startOffset;
        if (jSkip != nb0.zze) {
            throw new C3938pE0(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f21896i = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.f21896i = size;
                if (size < 0) {
                    throw new C3938pE0(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.f21896i = size;
            if (size < 0) {
                throw new C3565lz0(2008);
            }
        }
        long jMin = nb0.zzf;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.f21896i = jMin;
        }
        this.f21897j = true;
        c(nb0);
        long j8 = nb0.zzf;
        return j8 != -1 ? j8 : this.f21896i;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        NB0 nb0 = this.f21893f;
        if (nb0 != null) {
            return nb0.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Dv0, com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        this.f21893f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f21895h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f21895h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21894g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f21894g = null;
                        if (this.f21897j) {
                            this.f21897j = false;
                            a();
                        }
                    } catch (IOException e8) {
                        throw new C3938pE0(null, e8, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
                    }
                } catch (Throwable th) {
                    this.f21895h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f21894g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f21894g = null;
                        if (this.f21897j) {
                            this.f21897j = false;
                            a();
                        }
                        throw th;
                    } catch (IOException e9) {
                        throw new C3938pE0(null, e9, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
                    }
                }
            } catch (Throwable th2) {
                this.f21894g = null;
                if (this.f21897j) {
                    this.f21897j = false;
                    a();
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new C3938pE0(null, e10, Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }
}
