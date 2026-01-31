package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.AbstractC5186c;
import j2.AbstractC5814a;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z extends AbstractC5814a {
    public static final Parcelable.Creator<z> CREATOR = new A();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* renamed from: a, reason: collision with root package name */
    Bundle f25822a;

    /* renamed from: b, reason: collision with root package name */
    private Map f25823b;

    /* renamed from: c, reason: collision with root package name */
    private b f25824c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f25825a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25826b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f25827c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25828d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25829e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f25830f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25831g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25832h;

        /* renamed from: i, reason: collision with root package name */
        private final String f25833i;

        /* renamed from: j, reason: collision with root package name */
        private final String f25834j;

        /* renamed from: k, reason: collision with root package name */
        private final String f25835k;

        /* renamed from: l, reason: collision with root package name */
        private final String f25836l;

        /* renamed from: m, reason: collision with root package name */
        private final String f25837m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f25838n;

        /* renamed from: o, reason: collision with root package name */
        private final String f25839o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f25840p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f25841q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f25842r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f25843s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f25844t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f25845u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f25846v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f25847w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f25848x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f25849y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f25850z;

        private b(y yVar) {
            this.f25825a = yVar.getString("gcm.n.title");
            this.f25826b = yVar.getLocalizationResourceForKey("gcm.n.title");
            this.f25827c = a(yVar, "gcm.n.title");
            this.f25828d = yVar.getString("gcm.n.body");
            this.f25829e = yVar.getLocalizationResourceForKey("gcm.n.body");
            this.f25830f = a(yVar, "gcm.n.body");
            this.f25831g = yVar.getString("gcm.n.icon");
            this.f25833i = yVar.getSoundResourceName();
            this.f25834j = yVar.getString("gcm.n.tag");
            this.f25835k = yVar.getString("gcm.n.color");
            this.f25836l = yVar.getString("gcm.n.click_action");
            this.f25837m = yVar.getString("gcm.n.android_channel_id");
            this.f25838n = yVar.getLink();
            this.f25832h = yVar.getString("gcm.n.image");
            this.f25839o = yVar.getString("gcm.n.ticker");
            this.f25840p = yVar.getInteger("gcm.n.notification_priority");
            this.f25841q = yVar.getInteger("gcm.n.visibility");
            this.f25842r = yVar.getInteger("gcm.n.notification_count");
            this.f25845u = yVar.getBoolean("gcm.n.sticky");
            this.f25846v = yVar.getBoolean("gcm.n.local_only");
            this.f25847w = yVar.getBoolean("gcm.n.default_sound");
            this.f25848x = yVar.getBoolean("gcm.n.default_vibrate_timings");
            this.f25849y = yVar.getBoolean("gcm.n.default_light_settings");
            this.f25844t = yVar.getLong("gcm.n.event_time");
            this.f25843s = yVar.b();
            this.f25850z = yVar.getVibrateTimings();
        }

        private static String[] a(y yVar, String str) {
            Object[] localizationArgsForKey = yVar.getLocalizationArgsForKey(str);
            if (localizationArgsForKey == null) {
                return null;
            }
            String[] strArr = new String[localizationArgsForKey.length];
            for (int i8 = 0; i8 < localizationArgsForKey.length; i8++) {
                strArr[i8] = String.valueOf(localizationArgsForKey[i8]);
            }
            return strArr;
        }

        public String getBody() {
            return this.f25828d;
        }

        public String[] getBodyLocalizationArgs() {
            return this.f25830f;
        }

        public String getBodyLocalizationKey() {
            return this.f25829e;
        }

        public String getChannelId() {
            return this.f25837m;
        }

        public String getClickAction() {
            return this.f25836l;
        }

        public String getColor() {
            return this.f25835k;
        }

        public boolean getDefaultLightSettings() {
            return this.f25849y;
        }

        public boolean getDefaultSound() {
            return this.f25847w;
        }

        public boolean getDefaultVibrateSettings() {
            return this.f25848x;
        }

        public Long getEventTime() {
            return this.f25844t;
        }

        public String getIcon() {
            return this.f25831g;
        }

        public Uri getImageUrl() {
            String str = this.f25832h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public int[] getLightSettings() {
            return this.f25843s;
        }

        public Uri getLink() {
            return this.f25838n;
        }

        public boolean getLocalOnly() {
            return this.f25846v;
        }

        public Integer getNotificationCount() {
            return this.f25842r;
        }

        public Integer getNotificationPriority() {
            return this.f25840p;
        }

        public String getSound() {
            return this.f25833i;
        }

        public boolean getSticky() {
            return this.f25845u;
        }

        public String getTag() {
            return this.f25834j;
        }

        public String getTicker() {
            return this.f25839o;
        }

        public String getTitle() {
            return this.f25825a;
        }

        public String[] getTitleLocalizationArgs() {
            return this.f25827c;
        }

        public String getTitleLocalizationKey() {
            return this.f25826b;
        }

        public long[] getVibrateTimings() {
            return this.f25850z;
        }

        public Integer getVisibility() {
            return this.f25841q;
        }
    }

    public z(Bundle bundle) {
        this.f25822a = bundle;
    }

    private final int b(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    final void c(Intent intent) {
        intent.putExtras(this.f25822a);
    }

    public final String getCollapseKey() {
        return this.f25822a.getString(AbstractC5186c.a.COLLAPSE_KEY);
    }

    public final Map<String, String> getData() {
        if (this.f25823b == null) {
            this.f25823b = AbstractC5186c.a.extractDeveloperDefinedPayload(this.f25822a);
        }
        return this.f25823b;
    }

    public final String getFrom() {
        return this.f25822a.getString(AbstractC5186c.a.FROM);
    }

    public final String getMessageId() {
        String string = this.f25822a.getString(AbstractC5186c.a.MSGID);
        return string == null ? this.f25822a.getString(AbstractC5186c.a.MSGID_SERVER) : string;
    }

    public final String getMessageType() {
        return this.f25822a.getString(AbstractC5186c.a.MESSAGE_TYPE);
    }

    public final b getNotification() {
        if (this.f25824c == null && y.isNotification(this.f25822a)) {
            this.f25824c = new b(new y(this.f25822a));
        }
        return this.f25824c;
    }

    public final int getOriginalPriority() {
        String string = this.f25822a.getString(AbstractC5186c.a.ORIGINAL_PRIORITY);
        if (string == null) {
            string = this.f25822a.getString(AbstractC5186c.a.PRIORITY_V19);
        }
        return b(string);
    }

    public final int getPriority() {
        String string = this.f25822a.getString(AbstractC5186c.a.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(this.f25822a.getString(AbstractC5186c.a.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = this.f25822a.getString(AbstractC5186c.a.PRIORITY_V19);
        }
        return b(string);
    }

    public final byte[] getRawData() {
        return this.f25822a.getByteArray(AbstractC5186c.a.RAW_DATA);
    }

    public final String getSenderId() {
        return this.f25822a.getString(AbstractC5186c.a.SENDER_ID);
    }

    public final long getSentTime() {
        Object obj = this.f25822a.get(AbstractC5186c.a.SENT_TIME);
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
            Log.w(AbstractC5186c.TAG, sb.toString());
            return 0L;
        }
    }

    public final String getTo() {
        return this.f25822a.getString(AbstractC5186c.a.TO);
    }

    public final int getTtl() {
        Object obj = this.f25822a.get(AbstractC5186c.a.TTL);
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
            Log.w(AbstractC5186c.TAG, sb.toString());
            return 0;
        }
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.f25822a);
        return intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        A.a(this, parcel, i8);
    }
}
