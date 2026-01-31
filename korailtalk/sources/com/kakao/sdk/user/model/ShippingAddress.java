package com.kakao.sdk.user.model;

import com.kakao.sdk.common.json.KakaoIntDateTypeAdapter;
import com.kakao.sdk.link.Constants;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC6621b;
import z3.InterfaceC6622c;

/* loaded from: classes.dex */
public final class ShippingAddress {
    private final String baseAddress;
    private final String detailAddress;
    private final long id;

    @InterfaceC6622c(Constants.VALIDATION_DEFAULT)
    private final boolean isDefault;
    private final String name;
    private final String receiverName;
    private final String receiverPhoneNumber1;
    private final String receiverPhoneNumber2;
    private final ShippingAddressType type;

    @InterfaceC6621b(KakaoIntDateTypeAdapter.class)
    private final Date updatedAt;
    private final String zipCode;
    private final String zoneNumber;

    public ShippingAddress(long j8, String str, boolean z8, Date date, ShippingAddressType shippingAddressType, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.id = j8;
        this.name = str;
        this.isDefault = z8;
        this.updatedAt = date;
        this.type = shippingAddressType;
        this.baseAddress = str2;
        this.detailAddress = str3;
        this.receiverName = str4;
        this.receiverPhoneNumber1 = str5;
        this.receiverPhoneNumber2 = str6;
        this.zoneNumber = str7;
        this.zipCode = str8;
    }

    public final long component1() {
        return this.id;
    }

    public final String component10() {
        return this.receiverPhoneNumber2;
    }

    public final String component11() {
        return this.zoneNumber;
    }

    public final String component12() {
        return this.zipCode;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isDefault;
    }

    public final Date component4() {
        return this.updatedAt;
    }

    public final ShippingAddressType component5() {
        return this.type;
    }

    public final String component6() {
        return this.baseAddress;
    }

    public final String component7() {
        return this.detailAddress;
    }

    public final String component8() {
        return this.receiverName;
    }

    public final String component9() {
        return this.receiverPhoneNumber1;
    }

    public final ShippingAddress copy(long j8, String str, boolean z8, Date date, ShippingAddressType shippingAddressType, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new ShippingAddress(j8, str, z8, date, shippingAddressType, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress = (ShippingAddress) obj;
        return this.id == shippingAddress.id && Intrinsics.areEqual(this.name, shippingAddress.name) && this.isDefault == shippingAddress.isDefault && Intrinsics.areEqual(this.updatedAt, shippingAddress.updatedAt) && this.type == shippingAddress.type && Intrinsics.areEqual(this.baseAddress, shippingAddress.baseAddress) && Intrinsics.areEqual(this.detailAddress, shippingAddress.detailAddress) && Intrinsics.areEqual(this.receiverName, shippingAddress.receiverName) && Intrinsics.areEqual(this.receiverPhoneNumber1, shippingAddress.receiverPhoneNumber1) && Intrinsics.areEqual(this.receiverPhoneNumber2, shippingAddress.receiverPhoneNumber2) && Intrinsics.areEqual(this.zoneNumber, shippingAddress.zoneNumber) && Intrinsics.areEqual(this.zipCode, shippingAddress.zipCode);
    }

    public final String getBaseAddress() {
        return this.baseAddress;
    }

    public final String getDetailAddress() {
        return this.detailAddress;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getReceiverPhoneNumber1() {
        return this.receiverPhoneNumber1;
    }

    public final String getReceiverPhoneNumber2() {
        return this.receiverPhoneNumber2;
    }

    public final ShippingAddressType getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getZipCode() {
        return this.zipCode;
    }

    public final String getZoneNumber() {
        return this.zoneNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z8 = this.isDefault;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        int i9 = (iHashCode2 + i8) * 31;
        Date date = this.updatedAt;
        int iHashCode3 = (i9 + (date == null ? 0 : date.hashCode())) * 31;
        ShippingAddressType shippingAddressType = this.type;
        int iHashCode4 = (iHashCode3 + (shippingAddressType == null ? 0 : shippingAddressType.hashCode())) * 31;
        String str2 = this.baseAddress;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.detailAddress;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiverName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.receiverPhoneNumber1;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.receiverPhoneNumber2;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.zoneNumber;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zipCode;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        return "ShippingAddress(id=" + this.id + ", name=" + ((Object) this.name) + ", isDefault=" + this.isDefault + ", updatedAt=" + this.updatedAt + ", type=" + this.type + ", baseAddress=" + ((Object) this.baseAddress) + ", detailAddress=" + ((Object) this.detailAddress) + ", receiverName=" + ((Object) this.receiverName) + ", receiverPhoneNumber1=" + ((Object) this.receiverPhoneNumber1) + ", receiverPhoneNumber2=" + ((Object) this.receiverPhoneNumber2) + ", zoneNumber=" + ((Object) this.zoneNumber) + ", zipCode=" + ((Object) this.zipCode) + ')';
    }
}
