package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class XK {

    /* renamed from: a, reason: collision with root package name */
    private final int f17213a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17214b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17215c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17216d;

    /* renamed from: e, reason: collision with root package name */
    private int f17217e;

    /* renamed from: f, reason: collision with root package name */
    private int f17218f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17219g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC2394bl0 f17220h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC2394bl0 f17221i;

    /* renamed from: j, reason: collision with root package name */
    private final int f17222j;

    /* renamed from: k, reason: collision with root package name */
    private final int f17223k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC2394bl0 f17224l;

    /* renamed from: m, reason: collision with root package name */
    private final C4746wK f17225m;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC2394bl0 f17226n;

    /* renamed from: o, reason: collision with root package name */
    private int f17227o;

    /* renamed from: p, reason: collision with root package name */
    private final HashMap f17228p;

    /* renamed from: q, reason: collision with root package name */
    private final HashSet f17229q;

    @Deprecated
    public XK() {
        this.f17213a = Integer.MAX_VALUE;
        this.f17214b = Integer.MAX_VALUE;
        this.f17215c = Integer.MAX_VALUE;
        this.f17216d = Integer.MAX_VALUE;
        this.f17217e = Integer.MAX_VALUE;
        this.f17218f = Integer.MAX_VALUE;
        this.f17219g = true;
        this.f17220h = AbstractC2394bl0.zzm();
        this.f17221i = AbstractC2394bl0.zzm();
        this.f17222j = Integer.MAX_VALUE;
        this.f17223k = Integer.MAX_VALUE;
        this.f17224l = AbstractC2394bl0.zzm();
        this.f17225m = C4746wK.zza;
        this.f17226n = AbstractC2394bl0.zzm();
        this.f17227o = 0;
        this.f17228p = new HashMap();
        this.f17229q = new HashSet();
    }

    public final XK zze(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC2281am0.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f17227o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f17226n = AbstractC2394bl0.zzn(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final XK zzf(int i8, int i9, boolean z8) {
        this.f17217e = i8;
        this.f17218f = i9;
        this.f17219g = true;
        return this;
    }

    protected XK(C4976yL c4976yL) {
        this.f17213a = Integer.MAX_VALUE;
        this.f17214b = Integer.MAX_VALUE;
        this.f17215c = Integer.MAX_VALUE;
        this.f17216d = Integer.MAX_VALUE;
        this.f17217e = c4976yL.zzl;
        this.f17218f = c4976yL.zzm;
        this.f17219g = c4976yL.zzn;
        this.f17220h = c4976yL.zzo;
        this.f17221i = c4976yL.zzq;
        this.f17222j = Integer.MAX_VALUE;
        this.f17223k = Integer.MAX_VALUE;
        this.f17224l = c4976yL.zzu;
        this.f17225m = c4976yL.zzv;
        this.f17226n = c4976yL.zzw;
        this.f17227o = c4976yL.zzx;
        this.f17229q = new HashSet(c4976yL.zzE);
        this.f17228p = new HashMap(c4976yL.zzD);
    }
}
