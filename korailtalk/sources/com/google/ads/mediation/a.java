package com.google.ads.mediation;

import B1.h;
import B1.l;
import N1.D;
import android.support.v4.media.session.f;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
final class a extends D {

    /* renamed from: s, reason: collision with root package name */
    private final h f11712s;

    public a(h hVar) {
        this.f11712s = hVar;
        setHeadline(hVar.zzh());
        setImages(hVar.zzk());
        setBody(hVar.zzf());
        setIcon(hVar.zzb());
        setCallToAction(hVar.zzg());
        setAdvertiser(hVar.zze());
        setStarRating(hVar.zzc());
        setStore(hVar.zzj());
        setPrice(hVar.zzi());
        zzd(hVar.zzd());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zze(hVar.zza());
    }

    @Override // N1.D
    public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        f.a(l.zza.get(view));
    }
}
