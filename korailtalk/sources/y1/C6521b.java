package y1;

import H1.C0534f1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6521b {
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: a, reason: collision with root package name */
    private final int f37566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37567b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37568c;

    /* renamed from: d, reason: collision with root package name */
    private final C6521b f37569d;

    public C6521b(int i8, String str, String str2, C6521b c6521b) {
        this.f37566a = i8;
        this.f37567b = str;
        this.f37568c = str2;
        this.f37569d = c6521b;
    }

    public C6521b getCause() {
        return this.f37569d;
    }

    public int getCode() {
        return this.f37566a;
    }

    public String getDomain() {
        return this.f37568c;
    }

    public String getMessage() {
        return this.f37567b;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final C0534f1 zza() {
        C0534f1 c0534f1;
        C6521b c6521b = this.f37569d;
        if (c6521b == null) {
            c0534f1 = null;
        } else {
            String str = c6521b.f37568c;
            c0534f1 = new C0534f1(c6521b.f37566a, c6521b.f37567b, str, null, null);
        }
        return new C0534f1(this.f37566a, this.f37567b, this.f37568c, c0534f1, null);
    }

    public JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f37566a);
        jSONObject.put("Message", this.f37567b);
        jSONObject.put("Domain", this.f37568c);
        C6521b c6521b = this.f37569d;
        if (c6521b == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", c6521b.zzb());
        }
        return jSONObject;
    }

    public C6521b(int i8, String str, String str2) {
        this(i8, str, str2, null);
    }
}
