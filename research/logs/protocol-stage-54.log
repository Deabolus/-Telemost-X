package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class bmc implements mgn {
    public final qhg a;
    public final Looper b;
    public final xeo c;
    public final /* synthetic */ cmc d;

    public bmc(cmc cmcVar, qhg qhgVar, String str, boolean z) {
        mqd.z(str, "sessionId");
        this.d = cmcVar;
        this.a = qhgVar;
        this.b = Looper.myLooper();
        this.c = lo7.B(new p10(cmcVar, this, str, z, 1));
        cmcVar.e.b.add(this);
    }

    public final void a() {
        atl.s(this.b, Looper.myLooper(), null);
    }

    @Override // defpackage.mgn
    public final void b(String str) {
        mqd.z(str, "reason");
        a();
        d().b(str);
    }

    @Override // defpackage.mgn
    public final boolean c() {
        return d().c();
    }

    @Override // defpackage.mgn
    public final void close() {
        a();
        this.d.e.b.remove(this);
        d().close();
    }

    public final mgn d() {
        return (mgn) this.c.getValue();
    }

    @Override // defpackage.mgn
    public final cw3 f(sgn sgnVar, taa taaVar) {
        a();
        return d().f(sgnVar, taaVar);
    }

    @Override // defpackage.mgn
    public final boolean j() {
        return d().j();
    }

    @Override // defpackage.mgn
    public final String k() {
        return d().k();
    }

    @Override // defpackage.mgn
    public final void l(c8q c8qVar, ClientMessage clientMessage) {
        a();
        d().l(null, clientMessage);
    }

    @Override // defpackage.mgn
    public final void p(tgn tgnVar) {
        a();
        d().p(tgnVar);
    }
}
