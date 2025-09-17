class Student {
   
    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;  
        }
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public void updateGrade(char newGrade) {
        this.grade = newGrade;
    }
}