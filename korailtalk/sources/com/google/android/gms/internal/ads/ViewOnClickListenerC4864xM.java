package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.kakao.sdk.user.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4864xM implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final C4754wO f23693a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f f23694b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2129Yj f23695c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC2278al f23696d;

    /* renamed from: e, reason: collision with root package name */
    String f23697e;

    /* renamed from: f, reason: collision with root package name */
    Long f23698f;

    /* renamed from: g, reason: collision with root package name */
    WeakReference f23699g;

    public ViewOnClickListenerC4864xM(C4754wO c4754wO, o2.f fVar) {
        this.f23693a = c4754wO;
        this.f23694b = fVar;
    }

    private final void a() {
        View view;
        this.f23697e = null;
        this.f23698f = null;
        WeakReference weakReference = this.f23699g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f23699g = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f23699g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f23697e != null && this.f23698f != null) {
            HashMap map = new HashMap();
            map.put(Constants.ID, this.f23697e);
            map.put("time_interval", String.valueOf(this.f23694b.currentTimeMillis() - this.f23698f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f23693a.zzj("sendMessageToNativeJs", map);
        }
        a();
    }

    public final InterfaceC2129Yj zza() {
        return this.f23695c;
    }

    public final void zzb() {
        if (this.f23695c == null || this.f23698f == null) {
            return;
        }
        a();
        try {
            this.f23695c.zze();
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        }
    }

    public final void zzc(final InterfaceC2129Yj interfaceC2129Yj) {
        this.f23695c = interfaceC2129Yj;
        InterfaceC2278al interfaceC2278al = this.f23696d;
        if (interfaceC2278al != null) {
            this.f23693a.zzn("/unconfirmedClick", interfaceC2278al);
        }
        InterfaceC2278al interfaceC2278al2 = new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.wM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                ViewOnClickListenerC4864xM viewOnClickListenerC4864xM = this.zza;
                try {
                    viewOnClickListenerC4864xM.f23698f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    L1.n.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                InterfaceC2129Yj interfaceC2129Yj2 = interfaceC2129Yj;
                viewOnClickListenerC4864xM.f23697e = (String) map.get(Constants.ID);
                String str = (String) map.get("asset_id");
                if (interfaceC2129Yj2 == null) {
                    L1.n.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC2129Yj2.zzf(str);
                } catch (RemoteException e8) {
                    L1.n.zzl("#007 Could not call remote method.", e8);
                }
            }
        };
        this.f23696d = interfaceC2278al2;
        this.f23693a.zzl("/unconfirmedClick", interfaceC2278al2);
    }
}
