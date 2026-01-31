package com.google.firebase.iid;

import I2.AbstractC0608l;
import I2.InterfaceC0599c;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import e2.C5349c;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
public class o {
    public static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";

    /* renamed from: a */
    private final l3.c f25659a;

    /* renamed from: b */
    private final r f25660b;

    /* renamed from: c */
    private final C5349c f25661c;

    /* renamed from: d */
    private final InterfaceC6416a f25662d;

    /* renamed from: e */
    private final InterfaceC6416a f25663e;

    /* renamed from: f */
    private final com.google.firebase.installations.h f25664f;

    public o(l3.c cVar, r rVar, InterfaceC6416a interfaceC6416a, InterfaceC6416a interfaceC6416a2, com.google.firebase.installations.h hVar) {
        this(cVar, rVar, new C5349c(cVar.getApplicationContext()), interfaceC6416a, interfaceC6416a2, hVar);
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC0608l b(AbstractC0608l abstractC0608l) {
        return abstractC0608l.continueWith(h.a(), new InterfaceC0599c(this) { // from class: com.google.firebase.iid.n

            /* renamed from: a, reason: collision with root package name */
            private final o f25658a;

            {
                this.f25658a = this;
            }

            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l2) {
                return this.f25658a.f(abstractC0608l2);
            }
        });
    }

    private String c() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f25659a.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String d(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(strValueOf);
        Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
        throw new IOException(ERROR_SERVICE_NOT_AVAILABLE);
    }

    static boolean e(String str) {
        return ERROR_SERVICE_NOT_AVAILABLE.equals(str) || ERROR_INTERNAL_SERVER_ERROR.equals(str) || "InternalServerError".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle g(java.lang.String r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "scope"
            r6.putString(r1, r5)
            java.lang.String r5 = "sender"
            r6.putString(r5, r4)
            java.lang.String r5 = "subtype"
            r6.putString(r5, r4)
            java.lang.String r4 = "appid"
            r6.putString(r4, r3)
            l3.c r3 = r2.f25659a
            l3.f r3 = r3.getOptions()
            java.lang.String r3 = r3.getApplicationId()
            java.lang.String r4 = "gmp_app_id"
            r6.putString(r4, r3)
            com.google.firebase.iid.r r3 = r2.f25660b
            int r3 = r3.getGmsVersionCode()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r6.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r6.putString(r4, r3)
            com.google.firebase.iid.r r3 = r2.f25660b
            java.lang.String r3 = r3.getAppVersionCode()
            java.lang.String r4 = "app_ver"
            r6.putString(r4, r3)
            com.google.firebase.iid.r r3 = r2.f25660b
            java.lang.String r3 = r3.getAppVersionName()
            java.lang.String r4 = "app_ver_name"
            r6.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.c()
            r6.putString(r3, r4)
            com.google.firebase.installations.h r3 = r2.f25664f     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            r4 = 0
            I2.l r3 = r3.getToken(r4)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            java.lang.Object r3 = I2.AbstractC0611o.await(r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            com.google.firebase.installations.m r3 = (com.google.firebase.installations.m) r3     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            java.lang.String r3 = r3.getToken()     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            if (r4 != 0) goto L7f
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r6.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            goto L8a
        L7b:
            r3 = move-exception
            goto L85
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L7b java.util.concurrent.ExecutionException -> L7d
            goto L8a
        L85:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L8a:
            java.lang.String r3 = "21.0.0"
            int r4 = r3.length()
            java.lang.String r5 = "fiid-"
            if (r4 == 0) goto L99
            java.lang.String r3 = r5.concat(r3)
            goto L9e
        L99:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L9e:
            java.lang.String r4 = "cliv"
            r6.putString(r4, r3)
            u3.a r3 = r2.f25663e
            java.lang.Object r3 = r3.get()
            s3.c r3 = (s3.InterfaceC6215c) r3
            u3.a r4 = r2.f25662d
            java.lang.Object r4 = r4.get()
            y3.h r4 = (y3.h) r4
            if (r3 == 0) goto Ld7
            if (r4 == 0) goto Ld7
            java.lang.String r5 = "fire-iid"
            s3.c$a r3 = r3.getHeartBeatCode(r5)
            s3.c$a r5 = s3.InterfaceC6215c.a.NONE
            if (r3 == r5) goto Ld7
            int r3 = r3.getCode()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r5 = "Firebase-Client-Log-Type"
            r6.putString(r5, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.getUserAgent()
            r6.putString(r3, r4)
        Ld7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.o.g(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    private AbstractC0608l h(String str, String str2, String str3, Bundle bundle) {
        g(str, str2, str3, bundle);
        return this.f25661c.send(bundle);
    }

    public AbstractC0608l deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return b(h(str, "*", "*", bundle));
    }

    public AbstractC0608l deleteToken(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return b(h(str, str2, str3, bundle));
    }

    final /* synthetic */ String f(AbstractC0608l abstractC0608l) {
        return d((Bundle) abstractC0608l.getResult(IOException.class));
    }

    public AbstractC0608l getToken(String str, String str2, String str3) {
        return b(h(str, str2, str3, new Bundle()));
    }

    public AbstractC0608l subscribeToTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return b(h(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    public AbstractC0608l unsubscribeFromTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String strValueOf2 = String.valueOf(str3);
        return b(h(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    o(l3.c cVar, r rVar, C5349c c5349c, InterfaceC6416a interfaceC6416a, InterfaceC6416a interfaceC6416a2, com.google.firebase.installations.h hVar) {
        this.f25659a = cVar;
        this.f25660b = rVar;
        this.f25661c = c5349c;
        this.f25662d = interfaceC6416a;
        this.f25663e = interfaceC6416a2;
        this.f25664f = hVar;
    }
}
