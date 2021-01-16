package ca.shubbar;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        /*
        This is a useful technique so that nothing outside of this class can
        * change exits, so the getter returns a copy of the exits, so if the
        * calling program wants to add or remove mappings from it and the exits
        * mapping field won't be affected
        */
        return new HashMap<String, Integer>(exits);
    }
}
