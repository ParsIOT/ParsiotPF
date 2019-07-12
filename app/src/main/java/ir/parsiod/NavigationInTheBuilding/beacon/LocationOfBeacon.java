package ir.parsiod.NavigationInTheBuilding.beacon;

import java.util.HashMap;

/**
 * Created by seyedalian on 11/6/2019.
 */

public class LocationOfBeacon {
  public   HashMap<String, Double[]> beaconCoordinates;




    public LocationOfBeacon() {
        beaconCoordinates = new HashMap<String, Double[]>() {{

            put("01:17:C5:97:E7:B3", new Double[]{-224d, -1364d });
            put("01:17:C5:97:1B:44", new Double[]{-488d, -612d });
            put("01:17:C5:97:87:84", new Double[]{-524d, 446d });
            put("01:17:C5:97:58:C3", new Double[]{-304d, 1352d });
            put("01:17:C5:97:DE:E8", new Double[]{-1184d, -1312d });
            put("01:17:C5:97:5B:1D", new Double[]{-1196d, -440d });
            put("01:17:C5:97:B5:70", new Double[]{-1180d,432d });
            put("01:17:C5:97:44:BE", new Double[]{-1168d,1268d });



        }};
    }


}
