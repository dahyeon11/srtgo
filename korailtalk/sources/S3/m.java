package S3;

/* loaded from: classes2.dex */
final class m extends c {
    m() {
    }

    @Override // S3.c
    int b(char c9, StringBuilder sb) {
        if (c9 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c9 >= '0' && c9 <= '9') {
            sb.append((char) (c9 - ','));
            return 1;
        }
        if (c9 >= 'a' && c9 <= 'z') {
            sb.append((char) (c9 - 'S'));
            return 1;
        }
        if (c9 >= 0 && c9 <= 31) {
            sb.append((char) 0);
            sb.append(c9);
            return 2;
        }
        if (c9 >= '!' && c9 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c9 - '!'));
            return 2;
        }
        if (c9 >= ':' && c9 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c9 - '+'));
            return 2;
        }
        if (c9 >= '[' && c9 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c9 - 'E'));
            return 2;
        }
        if (c9 == '`') {
            sb.append((char) 2);
            sb.append((char) (c9 - '`'));
            return 2;
        }
        if (c9 >= 'A' && c9 <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c9 - '@'));
            return 2;
        }
        if (c9 >= '{' && c9 <= 127) {
            sb.append((char) 2);
            sb.append((char) (c9 - '`'));
            return 2;
        }
        if (c9 >= 128) {
            sb.append("\u0001\u001e");
            return b((char) (c9 - 128), sb) + 2;
        }
        j.c(c9);
        return -1;
    }

    @Override // S3.c, S3.g
    public int getEncodingMode() {
        return 2;
    }
}
