package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f6084a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6085b;

    /* renamed from: c, reason: collision with root package name */
    private Object f6086c;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i8) {
            return new RatingCompat[i8];
        }
    }

    RatingCompat(int i8, float f8) {
        this.f6084a = i8;
        this.f6085b = f8;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompatNewUnratedRating = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompatNewUnratedRating = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompatNewUnratedRating = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatNewUnratedRating = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompatNewUnratedRating = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatNewUnratedRating = newUnratedRating(ratingStyle);
            }
            ratingCompatNewUnratedRating.f6086c = obj;
        }
        return ratingCompatNewUnratedRating;
    }

    public static RatingCompat newHeartRating(boolean z8) {
        return new RatingCompat(1, z8 ? 1.0f : 0.0f);
    }

    public static RatingCompat newPercentageRating(float f8) {
        if (f8 >= 0.0f && f8 <= 100.0f) {
            return new RatingCompat(6, f8);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat newStarRating(int i8, float f8) {
        float f9;
        if (i8 == 3) {
            f9 = 3.0f;
        } else if (i8 == 4) {
            f9 = 4.0f;
        } else {
            if (i8 != 5) {
                Log.e("Rating", "Invalid rating style (" + i8 + ") for a star rating");
                return null;
            }
            f9 = 5.0f;
        }
        if (f8 >= 0.0f && f8 <= f9) {
            return new RatingCompat(i8, f8);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat newThumbRating(boolean z8) {
        return new RatingCompat(2, z8 ? 1.0f : 0.0f);
    }

    public static RatingCompat newUnratedRating(int i8) {
        switch (i8) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i8, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f6084a;
    }

    public float getPercentRating() {
        if (this.f6084a == 6 && isRated()) {
            return this.f6085b;
        }
        return -1.0f;
    }

    public Object getRating() {
        if (this.f6086c == null) {
            if (isRated()) {
                int i8 = this.f6084a;
                switch (i8) {
                    case 1:
                        this.f6086c = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.f6086c = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f6086c = Rating.newStarRating(i8, getStarRating());
                        break;
                    case 6:
                        this.f6086c = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f6086c = Rating.newUnratedRating(this.f6084a);
            }
        }
        return this.f6086c;
    }

    public int getRatingStyle() {
        return this.f6084a;
    }

    public float getStarRating() {
        int i8 = this.f6084a;
        if ((i8 == 3 || i8 == 4 || i8 == 5) && isRated()) {
            return this.f6085b;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        return this.f6084a == 1 && this.f6085b == 1.0f;
    }

    public boolean isRated() {
        return this.f6085b >= 0.0f;
    }

    public boolean isThumbUp() {
        return this.f6084a == 2 && this.f6085b == 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f6084a);
        sb.append(" rating=");
        float f8 = this.f6085b;
        sb.append(f8 < 0.0f ? "unrated" : String.valueOf(f8));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6084a);
        parcel.writeFloat(this.f6085b);
    }
}
