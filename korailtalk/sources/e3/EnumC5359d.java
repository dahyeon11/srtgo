package e3;

import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC5359d {
    public static final EnumC5359d LOWER_CAMEL;
    public static final EnumC5359d LOWER_UNDERSCORE;
    public static final EnumC5359d UPPER_CAMEL;
    public static final EnumC5359d UPPER_UNDERSCORE;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5360e f30339a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30340b;
    public static final EnumC5359d LOWER_HYPHEN = new a("LOWER_HYPHEN", 0, AbstractC5360e.is('-'), g5.e.STATE_NAME_NONE);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5359d[] f30338c = a();

    /* renamed from: e3.d$a */
    enum a extends EnumC5359d {
        a(String str, int i8, AbstractC5360e abstractC5360e, String str2) {
            super(str, i8, abstractC5360e, str2, null);
        }

        @Override // e3.EnumC5359d
        String c(EnumC5359d enumC5359d, String str) {
            return enumC5359d == EnumC5359d.LOWER_UNDERSCORE ? str.replace('-', '_') : enumC5359d == EnumC5359d.UPPER_UNDERSCORE ? AbstractC5358c.toUpperCase(str.replace('-', '_')) : super.c(enumC5359d, str);
        }

        @Override // e3.EnumC5359d
        String f(String str) {
            return AbstractC5358c.toLowerCase(str);
        }
    }

    /* renamed from: e3.d$f */
    private static final class f extends AbstractC5367i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private final EnumC5359d f30341c;

        /* renamed from: d, reason: collision with root package name */
        private final EnumC5359d f30342d;

        f(EnumC5359d enumC5359d, EnumC5359d enumC5359d2) {
            this.f30341c = (EnumC5359d) w.checkNotNull(enumC5359d);
            this.f30342d = (EnumC5359d) w.checkNotNull(enumC5359d2);
        }

        @Override // e3.AbstractC5367i, e3.l
        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f30341c.equals(fVar.f30341c) && this.f30342d.equals(fVar.f30342d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.AbstractC5367i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String d(String str) {
            return this.f30342d.to(this.f30341c, str);
        }

        public int hashCode() {
            return this.f30341c.hashCode() ^ this.f30342d.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.AbstractC5367i
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public String e(String str) {
            return this.f30341c.to(this.f30342d, str);
        }

        public String toString() {
            return this.f30341c + ".converterTo(" + this.f30342d + ")";
        }
    }

    static {
        String str = "_";
        LOWER_UNDERSCORE = new EnumC5359d("LOWER_UNDERSCORE", 1, AbstractC5360e.is('_'), str) { // from class: e3.d.b
            {
                a aVar = null;
            }

            @Override // e3.EnumC5359d
            String c(EnumC5359d enumC5359d, String str2) {
                return enumC5359d == EnumC5359d.LOWER_HYPHEN ? str2.replace('_', '-') : enumC5359d == EnumC5359d.UPPER_UNDERSCORE ? AbstractC5358c.toUpperCase(str2) : super.c(enumC5359d, str2);
            }

            @Override // e3.EnumC5359d
            String f(String str2) {
                return AbstractC5358c.toLowerCase(str2);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new EnumC5359d("LOWER_CAMEL", 2, AbstractC5360e.inRange('A', 'Z'), str2) { // from class: e3.d.c
            {
                a aVar = null;
            }

            @Override // e3.EnumC5359d
            String e(String str3) {
                return AbstractC5358c.toLowerCase(str3);
            }

            @Override // e3.EnumC5359d
            String f(String str3) {
                return EnumC5359d.d(str3);
            }
        };
        UPPER_CAMEL = new EnumC5359d("UPPER_CAMEL", 3, AbstractC5360e.inRange('A', 'Z'), str2) { // from class: e3.d.d
            {
                a aVar = null;
            }

            @Override // e3.EnumC5359d
            String f(String str3) {
                return EnumC5359d.d(str3);
            }
        };
        UPPER_UNDERSCORE = new EnumC5359d("UPPER_UNDERSCORE", 4, AbstractC5360e.is('_'), str) { // from class: e3.d.e
            {
                a aVar = null;
            }

            @Override // e3.EnumC5359d
            String c(EnumC5359d enumC5359d, String str3) {
                return enumC5359d == EnumC5359d.LOWER_HYPHEN ? AbstractC5358c.toLowerCase(str3.replace('_', '-')) : enumC5359d == EnumC5359d.LOWER_UNDERSCORE ? AbstractC5358c.toLowerCase(str3) : super.c(enumC5359d, str3);
            }

            @Override // e3.EnumC5359d
            String f(String str3) {
                return AbstractC5358c.toUpperCase(str3);
            }
        };
    }

    /* synthetic */ EnumC5359d(String str, int i8, AbstractC5360e abstractC5360e, String str2, a aVar) {
        this(str, i8, abstractC5360e, str2);
    }

    private static /* synthetic */ EnumC5359d[] a() {
        return new EnumC5359d[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return AbstractC5358c.toUpperCase(str.charAt(0)) + AbstractC5358c.toLowerCase(str.substring(1));
    }

    public static EnumC5359d valueOf(String str) {
        return (EnumC5359d) Enum.valueOf(EnumC5359d.class, str);
    }

    public static EnumC5359d[] values() {
        return (EnumC5359d[]) f30338c.clone();
    }

    String c(EnumC5359d enumC5359d, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.f30339a.indexIn(str, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(str.length() + (enumC5359d.f30340b.length() * 4));
                sb.append(enumC5359d.e(str.substring(length, iIndexIn)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(enumC5359d.f(str.substring(length, iIndexIn)));
            }
            sb.append(enumC5359d.f30340b);
            length = this.f30340b.length() + iIndexIn;
        }
        if (length == 0) {
            return enumC5359d.e(str);
        }
        Objects.requireNonNull(sb);
        sb.append(enumC5359d.f(str.substring(length)));
        return sb.toString();
    }

    public AbstractC5367i converterTo(EnumC5359d enumC5359d) {
        return new f(this, enumC5359d);
    }

    String e(String str) {
        return f(str);
    }

    abstract String f(String str);

    public final String to(EnumC5359d enumC5359d, String str) {
        w.checkNotNull(enumC5359d);
        w.checkNotNull(str);
        return enumC5359d == this ? str : c(enumC5359d, str);
    }

    private EnumC5359d(String str, int i8, AbstractC5360e abstractC5360e, String str2) {
        this.f30339a = abstractC5360e;
        this.f30340b = str2;
    }
}
