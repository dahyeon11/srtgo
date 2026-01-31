package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.j256.ormlite.stmt.query.SimpleComparison;

/* renamed from: com.google.android.gms.internal.ads.Va0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1989Va0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2487cb f16871a;

    public C1989Va0(C2487cb c2487cb) {
        this.f16871a = c2487cb;
    }

    private static final Uri a(Uri uri, String str) throws C2602db {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new C2602db("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i8 = iIndexOf + 1;
                                StringBuilder sb = new StringBuilder(string.substring(0, i8));
                                sb.append("dc_ms");
                                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                                sb.append(str);
                                sb.append(";");
                                sb.append((CharSequence) string, i8, string.length());
                                return Uri.parse(sb.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb2.append(";");
                            sb2.append("dc_ms");
                            sb2.append(SimpleComparison.EQUAL_TO_OPERATION);
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb2.toString());
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new C2602db("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
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
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i9));
        sb3.append("ms");
        sb3.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) string2, i9, string2.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws C2602db {
        try {
            return a(uri, this.f16871a.zzc().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C2602db("Provided Uri is not in a valid state");
        }
    }
}
