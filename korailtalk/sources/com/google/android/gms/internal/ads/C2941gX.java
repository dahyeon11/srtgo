package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.a;
import com.google.android.gms.ads.MobileAds;
import s0.AbstractC6206a;

/* renamed from: com.google.android.gms.internal.ads.gX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2941gX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19364a;

    C2941gX(Context context) {
        this.f19364a = context;
    }

    public final com.google.common.util.concurrent.C zza(boolean z8) {
        try {
            androidx.privacysandbox.ads.adservices.topics.a aVarBuild = new a.C0158a().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z8).build();
            AbstractC6206a abstractC6206aFrom = AbstractC6206a.from(this.f19364a);
            return abstractC6206aFrom != null ? abstractC6206aFrom.getTopicsAsync(aVarBuild) : AbstractC1483In0.zzg(new IllegalStateException());
        } catch (Exception e8) {
            return AbstractC1483In0.zzg(e8);
        }
    }
}
