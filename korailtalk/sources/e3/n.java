package e3;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class n extends AbstractC5366h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f30397a;

    private static final class a extends AbstractC5365g {

        /* renamed from: a, reason: collision with root package name */
        final Matcher f30398a;

        a(Matcher matcher) {
            this.f30398a = (Matcher) w.checkNotNull(matcher);
        }

        @Override // e3.AbstractC5365g
        public int end() {
            return this.f30398a.end();
        }

        @Override // e3.AbstractC5365g
        public boolean find() {
            return this.f30398a.find();
        }

        @Override // e3.AbstractC5365g
        public boolean matches() {
            return this.f30398a.matches();
        }

        @Override // e3.AbstractC5365g
        public String replaceAll(String str) {
            return this.f30398a.replaceAll(str);
        }

        @Override // e3.AbstractC5365g
        public int start() {
            return this.f30398a.start();
        }

        @Override // e3.AbstractC5365g
        public boolean find(int i8) {
            return this.f30398a.find(i8);
        }
    }

    n(Pattern pattern) {
        this.f30397a = (Pattern) w.checkNotNull(pattern);
    }

    @Override // e3.AbstractC5366h
    public int flags() {
        return this.f30397a.flags();
    }

    @Override // e3.AbstractC5366h
    public AbstractC5365g matcher(CharSequence charSequence) {
        return new a(this.f30397a.matcher(charSequence));
    }

    @Override // e3.AbstractC5366h
    public String pattern() {
        return this.f30397a.pattern();
    }

    @Override // e3.AbstractC5366h
    public String toString() {
        return this.f30397a.toString();
    }
}
