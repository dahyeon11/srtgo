package com.kakao.sdk.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Commerce implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String currencyUnit;
    private final Integer currencyUnitPosition;
    private final Integer discountPrice;
    private final Integer discountRate;
    private final Integer fixedDiscountPrice;
    private final String productName;
    private final int regularPrice;

    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkParameterIsNotNull(in, "in");
            return new Commerce(in.readInt(), in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null, in.readString(), in.readString(), in.readInt() != 0 ? Integer.valueOf(in.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i8) {
            return new Commerce[i8];
        }
    }

    public Commerce(int i8) {
        this(i8, null, null, null, null, null, null, 126, null);
    }

    public static /* synthetic */ Commerce copy$default(Commerce commerce, int i8, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = commerce.regularPrice;
        }
        if ((i9 & 2) != 0) {
            num = commerce.discountPrice;
        }
        Integer num5 = num;
        if ((i9 & 4) != 0) {
            num2 = commerce.fixedDiscountPrice;
        }
        Integer num6 = num2;
        if ((i9 & 8) != 0) {
            num3 = commerce.discountRate;
        }
        Integer num7 = num3;
        if ((i9 & 16) != 0) {
            str = commerce.productName;
        }
        String str3 = str;
        if ((i9 & 32) != 0) {
            str2 = commerce.currencyUnit;
        }
        String str4 = str2;
        if ((i9 & 64) != 0) {
            num4 = commerce.currencyUnitPosition;
        }
        return commerce.copy(i8, num5, num6, num7, str3, str4, num4);
    }

    public final int component1() {
        return this.regularPrice;
    }

    public final Integer component2() {
        return this.discountPrice;
    }

    public final Integer component3() {
        return this.fixedDiscountPrice;
    }

    public final Integer component4() {
        return this.discountRate;
    }

    public final String component5() {
        return this.productName;
    }

    public final String component6() {
        return this.currencyUnit;
    }

    public final Integer component7() {
        return this.currencyUnitPosition;
    }

    public final Commerce copy(int i8, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4) {
        return new Commerce(i8, num, num2, num3, str, str2, num4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Commerce)) {
            return false;
        }
        Commerce commerce = (Commerce) obj;
        return this.regularPrice == commerce.regularPrice && Intrinsics.areEqual(this.discountPrice, commerce.discountPrice) && Intrinsics.areEqual(this.fixedDiscountPrice, commerce.fixedDiscountPrice) && Intrinsics.areEqual(this.discountRate, commerce.discountRate) && Intrinsics.areEqual(this.productName, commerce.productName) && Intrinsics.areEqual(this.currencyUnit, commerce.currencyUnit) && Intrinsics.areEqual(this.currencyUnitPosition, commerce.currencyUnitPosition);
    }

    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    public final Integer getCurrencyUnitPosition() {
        return this.currencyUnitPosition;
    }

    public final Integer getDiscountPrice() {
        return this.discountPrice;
    }

    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    public final Integer getFixedDiscountPrice() {
        return this.fixedDiscountPrice;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final int getRegularPrice() {
        return this.regularPrice;
    }

    public int hashCode() {
        int i8 = this.regularPrice * 31;
        Integer num = this.discountPrice;
        int iHashCode = (i8 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.fixedDiscountPrice;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.discountRate;
        int iHashCode3 = (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str = this.productName;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currencyUnit;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num4 = this.currencyUnitPosition;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "Commerce(regularPrice=" + this.regularPrice + ", discountPrice=" + this.discountPrice + ", fixedDiscountPrice=" + this.fixedDiscountPrice + ", discountRate=" + this.discountRate + ", productName=" + this.productName + ", currencyUnit=" + this.currencyUnit + ", currencyUnitPosition=" + this.currencyUnitPosition + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.regularPrice);
        Integer num = this.discountPrice;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.fixedDiscountPrice;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.discountRate;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.productName);
        parcel.writeString(this.currencyUnit);
        Integer num4 = this.currencyUnitPosition;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public Commerce(int i8, Integer num) {
        this(i8, num, null, null, null, null, null, 124, null);
    }

    public Commerce(int i8, Integer num, Integer num2) {
        this(i8, num, num2, null, null, null, null, 120, null);
    }

    public Commerce(int i8, Integer num, Integer num2, Integer num3) {
        this(i8, num, num2, num3, null, null, null, 112, null);
    }

    public Commerce(int i8, Integer num, Integer num2, Integer num3, String str) {
        this(i8, num, num2, num3, str, null, null, 96, null);
    }

    public Commerce(int i8, Integer num, Integer num2, Integer num3, String str, String str2) {
        this(i8, num, num2, num3, str, str2, null, 64, null);
    }

    public Commerce(int i8, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4) {
        this.regularPrice = i8;
        this.discountPrice = num;
        this.fixedDiscountPrice = num2;
        this.discountRate = num3;
        this.productName = str;
        this.currencyUnit = str2;
        this.currencyUnitPosition = num4;
    }

    public /* synthetic */ Commerce(int i8, Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i8, (i9 & 2) != 0 ? null : num, (i9 & 4) != 0 ? null : num2, (i9 & 8) != 0 ? null : num3, (i9 & 16) != 0 ? null : str, (i9 & 32) != 0 ? null : str2, (i9 & 64) == 0 ? num4 : null);
    }
}
