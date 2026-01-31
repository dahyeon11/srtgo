package androidx.media;

import android.text.TextUtils;

/* loaded from: classes.dex */
class k implements d {

    /* renamed from: a, reason: collision with root package name */
    private String f10099a;

    /* renamed from: b, reason: collision with root package name */
    private int f10100b;

    /* renamed from: c, reason: collision with root package name */
    private int f10101c;

    k(String str, int i8, int i9) {
        this.f10099a = str;
        this.f10100b = i8;
        this.f10101c = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return TextUtils.equals(this.f10099a, kVar.f10099a) && this.f10100b == kVar.f10100b && this.f10101c == kVar.f10101c;
    }

    @Override // androidx.media.d
    public String getPackageName() {
        return this.f10099a;
    }

    @Override // androidx.media.d
    public int getPid() {
        return this.f10100b;
    }

    @Override // androidx.media.d
    public int getUid() {
        return this.f10101c;
    }

    public int hashCode() {
        return Z.c.hash(this.f10099a, Integer.valueOf(this.f10100b), Integer.valueOf(this.f10101c));
    }
}
