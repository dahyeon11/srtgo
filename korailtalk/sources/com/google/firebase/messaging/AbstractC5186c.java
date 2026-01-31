package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5186c {
    public static final String FCM_WAKE_LOCK = "wake:com.google.firebase.messaging";
    public static final String IPC_BUNDLE_KEY_SEND_ERROR = "error";
    public static final String TAG = "FirebaseMessaging";
    public static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.c$a */
    public static final class a {
        public static final String COLLAPSE_KEY = "collapse_key";
        public static final String DELIVERED_PRIORITY = "google.delivered_priority";
        public static final String FROM = "from";
        public static final String MESSAGE_TYPE = "message_type";
        public static final String MSGID = "google.message_id";
        public static final String MSGID_SERVER = "message_id";
        public static final String ORIGINAL_PRIORITY = "google.original_priority";
        public static final String PRIORITY_REDUCED_V19 = "google.priority_reduced";
        public static final String PRIORITY_V19 = "google.priority";
        public static final String RAW_DATA = "rawData";
        public static final String RESERVED_CLIENT_LIB_PREFIX = "google.c.";
        public static final String RESERVED_PREFIX = "google.";
        public static final String SENDER_ID = "google.c.sender.id";
        public static final String SENT_TIME = "google.sent_time";
        public static final String TO = "google.to";
        public static final String TTL = "google.ttl";

        public static O.a extractDeveloperDefinedPayload(Bundle bundle) {
            O.a aVar = new O.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith(RESERVED_PREFIX) && !str.startsWith("gcm.") && !str.equals(FROM) && !str.equals(MESSAGE_TYPE) && !str.equals(COLLAPSE_KEY)) {
                        aVar.put(str, str2);
                    }
                }
            }
            return aVar;
        }
    }
}
