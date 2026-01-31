package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2063Wt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f17076a;

    RunnableC2063Wt(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt) {
        this.f17076a = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f17076a;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            textureViewSurfaceTextureListenerC2145Yt.f17455p.zzd();
        }
    }
}
