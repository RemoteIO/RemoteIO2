package remoteio.common.lib;

public enum VisualState{
    INACTIVE,
    INACTIVE_BLINK,
    ACTIVE,
    ACTIVE_BLINK,
    CAMO_REMOTE,
    CAMO_SIMPLE;

    public boolean isCamo(){
        return this.equals(CAMO_REMOTE)
            || this.equals(CAMO_SIMPLE);
    }

    @Override
    public String toString() {
        switch(this){
            case INACTIVE:
            case INACTIVE_BLINK: return "Inactive";
            case ACTIVE:
            case ACTIVE_BLINK: return "Active";
            default: return null;
        }
    }
}