package l2;

import android.util.Log;
import i2.C5676i;
import java.util.Locale;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5888a {

    /* renamed from: a, reason: collision with root package name */
    private final String f33950a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33951b;

    /* renamed from: c, reason: collision with root package name */
    private final C5676i f33952c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33953d;

    public C5888a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f33951b = string;
        this.f33950a = str;
        this.f33952c = new C5676i(str);
        int i8 = 2;
        while (i8 <= 7 && !Log.isLoggable(this.f33950a, i8)) {
            i8++;
        }
        this.f33953d = i8;
    }

    protected String a(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f33951b.concat(str);
    }

    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            a(str, objArr);
        }
    }

    public void e(String str, Throwable th, Object... objArr) {
        Log.e(this.f33950a, a(str, objArr), th);
    }

    public String getTag() {
        return this.f33950a;
    }

    public void i(String str, Object... objArr) {
        a(str, objArr);
    }

    public boolean isLoggable(int i8) {
        return this.f33953d <= i8;
    }

    public void v(String str, Throwable th, Object... objArr) {
        if (isLoggable(2)) {
            a(str, objArr);
        }
    }

    public void w(String str, Object... objArr) {
        Log.w(this.f33950a, a(str, objArr));
    }

    public void wtf(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f33950a, a(str, objArr), th);
    }

    public void e(String str, Object... objArr) {
        Log.e(this.f33950a, a(str, objArr));
    }

    public void wtf(Throwable th) {
        Log.wtf(this.f33950a, th);
    }

    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            a(str, objArr);
        }
    }
}
