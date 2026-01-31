package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ww, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4811ww implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5039yw f23563a;

    C4811ww(ViewTreeObserverOnGlobalLayoutListenerC5039yw viewTreeObserverOnGlobalLayoutListenerC5039yw) {
        this.f23563a = viewTreeObserverOnGlobalLayoutListenerC5039yw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i8 = Integer.parseInt(str);
                synchronized (this.f23563a) {
                    try {
                        ViewTreeObserverOnGlobalLayoutListenerC5039yw viewTreeObserverOnGlobalLayoutListenerC5039yw = this.f23563a;
                        if (viewTreeObserverOnGlobalLayoutListenerC5039yw.f24029H != i8) {
                            viewTreeObserverOnGlobalLayoutListenerC5039yw.f24029H = i8;
                            this.f23563a.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e8) {
                L1.n.zzk("Exception occurred while getting webview content height", e8);
            }
        }
    }
}
