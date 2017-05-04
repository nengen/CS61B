public class Planet {

	public double x;
    public double y;
    public double xVelocity;
    public double yVelocity;
    public double mass;
    public String img;

	public Planet(double x, double y, double vx, double vy, double mass, String img) {
        /*
        * We use this. to make it clear that we are assigning the value of the
        parameter "x" to the instance variable "x"
        */
        this.x = x;
        this.y = y;
        this.xVelocity = vx;
        this.yVelocity = vy;
        this.mass = mass;
        this.img = img;
    }

    public Planet(Planet p) {
        /*
        * We set the instance variable x equal to the Planets x parameter
        * Which I think is initialized in the Planet constructor above
        * Thats why we dont use this. here.
        */
        x = p.x;
        y = p.y;
        xVelocity = p.xVelocity;
        yVelocity = p.yVelocity;
        mass = p.mass;
        img = p.img;


    }

}
