package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class AA0 extends RuntimeException {
    public AA0(Pz0 pz0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C4021pz0 zza() {
        return new C4021pz0(getMessage());
    }
}
