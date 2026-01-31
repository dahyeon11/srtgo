package com.google.android.gms.ads.internal.util;

import H0.c;
import H0.m;
import H0.n;
import H0.w;
import K1.V;
import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.kakao.sdk.template.Constants;
import r2.InterfaceC6172a;
import r2.b;

/* loaded from: classes.dex */
public class WorkManagerUtil extends V {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void b(Context context) {
        try {
            w.initialize(context.getApplicationContext(), new a.b().build());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // K1.V, K1.W
    public final void zze(InterfaceC6172a interfaceC6172a) {
        Context context = (Context) b.unwrap(interfaceC6172a);
        b(context);
        try {
            w wVar = w.getInstance(context);
            wVar.cancelAllWorkByTag("offline_ping_sender_work");
            wVar.enqueue((n) ((n.a) ((n.a) new n.a(OfflinePingSender.class).setConstraints(new c.a().setRequiredNetworkType(m.CONNECTED).build())).addTag("offline_ping_sender_work")).build());
        } catch (IllegalStateException e8) {
            L1.n.zzk("Failed to instantiate WorkManager.", e8);
        }
    }

    @Override // K1.V, K1.W
    public final boolean zzf(InterfaceC6172a interfaceC6172a, String str, String str2) {
        return zzg(interfaceC6172a, new I1.a(str, str2, ""));
    }

    @Override // K1.V, K1.W
    public final boolean zzg(InterfaceC6172a interfaceC6172a, I1.a aVar) throws Throwable {
        Context context = (Context) b.unwrap(interfaceC6172a);
        b(context);
        c cVarBuild = new c.a().setRequiredNetworkType(m.CONNECTED).build();
        try {
            w.getInstance(context).enqueue((n) ((n.a) ((n.a) ((n.a) new n.a(OfflineNotificationPoster.class).setConstraints(cVarBuild)).setInputData(new b.a().putString("uri", aVar.zza).putString("gws_query_id", aVar.zzb).putString(Constants.IMAGE_URL, aVar.zzc).build())).addTag("offline_notification_work")).build());
            return true;
        } catch (IllegalStateException e8) {
            L1.n.zzk("Failed to instantiate WorkManager.", e8);
            return false;
        }
    }
}
