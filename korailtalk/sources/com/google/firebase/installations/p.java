package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
class p {
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f25736a = Pattern.compile("\\AA[\\w-]{38}\\z");

    p() {
    }

    static boolean a(String str) {
        return f25736a.matcher(str).matches();
    }

    static boolean b(String str) {
        return str.contains(":");
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean isAuthTokenExpired(v3.d dVar) {
        return TextUtils.isEmpty(dVar.getAuthToken()) || dVar.getTokenCreationEpochInSecs() + dVar.getExpiresInSecs() < currentTimeInSecs() + AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }
}
