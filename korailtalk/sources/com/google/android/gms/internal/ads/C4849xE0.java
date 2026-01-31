package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.xE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4849xE0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f23676a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f23677b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(C4849xE0 c4849xE0, int i8, int i9) {
        c4849xE0.f23677b.set(i8, i9);
        c4849xE0.f23676a.setPattern(c4849xE0.f23677b);
    }
}
