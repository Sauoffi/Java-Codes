class constructor {
    int roll_no;
    String name;
    String college;

    AA(){
        roll_no=210101442;
        name="Saurabh";
        college="Sharda";
    }
    AA(int r){
        roll_no=r;
    }
    AA(int e, String n, String c){
        roll_no=r;
        name=n;
        college=c;
    }
    void display(){
        System.out.println(roll_no+" "+name+" "+college);
    }
    public static void main(String[] args){
        AA a1=new AA();
        a1.display();
        AA a2=new AA(343);
        a2.display();
        AA a3=new AA(343,"Saurabh","Sharda");
        a3.display();
    }
}
