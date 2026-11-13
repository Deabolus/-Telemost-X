package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 g91[], still in use, count: 1, list:
  (r0v1 g91[]) from 0x0039: INVOKE (r0v1 g91[]) STATIC call: oyg.B(java.lang.Enum[]):lg9
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class g91 {
    d("Production", false),
    e("TeamProduction", true),
    f("Testing", false),
    g("TeamTesting", true),
    h("Rc", false);

    public static final z39 c;
    public final int a;
    public final boolean b;

    static {
        oyg.B(g91VarArr);
        c = new z39();
    }

    public g91(String str, boolean z) {
        super(str, i);
        this.a = i;
        this.b = z;
    }

    public static g91 valueOf(String str) {
        return (g91) Enum.valueOf(g91.class, str);
    }

    public static g91[] values() {
        return (g91[]) i.clone();
    }
}
