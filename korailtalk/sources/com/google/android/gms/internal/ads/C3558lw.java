package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.lw */
/* loaded from: classes2.dex */
public final class C3558lw {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.Wv, java.lang.Object] */
    public static final InterfaceC2065Wv zza(final Context context, final C1943Tw c1943Tw, final String str, final boolean z8, final boolean z9, final C2487cb c2487cb, final C2084Xh c2084Xh, final L1.a aVar, C1511Jh c1511Jh, final G1.m mVar, final G1.a aVar2, final C4775we c4775we, final C4654va0 c4654va0, final C4996ya0 c4996ya0, final GW gw, final C1989Va0 c1989Va0) throws C3444kw {
        AbstractC4439th.zza(context);
        try {
            final C1511Jh c1511Jh2 = null;
            InterfaceC1843Rj0 interfaceC1843Rj0 = new InterfaceC1843Rj0(context, c1943Tw, str, z8, z9, c2487cb, c2084Xh, aVar, c1511Jh2, mVar, aVar2, c4775we, c4654va0, c4996ya0, c1989Va0, gw) { // from class: com.google.android.gms.internal.ads.hw
                public final /* synthetic */ Context zza;
                public final /* synthetic */ C1943Tw zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ C2487cb zzf;
                public final /* synthetic */ C2084Xh zzg;
                public final /* synthetic */ L1.a zzh;
                public final /* synthetic */ G1.m zzi;
                public final /* synthetic */ G1.a zzj;
                public final /* synthetic */ C4775we zzk;
                public final /* synthetic */ C4654va0 zzl;
                public final /* synthetic */ C4996ya0 zzm;
                public final /* synthetic */ C1989Va0 zzn;
                public final /* synthetic */ GW zzo;

                {
                    this.zzi = mVar;
                    this.zzj = aVar2;
                    this.zzk = c4775we;
                    this.zzl = c4654va0;
                    this.zzm = c4996ya0;
                    this.zzn = c1989Va0;
                    this.zzo = gw;
                }

                @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
                public final Object zza() {
                    C1943Tw c1943Tw2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z10 = this.zzd;
                    C4775we c4775we2 = this.zzk;
                    boolean z11 = this.zze;
                    C2487cb c2487cb2 = this.zzf;
                    C4654va0 c4654va02 = this.zzl;
                    C2084Xh c2084Xh2 = this.zzg;
                    G1.m mVar2 = this.zzi;
                    C4996ya0 c4996ya02 = this.zzm;
                    Context context2 = this.zza;
                    L1.a aVar3 = this.zzh;
                    G1.a aVar4 = this.zzj;
                    C1989Va0 c1989Va02 = this.zzn;
                    GW gw2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i8 = ViewTreeObserverOnGlobalLayoutListenerC5039yw.zza;
                        C4128qw c4128qw = new C4128qw(new ViewTreeObserverOnGlobalLayoutListenerC5039yw(new C1902Sw(context2), c1943Tw2, str2, z10, z11, c2487cb2, c2084Xh2, aVar3, null, mVar2, aVar4, c4775we2, c4654va02, c4996ya02, c1989Va02));
                        c4128qw.setWebViewClient(G1.u.zzq().zzc(c4128qw, c4775we2, z11, gw2));
                        c4128qw.setWebChromeClient(new C2024Vv(c4128qw));
                        return c4128qw;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return interfaceC1843Rj0.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new C3444kw("Webview initialization failed.", th);
        }
    }
}
