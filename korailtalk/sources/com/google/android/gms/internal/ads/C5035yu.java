package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5035yu implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f24016a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4921xu f24017b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24018c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24019d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24020e;

    /* renamed from: f, reason: collision with root package name */
    private float f24021f = 1.0f;

    public C5035yu(Context context, InterfaceC4921xu interfaceC4921xu) {
        this.f24016a = (AudioManager) context.getSystemService("audio");
        this.f24017b = interfaceC4921xu;
    }

    private final void a() {
        if (!this.f24019d || this.f24020e || this.f24021f <= 0.0f) {
            if (this.f24018c) {
                AudioManager audioManager = this.f24016a;
                if (audioManager != null) {
                    this.f24018c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f24017b.zzn();
                return;
            }
            return;
        }
        if (this.f24018c) {
            return;
        }
        AudioManager audioManager2 = this.f24016a;
        if (audioManager2 != null) {
            this.f24018c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f24017b.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i8) {
        this.f24018c = i8 > 0;
        this.f24017b.zzn();
    }

    public final float zza() {
        float f8 = this.f24020e ? 0.0f : this.f24021f;
        if (this.f24018c) {
            return f8;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.f24019d = true;
        a();
    }

    public final void zzc() {
        this.f24019d = false;
        a();
    }

    public final void zzd(boolean z8) {
        this.f24020e = z8;
        a();
    }

    public final void zze(float f8) {
        this.f24021f = f8;
        a();
    }
}
