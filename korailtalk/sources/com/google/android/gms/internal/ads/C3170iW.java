package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.ads.iW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3170iW extends AbstractC3624mW {

    /* renamed from: a, reason: collision with root package name */
    private final String f19941a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19942b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f19943c;

    C3170iW(String str, String str2, Drawable drawable) {
        if (str == null) {
            throw new NullPointerException("Null advertiserName");
        }
        this.f19941a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f19942b = str2;
        this.f19943c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3624mW
    final Drawable a() {
        return this.f19943c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3624mW
    final String b() {
        return this.f19941a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3624mW
    final String c() {
        return this.f19942b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3624mW) {
            AbstractC3624mW abstractC3624mW = (AbstractC3624mW) obj;
            if (this.f19941a.equals(abstractC3624mW.b()) && this.f19942b.equals(abstractC3624mW.c()) && ((drawable = this.f19943c) != null ? drawable.equals(abstractC3624mW.a()) : abstractC3624mW.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f19941a.hashCode() ^ 1000003) * 1000003) ^ this.f19942b.hashCode();
        Drawable drawable = this.f19943c;
        return (iHashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f19941a + ", imageUrl=" + this.f19942b + ", icon=" + String.valueOf(this.f19943c) + "}";
    }
}
