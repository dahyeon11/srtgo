package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rO0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4185rO0 extends XK {

    /* renamed from: r, reason: collision with root package name */
    private boolean f22453r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f22454s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22455t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f22456u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22457v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22458w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22459x;

    /* renamed from: y, reason: collision with root package name */
    private final SparseArray f22460y;

    /* renamed from: z, reason: collision with root package name */
    private final SparseBooleanArray f22461z;

    @Deprecated
    public C4185rO0() {
        this.f22460y = new SparseArray();
        this.f22461z = new SparseBooleanArray();
        u();
    }

    private final void u() {
        this.f22453r = true;
        this.f22454s = true;
        this.f22455t = true;
        this.f22456u = true;
        this.f22457v = true;
        this.f22458w = true;
        this.f22459x = true;
    }

    public final C4185rO0 zzp(int i8, boolean z8) {
        if (this.f22461z.get(i8) != z8) {
            if (z8) {
                this.f22461z.put(i8, true);
            } else {
                this.f22461z.delete(i8);
            }
        }
        return this;
    }

    public C4185rO0(Context context) throws NumberFormatException {
        super.zze(context);
        Point pointZzv = AbstractC2281am0.zzv(context);
        super.zzf(pointZzv.x, pointZzv.y, true);
        this.f22460y = new SparseArray();
        this.f22461z = new SparseBooleanArray();
        u();
    }

    /* synthetic */ C4185rO0(C4413tO0 c4413tO0, AbstractC4072qO0 abstractC4072qO0) {
        super(c4413tO0);
        this.f22453r = c4413tO0.zzI;
        this.f22454s = c4413tO0.zzK;
        this.f22455t = c4413tO0.zzM;
        this.f22456u = c4413tO0.zzR;
        this.f22457v = c4413tO0.zzS;
        this.f22458w = c4413tO0.zzT;
        this.f22459x = c4413tO0.zzV;
        SparseArray sparseArray = c4413tO0.f22860F;
        SparseArray sparseArray2 = new SparseArray();
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            sparseArray2.put(sparseArray.keyAt(i8), new HashMap((Map) sparseArray.valueAt(i8)));
        }
        this.f22460y = sparseArray2;
        this.f22461z = c4413tO0.f22861G.clone();
    }
}
