package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class MultipartTypedOutput implements TypedOutput {
    private final String boundary;
    private final byte[] footer;
    private long length;
    private final List<MimePart> mimeParts;

    private static final class MimePart {
        private final TypedOutput body;
        private final String boundary;
        private boolean isBuilt;
        private final boolean isFirst;
        private final String name;
        private byte[] partBoundary;
        private byte[] partHeader;

        public MimePart(String str, TypedOutput typedOutput, String str2, boolean z8) {
            this.name = str;
            this.body = typedOutput;
            this.isFirst = z8;
            this.boundary = str2;
        }

        private void build() {
            if (this.isBuilt) {
                return;
            }
            this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
            this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.body);
            this.isBuilt = true;
        }

        public long size() {
            build();
            if (this.body.length() > -1) {
                return this.body.length() + this.partBoundary.length + this.partHeader.length;
            }
            return -1L;
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
        }
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] buildBoundary(String str, boolean z8, boolean z9) {
        try {
            StringBuilder sb = new StringBuilder();
            if (!z8) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z9) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e8) {
            throw new RuntimeException("Unable to write multipart boundary", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] buildHeader(String str, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            if (typedOutput.fileName() != null) {
                sb.append("\"; filename=\"");
                sb.append(typedOutput.fileName());
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            if (typedOutput.length() != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(typedOutput.length());
            }
            sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e8) {
            throw new RuntimeException("Unable to write multipart header", e8);
        }
    }

    public void addPart(String str, TypedOutput typedOutput) {
        if (str == null) {
            throw new NullPointerException("Part name must not be null.");
        }
        if (typedOutput == null) {
            throw new NullPointerException("Part body must not be null.");
        }
        MimePart mimePart = new MimePart(str, typedOutput, this.boundary, this.mimeParts.isEmpty());
        this.mimeParts.add(mimePart);
        long size = mimePart.size();
        if (size == -1) {
            this.length = -1L;
            return;
        }
        long j8 = this.length;
        if (j8 != -1) {
            this.length = j8 + size;
        }
    }

    @Override // retrofit.mime.TypedOutput
    public String fileName() {
        return null;
    }

    public int getPartCount() {
        return this.mimeParts.size();
    }

    List<byte[]> getParts() throws IOException {
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart mimePart : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimePart.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        return arrayList;
    }

    @Override // retrofit.mime.TypedOutput
    public long length() {
        return this.length;
    }

    @Override // retrofit.mime.TypedOutput
    public String mimeType() {
        return "multipart/form-data; boundary=" + this.boundary;
    }

    @Override // retrofit.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        Iterator<MimePart> it = this.mimeParts.iterator();
        while (it.hasNext()) {
            it.next().writeTo(outputStream);
        }
        outputStream.write(this.footer);
    }

    MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        this.footer = buildBoundary(str, false, true);
        this.length = r3.length;
    }
}
