package com.google.gson;

import Q7.C;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class c implements com.google.gson.d {
    public static final c IDENTITY;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;
    public static final c UPPER_CASE_WITH_UNDERSCORES;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ c[] f25887a;

    enum a extends c {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.b(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.b(c.a(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.a(field.getName(), C.PACKAGE_SEPARATOR_CHAR).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar6;
        f25887a = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    private c(String str, int i8) {
    }

    static String a(String str, char c9) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c9);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String b(String str) {
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i8 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i8) + upperCase + str.substring(i8 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f25887a.clone();
    }

    @Override // com.google.gson.d
    public abstract /* synthetic */ String translateName(Field field);

    /* synthetic */ c(String str, int i8, a aVar) {
        this(str, i8);
    }
}
