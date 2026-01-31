package M6;

import com.google.protobuf.H0;
import com.google.protobuf.K;
import io.grpc.C5728h0;
import io.grpc.C5730i0;

/* loaded from: classes.dex */
public abstract class d {
    public static <T extends H0> C5728h0.i keyForProto(T t8) {
        return C5728h0.i.of(t8.getDescriptorForType().getFullName() + C5728h0.BINARY_HEADER_SUFFIX, metadataMarshaller(t8));
    }

    public static <T extends H0> C5730i0.c marshaller(T t8) {
        return N6.b.marshaller(t8);
    }

    public static <T extends H0> C5730i0.c marshallerWithRecursionLimit(T t8, int i8) {
        return N6.b.marshallerWithRecursionLimit(t8, i8);
    }

    public static <T extends H0> C5728h0.f metadataMarshaller(T t8) {
        return N6.b.metadataMarshaller(t8);
    }

    public static void setExtensionRegistry(K k8) {
        N6.b.setExtensionRegistry(k8);
    }
}
