
public class Car {
	
		private String color;
		private int horsepower;
		private int enginesize;
		
		public Car() { 
			this.color = "purple ";
			this.horsepower = 8;
			this.enginesize = 0; 
			
		}
		
		public Car(String color, int horsepower, int enginesize) {
			this.color = color;
			this.horsepower = horsepower;
			this.enginesize = enginesize; 
		}
		
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getHorsepower() {
			return this.horsepower;
		}
		public int setHorsepower(int horsepower) {
			return this.horsepower = horsepower;
		}
		public int getEnginesize() {
			return this.enginesize;
		}
		public void setEnginesize(int enginesize) { 
			this.enginesize = enginesize;
		}
		public String toString() {
			return "The vehicle is this color..." + this.color + "has " + this.horsepower + " amount of horsepower and " 
		+ this.enginesize + " amount of cylinders ";
		

		

		}


}

