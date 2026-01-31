package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2435c6 {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f18247b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f18248c;
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f18246a = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18247b = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f18248c = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.text.SpannedString a(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2435c6.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    static C4649vW b(String str) {
        C2321b6 c2321b6 = new C2321b6();
        g(str, c2321b6);
        return c2321b6.zza();
    }

    private static int c(List list, String str, Z5 z52) {
        List listE = e(list, str, z52);
        for (int i8 = 0; i8 < listE.size(); i8++) {
            U5 u52 = ((C2206a6) listE.get(i8)).zzb;
            if (u52.zze() != -1) {
                return u52.zze();
            }
        }
        return -1;
    }

    private static V5 d(String str, Matcher matcher, C4099qh0 c4099qh0, List list) {
        C2321b6 c2321b6 = new C2321b6();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            c2321b6.zza = AbstractC2664e6.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            c2321b6.zzb = AbstractC2664e6.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            g(strGroup3, c2321b6);
            StringBuilder sb = new StringBuilder();
            String strZzy = c4099qh0.zzy(AbstractC3647mj0.zzc);
            while (!TextUtils.isEmpty(strZzy)) {
                if (sb.length() > 0) {
                    sb.append(Q7.X.LF);
                }
                sb.append(strZzy.trim());
                strZzy = c4099qh0.zzy(AbstractC3647mj0.zzc);
            }
            c2321b6.zzc = a(str, sb.toString(), list);
            return new V5(c2321b6.zza().zzp(), c2321b6.zza, c2321b6.zzb);
        } catch (NumberFormatException unused) {
            AbstractC2834fc0.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List e(List list, String str, Z5 z52) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            U5 u52 = (U5) list.get(i8);
            int iZzf = u52.zzf(str, z52.zza, z52.zzd, z52.zzc);
            if (iZzf > 0) {
                arrayList.add(new C2206a6(iZzf, u52));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.String r18, com.google.android.gms.internal.ads.Z5 r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC2435c6.f(java.lang.String, com.google.android.gms.internal.ads.Z5, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void g(String str, C2321b6 c2321b6) {
        Matcher matcher = f18246a.matcher(str);
        while (matcher.find()) {
            int i8 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i9 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                char c9 = 65535;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c9 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c9 == 0) {
                            i9 = 0;
                        } else if (c9 == 1 || c9 == 2) {
                            i9 = 1;
                        } else if (c9 != 3) {
                            AbstractC2834fc0.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i9 = Integer.MIN_VALUE;
                        }
                        c2321b6.zzg = i9;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        c2321b6.zze = AbstractC2664e6.zza(strGroup2);
                        c2321b6.zzf = 0;
                    } else {
                        c2321b6.zze = Integer.parseInt(strGroup2);
                        c2321b6.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c9 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c9 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                c9 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c9 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c9 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                c9 = 0;
                                break;
                            }
                            break;
                    }
                    if (c9 != 0) {
                        if (c9 == 1) {
                            i8 = 4;
                        } else if (c9 == 2 || c9 == 3) {
                            i8 = 2;
                        } else if (c9 == 4) {
                            i8 = 3;
                        } else if (c9 != 5) {
                            AbstractC2834fc0.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i8 = 2;
                        } else {
                            i8 = 5;
                        }
                    }
                    c2321b6.zzd = i8;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c9 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    c9 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    c9 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c9 == 0 || c9 == 1) {
                            i8 = 0;
                        } else if (c9 != 2 && c9 != 3) {
                            if (c9 == 4 || c9 == 5) {
                                i8 = 2;
                            } else {
                                AbstractC2834fc0.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i8 = Integer.MIN_VALUE;
                            }
                        }
                        c2321b6.zzi = i8;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    c2321b6.zzh = AbstractC2664e6.zza(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c2321b6.zzj = AbstractC2664e6.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c9 = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c9 = 1;
                    }
                    if (c9 != 0) {
                        if (c9 != 1) {
                            AbstractC2834fc0.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i8 = Integer.MIN_VALUE;
                        } else {
                            i8 = 2;
                        }
                    }
                    c2321b6.zzk = i8;
                } else {
                    AbstractC2834fc0.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                AbstractC2834fc0.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    public static V5 zzc(C4099qh0 c4099qh0, List list) {
        Charset charset = AbstractC3647mj0.zzc;
        String strZzy = c4099qh0.zzy(charset);
        if (strZzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzy);
            if (matcher.matches()) {
                return d(null, matcher, c4099qh0, list);
            }
            String strZzy2 = c4099qh0.zzy(charset);
            if (strZzy2 != null) {
                Matcher matcher2 = pattern.matcher(strZzy2);
                if (matcher2.matches()) {
                    return d(strZzy.trim(), matcher2, c4099qh0, list);
                }
            }
        }
        return null;
    }
}
