package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.Fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1339Fd extends AbstractC4887xd {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f13051c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13052d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13053e;

    public C1339Fd(int i8) {
        int i9 = i8 >> 3;
        this.f13052d = (i8 & 7) > 0 ? i9 + 1 : i9;
        this.f13053e = i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4887xd
    public final byte[] zzb(String str) {
        synchronized (this.f23768a) {
            try {
                MessageDigest messageDigestA = a();
                this.f13051c = messageDigestA;
                if (messageDigestA == null) {
                    return new byte[0];
                }
                messageDigestA.reset();
                this.f13051c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f13051c.digest();
                int length = bArrDigest.length;
                int i8 = this.f13052d;
                if (length > i8) {
                    length = i8;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f13053e & 7) > 0) {
                    long j8 = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 > 0) {
                            j8 <<= 8;
                        }
                        j8 += bArr[i9] & 255;
                    }
                    long j9 = j8 >>> (8 - (this.f13053e & 7));
                    int i10 = this.f13052d;
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j9);
                        j9 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
