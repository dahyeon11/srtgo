package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import i2.AbstractC5681n;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class E {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f25745d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f25746a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25747b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25748c;

    private E(String str, String str2) {
        this.f25746a = b(str2, str);
        this.f25747b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f25748c = sb.toString();
    }

    static E a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new E(strArrSplit[0], strArrSplit[1]);
    }

    private static String b(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w(AbstractC5186c.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f25745d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static E subscribe(String str) {
        return new E("S", str);
    }

    public static E unsubscribe(String str) {
        return new E("U", str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e8 = (E) obj;
        return this.f25746a.equals(e8.f25746a) && this.f25747b.equals(e8.f25747b);
    }

    public final String getOperation() {
        return this.f25747b;
    }

    public final String getTopic() {
        return this.f25746a;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(this.f25747b, this.f25746a);
    }

    public final String serialize() {
        return this.f25748c;
    }
}
