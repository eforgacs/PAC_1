package InClassExercises;

public class TestClasses {

    public static void main(String[] args) {
        Switch mySwitch = new Switch();
        Switch mySwitch2 = new Switch(false);

        System.out.println("My switch is " + mySwitch.getState());
        mySwitch.Toggle();
        System.out.println("My switch 2 is " + mySwitch2.getState());
    }

    public Switch makeSwitch() {
        return new Switch();
    }
}

class Switch {
    private boolean state;

    Switch() {
        state = true;
    }

    Switch(boolean startingState) {
        state = startingState;
    }

    public boolean isOn(){
        return state;
    }
    public String getState() {
        if (state) {
            return "On";
        } else {
            return "Off";
        }
    }

    public void Toggle() {
        state = !state;
    }
}