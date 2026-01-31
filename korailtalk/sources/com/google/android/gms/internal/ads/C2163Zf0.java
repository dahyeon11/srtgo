package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import f2.C5392b;
import i2.AbstractC5670c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Zf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2163Zf0 implements AbstractC5670c.a, AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C1305Eg0 f17618a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17619b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17620c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f17621d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f17622e;

    public C2163Zf0(Context context, String str, String str2) {
        this.f17619b = str;
        this.f17620c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f17622e = handlerThread;
        handlerThread.start();
        C1305Eg0 c1305Eg0 = new C1305Eg0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f17618a = c1305Eg0;
        this.f17621d = new LinkedBlockingQueue();
        c1305Eg0.checkAvailabilityAndConnect();
    }

    static O9 a() {
        C3357k9 c3357k9Zza = O9.zza();
        c3357k9Zza.zzJ(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (O9) c3357k9Zza.zzbr();
    }

    protected final C1510Jg0 b() {
        try {
            return this.f17618a.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        C1510Jg0 c1510Jg0B = b();
        if (c1510Jg0B != null) {
            try {
                try {
                    this.f17621d.put(c1510Jg0B.zze(new C1346Fg0(this.f17619b, this.f17620c)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.f17622e.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f17621d.put(a());
            }
            zzc();
            this.f17622e.quit();
        }
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) throws InterruptedException {
        try {
            this.f17621d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) throws InterruptedException {
        try {
            this.f17621d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    public final O9 zzb(int i8) {
        O9 o9;
        try {
            o9 = (O9) this.f17621d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            o9 = null;
        }
        return o9 == null ? a() : o9;
    }

    public final void zzc() {
        C1305Eg0 c1305Eg0 = this.f17618a;
        if (c1305Eg0 != null) {
            if (c1305Eg0.isConnected() || this.f17618a.isConnecting()) {
                this.f17618a.disconnect();
            }
        }
    }
}
