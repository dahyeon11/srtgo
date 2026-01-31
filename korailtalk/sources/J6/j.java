package J6;

import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class j {
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final i protocol;

    public j(i iVar, int i8, String str) {
        this.protocol = iVar;
        this.code = i8;
        this.message = str;
    }

    public static j parse(String str) throws ProtocolException, NumberFormatException {
        i iVar;
        int i8;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i8 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                iVar = i.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                iVar = i.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            iVar = i.HTTP_1_0;
            i8 = 4;
        }
        int i9 = i8 + 3;
        if (str.length() < i9) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i10 = Integer.parseInt(str.substring(i8, i9));
            if (str.length() <= i9) {
                strSubstring = "";
            } else {
                if (str.charAt(i9) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i8 + 4);
            }
            return new j(iVar, i10, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.protocol == i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.code);
        if (this.message != null) {
            sb.append(' ');
            sb.append(this.message);
        }
        return sb.toString();
    }
}
