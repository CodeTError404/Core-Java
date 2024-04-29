package OOPs;

class OOPs {

    //data members:instance variables
    int id;
    String desc;

    //methods
    public void demo(){
        System.out.println(id + " : "+ desc);
    }

    public void details(){
        System.out.println("id:-"+id);
        System.out.println("description:-"+desc);
    }

    public OOPs(){
        //non parameterized constructor
        System.out.println("This is non parameterized Constructor");
    }
    //constructor overloading
    //techniques of constructor overloading:-
        //1.No. of args different
        //2.Type of args different
        //3.Order of args different

    public OOPs(int id,String desc){
        //parameterized constructor
        this.id=id;
        this.desc=desc;
        //this keyword:-> refer to current invoking object 
        System.out.println("This is parameterized constructor");
    }

    public OOPs(String desc,int id){
        //we can also use this keyword to call a construct from another constructor of the same class.
        //but the condition is statement contains "this" must be the first line of the constructor
        this(id, desc);
        System.out.println("calling another constructor");

        //if we put the statement having "this" here then it will give error
    }




   //method overloading
    //techniques of method overloading:-
        //1.No. of args different
        //2.Type of args different
        //3.Order of args different
    public void func1(int x){
        System.out.println("One parameter");
    }
    public void func1(int x,String y){
        System.out.println("Two parameters");
    }

    public void func1(String x){
        System.out.println("One parameter with different datatype");
    }

    public void func1(String x,int y){
        System.out.println("Two parameters with different order");
    }
   
}



public class OOPsBasics{
    int id;
    public static void main(String[] args) {
        //copy 1
        OOPs obj1;
        obj1=new OOPs();
        //accessing class properties
        obj1.id=56;
        obj1.desc="First Data";

        //accessing class behaviour
        obj1.demo();
        obj1.details();



        //copy 2
        OOPs obj2;
        obj2=new OOPs();
        //accessing class properties
        obj2.id=126;
        obj2.desc="Second Data";

        //accessing class behaviour
        obj2.demo();
        obj2.details();


        //constructors:- special methods use to initialize the properties of class

        //calling parameterized constructor and setting values
        OOPs obj3=new OOPs(136,"Third data");
        obj3.demo();
        obj3.details();

        //calling non parameterized constructor
        OOPs obj4=new OOPs();
        obj4.id=128;

        System.out.println();
        System.out.println();

        OOPs obj5=new OOPs();

        //calling func1 of type1
        obj5.func1(0);
        //calling func1 of type2
        obj5.func1(0, null);
        //calling func1 of type3
        obj5.func1(null);
        //calling func1 of type4
        obj5.func1(null, 0);

        //calling constructor which is calling another constructor
        OOPs obj6=new OOPs(null, 0);
        obj6.id=5;

        
    }
}

