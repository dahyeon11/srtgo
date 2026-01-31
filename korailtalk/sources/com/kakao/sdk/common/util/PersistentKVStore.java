package com.kakao.sdk.common.util;

/* loaded from: classes.dex */
public interface PersistentKVStore {

    public static final class DefaultImpls {
        public static /* synthetic */ long getLong$default(PersistentKVStore persistentKVStore, String str, long j8, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i8 & 2) != 0) {
                j8 = 0;
            }
            return persistentKVStore.getLong(str, j8);
        }

        public static /* synthetic */ String getString$default(PersistentKVStore persistentKVStore, String str, String str2, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i8 & 2) != 0) {
                str2 = null;
            }
            return persistentKVStore.getString(str, str2);
        }
    }

    PersistentKVStore apply();

    PersistentKVStore commit();

    long getLong(String str, long j8);

    String getString(String str, String str2);

    PersistentKVStore putLong(String str, long j8);

    PersistentKVStore putString(String str, String str2);

    PersistentKVStore remove(String str);
}
