package C7;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public interface s {
    public static final s SYSTEM = new s() { // from class: C7.r
        @Override // C7.s
        public final List lookup(String str) {
            return s.a(str);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List a(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e8) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
            unknownHostException.initCause(e8);
            throw unknownHostException;
        }
    }

    List<InetAddress> lookup(String str);
}
