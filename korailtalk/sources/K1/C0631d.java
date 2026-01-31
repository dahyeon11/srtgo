package K1;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: K1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2805a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f2806b = 1.0f;

    private final synchronized boolean a() {
        return this.f2806b >= 0.0f;
    }

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    public final synchronized float zza() {
        if (!a()) {
            return 1.0f;
        }
        return this.f2806b;
    }

    public final synchronized void zzc(boolean z8) {
        this.f2805a = z8;
    }

    public final synchronized void zzd(float f8) {
        this.f2806b = f8;
    }

    public final synchronized boolean zze() {
        return this.f2805a;
    }
}
