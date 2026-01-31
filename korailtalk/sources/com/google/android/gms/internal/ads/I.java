package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes2.dex */
public final class I extends CL0 {
    public I(Throwable th, DL0 dl0, Surface surface) {
        super(th, dl0);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
