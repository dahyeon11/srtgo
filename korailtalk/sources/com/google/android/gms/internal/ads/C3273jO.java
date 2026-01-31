package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import J1.InterfaceC0619b;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.jO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3273jO implements InterfaceC0517a, InterfaceC3990pk, J1.w, InterfaceC4217rk, InterfaceC0619b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0517a f20237a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3990pk f20238b;

    /* renamed from: c, reason: collision with root package name */
    private J1.w f20239c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4217rk f20240d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0619b f20241e;

    protected final synchronized void a(InterfaceC0517a interfaceC0517a, InterfaceC3990pk interfaceC3990pk, J1.w wVar, InterfaceC4217rk interfaceC4217rk, InterfaceC0619b interfaceC0619b) {
        this.f20237a = interfaceC0517a;
        this.f20238b = interfaceC3990pk;
        this.f20239c = wVar;
        this.f20240d = interfaceC4217rk;
        this.f20241e = interfaceC0619b;
    }

    @Override // H1.InterfaceC0517a
    public final synchronized void onAdClicked() {
        InterfaceC0517a interfaceC0517a = this.f20237a;
        if (interfaceC0517a != null) {
            interfaceC0517a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3990pk
    public final synchronized void zza(String str, Bundle bundle) {
        InterfaceC3990pk interfaceC3990pk = this.f20238b;
        if (interfaceC3990pk != null) {
            interfaceC3990pk.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217rk
    public final synchronized void zzb(String str, String str2) {
        InterfaceC4217rk interfaceC4217rk = this.f20240d;
        if (interfaceC4217rk != null) {
            interfaceC4217rk.zzb(str, str2);
        }
    }

    @Override // J1.w
    public final synchronized void zzdH() {
        J1.w wVar = this.f20239c;
        if (wVar != null) {
            wVar.zzdH();
        }
    }

    @Override // J1.w
    public final synchronized void zzdk() {
        J1.w wVar = this.f20239c;
        if (wVar != null) {
            wVar.zzdk();
        }
    }

    @Override // J1.w
    public final synchronized void zzdq() {
        J1.w wVar = this.f20239c;
        if (wVar != null) {
            wVar.zzdq();
        }
    }

    @Override // J1.w
    public final synchronized void zzdr() {
        J1.w wVar = this.f20239c;
        if (wVar != null) {
            wVar.zzdr();
        }
    }

    @Override // J1.w
    public final synchronized void zzdt() {
        J1.w wVar = this.f20239c;
        if (wVar != null) {
            wVar.zzdt();
        }
    }

    @Override // J1.w
    public final synchronized void zzdu(int i8) {
        J1.w wVar = this.f20239c;
        if (wVar != null) {
            wVar.zzdu(i8);
        }
    }

    @Override // J1.InterfaceC0619b
    public final synchronized void zzg() {
        InterfaceC0619b interfaceC0619b = this.f20241e;
        if (interfaceC0619b != null) {
            interfaceC0619b.zzg();
        }
    }
}
