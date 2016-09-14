/**
 * Created by janatana on 9/14/2016.
 */
public class Main{
    public static void main(String[] args){
        try {
            RocketshipTarget rocketShip = new RocketshipTarget.RocketshipBuilder()
                    .SetCockPitCapacity(3)
                    .AddThrusters("v9")
                    .AddBodyModel("Apollo")
                    .AddLandingShuttle("Discovery V8")
                    .AddDecal("American flag")
                    .build();
                    rocketShip.getRocketInfo();
        } catch(MissingVitalComponentException e){
            System.out.println("Exception encountered: "+ e);
        }

        // Test MissingVitalComponentException by excluding thrusters. Should throw exception
        try {
            RocketshipTarget rocketShip = new RocketshipTarget.RocketshipBuilder()
                    .SetCockPitCapacity(3)
                    .AddBodyModel("Apollo")
                    .AddLandingShuttle("Discovery V8")
                    .AddDecal("American flag")
                    .build();
                    rocketShip.getRocketInfo();
        } catch(MissingVitalComponentException e){
            System.out.println("Exception encountered: "+ e);
        }

        // Test MissingVitalComponentException by excluding decal. Should NOT throw exception
        try {
            RocketshipTarget rocketShip = new RocketshipTarget.RocketshipBuilder()
                    .SetCockPitCapacity(10)
                    .AddThrusters("v11")
                    .AddBodyModel("Voyager")
                    .AddLandingShuttle("Enterprise V1")
                    .build();
                    rocketShip.getRocketInfo();
        } catch(MissingVitalComponentException e){
            System.out.println("Exception encountered: "+ e);
        }

    }
}
