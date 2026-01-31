package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.wJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4745wJ0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f23473a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f23474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5087zJ0 f23475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4745wJ0(C5087zJ0 c5087zJ0, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f23475c = c5087zJ0;
        this.f23473a = contentResolver;
        this.f23474b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        C5087zJ0 c5087zJ0 = this.f23475c;
        this.f23475c.f(C4289sJ0.b(c5087zJ0.f24138a, c5087zJ0.f24145h, c5087zJ0.f24144g));
    }

    public final void zza() {
        this.f23473a.registerContentObserver(this.f23474b, false, this);
    }

    public final void zzb() {
        this.f23473a.unregisterContentObserver(this);
    }
}
