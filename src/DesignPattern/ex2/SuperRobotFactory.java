package DesignPattern.ex2;

public class SuperRobotFactory extends RobotFactory {

    @Override
    Robot createRobot(String name) {
        switch (name) {
            case "super" : return new SuperRobot();
            case "power" : return new PowerRobot();
        }
        return null;
    }
}
