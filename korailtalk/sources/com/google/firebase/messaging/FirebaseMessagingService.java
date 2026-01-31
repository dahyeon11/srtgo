package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.AbstractC5186c;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC5191h {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable(AbstractC5186c.TAG, 3)) {
            return true;
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() == 0) {
            return true;
        }
        "Received duplicate message: ".concat(strValueOf);
        return true;
    }

    private void d(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (y.isNotification(extras)) {
            y yVar = new y(extras);
            ExecutorService executorServiceD = AbstractC5192i.d();
            try {
                if (new C5187d(this, yVar, executorServiceD).a()) {
                    return;
                }
                executorServiceD.shutdown();
                if (x.shouldUploadScionMetrics(intent)) {
                    x.logNotificationForeground(intent);
                }
            } finally {
                executorServiceD.shutdown();
            }
        }
        onMessageReceived(new z(extras));
    }

    private String e(Intent intent) {
        String stringExtra = intent.getStringExtra(AbstractC5186c.a.MSGID);
        return stringExtra == null ? intent.getStringExtra(AbstractC5186c.a.MSGID_SERVER) : stringExtra;
    }

    private void f(Intent intent) {
        if (c(intent.getStringExtra(AbstractC5186c.a.MSGID))) {
            return;
        }
        h(intent);
    }

    private void g(Intent intent) {
        if (x.shouldUploadScionMetrics(intent)) {
            x.logNotificationOpen(intent);
        }
    }

    private void h(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra(AbstractC5186c.a.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                x.logNotificationReceived(intent);
                d(intent);
                break;
            case "send_error":
                onSendError(e(intent), new B(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(AbstractC5186c.a.MSGID));
                break;
            default:
                Log.w(AbstractC5186c.TAG, stringExtra.length() != 0 ? "Received message with unknown type: ".concat(stringExtra) : new String("Received message with unknown type: "));
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC5191h
    protected Intent getStartCommandIntent(Intent intent) {
        return com.google.firebase.iid.w.getInstance().getMessagingEvent();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC5191h
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            f(intent);
            return;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (x.shouldUploadScionMetrics(intent)) {
                x.logNotificationDismiss(intent);
            }
        } else {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                onNewToken(intent.getStringExtra("token"));
                return;
            }
            String strValueOf = String.valueOf(intent.getAction());
            if (strValueOf.length() != 0) {
                "Unknown intent action: ".concat(strValueOf);
            }
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC5191h
    public boolean handleIntentOnMainThread(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        g(intent);
        return true;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(z zVar) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
