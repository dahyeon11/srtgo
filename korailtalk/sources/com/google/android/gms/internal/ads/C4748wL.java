package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.wL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4748wL implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f23479a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f23480b;

    public C4748wL(XD0 xd0, XD0 xd02) {
        this.f23479a = xd0;
        this.f23480b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4858xJ((Context) this.f23479a.zzb(), new HashSet(), ((C4049qD) this.f23480b).zza());
    }
}
