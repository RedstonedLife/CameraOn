package com.redsoftware.ltd.bnc.utils.networking.angryscan.net.state;

import com.redsoftware.ltd.bnc.utils.networking.angryscan.net.state.StateMachine.Transition;

public interface StateTransitionListener {

    /**
     * Notifies on transition to the specified state.
     * @param state
     * @param transition
     */
    void transitionTo(ScanningState state, Transition transition);

}
