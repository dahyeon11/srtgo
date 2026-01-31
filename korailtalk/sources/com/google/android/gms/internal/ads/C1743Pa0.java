package com.google.android.gms.internal.ads;

import H1.C0545j0;
import H1.InterfaceC0533f0;
import android.os.Bundle;
import i2.AbstractC5683p;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Pa0 */
/* loaded from: classes2.dex */
public final class C1743Pa0 {

    /* renamed from: a */
    private H1.Y1 f15360a;

    /* renamed from: b */
    private H1.d2 f15361b;

    /* renamed from: c */
    private String f15362c;

    /* renamed from: d */
    private H1.R1 f15363d;

    /* renamed from: e */
    private boolean f15364e;

    /* renamed from: f */
    private ArrayList f15365f;

    /* renamed from: g */
    private ArrayList f15366g;

    /* renamed from: h */
    private C1840Ri f15367h;

    /* renamed from: i */
    private H1.j2 f15368i;

    /* renamed from: j */
    private B1.a f15369j;

    /* renamed from: k */
    private B1.g f15370k;

    /* renamed from: l */
    private InterfaceC0533f0 f15371l;

    /* renamed from: n */
    private C3197im f15373n;

    /* renamed from: r */
    private C3000h10 f15377r;

    /* renamed from: t */
    private Bundle f15379t;

    /* renamed from: u */
    private C0545j0 f15380u;

    /* renamed from: m */
    private int f15372m = 1;

    /* renamed from: o */
    private final C1170Ba0 f15374o = new C1170Ba0();

    /* renamed from: p */
    private boolean f15375p = false;

    /* renamed from: q */
    private boolean f15376q = false;

    /* renamed from: s */
    private boolean f15378s = false;

    public final C1743Pa0 zzA(Bundle bundle) {
        this.f15379t = bundle;
        return this;
    }

    public final C1743Pa0 zzB(boolean z8) {
        this.f15364e = z8;
        return this;
    }

    public final C1743Pa0 zzC(int i8) {
        this.f15372m = i8;
        return this;
    }

    public final C1743Pa0 zzD(C1840Ri c1840Ri) {
        this.f15367h = c1840Ri;
        return this;
    }

    public final C1743Pa0 zzE(ArrayList arrayList) {
        this.f15365f = arrayList;
        return this;
    }

    public final C1743Pa0 zzF(ArrayList arrayList) {
        this.f15366g = arrayList;
        return this;
    }

    public final C1743Pa0 zzG(B1.g gVar) {
        this.f15370k = gVar;
        if (gVar != null) {
            this.f15364e = gVar.zzc();
            this.f15371l = gVar.zza();
        }
        return this;
    }

    public final C1743Pa0 zzH(H1.Y1 y12) {
        this.f15360a = y12;
        return this;
    }

    public final C1743Pa0 zzI(H1.R1 r12) {
        this.f15363d = r12;
        return this;
    }

    public final C1825Ra0 zzJ() {
        AbstractC5683p.checkNotNull(this.f15362c, "ad unit must not be null");
        AbstractC5683p.checkNotNull(this.f15361b, "ad size must not be null");
        AbstractC5683p.checkNotNull(this.f15360a, "ad request must not be null");
        return new C1825Ra0(this, null);
    }

    public final String zzL() {
        return this.f15362c;
    }

    public final boolean zzS() {
        return this.f15376q;
    }

    public final C1743Pa0 zzU(C0545j0 c0545j0) {
        this.f15380u = c0545j0;
        return this;
    }

    public final H1.Y1 zzf() {
        return this.f15360a;
    }

    public final H1.d2 zzh() {
        return this.f15361b;
    }

    public final C1170Ba0 zzp() {
        return this.f15374o;
    }

    public final C1743Pa0 zzq(C1825Ra0 c1825Ra0) {
        this.f15374o.zza(c1825Ra0.zzo.zza);
        this.f15360a = c1825Ra0.zzd;
        this.f15361b = c1825Ra0.zze;
        this.f15380u = c1825Ra0.zzt;
        this.f15362c = c1825Ra0.zzf;
        this.f15363d = c1825Ra0.zza;
        this.f15365f = c1825Ra0.zzg;
        this.f15366g = c1825Ra0.zzh;
        this.f15367h = c1825Ra0.zzi;
        this.f15368i = c1825Ra0.zzj;
        zzr(c1825Ra0.zzl);
        zzG(c1825Ra0.zzm);
        this.f15375p = c1825Ra0.zzp;
        this.f15376q = c1825Ra0.zzq;
        this.f15377r = c1825Ra0.zzc;
        this.f15378s = c1825Ra0.zzr;
        this.f15379t = c1825Ra0.zzs;
        return this;
    }

    public final C1743Pa0 zzr(B1.a aVar) {
        this.f15369j = aVar;
        if (aVar != null) {
            this.f15364e = aVar.getManualImpressionsEnabled();
        }
        return this;
    }

    public final C1743Pa0 zzs(H1.d2 d2Var) {
        this.f15361b = d2Var;
        return this;
    }

    public final C1743Pa0 zzt(String str) {
        this.f15362c = str;
        return this;
    }

    public final C1743Pa0 zzu(H1.j2 j2Var) {
        this.f15368i = j2Var;
        return this;
    }

    public final C1743Pa0 zzv(C3000h10 c3000h10) {
        this.f15377r = c3000h10;
        return this;
    }

    public final C1743Pa0 zzw(C3197im c3197im) {
        this.f15373n = c3197im;
        this.f15363d = new H1.R1(false, true, false);
        return this;
    }

    public final C1743Pa0 zzx(boolean z8) {
        this.f15375p = z8;
        return this;
    }

    public final C1743Pa0 zzy(boolean z8) {
        this.f15376q = z8;
        return this;
    }

    public final C1743Pa0 zzz(boolean z8) {
        this.f15378s = true;
        return this;
    }
}
