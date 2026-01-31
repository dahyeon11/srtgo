package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.tf0 */
/* loaded from: classes2.dex */
public final class C4436tf0 {

    /* renamed from: a */
    private final HashMap f22898a = new HashMap();

    /* renamed from: b */
    private final HashMap f22899b = new HashMap();

    /* renamed from: c */
    private final HashMap f22900c = new HashMap();

    /* renamed from: d */
    private final HashSet f22901d = new HashSet();

    /* renamed from: e */
    private final HashSet f22902e = new HashSet();

    /* renamed from: f */
    private final HashSet f22903f = new HashSet();

    /* renamed from: g */
    private final HashMap f22904g = new HashMap();

    /* renamed from: h */
    private final Map f22905h = new WeakHashMap();

    /* renamed from: i */
    private boolean f22906i;

    public final View zza(String str) {
        return (View) this.f22900c.get(str);
    }

    public final C4322sf0 zzb(View view) {
        C4322sf0 c4322sf0 = (C4322sf0) this.f22899b.get(view);
        if (c4322sf0 != null) {
            this.f22899b.remove(view);
        }
        return c4322sf0;
    }

    public final String zzc(String str) {
        return (String) this.f22904g.get(str);
    }

    public final String zzd(View view) {
        if (this.f22898a.size() == 0) {
            return null;
        }
        String str = (String) this.f22898a.get(view);
        if (str != null) {
            this.f22898a.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.f22903f;
    }

    public final HashSet zzf() {
        return this.f22902e;
    }

    public final void zzg() {
        this.f22898a.clear();
        this.f22899b.clear();
        this.f22900c.clear();
        this.f22901d.clear();
        this.f22902e.clear();
        this.f22903f.clear();
        this.f22904g.clear();
        this.f22906i = false;
    }

    public final void zzh() {
        this.f22906i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        Boolean bool;
        String str;
        C1751Pe0 c1751Pe0Zza = C1751Pe0.zza();
        if (c1751Pe0Zza != null) {
            for (C4890xe0 c4890xe0 : c1751Pe0Zza.zzb()) {
                View viewZzf = c4890xe0.zzf();
                if (c4890xe0.zzj()) {
                    String strZzh = c4890xe0.zzh();
                    if (viewZzf != null) {
                        if (viewZzf.isAttachedToWindow()) {
                            if (viewZzf.hasWindowFocus()) {
                                this.f22905h.remove(viewZzf);
                                bool = Boolean.FALSE;
                            } else if (this.f22905h.containsKey(viewZzf)) {
                                bool = (Boolean) this.f22905h.get(viewZzf);
                            } else {
                                Map map = this.f22905h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewZzf, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = viewZzf;
                                while (true) {
                                    if (view == null) {
                                        this.f22901d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strZza = AbstractC4095qf0.zza(view);
                                    if (strZza != null) {
                                        str = strZza;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f22902e.add(strZzh);
                            this.f22898a.put(viewZzf, strZzh);
                            for (C1874Se0 c1874Se0 : c4890xe0.zzi()) {
                                View view2 = (View) c1874Se0.zzb().get();
                                if (view2 != null) {
                                    C4322sf0 c4322sf0 = (C4322sf0) this.f22899b.get(view2);
                                    if (c4322sf0 != null) {
                                        c4322sf0.zzc(c4890xe0.zzh());
                                    } else {
                                        this.f22899b.put(view2, new C4322sf0(c1874Se0, c4890xe0.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f22903f.add(strZzh);
                            this.f22900c.put(strZzh, viewZzf);
                            this.f22904g.put(strZzh, str);
                        }
                    } else {
                        this.f22903f.add(strZzh);
                        this.f22904g.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(View view) {
        if (!this.f22905h.containsKey(view)) {
            return true;
        }
        this.f22905h.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzk(View view) {
        if (this.f22901d.contains(view)) {
            return 1;
        }
        return this.f22906i ? 2 : 3;
    }
}
