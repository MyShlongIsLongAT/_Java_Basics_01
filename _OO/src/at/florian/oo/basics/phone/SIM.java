package at.florian.oo.basics.phone;

public class SIM {
    private int id;
    private String numbers;

    public SIM(int id, String numbers) {
        this.id = id;
        this.numbers = numbers;
    }

    public String sim() {
        return "This SIM-Card has the id: " + this.id + " and has following numbers: " + this.numbers;
    }

    public String doCall(String contact) {
        return "You are now calling " + contact;
    }

    public int getId() {
        return id;
    }

    public String getNumbers() {
        return numbers;
    }
}
