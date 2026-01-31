package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f8675a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f8676b;

    /* renamed from: c, reason: collision with root package name */
    String f8677c;

    /* renamed from: d, reason: collision with root package name */
    String f8678d;

    /* renamed from: e, reason: collision with root package name */
    boolean f8679e;

    /* renamed from: f, reason: collision with root package name */
    boolean f8680f;

    static class a {
        static B a(PersistableBundle persistableBundle) {
            return new c().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString("key")).setBot(persistableBundle.getBoolean("isBot")).setImportant(persistableBundle.getBoolean("isImportant")).build();
        }

        static PersistableBundle b(B b9) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = b9.f8675a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", b9.f8677c);
            persistableBundle.putString("key", b9.f8678d);
            persistableBundle.putBoolean("isBot", b9.f8679e);
            persistableBundle.putBoolean("isImportant", b9.f8680f);
            return persistableBundle;
        }
    }

    static class b {
        static B a(Person person) {
            return new c().setName(person.getName()).setIcon(person.getIcon() != null ? IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        static Person b(B b9) {
            return new Person.Builder().setName(b9.getName()).setIcon(b9.getIcon() != null ? b9.getIcon().toIcon() : null).setUri(b9.getUri()).setKey(b9.getKey()).setBot(b9.isBot()).setImportant(b9.isImportant()).build();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        CharSequence f8681a;

        /* renamed from: b, reason: collision with root package name */
        IconCompat f8682b;

        /* renamed from: c, reason: collision with root package name */
        String f8683c;

        /* renamed from: d, reason: collision with root package name */
        String f8684d;

        /* renamed from: e, reason: collision with root package name */
        boolean f8685e;

        /* renamed from: f, reason: collision with root package name */
        boolean f8686f;

        public c() {
        }

        public B build() {
            return new B(this);
        }

        public c setBot(boolean z8) {
            this.f8685e = z8;
            return this;
        }

        public c setIcon(IconCompat iconCompat) {
            this.f8682b = iconCompat;
            return this;
        }

        public c setImportant(boolean z8) {
            this.f8686f = z8;
            return this;
        }

        public c setKey(String str) {
            this.f8684d = str;
            return this;
        }

        public c setName(CharSequence charSequence) {
            this.f8681a = charSequence;
            return this;
        }

        public c setUri(String str) {
            this.f8683c = str;
            return this;
        }

        c(B b9) {
            this.f8681a = b9.f8675a;
            this.f8682b = b9.f8676b;
            this.f8683c = b9.f8677c;
            this.f8684d = b9.f8678d;
            this.f8685e = b9.f8679e;
            this.f8686f = b9.f8680f;
        }
    }

    B(c cVar) {
        this.f8675a = cVar.f8681a;
        this.f8676b = cVar.f8682b;
        this.f8677c = cVar.f8683c;
        this.f8678d = cVar.f8684d;
        this.f8679e = cVar.f8685e;
        this.f8680f = cVar.f8686f;
    }

    public static B fromAndroidPerson(Person person) {
        return b.a(person);
    }

    public static B fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new c().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString("uri")).setKey(bundle.getString("key")).setBot(bundle.getBoolean("isBot")).setImportant(bundle.getBoolean("isImportant")).build();
    }

    public static B fromPersistableBundle(PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b9 = (B) obj;
        String key = getKey();
        String key2 = b9.getKey();
        return (key == null && key2 == null) ? Objects.equals(Objects.toString(getName()), Objects.toString(b9.getName())) && Objects.equals(getUri(), b9.getUri()) && Boolean.valueOf(isBot()).equals(Boolean.valueOf(b9.isBot())) && Boolean.valueOf(isImportant()).equals(Boolean.valueOf(b9.isImportant())) : Objects.equals(key, key2);
    }

    public IconCompat getIcon() {
        return this.f8676b;
    }

    public String getKey() {
        return this.f8678d;
    }

    public CharSequence getName() {
        return this.f8675a;
    }

    public String getUri() {
        return this.f8677c;
    }

    public int hashCode() {
        String key = getKey();
        return key != null ? key.hashCode() : Objects.hash(getName(), getUri(), Boolean.valueOf(isBot()), Boolean.valueOf(isImportant()));
    }

    public boolean isBot() {
        return this.f8679e;
    }

    public boolean isImportant() {
        return this.f8680f;
    }

    public String resolveToLegacyUri() {
        String str = this.f8677c;
        if (str != null) {
            return str;
        }
        if (this.f8675a == null) {
            return "";
        }
        return "name:" + ((Object) this.f8675a);
    }

    public Person toAndroidPerson() {
        return b.b(this);
    }

    public c toBuilder() {
        return new c(this);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f8675a);
        IconCompat iconCompat = this.f8676b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.f8677c);
        bundle.putString("key", this.f8678d);
        bundle.putBoolean("isBot", this.f8679e);
        bundle.putBoolean("isImportant", this.f8680f);
        return bundle;
    }

    public PersistableBundle toPersistableBundle() {
        return a.b(this);
    }
}
