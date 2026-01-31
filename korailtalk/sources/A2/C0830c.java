package a2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0830c extends AbstractC5814a {
    public static final Parcelable.Creator<C0830c> CREATOR = new C0832e();
    public static final int STATUS_CODE_NO_CONNECTION = -1;

    /* renamed from: a, reason: collision with root package name */
    private final int f5861a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f5862b;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;

    C0830c(int i8, int i9, PendingIntent pendingIntent, int i10, Bundle bundle, byte[] bArr) {
        this.f5861a = i8;
        this.googlePlayServicesStatusCode = i9;
        this.statusCode = i10;
        this.f5862b = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    private static Bundle b(Map map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static C0830c createErrorProxyResponse(int i8, PendingIntent pendingIntent, int i9, Map<String, String> map, byte[] bArr) {
        return new C0830c(1, i8, pendingIntent, i9, b(map), bArr);
    }

    public Map<String, String> getHeaders() {
        if (this.f5862b == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        for (String str : this.f5862b.keySet()) {
            map.put(str, this.f5862b.getString(str));
        }
        return map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.googlePlayServicesStatusCode);
        AbstractC5816c.writeParcelable(parcel, 2, this.recoveryAction, i8, false);
        AbstractC5816c.writeInt(parcel, 3, this.statusCode);
        AbstractC5816c.writeBundle(parcel, 4, this.f5862b, false);
        AbstractC5816c.writeByteArray(parcel, 5, this.body, false);
        AbstractC5816c.writeInt(parcel, 1000, this.f5861a);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C0830c(int i8, PendingIntent pendingIntent, int i9, Bundle bundle, byte[] bArr) {
        this(1, i8, pendingIntent, i9, bundle, bArr);
    }

    private C0830c(int i8, Bundle bundle, byte[] bArr) {
        this(1, 0, null, i8, bundle, bArr);
    }

    public C0830c(int i8, Map<String, String> map, byte[] bArr) {
        this(i8, b(map), bArr);
    }
}
