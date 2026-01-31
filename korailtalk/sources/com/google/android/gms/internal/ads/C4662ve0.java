package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ve0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4662ve0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1383Ge0 f23295a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f23296b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23297c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map f23298d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f23299e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23300f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC4776we0 f23301g;

    private C4662ve0(C1383Ge0 c1383Ge0, WebView webView, String str, List list, String str2, String str3, EnumC4776we0 enumC4776we0) {
        this.f23295a = c1383Ge0;
        this.f23296b = webView;
        this.f23301g = enumC4776we0;
        this.f23300f = str2;
        this.f23299e = str3;
    }

    public static C4662ve0 zzb(C1383Ge0 c1383Ge0, WebView webView, String str, String str2) {
        if (str2 != null) {
            AbstractC3981pf0.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C4662ve0(c1383Ge0, webView, null, null, str, str2, EnumC4776we0.HTML);
    }

    public static C4662ve0 zzc(C1383Ge0 c1383Ge0, WebView webView, String str, String str2) {
        AbstractC3981pf0.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new C4662ve0(c1383Ge0, webView, null, null, str, "", EnumC4776we0.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.f23296b;
    }

    public final EnumC4776we0 zzd() {
        return this.f23301g;
    }

    public final C1383Ge0 zze() {
        return this.f23295a;
    }

    public final String zzf() {
        return this.f23300f;
    }

    public final String zzg() {
        return this.f23299e;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.f23297c);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.f23298d);
    }
}
