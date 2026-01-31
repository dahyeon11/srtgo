package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.wK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4747wK0 {
    public final Q5 zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final C3277jR zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public C4747wK0(Q5 q52, int i8, int i9, int i10, int i11, int i12, int i13, int i14, C3277jR c3277jR, boolean z8, boolean z9, boolean z10) {
        this.zza = q52;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = c3277jR;
    }

    public final AudioTrack zza(C3940pF0 c3940pF0, int i8) throws UnsupportedOperationException, VJ0 {
        AudioTrack audioTrack;
        try {
            if (AbstractC2281am0.zza >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(c3940pF0.zza().zza).setAudioFormat(AbstractC2281am0.zzw(this.zze, this.zzf, this.zzg)).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i8).setOffloadedPlayback(this.zzc == 1).build();
            } else {
                audioTrack = new AudioTrack(c3940pF0.zza().zza, AbstractC2281am0.zzw(this.zze, this.zzf, this.zzg), this.zzh, 1, i8);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new VJ0(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException e8) {
            e = e8;
            throw new VJ0(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        } catch (UnsupportedOperationException e9) {
            e = e9;
            throw new VJ0(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final TJ0 zzb() {
        boolean z8 = this.zzc == 1;
        return new TJ0(this.zzg, this.zze, this.zzf, false, z8, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
