import java.util.Scanner;

public class fanSimulation {
	private boolean rightSpin;
	private int speed;

	public fanSimulation() {
		System.out.println("***Fan is plugged in, and is at speed 0 (off). Default spin direction is clockwise.***");
		this.rightSpin = true;
		this.speed = 0;
	}

	public void increaseSpeed() {
		if (this.speed < 3) {
			this.speed++;
			System.out.println("Current speed: " + this.speed);
		} else {
			this.speed = 0;
			System.out.println("Current speed: " + this.speed);
		}
	}

	public void changeDirection() {
		if (this.rightSpin) {
			this.rightSpin = false;
			System.out.println("Current spin direction is counter clockwise.");
		} else {
			this.rightSpin = true;
			System.out.println("Current spin direction is clockwise.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fanSimulation m = new fanSimulation();
		System.out.println("Type speed+ to increase speed, or dChange to change direction. then hit enter");
		System.out.println("Type quit to quit program");

		Scanner inputRead = new Scanner(System.in);
		String command = inputRead.nextLine();

		while (!(command.equalsIgnoreCase("quit"))) {

			if (command.equalsIgnoreCase("speed+")) {
				m.increaseSpeed();
			} else if (command.equalsIgnoreCase("dChange")) {
				m.changeDirection();
			} else {
				System.out.println("invalid input; acceptable inputs: speed+ or dChange to change direction");
			}
			
			command = inputRead.nextLine();

		}

		System.out.println("end of program!");
		inputRead.close();

	}

}
