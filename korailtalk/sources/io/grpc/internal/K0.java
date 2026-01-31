package io.grpc.internal;

import io.grpc.AbstractC5716b0;
import io.grpc.AbstractC5787j0;
import io.grpc.C5718c0;
import io.grpc.J0;
import io.grpc.internal.C0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class K0 {

    public static final class a {

        /* renamed from: a */
        private final String f32493a;

        /* renamed from: b */
        private final Map f32494b;

        public a(String str, Map<String, ?> map) {
            this.f32493a = (String) e3.w.checkNotNull(str, "policyName");
            this.f32494b = (Map) e3.w.checkNotNull(map, "rawConfigValue");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32493a.equals(aVar.f32493a) && this.f32494b.equals(aVar.f32494b);
        }

        public String getPolicyName() {
            return this.f32493a;
        }

        public Map<String, ?> getRawConfigValue() {
            return this.f32494b;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f32493a, this.f32494b);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("policyName", this.f32493a).add("rawConfigValue", this.f32494b).toString();
        }
    }

    public static final class b {

        /* renamed from: a */
        final AbstractC5716b0 f32495a;

        /* renamed from: b */
        final Object f32496b;

        public b(AbstractC5716b0 abstractC5716b0, Object obj) {
            this.f32495a = (AbstractC5716b0) e3.w.checkNotNull(abstractC5716b0, "provider");
            this.f32496b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return e3.r.equal(this.f32495a, bVar.f32495a) && e3.r.equal(this.f32496b, bVar.f32496b);
        }

        public Object getConfig() {
            return this.f32496b;
        }

        public AbstractC5716b0 getProvider() {
            return this.f32495a;
        }

        public int hashCode() {
            return e3.r.hashCode(this.f32495a, this.f32496b);
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("provider", this.f32495a).add("config", this.f32496b).toString();
        }
    }

    static Double a(Map map) {
        return C5745e0.getNumberAsDouble(map, "backoffMultiplier");
    }

    static Long b(Map map) {
        return C5745e0.getStringAsDuration(map, "hedgingDelay");
    }

    static Map c(Map map) {
        return C5745e0.getObject(map, "hedgingPolicy");
    }

    static Long d(Map map) {
        return C5745e0.getStringAsDuration(map, "initialBackoff");
    }

    private static Set e(Map map, String str) {
        List<?> list = C5745e0.getList(map, str);
        if (list == null) {
            return null;
        }
        return s(list);
    }

    static Integer f(Map map) {
        return C5745e0.getNumberAsInteger(map, "maxAttempts");
    }

    static Integer g(Map map) {
        return C5745e0.getNumberAsInteger(map, "maxAttempts");
    }

    public static Map<String, ?> getHealthCheckedService(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return C5745e0.getObject(map, "healthCheckConfig");
    }

    public static String getHealthCheckedServiceName(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return C5745e0.getString(map, "serviceName");
    }

    public static List<Map<String, ?>> getLoadBalancingConfigsFromServiceConfig(Map<String, ?> map) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(C5745e0.getListOfObjects(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (string = C5745e0.getString(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(string.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Long h(Map map) {
        return C5745e0.getStringAsDuration(map, "maxBackoff");
    }

    static Integer i(Map map) {
        return C5745e0.getNumberAsInteger(map, "maxRequestMessageBytes");
    }

    static Integer j(Map map) {
        return C5745e0.getNumberAsInteger(map, "maxResponseMessageBytes");
    }

    static List k(Map map) {
        return C5745e0.getListOfObjects(map, "methodConfig");
    }

    static String l(Map map) {
        return C5745e0.getString(map, "method");
    }

    static List m(Map map) {
        return C5745e0.getListOfObjects(map, "name");
    }

    static Set n(Map map) {
        Set setE = e(map, "nonFatalStatusCodes");
        if (setE == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(J0.b.class));
        }
        e3.H.verify(!setE.contains(J0.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setE;
    }

    static Long o(Map map) {
        return C5745e0.getStringAsDuration(map, "perAttemptRecvTimeout");
    }

    static Map p(Map map) {
        return C5745e0.getObject(map, "retryPolicy");
    }

    static Set q(Map map) {
        Set setE = e(map, "retryableStatusCodes");
        e3.H.verify(setE != null, "%s is required in retry policy", "retryableStatusCodes");
        e3.H.verify(true ^ setE.contains(J0.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return setE;
    }

    static String r(Map map) {
        return C5745e0.getString(map, androidx.core.app.r.CATEGORY_SERVICE);
    }

    private static Set s(List list) {
        J0.b bVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(J0.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d9 = (Double) obj;
                int iIntValue = d9.intValue();
                e3.H.verify(((double) iIntValue) == d9.doubleValue(), "Status code %s is not integral", obj);
                bVarValueOf = io.grpc.J0.fromCodeValue(iIntValue).getCode();
                e3.H.verify(bVarValueOf.value() == d9.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new e3.I("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    bVarValueOf = J0.b.valueOf((String) obj);
                } catch (IllegalArgumentException e8) {
                    throw new e3.I("Status code " + obj + " is not valid", e8);
                }
            }
            enumSetNoneOf.add(bVarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static AbstractC5787j0.c selectLbPolicyFromList(List<a> list, C5718c0 c5718c0) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String policyName = aVar.getPolicyName();
            AbstractC5716b0 provider = c5718c0.getProvider(policyName);
            if (provider != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(K0.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC5787j0.c loadBalancingPolicyConfig = provider.parseLoadBalancingPolicyConfig(aVar.getRawConfigValue());
                return loadBalancingPolicyConfig.getError() != null ? loadBalancingPolicyConfig : AbstractC5787j0.c.fromConfig(new b(provider, loadBalancingPolicyConfig.getConfig()));
            }
            arrayList.add(policyName);
        }
        return AbstractC5787j0.c.fromError(io.grpc.J0.UNKNOWN.withDescription("None of " + arrayList + " specified by Service Config are available."));
    }

    static C0.E t(Map map) {
        Map<String, ?> object;
        if (map == null || (object = C5745e0.getObject(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = C5745e0.getNumberAsDouble(object, "maxTokens").floatValue();
        float fFloatValue2 = C5745e0.getNumberAsDouble(object, "tokenRatio").floatValue();
        e3.w.checkState(fFloatValue > 0.0f, "maxToken should be greater than zero");
        e3.w.checkState(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new C0.E(fFloatValue, fFloatValue2);
    }

    static Long u(Map map) {
        return C5745e0.getStringAsDuration(map, "timeout");
    }

    public static a unwrapLoadBalancingConfig(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, C5745e0.getObject(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }

    public static List<a> unwrapLoadBalancingConfigList(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(unwrapLoadBalancingConfig(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    static Boolean v(Map map) {
        return C5745e0.getBoolean(map, "waitForReady");
    }
}
