package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f26040a;

    public f(String str) {
        this.f26040a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f26040a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f26040a;
        String str2 = ((f) obj).f26040a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f26040a);
    }

    public int hashCode() {
        return this.f26040a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f26040a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f26040a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f26040a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f26040a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f26040a).longValue();
        }
    }

    public String toString() {
        return this.f26040a;
    }
}
