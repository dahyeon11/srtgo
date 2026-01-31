package e2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.AbstractC5186c;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Map;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5347a extends AbstractC5814a {
    public static final Parcelable.Creator<C5347a> CREATOR = new e();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* renamed from: a, reason: collision with root package name */
    private Intent f30246a;

    /* renamed from: b, reason: collision with root package name */
    private Map f30247b;

    public C5347a(Intent intent) {
        this.f30246a = intent;
    }

    private static int b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final String getCollapseKey() {
        return this.f30246a.getStringExtra(AbstractC5186c.a.COLLAPSE_KEY);
    }

    public final synchronized Map<String, String> getData() {
        try {
            if (this.f30247b == null) {
                Bundle extras = this.f30246a.getExtras();
                O.a aVar = new O.a();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith(AbstractC5186c.a.RESERVED_PREFIX) && !str.equals(AbstractC5186c.a.FROM) && !str.equals(AbstractC5186c.a.MESSAGE_TYPE) && !str.equals(AbstractC5186c.a.COLLAPSE_KEY)) {
                                aVar.put(str, str2);
                            }
                        }
                    }
                }
                this.f30247b = aVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f30247b;
    }

    public final String getFrom() {
        return this.f30246a.getStringExtra(AbstractC5186c.a.FROM);
    }

    public final Intent getIntent() {
        return this.f30246a;
    }

    public final String getMessageId() {
        String stringExtra = this.f30246a.getStringExtra(AbstractC5186c.a.MSGID);
        return stringExtra == null ? this.f30246a.getStringExtra(AbstractC5186c.a.MSGID_SERVER) : stringExtra;
    }

    public final String getMessageType() {
        return this.f30246a.getStringExtra(AbstractC5186c.a.MESSAGE_TYPE);
    }

    public final int getOriginalPriority() {
        String stringExtra = this.f30246a.getStringExtra(AbstractC5186c.a.ORIGINAL_PRIORITY);
        if (stringExtra == null) {
            stringExtra = this.f30246a.getStringExtra(AbstractC5186c.a.PRIORITY_V19);
        }
        return b(stringExtra);
    }

    public final int getPriority() {
        String stringExtra = this.f30246a.getStringExtra(AbstractC5186c.a.DELIVERED_PRIORITY);
        if (stringExtra == null) {
            if ("1".equals(this.f30246a.getStringExtra(AbstractC5186c.a.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            stringExtra = this.f30246a.getStringExtra(AbstractC5186c.a.PRIORITY_V19);
        }
        return b(stringExtra);
    }

    public final byte[] getRawData() {
        return this.f30246a.getByteArrayExtra(AbstractC5186c.a.RAW_DATA);
    }

    public final String getSenderId() {
        return this.f30246a.getStringExtra(AbstractC5186c.a.SENDER_ID);
    }

    public final long getSentTime() {
        Bundle extras = this.f30246a.getExtras();
        Object obj = extras != null ? extras.get(AbstractC5186c.a.SENT_TIME) : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(strValueOf);
            Log.w("CloudMessage", sb.toString());
            return 0L;
        }
    }

    public final String getTo() {
        return this.f30246a.getStringExtra(AbstractC5186c.a.TO);
    }

    public final int getTtl() {
        Bundle extras = this.f30246a.getExtras();
        Object obj = extras != null ? extras.get(AbstractC5186c.a.TTL) : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w("CloudMessage", sb.toString());
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 1, this.f30246a, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
