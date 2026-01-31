package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vp */
/* loaded from: classes2.dex */
public final class C4683vp extends C4797wp implements InterfaceC2278al {

    /* renamed from: c */
    private final InterfaceC2065Wv f23313c;

    /* renamed from: d */
    private final Context f23314d;

    /* renamed from: e */
    private final WindowManager f23315e;

    /* renamed from: f */
    private final C2270ah f23316f;

    /* renamed from: g */
    DisplayMetrics f23317g;

    /* renamed from: h */
    private float f23318h;

    /* renamed from: i */
    int f23319i;

    /* renamed from: j */
    int f23320j;

    /* renamed from: k */
    private int f23321k;

    /* renamed from: l */
    int f23322l;

    /* renamed from: m */
    int f23323m;

    /* renamed from: n */
    int f23324n;

    /* renamed from: o */
    int f23325o;

    public C4683vp(InterfaceC2065Wv interfaceC2065Wv, Context context, C2270ah c2270ah) {
        super(interfaceC2065Wv, "");
        this.f23319i = -1;
        this.f23320j = -1;
        this.f23322l = -1;
        this.f23323m = -1;
        this.f23324n = -1;
        this.f23325o = -1;
        this.f23313c = interfaceC2065Wv;
        this.f23314d = context;
        this.f23316f = c2270ah;
        this.f23315e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.f23317g = new DisplayMetrics();
        Display defaultDisplay = this.f23315e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f23317g);
        this.f23318h = this.f23317g.density;
        this.f23321k = defaultDisplay.getRotation();
        C0591z.zzb();
        DisplayMetrics displayMetrics = this.f23317g;
        this.f23319i = L1.g.zzw(displayMetrics, displayMetrics.widthPixels);
        C0591z.zzb();
        DisplayMetrics displayMetrics2 = this.f23317g;
        this.f23320j = L1.g.zzw(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityZzi = this.f23313c.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f23322l = this.f23319i;
            this.f23323m = this.f23320j;
        } else {
            G1.u.zzp();
            int[] iArrZzQ = K1.K0.zzQ(activityZzi);
            C0591z.zzb();
            this.f23322l = L1.g.zzw(this.f23317g, iArrZzQ[0]);
            C0591z.zzb();
            this.f23323m = L1.g.zzw(this.f23317g, iArrZzQ[1]);
        }
        if (this.f23313c.zzO().zzi()) {
            this.f23324n = this.f23319i;
            this.f23325o = this.f23320j;
        } else {
            this.f23313c.measure(0, 0);
        }
        zzj(this.f23319i, this.f23320j, this.f23322l, this.f23323m, this.f23318h, this.f23321k);
        C4569up c4569up = new C4569up();
        C2270ah c2270ah = this.f23316f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        c4569up.zze(c2270ah.zza(intent));
        C2270ah c2270ah2 = this.f23316f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        c4569up.zzc(c2270ah2.zza(intent2));
        c4569up.zza(this.f23316f.zzb());
        c4569up.zzd(this.f23316f.zzc());
        c4569up.zzb(true);
        boolean z8 = c4569up.f23112a;
        boolean z9 = c4569up.f23113b;
        boolean z10 = c4569up.f23114c;
        boolean z11 = c4569up.f23115d;
        boolean z12 = c4569up.f23116e;
        InterfaceC2065Wv interfaceC2065Wv = this.f23313c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z8).put("tel", z9).put("calendar", z10).put("storePicture", z11).put("inlineVideo", z12);
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while obtaining the MRAID capabilities.", e8);
            jSONObjectPut = null;
        }
        interfaceC2065Wv.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f23313c.getLocationOnScreen(iArr);
        zzb(C0591z.zzb().zzb(this.f23314d, iArr[0]), C0591z.zzb().zzb(this.f23314d, iArr[1]));
        if (L1.n.zzm(2)) {
            L1.n.zzi("Dispatching Ready Event.");
        }
        zzi(this.f23313c.zzn().afmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006b A[PHI: r3
  0x006b: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:36:0x0042, B:42:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f23314d
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L13
            G1.u.zzp()
            android.app.Activity r0 = (android.app.Activity) r0
            int[] r0 = K1.K0.zzR(r0)
            r0 = r0[r2]
            goto L14
        L13:
            r0 = r2
        L14:
            com.google.android.gms.internal.ads.Wv r1 = r6.f23313c
            com.google.android.gms.internal.ads.Tw r1 = r1.zzO()
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.Wv r1 = r6.f23313c
            com.google.android.gms.internal.ads.Tw r1 = r1.zzO()
            boolean r1 = r1.zzi()
            if (r1 != 0) goto L84
        L28:
            com.google.android.gms.internal.ads.Wv r1 = r6.f23313c
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            com.google.android.gms.internal.ads.kh r4 = com.google.android.gms.internal.ads.AbstractC4439th.zzQ
            com.google.android.gms.internal.ads.rh r5 = H1.C.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            if (r3 != 0) goto L58
            com.google.android.gms.internal.ads.Wv r3 = r6.f23313c
            com.google.android.gms.internal.ads.Tw r3 = r3.zzO()
            if (r3 == 0) goto L57
            com.google.android.gms.internal.ads.Wv r3 = r6.f23313c
            com.google.android.gms.internal.ads.Tw r3 = r3.zzO()
            int r3 = r3.zzb
            goto L58
        L57:
            r3 = r2
        L58:
            if (r1 != 0) goto L6b
            com.google.android.gms.internal.ads.Wv r1 = r6.f23313c
            com.google.android.gms.internal.ads.Tw r1 = r1.zzO()
            if (r1 == 0) goto L6c
            com.google.android.gms.internal.ads.Wv r1 = r6.f23313c
            com.google.android.gms.internal.ads.Tw r1 = r1.zzO()
            int r2 = r1.zza
            goto L6c
        L6b:
            r2 = r1
        L6c:
            android.content.Context r1 = r6.f23314d
            L1.g r4 = H1.C0591z.zzb()
            int r1 = r4.zzb(r1, r3)
            r6.f23324n = r1
            android.content.Context r1 = r6.f23314d
            L1.g r3 = H1.C0591z.zzb()
            int r1 = r3.zzb(r1, r2)
            r6.f23325o = r1
        L84:
            int r0 = r8 - r0
            int r1 = r6.f23324n
            int r2 = r6.f23325o
            r6.zzg(r7, r0, r1, r2)
            com.google.android.gms.internal.ads.Wv r0 = r6.f23313c
            com.google.android.gms.internal.ads.Rw r0 = r0.zzN()
            r0.zzC(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4683vp.zzb(int, int):void");
    }
}
