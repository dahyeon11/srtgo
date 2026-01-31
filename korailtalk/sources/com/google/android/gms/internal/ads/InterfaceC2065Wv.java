package com.google.android.gms.internal.ads;

import H1.InterfaceC0517a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Wv */
/* loaded from: classes2.dex */
public interface InterfaceC2065Wv extends InterfaceC0517a, DJ, InterfaceC1655Mv, InterfaceC4563um, InterfaceC1247Cw, InterfaceC1411Gw, InterfaceC1439Hm, InterfaceC1992Vc, InterfaceC1534Jw, G1.m, InterfaceC1656Mw, InterfaceC1697Nw, InterfaceC4579uu, InterfaceC1738Ow {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.InterfaceC1411Gw, com.google.android.gms.internal.ads.InterfaceC4579uu
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i8, int i9);

    @Override // H1.InterfaceC0517a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    void setBackgroundColor(int i8);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzA(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzB(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    void zzC(BinderC1206Bw binderC1206Bw);

    @Override // com.google.android.gms.internal.ads.InterfaceC1655Mv
    C4654va0 zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu, com.google.android.gms.internal.ads.InterfaceC1738Ow
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.InterfaceC1656Mw
    C2487cb zzI();

    InterfaceC1503Jd zzJ();

    InterfaceC1799Qi zzK();

    J1.u zzL();

    J1.u zzM();

    InterfaceC1861Rw zzN();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu, com.google.android.gms.internal.ads.InterfaceC1615Lw
    C1943Tw zzO();

    C2368bX zzP();

    C2597dX zzQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC1247Cw
    C4996ya0 zzR();

    C1989Va0 zzS();

    com.google.common.util.concurrent.C zzT();

    String zzU();

    List zzV();

    void zzW(C4654va0 c4654va0, C4996ya0 c4996ya0);

    void zzX();

    void zzY();

    void zzZ(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    /* synthetic */ void zza(String str);

    void zzaA(String str, o2.o oVar);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z8, int i8);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    @Override // com.google.android.gms.internal.ads.InterfaceC1534Jw
    /* synthetic */ void zzaJ(J1.j jVar, boolean z8, boolean z9);

    @Override // com.google.android.gms.internal.ads.InterfaceC1534Jw
    /* synthetic */ void zzaK(String str, String str2, int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC1534Jw
    /* synthetic */ void zzaL(boolean z8, int i8, boolean z9);

    @Override // com.google.android.gms.internal.ads.InterfaceC1534Jw
    /* synthetic */ void zzaM(boolean z8, int i8, String str, String str2, boolean z9);

    @Override // com.google.android.gms.internal.ads.InterfaceC1534Jw
    /* synthetic */ void zzaN(boolean z8, int i8, String str, boolean z9, boolean z10);

    void zzaa();

    void zzab();

    void zzac(boolean z8);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, InterfaceC2278al interfaceC2278al);

    void zzah();

    void zzai(J1.u uVar);

    void zzaj(C1943Tw c1943Tw);

    void zzak(InterfaceC1503Jd interfaceC1503Jd);

    void zzal(boolean z8);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z8);

    void zzap(InterfaceC1717Oi interfaceC1717Oi);

    void zzaq(boolean z8);

    void zzar(InterfaceC1799Qi interfaceC1799Qi);

    void zzas(C2368bX c2368bX);

    void zzat(C2597dX c2597dX);

    void zzau(int i8);

    void zzav(boolean z8);

    void zzaw(J1.u uVar);

    void zzax(boolean z8);

    void zzay(boolean z8);

    void zzaz(String str, InterfaceC2278al interfaceC2278al);

    @Override // com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    /* synthetic */ void zzb(String str, String str2);

    @Override // com.google.android.gms.internal.ads.InterfaceC4563um, com.google.android.gms.internal.ads.InterfaceC4791wm
    /* synthetic */ void zzd(String str, Map map);

    @Override // com.google.android.gms.internal.ads.DJ
    /* synthetic */ void zzdG();

    @Override // com.google.android.gms.internal.ads.DJ
    /* synthetic */ void zzdf();

    @Override // G1.m
    /* synthetic */ void zzdg();

    @Override // G1.m
    /* synthetic */ void zzdh();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ String zzdi();

    @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
    /* synthetic */ void zzdp(C1951Uc c1951Uc);

    @Override // com.google.android.gms.internal.ads.InterfaceC4563um, com.google.android.gms.internal.ads.InterfaceC4791wm
    /* synthetic */ void zze(String str, JSONObject jSONObject);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ int zzf();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ int zzg();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ int zzh();

    @Override // com.google.android.gms.internal.ads.InterfaceC1411Gw, com.google.android.gms.internal.ads.InterfaceC4579uu
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    G1.a zzj();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ C1388Gh zzk();

    @Override // com.google.android.gms.internal.ads.InterfaceC1439Hm, com.google.android.gms.internal.ads.InterfaceC4791wm
    /* synthetic */ void zzl(String str, JSONObject jSONObject);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    C1429Hh zzm();

    @Override // com.google.android.gms.internal.ads.InterfaceC1697Nw, com.google.android.gms.internal.ads.InterfaceC4579uu
    L1.a zzn();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ C3326ju zzo();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ AbstractC2986gv zzp(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    BinderC1206Bw zzq();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ String zzr();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    void zzt(String str, AbstractC2986gv abstractC2986gv);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzu();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzv(boolean z8, long j8);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzw();

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzx(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzy(int i8);

    @Override // com.google.android.gms.internal.ads.InterfaceC4579uu
    /* synthetic */ void zzz(boolean z8);
}
