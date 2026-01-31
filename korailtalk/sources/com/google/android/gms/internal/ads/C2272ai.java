package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2272ai {

    /* renamed from: a, reason: collision with root package name */
    private final String f18003a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18004b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18005c;

    protected C2272ai(String str, Object obj, int i8) {
        this.f18003a = str;
        this.f18004b = obj;
        this.f18005c = i8;
    }

    public static C2272ai zza(String str, double d9) {
        return new C2272ai(str, Double.valueOf(d9), 3);
    }

    public static C2272ai zzb(String str, long j8) {
        return new C2272ai(str, Long.valueOf(j8), 2);
    }

    public static C2272ai zzc(String str, String str2) {
        return new C2272ai(str, str2, 4);
    }

    public static C2272ai zzd(String str, boolean z8) {
        return new C2272ai(str, Boolean.valueOf(z8), 1);
    }

    public final Object zze() {
        InterfaceC1349Fi interfaceC1349FiA = AbstractC1472Ii.a();
        if (interfaceC1349FiA == null) {
            AbstractC1472Ii.b();
            return this.f18004b;
        }
        int i8 = this.f18005c - 1;
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? interfaceC1349FiA.zzd(this.f18003a, (String) this.f18004b) : interfaceC1349FiA.zzb(this.f18003a, ((Double) this.f18004b).doubleValue()) : interfaceC1349FiA.zzc(this.f18003a, ((Long) this.f18004b).longValue()) : interfaceC1349FiA.zza(this.f18003a, ((Boolean) this.f18004b).booleanValue());
    }
}
