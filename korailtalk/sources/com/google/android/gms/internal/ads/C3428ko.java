package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3428ko implements N1.f {

    /* renamed from: a, reason: collision with root package name */
    private final Date f20468a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20469b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f20470c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20471d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f20472e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20473f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20474g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20475h;

    public C3428ko(Date date, int i8, Set set, Location location, boolean z8, int i9, boolean z9, int i10, String str) {
        this.f20468a = date;
        this.f20469b = i8;
        this.f20470c = set;
        this.f20472e = location;
        this.f20471d = z8;
        this.f20473f = i9;
        this.f20474g = z9;
        this.f20475h = str;
    }

    @Override // N1.f
    @Deprecated
    public final Date getBirthday() {
        return this.f20468a;
    }

    @Override // N1.f
    @Deprecated
    public final int getGender() {
        return this.f20469b;
    }

    @Override // N1.f
    public final Set<String> getKeywords() {
        return this.f20470c;
    }

    @Override // N1.f
    public final Location getLocation() {
        return this.f20472e;
    }

    @Override // N1.f
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f20474g;
    }

    @Override // N1.f
    public final boolean isTesting() {
        return this.f20471d;
    }

    @Override // N1.f
    public final int taggedForChildDirectedTreatment() {
        return this.f20473f;
    }
}
