package com.kakao.sdk.user.model;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AppServiceTerms {
    private final Date createdAt;
    private final String tag;
    private final Date updatedAt;

    public AppServiceTerms(String tag, Date createdAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.tag = tag;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ AppServiceTerms copy$default(AppServiceTerms appServiceTerms, String str, Date date, Date date2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = appServiceTerms.tag;
        }
        if ((i8 & 2) != 0) {
            date = appServiceTerms.createdAt;
        }
        if ((i8 & 4) != 0) {
            date2 = appServiceTerms.updatedAt;
        }
        return appServiceTerms.copy(str, date, date2);
    }

    public final String component1() {
        return this.tag;
    }

    public final Date component2() {
        return this.createdAt;
    }

    public final Date component3() {
        return this.updatedAt;
    }

    public final AppServiceTerms copy(String tag, Date createdAt, Date updatedAt) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new AppServiceTerms(tag, createdAt, updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppServiceTerms)) {
            return false;
        }
        AppServiceTerms appServiceTerms = (AppServiceTerms) obj;
        return Intrinsics.areEqual(this.tag, appServiceTerms.tag) && Intrinsics.areEqual(this.createdAt, appServiceTerms.createdAt) && Intrinsics.areEqual(this.updatedAt, appServiceTerms.updatedAt);
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (((this.tag.hashCode() * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        return "AppServiceTerms(tag=" + this.tag + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ')';
    }
}
