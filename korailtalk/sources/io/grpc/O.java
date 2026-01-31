package io.grpc;

import com.kakao.sdk.template.Constants;
import java.net.SocketAddress;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f32015f = Logger.getLogger(O.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final O f32016g = new O();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentNavigableMap f32017a = new ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentNavigableMap f32018b = new ConcurrentSkipListMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f32019c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f32020d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentMap f32021e = new ConcurrentHashMap();

    public static final class b {
        public final long callsFailed;
        public final long callsStarted;
        public final long callsSucceeded;
        public final c channelTrace;
        public final long lastCallStartedNanos;
        public final List<Y> sockets;
        public final EnumC5802t state;
        public final List<Y> subchannels;
        public final String target;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private String f32022a;

            /* renamed from: b, reason: collision with root package name */
            private EnumC5802t f32023b;

            /* renamed from: c, reason: collision with root package name */
            private c f32024c;

            /* renamed from: d, reason: collision with root package name */
            private long f32025d;

            /* renamed from: e, reason: collision with root package name */
            private long f32026e;

            /* renamed from: f, reason: collision with root package name */
            private long f32027f;

            /* renamed from: g, reason: collision with root package name */
            private long f32028g;

            /* renamed from: h, reason: collision with root package name */
            private List f32029h = Collections.emptyList();

            /* renamed from: i, reason: collision with root package name */
            private List f32030i = Collections.emptyList();

            public b build() {
                return new b(this.f32022a, this.f32023b, this.f32024c, this.f32025d, this.f32026e, this.f32027f, this.f32028g, this.f32029h, this.f32030i);
            }

            public a setCallsFailed(long j8) {
                this.f32027f = j8;
                return this;
            }

            public a setCallsStarted(long j8) {
                this.f32025d = j8;
                return this;
            }

            public a setCallsSucceeded(long j8) {
                this.f32026e = j8;
                return this;
            }

            public a setChannelTrace(c cVar) {
                this.f32024c = cVar;
                return this;
            }

            public a setLastCallStartedNanos(long j8) {
                this.f32028g = j8;
                return this;
            }

            public a setSockets(List<Y> list) {
                e3.w.checkState(this.f32029h.isEmpty());
                this.f32030i = Collections.unmodifiableList((List) e3.w.checkNotNull(list));
                return this;
            }

            public a setState(EnumC5802t enumC5802t) {
                this.f32023b = enumC5802t;
                return this;
            }

            public a setSubchannels(List<Y> list) {
                e3.w.checkState(this.f32030i.isEmpty());
                this.f32029h = Collections.unmodifiableList((List) e3.w.checkNotNull(list));
                return this;
            }

            public a setTarget(String str) {
                this.f32022a = str;
                return this;
            }
        }

        private b(String str, EnumC5802t enumC5802t, c cVar, long j8, long j9, long j10, long j11, List list, List list2) {
            e3.w.checkState(list.isEmpty() || list2.isEmpty(), "channels can have subchannels only, subchannels can have either sockets OR subchannels, neither can have both");
            this.target = str;
            this.state = enumC5802t;
            this.channelTrace = cVar;
            this.callsStarted = j8;
            this.callsSucceeded = j9;
            this.callsFailed = j10;
            this.lastCallStartedNanos = j11;
            this.subchannels = (List) e3.w.checkNotNull(list);
            this.sockets = (List) e3.w.checkNotNull(list2);
        }
    }

    public static final class c {
        public final long creationTimeNanos;
        public final List<b> events;
        public final long numEventsLogged;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Long f32031a;

            /* renamed from: b, reason: collision with root package name */
            private Long f32032b;

            /* renamed from: c, reason: collision with root package name */
            private List f32033c = Collections.emptyList();

            public c build() {
                e3.w.checkNotNull(this.f32031a, "numEventsLogged");
                e3.w.checkNotNull(this.f32032b, "creationTimeNanos");
                return new c(this.f32031a.longValue(), this.f32032b.longValue(), this.f32033c);
            }

            public a setCreationTimeNanos(long j8) {
                this.f32032b = Long.valueOf(j8);
                return this;
            }

            public a setEvents(List<b> list) {
                this.f32033c = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            public a setNumEventsLogged(long j8) {
                this.f32031a = Long.valueOf(j8);
                return this;
            }
        }

        public static final class b {
            public final Y channelRef;
            public final String description;
            public final EnumC0316b severity;
            public final Y subchannelRef;
            public final long timestampNanos;

            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                private String f32034a;

                /* renamed from: b, reason: collision with root package name */
                private EnumC0316b f32035b;

                /* renamed from: c, reason: collision with root package name */
                private Long f32036c;

                /* renamed from: d, reason: collision with root package name */
                private Y f32037d;

                /* renamed from: e, reason: collision with root package name */
                private Y f32038e;

                public b build() {
                    e3.w.checkNotNull(this.f32034a, Constants.DESCRIPTION);
                    e3.w.checkNotNull(this.f32035b, "severity");
                    e3.w.checkNotNull(this.f32036c, "timestampNanos");
                    e3.w.checkState(this.f32037d == null || this.f32038e == null, "at least one of channelRef and subchannelRef must be null");
                    return new b(this.f32034a, this.f32035b, this.f32036c.longValue(), this.f32037d, this.f32038e);
                }

                public a setChannelRef(Y y8) {
                    this.f32037d = y8;
                    return this;
                }

                public a setDescription(String str) {
                    this.f32034a = str;
                    return this;
                }

                public a setSeverity(EnumC0316b enumC0316b) {
                    this.f32035b = enumC0316b;
                    return this;
                }

                public a setSubchannelRef(Y y8) {
                    this.f32038e = y8;
                    return this;
                }

                public a setTimestampNanos(long j8) {
                    this.f32036c = Long.valueOf(j8);
                    return this;
                }
            }

            /* renamed from: io.grpc.O$c$b$b, reason: collision with other inner class name */
            public enum EnumC0316b {
                CT_UNKNOWN,
                CT_INFO,
                CT_WARNING,
                CT_ERROR
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return e3.r.equal(this.description, bVar.description) && e3.r.equal(this.severity, bVar.severity) && this.timestampNanos == bVar.timestampNanos && e3.r.equal(this.channelRef, bVar.channelRef) && e3.r.equal(this.subchannelRef, bVar.subchannelRef);
            }

            public int hashCode() {
                return e3.r.hashCode(this.description, this.severity, Long.valueOf(this.timestampNanos), this.channelRef, this.subchannelRef);
            }

            public String toString() {
                return e3.p.toStringHelper(this).add(Constants.DESCRIPTION, this.description).add("severity", this.severity).add("timestampNanos", this.timestampNanos).add("channelRef", this.channelRef).add("subchannelRef", this.subchannelRef).toString();
            }

            private b(String str, EnumC0316b enumC0316b, long j8, Y y8, Y y9) {
                this.description = str;
                this.severity = (EnumC0316b) e3.w.checkNotNull(enumC0316b, "severity");
                this.timestampNanos = j8;
                this.channelRef = y8;
                this.subchannelRef = y9;
            }
        }

        private c(long j8, long j9, List list) {
            this.numEventsLogged = j8;
            this.creationTimeNanos = j9;
            this.events = list;
        }
    }

    public static final class d {
        public final Object any;
        public final String name;

        public d(String str, Object obj) {
            this.name = (String) e3.w.checkNotNull(str);
            e3.w.checkState(obj == null || obj.getClass().getName().endsWith("com.google.protobuf.Any"), "the 'any' object must be of type com.google.protobuf.Any");
            this.any = obj;
        }
    }

    public static final class e {
        public final List<T> channels;
        public final boolean end;

        public e(List<T> list, boolean z8) {
            this.channels = (List) e3.w.checkNotNull(list);
            this.end = z8;
        }
    }

    public static final class g {
        public final boolean end;
        public final List<T> servers;

        public g(List<T> list, boolean z8) {
            this.servers = (List) e3.w.checkNotNull(list);
            this.end = z8;
        }
    }

    private static final class h extends ConcurrentSkipListMap {
        private h() {
        }
    }

    public static final class i {
        public final boolean end;
        public final List<Y> sockets;

        public i(List<Y> list, boolean z8) {
            this.sockets = list;
            this.end = z8;
        }
    }

    public static final class j {
        public final Integer lingerSeconds;
        public final Map<String, String> others;
        public final Integer soTimeoutMillis;
        public final l tcpInfo;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Map f32040a = new HashMap();

            /* renamed from: b, reason: collision with root package name */
            private Integer f32041b;

            /* renamed from: c, reason: collision with root package name */
            private Integer f32042c;

            public a addOption(String str, String str2) {
                this.f32040a.put(str, (String) e3.w.checkNotNull(str2));
                return this;
            }

            public j build() {
                return new j(this.f32041b, this.f32042c, null, this.f32040a);
            }

            public a setSocketOptionLingerSeconds(Integer num) {
                this.f32042c = num;
                return this;
            }

            public a setSocketOptionTimeoutMillis(Integer num) {
                this.f32041b = num;
                return this;
            }

            public a setTcpInfo(l lVar) {
                return this;
            }

            public a addOption(String str, int i8) {
                this.f32040a.put(str, Integer.toString(i8));
                return this;
            }

            public a addOption(String str, boolean z8) {
                this.f32040a.put(str, Boolean.toString(z8));
                return this;
            }
        }

        public j(Integer num, Integer num2, l lVar, Map<String, String> map) {
            e3.w.checkNotNull(map);
            this.soTimeoutMillis = num;
            this.lingerSeconds = num2;
            this.others = Collections.unmodifiableMap(new HashMap(map));
        }
    }

    public static final class k {
        public final n data;
        public final SocketAddress local;
        public final SocketAddress remote;
        public final f security;
        public final j socketOptions;

        public k(n nVar, SocketAddress socketAddress, SocketAddress socketAddress2, j jVar, f fVar) {
            this.data = nVar;
            this.local = (SocketAddress) e3.w.checkNotNull(socketAddress, "local socket");
            this.remote = socketAddress2;
            this.socketOptions = (j) e3.w.checkNotNull(jVar);
            this.security = fVar;
        }
    }

    public static final class l {
    }

    public static final class n {
        public final long keepAlivesSent;
        public final long lastLocalStreamCreatedTimeNanos;
        public final long lastMessageReceivedTimeNanos;
        public final long lastMessageSentTimeNanos;
        public final long lastRemoteStreamCreatedTimeNanos;
        public final long localFlowControlWindow;
        public final long messagesReceived;
        public final long messagesSent;
        public final long remoteFlowControlWindow;
        public final long streamsFailed;
        public final long streamsStarted;
        public final long streamsSucceeded;

        public n(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
            this.streamsStarted = j8;
            this.lastLocalStreamCreatedTimeNanos = j9;
            this.lastRemoteStreamCreatedTimeNanos = j10;
            this.streamsSucceeded = j11;
            this.streamsFailed = j12;
            this.messagesSent = j13;
            this.messagesReceived = j14;
            this.keepAlivesSent = j15;
            this.lastMessageSentTimeNanos = j16;
            this.lastMessageReceivedTimeNanos = j17;
            this.localFlowControlWindow = j18;
            this.remoteFlowControlWindow = j19;
        }
    }

    private static void b(Map map, T t8) {
    }

    private static boolean c(Map map, U u8) {
        return map.containsKey(Long.valueOf(u8.getId()));
    }

    private T d(long j8) {
        Iterator it = this.f32021e.values().iterator();
        while (it.hasNext()) {
            T t8 = (T) ((h) it.next()).get(Long.valueOf(j8));
            if (t8 != null) {
                return t8;
            }
        }
        return null;
    }

    private static void e(Map map, T t8) {
    }

    public static long id(Y y8) {
        return y8.getLogId().getId();
    }

    public static O instance() {
        return f32016g;
    }

    public void addClientSocket(T t8) {
        b(this.f32020d, t8);
    }

    public void addListenSocket(T t8) {
        b(this.f32020d, t8);
    }

    public void addRootChannel(T t8) {
        b(this.f32018b, t8);
    }

    public void addServer(T t8) {
        b(this.f32017a, t8);
    }

    public void addServerSocket(T t8, T t9) {
        b((h) this.f32021e.get(Long.valueOf(id(t8))), t9);
    }

    public void addSubchannel(T t8) {
        b(this.f32019c, t8);
    }

    public boolean containsClientSocket(U u8) {
        return c(this.f32020d, u8);
    }

    public boolean containsServer(U u8) {
        return c(this.f32017a, u8);
    }

    public boolean containsSubchannel(U u8) {
        return c(this.f32019c, u8);
    }

    public T getChannel(long j8) {
        return (T) this.f32018b.get(Long.valueOf(j8));
    }

    public T getRootChannel(long j8) {
        return (T) this.f32018b.get(Long.valueOf(j8));
    }

    public e getRootChannels(long j8, int i8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32018b.tailMap((ConcurrentNavigableMap) Long.valueOf(j8)).values().iterator();
        while (it.hasNext() && arrayList.size() < i8) {
            arrayList.add((T) it.next());
        }
        return new e(arrayList, !it.hasNext());
    }

    public T getServer(long j8) {
        return (T) this.f32017a.get(Long.valueOf(j8));
    }

    public i getServerSockets(long j8, long j9, int i8) {
        h hVar = (h) this.f32021e.get(Long.valueOf(j8));
        if (hVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i8);
        Iterator it = hVar.tailMap((h) Long.valueOf(j9)).values().iterator();
        while (arrayList.size() < i8 && it.hasNext()) {
            arrayList.add((Y) it.next());
        }
        return new i(arrayList, !it.hasNext());
    }

    public g getServers(long j8, int i8) {
        ArrayList arrayList = new ArrayList(i8);
        Iterator it = this.f32017a.tailMap((ConcurrentNavigableMap) Long.valueOf(j8)).values().iterator();
        while (it.hasNext() && arrayList.size() < i8) {
            arrayList.add((T) it.next());
        }
        return new g(arrayList, !it.hasNext());
    }

    public T getSocket(long j8) {
        T t8 = (T) this.f32020d.get(Long.valueOf(j8));
        return t8 != null ? t8 : d(j8);
    }

    public T getSubchannel(long j8) {
        return (T) this.f32019c.get(Long.valueOf(j8));
    }

    public void removeClientSocket(T t8) {
        e(this.f32020d, t8);
    }

    public void removeListenSocket(T t8) {
        e(this.f32020d, t8);
    }

    public void removeRootChannel(T t8) {
        e(this.f32018b, t8);
    }

    public void removeServer(T t8) {
        e(this.f32017a, t8);
    }

    public void removeServerSocket(T t8, T t9) {
        e((h) this.f32021e.get(Long.valueOf(id(t8))), t9);
    }

    public void removeSubchannel(T t8) {
        e(this.f32019c, t8);
    }

    public static final class f {
        public final d other;
        public final m tls;

        public f(m mVar) {
            this.tls = (m) e3.w.checkNotNull(mVar);
            this.other = null;
        }

        public f(d dVar) {
            this.tls = null;
            this.other = (d) e3.w.checkNotNull(dVar);
        }
    }

    public static final class m {
        public final String cipherSuiteStandardName;
        public final Certificate localCert;
        public final Certificate remoteCert;

        public m(String str, Certificate certificate, Certificate certificate2) {
            this.cipherSuiteStandardName = str;
            this.localCert = certificate;
            this.remoteCert = certificate2;
        }

        public m(SSLSession sSLSession) throws SSLPeerUnverifiedException {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e8) {
                O.f32015f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e8);
            }
            this.cipherSuiteStandardName = cipherSuite;
            this.localCert = certificate2;
            this.remoteCert = certificate;
        }
    }
}
