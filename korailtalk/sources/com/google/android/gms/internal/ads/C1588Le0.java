package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.google.android.gms.internal.ads.Le0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1588Le0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14335a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f14336b;

    /* renamed from: c, reason: collision with root package name */
    private final C1424He0 f14337c;

    /* renamed from: d, reason: collision with root package name */
    private float f14338d;

    /* renamed from: e, reason: collision with root package name */
    private final C2079Xe0 f14339e;

    public C1588Le0(Handler handler, Context context, C1424He0 c1424He0, C2079Xe0 c2079Xe0) {
        super(handler);
        this.f14335a = context;
        this.f14336b = (AudioManager) context.getSystemService("audio");
        this.f14337c = c1424He0;
        this.f14339e = c2079Xe0;
    }

    private final float a() {
        AudioManager audioManager = this.f14336b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f8 = streamVolume / streamMaxVolume;
        if (f8 > 1.0f) {
            return 1.0f;
        }
        return f8;
    }

    private final void b() {
        this.f14339e.zze(this.f14338d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        super.onChange(z8);
        float fA = a();
        if (fA != this.f14338d) {
            this.f14338d = fA;
            b();
        }
    }

    public final void zza() {
        this.f14338d = a();
        b();
        this.f14335a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.f14335a.getContentResolver().unregisterContentObserver(this);
    }
}
