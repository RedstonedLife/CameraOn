package com.bss.inc.cameraon.utils.net.angryscan.state.state;

public interface StateTransitionListener {

    /**
     * Notifies on transition to the specified state.
     * @param state
     * @param transition
     */
    void transitionTo(ScanningState state, StateMachine.Transition transition);

}
