package com.kakao.sdk.common.util;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SharedPrefsWrapper implements PersistentKVStore {
    private final SharedPreferences appCache;
    private final SharedPreferences.Editor editor;

    public SharedPrefsWrapper(SharedPreferences appCache) {
        Intrinsics.checkNotNullParameter(appCache, "appCache");
        this.appCache = appCache;
        SharedPreferences.Editor editorEdit = appCache.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "appCache.edit()");
        this.editor = editorEdit;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore apply() {
        this.editor.apply();
        return this;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore commit() {
        this.editor.commit();
        return this;
    }

    public final SharedPreferences getAppCache() {
        return this.appCache;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public long getLong(String key, long j8) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.appCache.getLong(key, j8);
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public String getString(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.appCache.getString(key, str);
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore putLong(String key, long j8) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.editor.putLong(key, j8);
        return this;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore putString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.editor.putString(key, value);
        return this;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.editor.remove(key);
        return this;
    }
}
