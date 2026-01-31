package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.aK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2235aK0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f17933a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f17934b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f17935c;

    /* renamed from: d, reason: collision with root package name */
    private long f17936d;

    /* renamed from: e, reason: collision with root package name */
    private long f17937e;

    public C2235aK0(AudioTrack audioTrack) {
        this.f17933a = audioTrack;
    }

    public final long zza() {
        return this.f17937e;
    }

    public final long zzb() {
        return this.f17934b.nanoTime / 1000;
    }

    public final boolean zzc() {
        boolean timestamp = this.f17933a.getTimestamp(this.f17934b);
        if (timestamp) {
            long j8 = this.f17934b.framePosition;
            if (this.f17936d > j8) {
                this.f17935c++;
            }
            this.f17936d = j8;
            this.f17937e = j8 + (this.f17935c << 32);
        }
        return timestamp;
    }
}
