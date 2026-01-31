package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.Mo0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1648Mo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f14707a = new CopyOnWriteArrayList();

    public static InterfaceC1608Lo0 zza(String str) throws GeneralSecurityException {
        Iterator it = f14707a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        android.support.v4.media.session.f.a(it.next());
        throw null;
    }
}
