package S6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: S6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0767k extends C0766j {
    private static final void a(Object[] objArr, StringBuilder sb, List list) {
        if (list.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        list.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i8];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                a((Object[]) obj, sb, list);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof R6.x) {
                sb.append(U6.a.m195contentToString2csIQuQ(((R6.x) obj).m99unboximpl()));
            } else if (obj instanceof R6.E) {
                sb.append(U6.a.m197contentToStringd6D3K8(((R6.E) obj).m60unboximpl()));
            } else if (obj instanceof R6.z) {
                sb.append(U6.a.m196contentToStringXUkPCBk(((R6.z) obj).m124unboximpl()));
            } else if (obj instanceof R6.B) {
                sb.append(U6.a.m198contentToStringuLth9ew(((R6.B) obj).m35unboximpl()));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        list.remove(r.getLastIndex(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean contentDeepEquals(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            Object[] objArr = tArr[i8];
            Object[] objArr2 = tArr2[i8];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof R6.x) && (objArr2 instanceof R6.x)) {
                    if (!U6.a.m189contentEqualskV0jMPg(((R6.x) objArr).m99unboximpl(), ((R6.x) objArr2).m99unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof R6.E) && (objArr2 instanceof R6.E)) {
                    if (!U6.a.m187contentEqualsFGO6Aew(((R6.E) objArr).m60unboximpl(), ((R6.E) objArr2).m60unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof R6.z) && (objArr2 instanceof R6.z)) {
                    if (!U6.a.m188contentEqualsKJPZfPQ(((R6.z) objArr).m124unboximpl(), ((R6.z) objArr2).m124unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof R6.B) && (objArr2 instanceof R6.B)) {
                    if (!U6.a.m190contentEqualslec5QzE(((R6.B) objArr).m35unboximpl(), ((R6.B) objArr2).m35unboximpl())) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final <T> String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((j7.s.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        a(tArr, sb, new ArrayList());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <T> List<T> flatten(T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            C0782y.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    public static final <T, R> R6.p unzip(R6.p[] pVarArr) {
        Intrinsics.checkNotNullParameter(pVarArr, "<this>");
        ArrayList arrayList = new ArrayList(pVarArr.length);
        ArrayList arrayList2 = new ArrayList(pVarArr.length);
        for (R6.p pVar : pVarArr) {
            arrayList.add(pVar.getFirst());
            arrayList2.add(pVar.getSecond());
        }
        return R6.v.to(arrayList, arrayList2);
    }
}
