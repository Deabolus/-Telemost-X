package defpackage;

import android.os.Handler;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class slh {
    public static final long k;
    public final gkp a;
    public final aco b;
    public final it4 c;
    public final zmq d;
    public final kkk e;
    public final ike f;
    public final x20 g;
    public final Handler h;
    public final bjj i;
    public final HashMap j;

    static {
        e0f e0fVar = s19.b;
        k = s19.n(y62.T(1, x19.f));
    }

    public slh(gkp gkpVar, aco acoVar, it4 it4Var, zmq zmqVar, kkk kkkVar, ike ikeVar, x20 x20Var, Handler handler, ike ikeVar2) {
        mqd.z(acoVar, "syncController");
        mqd.z(it4Var, "chatTimelineController");
        mqd.z(zmqVar, "userActionFailedObservable");
        mqd.z(kkkVar, "rateLimitSource");
        mqd.z(ikeVar, "performanceStatAccumulator");
        mqd.z(x20Var, "analytics");
        mqd.z(ikeVar2, "videoBubblesFeatureToggle");
        this.a = gkpVar;
        this.b = acoVar;
        this.c = it4Var;
        this.d = zmqVar;
        this.e = kkkVar;
        this.f = ikeVar;
        this.g = x20Var;
        this.h = handler;
        this.i = new bjj(ikeVar2);
        HashMap map = new HashMap();
        map.put(23, 1);
        this.j = map;
    }
}
