package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.sp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC4341sp implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4455tp f22689a;

    DialogInterfaceOnClickListenerC4341sp(C4455tp c4455tp) {
        this.f22689a = c4455tp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) throws JSONException {
        this.f22689a.zzh("User canceled the download.");
    }
}
