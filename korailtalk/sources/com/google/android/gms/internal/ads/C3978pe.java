package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.pe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3978pe extends PushbackInputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4092qe f21789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3978pe(C4092qe c4092qe, InputStream inputStream, int i8) {
        super(inputStream, 1);
        this.f21789a = c4092qe;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        C4319se.e(this.f21789a.f21969c);
        super.close();
    }
}
