package K1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3533lj0;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C1720Oj0;
import com.google.android.gms.internal.ads.C2126Yh0;
import com.google.android.gms.internal.ads.C2167Zh0;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: K1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0633e {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e8) {
                L1.n.zzf("JSON parsing error", e8);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i8);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i9 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i9 != 0) {
                List listZzf = C1720Oj0.zzc(AbstractC3533lj0.zzc('/')).zzf(strOptString2);
                if (listZzf.size() > 2 || listZzf.isEmpty()) {
                    obj = null;
                } else {
                    if (listZzf.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listZzf.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listZzf.get(0), 0);
                        str2 = (String) listZzf.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i10 = i9 - 1;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static void zzc(Context context) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            C2126Yh0 c2126Yh0Zzj = C2126Yh0.zzj(context);
            C2167Zh0 c2167Zh0Zzi = C2167Zh0.zzi(context);
            c2126Yh0Zzj.zzk();
            c2126Yh0Zzj.zzl();
            c2167Zh0Zzi.zzj();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcX)).booleanValue()) {
                c2167Zh0Zzi.zzk();
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcY)).booleanValue()) {
                c2167Zh0Zzi.zzl();
            }
        } catch (IOException e8) {
            G1.u.zzo().zzw(e8, "clearStorageOnIdlessMode");
        }
    }
}
