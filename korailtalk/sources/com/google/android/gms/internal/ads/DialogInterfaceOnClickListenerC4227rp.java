package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class DialogInterfaceOnClickListenerC4227rp implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22517a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4455tp f22519c;

    DialogInterfaceOnClickListenerC4227rp(C4455tp c4455tp, String str, String str2) {
        this.f22517a = str;
        this.f22518b = str2;
        this.f22519c = c4455tp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.f22519c.f22935d.getSystemService("download");
        try {
            String str = this.f22517a;
            String str2 = this.f22518b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            G1.u.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f22519c.zzh("Could not store picture.");
        }
    }
}
