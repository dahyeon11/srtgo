package com.google.android.gms.internal.ads;

import K1.C0631d;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2331bB implements InterfaceC3654mn {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18099a;

    /* renamed from: b, reason: collision with root package name */
    private final C1828Rc f18100b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f18101c;

    public C2331bB(Context context, C1828Rc c1828Rc) {
        this.f18099a = context;
        this.f18100b = c1828Rc;
        this.f18101c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3654mn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(C2674eB c2674eB) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C1951Uc c1951Uc = c2674eB.zzf;
        if (c1951Uc == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f18100b.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z8 = c1951Uc.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f18100b.zzb()).put("activeViewJSON", this.f18100b.zzd()).put("timestamp", c2674eB.zzd).put("adFormat", this.f18100b.zza()).put("hashCode", this.f18100b.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", c2674eB.zzb).put("isNative", this.f18100b.zze()).put("isScreenOn", this.f18101c.isInteractive()).put("appMuted", G1.u.zzr().zze()).put("appVolume", G1.u.zzr().zza()).put("deviceVolume", C0631d.zzb(this.f18099a.getApplicationContext()));
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfQ)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f18099a.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f18099a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", c1951Uc.zzb).put("isAttachedToWindow", z8).put("viewBox", new JSONObject().put("top", c1951Uc.zzc.top).put("bottom", c1951Uc.zzc.bottom).put("left", c1951Uc.zzc.left).put("right", c1951Uc.zzc.right)).put("adBox", new JSONObject().put("top", c1951Uc.zzd.top).put("bottom", c1951Uc.zzd.bottom).put("left", c1951Uc.zzd.left).put("right", c1951Uc.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", c1951Uc.zze.top).put("bottom", c1951Uc.zze.bottom).put("left", c1951Uc.zze.left).put("right", c1951Uc.zze.right)).put("globalVisibleBoxVisible", c1951Uc.zzf).put("localVisibleBox", new JSONObject().put("top", c1951Uc.zzg.top).put("bottom", c1951Uc.zzg.bottom).put("left", c1951Uc.zzg.left).put("right", c1951Uc.zzg.right)).put("localVisibleBoxVisible", c1951Uc.zzh).put("hitBox", new JSONObject().put("top", c1951Uc.zzi.top).put("bottom", c1951Uc.zzi.bottom).put("left", c1951Uc.zzi.left).put("right", c1951Uc.zzi.right)).put("screenDensity", this.f18099a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c2674eB.zza);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbq)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = c1951Uc.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c2674eB.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
