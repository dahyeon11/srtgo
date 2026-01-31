package com.kakao.sdk.user.model;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ServiceTerms {
    private final Date agreedAt;
    private final String tag;

    public ServiceTerms(String tag, Date agreedAt) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(agreedAt, "agreedAt");
        this.tag = tag;
        this.agreedAt = agreedAt;
    }

    public static /* synthetic */ ServiceTerms copy$default(ServiceTerms serviceTerms, String str, Date date, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = serviceTerms.tag;
        }
        if ((i8 & 2) != 0) {
            date = serviceTerms.agreedAt;
        }
        return serviceTerms.copy(str, date);
    }

    public final String component1() {
        return this.tag;
    }

    public final Date component2() {
        return this.agreedAt;
    }

    public final ServiceTerms copy(String tag, Date agreedAt) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(agreedAt, "agreedAt");
        return new ServiceTerms(tag, agreedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceTerms)) {
            return false;
        }
        ServiceTerms serviceTerms = (ServiceTerms) obj;
        return Intrinsics.areEqual(this.tag, serviceTerms.tag) && Intrinsics.areEqual(this.agreedAt, serviceTerms.agreedAt);
    }

    public final Date getAgreedAt() {
        return this.agreedAt;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.agreedAt.hashCode();
    }

    public String toString() {
        return "ServiceTerms(tag=" + this.tag + ", agreedAt=" + this.agreedAt + ')';
    }
}
