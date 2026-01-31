package i2;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import g2.AbstractC5544f;
import g2.C5539a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: i2.d */
/* loaded from: classes.dex */
public final class C5671d {

    /* renamed from: a */
    private final Account f31760a;

    /* renamed from: b */
    private final Set f31761b;

    /* renamed from: c */
    private final Set f31762c;

    /* renamed from: d */
    private final Map f31763d;

    /* renamed from: e */
    private final int f31764e;

    /* renamed from: f */
    private final View f31765f;

    /* renamed from: g */
    private final String f31766g;

    /* renamed from: h */
    private final String f31767h;

    /* renamed from: i */
    private final F2.a f31768i;

    /* renamed from: j */
    private Integer f31769j;

    /* renamed from: i2.d$a */
    public static final class a {

        /* renamed from: a */
        private Account f31770a;

        /* renamed from: b */
        private O.b f31771b;

        /* renamed from: c */
        private String f31772c;

        /* renamed from: d */
        private String f31773d;

        /* renamed from: e */
        private F2.a f31774e = F2.a.zaa;

        public C5671d build() {
            return new C5671d(this.f31770a, this.f31771b, null, 0, null, this.f31772c, this.f31773d, this.f31774e, false);
        }

        public a setRealClientPackageName(String str) {
            this.f31772c = str;
            return this;
        }

        public final a zaa(Collection<Scope> collection) {
            if (this.f31771b == null) {
                this.f31771b = new O.b();
            }
            this.f31771b.addAll(collection);
            return this;
        }

        public final a zab(Account account) {
            this.f31770a = account;
            return this;
        }

        public final a zac(String str) {
            this.f31773d = str;
            return this;
        }
    }

    public C5671d(Account account, Set<Scope> set, Map<C5539a, C5642A> map, int i8, View view, String str, String str2, F2.a aVar) {
        this(account, set, map, i8, view, str, str2, aVar, false);
    }

    public static C5671d createDefault(Context context) {
        return new AbstractC5544f.a(context).zaa();
    }

    public Account getAccount() {
        return this.f31760a;
    }

    @Deprecated
    public String getAccountName() {
        Account account = this.f31760a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account getAccountOrDefault() {
        Account account = this.f31760a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> getAllRequestedScopes() {
        return this.f31762c;
    }

    public Set<Scope> getApplicableScopes(C5539a c5539a) {
        C5642A c5642a = (C5642A) this.f31763d.get(c5539a);
        if (c5642a == null || c5642a.zaa.isEmpty()) {
            return this.f31761b;
        }
        HashSet hashSet = new HashSet(this.f31761b);
        hashSet.addAll(c5642a.zaa);
        return hashSet;
    }

    public int getGravityForPopups() {
        return this.f31764e;
    }

    public String getRealClientPackageName() {
        return this.f31766g;
    }

    public Set<Scope> getRequiredScopes() {
        return this.f31761b;
    }

    public View getViewForPopups() {
        return this.f31765f;
    }

    public final F2.a zaa() {
        return this.f31768i;
    }

    public final Integer zab() {
        return this.f31769j;
    }

    public final String zac() {
        return this.f31767h;
    }

    public final Map<C5539a, C5642A> zad() {
        return this.f31763d;
    }

    public final void zae(Integer num) {
        this.f31769j = num;
    }

    public C5671d(Account account, Set<Scope> set, Map<C5539a, C5642A> map, int i8, View view, String str, String str2, F2.a aVar, boolean z8) {
        this.f31760a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f31761b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f31763d = map;
        this.f31765f = view;
        this.f31764e = i8;
        this.f31766g = str;
        this.f31767h = str2;
        this.f31768i = aVar == null ? F2.a.zaa : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<C5642A> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().zaa);
        }
        this.f31762c = Collections.unmodifiableSet(hashSet);
    }
}
