package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class b7j {
    public final mgn a;
    public final ike b;
    public final fem c;
    public final Looper d;
    public final HashMap e;
    public final ulf f;
    public boolean g;

    public b7j(mgn mgnVar, qp0 qp0Var, k4e k4eVar, ike ikeVar, fem femVar) {
        mqd.z(mgnVar, "socketConnection");
        mqd.z(qp0Var, "appDatabase");
        mqd.z(k4eVar, "jsonSerializer");
        mqd.z(ikeVar, "performanceStatAccumulator");
        mqd.z(femVar, "seenMarkerVersionChecker");
        this.a = mgnVar;
        this.b = ikeVar;
        this.c = femVar;
        this.d = Looper.myLooper();
        this.e = new HashMap();
        this.f = new ulf(qp0Var, "seen_marker", new n7c(k4eVar, 1));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(String str, SeenMarkerEntity seenMarkerEntity) {
        atl.t(null, seenMarkerEntity.a >= 0);
        vx6 e84Var = new e84(this, seenMarkerEntity, str, 1);
        mgn mgnVar = this.a;
        mgnVar.getClass();
        cw3 cw3VarF = mgnVar.f(e84Var, saa.c);
        HashMap map = this.e;
        cw3 cw3Var = (cw3) map.get(str);
        if (cw3Var != null) {
            cw3Var.cancel();
        }
        map.put(str, cw3VarF);
    }
}
