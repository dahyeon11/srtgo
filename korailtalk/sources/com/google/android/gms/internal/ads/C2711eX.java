package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;
import r0.AbstractC6168a;

/* renamed from: com.google.android.gms.internal.ads.eX, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2711eX {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6168a f18772a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18773b;

    C2711eX(Context context) {
        this.f18773b = context;
    }

    public final com.google.common.util.concurrent.C zza() {
        try {
            AbstractC6168a abstractC6168aFrom = AbstractC6168a.from(this.f18773b);
            this.f18772a = abstractC6168aFrom;
            return abstractC6168aFrom == null ? AbstractC1483In0.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : abstractC6168aFrom.getMeasurementApiStatusAsync();
        } catch (Exception e8) {
            return AbstractC1483In0.zzg(e8);
        }
    }

    public final com.google.common.util.concurrent.C zzb(Uri uri, InputEvent inputEvent) {
        try {
            AbstractC6168a abstractC6168a = this.f18772a;
            Objects.requireNonNull(abstractC6168a);
            return abstractC6168a.registerSourceAsync(uri, inputEvent);
        } catch (Exception e8) {
            return AbstractC1483In0.zzg(e8);
        }
    }
}
