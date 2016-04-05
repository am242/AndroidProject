package modal.Backend;

import modal.dataSource.DataBaseLists;

/**
 * Created by אריאל on 20/03/16.
 */

public final class BackendFactory {
    static Backend instance = null;
    public static String mode = "lists";

    public final static Backend getInstance() {
        if (mode == "lists") {
            if (instance == null)
                instance = new DataBaseLists();
            return instance;
        } else return null;
    }
}


