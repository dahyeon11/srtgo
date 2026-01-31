package H1;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: H1.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572s1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1740a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f1741b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1742c;

    public C0572s1(String str, Bundle bundle, String str2) {
        this.f1740a = str;
        this.f1741b = bundle;
        this.f1742c = str2;
    }

    public final Bundle zza() {
        return this.f1741b;
    }

    public final String zzb() {
        return this.f1740a;
    }

    public final String zzc() {
        if (!TextUtils.isEmpty(this.f1742c)) {
            try {
                return new JSONObject(this.f1742c).optString("request_id", "");
            } catch (JSONException unused) {
            }
        }
        return "";
    }
}
