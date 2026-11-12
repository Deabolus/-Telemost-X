package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class aok {
    public final String a;
    public final Handler b = new Handler();
    public final LongSparseArray c = new LongSparseArray();
    public Runnable d;
    public cw3 e;
    public final /* synthetic */ bok f;

    public aok(bok bokVar, String str) {
        this.f = bokVar;
        this.a = str;
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
    public final void a() {
        atl.s(this.b.getLooper(), Looper.myLooper(), null);
        atl.p(this.d, null);
        atl.r(this.e, null);
        this.d = null;
        bok bokVar = this.f;
        mgn mgnVar = bokVar.a;
        vx6 e84Var = new e84(this, bokVar);
        mgnVar.getClass();
        this.e = mgnVar.f(e84Var, saa.c);
    }
}
