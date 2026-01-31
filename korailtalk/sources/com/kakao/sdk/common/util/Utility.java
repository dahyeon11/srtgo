package com.kakao.sdk.common.util;

import R6.p;
import S6.Q;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import com.google.gson.f;
import com.google.gson.l;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.kakao.sdk.auth.Constants;
import com.kakao.sdk.common.KakaoSdk;
import d7.k;
import g5.e;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l7.C5900f;
import l7.n;
import l7.r;

/* loaded from: classes.dex */
public final class Utility {
    public static final Utility INSTANCE = new Utility();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KakaoSdk.Type.values().length];
            iArr[KakaoSdk.Type.RX_KOTLIN.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Utility() {
    }

    public final byte[] androidId(Context context) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String androidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
            Intrinsics.checkNotNullExpressionValue(androidId, "androidId");
            String strReplace = new n("[0\\s]").replace(androidId, "");
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM);
            messageDigest.reset();
            String strStringPlus = Intrinsics.stringPlus("SDK-", strReplace);
            Charset charset = C5900f.UTF_8;
            if (strStringPlus == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strStringPlus.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "{\n            val androidId =\n                Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)\n            val stripped = androidId.replace(\"[0\\\\s]\".toRegex(), \"\")\n            val md = MessageDigest.getInstance(\"SHA-256\")\n            md.reset()\n            md.update(\"SDK-$stripped\".toByteArray())\n            md.digest()\n        }");
            return bArrDigest;
        } catch (Exception unused) {
            String str = "xxxx" + ((Object) Build.PRODUCT) + "a23456789012345bcdefg";
            Charset charset2 = C5900f.UTF_8;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes2 = str.getBytes(charset2);
            Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
            return bytes2;
        }
    }

    public final String buildQuery(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + '=' + entry.getValue());
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = ((String) next) + '&' + ((String) it.next());
        }
        return (String) next;
    }

    public final l getExtras(Context context, KakaoSdk.Type sdkType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        l lVar = new l();
        lVar.addProperty(com.kakao.sdk.common.Constants.APP_PACKAGE, context.getPackageName());
        lVar.addProperty(com.kakao.sdk.common.Constants.APP_KEY_HASH, getKeyHash(context));
        lVar.addProperty(com.kakao.sdk.common.Constants.KA, getKAHeader(context, sdkType));
        return lVar;
    }

    public final String getJson(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ClassLoader classLoader = Utility.class.getClassLoader();
        classLoader.getClass();
        return new String(k.readBytes(new File(classLoader.getResource(path).getPath())), C5900f.UTF_8);
    }

    public final f getJsonArray(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return (f) KakaoJson.INSTANCE.fromJson(getJson(path), f.class);
    }

    public final l getJsonObject(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return (l) KakaoJson.INSTANCE.fromJson(getJson(path), l.class);
    }

    public final String getKAHeader(Context context, KakaoSdk.Type sdkType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkType, "sdkType");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = WhenMappings.$EnumSwitchMapping$0[sdkType.ordinal()] == 1 ? com.kakao.sdk.common.Constants.SDK_TYPE_RX_KOTLIN : com.kakao.sdk.common.Constants.SDK_TYPE_KOTLIN;
        Integer numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String language = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
        Locale locale = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getDefault().country");
        String upperCase = country.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        String keyHash = getKeyHash(context);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase2 = MODEL.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        String str2 = String.format("%s/%s %s/%s %s/android-%s %s/%s-%s %s/%s %s/%s %s/%s %s/%s", Arrays.copyOf(new Object[]{com.kakao.sdk.common.Constants.SDK, "2.11.0", com.kakao.sdk.common.Constants.SDK_TYPE, str, com.kakao.sdk.common.Constants.OS, numValueOf, com.kakao.sdk.common.Constants.LANG, lowerCase, upperCase, com.kakao.sdk.common.Constants.ORIGIN, keyHash, com.kakao.sdk.common.Constants.DEVICE, new n("\\s").replace(new n("[^\\p{ASCII}]").replace(upperCase2, "*"), e.STATE_NAME_NONE), com.kakao.sdk.common.Constants.ANDROID_PKG, context.getPackageName(), com.kakao.sdk.common.Constants.APP_VER, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName}, 17));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    public final String getKeyHash(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getKeyHashDeprecated(context);
    }

    public final String getKeyHashDeprecated(Context context) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
        if (signatureArr.length <= 0) {
            throw new IllegalStateException();
        }
        Signature signature = signatureArr[0];
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(signature.toByteArray());
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(md.digest(), Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final String getMetadata(Context context, String key) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n            context.packageName, PackageManager.GET_META_DATA\n        )");
        return applicationInfo.metaData.getString(key);
    }

    public final boolean hasAndNotNull(l jsonObject, String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(key, "key");
        return jsonObject.has(key) && !(jsonObject.get(key) instanceof com.google.gson.k);
    }

    public final Map<String, String> parseQuery(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return Q.emptyMap();
        }
        List listSplit$default = r.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(S6.r.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(r.split$default((CharSequence) it.next(), new String[]{SimpleComparison.EQUAL_TO_OPERATION}, false, 0, 6, (Object) null));
        }
        ArrayList<List> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((List) obj).size() > 1) {
                arrayList2.add(obj);
            }
        }
        ArrayList<p> arrayList3 = new ArrayList(S6.r.collectionSizeOrDefault(arrayList2, 10));
        for (List list : arrayList2) {
            arrayList3.add(new p(list.get(0), list.get(1)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (p pVar : arrayList3) {
            Object first = pVar.getFirst();
            String strDecode = URLDecoder.decode((String) pVar.getSecond(), "UTF-8");
            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(pair.second, \"UTF-8\")");
            linkedHashMap.put(first, strDecode);
        }
        return linkedHashMap;
    }
}
