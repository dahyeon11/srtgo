package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4640vO implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f23219a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23220b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2278al f23221c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4754wO f23222d;

    /* synthetic */ C4640vO(C4754wO c4754wO, WeakReference weakReference, String str, InterfaceC2278al interfaceC2278al, AbstractC4526uO abstractC4526uO) {
        this.f23222d = c4754wO;
        this.f23219a = weakReference;
        this.f23220b = str;
        this.f23221c = interfaceC2278al;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        Object obj2 = this.f23219a.get();
        if (obj2 == null) {
            this.f23222d.zzn(this.f23220b, this);
        } else {
            this.f23221c.zza(obj2, map);
        }
    }
}
