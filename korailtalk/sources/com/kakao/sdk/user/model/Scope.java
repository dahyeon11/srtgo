package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Scope implements Parcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new Creator();
    private final boolean agreed;
    private final Boolean delegated;
    private final String displayName;
    private final String id;
    private final Boolean revocable;
    private final ScopeType type;
    private final boolean using;

    public static final class Creator implements Parcelable.Creator<Scope> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Scope createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ScopeType scopeTypeValueOf = ScopeType.valueOf(parcel.readString());
            boolean z8 = parcel.readInt() != 0;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z9 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Scope(string, string2, scopeTypeValueOf, z8, boolValueOf, z9, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Scope[] newArray(int i8) {
            return new Scope[i8];
        }
    }

    public Scope(String id, String displayName, ScopeType type, boolean z8, Boolean bool, boolean z9, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.displayName = displayName;
        this.type = type;
        this.using = z8;
        this.delegated = bool;
        this.agreed = z9;
        this.revocable = bool2;
    }

    public static /* synthetic */ Scope copy$default(Scope scope, String str, String str2, ScopeType scopeType, boolean z8, Boolean bool, boolean z9, Boolean bool2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = scope.id;
        }
        if ((i8 & 2) != 0) {
            str2 = scope.displayName;
        }
        String str3 = str2;
        if ((i8 & 4) != 0) {
            scopeType = scope.type;
        }
        ScopeType scopeType2 = scopeType;
        if ((i8 & 8) != 0) {
            z8 = scope.using;
        }
        boolean z10 = z8;
        if ((i8 & 16) != 0) {
            bool = scope.delegated;
        }
        Boolean bool3 = bool;
        if ((i8 & 32) != 0) {
            z9 = scope.agreed;
        }
        boolean z11 = z9;
        if ((i8 & 64) != 0) {
            bool2 = scope.revocable;
        }
        return scope.copy(str, str3, scopeType2, z10, bool3, z11, bool2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final ScopeType component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.using;
    }

    public final Boolean component5() {
        return this.delegated;
    }

    public final boolean component6() {
        return this.agreed;
    }

    public final Boolean component7() {
        return this.revocable;
    }

    public final Scope copy(String id, String displayName, ScopeType type, boolean z8, Boolean bool, boolean z9, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Scope(id, displayName, type, z8, bool, z9, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) obj;
        return Intrinsics.areEqual(this.id, scope.id) && Intrinsics.areEqual(this.displayName, scope.displayName) && this.type == scope.type && this.using == scope.using && Intrinsics.areEqual(this.delegated, scope.delegated) && this.agreed == scope.agreed && Intrinsics.areEqual(this.revocable, scope.revocable);
    }

    public final boolean getAgreed() {
        return this.agreed;
    }

    public final Boolean getDelegated() {
        return this.delegated;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getRevocable() {
        return this.revocable;
    }

    public final ScopeType getType() {
        return this.type;
    }

    public final boolean getUsing() {
        return this.using;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.type.hashCode()) * 31;
        boolean z8 = this.using;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        int i9 = (iHashCode + i8) * 31;
        Boolean bool = this.delegated;
        int iHashCode2 = (i9 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z9 = this.agreed;
        int i10 = (iHashCode2 + (z9 ? 1 : z9 ? 1 : 0)) * 31;
        Boolean bool2 = this.revocable;
        return i10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Scope(id=" + this.id + ", displayName=" + this.displayName + ", type=" + this.type + ", using=" + this.using + ", delegated=" + this.delegated + ", agreed=" + this.agreed + ", revocable=" + this.revocable + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.id);
        out.writeString(this.displayName);
        out.writeString(this.type.name());
        out.writeInt(this.using ? 1 : 0);
        Boolean bool = this.delegated;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.agreed ? 1 : 0);
        Boolean bool2 = this.revocable;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }
}
