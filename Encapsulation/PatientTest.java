class Patient {
    private String name;
    private double weight;  // in kg
    private double height;   // in meters

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getHealthStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
}

public class PatientTest {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.setName("John Doe");
        p.setWeight(70);
        p.setHeight(1.75);
        System.out.println("Patient: " + p.getName());
        System.out.println("BMI: " + p.calculateBMI());
        System.out.println("Health Status: " + p.getHealthStatus());
    }
}