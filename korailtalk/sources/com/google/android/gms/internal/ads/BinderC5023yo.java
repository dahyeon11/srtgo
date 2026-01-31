package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC5023yo extends AbstractBinderC2972go {

    /* renamed from: a, reason: collision with root package name */
    private final N1.D f24012a;

    public BinderC5023yo(N1.D d9) {
        this.f24012a = d9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final boolean zzA() {
        return this.f24012a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final boolean zzB() {
        return this.f24012a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final double zze() {
        if (this.f24012a.getStarRating() != null) {
            return this.f24012a.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzf() {
        return this.f24012a.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzg() {
        return this.f24012a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final float zzh() {
        return this.f24012a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final Bundle zzi() {
        return this.f24012a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final H1.V0 zzj() {
        if (this.f24012a.zzb() != null) {
            return this.f24012a.zzb().zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC2004Vi zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC2503cj zzl() {
        B1.d icon = this.f24012a.getIcon();
        if (icon != null) {
            return new BinderC1758Pi(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzm() {
        View adChoicesContent = this.f24012a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return r2.b.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzn() {
        View viewZza = this.f24012a.zza();
        if (viewZza == null) {
            return null;
        }
        return r2.b.wrap(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final InterfaceC6172a zzo() {
        Object objZzc = this.f24012a.zzc();
        if (objZzc == null) {
            return null;
        }
        return r2.b.wrap(objZzc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzp() {
        return this.f24012a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzq() {
        return this.f24012a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzr() {
        return this.f24012a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzs() {
        return this.f24012a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzt() {
        return this.f24012a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final String zzu() {
        return this.f24012a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final List zzv() {
        List<B1.d> images = this.f24012a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (B1.d dVar : images) {
                arrayList.add(new BinderC1758Pi(dVar.getDrawable(), dVar.getUri(), dVar.getScale(), dVar.zzb(), dVar.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzw(InterfaceC6172a interfaceC6172a) {
        this.f24012a.handleClick((View) r2.b.unwrap(interfaceC6172a));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzx() {
        this.f24012a.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzy(InterfaceC6172a interfaceC6172a, InterfaceC6172a interfaceC6172a2, InterfaceC6172a interfaceC6172a3) {
        HashMap map = (HashMap) r2.b.unwrap(interfaceC6172a2);
        HashMap map2 = (HashMap) r2.b.unwrap(interfaceC6172a3);
        this.f24012a.trackViews((View) r2.b.unwrap(interfaceC6172a), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2972go, com.google.android.gms.internal.ads.InterfaceC3087ho
    public final void zzz(InterfaceC6172a interfaceC6172a) {
        this.f24012a.untrackView((View) r2.b.unwrap(interfaceC6172a));
    }
}
