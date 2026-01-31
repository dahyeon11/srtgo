package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.s40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4259s40 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22553a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22554b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22555c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22556d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22557e;

    public C4259s40(String str, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f22553a = str;
        this.f22554b = z8;
        this.f22555c = z9;
        this.f22556d = z10;
        this.f22557e = z11;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f22553a.isEmpty()) {
            bundle.putString("inspector_extras", this.f22553a);
        }
        bundle.putInt("test_mode", this.f22554b ? 1 : 0);
        bundle.putInt("linked_device", this.f22555c ? 1 : 0);
        if (this.f22554b || this.f22555c) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjk)).booleanValue()) {
                bundle.putInt("risd", !this.f22556d ? 1 : 0);
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjo)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f22557e);
            }
        }
    }
}
