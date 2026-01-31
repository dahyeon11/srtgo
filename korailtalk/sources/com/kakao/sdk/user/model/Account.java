package com.kakao.sdk.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Account implements Parcelable {
    public static final Parcelable.Creator<Account> CREATOR = new Creator();
    private final AgeRange ageRange;
    private final Boolean ageRangeNeedsAgreement;
    private final String birthday;
    private final Boolean birthdayNeedsAgreement;
    private final BirthdayType birthdayType;
    private final String birthyear;
    private final Boolean birthyearNeedsAgreement;
    private final String ci;
    private final Date ciAuthenticatedAt;
    private final Boolean ciNeedsAgreement;
    private final String email;
    private final Boolean emailNeedsAgreement;
    private final Gender gender;
    private final Boolean genderNeedsAgreement;
    private final Boolean isEmailValid;
    private final Boolean isEmailVerified;
    private final Boolean isKorean;
    private final Boolean isKoreanNeedsAgreement;
    private final String legalBirthDate;
    private final Boolean legalBirthDateNeedsAgreement;
    private final Gender legalGender;
    private final Boolean legalGenderNeedsAgreement;
    private final String legalName;
    private final Boolean legalNameNeedsAgreement;
    private final String name;
    private final Boolean nameNeedsAgreement;
    private final String phoneNumber;
    private final Boolean phoneNumberNeedsAgreement;
    private final Profile profile;
    private final Boolean profileImageNeedsAgreement;
    private final Boolean profileNeedsAgreement;
    private final Boolean profileNicknameNeedsAgreement;

    public static final class Creator implements Parcelable.Creator<Account> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Account createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Boolean boolValueOf10;
            Boolean boolValueOf11;
            Boolean boolValueOf12;
            Boolean boolValueOf13;
            Boolean boolValueOf14;
            Boolean boolValueOf15;
            Boolean boolValueOf16;
            Boolean boolValueOf17;
            Boolean boolValueOf18;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Profile profileCreateFromParcel = parcel.readInt() == 0 ? null : Profile.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AgeRange ageRangeValueOf = parcel.readInt() == 0 ? null : AgeRange.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf10 = null;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            BirthdayType birthdayTypeValueOf = parcel.readInt() == 0 ? null : BirthdayType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf11 = null;
            } else {
                boolValueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Gender genderValueOf = parcel.readInt() == 0 ? null : Gender.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf12 = null;
            } else {
                boolValueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf13 = null;
            } else {
                boolValueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf14 = null;
            } else {
                boolValueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf15 = null;
            } else {
                boolValueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Gender genderValueOf2 = parcel.readInt() == 0 ? null : Gender.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf16 = null;
            } else {
                boolValueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf17 = null;
            } else {
                boolValueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf18 = null;
            } else {
                boolValueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Account(boolValueOf, boolValueOf2, boolValueOf3, profileCreateFromParcel, boolValueOf4, string, boolValueOf5, boolValueOf6, boolValueOf7, string2, boolValueOf8, ageRangeValueOf, boolValueOf9, string3, boolValueOf10, string4, birthdayTypeValueOf, boolValueOf11, genderValueOf, boolValueOf12, string5, date, boolValueOf13, string6, boolValueOf14, string7, boolValueOf15, genderValueOf2, boolValueOf16, string8, boolValueOf17, boolValueOf18);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Account[] newArray(int i8) {
            return new Account[i8];
        }
    }

    public Account(Boolean bool, Boolean bool2, Boolean bool3, Profile profile, Boolean bool4, String str, Boolean bool5, Boolean bool6, Boolean bool7, String str2, Boolean bool8, AgeRange ageRange, Boolean bool9, String str3, Boolean bool10, String str4, BirthdayType birthdayType, Boolean bool11, Gender gender, Boolean bool12, String str5, Date date, Boolean bool13, String str6, Boolean bool14, String str7, Boolean bool15, Gender gender2, Boolean bool16, String str8, Boolean bool17, Boolean bool18) {
        this.profileNeedsAgreement = bool;
        this.profileNicknameNeedsAgreement = bool2;
        this.profileImageNeedsAgreement = bool3;
        this.profile = profile;
        this.nameNeedsAgreement = bool4;
        this.name = str;
        this.emailNeedsAgreement = bool5;
        this.isEmailValid = bool6;
        this.isEmailVerified = bool7;
        this.email = str2;
        this.ageRangeNeedsAgreement = bool8;
        this.ageRange = ageRange;
        this.birthyearNeedsAgreement = bool9;
        this.birthyear = str3;
        this.birthdayNeedsAgreement = bool10;
        this.birthday = str4;
        this.birthdayType = birthdayType;
        this.genderNeedsAgreement = bool11;
        this.gender = gender;
        this.ciNeedsAgreement = bool12;
        this.ci = str5;
        this.ciAuthenticatedAt = date;
        this.legalNameNeedsAgreement = bool13;
        this.legalName = str6;
        this.legalBirthDateNeedsAgreement = bool14;
        this.legalBirthDate = str7;
        this.legalGenderNeedsAgreement = bool15;
        this.legalGender = gender2;
        this.phoneNumberNeedsAgreement = bool16;
        this.phoneNumber = str8;
        this.isKoreanNeedsAgreement = bool17;
        this.isKorean = bool18;
    }

    public final Boolean component1() {
        return this.profileNeedsAgreement;
    }

    public final String component10() {
        return this.email;
    }

    public final Boolean component11() {
        return this.ageRangeNeedsAgreement;
    }

    public final AgeRange component12() {
        return this.ageRange;
    }

    public final Boolean component13() {
        return this.birthyearNeedsAgreement;
    }

    public final String component14() {
        return this.birthyear;
    }

    public final Boolean component15() {
        return this.birthdayNeedsAgreement;
    }

    public final String component16() {
        return this.birthday;
    }

    public final BirthdayType component17() {
        return this.birthdayType;
    }

    public final Boolean component18() {
        return this.genderNeedsAgreement;
    }

    public final Gender component19() {
        return this.gender;
    }

    public final Boolean component2() {
        return this.profileNicknameNeedsAgreement;
    }

    public final Boolean component20() {
        return this.ciNeedsAgreement;
    }

    public final String component21() {
        return this.ci;
    }

    public final Date component22() {
        return this.ciAuthenticatedAt;
    }

    public final Boolean component23() {
        return this.legalNameNeedsAgreement;
    }

    public final String component24() {
        return this.legalName;
    }

    public final Boolean component25() {
        return this.legalBirthDateNeedsAgreement;
    }

    public final String component26() {
        return this.legalBirthDate;
    }

    public final Boolean component27() {
        return this.legalGenderNeedsAgreement;
    }

    public final Gender component28() {
        return this.legalGender;
    }

    public final Boolean component29() {
        return this.phoneNumberNeedsAgreement;
    }

    public final Boolean component3() {
        return this.profileImageNeedsAgreement;
    }

    public final String component30() {
        return this.phoneNumber;
    }

    public final Boolean component31() {
        return this.isKoreanNeedsAgreement;
    }

    public final Boolean component32() {
        return this.isKorean;
    }

    public final Profile component4() {
        return this.profile;
    }

    public final Boolean component5() {
        return this.nameNeedsAgreement;
    }

    public final String component6() {
        return this.name;
    }

    public final Boolean component7() {
        return this.emailNeedsAgreement;
    }

    public final Boolean component8() {
        return this.isEmailValid;
    }

    public final Boolean component9() {
        return this.isEmailVerified;
    }

    public final Account copy(Boolean bool, Boolean bool2, Boolean bool3, Profile profile, Boolean bool4, String str, Boolean bool5, Boolean bool6, Boolean bool7, String str2, Boolean bool8, AgeRange ageRange, Boolean bool9, String str3, Boolean bool10, String str4, BirthdayType birthdayType, Boolean bool11, Gender gender, Boolean bool12, String str5, Date date, Boolean bool13, String str6, Boolean bool14, String str7, Boolean bool15, Gender gender2, Boolean bool16, String str8, Boolean bool17, Boolean bool18) {
        return new Account(bool, bool2, bool3, profile, bool4, str, bool5, bool6, bool7, str2, bool8, ageRange, bool9, str3, bool10, str4, birthdayType, bool11, gender, bool12, str5, date, bool13, str6, bool14, str7, bool15, gender2, bool16, str8, bool17, bool18);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        return Intrinsics.areEqual(this.profileNeedsAgreement, account.profileNeedsAgreement) && Intrinsics.areEqual(this.profileNicknameNeedsAgreement, account.profileNicknameNeedsAgreement) && Intrinsics.areEqual(this.profileImageNeedsAgreement, account.profileImageNeedsAgreement) && Intrinsics.areEqual(this.profile, account.profile) && Intrinsics.areEqual(this.nameNeedsAgreement, account.nameNeedsAgreement) && Intrinsics.areEqual(this.name, account.name) && Intrinsics.areEqual(this.emailNeedsAgreement, account.emailNeedsAgreement) && Intrinsics.areEqual(this.isEmailValid, account.isEmailValid) && Intrinsics.areEqual(this.isEmailVerified, account.isEmailVerified) && Intrinsics.areEqual(this.email, account.email) && Intrinsics.areEqual(this.ageRangeNeedsAgreement, account.ageRangeNeedsAgreement) && this.ageRange == account.ageRange && Intrinsics.areEqual(this.birthyearNeedsAgreement, account.birthyearNeedsAgreement) && Intrinsics.areEqual(this.birthyear, account.birthyear) && Intrinsics.areEqual(this.birthdayNeedsAgreement, account.birthdayNeedsAgreement) && Intrinsics.areEqual(this.birthday, account.birthday) && this.birthdayType == account.birthdayType && Intrinsics.areEqual(this.genderNeedsAgreement, account.genderNeedsAgreement) && this.gender == account.gender && Intrinsics.areEqual(this.ciNeedsAgreement, account.ciNeedsAgreement) && Intrinsics.areEqual(this.ci, account.ci) && Intrinsics.areEqual(this.ciAuthenticatedAt, account.ciAuthenticatedAt) && Intrinsics.areEqual(this.legalNameNeedsAgreement, account.legalNameNeedsAgreement) && Intrinsics.areEqual(this.legalName, account.legalName) && Intrinsics.areEqual(this.legalBirthDateNeedsAgreement, account.legalBirthDateNeedsAgreement) && Intrinsics.areEqual(this.legalBirthDate, account.legalBirthDate) && Intrinsics.areEqual(this.legalGenderNeedsAgreement, account.legalGenderNeedsAgreement) && this.legalGender == account.legalGender && Intrinsics.areEqual(this.phoneNumberNeedsAgreement, account.phoneNumberNeedsAgreement) && Intrinsics.areEqual(this.phoneNumber, account.phoneNumber) && Intrinsics.areEqual(this.isKoreanNeedsAgreement, account.isKoreanNeedsAgreement) && Intrinsics.areEqual(this.isKorean, account.isKorean);
    }

    public final AgeRange getAgeRange() {
        return this.ageRange;
    }

    public final Boolean getAgeRangeNeedsAgreement() {
        return this.ageRangeNeedsAgreement;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final Boolean getBirthdayNeedsAgreement() {
        return this.birthdayNeedsAgreement;
    }

    public final BirthdayType getBirthdayType() {
        return this.birthdayType;
    }

    public final String getBirthyear() {
        return this.birthyear;
    }

    public final Boolean getBirthyearNeedsAgreement() {
        return this.birthyearNeedsAgreement;
    }

    public final String getCi() {
        return this.ci;
    }

    public final Date getCiAuthenticatedAt() {
        return this.ciAuthenticatedAt;
    }

    public final Boolean getCiNeedsAgreement() {
        return this.ciNeedsAgreement;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getEmailNeedsAgreement() {
        return this.emailNeedsAgreement;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Boolean getGenderNeedsAgreement() {
        return this.genderNeedsAgreement;
    }

    public final String getLegalBirthDate() {
        return this.legalBirthDate;
    }

    public final Boolean getLegalBirthDateNeedsAgreement() {
        return this.legalBirthDateNeedsAgreement;
    }

    public final Gender getLegalGender() {
        return this.legalGender;
    }

    public final Boolean getLegalGenderNeedsAgreement() {
        return this.legalGenderNeedsAgreement;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    public final Boolean getLegalNameNeedsAgreement() {
        return this.legalNameNeedsAgreement;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNameNeedsAgreement() {
        return this.nameNeedsAgreement;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Boolean getPhoneNumberNeedsAgreement() {
        return this.phoneNumberNeedsAgreement;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final Boolean getProfileImageNeedsAgreement() {
        return this.profileImageNeedsAgreement;
    }

    public final Boolean getProfileNeedsAgreement() {
        return this.profileNeedsAgreement;
    }

    public final Boolean getProfileNicknameNeedsAgreement() {
        return this.profileNicknameNeedsAgreement;
    }

    public int hashCode() {
        Boolean bool = this.profileNeedsAgreement;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.profileNicknameNeedsAgreement;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.profileImageNeedsAgreement;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Profile profile = this.profile;
        int iHashCode4 = (iHashCode3 + (profile == null ? 0 : profile.hashCode())) * 31;
        Boolean bool4 = this.nameNeedsAgreement;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.name;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool5 = this.emailNeedsAgreement;
        int iHashCode7 = (iHashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isEmailValid;
        int iHashCode8 = (iHashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isEmailVerified;
        int iHashCode9 = (iHashCode8 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool8 = this.ageRangeNeedsAgreement;
        int iHashCode11 = (iHashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        AgeRange ageRange = this.ageRange;
        int iHashCode12 = (iHashCode11 + (ageRange == null ? 0 : ageRange.hashCode())) * 31;
        Boolean bool9 = this.birthyearNeedsAgreement;
        int iHashCode13 = (iHashCode12 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        String str3 = this.birthyear;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool10 = this.birthdayNeedsAgreement;
        int iHashCode15 = (iHashCode14 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str4 = this.birthday;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BirthdayType birthdayType = this.birthdayType;
        int iHashCode17 = (iHashCode16 + (birthdayType == null ? 0 : birthdayType.hashCode())) * 31;
        Boolean bool11 = this.genderNeedsAgreement;
        int iHashCode18 = (iHashCode17 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Gender gender = this.gender;
        int iHashCode19 = (iHashCode18 + (gender == null ? 0 : gender.hashCode())) * 31;
        Boolean bool12 = this.ciNeedsAgreement;
        int iHashCode20 = (iHashCode19 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str5 = this.ci;
        int iHashCode21 = (iHashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date = this.ciAuthenticatedAt;
        int iHashCode22 = (iHashCode21 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool13 = this.legalNameNeedsAgreement;
        int iHashCode23 = (iHashCode22 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        String str6 = this.legalName;
        int iHashCode24 = (iHashCode23 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool14 = this.legalBirthDateNeedsAgreement;
        int iHashCode25 = (iHashCode24 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str7 = this.legalBirthDate;
        int iHashCode26 = (iHashCode25 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool15 = this.legalGenderNeedsAgreement;
        int iHashCode27 = (iHashCode26 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Gender gender2 = this.legalGender;
        int iHashCode28 = (iHashCode27 + (gender2 == null ? 0 : gender2.hashCode())) * 31;
        Boolean bool16 = this.phoneNumberNeedsAgreement;
        int iHashCode29 = (iHashCode28 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        String str8 = this.phoneNumber;
        int iHashCode30 = (iHashCode29 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool17 = this.isKoreanNeedsAgreement;
        int iHashCode31 = (iHashCode30 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isKorean;
        return iHashCode31 + (bool18 != null ? bool18.hashCode() : 0);
    }

    public final Boolean isEmailValid() {
        return this.isEmailValid;
    }

    public final Boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public final Boolean isKorean() {
        return this.isKorean;
    }

    public final Boolean isKoreanNeedsAgreement() {
        return this.isKoreanNeedsAgreement;
    }

    public String toString() {
        return "Account(profileNeedsAgreement=" + this.profileNeedsAgreement + ", profileNicknameNeedsAgreement=" + this.profileNicknameNeedsAgreement + ", profileImageNeedsAgreement=" + this.profileImageNeedsAgreement + ", profile=" + this.profile + ", nameNeedsAgreement=" + this.nameNeedsAgreement + ", name=" + ((Object) this.name) + ", emailNeedsAgreement=" + this.emailNeedsAgreement + ", isEmailValid=" + this.isEmailValid + ", isEmailVerified=" + this.isEmailVerified + ", email=" + ((Object) this.email) + ", ageRangeNeedsAgreement=" + this.ageRangeNeedsAgreement + ", ageRange=" + this.ageRange + ", birthyearNeedsAgreement=" + this.birthyearNeedsAgreement + ", birthyear=" + ((Object) this.birthyear) + ", birthdayNeedsAgreement=" + this.birthdayNeedsAgreement + ", birthday=" + ((Object) this.birthday) + ", birthdayType=" + this.birthdayType + ", genderNeedsAgreement=" + this.genderNeedsAgreement + ", gender=" + this.gender + ", ciNeedsAgreement=" + this.ciNeedsAgreement + ", ci=" + ((Object) this.ci) + ", ciAuthenticatedAt=" + this.ciAuthenticatedAt + ", legalNameNeedsAgreement=" + this.legalNameNeedsAgreement + ", legalName=" + ((Object) this.legalName) + ", legalBirthDateNeedsAgreement=" + this.legalBirthDateNeedsAgreement + ", legalBirthDate=" + ((Object) this.legalBirthDate) + ", legalGenderNeedsAgreement=" + this.legalGenderNeedsAgreement + ", legalGender=" + this.legalGender + ", phoneNumberNeedsAgreement=" + this.phoneNumberNeedsAgreement + ", phoneNumber=" + ((Object) this.phoneNumber) + ", isKoreanNeedsAgreement=" + this.isKoreanNeedsAgreement + ", isKorean=" + this.isKorean + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        Intrinsics.checkNotNullParameter(out, "out");
        Boolean bool = this.profileNeedsAgreement;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.profileNicknameNeedsAgreement;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.profileImageNeedsAgreement;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Profile profile = this.profile;
        if (profile == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            profile.writeToParcel(out, i8);
        }
        Boolean bool4 = this.nameNeedsAgreement;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        out.writeString(this.name);
        Boolean bool5 = this.emailNeedsAgreement;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.isEmailValid;
        if (bool6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.isEmailVerified;
        if (bool7 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        out.writeString(this.email);
        Boolean bool8 = this.ageRangeNeedsAgreement;
        if (bool8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        AgeRange ageRange = this.ageRange;
        if (ageRange == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(ageRange.name());
        }
        Boolean bool9 = this.birthyearNeedsAgreement;
        if (bool9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        out.writeString(this.birthyear);
        Boolean bool10 = this.birthdayNeedsAgreement;
        if (bool10 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        out.writeString(this.birthday);
        BirthdayType birthdayType = this.birthdayType;
        if (birthdayType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(birthdayType.name());
        }
        Boolean bool11 = this.genderNeedsAgreement;
        if (bool11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Gender gender = this.gender;
        if (gender == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gender.name());
        }
        Boolean bool12 = this.ciNeedsAgreement;
        if (bool12 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        out.writeString(this.ci);
        out.writeSerializable(this.ciAuthenticatedAt);
        Boolean bool13 = this.legalNameNeedsAgreement;
        if (bool13 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        out.writeString(this.legalName);
        Boolean bool14 = this.legalBirthDateNeedsAgreement;
        if (bool14 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        out.writeString(this.legalBirthDate);
        Boolean bool15 = this.legalGenderNeedsAgreement;
        if (bool15 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool15.booleanValue() ? 1 : 0);
        }
        Gender gender2 = this.legalGender;
        if (gender2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gender2.name());
        }
        Boolean bool16 = this.phoneNumberNeedsAgreement;
        if (bool16 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool16.booleanValue() ? 1 : 0);
        }
        out.writeString(this.phoneNumber);
        Boolean bool17 = this.isKoreanNeedsAgreement;
        if (bool17 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool17.booleanValue() ? 1 : 0);
        }
        Boolean bool18 = this.isKorean;
        if (bool18 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool18.booleanValue() ? 1 : 0);
        }
    }
}
