package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.St, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1899St implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f16351a;

    RunnableC1899St(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt) {
        this.f16351a = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f16351a;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            textureViewSurfaceTextureListenerC2145Yt.f17455p.zzh();
        }
    }
}
