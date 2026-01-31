package l1;

import Q7.C;
import S6.r;
import android.text.TextUtils;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import j1.C5811a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k1.InterfaceC5843a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.AbstractC5897c;

/* renamed from: l1.e */
/* loaded from: classes.dex */
public final class C5886e {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private static final List f33940i = r.listOf((Object[]) new String[]{"0", "1", "2", "3", StbkAcntDao.ACCOUNT_REGISTER, StbkAcntDao.CHANGE_PASSWORD, "6", "7", "8", StbkAcntDao.DELETE_ACCOUNT, "/"});

    /* renamed from: a */
    private final List f33941a = new ArrayList();

    /* renamed from: b */
    private final List f33942b = new ArrayList();

    /* renamed from: c */
    private final List f33943c = new ArrayList();

    /* renamed from: d */
    private final List f33944d = new ArrayList();

    /* renamed from: e */
    private final List f33945e = new ArrayList();

    /* renamed from: f */
    private final List f33946f = new ArrayList();

    /* renamed from: g */
    private int f33947g = 1;

    /* renamed from: h */
    private final l7.n f33948h = new l7.n("\\d{2}[/]?\\d{2}");

    /* renamed from: l1.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getNumberLabels$Code1CardScanLib_release() {
            return C5886e.f33940i;
        }

        private a() {
        }
    }

    /* renamed from: l1.e$b */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$d */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$e */
    public static final class C0344e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$f */
    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$g */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().top), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().top));
        }
    }

    /* renamed from: l1.e$h */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$i */
    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$j */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().top), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().top));
        }
    }

    /* renamed from: l1.e$k */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$l */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$m */
    public static final class m implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$n */
    public static final class n implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().top), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().top));
        }
    }

    /* renamed from: l1.e$o */
    public static final class o implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$p */
    public static final class p implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    /* renamed from: l1.e$q */
    public static final class q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return V6.a.compareValues(Float.valueOf(((InterfaceC5843a.C0337a) obj).getLocation().left), Float.valueOf(((InterfaceC5843a.C0337a) obj2).getLocation().left));
        }
    }

    private final String a(List list, int i8) {
        String strStringPlus = "";
        if (i8 != 1) {
            int i9 = 0;
            if (i8 == 2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (list.size() > 1) {
                    r.sortWith(list, new g());
                }
                int size = list.size();
                while (i9 < size) {
                    int i10 = i9 + 1;
                    if (i9 < 8) {
                        arrayList.add(list.get(i9));
                    } else {
                        arrayList2.add(list.get(i9));
                    }
                    i9 = i10;
                }
                if (arrayList.size() > 1) {
                    r.sortWith(arrayList, new h());
                }
                if (arrayList2.size() > 1) {
                    r.sortWith(arrayList2, new i());
                }
                Iterator it = r.plus((Collection) arrayList, (Iterable) arrayList2).iterator();
                while (it.hasNext()) {
                    strStringPlus = Intrinsics.stringPlus(strStringPlus, ((InterfaceC5843a.C0337a) it.next()).getTitle());
                }
            } else if (i8 != 3) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (list.size() > 1) {
                    r.sortWith(list, new n());
                }
                int size2 = list.size();
                while (i9 < size2) {
                    int i11 = i9 + 1;
                    if (i9 < 4) {
                        arrayList3.add(list.get(i9));
                    } else if (4 <= i9 && i9 < 8) {
                        arrayList4.add(list.get(i9));
                    } else if (8 > i9 || i9 >= 12) {
                        arrayList6.add(list.get(i9));
                    } else {
                        arrayList5.add(list.get(i9));
                    }
                    i9 = i11;
                }
                if (arrayList3.size() > 1) {
                    r.sortWith(arrayList3, new b());
                }
                if (arrayList4.size() > 1) {
                    r.sortWith(arrayList4, new c());
                }
                if (arrayList5.size() > 1) {
                    r.sortWith(arrayList5, new d());
                }
                if (arrayList6.size() > 1) {
                    r.sortWith(arrayList6, new C0344e());
                }
                Iterator it2 = r.plus((Collection) r.plus((Collection) r.plus((Collection) arrayList3, (Iterable) arrayList4), (Iterable) arrayList5), (Iterable) arrayList6).iterator();
                while (it2.hasNext()) {
                    strStringPlus = Intrinsics.stringPlus(strStringPlus, ((InterfaceC5843a.C0337a) it2.next()).getTitle());
                }
            } else {
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                if (list.size() > 1) {
                    r.sortWith(list, new j());
                }
                int size3 = list.size();
                while (i9 < size3) {
                    int i12 = i9 + 1;
                    if (i9 < 4) {
                        arrayList7.add(list.get(i9));
                    } else if (4 > i9 || i9 >= 10) {
                        arrayList9.add(list.get(i9));
                    } else {
                        arrayList8.add(list.get(i9));
                    }
                    i9 = i12;
                }
                if (arrayList7.size() > 1) {
                    r.sortWith(arrayList7, new k());
                }
                if (arrayList8.size() > 1) {
                    r.sortWith(arrayList8, new l());
                }
                if (arrayList9.size() > 1) {
                    r.sortWith(arrayList9, new m());
                }
                Iterator it3 = r.plus((Collection) r.plus((Collection) arrayList7, (Iterable) arrayList8), (Iterable) arrayList9).iterator();
                while (it3.hasNext()) {
                    strStringPlus = Intrinsics.stringPlus(strStringPlus, ((InterfaceC5843a.C0337a) it3.next()).getTitle());
                }
            }
        } else {
            if (list.size() > 1) {
                r.sortWith(list, new f());
            }
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                strStringPlus = Intrinsics.stringPlus(strStringPlus, ((InterfaceC5843a.C0337a) it4.next()).getTitle());
            }
        }
        return strStringPlus;
    }

    private final String b(List list) {
        if (list.size() > 1) {
            r.sortWith(list, new o());
        }
        float fCenterX = ((InterfaceC5843a.C0337a) list.get(0)).getLocation().centerX();
        if (list.size() == 16) {
            i = fCenterX > ((InterfaceC5843a.C0337a) list.get(1)).getLocation().left ? 2 : 1;
            if (this.f33947g == 4) {
                i = 4;
            }
        } else if (list.size() == 15 && fCenterX <= ((InterfaceC5843a.C0337a) list.get(1)).getLocation().left) {
            i = 3;
        }
        return a(list, i);
    }

    private final String c(String str, String str2) {
        return Integer.parseInt((String) l7.r.split$default((CharSequence) str, new String[]{"/"}, false, 0, 6, (Object) null).get(1)) > Integer.parseInt((String) l7.r.split$default((CharSequence) str2, new String[]{"/"}, false, 0, 6, (Object) null).get(1)) ? str : str2;
    }

    private final boolean d(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (l7.r.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null)) {
            return false;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(Integer.valueOf(AbstractC5897c.digitToInt(str.charAt(i8))));
        }
        Iterator it = r.asReversedMutable(arrayList).iterator();
        boolean z8 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue() * (z8 ? 2 : 1);
            if (iIntValue > 9) {
                iIntValue = (iIntValue - 10) + (iIntValue / 10);
            }
            arrayList2.add(Integer.valueOf(iIntValue));
            z8 = !z8;
        }
        Iterator it2 = arrayList2.iterator();
        int iIntValue2 = 0;
        while (it2.hasNext()) {
            iIntValue2 += ((Number) it2.next()).intValue();
        }
        return iIntValue2 % 10 == 0;
    }

    private final String e(String str) {
        int i8;
        String str2 = (String) l7.r.split$default((CharSequence) str, new String[]{"/"}, false, 0, 6, (Object) null).get(0);
        return (!TextUtils.isDigitsOnly(str2) || 1 > (i8 = Integer.parseInt(str2)) || i8 >= 13) ? "0" : str;
    }

    private final void f() {
        this.f33942b.clear();
        this.f33943c.clear();
        this.f33944d.clear();
        this.f33945e.clear();
        this.f33946f.clear();
        this.f33941a.clear();
    }

    private final List g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            InterfaceC5843a.C0337a c0337a = (InterfaceC5843a.C0337a) it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC5843a.C0337a c0337a2 = (InterfaceC5843a.C0337a) it2.next();
                if (c0337a.getLocation().left < c0337a2.getLocation().centerX() && c0337a.getLocation().right > c0337a2.getLocation().centerX() && c0337a.getLocation().top < c0337a2.getLocation().centerY() && c0337a.getLocation().bottom > c0337a2.getLocation().centerY()) {
                    arrayList2.add(c0337a2);
                }
            }
            if (arrayList2.size() > 1) {
                r.sortWith(arrayList2, new q());
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final List h(List list, List list2) {
        this.f33947g = 1;
        ArrayList arrayList = new ArrayList();
        InterfaceC5843a.C0337a c0337a = (InterfaceC5843a.C0337a) list2.get(0);
        if (c0337a.getLocation().width() < c0337a.getLocation().height()) {
            this.f33947g = 4;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5843a.C0337a c0337a2 = (InterfaceC5843a.C0337a) it.next();
            if (c0337a.getLocation().left < c0337a2.getLocation().centerX() && c0337a.getLocation().right > c0337a2.getLocation().centerX() && c0337a.getLocation().top < c0337a2.getLocation().centerY() && c0337a.getLocation().bottom > c0337a2.getLocation().centerY()) {
                arrayList.add(c0337a2);
            }
        }
        return arrayList;
    }

    private final void i(List list) {
        String lowerCase;
        Iterator it = list.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            InterfaceC5843a.C0337a c0337a = (InterfaceC5843a.C0337a) it.next();
            String title = c0337a.getTitle();
            if (title == null) {
                lowerCase = null;
            } else {
                lowerCase = title.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (r.contains(f33940i, lowerCase)) {
                this.f33941a.add(c0337a);
            } else if (Intrinsics.areEqual(lowerCase, "date")) {
                if (this.f33943c.size() == 0) {
                    this.f33943c.add(c0337a);
                } else if (((InterfaceC5843a.C0337a) this.f33943c.get(0)).getLocation().left < c0337a.getLocation().left) {
                    this.f33943c.set(0, c0337a);
                }
            } else if (Intrinsics.areEqual(lowerCase, "number")) {
                Float confidence = c0337a.getConfidence();
                Intrinsics.checkNotNull(confidence);
                if (fFloatValue < confidence.floatValue()) {
                    fFloatValue = c0337a.getConfidence().floatValue();
                    if (this.f33942b.size() != 0) {
                        this.f33942b.remove(0);
                        this.f33942b.add(c0337a);
                    } else {
                        this.f33942b.add(c0337a);
                    }
                }
            }
        }
    }

    private final String j(List list) {
        Iterator it = list.iterator();
        String value = "";
        int i8 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            String string = "";
            while (it2.hasNext()) {
                string = Intrinsics.stringPlus(string, ((InterfaceC5843a.C0337a) it2.next()).getTitle());
            }
            if (l7.r.indexOf$default((CharSequence) string, "/", 0, false, 6, (Object) null) == -1 || string.length() != 4) {
                if (l7.r.indexOf$default((CharSequence) string, "/", 0, false, 6, (Object) null) == -1 && string.length() == 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string.charAt(0));
                    sb.append(string.charAt(1));
                    sb.append('/');
                    sb.append(string.charAt(2));
                    sb.append(string.charAt(3));
                    string = sb.toString();
                } else if (l7.r.indexOf$default((CharSequence) string, "/", 0, false, 6, (Object) null) == -1 || string.length() != 5) {
                    if (l7.r.indexOf$default((CharSequence) string, "/", 0, false, 6, (Object) null) != -1 && string.length() == 10) {
                        if (((String) l7.r.split$default((CharSequence) string, new String[]{"/"}, false, 0, 6, (Object) null).get(0)).length() == 4) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(string.charAt(5));
                            sb2.append(string.charAt(6));
                            sb2.append('/');
                            sb2.append(string.charAt(2));
                            sb2.append(string.charAt(3));
                            string = sb2.toString();
                        } else {
                            if (((String) l7.r.split$default((CharSequence) string, new String[]{"/"}, false, 0, 6, (Object) null).get(2)).length() == 4) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(C.INNER_CLASS_SEPARATOR_CHAR);
                                sb3.append(string.charAt(3));
                                sb3.append(string.charAt(4));
                                sb3.append('/');
                                sb3.append(string.charAt(8));
                                sb3.append(string.charAt(9));
                                string = sb3.toString();
                            }
                        }
                    } else if (l7.r.indexOf$default((CharSequence) string, "/", 0, false, 6, (Object) null) != -1 && string.length() == 7) {
                        if (((String) l7.r.split$default((CharSequence) string, new String[]{"/"}, false, 0, 6, (Object) null).get(0)).length() == 4) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(string.charAt(5));
                            sb4.append(string.charAt(6));
                            sb4.append('/');
                            sb4.append(string.charAt(2));
                            sb4.append(string.charAt(3));
                            string = sb4.toString();
                        } else {
                            if (((String) l7.r.split$default((CharSequence) string, new String[]{"/"}, false, 0, 6, (Object) null).get(1)).length() == 4) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(string.charAt(0));
                                sb5.append(string.charAt(1));
                                sb5.append('/');
                                sb5.append(string.charAt(5));
                                sb5.append(string.charAt(6));
                                string = sb5.toString();
                            }
                        }
                    }
                }
                l7.l lVarFind$default = l7.n.find$default(this.f33948h, string, 0, 2, null);
                if (lVarFind$default != null) {
                    String value2 = lVarFind$default.getValue();
                    if (i8 == 0) {
                        value = lVarFind$default.getValue();
                        i8++;
                    } else {
                        value = c(value, value2);
                    }
                }
            }
        }
        return !Intrinsics.areEqual(value, "") ? e(value) : "0";
    }

    public final C5811a getCardResult$Code1CardScanLib_release(List<InterfaceC5843a.C0337a> detectResults) {
        Intrinsics.checkNotNullParameter(detectResults, "detectResults");
        C5811a c5811a = new C5811a(null, null, null, null, false, false, 63, null);
        i(detectResults);
        List list = this.f33943c;
        if (list.size() > 1) {
            r.sortWith(list, new p());
        }
        if (this.f33942b.size() == 0) {
            f();
            return c5811a;
        }
        r.addAll(this.f33944d, h(this.f33941a, this.f33942b));
        int size = this.f33944d.size();
        if (14 > size || size >= 17) {
            f();
            return c5811a;
        }
        if (this.f33943c.size() != 0) {
            r.addAll(this.f33945e, g(this.f33941a, this.f33943c));
            if (this.f33945e.size() >= 1) {
                c5811a.setValidDate(j(this.f33945e));
            } else {
                c5811a.setValidDate("0");
            }
        } else {
            c5811a.setValidDate("0");
        }
        String strB = b(this.f33944d);
        c5811a.setCardNumber(strB);
        c5811a.setLuhnCheckSum(d(strB));
        c5811a.setResultCheckSum(true);
        f();
        return c5811a;
    }
}
