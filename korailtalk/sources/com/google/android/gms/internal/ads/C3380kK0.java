package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.kK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3380kK0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20391a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f20392b;

    public C3380kK0() {
        this.f20391a = null;
    }

    public final EJ0 zza(Q5 q52, C3940pF0 c3940pF0) {
        boolean zBooleanValue;
        AudioManager audioManager;
        q52.getClass();
        c3940pF0.getClass();
        int i8 = AbstractC2281am0.zza;
        if (i8 < 29 || q52.zzB == -1) {
            return EJ0.zza;
        }
        Context context = this.f20391a;
        Boolean bool = this.f20392b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.f20392b = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                boolean z8 = false;
                if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                    z8 = true;
                }
                this.f20392b = Boolean.valueOf(z8);
            }
            zBooleanValue = this.f20392b.booleanValue();
        }
        String str = q52.zzn;
        str.getClass();
        int iZza = AbstractC4239rv.zza(str, q52.zzk);
        if (iZza == 0 || i8 < AbstractC2281am0.zzg(iZza)) {
            return EJ0.zza;
        }
        int iZzh = AbstractC2281am0.zzh(q52.zzA);
        if (iZzh == 0) {
            return EJ0.zza;
        }
        try {
            AudioFormat audioFormatZzw = AbstractC2281am0.zzw(q52.zzB, iZzh, iZza);
            return i8 >= 31 ? AbstractC3266jK0.zza(audioFormatZzw, c3940pF0.zza().zza, zBooleanValue) : AbstractC3038hK0.zza(audioFormatZzw, c3940pF0.zza().zza, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return EJ0.zza;
        }
    }

    public C3380kK0(Context context) {
        this.f20391a = context;
    }
}
