public class Planet {

	public double x;
    public double y;
    public double xVelocity;
    public double yVelocity;
    public double mass;
    public String img;

    /*
    * Planet Constructor
    */
	public Planet(double x, double y, double vx, double vy, double mass, String img) {
        /*
        * We use this. to make it clear that we are assigning the value of the
        instance variable x to the parameter x
        */
        this.x = x;
        this.y = y;
        xVelocity = vx;
        yVelocity = vy;
        this.mass = mass;
        this.img = img;
    }

    public Planet(Planet p) {
        /*
        * We set the instance variable equal to the planets x parameter
        * I think this gives the planet x the instance variables properties?
        * We don't need to use the this. because we access the x through
          the Planet constructor.
        */
        x = p.x;
        y = p.y;
        xVelocity = p.xVelocity;
        yVelocity = p.yVelocity;
        mass = p.mass;
        img = p.img;
    }
    /*
    * Takes the Planet p x and y coordinate and compare them to the
    x and y coordinates from the passed planet for example p2
    * Then it calculates the Distance between them
    */
    public double calcDistance(Planet p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }
    public double calcPairWiseForce(Planet p) {
        double G = 6.67E-11;
        double rSquare = (this.calcDistance(p) * this.calcDistance(p) );
        return G * this.mass * p.mass / rSquare;
    }

}
