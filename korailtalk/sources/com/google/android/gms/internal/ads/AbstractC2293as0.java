package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.as0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2293as0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f18045a = Logger.getLogger(AbstractC2293as0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f18046b = new AtomicBoolean(false);

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f18045a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean zzb() {
        return f18046b.get();
    }
}
