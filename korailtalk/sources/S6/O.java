package S6;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
interface O extends Map, KMappedMarker {
    Map<Object, Object> getMap();

    Object getOrImplicitDefault(Object obj);
}
