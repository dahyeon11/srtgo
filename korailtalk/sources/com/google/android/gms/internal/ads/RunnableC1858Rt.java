package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1858Rt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16153a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16154b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f16155c;

    RunnableC1858Rt(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt, String str, String str2) {
        this.f16153a = str;
        this.f16154b = str2;
        this.f16155c = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f16155c;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            textureViewSurfaceTextureListenerC2145Yt.f17455p.zzb(this.f16153a, this.f16154b);
        }
    }
}
