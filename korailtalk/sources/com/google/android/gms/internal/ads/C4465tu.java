package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tu */
/* loaded from: classes2.dex */
public final class C4465tu {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final long zzn;
    public final long zzo;

    public C4465tu(String str) throws JSONException {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = a(jSONObject, "aggressive_media_codec_release", AbstractC4439th.zzI);
        this.zzb = b(jSONObject, "byte_buffer_precache_limit", AbstractC4439th.zzl);
        this.zzc = b(jSONObject, "exo_cache_buffer_size", AbstractC4439th.zzw);
        this.zzd = b(jSONObject, "exo_connect_timeout_millis", AbstractC4439th.zzh);
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzg;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        } else {
            string = (String) H1.C.zzc().zza(abstractC3414kh);
        }
        this.zze = string;
        this.zzf = b(jSONObject, "exo_read_timeout_millis", AbstractC4439th.zzi);
        this.zzg = b(jSONObject, "load_check_interval_bytes", AbstractC4439th.zzj);
        this.zzh = b(jSONObject, "player_precache_limit", AbstractC4439th.zzk);
        this.zzi = b(jSONObject, "socket_receive_buffer_size", AbstractC4439th.zzm);
        this.zzj = a(jSONObject, "use_cache_data_source", AbstractC4439th.zzen);
        b(jSONObject, "min_retry_count", AbstractC4439th.zzn);
        this.zzk = a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC4439th.zzq);
        this.zzl = a(jSONObject, "enable_multiple_video_playback", AbstractC4439th.zzbS);
        this.zzm = a(jSONObject, "use_range_http_data_source", AbstractC4439th.zzbU);
        this.zzn = c(jSONObject, "range_http_data_source_high_water_mark", AbstractC4439th.zzbV);
        this.zzo = c(jSONObject, "range_http_data_source_low_water_mark", AbstractC4439th.zzbW);
    }

    private static final boolean a(JSONObject jSONObject, String str, AbstractC3414kh abstractC3414kh) {
        boolean zBooleanValue = ((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, AbstractC3414kh abstractC3414kh) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) H1.C.zzc().zza(abstractC3414kh)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, AbstractC3414kh abstractC3414kh) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) H1.C.zzc().zza(abstractC3414kh)).longValue();
    }
}
