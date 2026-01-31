package com.google.android.gms.internal.ads;

import Q1.c;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4795wo extends AbstractBinderC2972go {

    /* renamed from: a, reason: collision with root package name */
    private final N1.z f23545a;

    public BinderC4795wo(N1.z zVar) {
        this.f23545a = zVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final boolean zzA() {
        return this.f23545a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final boolean zzB() {
        return this.f23545a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final double zze() {
        if (this.f23545a.getStarRating() != null) {
            return this.f23545a.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzf() {
        return this.f23545a.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzg() {
        return this.f23545a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzh() {
        return this.f23545a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final Bundle zzi() {
        return this.f23545a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final H1.V0 zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC2004Vi zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC2503cj zzl() {
        c.b icon = this.f23545a.getIcon();
        if (icon != null) {
            return new BinderC1758Pi(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzm() {
        View adChoicesContent = this.f23545a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return r2.b.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzn() {
        View viewZza = this.f23545a.zza();
        if (viewZza == null) {
            return null;
        }
        return r2.b.wrap(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzp() {
        return this.f23545a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzq() {
        return this.f23545a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzr() {
        return this.f23545a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzs() {
        return this.f23545a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzt() {
        return this.f23545a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzu() {
        return this.f23545a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final List zzv() {
        List<c.b> images = this.f23545a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (c.b bVar : images) {
                arrayList.add(new BinderC1758Pi(bVar.getDrawable(), bVar.getUri(), bVar.getScale(), bVar.zzb(), bVar.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzw(InterfaceC6172a interfaceC6172a) {
        this.f23545a.handleClick((View) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzx() {
        this.f23545a.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzy(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        HashMap map = (HashMap) r2.b.unwrap(interfaceC6172a2);
        HashMap map2 = (HashMap) r2.b.unwrap(interfaceC6172a3);
        this.f23545a.trackViews((View) r2.b.unwrap(interfaceC6172a), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzz(InterfaceC6172a interfaceC6172a) {
        this.f23545a.untrackView((View) r2.b.unwrap(interfaceC6172a));
    }
}
