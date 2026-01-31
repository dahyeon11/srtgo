package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.uK0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4519uK0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23020a;

    /* renamed from: b, reason: collision with root package name */
    private final C4289sJ0 f23021b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23022c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4405tK0 f23023d;

    /* renamed from: e, reason: collision with root package name */
    private C4861xK0 f23024e;

    /* renamed from: f, reason: collision with root package name */
    private C3380kK0 f23025f;

    @Deprecated
    public C4519uK0() {
        this.f23020a = null;
        this.f23021b = C4289sJ0.zza;
        this.f23023d = InterfaceC4405tK0.zza;
    }

    public final MK0 zzd() {
        F10.zzf(!this.f23022c);
        this.f23022c = true;
        if (this.f23024e == null) {
            this.f23024e = new C4861xK0(new NS[0]);
        }
        if (this.f23025f == null) {
            this.f23025f = new C3380kK0(this.f23020a);
        }
        return new MK0(this, null);
    }

    public C4519uK0(Context context) {
        this.f23020a = context;
        this.f23021b = C4289sJ0.zza;
        this.f23023d = InterfaceC4405tK0.zza;
    }
}
