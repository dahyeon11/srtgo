package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4933y implements IC {

    /* renamed from: a, reason: collision with root package name */
    private final EO f23819a;

    public C4933y(EO eo) {
        this.f23819a = eo;
    }

    @Override // com.google.android.gms.internal.ads.IC
    public final InterfaceC3251jD zza(Context context, C3724nL0 c3724nL0, ZM0 zm0, GP gp, Executor executor, List list, long j8) throws NoSuchMethodException, SecurityException, C2586dO {
        try {
            try {
                ((IC) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(EO.class).newInstance(this.f23819a)).zza(context, c3724nL0, zm0, gp, executor, list, 0L);
                return null;
            } catch (Exception e8) {
                e = e8;
                if (e instanceof C2586dO) {
                    throw ((C2586dO) e);
                }
                throw new C2586dO(e, -9223372036854775807L);
            }
        } catch (Exception e9) {
            e = e9;
        }
    }
}
