package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes2.dex */
final class Y implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f17322a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2194a0 f17323b;

    public Y(C2194a0 c2194a0, DisplayManager displayManager) {
        this.f17323b = c2194a0;
        this.f17322a = displayManager;
    }

    private final Display a() {
        return this.f17322a.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i8) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i8) {
        if (i8 == 0) {
            C2194a0.a(this.f17323b, a());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i8) {
    }

    public final void zza() {
        this.f17322a.registerDisplayListener(this, AbstractC2281am0.zzx(null));
        C2194a0.a(this.f17323b, a());
    }

    public final void zzb() {
        this.f17322a.unregisterDisplayListener(this);
    }
}
