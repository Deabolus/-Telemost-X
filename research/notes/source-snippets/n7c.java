package defpackage;

import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class n7c implements nom {
    public final k4e a;

    public n7c(k4e k4eVar, int i) {
        switch (i) {
            case 1:
                this.a = k4eVar;
                break;
            default:
                mqd.z(k4eVar, "jsonSerializer");
                this.a = k4eVar;
                break;
        }
    }

    @Override // defpackage.nom
    public Object c(byte[] bArr) {
        try {
            k4e k4eVar = this.a;
            k4eVar.getClass();
            return k4eVar.a(SeenMarkerEntity.class).b(new String(bArr, Charset.defaultCharset()));
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    @Override // defpackage.nom
    public byte[] s(Object obj) {
        k4e k4eVar = this.a;
        k4eVar.getClass();
        return k4eVar.a(SeenMarkerEntity.class).c(obj).getBytes(Charset.defaultCharset());
    }
}
