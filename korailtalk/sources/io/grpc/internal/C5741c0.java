package io.grpc.internal;

import io.grpc.internal.E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* renamed from: io.grpc.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5741c0 implements E.g {

    /* renamed from: a, reason: collision with root package name */
    private static final Throwable f32684a = b();

    /* renamed from: io.grpc.internal.c0$a */
    static final class a implements c {
        a() {
        }

        private static void a() {
            if (C5741c0.f32684a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", C5741c0.f32684a);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        private static void b(NamingEnumeration namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: javax.naming.NamingException */
        private static void c(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
                throw namingException;
            } catch (NamingException unused) {
                throw namingException;
            }
        }

        @Override // io.grpc.internal.C5741c0.c
        public List<String> getAllRecords(String str, String str2) throws NamingException {
            a();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e8) {
                                b(all2, e8);
                            }
                        }
                        all2.close();
                    } catch (NamingException e9) {
                        b(all, e9);
                    }
                }
                all.close();
            } catch (NamingException e10) {
                c(initialDirContext, e10);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* renamed from: io.grpc.internal.c0$b */
    static final class b implements E.f {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f32685b = Logger.getLogger(b.class.getName());

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f32686c = Pattern.compile("\\s+");

        /* renamed from: a, reason: collision with root package name */
        private final c f32687a;

        public b(c cVar) {
            this.f32687a = cVar;
        }

        static String a(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i8 = 0;
            boolean z8 = false;
            while (i8 < str.length()) {
                char cCharAt = str.charAt(i8);
                if (z8) {
                    if (cCharAt == '\"') {
                        z8 = false;
                    } else {
                        if (cCharAt == '\\') {
                            i8++;
                            cCharAt = str.charAt(i8);
                        }
                        sb.append(cCharAt);
                    }
                } else if (cCharAt != ' ') {
                    if (cCharAt == '\"') {
                        z8 = true;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                i8++;
            }
            return sb.toString();
        }

        @Override // io.grpc.internal.E.f
        public List<E.h> resolveSrv(String str) {
            String[] strArrSplit;
            Logger logger = f32685b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query SRV records for {0}", new Object[]{str});
            }
            List<String> allRecords = this.f32687a.getAllRecords("SRV", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} SRV records", new Object[]{Integer.valueOf(allRecords.size())});
            }
            ArrayList arrayList = new ArrayList(allRecords.size());
            Level level2 = Level.WARNING;
            RuntimeException runtimeException = null;
            for (String str2 : allRecords) {
                try {
                    strArrSplit = f32686c.split(str2, 5);
                    e3.H.verify(strArrSplit.length == 4, "Bad SRV Record: %s", str2);
                } catch (RuntimeException e8) {
                    f32685b.log(level2, "Failed to construct SRV record " + str2, (Throwable) e8);
                    if (runtimeException == null) {
                        level2 = Level.FINE;
                        runtimeException = e8;
                    }
                }
                if (!strArrSplit[3].endsWith(".")) {
                    throw new RuntimeException("Returned SRV host does not end in period: " + strArrSplit[3]);
                }
                arrayList.add(new E.h(strArrSplit[3], Integer.parseInt(strArrSplit[2])));
            }
            if (!arrayList.isEmpty() || runtimeException == null) {
                return Collections.unmodifiableList(arrayList);
            }
            throw runtimeException;
        }

        @Override // io.grpc.internal.E.f
        public List<String> resolveTxt(String str) {
            Logger logger = f32685b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> allRecords = this.f32687a.getAllRecords("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(allRecords.size())});
            }
            ArrayList arrayList = new ArrayList(allRecords.size());
            Iterator<String> it = allRecords.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* renamed from: io.grpc.internal.c0$c */
    interface c {
        List<String> getAllRecords(String str, String str2);
    }

    private static Throwable b() throws ClassNotFoundException {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException | Error | RuntimeException e8) {
            return e8;
        }
    }

    @Override // io.grpc.internal.E.g
    public E.f newResourceResolver() {
        if (unavailabilityCause() != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.E.g
    public Throwable unavailabilityCause() {
        return f32684a;
    }
}
