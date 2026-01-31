package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4797wp {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2065Wv f23546a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23547b;

    public C4797wp(InterfaceC2065Wv interfaceC2065Wv, String str) {
        this.f23546a = interfaceC2065Wv;
        this.f23547b = str;
    }

    public final void zzg(int i8, int i9, int i10, int i11) throws JSONException {
        try {
            this.f23546a.zze("onDefaultPositionReceived", new JSONObject().put("x", i8).put("y", i9).put("width", i10).put("height", i11));
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while dispatching default position.", e8);
        }
    }

    public final void zzh(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f23547b);
            InterfaceC2065Wv interfaceC2065Wv = this.f23546a;
            if (interfaceC2065Wv != null) {
                interfaceC2065Wv.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while dispatching error event.", e8);
        }
    }

    public final void zzi(String str) throws JSONException {
        try {
            this.f23546a.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while dispatching ready Event.", e8);
        }
    }

    public final void zzj(int i8, int i9, int i10, int i11, float f8, int i12) throws JSONException {
        try {
            this.f23546a.zze("onScreenInfoChanged", new JSONObject().put("width", i8).put("height", i9).put("maxSizeWidth", i10).put("maxSizeHeight", i11).put("density", f8).put("rotation", i12));
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while obtaining screen information.", e8);
        }
    }

    public final void zzk(int i8, int i9, int i10, int i11) throws JSONException {
        try {
            this.f23546a.zze("onSizeChanged", new JSONObject().put("x", i8).put("y", i9).put("width", i10).put("height", i11));
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while dispatching size change.", e8);
        }
    }

    public final void zzl(String str) throws JSONException {
        try {
            this.f23546a.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e8) {
            L1.n.zzh("Error occurred while dispatching state change.", e8);
        }
    }
}
