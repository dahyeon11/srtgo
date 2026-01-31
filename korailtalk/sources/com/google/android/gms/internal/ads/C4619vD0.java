package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.vD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4619vD0 extends AbstractC4961yD0 {

    /* renamed from: a, reason: collision with root package name */
    final Logger f23189a;

    public C4619vD0(String str) {
        this.f23189a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4961yD0
    public final void zza(String str) {
        this.f23189a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
