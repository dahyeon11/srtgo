package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ut, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1981Ut implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f16727a;

    RunnableC1981Ut(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt) {
        this.f16727a = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f16727a;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            textureViewSurfaceTextureListenerC2145Yt.f17455p.zzd();
            this.f16727a.f17455p.zzi();
        }
    }
}
