public class Planet {
	double xxPos;
	double yyPos;
	double xxVel;
	double yyVel;
	double mass;
	String imgFileName;

	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}

	public Planet(Planet p){
		xxPos = p.xxPos;
		yyPos = p.yyPos;
		xxVel = p.xxVel;
		yyVel = p.yyVel;
		mass = p.mass;
		imgFileName = p.imgFileName;
	}

	public double calcDistance(Planet p){
		//We have to find r
		//r^2 = dx^2 + dy^2
		double dx = p.xxPos - this.xxPos;
		double dy = p.yyPos - this.yyPos;
		double r = Math.sqrt(dx*dx + dy*dy);
		return r;
	}

	public double calcForceExertedBy(Planet p){
		double G = (6.674) * Math.pow(10,-11);
		double r = this.calcDistance(p);
		double F = G * this.mass * p.mass / (r * r);
		return F;
	}

	public double calcForceExertedByX(Planet p){
		//Fx = F * dx/r
		double F = calcForceExertedBy(p);
		double dx = p.xxPos - this.xxPos;
		double r = this.calcDistance(p);
		double Fx = F * dx / r;
		return Fx;
	}

	public double calcForceExertedByY(Planet p){
		//Fy = F * dy/r
		double F = calcForceExertedBy(p);
		double dy = p.yyPos - this.yyPos;
		double r = this.calcDistance(p);
		double Fy = F * dy / r;
		return Fy;
	}

	public double calcNetForceExertedByX(Planet[] allPlanets){
       double netX=0;
       for(int i=0;i<allPlanets.length;i++){
         if(!this.equals(allPlanets[i])){
           netX+=this.calcForceExertedByX(allPlanets[i]);
         }
       }
       return netX;
     }

     public double calcNetForceExertedByY(Planet[] allPlanets){
       double netY=0;
       for(int i=0;i<allPlanets.length;i++){
         if(!this.equals(allPlanets[i])){
           netY+=this.calcForceExertedByY(allPlanets[i]);
         }
       }
       return netY;
     }

	 public void update(double dt, double fx, double fy){
		 double accX = fx/this.mass;
		 double accY = fy/this.mass;
		 this.xxVel = this.xxVel + dt * accX;
		 this.yyVel = this.yyVel + dt * accY;
		 this.xxPos = this.xxPos + dt * this.xxVel;
		 this.yyPos = this.yyPos + dt * this.yyVel;
	 }

}
