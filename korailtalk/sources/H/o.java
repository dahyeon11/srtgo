package H;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class o implements Comparable {
    public static final o VERSION_1_0 = create(1, 0, 0, "");
    public static final o VERSION_1_1 = create(1, 1, 0, "");
    public static final o VERSION_1_2 = create(1, 2, 0, "");

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f1563a = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    o() {
    }

    private static BigInteger a(o oVar) {
        return BigInteger.valueOf(oVar.getMajor()).shiftLeft(32).or(BigInteger.valueOf(oVar.c())).shiftLeft(32).or(BigInteger.valueOf(oVar.d()));
    }

    public static o create(int i8, int i9, int i10, String str) {
        return new f(i8, i9, i10, str);
    }

    public static o parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f1563a.matcher(str);
        if (matcher.matches()) {
            return create(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    abstract String b();

    abstract int c();

    abstract int d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Integer.valueOf(getMajor()).equals(Integer.valueOf(oVar.getMajor())) && Integer.valueOf(c()).equals(Integer.valueOf(oVar.c())) && Integer.valueOf(d()).equals(Integer.valueOf(oVar.d()));
    }

    public abstract int getMajor();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(getMajor()), Integer.valueOf(c()), Integer.valueOf(d()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getMajor() + "." + c() + "." + d());
        if (!TextUtils.isEmpty(b())) {
            sb.append(g5.e.STATE_NAME_NONE + b());
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(o oVar) {
        return a(this).compareTo(a(oVar));
    }

    public int compareTo(int i8) {
        return compareTo(i8, 0);
    }

    public int compareTo(int i8, int i9) {
        if (getMajor() == i8) {
            return Integer.compare(c(), i9);
        }
        return Integer.compare(getMajor(), i8);
    }
}
