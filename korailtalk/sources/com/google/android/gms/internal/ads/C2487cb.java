package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.j256.ormlite.stmt.query.SimpleComparison;

/* renamed from: com.google.android.gms.internal.ads.cb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2487cb {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f18327d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private final String f18328a = "ad.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private final String[] f18329b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2070Xa f18330c;

    @Deprecated
    public C2487cb(InterfaceC2070Xa interfaceC2070Xa) {
        this.f18330c = interfaceC2070Xa;
    }

    private final Uri a(Uri uri, String str) throws C2602db {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f18328a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new C2602db("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i8 = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i8) + "dc_ms" + SimpleComparison.EQUAL_TO_OPERATION + str + ";" + string.substring(i8));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms" + SimpleComparison.EQUAL_TO_OPERATION + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new C2602db("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i9 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i9) + "ms" + SimpleComparison.EQUAL_TO_OPERATION + str + "&" + string2.substring(i9));
        } catch (UnsupportedOperationException unused2) {
            throw new C2602db("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws C2602db {
        try {
            return a(uri, this.f18330c.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C2602db("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) {
        return a(uri, this.f18330c.zzg(context));
    }

    @Deprecated
    public final InterfaceC2070Xa zzc() {
        return this.f18330c;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.f18330c.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = f18327d;
            for (int i8 = 0; i8 < 3; i8++) {
                if (uri.getPath().endsWith(strArr[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f18329b;
            for (int i8 = 0; i8 < 3; i8++) {
                if (host.endsWith(strArr[i8])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
