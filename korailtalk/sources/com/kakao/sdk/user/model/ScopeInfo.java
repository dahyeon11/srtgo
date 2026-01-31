package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScopeInfo implements Parcelable {
    public static final Parcelable.Creator<ScopeInfo> CREATOR = new Creator();
    private final long id;
    private final List<Scope> scopes;

    public static final class Creator implements Parcelable.Creator<ScopeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScopeInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j8 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList2.add(Scope.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ScopeInfo(j8, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScopeInfo[] newArray(int i8) {
            return new ScopeInfo[i8];
        }
    }

    public ScopeInfo(long j8, List<Scope> list) {
        this.id = j8;
        this.scopes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScopeInfo copy$default(ScopeInfo scopeInfo, long j8, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = scopeInfo.id;
        }
        if ((i8 & 2) != 0) {
            list = scopeInfo.scopes;
        }
        return scopeInfo.copy(j8, list);
    }

    public final long component1() {
        return this.id;
    }

    public final List<Scope> component2() {
        return this.scopes;
    }

    public final ScopeInfo copy(long j8, List<Scope> list) {
        return new ScopeInfo(j8, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScopeInfo)) {
            return false;
        }
        ScopeInfo scopeInfo = (ScopeInfo) obj;
        return this.id == scopeInfo.id && Intrinsics.areEqual(this.scopes, scopeInfo.scopes);
    }

    public final long getId() {
        return this.id;
    }

    public final List<Scope> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        List<Scope> list = this.scopes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ScopeInfo(id=" + this.id + ", scopes=" + this.scopes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeLong(this.id);
        List<Scope> list = this.scopes;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        Iterator<Scope> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i8);
        }
    }
}
