package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public final class V0 implements InterfaceC3227j1 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f16758c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};

    /* renamed from: d, reason: collision with root package name */
    private static final U0 f16759d = new U0(new T0() { // from class: com.google.android.gms.internal.ads.R0
        @Override // com.google.android.gms.internal.ads.T0
        public final Constructor zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC2425c1.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private static final U0 f16760e = new U0(new T0() { // from class: com.google.android.gms.internal.ads.S0
        @Override // com.google.android.gms.internal.ads.T0
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC2425c1.class).getConstructor(null);
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private AbstractC2394bl0 f16761a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3122i5 f16762b = new C2548d5();

    private final void a(int i8, List list) {
        switch (i8) {
            case 0:
                list.add(new C3124i6());
                break;
            case 1:
                list.add(new C3465l6());
                break;
            case 2:
                list.add(new C3807o6(0));
                break;
            case 3:
                list.add(new S1(0));
                break;
            case 4:
                InterfaceC2425c1 interfaceC2425c1Zza = f16759d.zza(0);
                if (interfaceC2425c1Zza == null) {
                    list.add(new C3457l2(0));
                    break;
                } else {
                    list.add(interfaceC2425c1Zza);
                    break;
                }
            case 5:
                list.add(new C3799o2());
                break;
            case 6:
                list.add(new L3(this.f16762b, 2));
                break;
            case 7:
                list.add(new T3(0));
                break;
            case 8:
                list.add(new C4144r4(this.f16762b, 32));
                list.add(new C4828x4(this.f16762b, 16));
                break;
            case 9:
                list.add(new P4());
                break;
            case 10:
                list.add(new T6());
                break;
            case 11:
                if (this.f16761a == null) {
                    this.f16761a = AbstractC2394bl0.zzm();
                }
                list.add(new C2552d7(1, 1, this.f16762b, new C2132Yk0(0L), new C4035q6(0, this.f16761a), 112800));
                break;
            case 12:
                list.add(new C3923p7());
                break;
            case 14:
                list.add(new C4482u2(0));
                break;
            case 15:
                InterfaceC2425c1 interfaceC2425c1Zza2 = f16760e.zza(new Object[0]);
                if (interfaceC2425c1Zza2 != null) {
                    list.add(interfaceC2425c1Zza2);
                    break;
                }
                break;
            case 16:
                list.add(new X1(1, this.f16762b));
                break;
            case 17:
                list.add(new C2204a5());
                break;
            case 18:
                list.add(new C4606v7());
                break;
            case 19:
                list.add(new C2656e2());
                break;
            case 20:
                list.add(new C4368t2());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ea  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC2425c1[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V0.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.c1[]");
    }
}
