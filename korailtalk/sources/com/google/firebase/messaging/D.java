package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25739a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25740b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25741c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f25743e;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f25742d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f25744f = false;

    private D(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f25739a = sharedPreferences;
        this.f25740b = str;
        this.f25741c = str2;
        this.f25743e = executor;
    }

    private final boolean b(boolean z8) {
        if (z8 && !this.f25744f) {
            f();
        }
        return z8;
    }

    static D c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        D d9 = new D(sharedPreferences, str, str2, executor);
        d9.d();
        return d9;
    }

    private final void d() {
        synchronized (this.f25742d) {
            try {
                this.f25742d.clear();
                String string = this.f25739a.getString(this.f25740b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f25741c)) {
                    String[] strArrSplit = string.split(this.f25741c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e(AbstractC5186c.TAG, "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f25742d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a() {
        synchronized (this.f25742d) {
            this.f25739a.edit().putString(this.f25740b, serialize()).commit();
        }
    }

    private final void f() {
        this.f25743e.execute(new Runnable(this) { // from class: com.google.firebase.messaging.C

            /* renamed from: a, reason: collision with root package name */
            private final D f25738a;

            {
                this.f25738a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f25738a.a();
            }
        });
    }

    public final boolean add(String str) {
        boolean zB;
        if (TextUtils.isEmpty(str) || str.contains(this.f25741c)) {
            return false;
        }
        synchronized (this.f25742d) {
            zB = b(this.f25742d.add(str));
        }
        return zB;
    }

    public final String peek() {
        String str;
        synchronized (this.f25742d) {
            str = (String) this.f25742d.peek();
        }
        return str;
    }

    public final boolean remove(Object obj) {
        boolean zB;
        synchronized (this.f25742d) {
            zB = b(this.f25742d.remove(obj));
        }
        return zB;
    }

    public final String serialize() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f25742d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f25741c);
        }
        return sb.toString();
    }
}
