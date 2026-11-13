package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v27 gn4[], still in use, count: 1, list:
  (r0v27 gn4[]) from 0x018f: INVOKE (r0v27 gn4[]) STATIC call: oyg.B(java.lang.Enum[]):lg9 A[WRAPPED]
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
public final class gn4 implements wu1 {
    Join("join"),
    Leave("leave"),
    Read("read"),
    Write("write"),
    Change("change"),
    /* JADX INFO: Fake field, exist only in values array */
    Invite("invite"),
    AddUsers("add_users"),
    ChangeRole("change_role"),
    /* JADX INFO: Fake field, exist only in values array */
    ListMembers("list_members"),
    /* JADX INFO: Fake field, exist only in values array */
    RemoveUsers("remove_users"),
    MarkAsImportant("mark_as_important"),
    PinMessage("pin_message"),
    /* JADX INFO: Fake field, exist only in values array */
    DeleteMessage("delete_message"),
    ChangeRights("change_rights"),
    EditMessage("edit_message"),
    WriteThreads("write_to_thread"),
    ManageMeetings("manage_meetings"),
    Translate("translate"),
    SendStickers("send_stickers"),
    SendReactions("send_reactions"),
    SendAttachments("send_attachments"),
    DownloadFiles("download_files"),
    MakeExtCall("make_ext_call"),
    Share("share"),
    GuestDownloadFilesToggle("guest_download_files_toggle"),
    CreateInviteLink("create_invite_link"),
    FederativeAccess("federative_access");

    public static final /* synthetic */ lg9 A;
    public final String a;
    public final int b;

    static {
        A = oyg.B(gn4VarArr);
    }

    public gn4(String str) {
        super(str, i);
        this.a = str;
        this.b = ordinal();
    }

    public static gn4 valueOf(String str) {
        return (gn4) Enum.valueOf(gn4.class, str);
    }

    public static gn4[] values() {
        return (gn4[]) z.clone();
    }

    @Override // defpackage.wu1
    public final int b() {
        return this.b;
    }

    public final Boolean c(fn4 fn4Var, y5e y5eVar) {
        mqd.z(fn4Var, "thisRef");
        mqd.z(y5eVar, "property");
        return Boolean.valueOf((((vvd) fn4Var).b & (1 << ordinal())) > 0);
    }
}
