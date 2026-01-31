package v3;

import v3.C6430a;
import v3.c;

/* loaded from: classes2.dex */
public abstract class d {
    public static d INSTANCE = builder().build();

    public static abstract class a {
        public abstract d build();

        public abstract a setAuthToken(String str);

        public abstract a setExpiresInSecs(long j8);

        public abstract a setFirebaseInstallationId(String str);

        public abstract a setFisError(String str);

        public abstract a setRefreshToken(String str);

        public abstract a setRegistrationStatus(c.a aVar);

        public abstract a setTokenCreationEpochInSecs(long j8);
    }

    public static a builder() {
        return new C6430a.b().setTokenCreationEpochInSecs(0L).setRegistrationStatus(c.a.ATTEMPT_MIGRATION).setExpiresInSecs(0L);
    }

    public abstract String getAuthToken();

    public abstract long getExpiresInSecs();

    public abstract String getFirebaseInstallationId();

    public abstract String getFisError();

    public abstract String getRefreshToken();

    public abstract c.a getRegistrationStatus();

    public abstract long getTokenCreationEpochInSecs();

    public boolean isErrored() {
        return getRegistrationStatus() == c.a.REGISTER_ERROR;
    }

    public boolean isNotGenerated() {
        return getRegistrationStatus() == c.a.NOT_GENERATED || getRegistrationStatus() == c.a.ATTEMPT_MIGRATION;
    }

    public boolean isRegistered() {
        return getRegistrationStatus() == c.a.REGISTERED;
    }

    public boolean isUnregistered() {
        return getRegistrationStatus() == c.a.UNREGISTERED;
    }

    public boolean shouldAttemptMigration() {
        return getRegistrationStatus() == c.a.ATTEMPT_MIGRATION;
    }

    public abstract a toBuilder();

    public d withAuthToken(String str, long j8, long j9) {
        return toBuilder().setAuthToken(str).setExpiresInSecs(j8).setTokenCreationEpochInSecs(j9).build();
    }

    public d withClearedAuthToken() {
        return toBuilder().setAuthToken(null).build();
    }

    public d withFisError(String str) {
        return toBuilder().setFisError(str).setRegistrationStatus(c.a.REGISTER_ERROR).build();
    }

    public d withNoGeneratedFid() {
        return toBuilder().setRegistrationStatus(c.a.NOT_GENERATED).build();
    }

    public d withRegisteredFid(String str, String str2, long j8, String str3, long j9) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(c.a.REGISTERED).setAuthToken(str3).setRefreshToken(str2).setExpiresInSecs(j9).setTokenCreationEpochInSecs(j8).build();
    }

    public d withUnregisteredFid(String str) {
        return toBuilder().setFirebaseInstallationId(str).setRegistrationStatus(c.a.UNREGISTERED).build();
    }
}
