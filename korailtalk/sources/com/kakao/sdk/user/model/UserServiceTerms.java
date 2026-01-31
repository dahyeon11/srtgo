package com.kakao.sdk.user.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class UserServiceTerms {
    private final List<ServiceTerms> allowedServiceTerms;
    private final List<AppServiceTerms> appServiceTerms;
    private final Long userId;

    public UserServiceTerms(Long l8, List<ServiceTerms> list, List<AppServiceTerms> list2) {
        this.userId = l8;
        this.allowedServiceTerms = list;
        this.appServiceTerms = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserServiceTerms copy$default(UserServiceTerms userServiceTerms, Long l8, List list, List list2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = userServiceTerms.userId;
        }
        if ((i8 & 2) != 0) {
            list = userServiceTerms.allowedServiceTerms;
        }
        if ((i8 & 4) != 0) {
            list2 = userServiceTerms.appServiceTerms;
        }
        return userServiceTerms.copy(l8, list, list2);
    }

    public final Long component1() {
        return this.userId;
    }

    public final List<ServiceTerms> component2() {
        return this.allowedServiceTerms;
    }

    public final List<AppServiceTerms> component3() {
        return this.appServiceTerms;
    }

    public final UserServiceTerms copy(Long l8, List<ServiceTerms> list, List<AppServiceTerms> list2) {
        return new UserServiceTerms(l8, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserServiceTerms)) {
            return false;
        }
        UserServiceTerms userServiceTerms = (UserServiceTerms) obj;
        return Intrinsics.areEqual(this.userId, userServiceTerms.userId) && Intrinsics.areEqual(this.allowedServiceTerms, userServiceTerms.allowedServiceTerms) && Intrinsics.areEqual(this.appServiceTerms, userServiceTerms.appServiceTerms);
    }

    public final List<ServiceTerms> getAllowedServiceTerms() {
        return this.allowedServiceTerms;
    }

    public final List<AppServiceTerms> getAppServiceTerms() {
        return this.appServiceTerms;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l8 = this.userId;
        int iHashCode = (l8 == null ? 0 : l8.hashCode()) * 31;
        List<ServiceTerms> list = this.allowedServiceTerms;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AppServiceTerms> list2 = this.appServiceTerms;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "UserServiceTerms(userId=" + this.userId + ", allowedServiceTerms=" + this.allowedServiceTerms + ", appServiceTerms=" + this.appServiceTerms + ')';
    }
}
