package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.Sa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1865Sa implements InterfaceC1919Tg0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1426Hf0 f16303a;

    C1865Sa(C1947Ua c1947Ua, C1426Hf0 c1426Hf0) {
        this.f16303a = c1426Hf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1919Tg0
    public final boolean zza(File file) {
        try {
            return this.f16303a.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
