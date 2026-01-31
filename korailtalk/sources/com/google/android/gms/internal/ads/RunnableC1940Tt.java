package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1940Tt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f16534a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f16535b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f16536c;

    RunnableC1940Tt(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt, int i8, int i9) {
        this.f16534a = i8;
        this.f16535b = i9;
        this.f16536c = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f16536c;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            textureViewSurfaceTextureListenerC2145Yt.f17455p.zzj(this.f16534a, this.f16535b);
        }
    }
}
