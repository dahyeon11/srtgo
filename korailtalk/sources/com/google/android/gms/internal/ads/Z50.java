package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class Z50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f17487a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17488b;

    public Z50(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f17487a = interfaceExecutorServiceC1974Un0;
        this.f17488b = context;
    }

    final /* synthetic */ X50 a() {
        boolean zIsActiveNetworkMetered;
        int i8;
        TelephonyManager telephonyManager = (TelephonyManager) this.f17488b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        G1.u.zzp();
        int i9 = -1;
        if (K1.K0.zzA(this.f17488b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f17488b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i8 = type;
                i9 = iOrdinal;
            } else {
                i8 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i8 = -2;
        }
        return new X50(networkOperator, i8, G1.u.zzq().zzm(this.f17488b), phoneType, zIsActiveNetworkMetered, i9);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f17487a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.Y50
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
