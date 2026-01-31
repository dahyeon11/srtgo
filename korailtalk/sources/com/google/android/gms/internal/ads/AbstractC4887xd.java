package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4887xd {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f23767b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f23768a = new Object();

    protected final MessageDigest a() {
        synchronized (this.f23768a) {
            MessageDigest messageDigest = f23767b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i8 = 0; i8 < 2; i8++) {
                try {
                    f23767b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f23767b;
        }
    }

    abstract byte[] zzb(String str);
}
