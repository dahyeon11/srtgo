package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.nt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3781nt0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f21369a = new C3667mt0();

    static /* synthetic */ SecureRandom a() throws GeneralSecurityException {
        SecureRandom secureRandomB = b();
        secureRandomB.nextLong();
        return secureRandomB;
    }

    private static SecureRandom b() throws GeneralSecurityException {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                        } catch (ClassNotFoundException e8) {
                            e = e8;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalAccessException e9) {
                            e = e9;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (NoSuchMethodException e11) {
                            e = e11;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (InvocationTargetException e12) {
                            e = e12;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused) {
                        return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null));
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
            }
        } catch (GeneralSecurityException unused4) {
            return new SecureRandom();
        }
    }

    public static byte[] zzb(int i8) {
        byte[] bArr = new byte[i8];
        ((SecureRandom) f21369a.get()).nextBytes(bArr);
        return bArr;
    }
}
