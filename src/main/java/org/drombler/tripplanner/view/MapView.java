package org.drombler.tripplanner.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "")
@PageTitle("Drombler Trip Planner | Map")
public class MapView extends VerticalLayout {
    public MapView(){
        setClassName("map-view");
        add(new H1("Overview"));
    }
}
