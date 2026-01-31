package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.oa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3856oa implements Runnable {
    /* synthetic */ RunnableC3856oa(AbstractC3742na abstractC3742na) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            AbstractC3970pa.f21779b = MessageDigest.getInstance("MD5");
            countDownLatch = AbstractC3970pa.f21782e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = AbstractC3970pa.f21782e;
        } catch (Throwable th) {
            AbstractC3970pa.f21782e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
