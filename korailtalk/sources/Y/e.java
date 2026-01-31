package Y;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f5523a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5524b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5525c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5526d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5527e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5528f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f5523a = (String) Z.h.checkNotNull(str);
        this.f5524b = (String) Z.h.checkNotNull(str2);
        this.f5525c = (String) Z.h.checkNotNull(str3);
        this.f5526d = (List) Z.h.checkNotNull(list);
        this.f5527e = 0;
        this.f5528f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + g5.e.STATE_NAME_NONE + str2 + g5.e.STATE_NAME_NONE + str3;
    }

    String b() {
        return this.f5528f;
    }

    public List<List<byte[]>> getCertificates() {
        return this.f5526d;
    }

    public int getCertificatesArrayResId() {
        return this.f5527e;
    }

    @Deprecated
    public String getIdentifier() {
        return this.f5528f;
    }

    public String getProviderAuthority() {
        return this.f5523a;
    }

    public String getProviderPackage() {
        return this.f5524b;
    }

    public String getQuery() {
        return this.f5525c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5523a + ", mProviderPackage: " + this.f5524b + ", mQuery: " + this.f5525c + ", mCertificates:");
        for (int i8 = 0; i8 < this.f5526d.size(); i8++) {
            sb.append(" [");
            List list = (List) this.f5526d.get(i8);
            for (int i9 = 0; i9 < list.size(); i9++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f5527e);
        return sb.toString();
    }

    public e(String str, String str2, String str3, int i8) {
        this.f5523a = (String) Z.h.checkNotNull(str);
        this.f5524b = (String) Z.h.checkNotNull(str2);
        this.f5525c = (String) Z.h.checkNotNull(str3);
        this.f5526d = null;
        Z.h.checkArgument(i8 != 0);
        this.f5527e = i8;
        this.f5528f = a(str, str2, str3);
    }
}
