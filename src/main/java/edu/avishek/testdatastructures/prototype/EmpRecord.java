package edu.avishek.testdatastructures.prototype;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class EmpRecord implements Prototype{

    private int id;
    private String name, designation;
    private double salary;
    private String address;
    
    public EmpRecord(){
            System.out.println("   Employee Records of Oracle Corporation ");
            System.out.println("---------------------------------------------");
            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");

        }

 public  EmpRecord(int id, String name, String designation, double salary, String address) {

            this();
            this.id = id;
            this.name = name;
            this.designation = designation;
            this.salary = salary;
            this.address = address;
        }

        public void showRecord(){

            System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
        }

        @Override
        public Prototype getClone() {

            return new EmpRecord(id, name, designation, salary, address);
        }
}
