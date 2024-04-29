package OOPs;

//single inheritance------->

class parent1{
    int n=2;
    String s="This is parents";
    public void parentDetails(){
        System.out.println("parent:int var->"+n);
        System.out.println("parent:String var->"+s);
    }
    parent1(){
        System.out.println("This is parent");
    }
    parent1(int x){
        System.out.println("The value of x is:-"+x);
    }
} 
class child1 extends parent1{
    int n=4;
    public void childDetails(){
        //to call "n" having value in child class
        System.out.println(this.n);
        //to call "n" having value in child class
        System.out.println(n);
        //to call "n" having value in parentclass
        System.out.println(super.n);
    }
    child1(){
        //we can use super keyword to call the constructor of immediate parent class from the constructor of child class
        //but the only condition is that super must be the first statement only
        super();
        //super(1) will give error as it is not the first statement
        //to run super(1) i.e. to call the parent class parameterized constructor we much make super(1) the first statement
       // super(1);
        System.out.println("This is child");
    }
}



//multilevel inheretance------------>

class child2 extends child1{
    child2(){
        super();
        System.out.println("This is sub-child1 of child1");
    }
}


//hierarchical inheritance------------->
class child3 extends child1{
    child3(){
        super();
        System.out.println("This is sub-child2 of child1");
    }
}




//hybrid inheritance-------------------->
class child4 extends child3{
    child4(){
        super();
        System.out.println("This is sub-child of child3");
    }
}


public class Inheritance {

    public static void main(String[] args) {
        //calling child 1
        //child1 inheriting parent1 hence showing single inheritance
        child1 ch1=new child1();
        ch1.childDetails();


        System.out.println();
        System.out.println();

        //calling child 2
        // child1 inheriting parent1 and child 2 inheriting child1 hence showing multilevel inheritance 
        child2 ch2=new child2();
        ch2.n=5;
        System.out.println(ch2.n);

        System.out.println();
        System.out.println();

        //calling child 3
         //this is showing hierarchical inheritance as both child2 and child3 inheriting child1
        child3 ch3=new child3();
        ch3.n=10;
        System.out.println(ch3.n);


        //calling child 4
        //this is showing hybrid inheritance as class child2 and child3 inheriting child1 and this class child4 inheriting child3
        child4 ch4=new child4();
        ch4.n=221;
        System.out.println(ch4.n);


    }
}
