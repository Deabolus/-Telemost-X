package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.entities.AddresseeType;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class or4 implements mp2 {
    public final Looper a;
    public final q9j b;
    public final ueg c;
    public final b7j d;
    public final idj e;
    public final x20 f;
    public final pnp g;
    public final fem h;
    public final ddq i;
    public final w0r j;
    public final ex4 k;
    public final ebg l;
    public final nr4 m;

    public or4(Looper looper, q9j q9jVar, qp0 qp0Var, ueg uegVar, b7j b7jVar, b5k b5kVar, qp2 qp2Var, k45 k45Var, idj idjVar, x20 x20Var, pnp pnpVar, fem femVar, ddq ddqVar) {
        mqd.z(looper, "logicLooper");
        mqd.z(q9jVar, "persistentChat");
        mqd.z(qp0Var, "appDatabase");
        mqd.z(uegVar, "cacheDatabase");
        mqd.z(b7jVar, "pendingSeenMarkerQueue");
        mqd.z(b5kVar, "profileRemovedDispatcher");
        mqd.z(qp2Var, "cacheObserver");
        mqd.z(k45Var, "clock");
        mqd.z(idjVar, "personalMentionsRepository");
        mqd.z(x20Var, "analytics");
        mqd.z(pnpVar, "timelineReader");
        mqd.z(femVar, "seenMarkerVersionChecker");
        mqd.z(ddqVar, "unreadReporter");
        this.a = looper;
        this.b = q9jVar;
        this.c = uegVar;
        this.d = b7jVar;
        this.e = idjVar;
        this.f = x20Var;
        this.g = pnpVar;
        this.h = femVar;
        this.i = ddqVar;
        this.j = qp0Var.b();
        this.k = qp0Var.A();
        this.l = qp0Var.c();
        this.m = new nr4(this, k45Var, b5kVar);
        qp2Var.a(this);
    }

    public static final void b(or4 or4Var, long j) {
        q9j q9jVar = or4Var.b;
        pnp pnpVar = or4Var.g;
        atl.t(null, j > 0);
        MessageData messageDataF = pnpVar.f(new y2f(null, j, Long.valueOf(j), null));
        if (messageDataF == null) {
            return;
        }
        String str = q9jVar.c;
        boolean zD = str != null ? or4Var.j.d(str) : false;
        ypi ypiVar = new ypi("chat", q9jVar.b);
        ypi ypiVar2 = new ypi("ts", String.valueOf(j));
        ypi ypiVar3 = new ypi("v", String.valueOf(messageDataF.lastEditTimestamp));
        ypi ypiVar4 = new ypi("status", messageDataF.hiddenByModeration ? "18+" : "ok");
        int i = xlm.h;
        ypi ypiVar5 = new ypi("kind", wlm.l(messageDataF));
        AddresseeType.b.getClass();
        or4Var.f.reportEvent("message seen", xgf.j0(new ypi[]{ypiVar, ypiVar2, ypiVar3, ypiVar4, ypiVar5, new ypi("addressee type", (zD ? AddresseeType.CONTACT : AddresseeType.OTHER).a)}));
    }

    @Override // defpackage.mp2
    public final void w(long j, mli mliVar) {
        jb4 jb4VarE;
        Long l;
        q9j q9jVar = this.b;
        long j2 = q9jVar.a;
        if (j == j2 && (l = (jb4VarE = this.k.e(j2)).a) != null && l.longValue() > 0) {
            String str = q9jVar.b;
            b7j b7jVar = this.d;
            HashMap map = b7jVar.e;
            mqd.z(str, "chatId");
            ulf ulfVar = b7jVar.f;
            ulfVar.getClass();
            bbj bbjVar = (bbj) ulfVar.d;
            String str2 = (String) ulfVar.b;
            bbjVar.getClass();
            byte[] bArr = (byte[]) h6i.M(bbjVar.a, true, false, new be(str2, str, 12));
            SeenMarkerEntity seenMarkerEntity = (SeenMarkerEntity) (bArr != null ? ((nom) ulfVar.c).c(bArr) : null);
            if (seenMarkerEntity == null) {
                return;
            }
            if (b7jVar.c.a(new jb4(seenMarkerEntity.d, Long.valueOf(seenMarkerEntity.a)), jb4VarE)) {
                ulfVar.F(str);
                cw3 cw3Var = (cw3) map.get(str);
                if (cw3Var != null) {
                    map.remove(str);
                    cw3Var.cancel();
                }
            }
        }
    }
}
