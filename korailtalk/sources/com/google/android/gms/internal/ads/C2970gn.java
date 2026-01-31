package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2970gn implements InterfaceC4791wm, InterfaceC2855fn {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2855fn f19397a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f19398b = new HashSet();

    public C2970gn(InterfaceC2855fn interfaceC2855fn) {
        this.f19397a = interfaceC2855fn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4791wm
    public final void zza(String str) {
        this.f19397a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zzb(String str, String str2) {
        AbstractC4677vm.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.f19398b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            AbstractC0667v0.zza("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC2278al) simpleEntry.getValue()).toString())));
            this.f19397a.zzr((String) simpleEntry.getKey(), (InterfaceC2278al) simpleEntry.getValue());
        }
        this.f19398b.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zzd(String str, Map map) {
        AbstractC4677vm.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        AbstractC4677vm.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4791wm
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        AbstractC4677vm.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2855fn
    public final void zzq(String str, InterfaceC2278al interfaceC2278al) {
        this.f19397a.zzq(str, interfaceC2278al);
        this.f19398b.add(new AbstractMap.SimpleEntry(str, interfaceC2278al));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2855fn
    public final void zzr(String str, InterfaceC2278al interfaceC2278al) {
        this.f19397a.zzr(str, interfaceC2278al);
        this.f19398b.remove(new AbstractMap.SimpleEntry(str, interfaceC2278al));
    }
}
