package K1;

import H1.C0591z;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC3533lj0;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C1720Oj0;
import com.google.android.gms.internal.ads.C4654va0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: K1.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0630c0 {
    private static JSONObject a(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", C0591z.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", C0591z.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", C0591z.zzb().zzb(context, rect.left));
        jSONObject.put("y", C0591z.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int b(int i8) {
        if (i8 != -2) {
            return i8 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static Point zza(MotionEvent motionEvent, View view) {
        int[] iArrZzj = zzj(view);
        return new Point(((int) motionEvent.getRawX()) - iArrZzj[0], ((int) motionEvent.getRawY()) - iArrZzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) H1.C.zzc().zza(AbstractC4439th.zzie)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = L2.a.TOP_START;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", C0591z.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", C0591z.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", C0591z.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", C0591z.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e8) {
                    L1.n.zzh("Error occurred while putting signals into JSON object.", e8);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e9) {
                e = e9;
                jSONObject = jSONObject2;
                L1.n.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrZzj = zzj(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzj2 = zzj(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", C0591z.zzb().zzb(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", C0591z.zzb().zzb(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", C0591z.zzb().zzb(context, iArrZzj2[0] - iArrZzj[0]));
                            jSONObject5.put("y", C0591z.zzb().zzb(context, iArrZzj2[1] - iArrZzj[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = a(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", C0591z.zzb().zzb(context, iArrZzj2[0] - iArrZzj[0]));
                                jSONObject2.put("y", C0591z.zzb().zzb(context, iArrZzj2[1] - iArrZzj[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhZ)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzia)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", b(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", b(layoutParams.height) - 1);
                                }
                                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzib)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    L1.n.zzj("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject = jSONObject6;
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused3) {
                            L1.n.zzj("Unable to get asset views information");
                            it = it2;
                            jSONObject3 = jSONObject;
                            str3 = str;
                            str4 = str2;
                        }
                    } catch (JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                G1.u.zzp();
                jSONObject.put("can_show_on_lock_screen", K0.zzn(view));
                G1.u.zzp();
                jSONObject.put("is_keyguard_locked", K0.zzD(context));
            } catch (JSONException unused) {
                L1.n.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zzf(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhY)).booleanValue()) {
                    G1.u.zzp();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                } else {
                    G1.u.zzp();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                        z = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170 A[Catch: JSONException -> 0x0169, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0169, blocks: (B:101:0x013a, B:118:0x0165, B:121:0x016b, B:122:0x0170), top: B:137:0x013a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0175 -> B:136:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzg(android.content.Context r16, android.view.View r17) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.AbstractC0630c0.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, C4654va0 c4654va0) {
        if (!c4654va0.zzO) {
            return false;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzic)).booleanValue()) {
            return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzif)).booleanValue();
        }
        String str = (String) H1.C.zzc().zza(AbstractC4439th.zzid);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = C1720Oj0.zzc(AbstractC3533lj0.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(int i8) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdv)).booleanValue()) {
            return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdw)).booleanValue() || i8 <= 15299999;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }
}
