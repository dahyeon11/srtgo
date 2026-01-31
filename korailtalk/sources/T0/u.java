package T0;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f4841a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4842b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4843c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4844d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4845e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f4846f;

    public u(int i8, int i9, String str, String str2, String str3) {
        this.f4841a = i8;
        this.f4842b = i9;
        this.f4843c = str;
        this.f4844d = str2;
        this.f4845e = str3;
    }

    public Bitmap getBitmap() {
        return this.f4846f;
    }

    public String getDirName() {
        return this.f4845e;
    }

    public String getFileName() {
        return this.f4844d;
    }

    public int getHeight() {
        return this.f4842b;
    }

    public String getId() {
        return this.f4843c;
    }

    public int getWidth() {
        return this.f4841a;
    }

    public boolean hasBitmap() {
        return this.f4846f != null || (this.f4844d.startsWith("data:") && this.f4844d.indexOf("base64,") > 0);
    }

    public void setBitmap(Bitmap bitmap) {
        this.f4846f = bitmap;
    }
}
