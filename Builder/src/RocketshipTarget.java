/**
 * Created by janatana on 9/14/2016.
 */
public class RocketshipTarget {

    private int cockPitCapacity;
    private String bodyModel;
    private String landingShuttleModel;
    private String thrusters;
    private String decal;

    // We want to use
    public static class RocketshipBuilder{

        private int cockPitCapacity;
        private String bodyModel;
        private String landingShuttleModel;
        private String thrusters;
        private String decal;
        private RocketshipTarget target;

        // Here each segment of the rocket ship is "assembled" in different stages
        public RocketshipBuilder SetCockPitCapacity(int capactiy){
            this.cockPitCapacity = capactiy;
            return this;
        }
        public RocketshipBuilder AddBodyModel(String bodyModel){
            this.bodyModel = bodyModel;
            return this;
        }
        public RocketshipBuilder AddLandingShuttle(String shuttle){
            this.landingShuttleModel = shuttle;
            return this;
        }
        public RocketshipBuilder AddThrusters(String thruster){
            this.thrusters = thruster;
            return this;
        }
        public RocketshipBuilder AddDecal(String decal){
            this.decal = decal;
            return this;
        }
        public RocketshipTarget build()throws MissingVitalComponentException{
            isValid();
            return new RocketshipTarget(this);
        }
        public RocketshipBuilder getBuilder(){
            return this;
        }

        // Throw custom exception MissingVitalShipComponentException if the ship is missing required parts
        private void isValid() throws MissingVitalComponentException{
            if(this.cockPitCapacity == 0 | this.bodyModel == null | this.landingShuttleModel == null | this.thrusters == null){
                throw new MissingVitalComponentException("Rocketship is missing a vital component.", "Build failed.");
            }
        }
    }

    // Construct target using the builder. Requiring a builder to build the target
    //  enforces the use of the builder
    public RocketshipTarget(RocketshipBuilder builder){
        this.cockPitCapacity = builder.cockPitCapacity;
        this.bodyModel = builder.bodyModel;
        this.landingShuttleModel = builder.landingShuttleModel;
        this.thrusters = builder.thrusters;
        this.decal = builder.decal;
    }

    public void getRocketInfo(){
        System.out.println("Cockpit capacity: " + this.cockPitCapacity + " Body Model: " + this.bodyModel + " landing Shuttle: " +
                this.landingShuttleModel + " Thrusters: " + this.thrusters + " Decal: " + this.decal);
    }

    // Default constructor creates an uninitialized instance of the target rocketship
    public RocketshipTarget(){
        System.out.println("This is an uninitialized scrap ship created by a building error. ");
    }

}
