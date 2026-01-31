package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.C0924a0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tO0 */
/* loaded from: classes2.dex */
public final class C4413tO0 extends C4976yL {

    /* renamed from: H */
    private static final String f22841H;

    /* renamed from: I */
    private static final String f22842I;

    /* renamed from: J */
    private static final String f22843J;

    /* renamed from: K */
    private static final String f22844K;

    /* renamed from: L */
    private static final String f22845L;

    /* renamed from: M */
    private static final String f22846M;

    /* renamed from: N */
    private static final String f22847N;

    /* renamed from: O */
    private static final String f22848O;

    /* renamed from: P */
    private static final String f22849P;

    /* renamed from: Q */
    private static final String f22850Q;

    /* renamed from: R */
    private static final String f22851R;

    /* renamed from: S */
    private static final String f22852S;

    /* renamed from: T */
    private static final String f22853T;

    /* renamed from: U */
    private static final String f22854U;

    /* renamed from: V */
    private static final String f22855V;

    /* renamed from: W */
    private static final String f22856W;

    /* renamed from: X */
    private static final String f22857X;

    /* renamed from: Y */
    private static final String f22858Y;

    /* renamed from: Z */
    private static final String f22859Z;
    public static final C4413tO0 zzF;

    @Deprecated
    public static final C4413tO0 zzG;

    @Deprecated
    public static final RG0 zzH;

    /* renamed from: F */
    private final SparseArray f22860F;

    /* renamed from: G */
    private final SparseBooleanArray f22861G;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;

    static {
        C4413tO0 c4413tO0 = new C4413tO0(new C4185rO0());
        zzF = c4413tO0;
        zzG = c4413tO0;
        f22841H = Integer.toString(1000, 36);
        f22842I = Integer.toString(1001, 36);
        f22843J = Integer.toString(1002, 36);
        f22844K = Integer.toString(1003, 36);
        f22845L = Integer.toString(1004, 36);
        f22846M = Integer.toString(1005, 36);
        f22847N = Integer.toString(C0924a0.TYPE_CELL, 36);
        f22848O = Integer.toString(C0924a0.TYPE_CROSSHAIR, 36);
        f22849P = Integer.toString(C0924a0.TYPE_TEXT, 36);
        f22850Q = Integer.toString(C0924a0.TYPE_VERTICAL_TEXT, 36);
        f22851R = Integer.toString(C0924a0.TYPE_ALIAS, 36);
        f22852S = Integer.toString(C0924a0.TYPE_COPY, 36);
        f22853T = Integer.toString(C0924a0.TYPE_NO_DROP, 36);
        f22854U = Integer.toString(C0924a0.TYPE_ALL_SCROLL, 36);
        f22855V = Integer.toString(C0924a0.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        f22856W = Integer.toString(C0924a0.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        f22857X = Integer.toString(C0924a0.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        f22858Y = Integer.toString(C0924a0.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        f22859Z = Integer.toString(C0924a0.TYPE_ZOOM_IN, 36);
        zzH = new RG0() { // from class: com.google.android.gms.internal.ads.pO0
        };
    }

    /* synthetic */ C4413tO0(C4185rO0 c4185rO0, AbstractC4299sO0 abstractC4299sO0) {
        this(c4185rO0);
    }

    public static C4413tO0 zzd(Context context) {
        return new C4413tO0(new C4185rO0(context));
    }

    @Override // com.google.android.gms.internal.ads.C4976yL
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4413tO0.class == obj.getClass()) {
            C4413tO0 c4413tO0 = (C4413tO0) obj;
            if (super.equals(c4413tO0) && this.zzI == c4413tO0.zzI && this.zzK == c4413tO0.zzK && this.zzM == c4413tO0.zzM && this.zzR == c4413tO0.zzR && this.zzS == c4413tO0.zzS && this.zzT == c4413tO0.zzT && this.zzV == c4413tO0.zzV) {
                SparseBooleanArray sparseBooleanArray = this.f22861G;
                SparseBooleanArray sparseBooleanArray2 = c4413tO0.f22861G;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            SparseArray sparseArray = this.f22860F;
                            SparseArray sparseArray2 = c4413tO0.f22860F;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i9 = 0; i9 < size2; i9++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i9));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i9);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                SN0 sn0 = (SN0) entry.getKey();
                                                if (!map2.containsKey(sn0) || !AbstractC2281am0.zzG(entry.getValue(), map2.get(sn0))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i8)) < 0) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C4976yL
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 28629151) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 31) + (this.zzT ? 1 : 0)) * 961) + (this.zzV ? 1 : 0)) * 31;
    }

    public final C4185rO0 zzc() {
        return new C4185rO0(this, null);
    }

    @Deprecated
    public final AbstractC4641vO0 zze(int i8, SN0 sn0) {
        Map map = (Map) this.f22860F.get(i8);
        if (map != null) {
            android.support.v4.media.session.f.a(map.get(sn0));
        }
        return null;
    }

    public final boolean zzf(int i8) {
        return this.f22861G.get(i8);
    }

    @Deprecated
    public final boolean zzg(int i8, SN0 sn0) {
        Map map = (Map) this.f22860F.get(i8);
        return map != null && map.containsKey(sn0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    C4413tO0(C4185rO0 c4185rO0) {
        super(c4185rO0);
        this.zzI = c4185rO0.f22453r;
        this.zzJ = false;
        this.zzK = c4185rO0.f22454s;
        this.zzL = false;
        this.zzM = c4185rO0.f22455t;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzR = c4185rO0.f22456u;
        this.zzS = c4185rO0.f22457v;
        this.zzT = c4185rO0.f22458w;
        this.zzU = false;
        this.zzV = c4185rO0.f22459x;
        this.zzW = false;
        this.f22860F = c4185rO0.f22460y;
        this.f22861G = c4185rO0.f22461z;
    }
}
