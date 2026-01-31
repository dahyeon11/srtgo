package com.nhn.android.naverlogin.data;

import C6.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class OAuthLoginPreferenceManager {

    /* renamed from: a, reason: collision with root package name */
    private static Context f29642a;

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f29643b;

    protected enum PREF_KEY {
        ACCESS_TOKEN("ACCESS_TOKEN", String.class),
        REFRESH_TOKEN("REFRESH_TOKEN", String.class),
        EXPIRES_AT("EXPIRES_AT", Long.TYPE),
        TOKEN_TYPE("TOKEN_TYPE", String.class),
        CLIENT_ID("CLIENT_ID", String.class),
        CLIENT_SECRET("CLIENT_SECRET", String.class),
        CLIENT_NAME("CLIENT_NAME", String.class),
        CALLBACK_URL("CALLBACK_URL", String.class),
        LAST_ERROR_CODE("LAST_ERROR_CODE", String.class),
        LAST_ERROR_DESC("LAST_ERROR_DESC", String.class);


        /* renamed from: a, reason: collision with root package name */
        private String f29645a;

        /* renamed from: b, reason: collision with root package name */
        private String f29646b;

        PREF_KEY(String str, Class cls) {
            this.f29645a = str;
            this.f29646b = cls.getCanonicalName();
        }

        private boolean a(SharedPreferences sharedPreferences) {
            SharedPreferences.Editor editorEdit;
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return false;
            }
            try {
                editorEdit.remove(this.f29645a);
                return editorEdit.commit();
            } catch (Exception e8) {
                if (!a.isRealVersion()) {
                    a.e("OAuthLoginPreferenceManager", "Prefernce del() fail, key:" + this.f29645a + ", mType:" + this.f29646b + "e:" + e8.getMessage());
                }
                return false;
            }
        }

        private Object b(SharedPreferences sharedPreferences) {
            Object objValueOf = null;
            try {
                if (this.f29646b.equals(Integer.TYPE.getCanonicalName())) {
                    objValueOf = Integer.valueOf(sharedPreferences.getInt(this.f29645a, 0));
                } else if (this.f29646b.equals(Long.TYPE.getCanonicalName())) {
                    objValueOf = Long.valueOf(sharedPreferences.getLong(this.f29645a, 0L));
                } else if (this.f29646b.equals(String.class.getCanonicalName())) {
                    objValueOf = sharedPreferences.getString(this.f29645a, "");
                } else if (this.f29646b.equals(Boolean.TYPE.getCanonicalName())) {
                    objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(this.f29645a, true));
                }
            } catch (Exception unused) {
                if (!a.isRealVersion()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("get(), key:");
                    sb.append(this.f29645a);
                    sb.append(", pref:");
                    sb.append(sharedPreferences == null ? "null" : "ok");
                    a.e("OAuthLoginPreferenceManager", sb.toString());
                }
            }
            return objValueOf;
        }

        private boolean c(SharedPreferences sharedPreferences, Object obj) {
            SharedPreferences.Editor editorEdit;
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return false;
            }
            try {
                if (this.f29646b.equals(Integer.TYPE.getCanonicalName())) {
                    editorEdit.putInt(this.f29645a, ((Integer) obj).intValue());
                } else if (this.f29646b.equals(Long.TYPE.getCanonicalName())) {
                    editorEdit.putLong(this.f29645a, ((Long) obj).longValue());
                } else if (this.f29646b.equals(String.class.getCanonicalName())) {
                    editorEdit.putString(this.f29645a, (String) obj);
                } else if (this.f29646b.equals(Boolean.TYPE.getCanonicalName())) {
                    editorEdit.putBoolean(this.f29645a, ((Boolean) obj).booleanValue());
                }
                return editorEdit.commit();
            } catch (Exception e8) {
                if (!a.isRealVersion()) {
                    a.e("OAuthLoginPreferenceManager", "Prefernce Set() fail, key:" + this.f29645a + ", mType:" + this.f29646b + "e:" + e8.getMessage());
                }
                return false;
            }
        }

        public boolean del() {
            return a(OAuthLoginPreferenceManager.f29643b);
        }

        public Object get() {
            try {
                return b(OAuthLoginPreferenceManager.f29643b);
            } catch (Exception e8) {
                if (a.isRealVersion()) {
                    return null;
                }
                a.e("OAuthLoginPreferenceManager", "get() fail, e:" + e8.getMessage());
                return null;
            }
        }

        public String getValue() {
            return this.f29645a;
        }

        public boolean set(Object obj) throws InterruptedException {
            SharedPreferences sharedPreferences = OAuthLoginPreferenceManager.f29643b;
            boolean zC = false;
            for (int i8 = 0; !zC && i8 < 3; i8++) {
                if (i8 > 0) {
                    a.e("OAuthLoginPreferenceManager", "preference set() fail (cnt:" + i8 + ")");
                    try {
                        Thread.sleep(50L);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                zC = c(sharedPreferences, obj);
            }
            return zC;
        }
    }

    public OAuthLoginPreferenceManager(Context context) {
        f29642a = context;
        if (context == null) {
            a.e("OAuthLoginPreferenceManager", "context is null!");
        } else if (f29643b == null) {
            f29643b = context.getSharedPreferences("NaverOAuthLoginPreferenceData", 0);
        }
    }

    public String getAccessToken() {
        String str = (String) PREF_KEY.ACCESS_TOKEN.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ((System.currentTimeMillis() / 1000) - getExpiresAt() < 0) {
            return str;
        }
        a.i("OAuthLoginPreferenceManager", "access token is expired.");
        return null;
    }

    public String getCallbackUrl() {
        return (String) PREF_KEY.CALLBACK_URL.get();
    }

    public String getClientId() {
        return (String) PREF_KEY.CLIENT_ID.get();
    }

    public String getClientName() {
        return (String) PREF_KEY.CLIENT_NAME.get();
    }

    public String getClientSecret() {
        return (String) PREF_KEY.CLIENT_SECRET.get();
    }

    public long getExpiresAt() {
        Long l8 = (Long) PREF_KEY.EXPIRES_AT.get();
        if (l8 == null) {
            return 0L;
        }
        return l8.longValue();
    }

    public OAuthErrorCode getLastErrorCode() {
        return OAuthErrorCode.fromString((String) PREF_KEY.LAST_ERROR_CODE.get());
    }

    public String getLastErrorDesc() {
        return (String) PREF_KEY.LAST_ERROR_DESC.get();
    }

    public String getRefreshToken() {
        return (String) PREF_KEY.REFRESH_TOKEN.get();
    }

    public String getTokenType() {
        return (String) PREF_KEY.TOKEN_TYPE.get();
    }

    public void setAccessToken(String str) {
        PREF_KEY.ACCESS_TOKEN.set(str);
    }

    public void setCallbackUrl(String str) {
        PREF_KEY.CALLBACK_URL.set(str);
    }

    public void setClientId(String str) {
        PREF_KEY.CLIENT_ID.set(str);
    }

    public void setClientName(String str) {
        PREF_KEY.CLIENT_NAME.set(str);
    }

    public void setClientSecret(String str) {
        PREF_KEY.CLIENT_SECRET.set(str);
    }

    public void setExpiresAt(long j8) {
        PREF_KEY.EXPIRES_AT.set(Long.valueOf(j8));
    }

    public void setLastErrorCode(OAuthErrorCode oAuthErrorCode) {
        PREF_KEY.LAST_ERROR_CODE.set(oAuthErrorCode.getCode());
    }

    public void setLastErrorDesc(String str) {
        PREF_KEY.LAST_ERROR_DESC.set(str);
    }

    public void setRefreshToken(String str) {
        PREF_KEY.REFRESH_TOKEN.set(str);
    }

    public void setTokenType(String str) throws InterruptedException {
        PREF_KEY.TOKEN_TYPE.set(str);
    }
}
