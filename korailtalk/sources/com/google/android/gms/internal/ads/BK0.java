package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
final class BK0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f12267a;

    /* renamed from: b, reason: collision with root package name */
    private final C5087zJ0 f12268b;

    /* renamed from: c, reason: collision with root package name */
    private AudioRouting.OnRoutingChangedListener f12269c = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.AK0
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.zza.a(audioRouting);
        }
    };

    public BK0(AudioTrack audioTrack, C5087zJ0 c5087zJ0) {
        this.f12267a = audioTrack;
        this.f12268b = c5087zJ0;
        audioTrack.addOnRoutingChangedListener(this.f12269c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AudioRouting audioRouting) {
        if (this.f12269c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f12268b.zzh(audioRouting.getRoutedDevice());
    }

    public void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.f12269c;
        onRoutingChangedListener.getClass();
        this.f12267a.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.f12269c = null;
    }
}
