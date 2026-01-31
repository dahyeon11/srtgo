package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2529cw implements InterfaceC1319En0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f18374a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18375b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f18376c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2988gw f18377d;

    C2529cw(C2988gw c2988gw, List list, String str, Uri uri) {
        this.f18374a = list;
        this.f18375b = str;
        this.f18376c = uri;
        this.f18377d = c2988gw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final void zza(Throwable th) {
        L1.n.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.f18376c)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1319En0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.f18374a;
        String str = this.f18375b;
        this.f18377d.c((Map) obj, list, str);
    }
}
