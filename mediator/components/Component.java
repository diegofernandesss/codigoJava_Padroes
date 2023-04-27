package mediator.components;

import mediator.mediator.*;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
