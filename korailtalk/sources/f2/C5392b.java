package f2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5392b extends AbstractC5814a {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final int DEVELOPER_ERROR = 10;

    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = -1;

    /* renamed from: a, reason: collision with root package name */
    final int f30559a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30560b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f30561c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30562d;
    public static final C5392b RESULT_SUCCESS = new C5392b(0);
    public static final Parcelable.Creator<C5392b> CREATOR = new t();

    C5392b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f30559a = i8;
        this.f30560b = i9;
        this.f30561c = pendingIntent;
        this.f30562d = str;
    }

    static String b(int i8) {
        if (i8 == 99) {
            return "UNFINISHED";
        }
        if (i8 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i8) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i8) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i8 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5392b)) {
            return false;
        }
        C5392b c5392b = (C5392b) obj;
        return this.f30560b == c5392b.f30560b && AbstractC5681n.equal(this.f30561c, c5392b.f30561c) && AbstractC5681n.equal(this.f30562d, c5392b.f30562d);
    }

    public int getErrorCode() {
        return this.f30560b;
    }

    public String getErrorMessage() {
        return this.f30562d;
    }

    public PendingIntent getResolution() {
        return this.f30561c;
    }

    public boolean hasResolution() {
        return (this.f30560b == 0 || this.f30561c == null) ? false : true;
    }

    public int hashCode() {
        return AbstractC5681n.hashCode(Integer.valueOf(this.f30560b), this.f30561c, this.f30562d);
    }

    public boolean isSuccess() {
        return this.f30560b == 0;
    }

    public void startResolutionForResult(Activity activity, int i8) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.f30561c;
            AbstractC5683p.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i8, null, 0, 0, 0);
        }
    }

    public String toString() {
        AbstractC5681n.a stringHelper = AbstractC5681n.toStringHelper(this);
        stringHelper.add("statusCode", b(this.f30560b));
        stringHelper.add("resolution", this.f30561c);
        stringHelper.add("message", this.f30562d);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f30559a;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeInt(parcel, 2, getErrorCode());
        AbstractC5816c.writeParcelable(parcel, 3, getResolution(), i8, false);
        AbstractC5816c.writeString(parcel, 4, getErrorMessage(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C5392b(int i8) {
        this(i8, null, null);
    }

    public C5392b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public C5392b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }
}
