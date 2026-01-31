package C6;

import C6.a;
import android.util.Log;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0012a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f423a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static String f424b = "NaverLogin|";

    private b() {
    }

    public static b getInstance() {
        return f423a;
    }

    @Override // C6.a.InterfaceC0012a
    public void d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(f424b);
        sb.append(str);
    }

    @Override // C6.a.InterfaceC0012a
    public void e(String str, String str2) {
        Log.e(f424b + str, str2);
    }

    @Override // C6.a.InterfaceC0012a
    public void i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(f424b);
        sb.append(str);
    }

    @Override // C6.a.InterfaceC0012a
    public void setTagPrefix(String str) {
        f424b = str;
    }

    @Override // C6.a.InterfaceC0012a
    public void v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(f424b);
        sb.append(str);
    }

    @Override // C6.a.InterfaceC0012a
    public void w(String str, String str2) {
        Log.w(f424b + str, str2);
    }

    @Override // C6.a.InterfaceC0012a
    public void write(int i8, String str, String str2) {
        Log.println(i8, f424b + str, str2);
    }

    public static b getInstance(String str) {
        b bVar = f423a;
        bVar.setTagPrefix(str);
        return bVar;
    }
}
