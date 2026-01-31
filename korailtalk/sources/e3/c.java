package E3;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5269x;
import com.google.protobuf.H0;
import com.google.protobuf.T;
import e3.C5352B;
import e3.EnumC5359d;
import e3.o;
import e3.s;
import e3.w;
import j3.AbstractC5820b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f969a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f970b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f971c = false;

        public boolean replaceMessageFields() {
            return this.f969a;
        }

        public boolean replacePrimitiveFields() {
            return this.f971c;
        }

        public boolean replaceRepeatedFields() {
            return this.f970b;
        }

        public a setReplaceMessageFields(boolean z8) {
            this.f969a = z8;
            return this;
        }

        public a setReplacePrimitiveFields(boolean z8) {
            this.f971c = z8;
            return this;
        }

        public a setReplaceRepeatedFields(boolean z8) {
            this.f970b = z8;
            return this;
        }
    }

    private static T a(s sVar, Iterable iterable) {
        T.b bVarNewBuilder = T.newBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.isEmpty()) {
                if (sVar.isPresent() && !isValid((C5269x.b) sVar.get(), str)) {
                    throw new IllegalArgumentException(str + " is not a valid path for " + ((C5269x.b) sVar.get()).getFullName());
                }
                bVarNewBuilder.addPaths(str);
            }
        }
        return bVarNewBuilder.build();
    }

    public static T fromFieldNumbers(Class<? extends H0> cls, int... iArr) {
        return fromFieldNumbers(cls, AbstractC5820b.asList(iArr));
    }

    public static T fromJsonString(String str) {
        Iterable<String> iterableSplit = C5352B.on(",").split(str);
        T.b bVarNewBuilder = T.newBuilder();
        for (String str2 : iterableSplit) {
            if (!str2.isEmpty()) {
                bVarNewBuilder.addPaths(EnumC5359d.LOWER_CAMEL.to(EnumC5359d.LOWER_UNDERSCORE, str2));
            }
        }
        return bVarNewBuilder.build();
    }

    public static T fromString(String str) {
        return fromStringList(Arrays.asList(str.split(",")));
    }

    public static T fromStringList(Class<? extends H0> cls, Iterable<String> iterable) {
        return fromStringList(((H0) AbstractC5227l0.getDefaultInstance(cls)).getDescriptorForType(), iterable);
    }

    public static T intersection(T t8, T t9) {
        b bVar = new b(t8);
        b bVar2 = new b();
        Iterator it = t9.getPathsList().iterator();
        while (it.hasNext()) {
            bVar.c((String) it.next(), bVar2);
        }
        return bVar2.j();
    }

    public static boolean isValid(Class<? extends H0> cls, T t8) {
        return isValid(((H0) AbstractC5227l0.getDefaultInstance(cls)).getDescriptorForType(), t8);
    }

    public static void merge(T t8, H0 h02, H0.a aVar, a aVar2) {
        new b(t8).e(h02, aVar, aVar2);
    }

    public static T normalize(T t8) {
        return new b(t8).j();
    }

    public static T subtract(T t8, T t9, T... tArr) {
        b bVarI = new b(t8).i(t9);
        for (T t10 : tArr) {
            bVarI.i(t10);
        }
        return bVarI.j();
    }

    public static String toJsonString(T t8) {
        ArrayList arrayList = new ArrayList(t8.getPathsCount());
        for (String str : t8.getPathsList()) {
            if (!str.isEmpty()) {
                arrayList.add(EnumC5359d.LOWER_UNDERSCORE.to(EnumC5359d.LOWER_CAMEL, str));
            }
        }
        return o.on(",").join(arrayList);
    }

    public static String toString(T t8) {
        StringBuilder sb = new StringBuilder();
        boolean z8 = true;
        for (String str : t8.getPathsList()) {
            if (!str.isEmpty()) {
                if (z8) {
                    z8 = false;
                } else {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static <P extends H0> P trim(T t8, P p8) {
        H0.a aVarNewBuilderForType = p8.newBuilderForType();
        merge(t8, p8, aVarNewBuilderForType);
        return (P) aVarNewBuilderForType.build();
    }

    public static T union(T t8, T t9, T... tArr) {
        b bVarF = new b(t8).f(t9);
        for (T t10 : tArr) {
            bVarF.f(t10);
        }
        return bVarF.j();
    }

    public static T fromFieldNumbers(Class<? extends H0> cls, Iterable<Integer> iterable) {
        C5269x.b descriptorForType = ((H0) AbstractC5227l0.getDefaultInstance(cls)).getDescriptorForType();
        T.b bVarNewBuilder = T.newBuilder();
        for (Integer num : iterable) {
            C5269x.g gVarFindFieldByNumber = descriptorForType.findFieldByNumber(num.intValue());
            w.checkArgument(gVarFindFieldByNumber != null, String.format("%s is not a valid field number for %s.", num, cls));
            bVarNewBuilder.addPaths(gVarFindFieldByNumber.getName());
        }
        return bVarNewBuilder.build();
    }

    public static T fromString(Class<? extends H0> cls, String str) {
        return fromStringList(cls, Arrays.asList(str.split(",")));
    }

    public static T fromStringList(C5269x.b bVar, Iterable<String> iterable) {
        return a(s.of(bVar), iterable);
    }

    public static void merge(T t8, H0 h02, H0.a aVar) {
        merge(t8, h02, aVar, new a());
    }

    public static T fromStringList(Iterable<String> iterable) {
        return a(s.absent(), iterable);
    }

    public static boolean isValid(C5269x.b bVar, T t8) {
        Iterator it = t8.getPathsList().iterator();
        while (it.hasNext()) {
            if (!isValid(bVar, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(Class<? extends H0> cls, String str) {
        return isValid(((H0) AbstractC5227l0.getDefaultInstance(cls)).getDescriptorForType(), str);
    }

    public static boolean isValid(C5269x.b bVar, String str) {
        C5269x.g gVarFindFieldByName;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (bVar == null || (gVarFindFieldByName = bVar.findFieldByName(str2)) == null) {
                return false;
            }
            bVar = (gVarFindFieldByName.isRepeated() || gVarFindFieldByName.getJavaType() != C5269x.g.b.MESSAGE) ? null : gVarFindFieldByName.getMessageType();
        }
        return true;
    }
}
