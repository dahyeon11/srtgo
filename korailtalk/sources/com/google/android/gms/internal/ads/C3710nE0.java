package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* renamed from: com.google.android.gms.internal.ads.nE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3710nE0 {
    public final AudioAttributes zza;

    /* synthetic */ C3710nE0(C3940pF0 c3940pF0, AbstractC3221iy0 abstractC3221iy0) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i8 = AbstractC2281am0.zza;
        if (i8 >= 29) {
            U60.zza(usage, 1);
        }
        if (i8 >= 32) {
            AbstractC4788wk0.zza(usage, 0);
        }
        this.zza = usage.build();
    }
}
