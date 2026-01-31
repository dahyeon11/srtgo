package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes2.dex */
final class GK0 extends AudioTrack$StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ MK0 f13131a;

    /* renamed from: b */
    final /* synthetic */ JK0 f13132b;

    GK0(JK0 jk0, MK0 mk0) {
        this.f13131a = mk0;
        this.f13132b = jk0;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i8) {
        if (audioTrack.equals(this.f13132b.f13631c.f14619r)) {
            MK0 mk0 = this.f13132b.f13631c;
            if (mk0.f14615n == null || !mk0.f14589P) {
                return;
            }
            mk0.f14615n.zzb();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f13132b.f13631c.f14619r)) {
            this.f13132b.f13631c.f14588O = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f13132b.f13631c.f14619r)) {
            MK0 mk0 = this.f13132b.f13631c;
            if (mk0.f14615n == null || !mk0.f14589P) {
                return;
            }
            mk0.f14615n.zzb();
        }
    }
}
