package a2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0829b extends AbstractC5814a {
    public static final int VERSION_CODE = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f5859a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f5860b;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    public static final Parcelable.Creator<C0829b> CREATOR = new C0831d();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    C0829b(int i8, String str, int i9, long j8, byte[] bArr, Bundle bundle) {
        this.f5859a = i8;
        this.url = str;
        this.httpMethod = i9;
        this.timeoutMillis = j8;
        this.body = bArr;
        this.f5860b = bundle;
    }

    public Map<String, String> getHeaderMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f5860b.size());
        for (String str : this.f5860b.keySet()) {
            linkedHashMap.put(str, this.f5860b.getString(str));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = this.url;
        int i8 = this.httpMethod;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i8);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, this.url, false);
        AbstractC5816c.writeInt(parcel, 2, this.httpMethod);
        AbstractC5816c.writeLong(parcel, 3, this.timeoutMillis);
        AbstractC5816c.writeByteArray(parcel, 4, this.body, false);
        AbstractC5816c.writeBundle(parcel, 5, this.f5860b, false);
        AbstractC5816c.writeInt(parcel, 1000, this.f5859a);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
