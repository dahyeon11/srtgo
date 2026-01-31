package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3176ib {

    /* renamed from: a, reason: collision with root package name */
    private static Cipher f19956a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f19957b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f19958c = new Object();

    public C3176ib(SecureRandom secureRandom) {
    }

    private static final Cipher a() {
        Cipher cipher;
        synchronized (f19958c) {
            try {
                if (f19956a == null) {
                    f19956a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f19956a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws C3061hb {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f19957b) {
                a().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = a().doFinal(bArr2);
                iv = a().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return AbstractC3514la.zza(bArr3, false);
        } catch (InvalidKeyException e8) {
            throw new C3061hb(this, e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new C3061hb(this, e9);
        } catch (BadPaddingException e10) {
            throw new C3061hb(this, e10);
        } catch (IllegalBlockSizeException e11) {
            throw new C3061hb(this, e11);
        } catch (NoSuchPaddingException e12) {
            throw new C3061hb(this, e12);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws C3061hb {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZzb = AbstractC3514la.zzb(str, false);
            int length2 = bArrZzb.length;
            if (length2 <= 16) {
                throw new C3061hb(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZzb);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f19957b) {
                a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e8) {
            throw new C3061hb(this, e8);
        } catch (InvalidAlgorithmParameterException e9) {
            throw new C3061hb(this, e9);
        } catch (InvalidKeyException e10) {
            throw new C3061hb(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new C3061hb(this, e11);
        } catch (BadPaddingException e12) {
            throw new C3061hb(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new C3061hb(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new C3061hb(this, e14);
        }
    }
}
