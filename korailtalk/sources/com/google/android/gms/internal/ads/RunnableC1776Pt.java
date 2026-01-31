package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* renamed from: com.google.android.gms.internal.ads.Pt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1776Pt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f15415a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextureViewSurfaceTextureListenerC2145Yt f15416b;

    RunnableC1776Pt(TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt, MediaPlayer mediaPlayer) {
        this.f15415a = mediaPlayer;
        this.f15416b = textureViewSurfaceTextureListenerC2145Yt;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        TextureViewSurfaceTextureListenerC2145Yt.h(this.f15416b, this.f15415a);
        TextureViewSurfaceTextureListenerC2145Yt textureViewSurfaceTextureListenerC2145Yt = this.f15416b;
        if (textureViewSurfaceTextureListenerC2145Yt.f17455p != null) {
            textureViewSurfaceTextureListenerC2145Yt.f17455p.zzf();
        }
    }
}
