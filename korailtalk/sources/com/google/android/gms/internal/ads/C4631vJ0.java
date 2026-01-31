package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: com.google.android.gms.internal.ads.vJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4631vJ0 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5087zJ0 f23198a;

    /* synthetic */ C4631vJ0(C5087zJ0 c5087zJ0, AbstractC4517uJ0 abstractC4517uJ0) {
        this.f23198a = c5087zJ0;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C5087zJ0 c5087zJ0 = this.f23198a;
        this.f23198a.f(C4289sJ0.b(c5087zJ0.f24138a, c5087zJ0.f24145h, c5087zJ0.f24144g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        AJ0 aj0 = this.f23198a.f24144g;
        int i8 = AbstractC2281am0.zza;
        int length = audioDeviceInfoArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            if (AbstractC2281am0.zzG(audioDeviceInfoArr[i9], aj0)) {
                this.f23198a.f24144g = null;
                break;
            }
            i9++;
        }
        C5087zJ0 c5087zJ0 = this.f23198a;
        c5087zJ0.f(C4289sJ0.b(c5087zJ0.f24138a, c5087zJ0.f24145h, c5087zJ0.f24144g));
    }
}
