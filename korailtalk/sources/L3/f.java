package l3;

import android.content.Context;
import android.text.TextUtils;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import i2.C5686s;
import o2.r;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f33972a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33973b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33974c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33975d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33976e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33977f;

    /* renamed from: g, reason: collision with root package name */
    private final String f33978g;

    private f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5683p.checkState(!r.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f33973b = str;
        this.f33972a = str2;
        this.f33974c = str3;
        this.f33975d = str4;
        this.f33976e = str5;
        this.f33977f = str6;
        this.f33978g = str7;
    }

    public static f fromResource(Context context) {
        C5686s c5686s = new C5686s(context);
        String string = c5686s.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new f(string, c5686s.getString("google_api_key"), c5686s.getString("firebase_database_url"), c5686s.getString("ga_trackingId"), c5686s.getString("gcm_defaultSenderId"), c5686s.getString("google_storage_bucket"), c5686s.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC5681n.equal(this.f33973b, fVar.f33973b) && AbstractC5681n.equal(this.f33972a, fVar.f33972a) && AbstractC5681n.equal(this.f33974c, fVar.f33974c) && AbstractC5681n.equal(this.f33975d, fVar.f33975d) && AbstractC5681n.equal(this.f33976e, fVar.f33976e) && AbstractC5681n.equal(this.f33977f, fVar.f33977f) && AbstractC5681n.equal(this.f33978g, fVar.f33978g);
    }

    public String getApiKey() {
        return this.f33972a;
    }

    public String getApplicationId() {
        return this.f33973b;
    }

    public String getDatabaseUrl() {
        return this.f33974c;
    }

    public String getGaTrackingId() {
        return this.f33975d;
    }

    public String getGcmSenderId() {
        return this.f33976e;
    }

    public String getProjectId() {
        return this.f33978g;
    }

    public String getStorageBucket() {
        return this.f33977f;
    }

    public int hashCode() {
        return AbstractC5681n.hashCode(this.f33973b, this.f33972a, this.f33974c, this.f33975d, this.f33976e, this.f33977f, this.f33978g);
    }

    public String toString() {
        return AbstractC5681n.toStringHelper(this).add("applicationId", this.f33973b).add("apiKey", this.f33972a).add("databaseUrl", this.f33974c).add("gcmSenderId", this.f33976e).add("storageBucket", this.f33977f).add("projectId", this.f33978g).toString();
    }
}
