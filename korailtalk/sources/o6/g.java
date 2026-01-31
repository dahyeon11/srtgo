package O6;

import O6.f;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5716b0;
import io.grpc.AbstractC5787j0;
import io.grpc.C5718c0;
import io.grpc.J0;
import io.grpc.internal.C5745e0;
import io.grpc.internal.K0;
import io.grpc.internal.S0;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends AbstractC5716b0 {
    private AbstractC5787j0.c a(Map map) {
        Long stringAsDuration = C5745e0.getStringAsDuration(map, "interval");
        Long stringAsDuration2 = C5745e0.getStringAsDuration(map, "baseEjectionTime");
        Long stringAsDuration3 = C5745e0.getStringAsDuration(map, "maxEjectionTime");
        Integer numberAsInteger = C5745e0.getNumberAsInteger(map, "maxEjectionPercentage");
        f.g.a aVar = new f.g.a();
        if (stringAsDuration != null) {
            aVar.setIntervalNanos(stringAsDuration);
        }
        if (stringAsDuration2 != null) {
            aVar.setBaseEjectionTimeNanos(stringAsDuration2);
        }
        if (stringAsDuration3 != null) {
            aVar.setMaxEjectionTimeNanos(stringAsDuration3);
        }
        if (numberAsInteger != null) {
            aVar.setMaxEjectionPercent(numberAsInteger);
        }
        Map<String, ?> object = C5745e0.getObject(map, "successRateEjection");
        if (object != null) {
            f.g.c.a aVar2 = new f.g.c.a();
            Integer numberAsInteger2 = C5745e0.getNumberAsInteger(object, "stdevFactor");
            Integer numberAsInteger3 = C5745e0.getNumberAsInteger(object, "enforcementPercentage");
            Integer numberAsInteger4 = C5745e0.getNumberAsInteger(object, "minimumHosts");
            Integer numberAsInteger5 = C5745e0.getNumberAsInteger(object, "requestVolume");
            if (numberAsInteger2 != null) {
                aVar2.setStdevFactor(numberAsInteger2);
            }
            if (numberAsInteger3 != null) {
                aVar2.setEnforcementPercentage(numberAsInteger3);
            }
            if (numberAsInteger4 != null) {
                aVar2.setMinimumHosts(numberAsInteger4);
            }
            if (numberAsInteger5 != null) {
                aVar2.setRequestVolume(numberAsInteger5);
            }
            aVar.setSuccessRateEjection(aVar2.build());
        }
        Map<String, ?> object2 = C5745e0.getObject(map, "failurePercentageEjection");
        if (object2 != null) {
            f.g.b.a aVar3 = new f.g.b.a();
            Integer numberAsInteger6 = C5745e0.getNumberAsInteger(object2, "threshold");
            Integer numberAsInteger7 = C5745e0.getNumberAsInteger(object2, "enforcementPercentage");
            Integer numberAsInteger8 = C5745e0.getNumberAsInteger(object2, "minimumHosts");
            Integer numberAsInteger9 = C5745e0.getNumberAsInteger(object2, "requestVolume");
            if (numberAsInteger6 != null) {
                aVar3.setThreshold(numberAsInteger6);
            }
            if (numberAsInteger7 != null) {
                aVar3.setEnforcementPercentage(numberAsInteger7);
            }
            if (numberAsInteger8 != null) {
                aVar3.setMinimumHosts(numberAsInteger8);
            }
            if (numberAsInteger9 != null) {
                aVar3.setRequestVolume(numberAsInteger9);
            }
            aVar.setFailurePercentageEjection(aVar3.build());
        }
        List<K0.a> listUnwrapLoadBalancingConfigList = K0.unwrapLoadBalancingConfigList(C5745e0.getListOfObjects(map, "childPolicy"));
        if (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) {
            return AbstractC5787j0.c.fromError(J0.INTERNAL.withDescription("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        AbstractC5787j0.c cVarSelectLbPolicyFromList = K0.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, C5718c0.getDefaultRegistry());
        if (cVarSelectLbPolicyFromList.getError() != null) {
            return cVarSelectLbPolicyFromList;
        }
        aVar.setChildPolicy((K0.b) cVarSelectLbPolicyFromList.getConfig());
        return AbstractC5787j0.c.fromConfig(aVar.build());
    }

    @Override // io.grpc.AbstractC5716b0
    public String getPolicyName() {
        return "outlier_detection_experimental";
    }

    @Override // io.grpc.AbstractC5716b0
    public int getPriority() {
        return 5;
    }

    @Override // io.grpc.AbstractC5716b0
    public boolean isAvailable() {
        return true;
    }

    @Override // io.grpc.AbstractC5714a0.c
    public AbstractC5714a0 newLoadBalancer(AbstractC5714a0.d dVar) {
        return new f(dVar, S0.SYSTEM_TIME_PROVIDER);
    }

    @Override // io.grpc.AbstractC5716b0
    public AbstractC5787j0.c parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        try {
            return a(map);
        } catch (RuntimeException e8) {
            return AbstractC5787j0.c.fromError(J0.UNAVAILABLE.withCause(e8).withDescription("Failed parsing configuration for " + getPolicyName()));
        }
    }
}
