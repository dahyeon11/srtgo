package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
final class JE0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f13619a;

    /* renamed from: b, reason: collision with root package name */
    private final HE0 f13620b;

    /* renamed from: c, reason: collision with root package name */
    private IE0 f13621c;

    /* renamed from: d, reason: collision with root package name */
    private int f13622d;

    /* renamed from: e, reason: collision with root package name */
    private float f13623e = 1.0f;

    public JE0(Context context, Handler handler, IE0 ie0) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f13619a = audioManager;
        this.f13621c = ie0;
        this.f13620b = new HE0(this, handler);
        this.f13622d = 0;
    }

    static /* bridge */ /* synthetic */ void a(JE0 je0, int i8) {
        if (i8 == -3 || i8 == -2) {
            if (i8 != -2) {
                je0.d(3);
                return;
            } else {
                je0.c(0);
                je0.d(2);
                return;
            }
        }
        if (i8 == -1) {
            je0.c(-1);
            je0.b();
        } else if (i8 == 1) {
            je0.d(1);
            je0.c(1);
        } else {
            AbstractC2834fc0.zzf("AudioFocusManager", "Unknown focus change type: " + i8);
        }
    }

    private final void b() {
        if (this.f13622d == 0) {
            return;
        }
        if (AbstractC2281am0.zza < 26) {
            this.f13619a.abandonAudioFocus(this.f13620b);
        }
        d(0);
    }

    private final void c(int i8) {
        IE0 ie0 = this.f13621c;
        if (ie0 != null) {
            JF0 jf0 = (JF0) ie0;
            boolean zZzv = jf0.f13624a.zzv();
            jf0.f13624a.H(zZzv, i8, NF0.u(zZzv, i8));
        }
    }

    private final void d(int i8) {
        if (this.f13622d == i8) {
            return;
        }
        this.f13622d = i8;
        float f8 = i8 == 3 ? 0.2f : 1.0f;
        if (this.f13623e != f8) {
            this.f13623e = f8;
            IE0 ie0 = this.f13621c;
            if (ie0 != null) {
                ((JF0) ie0).f13624a.E();
            }
        }
    }

    public final float zza() {
        return this.f13623e;
    }

    public final int zzb(boolean z8, int i8) {
        b();
        return z8 ? 1 : -1;
    }

    public final void zzd() {
        this.f13621c = null;
        b();
    }
}
