package AutoJumpReset;

import AutoJumpReset.EventDirection;

public interface IEventDirection {

	default EventDirection getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

    default boolean isIncoming() {
        return getDirection() == EventDirection.INCOMING;
    }

    default boolean isOutgoing() {
        return getDirection() == EventDirection.OUTGOING;
    }

}
