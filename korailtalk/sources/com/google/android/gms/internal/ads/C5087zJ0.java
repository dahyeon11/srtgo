package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.zJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5087zJ0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24138a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f24139b;

    /* renamed from: c, reason: collision with root package name */
    private final C4631vJ0 f24140c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f24141d;

    /* renamed from: e, reason: collision with root package name */
    private final C4745wJ0 f24142e;

    /* renamed from: f, reason: collision with root package name */
    private C4289sJ0 f24143f;

    /* renamed from: g, reason: collision with root package name */
    private AJ0 f24144g;

    /* renamed from: h, reason: collision with root package name */
    private C3940pF0 f24145h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24146i;

    /* renamed from: j, reason: collision with root package name */
    private final C3836oK0 f24147j;

    C5087zJ0(Context context, C3836oK0 c3836oK0, C3940pF0 c3940pF0, AJ0 aj0) {
        Context applicationContext = context.getApplicationContext();
        this.f24138a = applicationContext;
        this.f24147j = c3836oK0;
        this.f24145h = c3940pF0;
        this.f24144g = aj0;
        byte b9 = 0;
        byte b10 = 0;
        Handler handler = new Handler(AbstractC2281am0.zzy(), null);
        this.f24139b = handler;
        this.f24140c = AbstractC2281am0.zza >= 23 ? new C4631vJ0(this, b10 == true ? 1 : 0) : null;
        this.f24141d = new C4973yJ0(this, b9 == true ? 1 : 0);
        Uri uriA = C4289sJ0.a();
        this.f24142e = uriA != null ? new C4745wJ0(this, handler, applicationContext.getContentResolver(), uriA) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(C4289sJ0 c4289sJ0) {
        if (!this.f24146i || c4289sJ0.equals(this.f24143f)) {
            return;
        }
        this.f24143f = c4289sJ0;
        this.f24147j.zza.zzJ(c4289sJ0);
    }

    public final C4289sJ0 zzc() {
        C4631vJ0 c4631vJ0;
        if (this.f24146i) {
            C4289sJ0 c4289sJ0 = this.f24143f;
            c4289sJ0.getClass();
            return c4289sJ0;
        }
        this.f24146i = true;
        C4745wJ0 c4745wJ0 = this.f24142e;
        if (c4745wJ0 != null) {
            c4745wJ0.zza();
        }
        if (AbstractC2281am0.zza >= 23 && (c4631vJ0 = this.f24140c) != null) {
            AbstractC4403tJ0.zza(this.f24138a, c4631vJ0, this.f24139b);
        }
        C4289sJ0 c4289sJ0C = C4289sJ0.c(this.f24138a, this.f24141d != null ? this.f24138a.registerReceiver(this.f24141d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f24139b) : null, this.f24145h, this.f24144g);
        this.f24143f = c4289sJ0C;
        return c4289sJ0C;
    }

    public final void zzg(C3940pF0 c3940pF0) {
        this.f24145h = c3940pF0;
        f(C4289sJ0.b(this.f24138a, c3940pF0, this.f24144g));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        AJ0 aj0 = this.f24144g;
        if (AbstractC2281am0.zzG(audioDeviceInfo, aj0 == null ? null : aj0.zza)) {
            return;
        }
        AJ0 aj02 = audioDeviceInfo != null ? new AJ0(audioDeviceInfo) : null;
        this.f24144g = aj02;
        f(C4289sJ0.b(this.f24138a, this.f24145h, aj02));
    }

    public final void zzi() {
        C4631vJ0 c4631vJ0;
        if (this.f24146i) {
            this.f24143f = null;
            if (AbstractC2281am0.zza >= 23 && (c4631vJ0 = this.f24140c) != null) {
                AbstractC4403tJ0.zzb(this.f24138a, c4631vJ0);
            }
            BroadcastReceiver broadcastReceiver = this.f24141d;
            if (broadcastReceiver != null) {
                this.f24138a.unregisterReceiver(broadcastReceiver);
            }
            C4745wJ0 c4745wJ0 = this.f24142e;
            if (c4745wJ0 != null) {
                c4745wJ0.zzb();
            }
            this.f24146i = false;
        }
    }
}
