package com.kakao.sdk.user.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public final class UserShippingAddresses {

    @InterfaceC6622c("shipping_addresses_needs_agreement")
    private final Boolean needsAgreement;
    private final List<ShippingAddress> shippingAddresses;
    private final Long userId;

    public UserShippingAddresses(Long l8, Boolean bool, List<ShippingAddress> list) {
        this.userId = l8;
        this.needsAgreement = bool;
        this.shippingAddresses = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserShippingAddresses copy$default(UserShippingAddresses userShippingAddresses, Long l8, Boolean bool, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = userShippingAddresses.userId;
        }
        if ((i8 & 2) != 0) {
            bool = userShippingAddresses.needsAgreement;
        }
        if ((i8 & 4) != 0) {
            list = userShippingAddresses.shippingAddresses;
        }
        return userShippingAddresses.copy(l8, bool, list);
    }

    public final Long component1() {
        return this.userId;
    }

    public final Boolean component2() {
        return this.needsAgreement;
    }

    public final List<ShippingAddress> component3() {
        return this.shippingAddresses;
    }

    public final UserShippingAddresses copy(Long l8, Boolean bool, List<ShippingAddress> list) {
        return new UserShippingAddresses(l8, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserShippingAddresses)) {
            return false;
        }
        UserShippingAddresses userShippingAddresses = (UserShippingAddresses) obj;
        return Intrinsics.areEqual(this.userId, userShippingAddresses.userId) && Intrinsics.areEqual(this.needsAgreement, userShippingAddresses.needsAgreement) && Intrinsics.areEqual(this.shippingAddresses, userShippingAddresses.shippingAddresses);
    }

    public final Boolean getNeedsAgreement() {
        return this.needsAgreement;
    }

    public final List<ShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l8 = this.userId;
        int iHashCode = (l8 == null ? 0 : l8.hashCode()) * 31;
        Boolean bool = this.needsAgreement;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ShippingAddress> list = this.shippingAddresses;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UserShippingAddresses(userId=" + this.userId + ", needsAgreement=" + this.needsAgreement + ", shippingAddresses=" + this.shippingAddresses + ')';
    }
}
