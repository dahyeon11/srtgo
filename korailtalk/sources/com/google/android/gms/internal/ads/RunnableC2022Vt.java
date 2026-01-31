package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2022Vt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f16905a;

    RunnableC2022Vt(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt) {
        this.f16905a = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f16905a;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            if (!textureViewSurfaceTextureListenerC2145Yt.f17456q) {
                textureViewSurfaceTextureListenerC2145Yt.f17455p.zzg();
                this.f16905a.f17456q = true;
            }
            this.f16905a.f17455p.zze();
        }
    }
}
