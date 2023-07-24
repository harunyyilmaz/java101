package main.java101.Patika.OOP.MaasHesabi;

 public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    int year;

    Employee (String name, double salary, int workHours, int hireYear,int year ){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.year=2021;

        }

        double tax(){

        if( salary >1000){

            double result=(salary*3)/100;
            return result ;
        }
        return 0;

    }

        double bonus() {
            if (workHours > 40) {
                int result = workHours * 30;
                return result;
            }
            return 0;
        }

        double raiseSalary() {
            if (year - hireYear < 10) {

                double result = (salary * 5) / 100;

                return result;


            } else if (year - hireYear > 9 && year - hireYear < 20) {

                double result = (salary * 10) / 100;

                return result;

            } else {
                double result = (salary * 15) / 100;

                return result;
            }

        }



    void employeePrint(){
        System.out.println("Adı:" + this.name);
        System.out.println("Maaşı:" + this.salary);
        System.out.println("Haftalık çalışma saati:" + this.workHours);
        System.out.println("İşe başladığı yıl:" + this.hireYear);
        System.out.println("Çalışanın vergisi:" + tax());
        System.out.println("Saat Başı bonusu:" + bonus());
        System.out.println("İşe başlama yılına göre maaşı:" + raiseSalary());
        System.out.println("Çalışanın en son maaşı:"+ ( salary + bonus()+raiseSalary() - tax() ) ) ;

    }
}
