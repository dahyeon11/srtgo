package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b2.InterfaceC1073b;
import c2.C1089a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.kakao.sdk.user.Constants;
import g2.C5539a;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC5814a implements C5539a.d.InterfaceC0302a, C5539a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;

    /* renamed from: l, reason: collision with root package name */
    private static Comparator f11808l;

    @VisibleForTesting
    public static final Scope zaa = new Scope(Constants.PROFILE);

    @VisibleForTesting
    public static final Scope zab = new Scope("email");

    @VisibleForTesting
    public static final Scope zac = new Scope("openid");

    @VisibleForTesting
    public static final Scope zad;

    @VisibleForTesting
    public static final Scope zae;

    /* renamed from: a, reason: collision with root package name */
    final int f11809a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f11810b;

    /* renamed from: c, reason: collision with root package name */
    private Account f11811c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11812d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11813e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11814f;

    /* renamed from: g, reason: collision with root package name */
    private String f11815g;

    /* renamed from: h, reason: collision with root package name */
    private String f11816h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f11817i;

    /* renamed from: j, reason: collision with root package name */
    private String f11818j;

    /* renamed from: k, reason: collision with root package name */
    private Map f11819k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set f11820a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f11821b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f11822c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11823d;

        /* renamed from: e, reason: collision with root package name */
        private String f11824e;

        /* renamed from: f, reason: collision with root package name */
        private Account f11825f;

        /* renamed from: g, reason: collision with root package name */
        private String f11826g;

        /* renamed from: h, reason: collision with root package name */
        private Map f11827h;

        /* renamed from: i, reason: collision with root package name */
        private String f11828i;

        public a() {
            this.f11820a = new HashSet();
            this.f11827h = new HashMap();
        }

        private final String a(String str) {
            AbstractC5683p.checkNotEmpty(str);
            String str2 = this.f11824e;
            boolean z8 = true;
            if (str2 != null && !str2.equals(str)) {
                z8 = false;
            }
            AbstractC5683p.checkArgument(z8, "two different server client ids provided");
            return str;
        }

        public a addExtension(InterfaceC1073b interfaceC1073b) {
            if (this.f11827h.containsKey(Integer.valueOf(interfaceC1073b.a()))) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List listB = interfaceC1073b.b();
            if (listB != null) {
                this.f11820a.addAll(listB);
            }
            this.f11827h.put(Integer.valueOf(interfaceC1073b.a()), new C1089a(interfaceC1073b));
            return this;
        }

        public GoogleSignInOptions build() {
            if (this.f11820a.contains(GoogleSignInOptions.zae)) {
                Set set = this.f11820a;
                Scope scope = GoogleSignInOptions.zad;
                if (set.contains(scope)) {
                    this.f11820a.remove(scope);
                }
            }
            if (this.f11823d && (this.f11825f == null || !this.f11820a.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(new ArrayList(this.f11820a), this.f11825f, this.f11823d, this.f11821b, this.f11822c, this.f11824e, this.f11826g, this.f11827h, this.f11828i);
        }

        public a requestEmail() {
            this.f11820a.add(GoogleSignInOptions.zab);
            return this;
        }

        public a requestId() {
            this.f11820a.add(GoogleSignInOptions.zac);
            return this;
        }

        public a requestIdToken(String str) {
            this.f11823d = true;
            a(str);
            this.f11824e = str;
            return this;
        }

        public a requestProfile() {
            this.f11820a.add(GoogleSignInOptions.zaa);
            return this;
        }

        public a requestScopes(Scope scope, Scope... scopeArr) {
            this.f11820a.add(scope);
            this.f11820a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a requestServerAuthCode(String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        public a setAccountName(String str) {
            this.f11825f = new Account(AbstractC5683p.checkNotEmpty(str), "com.google");
            return this;
        }

        public a setHostedDomain(String str) {
            this.f11826g = AbstractC5683p.checkNotEmpty(str);
            return this;
        }

        public a setLogSessionId(String str) {
            this.f11828i = str;
            return this;
        }

        public a requestServerAuthCode(String str, boolean z8) {
            this.f11821b = true;
            a(str);
            this.f11824e = str;
            this.f11822c = z8;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f11820a = new HashSet();
            this.f11827h = new HashMap();
            AbstractC5683p.checkNotNull(googleSignInOptions);
            this.f11820a = new HashSet(googleSignInOptions.f11810b);
            this.f11821b = googleSignInOptions.f11813e;
            this.f11822c = googleSignInOptions.f11814f;
            this.f11823d = googleSignInOptions.f11812d;
            this.f11824e = googleSignInOptions.f11815g;
            this.f11825f = googleSignInOptions.f11811c;
            this.f11826g = googleSignInOptions.f11816h;
            this.f11827h = GoogleSignInOptions.l(googleSignInOptions.f11817i);
            this.f11828i = googleSignInOptions.f11818j;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        zad = scope;
        zae = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.requestId();
        aVar.requestProfile();
        DEFAULT_SIGN_IN = aVar.build();
        a aVar2 = new a();
        aVar2.requestScopes(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = aVar2.build();
        CREATOR = new e();
        f11808l = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map l(List list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1089a c1089a = (C1089a) it.next();
            map.put(Integer.valueOf(c1089a.getType()), c1089a);
        }
        return map;
    }

    public static GoogleSignInOptions zab(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.SCOPES);
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f11817i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList r1 = r4.f11817i     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f11810b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f11810b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f11811c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f11815g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f11815g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f11814f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isForceCodeForRefreshToken()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f11812d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isIdTokenRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f11813e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.isServerAuthCodeRequested()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f11818j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.getLogSessionId()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public Account getAccount() {
        return this.f11811c;
    }

    public ArrayList<C1089a> getExtensions() {
        return this.f11817i;
    }

    public String getLogSessionId() {
        return this.f11818j;
    }

    public Scope[] getScopeArray() {
        ArrayList arrayList = this.f11810b;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.f11810b);
    }

    public String getServerClientId() {
        return this.f11815g;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11810b;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((Scope) arrayList2.get(i8)).getScopeUri());
        }
        Collections.sort(arrayList);
        c2.b bVar = new c2.b();
        bVar.addObject(arrayList);
        bVar.addObject(this.f11811c);
        bVar.addObject(this.f11815g);
        bVar.zaa(this.f11814f);
        bVar.zaa(this.f11812d);
        bVar.zaa(this.f11813e);
        bVar.addObject(this.f11818j);
        return bVar.hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.f11814f;
    }

    public boolean isIdTokenRequested() {
        return this.f11812d;
    }

    public boolean isServerAuthCodeRequested() {
        return this.f11813e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f11809a);
        AbstractC5816c.writeTypedList(parcel, 2, getScopes(), false);
        AbstractC5816c.writeParcelable(parcel, 3, getAccount(), i8, false);
        AbstractC5816c.writeBoolean(parcel, 4, isIdTokenRequested());
        AbstractC5816c.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        AbstractC5816c.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        AbstractC5816c.writeString(parcel, 7, getServerClientId(), false);
        AbstractC5816c.writeString(parcel, 8, this.f11816h, false);
        AbstractC5816c.writeTypedList(parcel, 9, getExtensions(), false);
        AbstractC5816c.writeString(parcel, 10, getLogSessionId(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zaf() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f11810b, f11808l);
            Iterator it = this.f11810b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put(Constants.SCOPES, jSONArray);
            Account account = this.f11811c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f11812d);
            jSONObject.put("forceCodeForRefreshToken", this.f11814f);
            jSONObject.put("serverAuthRequested", this.f11813e);
            if (!TextUtils.isEmpty(this.f11815g)) {
                jSONObject.put("serverClientId", this.f11815g);
            }
            if (!TextUtils.isEmpty(this.f11816h)) {
                jSONObject.put("hostedDomain", this.f11816h);
            }
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, ArrayList arrayList2, String str3) {
        this(i8, arrayList, account, z8, z9, z10, str, str2, l(arrayList2), str3);
    }

    private GoogleSignInOptions(int i8, ArrayList arrayList, Account account, boolean z8, boolean z9, boolean z10, String str, String str2, Map map, String str3) {
        this.f11809a = i8;
        this.f11810b = arrayList;
        this.f11811c = account;
        this.f11812d = z8;
        this.f11813e = z9;
        this.f11814f = z10;
        this.f11815g = str;
        this.f11816h = str2;
        this.f11817i = new ArrayList(map.values());
        this.f11819k = map;
        this.f11818j = str3;
    }
}
