package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
final class HE0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13310a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ JE0 f13311b;

    public HE0(JE0 je0, Handler handler) {
        this.f13311b = je0;
        this.f13310a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i8) {
        this.f13310a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.GE0
            @Override // java.lang.Runnable
            public final void run() {
                JE0.a(this.zza.f13311b, i8);
            }
        });
    }
}
